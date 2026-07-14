// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ExecuteStatementShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adbtest</p>
     */
    @NameInMap("Database")
    public String database;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of configuration parameters.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The vector dataset parameters.</p>
     * <blockquote>
     * <p>If WorkspaceId is not empty, this parameter is required.</p>
     * </blockquote>
     */
    @NameInMap("RagWorkspaceCollection")
    public String ragWorkspaceCollectionShrink;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The run type. Valid values:</p>
     * <ul>
     * <li>synchronous: synchronous execution.</li>
     * <li>asynchronous: asynchronous execution. Currently not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>synchronous</p>
     */
    @NameInMap("RunType")
    public String runType;

    /**
     * <p>The access credential. Created by calling the CreateSecret operation.</p>
     * <blockquote>
     * <p>When you access this operation by using a RAM user, you must have the UseSecret or GetSecretValue permission on this SecretArn.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
     */
    @NameInMap("SecretArn")
    public String secretArn;

    /**
     * <p>The SQL statement to execute.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table1</p>
     */
    @NameInMap("Sql")
    public String sql;

    /**
     * <p>The list of multiple SQL statements.</p>
     */
    @NameInMap("Sqls")
    public String sqlsShrink;

    /**
     * <p>The name of the execution statement. This parameter takes effect only when RunType is set to asynchronous.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StatementName")
    public String statementName;

    /**
     * <p>The ID of the workspace that consists of multiple database instances. This parameter and DBInstanceId cannot both be empty. If both this parameter and DBInstanceId are specified, this parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExecuteStatementShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementShrinkRequest self = new ExecuteStatementShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ExecuteStatementShrinkRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ExecuteStatementShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExecuteStatementShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public ExecuteStatementShrinkRequest setRagWorkspaceCollectionShrink(String ragWorkspaceCollectionShrink) {
        this.ragWorkspaceCollectionShrink = ragWorkspaceCollectionShrink;
        return this;
    }
    public String getRagWorkspaceCollectionShrink() {
        return this.ragWorkspaceCollectionShrink;
    }

    public ExecuteStatementShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteStatementShrinkRequest setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public ExecuteStatementShrinkRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public ExecuteStatementShrinkRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteStatementShrinkRequest setSqlsShrink(String sqlsShrink) {
        this.sqlsShrink = sqlsShrink;
        return this;
    }
    public String getSqlsShrink() {
        return this.sqlsShrink;
    }

    public ExecuteStatementShrinkRequest setStatementName(String statementName) {
        this.statementName = statementName;
        return this;
    }
    public String getStatementName() {
        return this.statementName;
    }

    public ExecuteStatementShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
