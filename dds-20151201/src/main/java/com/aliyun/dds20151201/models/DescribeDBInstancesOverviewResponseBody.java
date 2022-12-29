// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewResponseBody extends TeaModel {
    // Details about the instances.
    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstances> DBInstances;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The number of instances in the query result.
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
        // The type of the mongos node.
        @NameInMap("NodeClass")
        public String nodeClass;

        // The description of the mongos node.
        @NameInMap("NodeDescription")
        public String nodeDescription;

        // The ID of the mongos node.
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
        // The instance type of the shard node.
        @NameInMap("NodeClass")
        public String nodeClass;

        // The description of the shard node.
        @NameInMap("NodeDescription")
        public String nodeDescription;

        // The ID of the shard node.
        @NameInMap("NodeId")
        public String nodeId;

        // The storage capacity of the shard node. Unit: GB.
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        // The number of read-only nodes in the shard node. Valid values: **0** to **5**.
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
        // The key of tag N of the instance. Valid values of N: **1** to **20**.
        // 
        // *   The key cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
        // *   The key can be up to 64 characters in length.
        // *   The key cannot be an empty string.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the instance. Valid values of N: **1** to **20**.
        // 
        // *   The value cannot start with `aliyun`, `acs:`, `http://`, or `https://`.
        // *   The value can be up to 128 characters in length.
        // *   The value can be an empty string.
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
        // The I/O throughput consumed by the instance.
        // 
        // > * This parameter is returned when the instance is a serverless instance.
        // > * Serverless instances are available only in the China site (aliyun.com).
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        // The billing method of the instance. Valid values:
        // 
        // *   **PrePaid**: subscription
        // *   **PostPaid**: pay-as-you-go
        @NameInMap("ChargeType")
        public String chargeType;

        // The time when the instance was created. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The instance type of the instance. The instance type varies based on the instance architecture. For more information about instance types supported by different instance architectures, see the following topics:
        // 
        // *   [Standalone instance types](~~311407~~)
        // *   [Replica set instance types](~~311410~~)
        // *   [Sharded cluster instance types](~~311414~~)
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        // The description of the instance.
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        // The ID of the instance.
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        // The state of the instance. For more information about valid values, see [Instance states](~~63870~~).
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        // The storage capacity of the instance.
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        // The category of the instance. Valid values:
        // 
        // *   **sharding**: sharded cluster instance
        // *   **replicate**: replica set or standalone instance
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        // The time when the instance data was destroyed. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("DestroyTime")
        public String destroyTime;

        // The database engine of the instance. Set the value to **MongoDB**.
        @NameInMap("Engine")
        public String engine;

        // The database engine version of the instance.
        @NameInMap("EngineVersion")
        public String engineVersion;

        // The time when the instance expires. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
        @NameInMap("ExpireTime")
        public String expireTime;

        // The kind code of the instance. Valid values:
        // 
        // *   **0**: physical machine
        // *   **1**: Elastic Compute Service (ECS) instance
        // *   **2**: Docker cluster
        // *   **18**: Kubernetes cluster
        @NameInMap("KindCode")
        public String kindCode;

        // The last time when the instance was downgraded.
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        // Indicates whether the instance is locked. Valid values:
        // 
        // *   **Unlock**: The instance is not locked.
        // *   **ManualLock**: The cluster is manually locked.
        // *   **LockByExpiration**: The instance is automatically locked after it expires.
        // *   **LockByRestoration**: The instance is automatically locked before it is rolled back.
        // *   **LockByDiskQuota**: The instance is automatically locked after the storage capacity is exhausted.
        // *   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires an extended period of time.
        @NameInMap("LockMode")
        public String lockMode;

        // Details about the mongos node.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("MongosList")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList> mongosList;

        // The network type of the instance. Valid values:
        // 
        // *   **Classic**
        // *   **VPC**
        @NameInMap("NetworkType")
        public String networkType;

        // The region ID of the instance.
        @NameInMap("RegionId")
        public String regionId;

        // The number of nodes in the instance.
        // 
        // >  This parameter is returned if the instance is a replica set instance.
        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Details about the shard node.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("ShardList")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesShardList> shardList;

        // The tags of the instance.
        @NameInMap("Tags")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesTags> tags;

        // Indicates whether password-free access within a VPC is enabled. Valid values:
        // 
        // *   **Open**: Password-free access is enabled.
        // *   **Close**: Password-free access is disabled.
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        // The zone ID of the instance.
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
