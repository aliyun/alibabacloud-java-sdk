// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSourceEndpointRequest extends TeaModel {
    /**
     * <p>The backup gateway ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to Agent, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>21321323213</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The backup object. If you set SourceEndpointInstanceType to Agent, this parameter is optional. Otherwise, it is required. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the backup object.</p>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;DBName&quot;:&quot;Name of the database to be backed up&quot;, &quot;SchemaName&quot;:&quot;Name of the schema to be backed up&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;Name of the table to be backed up&quot; }], &quot;TableExcludes&quot;:[{&quot;TableName&quot;:&quot;Name of the table to be excluded during the backup&quot; }] } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1h****usfa</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
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
     * <p>The name of the RAM role that is used to perform backups across Alibaba Cloud accounts. You can call the <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> operation to obtain the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The name of the database.</p>
     * <ul>
     * <li>This parameter is required if the database is a PostgreSQL or MongoDB database.</li>
     * <li>This parameter is required if the database is an SQL Server database that is connected to DBS over a DBS backup gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The endpoint of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the endpoint.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to Express, Agent, or Other, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100.<em>.</em>.10:3306</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The database instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to RDS, ECS, DDS, or Express, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1p8c29479jv****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong></li>
     * <li><strong>ECS</strong></li>
     * <li><strong>Express</strong>: The database is connected to DBS via Express Connect, VPN Gateway, or Smart Access Gateway.</li>
     * <li><strong>Agent</strong>: The database is connected to DBS over a DBS backup gateway.</li>
     * <li><strong>DDS</strong>: The database is an ApsaraDB for MongoDB database.</li>
     * <li><strong>Other</strong>: The database is connected to DBS using the IP address and port of the database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    /**
     * <p>The SID of the Oracle source database. If the database is an Oracle database, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password of the account that is used to connect to the database.</p>
     * <p>This parameter is required except that the database is an SQL Server database that is connected to DBS over a DBS backup gateway or a Redis database.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The port that is used to connect to the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the port.</p>
     * <blockquote>
     * <p> If you set <strong>SourceEndpointInstanceType</strong> to Express, Agent, Other, or ECS, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region in which the database you want to back up resides. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the region.</p>
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
     * <p>The account that is used to log on to the database. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the account.</p>
     * <p>If the database is an SQL Server database connected to DBS over a DBS backup gateway or a Redis database, this parameter is optional. Otherwise, it is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    public static ModifyBackupSourceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupSourceEndpointRequest self = new ModifyBackupSourceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupSourceEndpointRequest setBackupGatewayId(Long backupGatewayId) {
        this.backupGatewayId = backupGatewayId;
        return this;
    }
    public Long getBackupGatewayId() {
        return this.backupGatewayId;
    }

    public ModifyBackupSourceEndpointRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public ModifyBackupSourceEndpointRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupSourceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupSourceEndpointRequest setCrossAliyunId(String crossAliyunId) {
        this.crossAliyunId = crossAliyunId;
        return this;
    }
    public String getCrossAliyunId() {
        return this.crossAliyunId;
    }

    public ModifyBackupSourceEndpointRequest setCrossRoleName(String crossRoleName) {
        this.crossRoleName = crossRoleName;
        return this;
    }
    public String getCrossRoleName() {
        return this.crossRoleName;
    }

    public ModifyBackupSourceEndpointRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointPort(Integer sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public Integer getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public ModifyBackupSourceEndpointRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

}
