// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDBClusterAttributeResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setItems(DescribeDBClusterAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag> tag;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTags self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags setTag(java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepDesc")
        public String stepDesc;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("StepProgress")
        public String stepProgress;

        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepDesc(String stepDesc) {
            this.stepDesc = stepDesc;
            return this;
        }
        public String getStepDesc() {
            return this.stepDesc;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepProgress(String stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public String getStepProgress() {
            return this.stepProgress;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList extends TeaModel {
        @NameInMap("StepList")
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList> stepList;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList setStepList(java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList> stepList) {
            this.stepList = stepList;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepListStepList> getStepList() {
            return this.stepList;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("StepList")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList stepList;

        public static DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo self = new DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo setStepList(DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList stepList) {
            this.stepList = stepList;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfoStepList getStepList() {
            return this.stepList;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItemsDBCluster extends TeaModel {
        @NameInMap("AINodeNumber")
        public Integer AINodeNumber;

        @NameInMap("AINodeSpec")
        public String AINodeSpec;

        @NameInMap("ClickhouseEngineCacheSize")
        public Integer clickhouseEngineCacheSize;

        @NameInMap("ClickhouseEngineEnabled")
        public Boolean clickhouseEngineEnabled;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ComputeResource")
        public String computeResource;

        @NameInMap("ComputeResourceTotal")
        public String computeResourceTotal;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("DBClusterType")
        public String DBClusterType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("DiskEncryption")
        public Boolean diskEncryption;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("KmsId")
        public String kmsId;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ProductForm")
        public String productForm;

        @NameInMap("ProductVersion")
        public String productVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReservedACU")
        public String reservedACU;

        @NameInMap("ReservedNodeCount")
        public Integer reservedNodeCount;

        @NameInMap("ReservedNodeSize")
        public String reservedNodeSize;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecondaryVSwitchId")
        public String secondaryVSwitchId;

        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        @NameInMap("StorageResource")
        public String storageResource;

        @NameInMap("StorageResourceTotal")
        public String storageResourceTotal;

        @NameInMap("SupportedFeatures")
        public java.util.Map<String, String> supportedFeatures;

        @NameInMap("Tags")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags;

        @NameInMap("TaskInfo")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo taskInfo;

        @NameInMap("UserENIStatus")
        public Boolean userENIStatus;

        @NameInMap("UserENIVSwitchOptions")
        public String userENIVSwitchOptions;

        @NameInMap("UserENIVpcId")
        public String userENIVpcId;

        @NameInMap("UserENIZoneOptions")
        public String userENIZoneOptions;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClusterAttributeResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBCluster self = new DescribeDBClusterAttributeResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setAINodeNumber(Integer AINodeNumber) {
            this.AINodeNumber = AINodeNumber;
            return this;
        }
        public Integer getAINodeNumber() {
            return this.AINodeNumber;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setAINodeSpec(String AINodeSpec) {
            this.AINodeSpec = AINodeSpec;
            return this;
        }
        public String getAINodeSpec() {
            return this.AINodeSpec;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setClickhouseEngineCacheSize(Integer clickhouseEngineCacheSize) {
            this.clickhouseEngineCacheSize = clickhouseEngineCacheSize;
            return this;
        }
        public Integer getClickhouseEngineCacheSize() {
            return this.clickhouseEngineCacheSize;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setClickhouseEngineEnabled(Boolean clickhouseEngineEnabled) {
            this.clickhouseEngineEnabled = clickhouseEngineEnabled;
            return this;
        }
        public Boolean getClickhouseEngineEnabled() {
            return this.clickhouseEngineEnabled;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setComputeResourceTotal(String computeResourceTotal) {
            this.computeResourceTotal = computeResourceTotal;
            return this;
        }
        public String getComputeResourceTotal() {
            return this.computeResourceTotal;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setKmsId(String kmsId) {
            this.kmsId = kmsId;
            return this;
        }
        public String getKmsId() {
            return this.kmsId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setProductForm(String productForm) {
            this.productForm = productForm;
            return this;
        }
        public String getProductForm() {
            return this.productForm;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setReservedACU(String reservedACU) {
            this.reservedACU = reservedACU;
            return this;
        }
        public String getReservedACU() {
            return this.reservedACU;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setReservedNodeCount(Integer reservedNodeCount) {
            this.reservedNodeCount = reservedNodeCount;
            return this;
        }
        public Integer getReservedNodeCount() {
            return this.reservedNodeCount;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setReservedNodeSize(String reservedNodeSize) {
            this.reservedNodeSize = reservedNodeSize;
            return this;
        }
        public String getReservedNodeSize() {
            return this.reservedNodeSize;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setSecondaryVSwitchId(String secondaryVSwitchId) {
            this.secondaryVSwitchId = secondaryVSwitchId;
            return this;
        }
        public String getSecondaryVSwitchId() {
            return this.secondaryVSwitchId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setStorageResourceTotal(String storageResourceTotal) {
            this.storageResourceTotal = storageResourceTotal;
            return this;
        }
        public String getStorageResourceTotal() {
            return this.storageResourceTotal;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setSupportedFeatures(java.util.Map<String, String> supportedFeatures) {
            this.supportedFeatures = supportedFeatures;
            return this;
        }
        public java.util.Map<String, String> getSupportedFeatures() {
            return this.supportedFeatures;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setTags(DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setTaskInfo(DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTaskInfo getTaskInfo() {
            return this.taskInfo;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIStatus(Boolean userENIStatus) {
            this.userENIStatus = userENIStatus;
            return this;
        }
        public Boolean getUserENIStatus() {
            return this.userENIStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIVSwitchOptions(String userENIVSwitchOptions) {
            this.userENIVSwitchOptions = userENIVSwitchOptions;
            return this;
        }
        public String getUserENIVSwitchOptions() {
            return this.userENIVSwitchOptions;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIVpcId(String userENIVpcId) {
            this.userENIVpcId = userENIVpcId;
            return this;
        }
        public String getUserENIVpcId() {
            return this.userENIVpcId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIZoneOptions(String userENIZoneOptions) {
            this.userENIZoneOptions = userENIZoneOptions;
            return this;
        }
        public String getUserENIZoneOptions() {
            return this.userENIZoneOptions;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBCluster> DBCluster;

        public static DescribeDBClusterAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItems self = new DescribeDBClusterAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItems setDBCluster(java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyItemsDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
