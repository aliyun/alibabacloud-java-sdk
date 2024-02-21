// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewResponseBody extends TeaModel {
    /**
     * <p>The information of instances.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstances> DBInstances;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances in the query results.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeDBInstancesOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesOverviewResponseBody self = new DescribeDBInstancesOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesOverviewResponseBody setDBInstances(java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstances> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstances> getDBInstances() {
        return this.DBInstances;
    }

    public DescribeDBInstancesOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesOverviewResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList extends TeaModel {
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

        public static DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList self = new DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeDBInstancesOverviewResponseBodyDBInstancesShardList extends TeaModel {
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
         * <p>The storage space of the shard node. Unit: GB.</p>
         */
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        /**
         * <p>The number of read-only nodes in the shard node. Valid values: **0** to **5**.</p>
         */
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        public static DescribeDBInstancesOverviewResponseBodyDBInstancesShardList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseBodyDBInstancesShardList self = new DescribeDBInstancesOverviewResponseBodyDBInstancesShardList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesShardList setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesShardList setNodeDescription(String nodeDescription) {
            this.nodeDescription = nodeDescription;
            return this;
        }
        public String getNodeDescription() {
            return this.nodeDescription;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesShardList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesShardList setNodeStorage(Integer nodeStorage) {
            this.nodeStorage = nodeStorage;
            return this;
        }
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesShardList setReadonlyReplicas(Integer readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

    }

    public static class DescribeDBInstancesOverviewResponseBodyDBInstancesTags extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: **1** to **20**.</p>
         * <br>
         * <p>*   The key cannot start with `aliyun`, `acs:`, `http://`, or `https://`.</p>
         * <p>*   It can be up to 64 characters in length.</p>
         * <p>*   It cannot be an empty string.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: **1** to **20**.</p>
         * <br>
         * <p>*   The value cannot start with `aliyun`, `acs:`, `http://`, or `https://`.</p>
         * <p>*   The value can be up to 128 characters in length.</p>
         * <p>*   The value can be an empty string.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesOverviewResponseBodyDBInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseBodyDBInstancesTags self = new DescribeDBInstancesOverviewResponseBodyDBInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesOverviewResponseBodyDBInstances extends TeaModel {
        /**
         * <p>The read and write throughput consumed by the instance.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   This parameter is returned when the instance is a serverless instance.</p>
         * <br>
         * <p>*   Serverless instances are available only in the China site (aliyun.com).</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance type. The instance type varies based on the instance architecture. For more information about instance types supported by different instance architectures, see the following references:</p>
         * <br>
         * <p>*   [Standalone instance types](~~311407~~)</p>
         * <p>*   [Replica set instance types](~~311410~~)</p>
         * <p>*   [Sharded cluster instance types](~~311414~~)</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The state of the instance. For more information about valid values, see [Instance states](~~63870~~).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage space of the instance. Unit: GB.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **sharding**: sharded cluster instance</p>
         * <p>*   **replicate**: replica set or standalone instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The time when the instance data was destroyed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The database engine of the instance. Set the value to **MongoDB**.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The kind code of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: physical machine</p>
         * <p>*   **1**: Elastic Compute Service (ECS) instance</p>
         * <p>*   **2**: Docker cluster</p>
         * <p>*   **18**: Kubernetes cluster</p>
         */
        @NameInMap("KindCode")
        public String kindCode;

        /**
         * <p>The date when the last downgrade operation was performed.</p>
         */
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        /**
         * <p>Indicates whether the instance is locked. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked due to instance expiration.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked before it is rolled back.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked after the storage space is exhausted.</p>
         * <p>*   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The details of the mongos nodes.</p>
         * <br>
         * <p>>  This parameter is returned when the instance is a sharded cluster instance.</p>
         */
        @NameInMap("MongosList")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList> mongosList;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**</p>
         * <p>*   **VPC**</p>
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
         * <p>>  This parameter is returned when the instance is a replica set instance.</p>
         */
        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The details of the shard nodes.</p>
         * <br>
         * <p>>  This parameter is returned when the instance is a sharded cluster instance.</p>
         */
        @NameInMap("ShardList")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesShardList> shardList;

        /**
         * <p>The tags to add to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesTags> tags;

        /**
         * <p>Indicates whether password-free access over VPC is enabled. Valid values:</p>
         * <br>
         * <p>*   **Open**: Password-free access over VPC is enabled.</p>
         * <p>*   **Close**: Password-free access over VPC is disabled.</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesOverviewResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesOverviewResponseBodyDBInstances self = new DescribeDBInstancesOverviewResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setCapacityUnit(String capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setKindCode(String kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public String getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setLastDowngradeTime(String lastDowngradeTime) {
            this.lastDowngradeTime = lastDowngradeTime;
            return this;
        }
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setMongosList(java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList> mongosList) {
            this.mongosList = mongosList;
            return this;
        }
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList> getMongosList() {
            return this.mongosList;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setReplicationFactor(String replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setShardList(java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesShardList> shardList) {
            this.shardList = shardList;
            return this;
        }
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesShardList> getShardList() {
            return this.shardList;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setTags(java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setVpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = vpcAuthMode;
            return this;
        }
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        public DescribeDBInstancesOverviewResponseBodyDBInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
