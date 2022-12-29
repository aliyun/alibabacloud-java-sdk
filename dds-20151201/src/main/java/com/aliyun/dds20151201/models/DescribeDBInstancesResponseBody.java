// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    // Details of the instances.
    @NameInMap("DBInstances")
    public DescribeDBInstancesResponseBodyDBInstances DBInstances;

    // The number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The number of instances in the query results.
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
        // The type of the mongos node.
        @NameInMap("NodeClass")
        public String nodeClass;

        // The description of the mongos node.
        @NameInMap("NodeDescription")
        public String nodeDescription;

        // The ID of the mongos node.
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
        // The type of the shard node.
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
        // The tag key of the resource.
        @NameInMap("Key")
        public String key;

        // The tag value of the resource.
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
        // The I/O throughput consumed by the instance.
        // 
        // >  This parameter is returned when the instance is a serverless instance.
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

        // The instance type.
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        // The description of the instance.
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        // The ID of the instance.
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        // The state of the instance. For more information, see [Instance states](~~63870~~).
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        // The storage capacity of the instance.
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        // The architecture of the instance.
        // 
        // *   **sharding**: sharded cluster instance
        // *   **replicate**: replica set or standalone instance
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        // The time when the instance data was destroyed. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.  
        // 
        // > - Subscription instances are released 15 days after expiration. After an instance is released, its data is deleted and cannot be restored.
        // > - Pay-as-you-go instances are locked after the payments have been overdue for longer than 24 hours. The instances are released after the payments have been overdue for longer than 15 days. The data of released instances is deleted and cannot be restored.
        @NameInMap("DestroyTime")
        public String destroyTime;

        // The database engine of the instance.
        @NameInMap("Engine")
        public String engine;

        // The database engine version of the instance. Valid values:
        // 
        // *   **5.0**
        // *   **4.4**
        // *   **4.2**
        // *   **4.0**
        // *   **3.4**
        @NameInMap("EngineVersion")
        public String engineVersion;

        // The time when the instance expires. The time is in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
        @NameInMap("ExpireTime")
        public String expireTime;

        // The ID of the secondary zone 2 of the instance. Valid values:
        // 
        // *   **cn-hangzhou-g**: Hangzhou Zone G
        // *   **cn-hangzhou-h**: Hangzhou Zone H
        // *   **cn-hangzhou-i**: Hangzhou Zone I
        // *   **cn-hongkong-b**: Hongkong Zone B
        // *   **cn-hongkong-c**: Hongkong Zone C
        // *   **cn-hongkong-d**: Hongkong Zone D
        // *   **cn-wulanchabu-a**: Ulanqab Zone A
        // *   **cn-wulanchabu-b**: Ulanqab Zone B
        // *   **cn-wulanchabu-c**: Ulanqab Zone C
        // *   **ap-southeast-1a**: Singapore Zone A
        // *   **ap-southeast-1b**: Singapore Zone B
        // *   **ap-southeast-1c**: Singapore Zone C
        // *   **ap-southeast-5a**: Jakarta Zone A
        // *   **ap-southeast-5b**: Jakarta Zone B
        // *   **ap-southeast-5c**: Jakarta Zone C
        // *   **eu-central-1a**: Frankfurt Zone A
        // *   **eu-central-1b**: Frankfurt Zone B
        // *   **eu-central-1c**: Frankfurt Zone C
        // 
        // > 
        // 
        // *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.
        // *   This parameter is returned only if you use the Chine site (aliyun.com).
        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        // The kind code of the instance. Valid values:
        // 
        // *   **0**: physical machine
        // *   **1**: Elastic Compute Service (ECS) instance
        // *   **2**: Docker cluster
        // *   **18**: Kubernetes cluster
        @NameInMap("KindCode")
        public String kindCode;

        // The date when the last downgrade operation was performed.
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        // The lock state of the instance. Valid values:
        // 
        // *   **Unlock**: The cluster is not locked.
        // *   **ManualLock**: The instance is manually locked.
        // *   **LockByExpiration**: The instance is automatically locked due to instance expiration.
        // *   **LockByRestoration**: The instance is automatically locked before it is rolled back.
        // *   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage capacity.
        // *   **Released**: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.
        @NameInMap("LockMode")
        public String lockMode;

        // Details of the mongos nodes.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("MongosList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList mongosList;

        // The network type of the instance. Valid values:
        // 
        // *   **Classic**: classic network
        // *   **VPC**: VPC
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

        // The ID of the secondary zone 1 of the instance. Valid values:
        // 
        // *   **cn-hangzhou-g**: Hangzhou Zone G
        // *   **cn-hangzhou-h**: Hangzhou Zone H
        // *   **cn-hangzhou-i**: Hangzhou Zone I
        // *   **cn-hongkong-b**: Hongkong Zone B
        // *   **cn-hongkong-c**: Hongkong Zone C
        // *   **cn-hongkong-d**: Hongkong Zone D
        // *   **cn-wulanchabu-a**: Ulanqab Zone A
        // *   **cn-wulanchabu-b**: Ulanqab Zone B
        // *   **cn-wulanchabu-c**: Ulanqab Zone C
        // *   **ap-southeast-1a**: Singapore Zone A
        // *   **ap-southeast-1b**: Singapore Zone B
        // *   **ap-southeast-1c**: Singapore Zone C
        // *   **ap-southeast-5a**: Jakarta Zone A
        // *   **ap-southeast-5b**: Jakarta Zone B
        // *   **ap-southeast-5c**: Jakarta Zone C
        // *   **eu-central-1a**: Frankfurt Zone A
        // *   **eu-central-1b**: Frankfurt Zone B
        // *   **eu-central-1c**: Frankfurt Zone C
        // 
        // > 
        // 
        // *   This parameter is returned if the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses multi-zone deployment.
        // *   This parameter is returned only if you use the Chine site (aliyun.com).
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        // Details of the shard nodes.
        // 
        // >  This parameter is returned if the instance is a sharded cluster instance.
        @NameInMap("ShardList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList shardList;

        // The storage type of the instance. Valid values:
        // 
        // *   **cloud_essd**: enhanced SSD (ESSD)
        // *   **local_ssd**: local SSD
        @NameInMap("StorageType")
        public String storageType;

        // Details of the resource tags.
        @NameInMap("Tags")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags tags;

        // Indicates whether password-free access within a VPC is enabled. Valid values:
        // 
        // - **Open**: Password-free access is enabled.
        // - **Close**: Password-free access is disabled.
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        // The zone ID of the instance.
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
