// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ConfigureBackupPlanRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic backup. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic backup</li>
     * <li><strong>false</strong>: disables automatic backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStartBackup")
    public Boolean autoStartBackup;

    /**
     * <p>The ID of the backup gateway. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is set to <strong>agent</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23313123312</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The interval for incremental backup, in seconds.</p>
     * <blockquote>
     * <p>This parameter is supported only for physical backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The objects to be backed up. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[     {         &quot;DBName&quot;:&quot;DatabaseToBackUp&quot;,         &quot;SchemaName&quot;:&quot;SchemaToBackUp&quot;,         &quot;TableIncludes&quot;:[{             &quot;TableName&quot;:&quot;TableToBackUp&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;TableToExclude&quot;         }]     } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The full backup cycle. Valid values:</p>
     * <ul>
     * <li><strong>Monday</strong>: Monday</li>
     * <li><strong>Tuesday</strong>: Tuesday</li>
     * <li><strong>Wednesday</strong>: Wednesday</li>
     * <li><strong>Thursday</strong>: Thursday</li>
     * <li><strong>Friday</strong>: Friday</li>
     * <li><strong>Saturday</strong>: Saturday</li>
     * <li><strong>Sunday</strong>: Sunday</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The ID of the backup plan. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The custom name of the backup plan. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>The network bandwidth throttling. Unit: KB/s. Maximum value: 10 GB.</p>
     * <blockquote>
     * <p>This parameter takes effect only for MySQL physical backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupRateLimit")
    public Long backupRateLimit;

    /**
     * <p>The retention period of backup data. Valid values: 0 to 1825. Default value: 730. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>The disk I/O limit. Unit: KB/s.</p>
     * <blockquote>
     * <p>This parameter takes effect only for MySQL physical backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    /**
     * <p>The start time of the full backup. The time is in the <i>HH:mm</i>Z format and displayed in UTC. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>14:22</p>
     */
    @NameInMap("BackupStartTime")
    public String backupStartTime;

    /**
     * <p>The encryption method for backup storage.</p>
     * 
     * <strong>example:</strong>
     * <p>encrypted</p>
     */
    @NameInMap("BackupStorageEncryptMethod")
    public String backupStorageEncryptMethod;

    /**
     * <p>The built-in storage type. Valid values:</p>
     * <ul>
     * <li>Empty string (default): Backup data is stored in your OSS bucket.</li>
     * <li>system: Backup data is stored in the built-in OSS bucket of DBS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("BackupStorageType")
    public String backupStorageType;

    /**
     * <p>The full backup epoch. Valid values:</p>
     * <ul>
     * <li><strong>simple</strong>: periodic backup, which is used together with BackupPeriod and BackupStartTime</li>
     * <li><strong>manual</strong>: manual backup</li>
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
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The UID of the Alibaba Cloud account for cross-account backup. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to query the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxx7778xxxxxxxxxx</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The name of the RAM role for cross-account backup. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to query the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <p>The period after which backup data is transitioned to Archive storage. Default value: 365. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    /**
     * <p>The period after which backup data is transitioned to Infrequent Access (IA) storage. Default value: 180. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    /**
     * <p>Specifies whether to enable incremental log backup. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables incremental log backup</li>
     * <li><strong>false</strong>: disables incremental log backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBackupLog")
    public Boolean enableBackupLog;

    /**
     * <p>Specifies whether to enable log backup for MySQL physical backup.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableMysqlPhysicalBackupBinlog")
    public String enableMysqlPhysicalBackupBinlog;

    /**
     * <p>Specifies whether to enable an SSL-encrypted connection to the source database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSourceEndpointSsl")
    public String enableSourceEndpointSsl;

    /**
     * <p>The name of the OSS bucket.</p>
     * <blockquote>
     * <p>By default, the system automatically generates a new name.</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzecovzti****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <blockquote>
     * <p>This parameter is required when the database engine is <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The database connection address. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, or <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The database instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*********</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong></li>
     * <li><strong>ECS</strong></li>
     * <li><strong>Express</strong>: databases connected over Express Connect circuits, VPN gateways, or Smart Access Gateway (SAG)</li>
     * <li><strong>Agent</strong>: databases connected over backup gateways</li>
     * <li><strong>DDS</strong>: ApsaraDB for MongoDB</li>
     * <li><strong>Other</strong>: databases connected by using IP addresses and port numbers</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>Oracle Home</p>
     * 
     * <strong>example:</strong>
     * <p>/home/test</p>
     */
    @NameInMap("SourceEndpointOracleHome")
    public String sourceEndpointOracleHome;

    /**
     * <p>The Oracle system identifier (SID).</p>
     * <blockquote>
     * <p>This parameter is required when the database engine is Oracle.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password of the database account.</p>
     * <blockquote>
     * <p>This parameter is not required when the database engine is <strong>Redis</strong>, or when the database is connected over a backup gateway (<strong>agent</strong>) and the database engine is <strong>SQL Server</strong>. This parameter is required in other scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The port number of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is set to <strong>express</strong>, <strong>agent</strong>, <strong>other</strong>, or <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the value of this parameter.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is set to RDS, ECS, DDS, Express, or Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The username of the database account.</p>
     * <blockquote>
     * <p>This parameter is not required when the database engine is <strong>Redis</strong>, or when the database is connected over a backup gateway (<strong>agent</strong>) and the database engine is <strong>SQL Server</strong>. This parameter is required in other scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <p>The PEM certificate for the SSL-encrypted connection to the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- ... -----END CERTIFICATE-----</p>
     */
    @NameInMap("SslCaPem")
    public String sslCaPem;

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

    public ConfigureBackupPlanRequest setBackupStorageEncryptMethod(String backupStorageEncryptMethod) {
        this.backupStorageEncryptMethod = backupStorageEncryptMethod;
        return this;
    }
    public String getBackupStorageEncryptMethod() {
        return this.backupStorageEncryptMethod;
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

    public ConfigureBackupPlanRequest setEnableMysqlPhysicalBackupBinlog(String enableMysqlPhysicalBackupBinlog) {
        this.enableMysqlPhysicalBackupBinlog = enableMysqlPhysicalBackupBinlog;
        return this;
    }
    public String getEnableMysqlPhysicalBackupBinlog() {
        return this.enableMysqlPhysicalBackupBinlog;
    }

    public ConfigureBackupPlanRequest setEnableSourceEndpointSsl(String enableSourceEndpointSsl) {
        this.enableSourceEndpointSsl = enableSourceEndpointSsl;
        return this;
    }
    public String getEnableSourceEndpointSsl() {
        return this.enableSourceEndpointSsl;
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

    public ConfigureBackupPlanRequest setSourceEndpointOracleHome(String sourceEndpointOracleHome) {
        this.sourceEndpointOracleHome = sourceEndpointOracleHome;
        return this;
    }
    public String getSourceEndpointOracleHome() {
        return this.sourceEndpointOracleHome;
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

    public ConfigureBackupPlanRequest setSslCaPem(String sslCaPem) {
        this.sslCaPem = sslCaPem;
        return this;
    }
    public String getSslCaPem() {
        return this.sslCaPem;
    }

}
