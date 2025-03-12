// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ExecuteStatementRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
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
     * <p>The configuration parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<?> parameters;

    @NameInMap("RagWorkspaceCollection")
    public ExecuteStatementRequestRagWorkspaceCollection ragWorkspaceCollection;

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
     * <p>The execution type. Valid values:</p>
     * <ul>
     * <li>synchronous</li>
     * <li>asynchronous (not supported)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>synchronous</p>
     */
    @NameInMap("RunType")
    public String runType;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the access credential for the created Data API account. You can call the CreateSecret operation to create an access credential.</p>
     * <blockquote>
     * <p> To call the ExecuteStatement operation as a Resource Access Management (RAM) user, the RAM user must have the permissions to call the UseSecret or GetSecretValue operation on the ARN of the access credential.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:gpdb:cn-beijing:1033**:secret/testsecret-eG2AQGRIwQ0zFp4VA7mYL3uiCXTfDQbQ</p>
     */
    @NameInMap("SecretArn")
    public String secretArn;

    /**
     * <p>The SQL statements that you want to execute.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table1</p>
     */
    @NameInMap("Sql")
    public String sql;

    /**
     * <p>The SQL statements.</p>
     */
    @NameInMap("Sqls")
    public java.util.List<String> sqls;

    /**
     * <p>The name of the set of SQL statements that you want to execute. This parameter takes effect when the RunType parameter is set to asynchronous.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StatementName")
    public String statementName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExecuteStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementRequest self = new ExecuteStatementRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ExecuteStatementRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public ExecuteStatementRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExecuteStatementRequest setParameters(java.util.List<?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<?> getParameters() {
        return this.parameters;
    }

    public ExecuteStatementRequest setRagWorkspaceCollection(ExecuteStatementRequestRagWorkspaceCollection ragWorkspaceCollection) {
        this.ragWorkspaceCollection = ragWorkspaceCollection;
        return this;
    }
    public ExecuteStatementRequestRagWorkspaceCollection getRagWorkspaceCollection() {
        return this.ragWorkspaceCollection;
    }

    public ExecuteStatementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecuteStatementRequest setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public ExecuteStatementRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public ExecuteStatementRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public ExecuteStatementRequest setSqls(java.util.List<String> sqls) {
        this.sqls = sqls;
        return this;
    }
    public java.util.List<String> getSqls() {
        return this.sqls;
    }

    public ExecuteStatementRequest setStatementName(String statementName) {
        this.statementName = statementName;
        return this;
    }
    public String getStatementName() {
        return this.statementName;
    }

    public ExecuteStatementRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ExecuteStatementRequestRagWorkspaceCollection extends TeaModel {
        @NameInMap("Collection")
        public String collection;

        @NameInMap("Namespace")
        public String namespace;

        public static ExecuteStatementRequestRagWorkspaceCollection build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementRequestRagWorkspaceCollection self = new ExecuteStatementRequestRagWorkspaceCollection();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementRequestRagWorkspaceCollection setCollection(String collection) {
            this.collection = collection;
            return this;
        }
        public String getCollection() {
            return this.collection;
        }

        public ExecuteStatementRequestRagWorkspaceCollection setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}
