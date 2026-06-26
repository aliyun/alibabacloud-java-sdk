// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class StatementResult extends TeaModel {
    /**
     * <p>A temporary URL to download the result set, provided only when the result set is too large to return directly.</p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>The error message, present only if the execution fails.</p>
     */
    @NameInMap("error")
    public String error;

    /**
     * <p>The error code, present only if the execution fails.</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The statement\&quot;s total execution time, in milliseconds.</p>
     */
    @NameInMap("executionTime")
    public Long executionTime;

    /**
     * <p>The zero-based index of the SQL statement in a batch execution.</p>
     */
    @NameInMap("index")
    public Integer index;

    /**
     * <p>The number of rows affected or returned by the statement.</p>
     */
    @NameInMap("rowCount")
    public Integer rowCount;

    /**
     * <p>An array of objects describing the result set\&quot;s schema. Each object defines a column.</p>
     */
    @NameInMap("schema")
    public java.util.List<StatementResultSchema> schema;

    /**
     * <p>The original SQL statement.</p>
     */
    @NameInMap("sql")
    public String sql;

    /**
     * <p>The statement\&quot;s execution status. Possible values are <code>RUNNING</code>, <code>FINISHED</code>, <code>CANCELED</code>, or <code>FAILED</code>.</p>
     */
    @NameInMap("status")
    public String status;

    public static StatementResult build(java.util.Map<String, ?> map) throws Exception {
        StatementResult self = new StatementResult();
        return TeaModel.build(map, self);
    }

    public StatementResult setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public StatementResult setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public StatementResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StatementResult setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public Long getExecutionTime() {
        return this.executionTime;
    }

    public StatementResult setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public StatementResult setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Integer getRowCount() {
        return this.rowCount;
    }

    public StatementResult setSchema(java.util.List<StatementResultSchema> schema) {
        this.schema = schema;
        return this;
    }
    public java.util.List<StatementResultSchema> getSchema() {
        return this.schema;
    }

    public StatementResult setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public StatementResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class StatementResultSchema extends TeaModel {
        /**
         * <p>The name of the column.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The data type of the column.</p>
         */
        @NameInMap("type")
        public String type;

        public static StatementResultSchema build(java.util.Map<String, ?> map) throws Exception {
            StatementResultSchema self = new StatementResultSchema();
            return TeaModel.build(map, self);
        }

        public StatementResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public StatementResultSchema setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
