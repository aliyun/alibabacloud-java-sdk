// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("GroupsInfo")
    public java.util.List<GetDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBResourceGroupResponseBody self = new GetDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBResourceGroupResponseBody setGroupsInfo(java.util.List<GetDBResourceGroupResponseBodyGroupsInfo> groupsInfo) {
        this.groupsInfo = groupsInfo;
        return this;
    }
    public java.util.List<GetDBResourceGroupResponseBodyGroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    public GetDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDBResourceGroupResponseBodyGroupsInfoRules extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static GetDBResourceGroupResponseBodyGroupsInfoRules build(java.util.Map<String, ?> map) throws Exception {
            GetDBResourceGroupResponseBodyGroupsInfoRules self = new GetDBResourceGroupResponseBodyGroupsInfoRules();
            return TeaModel.build(map, self);
        }

        public GetDBResourceGroupResponseBodyGroupsInfoRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDBResourceGroupResponseBodyGroupsInfoRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public GetDBResourceGroupResponseBodyGroupsInfoRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

    public static class GetDBResourceGroupResponseBodyGroupsInfo extends TeaModel {
        @NameInMap("AutoStopInterval")
        public String autoStopInterval;

        @NameInMap("ClusterMode")
        public String clusterMode;

        @NameInMap("ClusterSizeResource")
        public String clusterSizeResource;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ElasticMinComputeResource")
        public String elasticMinComputeResource;

        @NameInMap("EnableSpot")
        public String enableSpot;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineParams")
        public java.util.Map<String, ?> engineParams;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("GroupUserList")
        public java.util.List<String> groupUserList;

        @NameInMap("GroupUsers")
        public String groupUsers;

        @NameInMap("MaxClusterCount")
        public Integer maxClusterCount;

        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        @NameInMap("MaxGpuQuantity")
        public Integer maxGpuQuantity;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MinClusterCount")
        public Integer minClusterCount;

        @NameInMap("MinComputeResource")
        public String minComputeResource;

        @NameInMap("MinGpuQuantity")
        public Integer minGpuQuantity;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("Rules")
        public java.util.List<GetDBResourceGroupResponseBodyGroupsInfoRules> rules;

        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetResourceGroupName")
        public String targetResourceGroupName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetDBResourceGroupResponseBodyGroupsInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDBResourceGroupResponseBodyGroupsInfo self = new GetDBResourceGroupResponseBodyGroupsInfo();
            return TeaModel.build(map, self);
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setAutoStopInterval(String autoStopInterval) {
            this.autoStopInterval = autoStopInterval;
            return this;
        }
        public String getAutoStopInterval() {
            return this.autoStopInterval;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setClusterMode(String clusterMode) {
            this.clusterMode = clusterMode;
            return this;
        }
        public String getClusterMode() {
            return this.clusterMode;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setClusterSizeResource(String clusterSizeResource) {
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setElasticMinComputeResource(String elasticMinComputeResource) {
            this.elasticMinComputeResource = elasticMinComputeResource;
            return this;
        }
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setEnableSpot(String enableSpot) {
            this.enableSpot = enableSpot;
            return this;
        }
        public String getEnableSpot() {
            return this.enableSpot;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setEngineParams(java.util.Map<String, ?> engineParams) {
            this.engineParams = engineParams;
            return this;
        }
        public java.util.Map<String, ?> getEngineParams() {
            return this.engineParams;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setGroupUserList(java.util.List<String> groupUserList) {
            this.groupUserList = groupUserList;
            return this;
        }
        public java.util.List<String> getGroupUserList() {
            return this.groupUserList;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setGroupUsers(String groupUsers) {
            this.groupUsers = groupUsers;
            return this;
        }
        public String getGroupUsers() {
            return this.groupUsers;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMaxClusterCount(Integer maxClusterCount) {
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMaxGpuQuantity(Integer maxGpuQuantity) {
            this.maxGpuQuantity = maxGpuQuantity;
            return this;
        }
        public Integer getMaxGpuQuantity() {
            return this.maxGpuQuantity;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMinClusterCount(Integer minClusterCount) {
            this.minClusterCount = minClusterCount;
            return this;
        }
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setMinGpuQuantity(Integer minGpuQuantity) {
            this.minGpuQuantity = minGpuQuantity;
            return this;
        }
        public Integer getMinGpuQuantity() {
            return this.minGpuQuantity;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setRules(java.util.List<GetDBResourceGroupResponseBodyGroupsInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<GetDBResourceGroupResponseBodyGroupsInfoRules> getRules() {
            return this.rules;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setRunningClusterCount(Integer runningClusterCount) {
            this.runningClusterCount = runningClusterCount;
            return this;
        }
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setTargetResourceGroupName(String targetResourceGroupName) {
            this.targetResourceGroupName = targetResourceGroupName;
            return this;
        }
        public String getTargetResourceGroupName() {
            return this.targetResourceGroupName;
        }

        public GetDBResourceGroupResponseBodyGroupsInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
