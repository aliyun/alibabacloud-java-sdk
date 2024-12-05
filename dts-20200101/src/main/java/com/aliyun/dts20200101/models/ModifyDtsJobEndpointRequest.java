// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account (primary account) to which the database instance belongs.</p>
     * <blockquote>
     * <p> Passing this parameter indicates that cross-Alibaba Cloud account data synchronization will be performed, and you also need to pass the <strong>RoleName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150780020300****</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>When the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, or <strong>AnalyticDB PostgreSQL</strong>, it represents the database name; when the database type is <strong>MongoDB</strong>, it represents the authentication database name.</p>
     * <blockquote>
     * <p>This parameter is only available and must be provided when the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>AnalyticDB PostgreSQL</strong>, or <strong>MongoDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>Specifies whether to perform only a precheck. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes. After the precheck is passed, the database is not changed.</li>
     * <li><strong>false</strong> (default): No. After the precheck is passed, the system changes the original database of the DTS task and runs the task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the DTS instance. If this parameter is not provided, <strong>DtsJobId</strong> must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsaw012y2g15q****</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>DTS job ID, which can be queried by calling <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a>.</p>
     * <blockquote>
     * <p>If this parameter is not provided, <strong>DtsInstanceId</strong> must be filled in.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>m4312mab158****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The database instance to be modified, with values:</p>
     * <ul>
     * <li><strong>src</strong>: Source database instance. - <strong>dest</strong>: Target database instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>ID of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp10k50h8374w****</p>
     */
    @NameInMap("EndpointInstanceId")
    public String endpointInstanceId;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><strong>rds</strong>: ApsaraDB RDS for MySQL instance, ApsaraDB RDS for SQL Server instance, or ApsaraDB RDS for PostgreSQL instance.</li>
     * <li><strong>polardb</strong>: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster.</li>
     * <li><strong>mongodb</strong>: ApsaraDB for MongoDB replica set instance.</li>
     * <li><strong>distributed_mongodb</strong>: ApsaraDB for MongoDB sharded cluster instance.</li>
     * <li><strong>greenplum</strong>: AnalyticDB for PostgreSQL instance.</li>
     * <li><strong>kafka</strong>: ApsaraMQ for Kafka instance.</li>
     * <li><strong>ecs</strong>: self-managed database that is hosted on an Elastic Compute Service (ECS) instance. If you set this parameter to ecs, the database must be the supported one.</li>
     * <li><strong>express</strong>: database that is connected over Express Connect. If you set this parameter to express, the database must be the supported one.</li>
     * <li><strong>other</strong>: database that is connected over Internet. If you set this parameter to other, the database must be the supported one.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The following types of databases are supported: <strong>MySQL</strong>, <strong>PolarDB for MySQL</strong>, <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>MongoDB</strong>, <strong>SQL Server</strong>, <strong>Kafka</strong>, and <strong>AnalyticDB for PostgreSQL</strong>.</p>
     * </li>
     * <li><p>If the original database is an ApsaraDB for MongoDB sharded cluster instance, the new database must have the same number of shards as the original database.</p>
     * </li>
     * <li><p>If the database that you want to change is a source <strong>PostgreSQL</strong> database, you must make sure that the latency of the DTS instance is less than 30 seconds and no data is written to the source database during the change. Otherwise, data inconsistency may occur.</p>
     * </li>
     * <li><p>The value of this parameter is case-insensitive.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("EndpointInstanceType")
    public String endpointInstanceType;

    /**
     * <p>The IP of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.168.XX.XXX</p>
     */
    @NameInMap("EndpointIp")
    public String endpointIp;

    /**
     * <p>port of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("EndpointPort")
    public String endpointPort;

    /**
     * <p>The ID of the region in which the database resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndpointRegionId")
    public String endpointRegionId;

    /**
     * <p>Specifies whether to change the password of the database account. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ModifyAccount")
    public Boolean modifyAccount;

    /**
     * <p>The password of the database account.</p>
     * <blockquote>
     * <p> This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the region in which the DTS instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Cross Alibaba Cloud account role name. When performing data synchronization across Alibaba Cloud accounts, this parameter must be passed. For the required permissions and authorization methods for this role, please refer to <a href="https://help.aliyun.com/document_detail/48468.html">How to Configure RAM Authorization for Cross-Account Data Migration or Synchronization</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ram-for-dts</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>The account password of the shard of the ApsaraDB for MongoDB sharded cluster instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is valid and required only if the source database is an ApsaraDB for MongoDB sharded cluster instance.</p>
     * </li>
     * <li><p>This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DTStest****</p>
     */
    @NameInMap("ShardPassword")
    public String shardPassword;

    /**
     * <p>The account username of the shard of the ApsaraDB for MongoDB sharded cluster instance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is valid and required only if the source database is an ApsaraDB for MongoDB sharded cluster instance.</p>
     * </li>
     * <li><p>This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shard</p>
     */
    @NameInMap("ShardUsername")
    public String shardUsername;

    /**
     * <p>Synchronization direction, with values:</p>
     * <ul>
     * <li><strong>Forward</strong> (default): Forward. - <strong>Reverse</strong>: Reverse.</li>
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
     * <p> This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dtstest</p>
     */
    @NameInMap("Username")
    public String username;

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

}
