// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that owns the database instance.</p>
     * <blockquote>
     * <p>Specifying this parameter indicates cross-account data synchronization. You must also specify the <strong>RoleName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150780020300****</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>The database name when the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, or <strong>AnalyticDB PostgreSQL</strong>. The authentication database name when the database type is <strong>MongoDB</strong>.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>AnalyticDB PostgreSQL</strong>, or <strong>MongoDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. If the dry run succeeds, the instance is not modified.</li>
     * <li><strong>false</strong> (default): performs a dry run and then modifies the database instance of the DTS task if the dry run succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the DTS instance.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, you must specify <strong>DtsJobId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtsaw012y2g15q****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The DTS task ID. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, you must specify <strong>DtsInstanceId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>m4312mab158****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The database instance to modify. Valid values:</p>
     * <ul>
     * <li><strong>src</strong>: source instance.</li>
     * <li><strong>dest</strong>: destination instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp10k50h8374w****</p>
     */
    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    /**
     * <p>The type of the database instance. Valid values:</p>
     * <ul>
     * <li><strong>rds</strong>: ApsaraDB RDS for MySQL or ApsaraDB RDS for PostgreSQL.</li>
     * <li><strong>polardb</strong>: PolarDB for MySQL or PolarDB for PostgreSQL.</li>
     * <li><strong>mongodb</strong>: when used as the source, ApsaraDB for MongoDB (replica set architecture). When used as the destination, ApsaraDB for MongoDB (replica set or sharded cluster architecture).</li>
     * <li><strong>distributed_mongodb</strong>: supported only as the source of a distributed instance. Indicates ApsaraDB for MongoDB (sharded cluster architecture).</li>
     * </ul>
     * <blockquote>
     * <p>The incremental node of a distributed instance must obtain data changes from the source through Oplog.</p>
     * </blockquote>
     * <ul>
     * <li><strong>greenplum</strong>: cloud-native data warehouse AnalyticDB for PostgreSQL.</li>
     * <li><strong>kafka</strong>: ApsaraMQ for Kafka.</li>
     * <li><strong>ecs</strong>: a self-managed database hosted on an ECS instance (only supported database types).</li>
     * <li><strong>express</strong>: a database connected over Express Connect (only supported database types).</li>
     * <li><strong>other</strong>: a database connected over the Internet (only supported database types).</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Currently supported database types include <strong>MySQL</strong>, <strong>PolarDB for MySQL</strong>, <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>MongoDB</strong>, <strong>Kafka</strong>, and <strong>AnalyticDB PostgreSQL</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If the database is MongoDB (sharded cluster), the number of shards in the new database must be the same as that in the original MongoDB (sharded cluster).</li>
     * <li>If you want to modify the source instance and the database type is <strong>PostgreSQL</strong>, make sure that the latency of the DTS instance is less than 30 seconds and stop writing data to the source. Otherwise, data inconsistency may occur.</li>
     * <li>The parameter values are case-insensitive.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    /**
     * <p>The IP address of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.168.XX.XXX</p>
     */
    @NameInMap("EndpointIp")
    public String endpointIp;

    /**
     * <p>The port of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("EndpointPort")
    public String endpointPort;

    /**
     * <p>The region to which the database instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointRegionId")
    public String endpointRegionId;

    /**
     * <p>Specifies whether to modify the account and password. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong> (default): no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ModifyAccount")
    public Boolean modifyAccount;

    /**
     * <p>The database password.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region to which the DTS instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the RAM role for cross-account access.</p>
     * <blockquote>
     * <p>This parameter is required when you perform cross-account data synchronization. For the permissions required by this role and how to grant them, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The password of the shard in the MongoDB sharded cluster instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when the source database instance is ApsaraDB for MongoDB (sharded cluster architecture).</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("ShardPassword")
    public String shardPassword;

    /**
     * <p>The account of the shard in the MongoDB sharded cluster instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available and required only when the source database instance is ApsaraDB for MongoDB (sharded cluster architecture).</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shard</p>
     */
    @NameInMap("ShardUsername")
    public String shardUsername;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong> (default): forward.</li>
     * <li><strong>Reverse</strong>: reverse.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The database account.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("Username")
    public String username;

    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static ModifyDtsJobEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobEndpointRequest self = new ModifyDtsJobEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobEndpointRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public ModifyDtsJobEndpointRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ModifyDtsJobEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyDtsJobEndpointRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobEndpointRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public ModifyDtsJobEndpointRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ModifyDtsJobEndpointRequest setEndpointInstanceId(String endpointInstanceId) {
        this.endpointInstanceId = endpointInstanceId;
        return this;
    }
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    public ModifyDtsJobEndpointRequest setEndpointInstanceType(String endpointInstanceType) {
        this.endpointInstanceType = endpointInstanceType;
        return this;
    }
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    public ModifyDtsJobEndpointRequest setEndpointIp(String endpointIp) {
        this.endpointIp = endpointIp;
        return this;
    }
    public String getEndpointIp() {
        return this.endpointIp;
    }

    public ModifyDtsJobEndpointRequest setEndpointPort(String endpointPort) {
        this.endpointPort = endpointPort;
        return this;
    }
    public String getEndpointPort() {
        return this.endpointPort;
    }

    public ModifyDtsJobEndpointRequest setEndpointRegionId(String endpointRegionId) {
        this.endpointRegionId = endpointRegionId;
        return this;
    }
    public String getEndpointRegionId() {
        return this.endpointRegionId;
    }

    public ModifyDtsJobEndpointRequest setModifyAccount(Boolean modifyAccount) {
        this.modifyAccount = modifyAccount;
        return this;
    }
    public Boolean getModifyAccount() {
        return this.modifyAccount;
    }

    public ModifyDtsJobEndpointRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDtsJobEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobEndpointRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDtsJobEndpointRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ModifyDtsJobEndpointRequest setShardPassword(String shardPassword) {
        this.shardPassword = shardPassword;
        return this;
    }
    public String getShardPassword() {
        return this.shardPassword;
    }

    public ModifyDtsJobEndpointRequest setShardUsername(String shardUsername) {
        this.shardUsername = shardUsername;
        return this;
    }
    public String getShardUsername() {
        return this.shardUsername;
    }

    public ModifyDtsJobEndpointRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ModifyDtsJobEndpointRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ModifyDtsJobEndpointRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
