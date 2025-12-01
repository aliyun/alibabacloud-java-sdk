// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ConfigureBackupPlanRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic backup feature.</p>
     * <ul>
     * <li><strong>true</strong>: enables the automatic backup feature.</li>
     * <li><strong>false</strong>: disables the automatic backup feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStartBackup")
    public Boolean autoStartBackup;

    /**
     * <p>The backup gateway ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to <strong>Agent</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23313123312</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The interval at which you want to perform incremental log backups. Unit: seconds.</p>
     * <blockquote>
     * <p> Only physical backup supports this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The objects to be backed up. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the objects.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;DBName&quot;:&quot;Name of the database to be backed up&quot;, &quot;SchemaName&quot;:&quot;Name of the schema to be backed up&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table to be backed up&quot; }], &quot;TableExcludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table to be excluded during the backup&quot; }] } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The day of each week when the full backup task runs. Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong></li>
     * <li><strong>Tuesday</strong></li>
     * <li><strong>Wednesday</strong></li>
     * <li><strong>Thursday</strong></li>
     * <li><strong>Friday</strong></li>
     * <li><strong>Saturday</strong></li>
     * <li><strong>Sunday</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The name of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the name.</p>
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
     * <p>This parameter takes effect only when physical backups for MySQL databases are performed.</p>
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
     * <p>The disk I/O limit. Unit: KB/s.</p>
     * <blockquote>
     * <p> This parameter takes effect only during the physical backup of a MySQL database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    /**
     * <p>The start time of the full backup. Specify the time in the <em>HH:mm</em>Z format. The time must be in UTC. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the start time of full backup tasks.</p>
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
     * <li>system: The system stores backup data in the built-in OSS bucket of DBS.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique ID (UID) of the Alibaba Cloud account to which the backup schedule belongs. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to obtain the UID.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxx7778xxxxxxxxxx</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The name of the RAM role that is used to perform backup across Alibaba Cloud accounts. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to obtain the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

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
     * <p>The name of the OSS bucket.</p>
     * <blockquote>
     * <p> By default, the system automatically generates an OSS bucket name.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TestOssBucket</p>
     */
    @NameInMap("OSSBucketName")
    public String OSSBucketName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzecovzti****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source database name. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
     * <blockquote>
     * <p> If the source database runs the <strong>PostgreSQL</strong> database engine or <strong>MongoDB</strong> database engine, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The source database endpoint. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to <strong>Express</strong>, <strong>Agent</strong>, or <strong>Other</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The database instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpoint****InstanceType</strong> to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*********</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the location. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong></li>
     * <li><strong>ECS</strong></li>
     * <li><strong>Express</strong>: The database is connected to Database Backup (DBS) via Express Connect, VPN Gateway, or Smart Access Gateway.</li>
     * <li><strong>Agent</strong>: The database is connected over a DBS backup gateway.</li>
     * <li><strong>DDS</strong>: The database is an ApsaraDB for MongoDB database.</li>
     * <li><strong>Other</strong>: The database is connected to DBS by using the IP address and port of the database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <blockquote>
     * <p>This parameter is required if the database is an Oracle database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password of the account that is used to connect to the database.</p>
     * <blockquote>
     * <p>This parameter is required except that the database is an <strong>SQL Server</strong> database that is connected to DBS over a DBS backup gateway or a <strong>Redis</strong> database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The port that is used to connect to the source database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the port.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpoint****InstanceType</strong> to <strong>Express</strong>, <strong>Agent</strong>, <strong>Other</strong>, or <strong>ECS</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region in which the source database resides. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the region.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to RDS, ECS, DDS, Express, or Agent, this parameter is required.</p>
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
     * <p>This parameter is required except that the database is an <strong>SQL Server</strong> database that is connected to DBS over a DBS backup gateway or a <strong>Redis</strong> database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    public static ConfigureBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureBackupPlanRequest self = new ConfigureBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureBackupPlanRequest setAutoStartBackup(Boolean autoStartBackup) {
        this.autoStartBackup = autoStartBackup;
        return this;
    }
    public Boolean getAutoStartBackup() {
        return this.autoStartBackup;
    }

    public ConfigureBackupPlanRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public ConfigureBackupPlanRequest setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
        this.backupLogIntervalSeconds = backupLogIntervalSeconds;
        return this;
    }
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    public ConfigureBackupPlanRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public ConfigureBackupPlanRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public ConfigureBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ConfigureBackupPlanRequest setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    public ConfigureBackupPlanRequest setBackupRateLimit(Long backupRateLimit) {
        this.backupRateLimit = backupRateLimit;
        return this;
    }
    public Long getBackupRateLimit() {
        return this.backupRateLimit;
    }

    public ConfigureBackupPlanRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ConfigureBackupPlanRequest setBackupSpeedLimit(Long backupSpeedLimit) {
        this.backupSpeedLimit = backupSpeedLimit;
        return this;
    }
    public Long getBackupSpeedLimit() {
        return this.backupSpeedLimit;
    }

    public ConfigureBackupPlanRequest setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public ConfigureBackupPlanRequest setBackupStorageType(String backupStorageType) {
        this.backupStorageType = backupStorageType;
        return this;
    }
    public String getBackupStorageType() {
        return this.backupStorageType;
    }

    public ConfigureBackupPlanRequest setBackupStrategyType(String backupStrategyType) {
        this.backupStrategyType = backupStrategyType;
        return this;
    }
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    public ConfigureBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfigureBackupPlanRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public ConfigureBackupPlanRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public ConfigureBackupPlanRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public ConfigureBackupPlanRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public ConfigureBackupPlanRequest setEnableBackupLog(Boolean enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Boolean getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public ConfigureBackupPlanRequest setOSSBucketName(String OSSBucketName) {
        this.OSSBucketName = OSSBucketName;
        return this;
    }
    public String getOSSBucketName() {
        return this.OSSBucketName;
    }

    public ConfigureBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureBackupPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigureBackupPlanRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ConfigureBackupPlanRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ConfigureBackupPlanRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ConfigureBackupPlanRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ConfigureBackupPlanRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ConfigureBackupPlanRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ConfigureBackupPlanRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ConfigureBackupPlanRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ConfigureBackupPlanRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

}
