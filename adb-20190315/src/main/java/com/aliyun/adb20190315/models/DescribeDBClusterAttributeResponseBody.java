// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeDBClusterAttributeResponseBodyItems items;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAttributeResponseBody setItems(DescribeDBClusterAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClusterAttributeResponseBodyItems getItems() {
        return this.items;
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

    public static class DescribeDBClusterAttributeResponseBodyItemsDBCluster extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EnableSpark")
        public Boolean enableSpark;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("Tags")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("EnableAirflow")
        public Boolean enableAirflow;

        @NameInMap("ExecutorCount")
        public String executorCount;

        @NameInMap("StorageResource")
        public String storageResource;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("RdsInstanceId")
        public String rdsInstanceId;

        @NameInMap("DBClusterType")
        public String DBClusterType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("ComputeResource")
        public String computeResource;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ElasticIOResource")
        public Integer elasticIOResource;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("UserENIStatus")
        public Boolean userENIStatus;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Category")
        public String category;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("KmsId")
        public String kmsId;

        public static DescribeDBClusterAttributeResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBCluster self = new DescribeDBClusterAttributeResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEnableSpark(Boolean enableSpark) {
            this.enableSpark = enableSpark;
            return this;
        }
        public Boolean getEnableSpark() {
            return this.enableSpark;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setTags(DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEnableAirflow(Boolean enableAirflow) {
            this.enableAirflow = enableAirflow;
            return this;
        }
        public Boolean getEnableAirflow() {
            return this.enableAirflow;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExecutorCount(String executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public String getExecutorCount() {
            return this.executorCount;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setComputeResource(String computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public String getComputeResource() {
            return this.computeResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setElasticIOResource(Integer elasticIOResource) {
            this.elasticIOResource = elasticIOResource;
            return this;
        }
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVPCCloudInstanceId(String VPCCloudInstanceId) {
            this.VPCCloudInstanceId = VPCCloudInstanceId;
            return this;
        }
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIStatus(Boolean userENIStatus) {
            this.userENIStatus = userENIStatus;
            return this;
        }
        public Boolean getUserENIStatus() {
            return this.userENIStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setKmsId(String kmsId) {
            this.kmsId = kmsId;
            return this;
        }
        public String getKmsId() {
            return this.kmsId;
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
