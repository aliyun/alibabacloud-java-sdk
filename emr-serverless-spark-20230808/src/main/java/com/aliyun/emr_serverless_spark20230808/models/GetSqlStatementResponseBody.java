// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetSqlStatementResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetSqlStatementResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
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
        /**
         * <p>The queried data, which is a string in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;values\&quot;:[\&quot;test_db\&quot;,\&quot;test_table\&quot;,false]}</p>
         */
        @NameInMap("rows")
        public String rows;

        /**
         * <p>The information about the schema, which is a string in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;struct\&quot;,\&quot;fields\&quot;:[{\&quot;name\&quot;:\&quot;namespace\&quot;,\&quot;type\&quot;:\&quot;string\&quot;,\&quot;nullable\&quot;:false,\&quot;metadata\&quot;:{}},{\&quot;name\&quot;:\&quot;tableName\&quot;,\&quot;type\&quot;:\&quot;string\&quot;,\&quot;nullable\&quot;:false,\&quot;metadata\&quot;:{}},{\&quot;name\&quot;:\&quot;isTemporary\&quot;,\&quot;type\&quot;:\&quot;boolean\&quot;,\&quot;nullable\&quot;:false,\&quot;metadata\&quot;:{}}]}</p>
         */
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
        /**
         * <p>The list of time that is consumed by SQL queries.</p>
         */
        @NameInMap("executionTime")
        public java.util.List<Long> executionTime;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-102</p>
         */
        @NameInMap("sqlErrorCode")
        public String sqlErrorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        @NameInMap("sqlErrorMessage")
        public String sqlErrorMessage;

        /**
         * <p>The query results.</p>
         */
        @NameInMap("sqlOutputs")
        public java.util.List<GetSqlStatementResponseBodyDataSqlOutputs> sqlOutputs;

        /**
         * <p>The query status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>running</li>
         * <li>available</li>
         * <li>cancelled</li>
         * <li>error</li>
         * <li>cancelling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The query ID.</p>
         * 
         * <strong>example:</strong>
         * <p>st-1231311abadfaa</p>
         */
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
