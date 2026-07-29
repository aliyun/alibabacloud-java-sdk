// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ExecuteStatementResponseBody extends TeaModel {
    /**
     * <p>The execution result of the SQL statement.</p>
     */
    @NameInMap("data")
    public ExecuteStatementResponseBodyData data;

    /**
     * <p>The error code. This parameter is returned only if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameterValue</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This parameter is returned only if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>参数值不合法（如 SQL 为空、超长等）</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static ExecuteStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementResponseBody self = new ExecuteStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementResponseBody setData(ExecuteStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteStatementResponseBodyData getData() {
        return this.data;
    }

    public ExecuteStatementResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExecuteStatementResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecuteStatementResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteStatementResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ExecuteStatementResponseBodyDataResultsColumnMetadata extends TeaModel {
        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the column can be null.</p>
         */
        @NameInMap("nullable")
        public Boolean nullable;

        /**
         * <p>The data type of the column, such as <code>int4</code>, <code>text</code>, or <code>bool</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>int4</p>
         */
        @NameInMap("type")
        public String type;

        public static ExecuteStatementResponseBodyDataResultsColumnMetadata build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyDataResultsColumnMetadata self = new ExecuteStatementResponseBodyDataResultsColumnMetadata();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyDataResultsColumnMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecuteStatementResponseBodyDataResultsColumnMetadata setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ExecuteStatementResponseBodyDataResultsColumnMetadata setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ExecuteStatementResponseBodyDataResults extends TeaModel {
        /**
         * <p>The metadata of columns in the result set.</p>
         */
        @NameInMap("columnMetadata")
        public java.util.List<ExecuteStatementResponseBodyDataResultsColumnMetadata> columnMetadata;

        /**
         * <p>The number of rows returned by a SELECT statement.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The error code for the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL_ERROR</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message for the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR: relation \&quot;non_existent_table\&quot; does not exist\n  Position: 15</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>E3F4B2A7-1234-5678-9ABC-DEF012345678</p>
         */
        @NameInMap("queryId")
        public String queryId;

        /**
         * <p>The set of records that are returned by the query. Each row is an array of strings, and all values are serialized as strings. A NULL value is represented as &quot;\N&quot;.</p>
         */
        @NameInMap("records")
        public java.util.List<java.util.List<String>> records;

        /**
         * <p>The executed SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test_table limit 10;</p>
         */
        @NameInMap("sql")
        public String sql;

        /**
         * <p>Indicates whether the SQL statement was executed successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("success")
        public Boolean success;

        /**
         * <p>Indicates whether the result set was truncated. The value is <code>true</code> if the number of returned rows exceeds the value of <code>MaxResults</code>.</p>
         */
        @NameInMap("truncated")
        public Boolean truncated;

        /**
         * <p>The number of rows affected by an INSERT, UPDATE, or DELETE statement. This parameter is not returned for SELECT statements.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("updateCount")
        public Integer updateCount;

        public static ExecuteStatementResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyDataResults self = new ExecuteStatementResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyDataResults setColumnMetadata(java.util.List<ExecuteStatementResponseBodyDataResultsColumnMetadata> columnMetadata) {
            this.columnMetadata = columnMetadata;
            return this;
        }
        public java.util.List<ExecuteStatementResponseBodyDataResultsColumnMetadata> getColumnMetadata() {
            return this.columnMetadata;
        }

        public ExecuteStatementResponseBodyDataResults setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ExecuteStatementResponseBodyDataResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ExecuteStatementResponseBodyDataResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ExecuteStatementResponseBodyDataResults setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public ExecuteStatementResponseBodyDataResults setRecords(java.util.List<java.util.List<String>> records) {
            this.records = records;
            return this;
        }
        public java.util.List<java.util.List<String>> getRecords() {
            return this.records;
        }

        public ExecuteStatementResponseBodyDataResults setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public ExecuteStatementResponseBodyDataResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ExecuteStatementResponseBodyDataResults setTruncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }
        public Boolean getTruncated() {
            return this.truncated;
        }

        public ExecuteStatementResponseBodyDataResults setUpdateCount(Integer updateCount) {
            this.updateCount = updateCount;
            return this;
        }
        public Integer getUpdateCount() {
            return this.updateCount;
        }

    }

    public static class ExecuteStatementResponseBodyData extends TeaModel {
        /**
         * <p>The error code for the SQL statement execution. This parameter is returned only if the execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameterValue</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message for the SQL statement execution. This parameter is returned only if the execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>参数值不合法（如 SQL 为空、超长等）</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>A list of execution results. This list always contains exactly one result object. If you execute multiple SELECT statements, only the result of the last one is returned.</p>
         */
        @NameInMap("results")
        public java.util.List<ExecuteStatementResponseBodyDataResults> results;

        /**
         * <p>Indicates whether the SQL statement was executed successfully.</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static ExecuteStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteStatementResponseBodyData self = new ExecuteStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteStatementResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ExecuteStatementResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ExecuteStatementResponseBodyData setResults(java.util.List<ExecuteStatementResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ExecuteStatementResponseBodyDataResults> getResults() {
            return this.results;
        }

        public ExecuteStatementResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
