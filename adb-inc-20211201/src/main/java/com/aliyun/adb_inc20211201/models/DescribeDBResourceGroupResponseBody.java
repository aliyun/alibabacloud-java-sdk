// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("GroupsInfo")
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu extends TeaModel {
        @NameInMap("value")
        public Long value;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu self = new DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory extends TeaModel {
        @NameInMap("value")
        public Long value;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory self = new DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel extends TeaModel {
        @NameInMap("InternalGPUModel")
        public String internalGPUModel;

        @NameInMap("allocateUnit")
        public String allocateUnit;

        @NameInMap("cpu")
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu cpu;

        @NameInMap("memory")
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory memory;

        @NameInMap("name")
        public String name;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel self = new DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel setInternalGPUModel(String internalGPUModel) {
            this.internalGPUModel = internalGPUModel;
            return this;
        }
        public String getInternalGPUModel() {
            return this.internalGPUModel;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel setAllocateUnit(String allocateUnit) {
            this.allocateUnit = allocateUnit;
            return this;
        }
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel setCpu(DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelCpu getCpu() {
            return this.cpu;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel setMemory(DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModelMemory getMemory() {
            return this.memory;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfoRules extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("TargetGroupName")
        public String targetGroupName;

        public static DescribeDBResourceGroupResponseBodyGroupsInfoRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfoRules self = new DescribeDBResourceGroupResponseBodyGroupsInfoRules();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfoRules setTargetGroupName(String targetGroupName) {
            this.targetGroupName = targetGroupName;
            return this;
        }
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfo extends TeaModel {
        @NameInMap("AutoStopInterval")
        public String autoStopInterval;

        @NameInMap("ClusterMode")
        public String clusterMode;

        @NameInMap("ClusterSizeResource")
        public String clusterSizeResource;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("ElasticMinComputeResource")
        public String elasticMinComputeResource;

        @NameInMap("EnableSpot")
        public String enableSpot;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineParams")
        public java.util.Map<String, ?> engineParams;

        @NameInMap("GpuModel")
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel gpuModel;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

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

        @NameInMap("Rules")
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules;

        @NameInMap("RunningClusterCount")
        public Integer runningClusterCount;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetResourceGroupName")
        public String targetResourceGroupName;

        @NameInMap("UpdateTimestamp")
        public String updateTimestamp;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDBResourceGroupResponseBodyGroupsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfo self = new DescribeDBResourceGroupResponseBodyGroupsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setAutoStopInterval(String autoStopInterval) {
            this.autoStopInterval = autoStopInterval;
            return this;
        }
        public String getAutoStopInterval() {
            return this.autoStopInterval;
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

        public DescribeDBResourceGroupResponseBodyGroupsInfo setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setElasticMinComputeResource(String elasticMinComputeResource) {
            this.elasticMinComputeResource = elasticMinComputeResource;
            return this;
        }
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setEnableSpot(String enableSpot) {
            this.enableSpot = enableSpot;
            return this;
        }
        public String getEnableSpot() {
            return this.enableSpot;
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

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGpuModel(DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel gpuModel) {
            this.gpuModel = gpuModel;
            return this;
        }
        public DescribeDBResourceGroupResponseBodyGroupsInfoGpuModel getGpuModel() {
            return this.gpuModel;
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

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMaxGpuQuantity(Integer maxGpuQuantity) {
            this.maxGpuQuantity = maxGpuQuantity;
            return this;
        }
        public Integer getMaxGpuQuantity() {
            return this.maxGpuQuantity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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

        public DescribeDBResourceGroupResponseBodyGroupsInfo setMinGpuQuantity(Integer minGpuQuantity) {
            this.minGpuQuantity = minGpuQuantity;
            return this;
        }
        public Integer getMinGpuQuantity() {
            return this.minGpuQuantity;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRules(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfoRules> getRules() {
            return this.rules;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setRunningClusterCount(Integer runningClusterCount) {
            this.runningClusterCount = runningClusterCount;
            return this;
        }
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setTargetResourceGroupName(String targetResourceGroupName) {
            this.targetResourceGroupName = targetResourceGroupName;
            return this;
        }
        public String getTargetResourceGroupName() {
            return this.targetResourceGroupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setUpdateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
