// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ExecuteStatementResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteStatementResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParameterValue</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("nullable")
        public Boolean nullable;

        /**
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
        @NameInMap("columnMetadata")
        public java.util.List<ExecuteStatementResponseBodyDataResultsColumnMetadata> columnMetadata;

        @NameInMap("count")
        public Integer count;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p><strong>Query ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>E3F4B2A7-1234-5678-9ABC-DEF012345678</p>
         */
        @NameInMap("queryId")
        public String queryId;

        @NameInMap("records")
        public java.util.List<java.util.List<String>> records;

        @NameInMap("sql")
        public String sql;

        @NameInMap("success")
        public Boolean success;

        @NameInMap("truncated")
        public Boolean truncated;

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
         * <strong>example:</strong>
         * <p>InvalidParameterValue</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("results")
        public java.util.List<ExecuteStatementResponseBodyDataResults> results;

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
