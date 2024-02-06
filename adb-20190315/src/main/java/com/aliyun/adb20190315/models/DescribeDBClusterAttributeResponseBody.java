// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The queried cluster information.</p>
     */
    @NameInMap("Items")
    public DescribeDBClusterAttributeResponseBodyItems items;

    /**
     * <p>The request ID.</p>
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
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>>  You can call the [TagResources](~~179253~~) operation to add a tag to the cluster.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <br>
         * <p>*   **BASIC**: reserved mode for Basic Edition.</p>
         * <p>*   **CLUSTER**: reserved mode for Cluster Edition.</p>
         * <p>*   **MIXED_STORAGE**: elastic mode for Cluster Edition.</p>
         * <br>
         * <p>>  For more information about cluster editions, see [Editions](~~205001~~).</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <br>
         * <p>*   **ads**: pay-as-you-go.</p>
         * <p>*   **ads_pre**: subscription.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The specifications of computing resources that are used in the cluster in elastic mode. Computing resources are used to compute data. The increase in the computing resources can accelerate queries. You can scale computing resources based on your business requirements.</p>
         */
        @NameInMap("ComputeResource")
        public String computeResource;

        /**
         * <p>The Virtual Private Cloud (VPC) endpoint that is used to connect to the cluster.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The time when the cluster was created. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster. **VPC** is returned.</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The state of the cluster. For more information, see [Cluster states](~~143075~~).</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The cluster type. Valid values:</p>
         * <br>
         * <p>*   **Common**: common cluster.</p>
         * <p>*   **RDS_ANALYSIS**: MySQL analytic instance.</p>
         */
        @NameInMap("DBClusterType")
        public String DBClusterType;

        /**
         * <p>The instance type of the cluster.</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of node groups.</p>
         */
        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        /**
         * <p>The storage capacity of the cluster. Unit: GB.</p>
         */
        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The engine version of the cluster. **3.0** is returned.</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>Indicates whether disk encryption is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("DiskEncryption")
        public String diskEncryption;

        /**
         * <p>The ESSD performance level.</p>
         */
        @NameInMap("DiskPerformanceLevel")
        public String diskPerformanceLevel;

        /**
         * <p>The disk type of the cluster. Valid values:</p>
         * <br>
         * <p>*   **local_ssd**: local disk.</p>
         * <p>*   **cloud**: basic disk.</p>
         * <p>*   **cloud_ssd**: standard SSD.</p>
         * <p>*   **cloud_efficiency**: ultra disk.</p>
         * <p>*   **cloud_essd0**: PL0 enhanced SSD (ESSD).</p>
         * <p>*   **cloud_essd**: PL1 ESSD.</p>
         * <p>*   **cloud_essd2**: PL2 ESSD.</p>
         * <p>*   **cloud_essd3**: PL3 ESSD.</p>
         * <br>
         * <p>>  For more information about ESSDs, see [ESSDs](~~122389~~).</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the Data Transmission Service (DTS) synchronization job. This parameter is returned only for MySQL analytic instances.</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The number of elastic I/O units (EIUs).</p>
         */
        @NameInMap("ElasticIOResource")
        public Integer elasticIOResource;

        /**
         * <p>The single-node specifications of an EIU. Valid values:</p>
         * <br>
         * <p>*   8Core64GB: If this value is returned, the specifications of an EIU are 24 cores and 192 GB memory.</p>
         * <p>*   12Core96GB: If this value is returned, the specifications of an EIU are 36 cores and 288 GB memory.</p>
         */
        @NameInMap("ElasticIOResourceSize")
        public String elasticIOResourceSize;

        /**
         * <p>Indicates whether an Airflow cluster was created. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableAirflow")
        public Boolean enableAirflow;

        /**
         * <p>Indicates whether a Spark cluster was created. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("EnableSpark")
        public Boolean enableSpark;

        /**
         * <p>The engine of the cluster. **AnalyticDB** is returned.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The minor version of the cluster.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The number of compute nodes that are used by the cluster in elastic mode.</p>
         */
        @NameInMap("ExecutorCount")
        public String executorCount;

        /**
         * <p>The expiration time of the cluster. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC. Example: *2999-09-08T16:00:00Z*.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If the billing method of the cluster is subscription, the actual expiration time is returned.</p>
         * <br>
         * <p>*   If the billing method of the cluster is pay-as-you-go, **2999-09-08T16:00:00Z** is returned.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The public IP address of the cluster.</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <p>The public port number.</p>
         */
        @NameInMap("InnerPort")
        public String innerPort;

        /**
         * <p>The ID of the key that is used to encrypt disk data.</p>
         * <br>
         * <p>>  This parameter is returned only when disk encryption is enabled.</p>
         */
        @NameInMap("KmsId")
        public String kmsId;

        /**
         * <p>The lock mode of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The cluster is not locked.</p>
         * <p>*   **ManualLock**: The cluster is manually locked.</p>
         * <p>*   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.</p>
         * <p>*   **LockByRestoration**: The cluster is automatically locked due to cluster restoration.</p>
         * <p>*   **LockByDiskQuota**: The cluster is automatically locked when 90% of the cluster storage is used.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the cluster is locked.</p>
         * <br>
         * <p>>  This parameter is returned only when the cluster was locked. **instance_expire** is returned.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The maintenance window of the cluster. The time is displayed in the *HH:mmZ-HH:mmZ* format in UTC. An example is *04:00Z-05:00Z*, which indicates that routine maintenance is performed from 04:00 to 05:00.</p>
         * <br>
         * <p>>  For more information about maintenance windows, see [Configure a maintenance window](~~122569~~).</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The mode of the cluster. Valid values:</p>
         * <br>
         * <p>*   **flexible**: elastic mode.</p>
         * <p>*   **reserver**: reserved mode.</p>
         * <br>
         * <p>>  For more information about cluster modes, see [Editions](~~205001~~).</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go.</p>
         * <p>*   **Prepaid**: subscription.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port number that is used to connect to the cluster.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the ApsaraDB RDS instance from which data is synchronized to the cluster. This parameter is returned only for MySQL analytic instances.</p>
         */
        @NameInMap("RdsInstanceId")
        public String rdsInstanceId;

        /**
         * <p>The region ID of the cluster.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The specifications of storage resources that are used in the cluster in elastic mode. Storage resources are used to read and write data. The increase in the storage resources can improve the read and write performance of the cluster.</p>
         */
        @NameInMap("StorageResource")
        public String storageResource;

        /**
         * <p>The tags that are added to the cluster.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags;

        /**
         * <p>Indicates whether Elastic Network Interface (ENI) is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("UserENIStatus")
        public Boolean userENIStatus;

        /**
         * <p>The ID of the cluster that resides in the VPC.</p>
         */
        @NameInMap("VPCCloudInstanceId")
        public String VPCCloudInstanceId;

        /**
         * <p>The VPC ID of the cluster.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the cluster.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClusterAttributeResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyItemsDBCluster self = new DescribeDBClusterAttributeResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
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

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskEncryption(String diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public String getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskPerformanceLevel(String diskPerformanceLevel) {
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setElasticIOResource(Integer elasticIOResource) {
            this.elasticIOResource = elasticIOResource;
            return this;
        }
        public Integer getElasticIOResource() {
            return this.elasticIOResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setElasticIOResourceSize(String elasticIOResourceSize) {
            this.elasticIOResourceSize = elasticIOResourceSize;
            return this;
        }
        public String getElasticIOResourceSize() {
            return this.elasticIOResourceSize;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEnableAirflow(Boolean enableAirflow) {
            this.enableAirflow = enableAirflow;
            return this;
        }
        public Boolean getEnableAirflow() {
            return this.enableAirflow;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setEnableSpark(Boolean enableSpark) {
            this.enableSpark = enableSpark;
            return this;
        }
        public Boolean getEnableSpark() {
            return this.enableSpark;
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

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setExecutorCount(String executorCount) {
            this.executorCount = executorCount;
            return this;
        }
        public String getExecutorCount() {
            return this.executorCount;
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

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setInnerPort(String innerPort) {
            this.innerPort = innerPort;
            return this;
        }
        public String getInnerPort() {
            return this.innerPort;
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

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setStorageResource(String storageResource) {
            this.storageResource = storageResource;
            return this;
        }
        public String getStorageResource() {
            return this.storageResource;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setTags(DescribeDBClusterAttributeResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setUserENIStatus(Boolean userENIStatus) {
            this.userENIStatus = userENIStatus;
            return this;
        }
        public Boolean getUserENIStatus() {
            return this.userENIStatus;
        }

        public DescribeDBClusterAttributeResponseBodyItemsDBCluster setVPCCloudInstanceId(String VPCCloudInstanceId) {
            this.VPCCloudInstanceId = VPCCloudInstanceId;
            return this;
        }
        public String getVPCCloudInstanceId() {
            return this.VPCCloudInstanceId;
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
