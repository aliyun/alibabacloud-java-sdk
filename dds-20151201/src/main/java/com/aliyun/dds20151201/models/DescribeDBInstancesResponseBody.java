// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the instances.</p>
     */
    @NameInMap("DBInstances")
    public DescribeDBInstancesResponseBodyDBInstances DBInstances;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances in the query results.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setDBInstances(DescribeDBInstancesResponseBodyDBInstances DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public DescribeDBInstancesResponseBodyDBInstances getDBInstances() {
        return this.DBInstances;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute extends TeaModel {
        /**
         * <p>The instance type of the mongos node.</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The description of the mongos node.</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the mongos node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute self = new DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList extends TeaModel {
        @NameInMap("MongosAttribute")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute> mongosAttribute;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList self = new DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList setMongosAttribute(java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute> mongosAttribute) {
            this.mongosAttribute = mongosAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute> getMongosAttribute() {
            return this.mongosAttribute;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute extends TeaModel {
        /**
         * <p>The instance type of the shard node.</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The description of the shard node.</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the shard node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The storage capacity of the shard node. Unit: GB.</p>
         */
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        /**
         * <p>The number of read-only nodes in the shard node. Valid values: **0** to **5**.</p>
         */
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute self = new DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeStorage(Integer nodeStorage) {
            this.nodeStorage = nodeStorage;
            return this;
        }
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setReadonlyReplicas(Integer readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList extends TeaModel {
        @NameInMap("ShardAttribute")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute> shardAttribute;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList self = new DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList setShardAttribute(java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute> shardAttribute) {
            this.shardAttribute = shardAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute> getShardAttribute() {
            return this.shardAttribute;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag extends TeaModel {
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

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag self = new DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag> tag;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags self = new DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags setTag(java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstance extends TeaModel {
        /**
         * <p>The read and write throughput consumed by the instance.</p>
         * <br>
         * <p>>  This parameter is returned when the instance is a serverless instance.</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription.</p>
         * <p>*   **PostPaid**: pay-as-you-go.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance type of the instance.</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The status of the instance. For more information, see [Instance states](~~63870~~).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage capacity of the instance.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **sharding**: sharded cluster instance.</p>
         * <p>*   **replicate**: replica set or standalone instance.</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The time when the instance data was destroyed. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>> *   Subscription instances are released 15 days after expiration. After the instances are released, the data of the instances is deleted and cannot be restored.</p>
         * <p>> *   Pay-as-you-go instances are locked after the payments have been overdue for longer than 24 hours. The instances are released after the payments have been overdue for longer than 15 days. The data of released instances is deleted and cannot be restored.</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The database engine of the instance.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance.</p>
         * <br>
         * <p>*   **5.0**</p>
         * <p>*   **4.4**</p>
         * <p>*   **4.2**</p>
         * <p>*   **4.0**</p>
         * <p>*   **3.4**</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the secondary zone 2 of the instance. Valid values:</p>
         * <br>
         * <p>*   **cn-hangzhou-g**: Hangzhou Zone G.</p>
         * <p>*   **cn-hangzhou-h**: Hangzhou Zone H.</p>
         * <p>*   **cn-hangzhou-i**: Hangzhou Zone I.</p>
         * <p>*   **cn-hongkong-b**: Hong Kong Zone B.</p>
         * <p>*   **cn-hongkong-c**: Hong Kong Zone C.</p>
         * <p>*   **cn-hongkong-d**: Hong Kong Zone D.</p>
         * <p>*   **cn-wulanchabu-a**: Ulanqab Zone A.</p>
         * <p>*   **cn-wulanchabu-b**: Ulanqab Zone B.</p>
         * <p>*   **cn-wulanchabu-c**: Ulanqab Zone C.</p>
         * <p>*   **ap-southeast-1a**: Singapore Zone A.</p>
         * <p>*   **ap-southeast-1b**: Singapore Zone B.</p>
         * <p>*   **ap-southeast-1c**: Singapore Zone C.</p>
         * <p>*   **ap-southeast-5a**: Jakarta Zone A.</p>
         * <p>*   **ap-southeast-5b**: Jakarta Zone B.</p>
         * <p>*   **ap-southeast-5c**: Jakarta Zone C.</p>
         * <p>*   **eu-central-1a**: Frankfurt Zone A.</p>
         * <p>*   **eu-central-1b**: Frankfurt Zone B.</p>
         * <p>*   **eu-central-1c**: Frankfurt Zone C.</p>
         * <br>
         * <p>> *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.</p>
         * <p>> *   This parameter is returned only if you use the Chine site (aliyun.com).</p>
         */
        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        /**
         * <p>The kind code of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: physical machine.</p>
         * <p>*   **1**: Elastic Compute Service (ECS) instance.</p>
         * <p>*   **2**: Docker cluster.</p>
         * <p>*   **18**: Kubernetes cluster.</p>
         */
        @NameInMap("KindCode")
        public String kindCode;

        /**
         * <p>The date when the last downgrade operation was performed.</p>
         */
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        /**
         * <p>The lock status of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked due to instance expiration.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked before the instance is rolled back.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked after the storage space is exhausted.</p>
         * <p>*   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The details of the mongos node.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a sharded cluster instance.</p>
         */
        @NameInMap("MongosList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList mongosList;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**: classic network.</p>
         * <p>*   **VPC**: VPC.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of nodes in the instance.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a replica set instance.</p>
         */
        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone 1 of the instance. Valid values:</p>
         * <br>
         * <p>*   **cn-hangzhou-g**: Hangzhou Zone G.</p>
         * <p>*   **cn-hangzhou-h**: Hangzhou Zone H.</p>
         * <p>*   **cn-hangzhou-i**: Hangzhou Zone I.</p>
         * <p>*   **cn-hongkong-b**: Hong Kong Zone B.</p>
         * <p>*   **cn-hongkong-c**: Hong Kong Zone C.</p>
         * <p>*   **cn-hongkong-d**: Hong Kong Zone D.</p>
         * <p>*   **cn-wulanchabu-a**: Ulanqab Zone A.</p>
         * <p>*   **cn-wulanchabu-b**: Ulanqab Zone B.</p>
         * <p>*   **cn-wulanchabu-c**: Ulanqab Zone C.</p>
         * <p>*   **ap-southeast-1a**: Singapore Zone A.</p>
         * <p>*   **ap-southeast-1b**: Singapore Zone B.</p>
         * <p>*   **ap-southeast-1c**: Singapore Zone C.</p>
         * <p>*   **ap-southeast-5a**: Jakarta Zone A.</p>
         * <p>*   **ap-southeast-5b**: Jakarta Zone B.</p>
         * <p>*   **ap-southeast-5c**: Jakarta Zone C.</p>
         * <p>*   **eu-central-1a**: Frankfurt Zone A.</p>
         * <p>*   **eu-central-1b**: Frankfurt Zone B.</p>
         * <p>*   **eu-central-1c**: Frankfurt Zone C.</p>
         * <br>
         * <p>> *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.</p>
         * <p>> *   This parameter is returned only if you use the Chine site (aliyun.com).</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The details of the shard node.</p>
         * <br>
         * <p>>  This parameter is returned if the instance is a sharded cluster instance.</p>
         */
        @NameInMap("ShardList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList shardList;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD).</p>
         * <p>*   **local_ssd**: local SSD.</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The details of the resource tags.</p>
         */
        @NameInMap("Tags")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags tags;

        /**
         * <p>Indicates whether password-free access within a virtual private cloud (VPC) is enabled. Valid values:</p>
         * <br>
         * <p>*   **Open**</p>
         * <p>*   **Close**</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        /**
         * <p>The ID of the zone in which the instance resides.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstance self = new DescribeDBInstancesResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setHiddenZoneId(String hiddenZoneId) {
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }
        public String getHiddenZoneId() {
            return this.hiddenZoneId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setKindCode(String kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public String getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setLastDowngradeTime(String lastDowngradeTime) {
            this.lastDowngradeTime = lastDowngradeTime;
            return this;
        }
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setMongosList(DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList mongosList) {
            this.mongosList = mongosList;
            return this;
        }
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList getMongosList() {
            return this.mongosList;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setReplicationFactor(String replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setShardList(DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList shardList) {
            this.shardList = shardList;
            return this;
        }
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList getShardList() {
            return this.shardList;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setTags(DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags getTags() {
            return this.tags;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setVpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = vpcAuthMode;
            return this;
        }
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstances extends TeaModel {
        @NameInMap("DBInstance")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstance> DBInstance;

        public static DescribeDBInstancesResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstances self = new DescribeDBInstancesResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBInstance(java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstance> DBInstance) {
            this.DBInstance = DBInstance;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesDBInstance> getDBInstance() {
            return this.DBInstance;
        }

    }

}
