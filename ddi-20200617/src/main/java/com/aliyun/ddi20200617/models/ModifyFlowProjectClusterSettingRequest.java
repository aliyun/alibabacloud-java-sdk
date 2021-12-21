// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowProjectClusterSettingRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DefaultQueue")
    public String defaultQueue;

    @NameInMap("DefaultUser")
    public String defaultUser;

    @NameInMap("HostList")
    public java.util.List<String> hostList;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("QueueList")
    public java.util.List<String> queueList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserList")
    public java.util.List<String> userList;

    public static ModifyFlowProjectClusterSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowProjectClusterSettingRequest self = new ModifyFlowProjectClusterSettingRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowProjectClusterSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyFlowProjectClusterSettingRequest setDefaultQueue(String defaultQueue) {
        this.defaultQueue = defaultQueue;
        return this;
    }
    public String getDefaultQueue() {
        return this.defaultQueue;
    }

    public ModifyFlowProjectClusterSettingRequest setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
        return this;
    }
    public String getDefaultUser() {
        return this.defaultUser;
    }

    public ModifyFlowProjectClusterSettingRequest setHostList(java.util.List<String> hostList) {
        this.hostList = hostList;
        return this;
    }
    public java.util.List<String> getHostList() {
        return this.hostList;
    }

    public ModifyFlowProjectClusterSettingRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyFlowProjectClusterSettingRequest setQueueList(java.util.List<String> queueList) {
        this.queueList = queueList;
        return this;
    }
    public java.util.List<String> getQueueList() {
        return this.queueList;
    }

    public ModifyFlowProjectClusterSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowProjectClusterSettingRequest setUserList(java.util.List<String> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<String> getUserList() {
        return this.userList;
    }

}
