// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetRequestDiagnosisResultResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetRequestDiagnosisResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisResultResponseBody self = new GetRequestDiagnosisResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRequestDiagnosisResultResponseBody setData(GetRequestDiagnosisResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRequestDiagnosisResultResponseBodyData getData() {
        return this.data;
    }

    public GetRequestDiagnosisResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRequestDiagnosisResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRequestDiagnosisResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRequestDiagnosisResultResponseBodyData extends TeaModel {
        /**
         * <p>The user ID.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("dbSchema")
        public String dbSchema;

        /**
         * <p>The database engine. Valid values:</p>
         * <br>
         * <p>*   **MySQL**</p>
         * <p>*   **PostgreSQL**</p>
         * <p>*   **SQLServer**</p>
         * <p>*   **PolarDBMySQL**</p>
         * <p>*   **PolarDBOracle**</p>
         * <p>*   **MongoDB**</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The time when the SQL diagnostics task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the SQL diagnostics task was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The unique ID of the diagnostics task.</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("param")
        public String param;

        /**
         * <p>The result of the SQL diagnostics task. The result includes the following information:</p>
         * <br>
         * <p>*   **endTime**: the end time of the SQL diagnostics task.</p>
         * <br>
         * <p>*   **errorCode**: the error code.</p>
         * <br>
         * <p>    *   **0001**: The SQL diagnostics task is complete.</p>
         * <p>    *   **0003**: The SQL diagnostics task failed.</p>
         * <br>
         * <p>*   **errorMessage**: the error message.</p>
         * <br>
         * <p>*   **estimateCost**: the estimated cost.</p>
         * <br>
         * <p>    *   **cpu**: the estimated CPU utilization of the index.</p>
         * <p>    *   **io**: the estimated I/O usage of the index.</p>
         * <p>    *   **rows**: the estimated values of the rows returned for the index.</p>
         * <br>
         * <p>*   **improvement**: the performance improvement ratio.</p>
         * <br>
         * <p>*   **indexAdvices**: the index recommendations, which include the following information:</p>
         * <br>
         * <p>    *   **columns**: the index columns.</p>
         * <p>    *   **ddlAddIndex**: the DDL statement for the index.</p>
         * <p>    *   **indexName**: the name of the index.</p>
         * <p>    *   **schemaName**: the name of the database.</p>
         * <p>    *   **tableName**: the name of the table.</p>
         * <p>    *   **unique**: indicates whether the index is unique.</p>
         * <br>
         * <p>*   **ip**: the IP address of the instance.</p>
         * <br>
         * <p>*   **messageId**: the ID of the diagnostics task.</p>
         * <br>
         * <p>*   **port**: the port used to connect to the instance.</p>
         * <br>
         * <p>*   **sqlTag**: the SQL tag.</p>
         * <br>
         * <p>*   **startTime**: the start time of the SQL diagnostics task.</p>
         * <br>
         * <p>*   **success**: indicates whether the request was successful.</p>
         * <br>
         * <p>*   **support**: indicates whether the SQL statement can be diagnosed. Valid values:</p>
         * <br>
         * <p>    *   **true**</p>
         * <p>    *   **false**</p>
         * <br>
         * <p>*   **tuningAdvices** : the SQL rewrite suggestions.</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The SQL template ID.</p>
         */
        @NameInMap("sqlId")
        public String sqlId;

        /**
         * <p>The state of the diagnostics task. Valid values:</p>
         * <br>
         * <p>*   **0**: The diagnostics task is in progress.</p>
         * <p>*   **1**: A diagnostics error occurred.</p>
         * <p>*   **2**: The diagnostics task is complete.</p>
         * <p>*   **3**: An SQL error occurred.</p>
         * <p>*   **4**: An engine error occurred.</p>
         */
        @NameInMap("state")
        public Integer state;

        /**
         * <p>The unique ID of the diagnostics instance.</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static GetRequestDiagnosisResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRequestDiagnosisResultResponseBodyData self = new GetRequestDiagnosisResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRequestDiagnosisResultResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetRequestDiagnosisResultResponseBodyData setDbSchema(String dbSchema) {
            this.dbSchema = dbSchema;
            return this;
        }
        public String getDbSchema() {
            return this.dbSchema;
        }

        public GetRequestDiagnosisResultResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetRequestDiagnosisResultResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetRequestDiagnosisResultResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetRequestDiagnosisResultResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetRequestDiagnosisResultResponseBodyData setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public GetRequestDiagnosisResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetRequestDiagnosisResultResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetRequestDiagnosisResultResponseBodyData setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetRequestDiagnosisResultResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
