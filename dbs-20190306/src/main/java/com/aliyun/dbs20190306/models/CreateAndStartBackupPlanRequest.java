// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateAndStartBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup gateway ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If <strong>SourceEndpointInstanceType</strong> is set to <strong>Agent</strong>, this parameter is required.****</p>
     * </li>
     * <li><p>For more information about how to install a backup gateway, see <a href="https://help.aliyun.com/document_detail/93250.html">Install a backup gateway</a>.</p>
     * </li>
     * <li><p>You can query a list of existing backup gateways by calling the <a href="https://help.aliyun.com/document_detail/2869840.html">DescribeBackupGatewayList</a> operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>23313123312</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The interval at which you want to perform incremental log backups. Unit: seconds.</p>
     * <blockquote>
     * <p> This parameter is required only if you set BackupMethod to <strong>physical</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The method that is used to generate the backup file. Valid values:</p>
     * <ul>
     * <li><strong>logical</strong>: logical backup</li>
     * <li><strong>physical</strong>: physical backup</li>
     * <li><strong>duplication</strong>: dump backup</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The object to be backed up.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;DBName&quot;:&quot;Name of the database to be backed up&quot;, &quot;SchemaName&quot;:&quot;Name of the schema to be backed up&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table to be backed up&quot; }], &quot;TableExcludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table that you do not want to back up&quot; }] } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The day of the week on which you want to perform full backup. Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * <blockquote>
     * <p> You can specify multiple values. Separate multiple values with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The ID of the backup schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The name of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>The network bandwidth throttling. Unit: KB/s. DBS allows a maximum bandwidth of 10 GB/s.</p>
     * <blockquote>
     * <p> This parameter takes effect only when physical backups for MySQL databases are performed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupRateLimit")
    public Long backupRateLimit;

    /**
     * <p>The number of days for which the backup data is retained. Valid values: 0 to 1825. Default value: 730.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>The I/O limit for the disk. Unit: KB/s.</p>
     * <blockquote>
     * <p> This parameter takes effect only when physical backups for MySQL databases are performed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    /**
     * <p>The start time of full backup tasks. Specify the value in the <em>HH:mm</em> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>14:22</p>
     */
    @NameInMap("BackupStartTime")
    public String backupStartTime;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>Empty: If you do not specify this parameter, the system stores backup data in your OSS bucket.</li>
     * <li>system : The system stores backup data in the built-in OSS bucket of DBS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("BackupStorageType")
    public String backupStorageType;

    /**
     * <p>The backup method that you want to use for full backups. Valid values:</p>
     * <ul>
     * <li><strong>simple</strong>: scheduled backup. If you specify this value for the BackupStrategyType parameter, you must also specify the BackupPeriod and BackupStartTime parameters.</li>
     * <li><strong>Manual</strong>: manual backup.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>simple</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("BackupStrategyType")
    public String backupStrategyType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DBS</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique ID (UID) of the Alibaba Cloud account to which the source database belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxx7778xxxxxxxxxx</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The name of the RAM role that is used to perform backups across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <p>The region in which the database that you want to back up resides.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DatabaseRegion")
    public String databaseRegion;

    /**
     * <p>The type of the source database. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>MSSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>MariaDB</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>DRDS</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>Redis</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The number of days after which the storage class of the backup data is changed to Archive. Default value: 365.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    /**
     * <p>The number of days after which the storage class of the backup data is changed to Infrequent Access (IA). Default value: 180.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    /**
     * <p>Specifies whether to enable the incremental log backup feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the incremental log backup feature.</li>
     * <li><strong>false</strong>: disables the incremental log backup feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBackupLog")
    public Boolean enableBackupLog;

    /**
     * <p>The request source. Default value: OpenApi. You do not need to set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenApi</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The type of the backup schedule. Valid values:</p>
     * <ul>
     * <li><strong>micro</strong></li>
     * <li><strong>small</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>large</strong></li>
     * <li><strong>xlarge</strong></li>
     * </ul>
     * <blockquote>
     * <p> A backup schedule type with higher specifications offers higher backup and restoration performance. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Select a backup schedule type</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>micro</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The type of the source database instance. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
     * <li><strong>PolarDB</strong>: PolarDB.</li>
     * <li><strong>DDS</strong>: ApsaraDB for MongoDB.</li>
     * <li><strong>Kvstore</strong>: ApsaraDB for Redis.</li>
     * <li><strong>Other</strong>: Database connected by using an IP address and a port number.</li>
     * <li><strong>dg</strong>: Self-managed database that has no public IP address or port number and is connected over Database Gateway.</li>
     * </ul>
     * <blockquote>
     * <p> If <strong>PayType</strong> is set to <strong>postpay</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket used to store backup files. By default, the system automatically generates a name for the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>TestOssBucket</p>
     */
    @NameInMap("OSSBucketName")
    public String OSSBucketName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>postpay</strong>: pay-as-you-go.</li>
     * <li><strong>prepay</strong>: subscription.</li>
     * </ul>
     * <blockquote>
     * <p> The default value is <strong>prepay</strong>. You can set this parameter to <strong>postpay</strong> only if you set <strong>BackupMethod</strong> to <strong>duplication</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Specifies whether to use yearly subscription or monthly subscription for the instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly subscription</li>
     * <li><strong>Month</strong>: monthly subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the region in which you want to store the backup data. You can query the supported regions of DBS by calling the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation.</p>
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
     * <p>The name of the database.</p>
     * <blockquote>
     * <p>This parameter is required if the DatabaseType parameter is set to <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The endpoint of the database.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>Express</strong>, <strong>Agent</strong>, or <strong>Other</strong>.</p>
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
     * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the source database. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: The database is on an ApsaraDB RDS instance.</li>
     * <li><strong>ECS</strong>: The database is on an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>Express</strong>: The database is connected to DBS by using Express Connect, VPN Gateway, or Smart Access Gateway.</li>
     * <li><strong>Agent</strong>: The database is connected to DBS over a DBS backup gateway.</li>
     * <li><strong>DDS</strong>: The database is on an ApsaraDB for MongoDB instance.</li>
     * <li><strong>Other</strong>: The database is connected to DBS by using an IP address and a port number.</li>
     * <li><strong>dg</strong>: The database is a self-managed database that has no public IP address or port number and is connected to DBS over Database Gateway.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The system ID (SID) of the Oracle database. This parameter is required if the source database is an Oracle database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password of the account that is used to connect to the database.</p>
     * <blockquote>
     * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The port of the database.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>Express</strong>, <strong>Agent</strong>, <strong>Other</strong>, or <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region in which the database that you want to back up resides.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>SourceEndpointInstanceType</strong> parameter is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, <strong>Express</strong>, or <strong>Agent</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The username of the account that is used to connect to the database.</p>
     * <blockquote>
     * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <p>The region in which you want to store the backup data.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("StorageRegion")
    public String storageRegion;

    /**
     * <p>This parameter is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 5.</li>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 11.</li>
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
