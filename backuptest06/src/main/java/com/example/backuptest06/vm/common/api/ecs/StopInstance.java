package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.StopInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.StopInstanceResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig;
import com.google.gson.Gson;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.6.0</version>
</dependency>
*/

/**
 * @author
 * @Description
 * @time 2022101811:20
 */
public class StopInstance {
//        public static void main(String[] args) {
    public String start(String instanceId){
            IAcsClient client;
            try {
                client = AliyunEcsClientConfig.createClient();
            } catch (Exception e) {
                throw new RuntimeException("无法创建阿里云客户端", e);
            }
            StopInstanceRequest request = new StopInstanceRequest();
            request.setInstanceId(instanceId);
            try {
                StopInstanceResponse response = client.getAcsResponse(request);
                System.out.println(new Gson().toJson(response)+"OK");
                return "OK";
            } catch (ServerException e) {

                return null;
            } catch (ClientException e) {
                System.out.println("ErrCode:" + e.getErrCode());
                System.out.println("ErrMsg:" + e.getErrMsg());
                System.out.println("RequestId:" + e.getRequestId());
                return null;
            }

        }
    }