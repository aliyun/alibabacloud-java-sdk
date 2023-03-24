package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig;
import com.google.gson.Gson;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;

/**
 * @author
 * @Description
 * @time 2022101715:35
 */
public class DescribeRegions {

        public static void main(String[] args) {
            IAcsClient client;
            try {
                client = AliyunEcsClientConfig.createClient();
            } catch (Exception e) {
                throw new RuntimeException("无法创建阿里云客户端", e);
            }

            DescribeRegionsRequest request = new DescribeRegionsRequest();

            try {
                DescribeRegionsResponse response = client.getAcsResponse(request);
                System.out.println(new Gson().toJson(response));
            } catch (ServerException e) {
                e.printStackTrace();
            } catch (ClientException e) {
                System.out.println("ErrCode:" + e.getErrCode());
                System.out.println("ErrMsg:" + e.getErrMsg());
                System.out.println("RequestId:" + e.getRequestId());
            }

        }
    }
