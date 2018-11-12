package com.zxSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ZxSpringTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZxSpringTest1Application.class, args);
	}
}
