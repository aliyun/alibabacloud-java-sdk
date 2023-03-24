package com.example.backuptest06.vm.common.config;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

/**
 * 阿里云ECS主机连接配置
 *
 *
 */

public class AliyunEcsClientConfig {

    /**
     * 使用AK&SK初始化阿里云ECS账号Client
     * @param accessKeyId     用户AccessKey ID
     * @param accessKeySecret 用户AccessKey Secret
     */
    private static String regionId="cn-beijing";
    private static String accessKeyId = "LTAI5tN9MbN6rxxxxxxxx";
    private static String accessKeySecret = "4o88kaOkDjc0pJ1Hzxxxxxxxx";

    public static IAcsClient createClient() {
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        /** use STS Token
         DefaultProfile profile = DefaultProfile.getProfile(
         "<your-region-id>",           // The region ID
         "<your-access-key-id>",       // The AccessKey ID of the RAM account
         "<your-access-key-secret>",   // The AccessKey Secret of the RAM account
         "<your-sts-token>");          // STS Token
         **/
        IAcsClient client = new DefaultAcsClient(profile);
        return client;
    }
}
