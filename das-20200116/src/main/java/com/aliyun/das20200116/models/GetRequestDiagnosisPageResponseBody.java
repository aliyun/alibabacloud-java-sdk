// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetRequestDiagnosisPageResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, Successful is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
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

    public static GetRequestDiagnosisPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisPageResponseBody self = new GetRequestDiagnosisPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRequestDiagnosisPageResponseBody setData(GetRequestDiagnosisPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRequestDiagnosisPageResponseBodyData getData() {
        return this.data;
    }

    public GetRequestDiagnosisPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRequestDiagnosisPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRequestDiagnosisPageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRequestDiagnosisPageResponseBodyDataList extends TeaModel {
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
         * <p>* **MySQL**</p>
         * <p>* **PostgreSQL**</p>
         * <p>* **SQLServer**</p>
         * <p>* **PolarDBMySQL**</p>
         * <p>* **PolarDBOracle**</p>
         * <p>* **MongoDB**</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The time when the SQL diagnostics task was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>Additional information.</p>
         */
        @NameInMap("param")
        public String param;

        /**
         * <p>The result of the SQL diagnostics task. The result includes the following information:</p>
         * <br>
         * <p>* **endTime**: the end time of the SQL diagnostics task.</p>
         * <p>* **errorCode**: indicates whether the SQL diagnostics task is complete. Valid values:</p>
         * <p>  * **0001**: The SQL diagnostics task is complete.</p>
         * <p>  * **0003**: The SQL diagnostics task failed.</p>
         * <br>
         * <p>* **errorMessage**: the error message.</p>
         * <p>* **estimateCost**: the estimated cost.</p>
         * <p>  * **cpu**: the estimated CPU utilization of the index.</p>
         * <p>  * **io**: the estimated I/O usage of the index.</p>
         * <p>  * **rows**: the estimated values of the rows returned for the index.</p>
         * <p>* **improvement**: the performance improvement ratio.</p>
         * <p>* **indexAdvices**: the index recommendations, which include the following information:</p>
         * <p>  * **columns**: the index columns.</p>
         * <p>  * **ddlAddIndex**: the DDL statement for the index.</p>
         * <p>  * **indexName**: the name of the index.</p>
         * <p>  * **schemaName**: the name of the database.</p>
         * <p>  * **tableName**: the name of the table.</p>
         * <p>  * **unique**: indicates whether the index is unique.</p>
         * <br>
         * <p>* **ip**: the IP address of the instance.</p>
         * <p>* **messageId**: the ID of the diagnostics task.</p>
         * <p>* **port**: the port used to connect to the instance.</p>
         * <p>* **sqlTag**: the SQL tag.</p>
         * <p>* **startTime**: the start time of the SQL diagnostics task.</p>
         * <p>* **success**: indicates whether the request was successful.</p>
         * <p>* **support**: indicates whether the SQL statement can be diagnosed. Valid values:</p>
         * <p>  * **true**: The SQL statement can be diagnosed.</p>
         * <p>  * **false**: The SQL statement cannot be diagnosed.</p>
         * <br>
         * <p>* **tuningAdvices**: the SQL rewrite suggestions.</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The SQL template ID.</p>
         */
        @NameInMap("sqlId")
        public String sqlId;

        /**
         * <p>The status of the diagnostics task. Valid values:</p>
         * <br>
         * <p>* **0**: The diagnostics task is in progress.</p>
         * <br>
         * <p>* **1**: A diagnostics error occurred.</p>
         * <br>
         * <p>* **2**: The diagnostics task is complete.</p>
         * <br>
         * <p>* **3**: An SQL error occurred.</p>
         * <br>
         * <p>* **4**: An engine error occurred.</p>
         */
        @NameInMap("state")
        public Integer state;

        /**
         * <p>The unique ID of the diagnostics instance.</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static GetRequestDiagnosisPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetRequestDiagnosisPageResponseBodyDataList self = new GetRequestDiagnosisPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetRequestDiagnosisPageResponseBodyDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setDbSchema(String dbSchema) {
            this.dbSchema = dbSchema;
            return this;
        }
        public String getDbSchema() {
            return this.dbSchema;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public GetRequestDiagnosisPageResponseBodyDataList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetRequestDiagnosisPageResponseBodyData extends TeaModel {
        /**
         * <p>Additional information.</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>The SQL diagnostics records returned.</p>
         */
        @NameInMap("list")
        public java.util.List<GetRequestDiagnosisPageResponseBodyDataList> list;

        /**
         * <p>The page number. The value must be a positive integer. Default value: 1.</p>
         */
        @NameInMap("pageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page. The value must be a positive integer. Default value: 10.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("total")
        public Long total;

        public static GetRequestDiagnosisPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRequestDiagnosisPageResponseBodyData self = new GetRequestDiagnosisPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRequestDiagnosisPageResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetRequestDiagnosisPageResponseBodyData setList(java.util.List<GetRequestDiagnosisPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetRequestDiagnosisPageResponseBodyDataList> getList() {
            return this.list;
        }

        public GetRequestDiagnosisPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetRequestDiagnosisPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetRequestDiagnosisPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
