// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListClusterFromGrafanaResponseBody extends TeaModel {
    @NameInMap("PromClusterList")
    public java.util.List<ListClusterFromGrafanaResponseBodyPromClusterList> promClusterList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterFromGrafanaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterFromGrafanaResponseBody self = new ListClusterFromGrafanaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterFromGrafanaResponseBody setPromClusterList(java.util.List<ListClusterFromGrafanaResponseBodyPromClusterList> promClusterList) {
        this.promClusterList = promClusterList;
        return this;
    }
    public java.util.List<ListClusterFromGrafanaResponseBodyPromClusterList> getPromClusterList() {
        return this.promClusterList;
    }

    public ListClusterFromGrafanaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterFromGrafanaResponseBodyPromClusterList extends TeaModel {
        @NameInMap("AgentStatus")
        public String agentStatus;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ControllerId")
        public String controllerId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstallTime")
        public Long installTime;

        @NameInMap("IsControllerInstalled")
        public Boolean isControllerInstalled;

        @NameInMap("LastHeartBeatTime")
        public Long lastHeartBeatTime;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("Options")
        public String options;

        @NameInMap("PluginsJsonArray")
        public String pluginsJsonArray;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StateJson")
        public String stateJson;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static ListClusterFromGrafanaResponseBodyPromClusterList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterFromGrafanaResponseBodyPromClusterList self = new ListClusterFromGrafanaResponseBodyPromClusterList();
            return TeaModel.build(map, self);
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setControllerId(String controllerId) {
            this.controllerId = controllerId;
            return this;
        }
        public String getControllerId() {
            return this.controllerId;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setInstallTime(Long installTime) {
            this.installTime = installTime;
            return this;
        }
        public Long getInstallTime() {
            return this.installTime;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setIsControllerInstalled(Boolean isControllerInstalled) {
            this.isControllerInstalled = isControllerInstalled;
            return this;
        }
        public Boolean getIsControllerInstalled() {
            return this.isControllerInstalled;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setLastHeartBeatTime(Long lastHeartBeatTime) {
            this.lastHeartBeatTime = lastHeartBeatTime;
            return this;
        }
        public Long getLastHeartBeatTime() {
            return this.lastHeartBeatTime;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setPluginsJsonArray(String pluginsJsonArray) {
            this.pluginsJsonArray = pluginsJsonArray;
            return this;
        }
        public String getPluginsJsonArray() {
            return this.pluginsJsonArray;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setStateJson(String stateJson) {
            this.stateJson = stateJson;
            return this;
        }
        public String getStateJson() {
            return this.stateJson;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListClusterFromGrafanaResponseBodyPromClusterList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
