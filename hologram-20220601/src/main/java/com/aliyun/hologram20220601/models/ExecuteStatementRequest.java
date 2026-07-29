// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ExecuteStatementRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>The maximum size of the response, in bytes. Default: 10,485,760 (10 MB). If the response size exceeds this limit, it is truncated, as indicated by the Truncated field in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("maxBytes")
    public Long maxBytes;

    /**
     * <p>The maximum number of rows to return. Default: 200. Maximum: 1,000. If the result set exceeds this limit, it is truncated, as indicated by the <code>Truncated</code> field in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("maxRows")
    public Long maxRows;

    /**
     * <p>An array of bound parameters for a parameterized query. These parameters map sequentially to placeholders (e.g., <code>$1</code>, <code>$2</code>) in the SQL statement. Supported types include <code>String</code>, <code>Long</code>, <code>Double</code>, <code>Boolean</code>, and <code>null</code> (for SQL <code>NULL</code>). Using parameterized queries helps prevent SQL injection and improves the cache reuse rate for prepared statements. These parameters apply to all SQL statements in the sql field.</p>
     */
    @NameInMap("parameters")
    public java.util.List<?> parameters;

    /**
     * <p>The query timeout, in seconds. Default: 30. Maximum: 30. Minimum: 1. If a query exceeds this time limit, the server cancels it.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("queryTimeout")
    public Long queryTimeout;

    /**
     * <p>The SQL statement to execute. The maximum length is 16,384 characters. You can specify multiple SQL statements separated by semicolons. If multiple statements are provided, the API returns the result of the last statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from test_table limit 10;</p>
     */
    @NameInMap("sql")
    public String sql;

    public static ExecuteStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementRequest self = new ExecuteStatementRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ExecuteStatementRequest setMaxBytes(Long maxBytes) {
        this.maxBytes = maxBytes;
        return this;
    }
    public Long getMaxBytes() {
        return this.maxBytes;
    }

    public ExecuteStatementRequest setMaxRows(Long maxRows) {
        this.maxRows = maxRows;
        return this;
    }
    public Long getMaxRows() {
        return this.maxRows;
    }

    public ExecuteStatementRequest setParameters(java.util.List<?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<?> getParameters() {
        return this.parameters;
    }

    public ExecuteStatementRequest setQueryTimeout(Long queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }
    public Long getQueryTimeout() {
        return this.queryTimeout;
    }

    public ExecuteStatementRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
