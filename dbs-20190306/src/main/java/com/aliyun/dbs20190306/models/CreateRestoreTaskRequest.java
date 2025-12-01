// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateRestoreTaskRequest extends TeaModel {
    /**
     * <p>The ID of the backup gateway.</p>
     * <blockquote>
     * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4312****</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0ww****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the full backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0w*****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOC********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The unique ID (UID) of the Alibaba Cloud account to which the source database belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>2749528728********</p>
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
     * <p>The name of the database.</p>
     * <blockquote>
     * <p>This parameter is required if the database is a PostgreSQL database or a MongoDB database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    /**
     * <p>The endpoint that is used to connect to the database.</p>
     * <blockquote>
     * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Express, Agent, or Other.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp*****9jv8pxero.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    /**
     * <p>The ID of the database instance.</p>
     * <blockquote>
     * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to RDS, ECS, DDS, or Express.</p>
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
     * <li><strong>RDS</strong>: The database is deployed on an ApsaraDB RDS instance.</li>
     * <li><strong>ECS</strong>: The database is deployed on an Elastic Compute Service (ECS) instance.</li>
     * <li><strong>Express</strong>: The database is connected to Database Backup (DBS) by using Express Connect, VPN Gateway, or Smart Access Gateway.</li>
     * <li><strong>Agent</strong>: The database is connected over a DBS backup gateway.</li>
     * <li><strong>DDS</strong>: The database is an ApsaraDB for MongoDB database.</li>
     * <li><strong>Other</strong>: The database is connected to DBS by using the IP address and port of the database.</li>
     * <li><strong>dg</strong>: The database is a self-managed database that does not have public IP addresses or port numbers and is connected to DBS over Database Gateway.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    /**
     * <p>The system ID (SID) of the Oracle database.</p>
     * <blockquote>
     * <p>This parameter is required if the source database is an Oracle database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    /**
     * <p>The password of the account that is used to connect to the source database.</p>
     * <blockquote>
     * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    /**
     * <p>The port of the database.</p>
     * <blockquote>
     * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Express, Agent, Other, or ECS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("DestinationEndpointPort")
    public Integer destinationEndpointPort;

    /**
     * <p>The region ID of the destination database instance.</p>
     * <blockquote>
     * <p> You must specify this parameter if <strong>DestinationEndpointInstanceType</strong> is set to RDS, ECS, DDS, Express, or Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    /**
     * <p>The username of the account that is used to connect to the database.</p>
     * <blockquote>
     * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    /**
     * <p>The method of processing objects with the same name. Valid values:</p>
     * <ul>
     * <li>failure: The restore task fails if the system detects objects with the same name. This is the default value.</li>
     * <li>renamenew: The restore task renames objects with the same name starting from the second occurrence.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>renamenew</p>
     */
    @NameInMap("DuplicateConflict")
    public String duplicateConflict;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>This parameter is required if the DestinationEndpointInstanceType parameter is set to Agent and the backup object of the backup schedule is a MySQL database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreDir")
    public String restoreDir;

    /**
     * <p>The program directory of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RestoreHome")
    public String restoreHome;

    /**
     * <p>The objects to be restored.</p>
     * <blockquote>
     * <p>This parameter is required except that the DestinationEndpointInstanceType parameter is set to Agent. For information about the parameter definition, see RestoreObjects.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;DBName&quot;:&quot;Name of the database to be restored&quot;, &quot;NewDBName&quot;:&quot;Name of the database to which the objects will be restored&quot;, &quot;SchemaName&quot;:&quot;Schema name of the database to be restored&quot;, &quot;NewSchemaName&quot;:&quot;Schema name of the destination database to which the objects will be restored&quot;}]</p>
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
     * <p>The time to run the restore task, such as 1554560477000.</p>
     * 
     * <strong>example:</strong>
     * <p>1554560477000</p>
     */
    @NameInMap("RestoreTime")
    public Long restoreTime;

    public static CreateRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreTaskRequest self = new CreateRestoreTaskRequest();
        return TeaModel.build(map, self);
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

    public CreateRestoreTaskRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
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

}
