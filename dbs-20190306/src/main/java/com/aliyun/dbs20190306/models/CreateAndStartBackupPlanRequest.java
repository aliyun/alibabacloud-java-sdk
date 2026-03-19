// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateAndStartBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup gateway.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>agent</strong>.</p>
     * </li>
     * <li><p>For more information about how to create a backup gateway, see <a href="https://help.aliyun.com/document_detail/93250.html">Add a backup gateway</a>.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/2869840.html">DescribeBackupGatewayList</a> operation to view the list of existing backup gateways.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23313123312</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The interval for incremental backups, in seconds.</p>
     * <blockquote>
     * <p>This parameter is required only for <strong>physical backups</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The backup method. Valid values:</p>
     * <ul>
     * <li><p><strong>logical</strong>: logical backup</p>
     * </li>
     * <li><p><strong>physical</strong>: physical backup</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The backup objects.</p>
     * 
     * <strong>example:</strong>
     * <p>[     {         &quot;DBName&quot;:&quot;待备份库名&quot;,         &quot;SchemaName&quot;:&quot;待备份 Schema 名&quot;,         &quot;TableIncludes&quot;:[{             &quot;TableName&quot;:&quot;待备份表表名&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;待备份库名不需要备份表的表名&quot;         }]     } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The full backup cycle. Valid values:</p>
     * <ul>
     * <li><p><strong>Monday</strong></p>
     * </li>
     * <li><p><strong>Tuesday</strong></p>
     * </li>
     * <li><p><strong>Wednesday</strong></p>
     * </li>
     * <li><p><strong>Thursday</strong></p>
     * </li>
     * <li><p><strong>Friday</strong></p>
     * </li>
     * <li><p><strong>Saturday</strong></p>
     * </li>
     * <li><p><strong>Sunday</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can select multiple values. Separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The ID of the backup plan.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The custom name of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>The network bandwidth throttling limit, in KB/s. The maximum allowed value is 10 GB.</p>
     * <blockquote>
     * <p>This parameter is valid only for MySQL physical backups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupRateLimit")
    public Long backupRateLimit;

    /**
     * <p>The retention period for backup data, in days. Valid values: 0 to 1825. Default value: 730.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>The disk I/O limit, in KB/s.</p>
     * <blockquote>
     * <p>This parameter is valid only for MySQL physical backups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    /**
     * <p>The start time for the full backup. The time is in the <em>HH:mm</em> format and is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>14:22</p>
     */
    @NameInMap("BackupStartTime")
    public String backupStartTime;

    /**
     * <p>The built-in storage type:</p>
     * <ul>
     * <li><p>Empty (default): Backup data is stored in your OSS bucket.</p>
     * </li>
     * <li><p>system: Backup data is stored in the built-in OSS bucket of DBS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("BackupStorageType")
    public String backupStorageType;

    /**
     * <p>The full backup strategy. Valid values:</p>
     * <ul>
     * <li><p><strong>simple</strong>: periodic backup. Use this value with BackupPeriod and BackupStartTime.</p>
     * </li>
     * <li><p><strong>manual</strong>: manual backup.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>simple</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("BackupStrategyType")
    public String backupStrategyType;

    /**
     * <p>A client token used to ensure the idempotence of the request. This prevents duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDASDASDSADASFCZXVZ</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The UID of the Alibaba Cloud account for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>1648821913******</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The name of the RAM role for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <p>The region where the database is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DatabaseRegion")
    public String databaseRegion;

    /**
     * <p>The database type. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>MSSQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * <li><p><strong>MariaDB</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>DRDS</strong></p>
     * </li>
     * <li><p><strong>MongoDB</strong></p>
     * </li>
     * <li><p><strong>Redis</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The time after which backup data is converted to archive storage, in days. Default value: 365.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    /**
     * <p>The time after which backup data is converted to Infrequent Access (IA) storage, in days. Default value: 180.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    /**
     * <p>Specifies whether to enable incremental log backup. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBackupLog")
    public Boolean enableBackupLog;

    /**
     * <p>The source of the request. The default value is OpenApi. You do not need to set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenApi</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The specification of the backup plan. Valid values:</p>
     * <ul>
     * <li><p><strong>micro</strong></p>
     * </li>
     * <li><p><strong>small</strong></p>
     * </li>
     * <li><p><strong>medium</strong></p>
     * </li>
     * <li><p><strong>large</strong></p>
     * </li>
     * <li><p><strong>xlarge</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Higher specifications provide better backup and recovery performance. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Specifications</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>micro</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The database instance type. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>PolarDB</strong></p>
     * </li>
     * <li><p><strong>DDS</strong>: Alibaba Cloud MongoDB</p>
     * </li>
     * <li><p><strong>Kvstore</strong>: Alibaba Cloud Redis</p>
     * </li>
     * <li><p><strong>Other</strong>: A database connected over an IP address and port.</p>
     * </li>
     * <li><p><strong>dg</strong>: A self-managed database without a public IP address or port, connected through Database Gateway (DG).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket.
     * Default: The system automatically generates a new name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestOssBucket</p>
     */
    @NameInMap("OSSBucketName")
    public String OSSBucketName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The payment method. Valid value:</p>
     * <p><strong>prepay</strong>: subscription</p>
     * 
     * <strong>example:</strong>
     * <p>prepay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Year</strong></p>
     * </li>
     * <li><p><strong>Month</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region where DBS is available. To view the available regions, call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzecovzti****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The database name.</p>
     * <blockquote>
     * <p>This parameter is required if the database type is <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The database endpoint.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, or <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The ID of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the database. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>ECS</strong></p>
     * </li>
     * <li><p><strong>Express</strong>: A database connected through a leased line, VPN Gateway, or Smart Access Gateway.</p>
     * </li>
     * <li><p><strong>Agent</strong>: A database connected through a backup gateway.</p>
     * </li>
     * <li><p><strong>DDS</strong>: Alibaba Cloud MongoDB</p>
     * </li>
     * <li><p><strong>Other</strong>: A database connected directly over an IP address and port.</p>
     * </li>
     * <li><p><strong>dg</strong>: A self-managed database without a public IP address or port, connected through Database Gateway (DG).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The Oracle system ID (SID). This parameter is required if the database type is Oracle.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password for the database account.</p>
     * <blockquote>
     * <p>This parameter is optional if the database type is <strong>Redis</strong>, or if the database location is <strong>agent</strong> and the database type is <strong>MSSQL</strong>. In all other cases, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The database port.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, <strong>other</strong>, or <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region where the database is located.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, <strong>Express</strong>, or <strong>Agent</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The database account.</p>
     * <blockquote>
     * <p>This parameter is optional if the database type is <strong>Redis</strong>, or if the database location is <strong>agent</strong> and the database type is <strong>MSSQL</strong>. In all other cases, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <p>The storage region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("StorageRegion")
    public String storageRegion;

    /**
     * <p>This parameter is not yet available.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li><p>If <strong>Period</strong> is set to <strong>Year</strong>, the value of <strong>UsedTime</strong> can be 1 to 5.</p>
     * </li>
     * <li><p>If <strong>Period</strong> is set to <strong>Month</strong>, the value of <strong>UsedTime</strong> can be 1 to 11.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static CreateAndStartBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndStartBackupPlanRequest self = new CreateAndStartBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndStartBackupPlanRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public CreateAndStartBackupPlanRequest setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
        this.backupLogIntervalSeconds = backupLogIntervalSeconds;
        return this;
    }
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    public CreateAndStartBackupPlanRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public CreateAndStartBackupPlanRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public CreateAndStartBackupPlanRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public CreateAndStartBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public CreateAndStartBackupPlanRequest setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    public CreateAndStartBackupPlanRequest setBackupRateLimit(Long backupRateLimit) {
        this.backupRateLimit = backupRateLimit;
        return this;
    }
    public Long getBackupRateLimit() {
        return this.backupRateLimit;
    }

    public CreateAndStartBackupPlanRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public CreateAndStartBackupPlanRequest setBackupSpeedLimit(Long backupSpeedLimit) {
        this.backupSpeedLimit = backupSpeedLimit;
        return this;
    }
    public Long getBackupSpeedLimit() {
        return this.backupSpeedLimit;
    }

    public CreateAndStartBackupPlanRequest setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public CreateAndStartBackupPlanRequest setBackupStorageType(String backupStorageType) {
        this.backupStorageType = backupStorageType;
        return this;
    }
    public String getBackupStorageType() {
        return this.backupStorageType;
    }

    public CreateAndStartBackupPlanRequest setBackupStrategyType(String backupStrategyType) {
        this.backupStrategyType = backupStrategyType;
        return this;
    }
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    public CreateAndStartBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAndStartBackupPlanRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public CreateAndStartBackupPlanRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public CreateAndStartBackupPlanRequest setDatabaseRegion(String databaseRegion) {
        this.databaseRegion = databaseRegion;
        return this;
    }
    public String getDatabaseRegion() {
        return this.databaseRegion;
    }

    public CreateAndStartBackupPlanRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateAndStartBackupPlanRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public CreateAndStartBackupPlanRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public CreateAndStartBackupPlanRequest setEnableBackupLog(Boolean enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Boolean getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public CreateAndStartBackupPlanRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateAndStartBackupPlanRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateAndStartBackupPlanRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateAndStartBackupPlanRequest setOSSBucketName(String OSSBucketName) {
        this.OSSBucketName = OSSBucketName;
        return this;
    }
    public String getOSSBucketName() {
        return this.OSSBucketName;
    }

    public CreateAndStartBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateAndStartBackupPlanRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateAndStartBackupPlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateAndStartBackupPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAndStartBackupPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public CreateAndStartBackupPlanRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public CreateAndStartBackupPlanRequest setStorageRegion(String storageRegion) {
        this.storageRegion = storageRegion;
        return this;
    }
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public CreateAndStartBackupPlanRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateAndStartBackupPlanRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
