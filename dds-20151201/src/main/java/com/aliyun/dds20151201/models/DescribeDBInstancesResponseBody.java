// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("DBInstances")
    public DescribeDBInstancesResponseBodyDBInstances DBInstances;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0E4FE33F-5510-5758-8FA7-A6672CDE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances in the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
         * <p>testmongosnode</p>
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
         * <p>testshardnode</p>
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
         * <p>The storage capacity of the shard node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NodeStorage")
        public Integer nodeStorage;

        /**
         * <p>The number of read-only nodes in the shard node. Valid values: <strong>0</strong> to <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
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
         * <p>The backup retention policy configured for the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: All backup sets of the instance are immediately deleted when the instance is released.</li>
         * <li><strong>1</strong>: A backup set of the instance is automatically backed up and retained for a long period of time when the instance is released.</li>
         * <li><strong>2</strong>: All backup sets of the instance are automatically backed up and retained for a long period of time when the instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackupRetentionPolicy")
        public Integer backupRetentionPolicy;

        /**
         * <p>The I/O throughput consumed by the instance.</p>
         * <blockquote>
         * <p> This parameter is required only when the instance is a serverless instance.</p>
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
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid:</strong> pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-25T02:18:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance type of the instance.</p>
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
         * <p>dds-bp18b0934e70****</p>
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
         * <p>The storage capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The architecture of the instance.</p>
         * <ul>
         * <li><strong>sharding</strong>: sharded cluster instance</li>
         * <li><strong>replicate</strong>: replica set or standalone instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sharding</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The time when the instance data is destroyed. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>For a subscription instance, the computing resources of the instance are released on the 16th day after expiration, and the data of the instance is retained for seven days. The data is deleted on the 23th day after expiration and cannot be restored.</li>
         * <li>For a pay-as-you-go instance, the computing resources of the instance are released on the 16th day after the payment becomes overdue, and the data of the instance is retained for seven days. The data is deleted on the 23th day after the payment becomes overdue and cannot be restored.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-12-10T16:00:00Z</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>7.0</strong></li>
         * <li><strong>6.0</strong></li>
         * <li><strong>5.0</strong></li>
         * <li><strong>4.4</strong></li>
         * <li><strong>4.2</strong></li>
         * <li><strong>4.0</strong></li>
         * <li><strong>3.4</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4.2</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the instance expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-25T16:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The secondary zone 2 of the instance in the multi-zone deployment. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
         * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
         * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
         * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
         * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
         * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
         * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
         * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
         * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
         * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
         * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
         * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
         * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
         * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
         * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
         * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
         * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
         * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is returned only when the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses the multi-zone deployment.</li>
         * <li>This parameter is returned only if you use the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("HiddenZoneId")
        public String hiddenZoneId;

        /**
         * <p>The kind code of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: physical machine</li>
         * <li><strong>1</strong>: Elastic Compute Service (ECS) instance</li>
         * <li><strong>2</strong>: Docker cluster</li>
         * <li><strong>18</strong>: Kubernetes cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KindCode")
        public String kindCode;

        /**
         * <p>The date when the last downgrade operation was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-08</p>
         */
        @NameInMap("LastDowngradeTime")
        public String lastDowngradeTime;

        /**
         * <p>The lock status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The cluster is unlocked.</li>
         * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The instance is automatically locked due to instance expiration.</li>
         * <li><strong>LockByRestoration</strong>: The instance is automatically locked before it is rolled back.</li>
         * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked after the storage space is exhausted.</li>
         * <li><strong>Released</strong>: The instance is released. After an instance is released, the instance cannot be unlocked. You can only restore the backup data of the instance to a new instance. This process requires a long period of time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The details of the mongos node.</p>
         * <blockquote>
         * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
         * </blockquote>
         */
        @NameInMap("MongosList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceMongosList mongosList;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Classic</strong>: classic network</li>
         * <li><strong>VPC</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Classic</p>
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
         * <p>The time when the instance was released.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-17T07:01Z</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The number of nodes in the instance.</p>
         * <blockquote>
         * <p> This parameter is returned if the instance is a replica set instance.</p>
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
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The secondary zone 1 of the instance in the multi-zone deployment. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G</li>
         * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H</li>
         * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I</li>
         * <li><strong>cn-hongkong-b</strong>: Hong Kong Zone B</li>
         * <li><strong>cn-hongkong-c</strong>: Hong Kong Zone C</li>
         * <li><strong>cn-hongkong-d</strong>: Hong Kong Zone D</li>
         * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A</li>
         * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B</li>
         * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C</li>
         * <li><strong>ap-southeast-1a</strong>: Singapore Zone A</li>
         * <li><strong>ap-southeast-1b</strong>: Singapore Zone B</li>
         * <li><strong>ap-southeast-1c</strong>: Singapore Zone C</li>
         * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A</li>
         * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B</li>
         * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C</li>
         * <li><strong>eu-central-1a</strong>: Frankfurt Zone A</li>
         * <li><strong>eu-central-1b</strong>: Frankfurt Zone B</li>
         * <li><strong>eu-central-1c</strong>: Frankfurt Zone C</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is returned only when the instance is a replica set or sharded cluster instance that runs MongoDB 4.4 or 5.0 and uses the multi-zone deployment.</li>
         * <li>This parameter is returned only if you use the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The details of the shard node.</p>
         * <blockquote>
         * <p> This parameter is returned if the instance is a sharded cluster instance.</p>
         * </blockquote>
         */
        @NameInMap("ShardList")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceShardList shardList;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd</strong>: Enterprise SSD (ESSD)</li>
         * <li><strong>local_ssd</strong>: local SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The details of the tag.</p>
         */
        @NameInMap("Tags")
        public DescribeDBInstancesResponseBodyDBInstancesDBInstanceTags tags;

        /**
         * <p>Indicates whether password-free access over virtual private cloud (VPC) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Open</strong>: Password-free access over VPC is enabled.</li>
         * <li><strong>Close</strong>: Password-free access over VPC is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Close</p>
         */
        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyDBInstancesDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesDBInstance self = new DescribeDBInstancesResponseBodyDBInstancesDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setBackupRetentionPolicy(Integer backupRetentionPolicy) {
            this.backupRetentionPolicy = backupRetentionPolicy;
            return this;
        }
        public Integer getBackupRetentionPolicy() {
            return this.backupRetentionPolicy;
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

        public DescribeDBInstancesResponseBodyDBInstancesDBInstance setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
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
