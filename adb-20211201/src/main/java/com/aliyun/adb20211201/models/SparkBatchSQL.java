// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkBatchSQL extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp17s73f016****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The error message for the query execution.</p>
     * 
     * <strong>example:</strong>
     * <p>schema is not found</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The text of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM db.tb</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The execution end timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("QueryEndTime")
    public Long queryEndTime;

    /**
     * <p>The query ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sq172352176****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The execution start timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("QueryStartTime")
    public Long queryStartTime;

    /**
     * <p>The execution status of the query. Valid values:</p>
     * <ul>
     * <li>FAILED</li>
     * <li>RUNNING</li>
     * <li>CANCELED</li>
     * <li>PENDING</li>
     * <li>SUBMITTED</li>
     * <li>FINISHED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("QueryState")
    public String queryState;

    /**
     * <p>The submission timestamp of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("QuerySubmissionTime")
    public Long querySubmissionTime;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>spark_rg</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The name of the database for the query execution.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The execution results of the SQL statements.</p>
     */
    @NameInMap("Statements")
    public java.util.List<SparkBatchSQLStatement> statements;

    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2198002412336****</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static SparkBatchSQL build(java.util.Map<String, ?> map) throws Exception {
        SparkBatchSQL self = new SparkBatchSQL();
        return TeaModel.build(map, self);
    }

    public SparkBatchSQL setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SparkBatchSQL setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SparkBatchSQL setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SparkBatchSQL setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public Long getQueryEndTime() {
        return this.queryEndTime;
    }

    public SparkBatchSQL setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public SparkBatchSQL setQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public Long getQueryStartTime() {
        return this.queryStartTime;
    }

    public SparkBatchSQL setQueryState(String queryState) {
        this.queryState = queryState;
        return this;
    }
    public String getQueryState() {
        return this.queryState;
    }

    public SparkBatchSQL setQuerySubmissionTime(Long querySubmissionTime) {
        this.querySubmissionTime = querySubmissionTime;
        return this;
    }
    public Long getQuerySubmissionTime() {
        return this.querySubmissionTime;
    }

    public SparkBatchSQL setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public SparkBatchSQL setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public SparkBatchSQL setStatements(java.util.List<SparkBatchSQLStatement> statements) {
        this.statements = statements;
        return this;
    }
    public java.util.List<SparkBatchSQLStatement> getStatements() {
        return this.statements;
    }

    public SparkBatchSQL setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
