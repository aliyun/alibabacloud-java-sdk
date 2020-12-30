// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneClusterResponseBody extends TeaModel {
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    @NameInMap("ModuleStackVersion")
    public String moduleStackVersion;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PrimaryVSwitchIds")
    public String primaryVSwitchIds;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("LogDiskCount")
    public String logDiskCount;

    @NameInMap("IsDeletionProtection")
    public Boolean isDeletionProtection;

    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    @NameInMap("ModuleId")
    public Integer moduleId;

    @NameInMap("ArbiterVSwitchIds")
    public String arbiterVSwitchIds;

    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    @NameInMap("StandbyVSwitchIds")
    public String standbyVSwitchIds;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("MasterDiskType")
    public String masterDiskType;

    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("Tags")
    public DescribeMultiZoneClusterResponseBodyTags tags;

    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    @NameInMap("Status")
    public String status;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("MajorVersion")
    public String majorVersion;

    @NameInMap("CoreDiskCount")
    public String coreDiskCount;

    @NameInMap("MultiZoneInstanceModels")
    public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels multiZoneInstanceModels;

    @NameInMap("ExpireTimeUTC")
    public String expireTimeUTC;

    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    @NameInMap("MasterDiskSize")
    public Integer masterDiskSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    @NameInMap("CreatedTimeUTC")
    public String createdTimeUTC;

    @NameInMap("LogInstanceType")
    public String logInstanceType;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("MasterNodeCount")
    public Integer masterNodeCount;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    @NameInMap("LogDiskType")
    public String logDiskType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    public static DescribeMultiZoneClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneClusterResponseBody self = new DescribeMultiZoneClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneClusterResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setModuleStackVersion(String moduleStackVersion) {
        this.moduleStackVersion = moduleStackVersion;
        return this;
    }
    public String getModuleStackVersion() {
        return this.moduleStackVersion;
    }

    public DescribeMultiZoneClusterResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeMultiZoneClusterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMultiZoneClusterResponseBody setPrimaryVSwitchIds(String primaryVSwitchIds) {
        this.primaryVSwitchIds = primaryVSwitchIds;
        return this;
    }
    public String getPrimaryVSwitchIds() {
        return this.primaryVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskCount(String logDiskCount) {
        this.logDiskCount = logDiskCount;
        return this;
    }
    public String getLogDiskCount() {
        return this.logDiskCount;
    }

    public DescribeMultiZoneClusterResponseBody setIsDeletionProtection(Boolean isDeletionProtection) {
        this.isDeletionProtection = isDeletionProtection;
        return this;
    }
    public Boolean getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public Integer getModuleId() {
        return this.moduleId;
    }

    public DescribeMultiZoneClusterResponseBody setArbiterVSwitchIds(String arbiterVSwitchIds) {
        this.arbiterVSwitchIds = arbiterVSwitchIds;
        return this;
    }
    public String getArbiterVSwitchIds() {
        return this.arbiterVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public DescribeMultiZoneClusterResponseBody setStandbyVSwitchIds(String standbyVSwitchIds) {
        this.standbyVSwitchIds = standbyVSwitchIds;
        return this;
    }
    public String getStandbyVSwitchIds() {
        return this.standbyVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeMultiZoneClusterResponseBody setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeMultiZoneClusterResponseBody setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public DescribeMultiZoneClusterResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeMultiZoneClusterResponseBody setTags(DescribeMultiZoneClusterResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeMultiZoneClusterResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeMultiZoneClusterResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMultiZoneClusterResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeMultiZoneClusterResponseBody setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskCount(String coreDiskCount) {
        this.coreDiskCount = coreDiskCount;
        return this;
    }
    public String getCoreDiskCount() {
        return this.coreDiskCount;
    }

    public DescribeMultiZoneClusterResponseBody setMultiZoneInstanceModels(DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels multiZoneInstanceModels) {
        this.multiZoneInstanceModels = multiZoneInstanceModels;
        return this;
    }
    public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels getMultiZoneInstanceModels() {
        return this.multiZoneInstanceModels;
    }

    public DescribeMultiZoneClusterResponseBody setExpireTimeUTC(String expireTimeUTC) {
        this.expireTimeUTC = expireTimeUTC;
        return this;
    }
    public String getExpireTimeUTC() {
        return this.expireTimeUTC;
    }

    public DescribeMultiZoneClusterResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setMasterDiskSize(Integer masterDiskSize) {
        this.masterDiskSize = masterDiskSize;
        return this;
    }
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMultiZoneClusterResponseBody setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public DescribeMultiZoneClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeMultiZoneClusterResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMultiZoneClusterResponseBody setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setCreatedTimeUTC(String createdTimeUTC) {
        this.createdTimeUTC = createdTimeUTC;
        return this;
    }
    public String getCreatedTimeUTC() {
        return this.createdTimeUTC;
    }

    public DescribeMultiZoneClusterResponseBody setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribeMultiZoneClusterResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeMultiZoneClusterResponseBody setMasterNodeCount(Integer masterNodeCount) {
        this.masterNodeCount = masterNodeCount;
        return this;
    }
    public Integer getMasterNodeCount() {
        return this.masterNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeMultiZoneClusterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeMultiZoneClusterResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskType(String logDiskType) {
        this.logDiskType = logDiskType;
        return this;
    }
    public String getLogDiskType() {
        return this.logDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMultiZoneClusterResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public static class DescribeMultiZoneClusterResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMultiZoneClusterResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyTagsTag self = new DescribeMultiZoneClusterResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMultiZoneClusterResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMultiZoneClusterResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMultiZoneClusterResponseBodyTagsTag> tag;

        public static DescribeMultiZoneClusterResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyTags self = new DescribeMultiZoneClusterResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyTags setTag(java.util.List<DescribeMultiZoneClusterResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMultiZoneClusterResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("IsLatestVersion")
        public Boolean isLatestVersion;

        @NameInMap("InsName")
        public String insName;

        @NameInMap("Role")
        public String role;

        @NameInMap("MinorVersion")
        public String minorVersion;

        public static DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel self = new DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setIsLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public Boolean getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

    }

    public static class DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels extends TeaModel {
        @NameInMap("MultiZoneInstanceModel")
        public java.util.List<DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel> multiZoneInstanceModel;

        public static DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels self = new DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels setMultiZoneInstanceModel(java.util.List<DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel> multiZoneInstanceModel) {
            this.multiZoneInstanceModel = multiZoneInstanceModel;
            return this;
        }
        public java.util.List<DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel> getMultiZoneInstanceModel() {
            return this.multiZoneInstanceModel;
        }

    }

}
