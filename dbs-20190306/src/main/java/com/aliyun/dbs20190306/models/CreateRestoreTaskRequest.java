// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically start the instance after an Oracle physical backup is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoOpenDatabase")
    public String autoOpenDatabase;

    /**
     * <p>Specifies whether to automatically shut down the instance after an Oracle physical backup is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoShutdownDatabase")
    public String autoShutdownDatabase;

    /**
     * <p>The ID of the backup gateway.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4312****</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0ww****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the full backup set used for restoration. This parameter and RestoreTime are mutually exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0w*****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOC********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The UID of the Alibaba Cloud account used for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>2749528728********</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The name of the RAM role used for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <p>The instance specifications of the new database instance to which data is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.x4.large.2</p>
     */
    @NameInMap("DestDatabaseInstanceClass")
    public String destDatabaseInstanceClass;

    /**
     * <p>The database engine version of the new database instance to which data is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DestDatabaseInstanceDatabaseVersion")
    public String destDatabaseInstanceDatabaseVersion;

    /**
     * <p>The region of the new database instance to which data is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("DestDatabaseInstanceRegion")
    public String destDatabaseInstanceRegion;

    /**
     * <p>The instance storage size of the new database to recover.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DestDatabaseInstanceStorageSize")
    public String destDatabaseInstanceStorageSize;

    /**
     * <p>The instance type of the new database to which data is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("DestDatabaseInstanceType")
    public String destDatabaseInstanceType;

    /**
     * <p>The vSwitch of the new database instance to which data is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xx</p>
     */
    @NameInMap("DestDatabaseInstanceVSwitch")
    public String destDatabaseInstanceVSwitch;

    /**
     * <p>The VPC of the new database instance to which data is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xx</p>
     */
    @NameInMap("DestDatabaseInstanceVpc")
    public String destDatabaseInstanceVpc;

    /**
     * <p>The name of the database.</p>
     * <blockquote>
     * <p>This parameter is required if the database engine is PostgreSQL or MongoDB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    /**
     * <p>The database connection address.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Express, Agent, or Other.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp*****9jv8pxero.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The instance ID of the database.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to RDS, ECS, DDS, or Express.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1p8c29*****</p>
     */
    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    /**
     * <p>The location of the database. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong></li>
     * <li><strong>ECS</strong></li>
     * <li><strong>Express</strong>: databases connected over Express Connect circuits, VPN gateways, or Smart Access Gateway (SAG)</li>
     * <li><strong>Agent</strong>: databases connected over backup gateways</li>
     * <li><strong>DDS</strong>: ApsaraDB for MongoDB</li>
     * <li><strong>Other</strong>: databases connected by using IP addresses and port numbers</li>
     * <li><strong>dg</strong>: self-managed databases that have no public IP addresses or port numbers and are connected over Database Gateway</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>The Oracle SID.</p>
     * <blockquote>
     * <p>This parameter is required if the database engine is Oracle.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    /**
     * <p>The password of the database account.</p>
     * <blockquote>
     * <p>This parameter is not required if the database engine is Redis, or if the database is connected over a backup gateway and the database engine is SQL Server. In other scenarios, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The port number of the database.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Express, Agent, Other, or ECS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public Integer destinationEndpointPort;

    /**
     * <p>The region of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to RDS, ECS, DDS, Express, or Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>The username of the database account.</p>
     * <blockquote>
     * <p>This parameter is not required if the database engine is Redis, or if the database is connected over a backup gateway and the database engine is SQL Server. In other scenarios, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The method used to handle conflicts between objects with the same name. Valid values:</p>
     * <ul>
     * <li><strong>renamenew</strong>: renames the object if an object with the same name exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>renamenew</p>
     */
    @NameInMap("DuplicateConflict")
    public String duplicateConflict;

    /**
     * <p>Specifies whether to connect to the destination by using an SSL-encrypted connection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDestinationEndpointSsl")
    public Boolean enableDestinationEndpointSsl;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The method used to restore data to the destination. Valid values:</p>
     * <ul>
     * <li><strong>EXIST_INSTANCE</strong>: restores data to an existing instance.</li>
     * <li><strong>NEW_INSTANCE</strong>: restores data to a new instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EXIST_INSTANCE</p>
     */
    @NameInMap("RestoreDestinationMode")
    public String restoreDestinationMode;

    /**
     * <p>This parameter is required if <strong>DestinationEndpointInstanceType</strong> is set to Agent and the backup plan is for MySQL.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreDir")
    public String restoreDir;

    /**
     * <p>The directory of the database program.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreHome")
    public String restoreHome;

    /**
     * <p>The objects to be restored.</p>
     * <ul>
     * <li>For more information, see the definition of the <strong>RestoreObjects</strong> parameter below. This parameter is not required if the database is connected over a backup gateway. In other scenarios, this parameter is required.</li>
     * <li>Template: <code>[{ &quot;DBName&quot;: &quot;Name of the database to be restored&quot;, &quot;NewDBName&quot;: &quot;Name of the destination database&quot; }]</code></li>
     * </ul>
     * <blockquote>
     * <p>Restoring objects by calling this API operation only supports restoration at the database level. To restore specific tables, go to the console. For more information, see <a href="https://help.aliyun.com/document_detail/85543.html">Restore a database</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Example of MySQL table-level restoration:
     * [{\&quot;DBName\&quot;:\&quot;dbname\&quot;, \&quot;NewDBName\&quot;:\&quot;dbname1\&quot;}]</p>
     */
    @NameInMap("RestoreObjects")
    public String restoreObjects;

    /**
     * <p>The name of the restore task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreTaskName")
    public String restoreTaskName;

    /**
     * <p>The point in time to which you want to restore the database. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1554560477000</p>
     */
    @NameInMap("RestoreTime")
    public Long restoreTime;

    /**
     * <p>The credential for the SSL-encrypted connection to the destination.</p>
     * 
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
