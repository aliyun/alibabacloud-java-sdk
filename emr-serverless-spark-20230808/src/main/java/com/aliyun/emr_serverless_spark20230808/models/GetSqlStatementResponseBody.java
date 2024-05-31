// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetSqlStatementResponseBody extends TeaModel {
    @NameInMap("data")
    public GetSqlStatementResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static GetSqlStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlStatementResponseBody self = new GetSqlStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlStatementResponseBody setData(GetSqlStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSqlStatementResponseBodyData getData() {
        return this.data;
    }

    public GetSqlStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSqlStatementResponseBodyDataSqlOutputs extends TeaModel {
        @NameInMap("rows")
        public String rows;

        @NameInMap("schema")
        public String schema;

        public static GetSqlStatementResponseBodyDataSqlOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetSqlStatementResponseBodyDataSqlOutputs self = new GetSqlStatementResponseBodyDataSqlOutputs();
            return TeaModel.build(map, self);
        }

        public GetSqlStatementResponseBodyDataSqlOutputs setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetSqlStatementResponseBodyDataSqlOutputs setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class GetSqlStatementResponseBodyData extends TeaModel {
        @NameInMap("executionTime")
        public java.util.List<Long> executionTime;

        @NameInMap("sqlErrorCode")
        public String sqlErrorCode;

        @NameInMap("sqlErrorMessage")
        public String sqlErrorMessage;

        @NameInMap("sqlOutputs")
        public java.util.List<GetSqlStatementResponseBodyDataSqlOutputs> sqlOutputs;

        @NameInMap("state")
        public String state;

        @NameInMap("statementId")
        public String statementId;

        public static GetSqlStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlStatementResponseBodyData self = new GetSqlStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlStatementResponseBodyData setExecutionTime(java.util.List<Long> executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public java.util.List<Long> getExecutionTime() {
            return this.executionTime;
        }

        public GetSqlStatementResponseBodyData setSqlErrorCode(String sqlErrorCode) {
            this.sqlErrorCode = sqlErrorCode;
            return this;
        }
        public String getSqlErrorCode() {
            return this.sqlErrorCode;
        }

        public GetSqlStatementResponseBodyData setSqlErrorMessage(String sqlErrorMessage) {
            this.sqlErrorMessage = sqlErrorMessage;
            return this;
        }
        public String getSqlErrorMessage() {
            return this.sqlErrorMessage;
        }

        public GetSqlStatementResponseBodyData setSqlOutputs(java.util.List<GetSqlStatementResponseBodyDataSqlOutputs> sqlOutputs) {
            this.sqlOutputs = sqlOutputs;
            return this;
        }
        public java.util.List<GetSqlStatementResponseBodyDataSqlOutputs> getSqlOutputs() {
            return this.sqlOutputs;
        }

        public GetSqlStatementResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetSqlStatementResponseBodyData setStatementId(String statementId) {
            this.statementId = statementId;
            return this;
        }
        public String getStatementId() {
            return this.statementId;
        }

    }

}
