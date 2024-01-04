// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The queried instance.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstanceAttributeResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setItems(DescribeDBInstanceAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag> tag;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags setTag(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute extends TeaModel {
        /**
         * <p>The service availability of the instance. Unit: %.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        /**
         * <p>The access mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Performance**: standard mode.</p>
         * <p>*   **Safety**: safe mode.</p>
         * <p>*   **LVS**: Linux Virtual Server (LVS) mode.</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The endpoint that is used to connect to the instance.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The number of the minor version.</p>
         */
        @NameInMap("CoreVersion")
        public String coreVersion;

        /**
         * <p>The number of CPU cores per compute node.</p>
         */
        @NameInMap("CpuCores")
        public Integer cpuCores;

        /**
         * <p>The number of CPU cores per node.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("CpuCoresPerNode")
        public Integer cpuCoresPerNode;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <br>
         * <p>*   **Basic**: Basic Edition.</p>
         * <p>*   **HighAvailability**: High-availability Edition.</p>
         */
        @NameInMap("DBInstanceCategory")
        public String DBInstanceCategory;

        /**
         * <p>The instance type of the instance.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The instance family of the instance. Valid values:</p>
         * <br>
         * <p>*   **s**: shared.</p>
         * <p>*   **x**: general-purpose.</p>
         * <p>*   **d**: dedicated.</p>
         * <p>*   **h**: dedicated host.</p>
         */
        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        /**
         * <p>The number of CPU cores.</p>
         */
        @NameInMap("DBInstanceCpuCores")
        public Integer DBInstanceCpuCores;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The maximum disk throughput of the compute group. Unit: Mbit/s.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("DBInstanceDiskMBPS")
        public Long DBInstanceDiskMBPS;

        /**
         * <p>The number of compute groups.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("DBInstanceGroupCount")
        public String DBInstanceGroupCount;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The memory capacity per compute node.</p>
         * <br>
         * <p>>  The unit of this parameter is MB for instances in reserved storage mode and GB for instances in Serverless mode or elastic storage mode.</p>
         */
        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        /**
         * <p>The resource type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Serverless**: Serverless mode.</p>
         * <p>*   **StorageElastic**: elastic storage mode.</p>
         * <p>*   **Classic**: reserved storage mode.</p>
         */
        @NameInMap("DBInstanceMode")
        public String DBInstanceMode;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The state of the instance. For more information, see the "Additional description of DBInstanceStatus" section of this topic.</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The maximum storage capacity per node. Unit: GB.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        /**
         * <p>The encryption key.</p>
         * <br>
         * <p>>  This parameter is returned only for instances that have disk encryption enabled.</p>
         */
        @NameInMap("EncryptionKey")
        public String encryptionKey;

        /**
         * <p>The encryption type. Valid values:</p>
         * <br>
         * <p>*   **CloudDisk**: disk encryption.</p>
         * <br>
         * <p>>  This parameter is returned only for instances that have disk encryption enabled.</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The database engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time of the instance. The time is displayed in UTC.</p>
         * <br>
         * <p>>  The expiration time of a pay-as-you-go instance is `2999-09-08T16:00:00Z`.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The disk type of the compute group. Valid values:</p>
         * <br>
         * <p>*   **0**: SSD.</p>
         * <p>*   **1**: HDD.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("HostType")
        public String hostType;

        /**
         * <p>The wait period for the instance that has no traffic to become idle. Unit: seconds.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in Serverless automatic scheduling mode.</p>
         */
        @NameInMap("IdleTime")
        public Integer idleTime;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**: classic network.</p>
         * <p>*   **VPC**: VPC.</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked due to instance expiration.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked due to instance restoration.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The end time of the maintenance window of the instance.</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window of the instance.</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The amount of coordinator node resources.</p>
         */
        @NameInMap("MasterCU")
        public Integer masterCU;

        /**
         * <p>The number of coordinator nodes.</p>
         */
        @NameInMap("MasterNodeNum")
        public Integer masterNodeNum;

        /**
         * <p>The maximum number of concurrent connections to the instance.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The memory capacity per node. The unit of this parameter can be one of the valid values of **MemoryUnit**.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("MemoryPerNode")
        public Integer memoryPerNode;

        /**
         * <p>The memory capacity per compute node.</p>
         * <br>
         * <p>>  The unit of this parameter is MB for instances in reserved storage mode and GB for instances in Serverless mode or elastic storage mode.</p>
         */
        @NameInMap("MemorySize")
        public Long memorySize;

        /**
         * <p>The unit of the memory capacity.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("MemoryUnit")
        public String memoryUnit;

        /**
         * <p>The minor version of the instance.</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go.</p>
         * <p>*   **Prepaid**: subscription.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port number that is used to connect to the instance.</p>
         */
        @NameInMap("Port")
        public String port;

        @NameInMap("ProdType")
        public String prodType;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("ReadDelayTime")
        public String readDelayTime;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The running duration of the instance.</p>
         */
        @NameInMap("RunningTime")
        public String runningTime;

        /**
         * <p>An invalid parameter. It is no longer returned when you call this operation.</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The performance level of ESSDs. Only **PL1** is supported.</p>
         */
        @NameInMap("SegDiskPerformanceLevel")
        public String segDiskPerformanceLevel;

        /**
         * <p>The number of compute nodes.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in elastic storage mode or Serverless manual scheduling mode.</p>
         */
        @NameInMap("SegNodeNum")
        public Integer segNodeNum;

        /**
         * <p>The number of compute groups.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("SegmentCounts")
        public Integer segmentCounts;

        /**
         * <p>The type of the Serverless mode. Valid values:</p>
         * <br>
         * <p>*   **Manual**: manual scheduling.</p>
         * <p>*   **Auto**: automatic scheduling.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in Serverless mode.</p>
         */
        @NameInMap("ServerlessMode")
        public String serverlessMode;

        /**
         * <p>The threshold of computing resources. Unit: AnalyticDB compute units (ACUs).</p>
         * <br>
         * <p>>  This parameter is returned only for instances in Serverless automatic scheduling mode.</p>
         */
        @NameInMap("ServerlessResource")
        public Integer serverlessResource;

        /**
         * <p>The time when the instance started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The storage capacity per node. The unit of this parameter can be one of the valid values of **StorageUnit**.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("StoragePerNode")
        public Integer storagePerNode;

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD).</p>
         * <p>*   **cloud_efficiency**: ultra disk.</p>
         * <br>
         * <p>>  This parameter is returned only for instances in elastic storage mode.</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The unit of the storage capacity. Valid values:</p>
         * <br>
         * <p>*   **GB SSD**</p>
         * <p>*   **TB SSD**</p>
         * <p>*   **GB HDD**</p>
         * <br>
         * <p>>  This parameter is returned only for instances in reserved storage mode.</p>
         */
        @NameInMap("StorageUnit")
        public String storageUnit;

        /**
         * <p>Indicates whether the instance supports backup and restoration. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("SupportRestore")
        public Boolean supportRestore;

        /**
         * <p>The tags of the instance. Each tag is a key-value pair.</p>
         */
        @NameInMap("Tags")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags tags;

        /**
         * <p>The vSwitch ID of the instance.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Indicates whether vector search engine optimization is enabled. Valid values:</p>
         * <br>
         * <p>*   **enabled**</p>
         * <p>*   **disabled**</p>
         */
        @NameInMap("VectorConfigurationStatus")
        public String vectorConfigurationStatus;

        /**
         * <p>The virtual private cloud (VPC) ID of the instance.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCoreVersion(String coreVersion) {
            this.coreVersion = coreVersion;
            return this;
        }
        public String getCoreVersion() {
            return this.coreVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCpuCoresPerNode(Integer cpuCoresPerNode) {
            this.cpuCoresPerNode = cpuCoresPerNode;
            return this;
        }
        public Integer getCpuCoresPerNode() {
            return this.cpuCoresPerNode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceCategory(String DBInstanceCategory) {
            this.DBInstanceCategory = DBInstanceCategory;
            return this;
        }
        public String getDBInstanceCategory() {
            return this.DBInstanceCategory;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceCpuCores(Integer DBInstanceCpuCores) {
            this.DBInstanceCpuCores = DBInstanceCpuCores;
            return this;
        }
        public Integer getDBInstanceCpuCores() {
            return this.DBInstanceCpuCores;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceDiskMBPS(Long DBInstanceDiskMBPS) {
            this.DBInstanceDiskMBPS = DBInstanceDiskMBPS;
            return this;
        }
        public Long getDBInstanceDiskMBPS() {
            return this.DBInstanceDiskMBPS;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceGroupCount(String DBInstanceGroupCount) {
            this.DBInstanceGroupCount = DBInstanceGroupCount;
            return this;
        }
        public String getDBInstanceGroupCount() {
            return this.DBInstanceGroupCount;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceMode(String DBInstanceMode) {
            this.DBInstanceMode = DBInstanceMode;
            return this;
        }
        public String getDBInstanceMode() {
            return this.DBInstanceMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setHostType(String hostType) {
            this.hostType = hostType;
            return this;
        }
        public String getHostType() {
            return this.hostType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setIdleTime(Integer idleTime) {
            this.idleTime = idleTime;
            return this;
        }
        public Integer getIdleTime() {
            return this.idleTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterCU(Integer masterCU) {
            this.masterCU = masterCU;
            return this;
        }
        public Integer getMasterCU() {
            return this.masterCU;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterNodeNum(Integer masterNodeNum) {
            this.masterNodeNum = masterNodeNum;
            return this;
        }
        public Integer getMasterNodeNum() {
            return this.masterNodeNum;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMemoryPerNode(Integer memoryPerNode) {
            this.memoryPerNode = memoryPerNode;
            return this;
        }
        public Integer getMemoryPerNode() {
            return this.memoryPerNode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMemorySize(Long memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Long getMemorySize() {
            return this.memorySize;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMemoryUnit(String memoryUnit) {
            this.memoryUnit = memoryUnit;
            return this;
        }
        public String getMemoryUnit() {
            return this.memoryUnit;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setProdType(String prodType) {
            this.prodType = prodType;
            return this;
        }
        public String getProdType() {
            return this.prodType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadDelayTime(String readDelayTime) {
            this.readDelayTime = readDelayTime;
            return this;
        }
        public String getReadDelayTime() {
            return this.readDelayTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setRunningTime(String runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public String getRunningTime() {
            return this.runningTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSegDiskPerformanceLevel(String segDiskPerformanceLevel) {
            this.segDiskPerformanceLevel = segDiskPerformanceLevel;
            return this;
        }
        public String getSegDiskPerformanceLevel() {
            return this.segDiskPerformanceLevel;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSegNodeNum(Integer segNodeNum) {
            this.segNodeNum = segNodeNum;
            return this;
        }
        public Integer getSegNodeNum() {
            return this.segNodeNum;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSegmentCounts(Integer segmentCounts) {
            this.segmentCounts = segmentCounts;
            return this;
        }
        public Integer getSegmentCounts() {
            return this.segmentCounts;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setServerlessMode(String serverlessMode) {
            this.serverlessMode = serverlessMode;
            return this;
        }
        public String getServerlessMode() {
            return this.serverlessMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setServerlessResource(Integer serverlessResource) {
            this.serverlessResource = serverlessResource;
            return this;
        }
        public Integer getServerlessResource() {
            return this.serverlessResource;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setStoragePerNode(Integer storagePerNode) {
            this.storagePerNode = storagePerNode;
            return this;
        }
        public Integer getStoragePerNode() {
            return this.storagePerNode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setStorageUnit(String storageUnit) {
            this.storageUnit = storageUnit;
            return this;
        }
        public String getStorageUnit() {
            return this.storageUnit;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSupportRestore(Boolean supportRestore) {
            this.supportRestore = supportRestore;
            return this;
        }
        public Boolean getSupportRestore() {
            return this.supportRestore;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTags(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeTags getTags() {
            return this.tags;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVectorConfigurationStatus(String vectorConfigurationStatus) {
            this.vectorConfigurationStatus = vectorConfigurationStatus;
            return this;
        }
        public String getVectorConfigurationStatus() {
            return this.vectorConfigurationStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstanceAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItems self = new DescribeDBInstanceAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItems setDBInstanceAttribute(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
