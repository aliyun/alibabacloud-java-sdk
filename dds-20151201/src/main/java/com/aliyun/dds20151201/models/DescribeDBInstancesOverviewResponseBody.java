// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewResponseBody extends TeaModel {
    /**
     * <p>A list of instance details.</p>
     */
    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstances> DBInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52820D2B-B2DD-59F0-BDF2-83EC19C6F1CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>dds.mongos.standard</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The description of the mongos node.</p>
         * 
         * <strong>example:</strong>
         * <p>Test mongos node</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the mongos node.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp10e3b0d02f****</p>
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
         * 
         * <strong>example:</strong>
         * <p>dds.shard.mid</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <p>The description of the shard node.</p>
         * 
         * <strong>example:</strong>
         * <p>Test shard node</p>
         */
        @NameInMap("NodeDescription")
        public String nodeDescription;

        /**
         * <p>The ID of the shard node.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1cac6f2083****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The storage capacity of the shard node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        /**
         * <p>The number of read-only nodes in the shard. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The tag key.</p>
         * <ul>
         * <li><p>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </li>
         * <li><p>The key can be up to 64 characters in length.</p>
         * </li>
         * <li><p>The key cannot be an empty string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testdatabase</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <ul>
         * <li><p>The value cannot start with <code>aliyun</code>, <code>acs</code>:, <code>http://</code>, or <code>https://</code>.</p>
         * </li>
         * <li><p>The value can be up to 128 characters in length.</p>
         * </li>
         * <li><p>The value can be an empty string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
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
         * <p>The read/write throughput of the instance.</p>
         * <blockquote>
         * <ul>
         * <li><p>This parameter is returned only for Serverless instances.</p>
         * </li>
         * <li><p>Serverless instances are available only on the China site (aliyun.com).</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CapacityUnit")
        public String capacityUnit;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PrePaid</strong>: subscription</p>
         * </li>
         * <li><p><strong>PostPaid</strong>: pay-as-you-go</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the instance was created. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-05T03:18:53Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance type. For more information about the instance types available for different instance architectures, see:</p>
         * <ul>
         * <li><p><a href="https://help.aliyun.com/document_detail/311407.html">Standalone instance types</a></p>
         * </li>
         * <li><p><a href="https://help.aliyun.com/document_detail/311410.html">Replica set instance types</a></p>
         * </li>
         * <li><p><a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a></p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is not required for Serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dds.mongo.mid</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test database</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp12c5b040dc****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/63870.html">Instance states</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage capacity of the instance, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The instance architecture. Valid values:</p>
         * <ul>
         * <li><p><strong>sharding</strong>: sharded cluster instance</p>
         * </li>
         * <li><p><strong>replicate</strong>: replica set or standalone instance</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>serverless</strong>: Serverless instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replicate</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The time when the data of the instance was destroyed. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T16:00:00Z</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The database engine. The value is <strong>MongoDB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4.2</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time of the subscription instance. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-05T16:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: physical server</p>
         * </li>
         * <li><p><strong>1</strong>: ECS</p>
         * </li>
         * <li><p><strong>2</strong>: DOCKER</p>
         * </li>
         * <li><p><strong>18</strong>: instance on the new Kubernetes-based architecture</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KindCode")
        public String kindCode;

        /**
         * <p>The time when the instance was last downgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-08</p>
         */
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        /**
         * <p>The lock mode of the instance.</p>
         * <ul>
         * <li><p><strong>Unlock</strong>: The instance is not locked.</p>
         * </li>
         * <li><p><strong>ManualLock</strong>: The instance is manually locked.</p>
         * </li>
         * <li><p><strong>LockByExpiration</strong>: The instance is automatically locked after it expires.</p>
         * </li>
         * <li><p><strong>LockByRestoration</strong>: The instance is automatically locked before a rollback.</p>
         * </li>
         * <li><p><strong>LockByDiskQuota</strong>: The instance is automatically locked after its storage space is exhausted.</p>
         * </li>
         * <li><p><strong>Released</strong>: The instance is released. You cannot unlock a released instance. You can only restore the data of the instance to a new instance. The restoration may take a long time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The details of the mongos nodes.</p>
         * <blockquote>
         * <p>This parameter is returned only for sharded cluster instances.</p>
         * </blockquote>
         */
        @NameInMap("MongosList")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesMongosList> mongosList;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Classic</strong>: classic network</p>
         * </li>
         * <li><p><strong>VPC</strong>: virtual private cloud (VPC)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of nodes in the instance.</p>
         * <blockquote>
         * <p>This parameter is returned only for replica set instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReplicationFactor")
        public String replicationFactor;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm22cdcgc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The details of the shard nodes.</p>
         * <blockquote>
         * <p>This parameter is returned only for sharded cluster instances.</p>
         * </blockquote>
         */
        @NameInMap("ShardList")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesShardList> shardList;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDBInstancesOverviewResponseBodyDBInstancesTags> tags;

        /**
         * <p>Indicates whether password-free access over a VPC is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>Open</strong>: enabled</p>
         * </li>
         * <li><p><strong>Close</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        /**
         * <p>The zone of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
