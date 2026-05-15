// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ExecuteStatementRequest extends TeaModel {
    @NameInMap("dbName")
    public String dbName;

    @NameInMap("maxBytes")
    public Long maxBytes;

    @NameInMap("maxRows")
    public Long maxRows;

    @NameInMap("parameters")
    public java.util.List<?> parameters;

    @NameInMap("queryTimeout")
    public Long queryTimeout;

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
