// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskRequest extends TeaModel {
    @NameInMap("AutoOpenDatabase")
    public String autoOpenDatabase;

    @NameInMap("AutoShutdownDatabase")
    public String autoShutdownDatabase;

    /**
     * <p>backup gateway ID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DestinationEndpointInstanceType</strong> is agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4312****</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>backup plan ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0ww****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the full backup set used for restoration. Mutually exclusive with RestoreTime.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0w*****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>Ensures request idempotence and prevents duplicate submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOC********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>UID for cross-Alibaba Cloud account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>2749528728********</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>RAM role name for cross-Alibaba Cloud account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <strong>example:</strong>
     * <p>mysql.x4.large.2</p>
     */
    @NameInMap("DestDatabaseInstanceClass")
    public String destDatabaseInstanceClass;

    @NameInMap("DestDatabaseInstanceDatabaseVersion")
    public String destDatabaseInstanceDatabaseVersion;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("DestDatabaseInstanceRegion")
    public String destDatabaseInstanceRegion;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DestDatabaseInstanceStorageSize")
    public String destDatabaseInstanceStorageSize;

    /**
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("DestDatabaseInstanceType")
    public String destDatabaseInstanceType;

    @NameInMap("DestDatabaseInstanceVSwitch")
    public String destDatabaseInstanceVSwitch;

    /**
     * <strong>example:</strong>
     * <p>vpc-xx</p>
     */
    @NameInMap("DestDatabaseInstanceVpc")
    public String destDatabaseInstanceVpc;

    /**
     * <p>database name.</p>
     * <blockquote>
     * <p>This parameter is required when the database type is PostgreSQL or MongoDB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    /**
     * <p>database endpoint.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DestinationEndpointInstanceType</strong> is express, agent, or other.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp*****9jv8pxero.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>database instance ID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DestinationEndpointInstanceType</strong> is RDS, ECS, DDS, or Express.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1p8c29*****</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>database location. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>ECS</strong></p>
     * </li>
     * <li><p><strong>Express</strong>: databases accessed via leased line/VPN Gateway/Smart Gateway</p>
     * </li>
     * <li><p><strong>Agent</strong>: databases accessed via backup gateway</p>
     * </li>
     * <li><p><strong>DDS</strong>: Cloud MongoDB</p>
     * </li>
     * <li><p><strong>Other</strong>: databases directly connected via IP:Port</p>
     * </li>
     * <li><p><strong>dg</strong>: self-managed databases without public IP:Port (accessed via Database Gateway DG)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>Oracle SID name.</p>
     * <blockquote>
     * <p>This parameter is required when the database type is Oracle.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    /**
     * <p>password.</p>
     * <blockquote>
     * <p>This parameter is optional when the database type is Redis, or when the database location is agent and the database type is MSSQL. It is required in all other scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>database port.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DestinationEndpointInstanceType</strong> is express, agent, other, or ECS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public Integer destinationEndpointPort;

    /**
     * <p>region of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DestinationEndpointInstanceType</strong> is RDS, ECS, DDS, Express, or Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>database account.</p>
     * <blockquote>
     * <p>This parameter is optional when the database type is Redis, or when the database location is agent and the database type is MSSQL. It is required in all other scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>Conflict handling for objects with the same name. Currently supports:</p>
     * <p><strong>renamenew</strong>: Rename objects if names conflict.</p>
     * 
     * <strong>example:</strong>
     * <p>renamenew</p>
     */
    @NameInMap("DuplicateConflict")
    public String duplicateConflict;

    @NameInMap("EnableDestinationEndpointSsl")
    public Boolean enableDestinationEndpointSsl;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>exist_instance</p>
     */
    @NameInMap("RestoreDestinationMode")
    public String restoreDestinationMode;

    /**
     * <p>Required when <strong>DestinationEndpointInstanceType</strong> is agent and the backup plan is MySQL.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreDir")
    public String restoreDir;

    /**
     * <p>database program directory.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreHome")
    public String restoreHome;

    /**
     * <p>restore objects.</p>
     * <ul>
     * <li><p>For details, see the <strong>RestoreObjects</strong> parameter definition below. This parameter is optional when the database location is agent, and required in all other scenarios.</p>
     * </li>
     * <li><p>Input template: <code>[{ &quot;DBName&quot;: &quot;database name to be restored&quot;, &quot;NewDBName&quot;: &quot;target database name to be restored&quot; }]</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This API only supports restoring objects at the database level. To configure table-level restoration, use the console. For details, see <a href="https://help.aliyun.com/document_detail/85543.html">Recover databases</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL表级别恢复示例如下：
     * [{\&quot;DBName\&quot;:\&quot;dbname\&quot;, \&quot;NewDBName\&quot;:\&quot;dbname1\&quot;}]</p>
     */
    @NameInMap("RestoreObjects")
    public String restoreObjects;

    /**
     * <p>restore job name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreTaskName")
    public String restoreTaskName;

    /**
     * <p>restore time. Value: 1554560477000.</p>
     * 
     * <strong>example:</strong>
     * <p>1554560477000</p>
     */
    @NameInMap("RestoreTime")
    public Long restoreTime;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- ... -----END CERTIFICATE-----</p>
     */
    @NameInMap("SslCaPem")
    public String sslCaPem;

    public static CreateRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreTaskRequest self = new CreateRestoreTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestoreTaskRequest setAutoOpenDatabase(String autoOpenDatabase) {
        this.autoOpenDatabase = autoOpenDatabase;
        return this;
    }
    public String getAutoOpenDatabase() {
        return this.autoOpenDatabase;
    }

    public CreateRestoreTaskRequest setAutoShutdownDatabase(String autoShutdownDatabase) {
        this.autoShutdownDatabase = autoShutdownDatabase;
        return this;
    }
    public String getAutoShutdownDatabase() {
        return this.autoShutdownDatabase;
    }

    public CreateRestoreTaskRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public CreateRestoreTaskRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public CreateRestoreTaskRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateRestoreTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRestoreTaskRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public CreateRestoreTaskRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceClass(String destDatabaseInstanceClass) {
        this.destDatabaseInstanceClass = destDatabaseInstanceClass;
        return this;
    }
    public String getDestDatabaseInstanceClass() {
        return this.destDatabaseInstanceClass;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceDatabaseVersion(String destDatabaseInstanceDatabaseVersion) {
        this.destDatabaseInstanceDatabaseVersion = destDatabaseInstanceDatabaseVersion;
        return this;
    }
    public String getDestDatabaseInstanceDatabaseVersion() {
        return this.destDatabaseInstanceDatabaseVersion;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceRegion(String destDatabaseInstanceRegion) {
        this.destDatabaseInstanceRegion = destDatabaseInstanceRegion;
        return this;
    }
    public String getDestDatabaseInstanceRegion() {
        return this.destDatabaseInstanceRegion;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceStorageSize(String destDatabaseInstanceStorageSize) {
        this.destDatabaseInstanceStorageSize = destDatabaseInstanceStorageSize;
        return this;
    }
    public String getDestDatabaseInstanceStorageSize() {
        return this.destDatabaseInstanceStorageSize;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceType(String destDatabaseInstanceType) {
        this.destDatabaseInstanceType = destDatabaseInstanceType;
        return this;
    }
    public String getDestDatabaseInstanceType() {
        return this.destDatabaseInstanceType;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceVSwitch(String destDatabaseInstanceVSwitch) {
        this.destDatabaseInstanceVSwitch = destDatabaseInstanceVSwitch;
        return this;
    }
    public String getDestDatabaseInstanceVSwitch() {
        return this.destDatabaseInstanceVSwitch;
    }

    public CreateRestoreTaskRequest setDestDatabaseInstanceVpc(String destDatabaseInstanceVpc) {
        this.destDatabaseInstanceVpc = destDatabaseInstanceVpc;
        return this;
    }
    public String getDestDatabaseInstanceVpc() {
        return this.destDatabaseInstanceVpc;
    }

    public CreateRestoreTaskRequest setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
        this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
        return this;
    }
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    public CreateRestoreTaskRequest setDestinationEndpointIP(String destinationEndpointIP) {
        this.destinationEndpointIP = destinationEndpointIP;
        return this;
    }
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    public CreateRestoreTaskRequest setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
        this.destinationEndpointInstanceID = destinationEndpointInstanceID;
        return this;
    }
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    public CreateRestoreTaskRequest setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
        this.destinationEndpointInstanceType = destinationEndpointInstanceType;
        return this;
    }
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    public CreateRestoreTaskRequest setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
        this.destinationEndpointOracleSID = destinationEndpointOracleSID;
        return this;
    }
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    public CreateRestoreTaskRequest setDestinationEndpointPassword(String destinationEndpointPassword) {
        this.destinationEndpointPassword = destinationEndpointPassword;
        return this;
    }
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    public CreateRestoreTaskRequest setDestinationEndpointPort(Integer destinationEndpointPort) {
        this.destinationEndpointPort = destinationEndpointPort;
        return this;
    }
    public Integer getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    public CreateRestoreTaskRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public CreateRestoreTaskRequest setDestinationEndpointUserName(String destinationEndpointUserName) {
        this.destinationEndpointUserName = destinationEndpointUserName;
        return this;
    }
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    public CreateRestoreTaskRequest setDuplicateConflict(String duplicateConflict) {
        this.duplicateConflict = duplicateConflict;
        return this;
    }
    public String getDuplicateConflict() {
        return this.duplicateConflict;
    }

    public CreateRestoreTaskRequest setEnableDestinationEndpointSsl(Boolean enableDestinationEndpointSsl) {
        this.enableDestinationEndpointSsl = enableDestinationEndpointSsl;
        return this;
    }
    public Boolean getEnableDestinationEndpointSsl() {
        return this.enableDestinationEndpointSsl;
    }

    public CreateRestoreTaskRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateRestoreTaskRequest setRestoreDestinationMode(String restoreDestinationMode) {
        this.restoreDestinationMode = restoreDestinationMode;
        return this;
    }
    public String getRestoreDestinationMode() {
        return this.restoreDestinationMode;
    }

    public CreateRestoreTaskRequest setRestoreDir(String restoreDir) {
        this.restoreDir = restoreDir;
        return this;
    }
    public String getRestoreDir() {
        return this.restoreDir;
    }

    public CreateRestoreTaskRequest setRestoreHome(String restoreHome) {
        this.restoreHome = restoreHome;
        return this;
    }
    public String getRestoreHome() {
        return this.restoreHome;
    }

    public CreateRestoreTaskRequest setRestoreObjects(String restoreObjects) {
        this.restoreObjects = restoreObjects;
        return this;
    }
    public String getRestoreObjects() {
        return this.restoreObjects;
    }

    public CreateRestoreTaskRequest setRestoreTaskName(String restoreTaskName) {
        this.restoreTaskName = restoreTaskName;
        return this;
    }
    public String getRestoreTaskName() {
        return this.restoreTaskName;
    }

    public CreateRestoreTaskRequest setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public Long getRestoreTime() {
        return this.restoreTime;
    }

    public CreateRestoreTaskRequest setSslCaPem(String sslCaPem) {
        this.sslCaPem = sslCaPem;
        return this;
    }
    public String getSslCaPem() {
        return this.sslCaPem;
    }

}
