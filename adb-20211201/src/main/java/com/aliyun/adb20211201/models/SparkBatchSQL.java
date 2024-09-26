// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkBatchSQL extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>amv-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>schema is not found</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>query</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("QueryEndTime")
    public Long queryEndTime;

    /**
     * <strong>example:</strong>
     * <p>amv-202401-xx</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("QueryStartTime")
    public Long queryStartTime;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("QueryState")
    public String queryState;

    /**
     * <strong>example:</strong>
     * <p>1723521767000</p>
     */
    @NameInMap("QuerySubmissionTime")
    public Long querySubmissionTime;

    /**
     * <strong>example:</strong>
     * <p>spark_rg</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Schema")
    public String schema;

    @NameInMap("Statements")
    public java.util.List<SparkBatchSQLStatement> statements;

    /**
     * <strong>example:</strong>
     * <p>12222222</p>
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
