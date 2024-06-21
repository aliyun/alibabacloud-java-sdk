// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListClusterFromGrafanaResponseBody extends TeaModel {
    /**
     * <p>The cluster information.</p>
     */
    @NameInMap("PromClusterList")
    public java.util.List<ListClusterFromGrafanaResponseBodyPromClusterList> promClusterList;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6849D41E-EED4-5C00-89F9-6047BBD9DCB4</p>
     */
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
        /**
         * <p>The status of the Prometheus agent on the cluster. Valid values:</p>
         * <ul>
         * <li>INSTALL_FAILED: The Prometheus agent failed to be installed.</li>
         * <li>INSTALL_SUCCEED: The Prometheus agent was installed.</li>
         * <li>NOT_REGISTER: You have not registered an Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTALL_FAILED</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c0df7ad9db0ed43128925ca04774c469e</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ay-ads-hangzhou</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-product-prometheus</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The controller ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1092</p>
         */
        @NameInMap("ControllerId")
        public String controllerId;

        /**
         * <p>The time when the dashboard was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-09T02:05:04Z</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The extended fields. This parameter is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;app_id\&quot;:\&quot;bbd\&quot;,\&quot;task_id\&quot;:\&quot;4305ba5bf14942daa6e553ed91f46988\&quot;}</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The ID of a database in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>16136</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The timestamp when the Prometheus agent was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>1653532518000</p>
         */
        @NameInMap("InstallTime")
        public Long installTime;

        /**
         * <p>Indicates whether the Prometheus agent was installed. Valid values:</p>
         * <ul>
         * <li>true: The Prometheus agent was installed.</li>
         * <li>false: The Prometheus agent was not installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsControllerInstalled")
        public Boolean isControllerInstalled;

        /**
         * <p>The time when the last heartbeat was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>1653532518000</p>
         */
        @NameInMap("LastHeartBeatTime")
        public Long lastHeartBeatTime;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The custom parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Option\&quot;: [\&quot;betaTestApproved\&quot;]}</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The list of nodejsonar logs.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginsJsonArray")
        public String pluginsJsonArray;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The information about applications deployed in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("StateJson")
        public String stateJson;

        /**
         * <p>The time when the dashboard was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-16T08:49:34Z</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the Alibaba Cloud account to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1247285**</p>
         */
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
