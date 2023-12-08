// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetErrorRequestSampleResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetErrorRequestSampleResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
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
    public Boolean success;

    public static GetErrorRequestSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErrorRequestSampleResponseBody self = new GetErrorRequestSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErrorRequestSampleResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetErrorRequestSampleResponseBody setData(java.util.List<GetErrorRequestSampleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetErrorRequestSampleResponseBodyData> getData() {
        return this.data;
    }

    public GetErrorRequestSampleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetErrorRequestSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetErrorRequestSampleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetErrorRequestSampleResponseBodyData extends TeaModel {
        /**
         * <p>The database name.</p>
         */
        @NameInMap("database")
        public String database;

        /**
         * <p>The error code that is returned.</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The IP address of the client that executes the SQL statement.</p>
         */
        @NameInMap("originHost")
        public String originHost;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("sql")
        public String sql;

        /**
         * <p>The SQL query ID.</p>
         */
        @NameInMap("sqlId")
        public String sqlId;

        /**
         * <p>The table information.</p>
         */
        @NameInMap("tables")
        public java.util.List<String> tables;

        /**
         * <p>The time when the SQL query was executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The username of the account that is used to log on to the database.</p>
         */
        @NameInMap("user")
        public String user;

        public static GetErrorRequestSampleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetErrorRequestSampleResponseBodyData self = new GetErrorRequestSampleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetErrorRequestSampleResponseBodyData setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public GetErrorRequestSampleResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetErrorRequestSampleResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetErrorRequestSampleResponseBodyData setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public GetErrorRequestSampleResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GetErrorRequestSampleResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetErrorRequestSampleResponseBodyData setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

        public GetErrorRequestSampleResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetErrorRequestSampleResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
