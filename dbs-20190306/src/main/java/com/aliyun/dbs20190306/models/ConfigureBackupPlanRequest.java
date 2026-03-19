// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ConfigureBackupPlanRequest extends TeaModel {
    /**
     * <p>Enable automatic backup. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable</p>
     * </li>
     * <li><p><strong>false</strong>: Disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoStartBackup")
    public Boolean autoStartBackup;

    /**
     * <p>The backup gateway ID. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is <strong>agent</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23313123312</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The incremental interval in seconds (s).</p>
     * <blockquote>
     * <p>Only physical backup is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The backup objects. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * 
     * <strong>example:</strong>
     * <p>[     {         &quot;DBName&quot;:&quot;待备份库名&quot;,         &quot;SchemaName&quot;:&quot;待备份 Schema 名&quot;,         &quot;TableIncludes&quot;:[{             &quot;TableName&quot;:&quot;待备份表表名&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;待备份库名不需要备份表的表名&quot;         }]     } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The full backup period. Valid values:</p>
     * <ul>
     * <li><p><strong>Monday</strong>: Monday</p>
     * </li>
     * <li><p><strong>Tuesday</strong>: Tuesday</p>
     * </li>
     * <li><p><strong>Wednesday</strong>: Wednesday</p>
     * </li>
     * <li><p><strong>Thursday</strong>: Thursday</p>
     * </li>
     * <li><p><strong>Friday</strong>: Friday</p>
     * </li>
     * <li><p><strong>Saturday</strong>: Saturday</p>
     * </li>
     * <li><p><strong>Sunday</strong>: Sunday</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The backup plan ID. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The custom backup plan name. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0*******</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>The network bandwidth throttling in KB/s. The maximum value is 10 GB.</p>
     * <blockquote>
     * <p>This parameter is valid only for MySQL physical backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupRateLimit")
    public Long backupRateLimit;

    /**
     * <p>The retention period for backup data. Valid values: 0 to 1825. Default value: 730 days.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>The disk I/O limit in KB/s.</p>
     * <blockquote>
     * <p>This parameter is valid only for MySQL physical backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("BackupSpeedLimit")
    public Long backupSpeedLimit;

    /**
     * <p>The full backup start time in <em>HH:mm</em>Z (UTC) format. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * 
     * <strong>example:</strong>
     * <p>14:22</p>
     */
    @NameInMap("BackupStartTime")
    public String backupStartTime;

    /**
     * <strong>example:</strong>
     * <p>encrypted</p>
     */
    @NameInMap("BackupStorageEncryptMethod")
    public String backupStorageEncryptMethod;

    /**
     * <p>The built-in storage type:</p>
     * <ul>
     * <li><p>Empty (default): Backup data is stored on your OSS.</p>
     * </li>
     * <li><p>system: Backup data is stored on the built-in OSS of DBS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("BackupStorageType")
    public String backupStorageType;

    /**
     * <p>The full backup period. Valid values:</p>
     * <ul>
     * <li><p><strong>simple</strong>: Periodic backup. Use this value with BackupPeriod and BackupStartTime.</p>
     * </li>
     * <li><p><strong>manual</strong>: Manual backup.</p>
     * </li>
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
     * <p>Ensure the idempotence of the request to prevent duplicate submissions. The client generates this parameter value. Ensure its uniqueness across different requests. The maximum length is 64 ASCII characters, and the value cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The UID for cross-Alibaba Cloud account backup. Call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> API to get this parameter\&quot;s value.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxx7778xxxxxxxxxx</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The RAM role name for cross-Alibaba Cloud account backup. Call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> API to get this parameter\&quot;s value.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <p>The period after which data is converted to archive cold storage. Default value: 365 days.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    /**
     * <p>The period after which data is converted to Infrequent Access storage. Default value: 180 days.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    /**
     * <p>Enable incremental log backup. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable</p>
     * </li>
     * <li><p><strong>false</strong>: Disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBackupLog")
    public Boolean enableBackupLog;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableMysqlPhysicalBackupBinlog")
    public String enableMysqlPhysicalBackupBinlog;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSourceEndpointSsl")
    public String enableSourceEndpointSsl;

    /**
     * <p>The OSS bucket name.</p>
     * <blockquote>
     * <p>The system automatically generates a new name by default.</p>
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
     * <p>The database name. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <blockquote>
     * <p>This parameter is required when the database type is <strong>PostgreSQL</strong> or <strong>MongoDB</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The database endpoint. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is <strong>express</strong>, <strong>agent</strong>, or <strong>other</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The database instance ID. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is <strong>RDS</strong>, <strong>ECS</strong>, <strong>DDS</strong>, or <strong>Express</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*********</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the database. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>ECS</strong></p>
     * </li>
     * <li><p><strong>Express</strong>: A database connected through a leased line, VPN Gateway, or Smart Gateway.</p>
     * </li>
     * <li><p><strong>Agent</strong>: A database connected through a backup gateway.</p>
     * </li>
     * <li><p><strong>DDS</strong>: Cloud MongoDB.</p>
     * </li>
     * <li><p><strong>Other</strong>: A database directly connected through IP:Port.</p>
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
     * <strong>example:</strong>
     * <p>/home/test</p>
     */
    @NameInMap("SourceEndpointOracleHome")
    public String sourceEndpointOracleHome;

    /**
     * <p>The Oracle SID name.</p>
     * <blockquote>
     * <p>This parameter is required when the database type is Oracle.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password.</p>
     * <blockquote>
     * <p>This parameter is optional when the database type is <strong>Redis</strong>, or when the database location is <strong>agent</strong> and the database type is <strong>SQL Server</strong>. It is required in other scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The database port. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpoint</strong>.<strong>InstanceType</strong> is <strong>express</strong>, <strong>agent</strong>, <strong>other</strong>, or <strong>ECS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region of the database. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API to get this parameter\&quot;s value.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>SourceEndpointInstanceType</strong> is RDS, ECS, DDS, Express, or Agent.</p>
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
     * <p>This parameter is optional when the database type is <strong>Redis</strong>, or when the database location is <strong>agent</strong> and the database type is <strong>SQL Server</strong>. It is required in other scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testRDS</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
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
