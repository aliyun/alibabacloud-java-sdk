// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowProjectClusterSettingRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DefaultUser")
    public String defaultUser;

    @NameInMap("DefaultQueue")
    public String defaultQueue;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserList")
    public java.util.List<String> userList;

    @NameInMap("QueueList")
    public java.util.List<String> queueList;

    @NameInMap("HostList")
    public java.util.List<String> hostList;

    public static CreateFlowProjectClusterSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectClusterSettingRequest self = new CreateFlowProjectClusterSettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectClusterSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowProjectClusterSettingRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateFlowProjectClusterSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateFlowProjectClusterSettingRequest setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
        return this;
    }
    public String getDefaultUser() {
        return this.defaultUser;
    }

    public CreateFlowProjectClusterSettingRequest setDefaultQueue(String defaultQueue) {
        this.defaultQueue = defaultQueue;
        return this;
    }
    public String getDefaultQueue() {
        return this.defaultQueue;
    }

    public CreateFlowProjectClusterSettingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFlowProjectClusterSettingRequest setUserList(java.util.List<String> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<String> getUserList() {
        return this.userList;
    }

    public CreateFlowProjectClusterSettingRequest setQueueList(java.util.List<String> queueList) {
        this.queueList = queueList;
        return this;
    }
    public java.util.List<String> getQueueList() {
        return this.queueList;
    }

    public CreateFlowProjectClusterSettingRequest setHostList(java.util.List<String> hostList) {
        this.hostList = hostList;
        return this;
    }
    public java.util.List<String> getHostList() {
        return this.hostList;
    }

}
