package com.example.demo.domain.dto;

import com.example.demo.domain.entity.User;
import lombok.Data;

@Data
public class UserDto {


	private String email;
	private String password;

	private String nickname;
	private String name;
	private String zipcode;
	private String addr1;
	private String addr2;
	private String birth;
	private String phone;

	private String role;


	//OAUTH2
	private String provider;
	private String providerId;

	private String profile;

	public static UserDto EntityToDto(User user)
	{
		UserDto dto  = new UserDto();
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setZipcode(user.getZipcode());
		dto.setNickname(user.getNickname());
		dto.setName(user.getName());
		dto.setAddr1(user.getAddr1());
		dto.setAddr2(user.getAddr2());
		dto.setBirth(user.getBirth());
		dto.setPhone(user.getPhone());
		dto.setRole(user.getRole());
		dto.setProfile(user.getProfile());

		return dto;

	}


}