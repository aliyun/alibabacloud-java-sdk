// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried resource groups.</p>
     */
    @NameInMap("GroupsInfo")
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBResourceGroupResponseBody setGroupsInfo(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo) {
        this.groupsInfo = groupsInfo;
        return this;
    }
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    public DescribeDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfo extends TeaModel {
        @NameInMap("ClusterMode")
        public String clusterMode;

        @NameInMap("ClusterSizeResource")
        public String clusterSizeResource;

        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The time when the resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-09 16:57:35.241</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ElasticMinComputeResource")
        public String elasticMinComputeResource;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineParams")
        public java.util.Map<String, ?> engineParams;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFAULT</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The query execution mode. Valid values:</p>
         * <ul>
         * <li><strong>interactive</strong></li>
         * <li><strong>batch</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>interactive</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The database accounts that are associated with the resource group.</p>
         */
        @NameInMap("GroupUserList")
        public java.util.List<String> groupUserList;

        /**
         * <p>The database accounts that are associated with the resource group. Multiple database accounts are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>testb,testc</p>
         */
        @NameInMap("GroupUsers")
        public String groupUsers;

        @NameInMap("MaxClusterCount")
        public Integer maxClusterCount;

        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        @NameInMap("MinClusterCount")
        public Integer minClusterCount;

        @NameInMap("MinComputeResource")
        public String minComputeResource;

        /**
         * <p>The number of nodes. Each node provides 16 cores and 64 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("Port")
        public String port;

        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the resource group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-09 16:57:35.241</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDBResourceGroupResponseBodyGroupsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfo self = new DescribeDBResourceGroupResponseBodyGroupsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public String getClusterMode() {
            return this.clusterMode;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setClusterSizeResource(String clusterSizeResource) {
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setElasticMinComputeResource(String elasticMinComputeResource) {
            this.elasticMinComputeResource = elasticMinComputeResource;
            return this;
        }
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEngineParams(java.util.Map<String, ?> engineParams) {
            this.engineParams = engineParams;
            return this;
        }
        public java.util.Map<String, ?> getEngineParams() {
            return this.engineParams;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupUserList(java.util.List<String> groupUserList) {
            this.groupUserList = groupUserList;
            return this;
        }
        public java.util.List<String> getGroupUserList() {
            return this.groupUserList;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupUsers(String groupUsers) {
            this.groupUsers = groupUsers;
            return this;
        }
        public String getGroupUsers() {
            return this.groupUsers;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxClusterCount(Integer maxClusterCount) {
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinClusterCount(Integer minClusterCount) {
            this.minClusterCount = minClusterCount;
            return this;
        }
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRunningClusterCount(Integer runningClusterCount) {
            this.runningClusterCount = runningClusterCount;
            return this;
        }
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
