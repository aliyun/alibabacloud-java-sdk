// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class StatementResult extends TeaModel {
    /**
     * <p>The presigned URL of the Arrow IPC file. This parameter is returned when a result set exists. The URL is valid for 1 hour and contains full data. The value is null for an empty result set (rowCount == 0).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.oss-cn-hangzhou.aliyuncs.com/xxxx">https://xxx.oss-cn-hangzhou.aliyuncs.com/xxxx</a></p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>The error message. This parameter is returned only when the status is FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL_ERROR</p>
     */
    @NameInMap("error")
    public String error;

    /**
     * <p>The error code. This parameter is returned only when the status is FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>This feature is not implemented: xxx</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The execution duration of the statement, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("executionTime")
    public Long executionTime;

    /**
     * <p>The statement sequence number (0-based).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("index")
    public Integer index;

    /**
     * <p>The total number of rows in the result. The value is 0 for statements that do not return a result set.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("rowCount")
    public Integer rowCount;

    /**
     * <p>The result column information. This parameter is returned when a result set exists.</p>
     */
    @NameInMap("schema")
    public java.util.List<StatementResultSchema> schema;

    /**
     * <p>The SQL text of the statement.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table_name;</p>
     */
    @NameInMap("sql")
    public String sql;

    /**
     * <p>The status of the statement. Valid values: COMPLETED and FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
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
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
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
