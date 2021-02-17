// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DBInstances")
    public DescribeDBInstancesResponseBodyDBInstances DBInstances;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setDBInstances(DescribeDBInstancesResponseBodyDBInstances DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public DescribeDBInstancesResponseBodyDBInstances getDBInstances() {
        return this.DBInstances;
    }

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosListMongosAttribute extends TeaModel {
        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("NodeDescription")
        public String nodeDescription;

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
        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("NodeDescription")
        public String nodeDescription;

        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        @NameInMap("NodeId")
        public String nodeId;

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

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeStorage(Integer nodeStorage) {
            this.nodeStorage = nodeStorage;
            return this;
        }
        public Integer getNodeStorage() {
            return this.nodeStorage;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardListShardAttribute setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
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

    public static class DescribeDBInstancesResponseBodyDBInstancesDBInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Tags")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags tags;

        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("MongosList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList mongosList;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        @NameInMap("ShardList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList shardList;

        @NameInMap("DestroyTime")
        public String destroyTime;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        @NameInMap("KindCode")
        public String kindCode;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstance self = new DescribeDBInstancesResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
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

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setMongosList(DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList mongosList) {
            this.mongosList = mongosList;
            return this;
        }
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList getMongosList() {
            return this.mongosList;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setLastDowngradeTime(String lastDowngradeTime) {
            this.lastDowngradeTime = lastDowngradeTime;
            return this;
        }
        public String getLastDowngradeTime() {
            return this.lastDowngradeTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setShardList(DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList shardList) {
            this.shardList = shardList;
            return this;
        }
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList getShardList() {
            return this.shardList;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setReplicationFactor(String replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public String getReplicationFactor() {
            return this.replicationFactor;
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setKindCode(String kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public String getKindCode() {
            return this.kindCode;
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
