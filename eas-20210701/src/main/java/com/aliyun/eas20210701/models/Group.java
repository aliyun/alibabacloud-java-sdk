// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Group extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    @NameInMap("Name")
    public String name;

    @NameInMap("QueueService")
    public String queueService;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static Group build(java.util.Map<String, ?> map) throws Exception {
        Group self = new Group();
        return TeaModel.build(map, self);
    }

    public Group setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public Group setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Group setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Group setInternetEndpoint(String internetEndpoint) {
        this.internetEndpoint = internetEndpoint;
        return this;
    }
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    public Group setIntranetEndpoint(String intranetEndpoint) {
        this.intranetEndpoint = intranetEndpoint;
        return this;
    }
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Group setQueueService(String queueService) {
        this.queueService = queueService;
        return this;
    }
    public String getQueueService() {
        return this.queueService;
    }

    public Group setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
