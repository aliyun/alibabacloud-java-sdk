// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("BackupStatus")
    public String backupStatus;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("ColdStorageSize")
    public Integer coldStorageSize;

    @NameInMap("ColdStorageStatus")
    public String coldStorageStatus;

    @NameInMap("ConfirmMaintainTime")
    public String confirmMaintainTime;

    @NameInMap("CoreDiskCount")
    public String coreDiskCount;

    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("CreatedTimeUTC")
    public String createdTimeUTC;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EnableHbaseProxy")
    public Boolean enableHbaseProxy;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("EncryptionType")
    public String encryptionType;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ExpireTimeUTC")
    public String expireTimeUTC;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsDeletionProtection")
    public Boolean isDeletionProtection;

    @NameInMap("IsHa")
    public Boolean isHa;

    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    @NameInMap("IsMultiModel")
    public Boolean isMultiModel;

    @NameInMap("LproxyMinorVersion")
    public String lproxyMinorVersion;

    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("MajorVersion")
    public String majorVersion;

    @NameInMap("MasterDiskSize")
    public Integer masterDiskSize;

    @NameInMap("MasterDiskType")
    public String masterDiskType;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("MasterNodeCount")
    public Integer masterNodeCount;

    @NameInMap("MinorVersion")
    public String minorVersion;

    @NameInMap("ModuleId")
    public Integer moduleId;

    @NameInMap("ModuleStackVersion")
    public String moduleStackVersion;

    @NameInMap("NeedUpgrade")
    public Boolean needUpgrade;

    @NameInMap("NeedUpgradeComps")
    public DescribeInstanceResponseBodyNeedUpgradeComps needUpgradeComps;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeInstanceResponseBodyTags tags;

    @NameInMap("TaskProgress")
    public String taskProgress;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeInstanceResponseBody setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeInstanceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeInstanceResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeInstanceResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeInstanceResponseBody setColdStorageSize(Integer coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    public DescribeInstanceResponseBody setColdStorageStatus(String coldStorageStatus) {
        this.coldStorageStatus = coldStorageStatus;
        return this;
    }
    public String getColdStorageStatus() {
        return this.coldStorageStatus;
    }

    public DescribeInstanceResponseBody setConfirmMaintainTime(String confirmMaintainTime) {
        this.confirmMaintainTime = confirmMaintainTime;
        return this;
    }
    public String getConfirmMaintainTime() {
        return this.confirmMaintainTime;
    }

    public DescribeInstanceResponseBody setCoreDiskCount(String coreDiskCount) {
        this.coreDiskCount = coreDiskCount;
        return this;
    }
    public String getCoreDiskCount() {
        return this.coreDiskCount;
    }

    public DescribeInstanceResponseBody setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public DescribeInstanceResponseBody setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public DescribeInstanceResponseBody setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeInstanceResponseBody setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public DescribeInstanceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeInstanceResponseBody setCreatedTimeUTC(String createdTimeUTC) {
        this.createdTimeUTC = createdTimeUTC;
        return this;
    }
    public String getCreatedTimeUTC() {
        return this.createdTimeUTC;
    }

    public DescribeInstanceResponseBody setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribeInstanceResponseBody setEnableHbaseProxy(Boolean enableHbaseProxy) {
        this.enableHbaseProxy = enableHbaseProxy;
        return this;
    }
    public Boolean getEnableHbaseProxy() {
        return this.enableHbaseProxy;
    }

    public DescribeInstanceResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeInstanceResponseBody setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public DescribeInstanceResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeInstanceResponseBody setExpireTimeUTC(String expireTimeUTC) {
        this.expireTimeUTC = expireTimeUTC;
        return this;
    }
    public String getExpireTimeUTC() {
        return this.expireTimeUTC;
    }

    public DescribeInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceResponseBody setIsDeletionProtection(Boolean isDeletionProtection) {
        this.isDeletionProtection = isDeletionProtection;
        return this;
    }
    public Boolean getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    public DescribeInstanceResponseBody setIsHa(Boolean isHa) {
        this.isHa = isHa;
        return this;
    }
    public Boolean getIsHa() {
        return this.isHa;
    }

    public DescribeInstanceResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeInstanceResponseBody setIsMultiModel(Boolean isMultiModel) {
        this.isMultiModel = isMultiModel;
        return this;
    }
    public Boolean getIsMultiModel() {
        return this.isMultiModel;
    }

    public DescribeInstanceResponseBody setLproxyMinorVersion(String lproxyMinorVersion) {
        this.lproxyMinorVersion = lproxyMinorVersion;
        return this;
    }
    public String getLproxyMinorVersion() {
        return this.lproxyMinorVersion;
    }

    public DescribeInstanceResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public DescribeInstanceResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public DescribeInstanceResponseBody setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeInstanceResponseBody setMasterDiskSize(Integer masterDiskSize) {
        this.masterDiskSize = masterDiskSize;
        return this;
    }
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    public DescribeInstanceResponseBody setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    public DescribeInstanceResponseBody setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public DescribeInstanceResponseBody setMasterNodeCount(Integer masterNodeCount) {
        this.masterNodeCount = masterNodeCount;
        return this;
    }
    public Integer getMasterNodeCount() {
        return this.masterNodeCount;
    }

    public DescribeInstanceResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribeInstanceResponseBody setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public Integer getModuleId() {
        return this.moduleId;
    }

    public DescribeInstanceResponseBody setModuleStackVersion(String moduleStackVersion) {
        this.moduleStackVersion = moduleStackVersion;
        return this;
    }
    public String getModuleStackVersion() {
        return this.moduleStackVersion;
    }

    public DescribeInstanceResponseBody setNeedUpgrade(Boolean needUpgrade) {
        this.needUpgrade = needUpgrade;
        return this;
    }
    public Boolean getNeedUpgrade() {
        return this.needUpgrade;
    }

    public DescribeInstanceResponseBody setNeedUpgradeComps(DescribeInstanceResponseBodyNeedUpgradeComps needUpgradeComps) {
        this.needUpgradeComps = needUpgradeComps;
        return this;
    }
    public DescribeInstanceResponseBodyNeedUpgradeComps getNeedUpgradeComps() {
        return this.needUpgradeComps;
    }

    public DescribeInstanceResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeInstanceResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceResponseBody setTags(DescribeInstanceResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeInstanceResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeInstanceResponseBody setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }
    public String getTaskProgress() {
        return this.taskProgress;
    }

    public DescribeInstanceResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeInstanceResponseBody setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public DescribeInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeInstanceResponseBodyNeedUpgradeComps extends TeaModel {
        @NameInMap("Comps")
        public java.util.List<String> comps;

        public static DescribeInstanceResponseBodyNeedUpgradeComps build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyNeedUpgradeComps self = new DescribeInstanceResponseBodyNeedUpgradeComps();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyNeedUpgradeComps setComps(java.util.List<String> comps) {
            this.comps = comps;
            return this;
        }
        public java.util.List<String> getComps() {
            return this.comps;
        }

    }

    public static class DescribeInstanceResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyTagsTag self = new DescribeInstanceResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstanceResponseBodyTagsTag> tag;

        public static DescribeInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyTags self = new DescribeInstanceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyTags setTag(java.util.List<DescribeInstanceResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstanceResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
