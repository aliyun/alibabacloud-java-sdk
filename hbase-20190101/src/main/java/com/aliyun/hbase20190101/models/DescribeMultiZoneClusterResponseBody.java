// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vsw-t4nax9mp3wk0czn****</p>
     */
    @NameInMap("ArbiterVSwitchIds")
    public String arbiterVSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1c</p>
     */
    @NameInMap("ArbiterZoneId")
    public String arbiterZoneId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <strong>example:</strong>
     * <p>ld-t4nn71xa0yn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>mz_test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ColdStorageSize")
    public Integer coldStorageSize;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CoreDiskCount")
    public String coreDiskCount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CoreDiskSize")
    public Integer coreDiskSize;

    /**
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("CoreDiskType")
    public String coreDiskType;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    /**
     * <strong>example:</strong>
     * <p>2020-10-15T18:04:52</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>2020-10-15T10:04:52Z</p>
     */
    @NameInMap("CreatedTimeUTC")
    public String createdTimeUTC;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>2a****</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <strong>example:</strong>
     * <p>CloudDisk</p>
     */
    @NameInMap("EncryptionType")
    public String encryptionType;

    /**
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>2020-11-16T08:00:00</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>2020-11-16T00:00:00Z</p>
     */
    @NameInMap("ExpireTimeUTC")
    public String expireTimeUTC;

    /**
     * <strong>example:</strong>
     * <p>ld-t4nn71xa0yn****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>mz_test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeletionProtection")
    public Boolean isDeletionProtection;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogDiskCount")
    public String logDiskCount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("LogDiskSize")
    public Integer logDiskSize;

    /**
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("LogDiskType")
    public String logDiskType;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("LogInstanceType")
    public String logInstanceType;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    /**
     * <strong>example:</strong>
     * <p>06:00:00</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <strong>example:</strong>
     * <p>02:00:00</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("MajorVersion")
    public String majorVersion;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MasterDiskSize")
    public Integer masterDiskSize;

    /**
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("MasterDiskType")
    public String masterDiskType;

    /**
     * <strong>example:</strong>
     * <p>hbase.sn1.large</p>
     */
    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MasterNodeCount")
    public Integer masterNodeCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ModuleId")
    public Integer moduleId;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("ModuleStackVersion")
    public String moduleStackVersion;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1-abc-aliyun</p>
     */
    @NameInMap("MultiZoneCombination")
    public String multiZoneCombination;

    @NameInMap("MultiZoneInstanceModels")
    public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels multiZoneInstanceModels;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>ld-fls1gf31y5s35****</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>vsw-t4n3s1zd2gtidg****</p>
     */
    @NameInMap("PrimaryVSwitchIds")
    public String primaryVSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1a</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>A02C0E6D-3A47-4FA0-BA7E-60793CE256DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-lk51f5fer315e****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>vsw-t4nvvk7xur3rdi****</p>
     */
    @NameInMap("StandbyVSwitchIds")
    public String standbyVSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-1b</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeMultiZoneClusterResponseBodyTags tags;

    @NameInMap("TaskProgress")
    public String taskProgress;

    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <strong>example:</strong>
     * <p>vpc-t4nx81tmlixcq5****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeMultiZoneClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneClusterResponseBody self = new DescribeMultiZoneClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneClusterResponseBody setArbiterVSwitchIds(String arbiterVSwitchIds) {
        this.arbiterVSwitchIds = arbiterVSwitchIds;
        return this;
    }
    public String getArbiterVSwitchIds() {
        return this.arbiterVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setArbiterZoneId(String arbiterZoneId) {
        this.arbiterZoneId = arbiterZoneId;
        return this;
    }
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public DescribeMultiZoneClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeMultiZoneClusterResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeMultiZoneClusterResponseBody setColdStorageSize(Integer coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskCount(String coreDiskCount) {
        this.coreDiskCount = coreDiskCount;
        return this;
    }
    public String getCoreDiskCount() {
        return this.coreDiskCount;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskSize(Integer coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeMultiZoneClusterResponseBody setCreatedTimeUTC(String createdTimeUTC) {
        this.createdTimeUTC = createdTimeUTC;
        return this;
    }
    public String getCreatedTimeUTC() {
        return this.createdTimeUTC;
    }

    public DescribeMultiZoneClusterResponseBody setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribeMultiZoneClusterResponseBody setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public DescribeMultiZoneClusterResponseBody setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public DescribeMultiZoneClusterResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeMultiZoneClusterResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeMultiZoneClusterResponseBody setExpireTimeUTC(String expireTimeUTC) {
        this.expireTimeUTC = expireTimeUTC;
        return this;
    }
    public String getExpireTimeUTC() {
        return this.expireTimeUTC;
    }

    public DescribeMultiZoneClusterResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMultiZoneClusterResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeMultiZoneClusterResponseBody setIsDeletionProtection(Boolean isDeletionProtection) {
        this.isDeletionProtection = isDeletionProtection;
        return this;
    }
    public Boolean getIsDeletionProtection() {
        return this.isDeletionProtection;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskCount(String logDiskCount) {
        this.logDiskCount = logDiskCount;
        return this;
    }
    public String getLogDiskCount() {
        return this.logDiskCount;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskSize(Integer logDiskSize) {
        this.logDiskSize = logDiskSize;
        return this;
    }
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setLogDiskType(String logDiskType) {
        this.logDiskType = logDiskType;
        return this;
    }
    public String getLogDiskType() {
        return this.logDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setLogInstanceType(String logInstanceType) {
        this.logInstanceType = logInstanceType;
        return this;
    }
    public String getLogInstanceType() {
        return this.logInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public DescribeMultiZoneClusterResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public DescribeMultiZoneClusterResponseBody setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeMultiZoneClusterResponseBody setMasterDiskSize(Integer masterDiskSize) {
        this.masterDiskSize = masterDiskSize;
        return this;
    }
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    public DescribeMultiZoneClusterResponseBody setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    public DescribeMultiZoneClusterResponseBody setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public DescribeMultiZoneClusterResponseBody setMasterNodeCount(Integer masterNodeCount) {
        this.masterNodeCount = masterNodeCount;
        return this;
    }
    public Integer getMasterNodeCount() {
        return this.masterNodeCount;
    }

    public DescribeMultiZoneClusterResponseBody setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public Integer getModuleId() {
        return this.moduleId;
    }

    public DescribeMultiZoneClusterResponseBody setModuleStackVersion(String moduleStackVersion) {
        this.moduleStackVersion = moduleStackVersion;
        return this;
    }
    public String getModuleStackVersion() {
        return this.moduleStackVersion;
    }

    public DescribeMultiZoneClusterResponseBody setMultiZoneCombination(String multiZoneCombination) {
        this.multiZoneCombination = multiZoneCombination;
        return this;
    }
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    public DescribeMultiZoneClusterResponseBody setMultiZoneInstanceModels(DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels multiZoneInstanceModels) {
        this.multiZoneInstanceModels = multiZoneInstanceModels;
        return this;
    }
    public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModels getMultiZoneInstanceModels() {
        return this.multiZoneInstanceModels;
    }

    public DescribeMultiZoneClusterResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeMultiZoneClusterResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeMultiZoneClusterResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeMultiZoneClusterResponseBody setPrimaryVSwitchIds(String primaryVSwitchIds) {
        this.primaryVSwitchIds = primaryVSwitchIds;
        return this;
    }
    public String getPrimaryVSwitchIds() {
        return this.primaryVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMultiZoneClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMultiZoneClusterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMultiZoneClusterResponseBody setStandbyVSwitchIds(String standbyVSwitchIds) {
        this.standbyVSwitchIds = standbyVSwitchIds;
        return this;
    }
    public String getStandbyVSwitchIds() {
        return this.standbyVSwitchIds;
    }

    public DescribeMultiZoneClusterResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public DescribeMultiZoneClusterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMultiZoneClusterResponseBody setTags(DescribeMultiZoneClusterResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeMultiZoneClusterResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeMultiZoneClusterResponseBody setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
        return this;
    }
    public String getTaskProgress() {
        return this.taskProgress;
    }

    public DescribeMultiZoneClusterResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeMultiZoneClusterResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel extends TeaModel {
        @NameInMap("HdfsMinorVersion")
        public String hdfsMinorVersion;

        /**
         * <strong>example:</strong>
         * <p>ld-t4nn71xa0yn****-az-a</p>
         */
        @NameInMap("InsName")
        public String insName;

        @NameInMap("IsHdfsLatestVersion")
        public String isHdfsLatestVersion;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLatestVersion")
        public Boolean isLatestVersion;

        @NameInMap("LatestHdfsMinorVersion")
        public String latestHdfsMinorVersion;

        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        /**
         * <strong>example:</strong>
         * <p>2.1.24</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel self = new DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setHdfsMinorVersion(String hdfsMinorVersion) {
            this.hdfsMinorVersion = hdfsMinorVersion;
            return this;
        }
        public String getHdfsMinorVersion() {
            return this.hdfsMinorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setIsHdfsLatestVersion(String isHdfsLatestVersion) {
            this.isHdfsLatestVersion = isHdfsLatestVersion;
            return this;
        }
        public String getIsHdfsLatestVersion() {
            return this.isHdfsLatestVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setIsLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public Boolean getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setLatestHdfsMinorVersion(String latestHdfsMinorVersion) {
            this.latestHdfsMinorVersion = latestHdfsMinorVersion;
            return this;
        }
        public String getLatestHdfsMinorVersion() {
            return this.latestHdfsMinorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeMultiZoneClusterResponseBodyMultiZoneInstanceModelsMultiZoneInstanceModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

    public static class DescribeMultiZoneClusterResponseBodyTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test_value</p>
         */
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

}
