// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupSourceEndpointRequest extends TeaModel {
    /**
     * <p>The backup gateway ID. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <blockquote>
     * <p>You must specify this parameter when <strong>SourceEndpointInstanceType</strong> is Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>21321323213</p>
     */
    @NameInMap("BackupGatewayId")
    public Long backupGatewayId;

    /**
     * <p>The backup objects. This parameter is optional when SourceEndpointInstanceType is Agent. For all other cases, you must specify it. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * 
     * <strong>example:</strong>
     * <p>[{  &quot;DBName&quot;:&quot;待备份库名&quot;, &quot;SchemaName&quot;:&quot;待备份 Schema 名&quot;, &quot;TableIncludes&quot;:[{ &quot;TableName&quot;:&quot;待备份表表名&quot; }],  &quot;TableExcludes&quot;:[{&quot;TableName&quot;:&quot;待备份库名不需要备份表的表名&quot; }] } ]</p>
     */
    @NameInMap("BackupObjects")
    public String backupObjects;

    /**
     * <p>The backup plan ID. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1h****usfa</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>A unique string that ensures idempotence and prevents duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The UID of the Alibaba Cloud account used for cross-account backup. Call <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> to get this value.</p>
     * 
     * <strong>example:</strong>
     * <p>2xxx7778xxxxxxxxxx</p>
     */
    @NameInMap("CrossAliyunId")
    public String crossAliyunId;

    /**
     * <p>The RAM role name used for cross-account backup. Call <a href="https://help.aliyun.com/document_detail/2869838.html">DescribeRestoreTaskList</a> to get this value.</p>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("CrossRoleName")
    public String crossRoleName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSourceEndpointSsl")
    public String enableSourceEndpointSsl;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The database name.</p>
     * <ul>
     * <li><p>You must specify this parameter for PostgreSQL or MongoDB databases.</p>
     * </li>
     * <li><p>You must specify this parameter for Microsoft SQL Server databases connected through a backup gateway.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    /**
     * <p>The database endpoint. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <blockquote>
     * <p>You must specify this parameter when <strong>SourceEndpointInstanceType</strong> is Express, Agent, or Other.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100.<em>.</em>.10:3306</p>
     */
    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    /**
     * <p>The database instance ID. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <blockquote>
     * <p>You must specify this parameter when <strong>SourceEndpointInstanceType</strong> is RDS, ECS, DDS, or Express.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1p8c29479jv****</p>
     */
    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    /**
     * <p>The location of the database. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>ECS</strong></p>
     * </li>
     * <li><p><strong>Express</strong>: A database connected through a leased line, VPN Gateway, or Smart Access Gateway</p>
     * </li>
     * <li><p><strong>Agent</strong>: A database connected through a backup gateway</p>
     * </li>
     * <li><p><strong>DDS</strong>: A MongoDB instance on Alibaba Cloud</p>
     * </li>
     * <li><p><strong>Other</strong>: A database connected directly using an IP address and port</p>
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
     * <p>The Oracle system ID (SID). You must specify this parameter for Oracle databases.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    /**
     * <p>The password.</p>
     * <p>This parameter is optional for Redis databases or for Microsoft SQL Server databases connected through a backup gateway. For all other cases, you must specify it.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    /**
     * <p>The database port. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <blockquote>
     * <p>You must specify this parameter when <strong>SourceEndpointInstanceType</strong> is Express, Agent, Other, or ECS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("SourceEndpointPort")
    public Integer sourceEndpointPort;

    /**
     * <p>The region where the database is located. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <blockquote>
     * <p>You must specify this parameter when <strong>SourceEndpointInstanceType</strong> is RDS, ECS, DDS, Express, or Agent.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    /**
     * <p>The database account. Call <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> to get this value.</p>
     * <p>This parameter is optional for Redis databases or for Microsoft SQL Server databases connected through a backup gateway. For all other cases, you must specify it.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- ... -----END CERTIFICATE-----</p>
     */
    @NameInMap("SslCaPem")
    public String sslCaPem;

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

    public ModifyBackupSourceEndpointRequest setEnableSourceEndpointSsl(String enableSourceEndpointSsl) {
        this.enableSourceEndpointSsl = enableSourceEndpointSsl;
        return this;
    }
    public String getEnableSourceEndpointSsl() {
        return this.enableSourceEndpointSsl;
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

    public ModifyBackupSourceEndpointRequest setSourceEndpointOracleHome(String sourceEndpointOracleHome) {
        this.sourceEndpointOracleHome = sourceEndpointOracleHome;
        return this;
    }
    public String getSourceEndpointOracleHome() {
        return this.sourceEndpointOracleHome;
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

    public ModifyBackupSourceEndpointRequest setSslCaPem(String sslCaPem) {
        this.sslCaPem = sslCaPem;
        return this;
    }
    public String getSslCaPem() {
        return this.sslCaPem;
    }

}
