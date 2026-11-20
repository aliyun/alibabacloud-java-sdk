// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ExecuteStatementRequest extends TeaModel {
    /**
     * <p>The database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>The maximum amount of data to return in a single request, in bytes. Default value: 10485760 (10 MB). Excess data is truncated and indicated by setting truncated to true.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("maxBytes")
    public Long maxBytes;

    /**
     * <p>The maximum number of rows to return. Default value: 200. Maximum value: 1000. Excess rows are truncated and indicated by the Truncated field in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("maxRows")
    public Long maxRows;

    /**
     * <p>The list of parameters to attach to the SQL parameterized query, which correspond in sequence to placeholders such as $1 and $2 in the SQL statement. Supported value types include String, Long, Double, Boolean, and null, which represents NULL. Using a parameterized query effectively prevents SQL injection and improves the cache reuse rate of precompiled statements. The parameter list applies to each SQL statement in Statements.</p>
     */
    @NameInMap("parameters")
    public java.util.List<?> parameters;

    /**
     * <p>The timeout period for SQL execution, in seconds. Default value: 30. Maximum value: 30. Minimum value: 1. If a timeout occurs, the server actively cancels the query.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("queryTimeout")
    public Long queryTimeout;

    /**
     * <p>The SQL statement to be executed. The maximum length is 16,384 characters. Multiple SQL statements separated by semicolons are supported. If multiple statements are specified, the result of the last statement is returned.</p>
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
