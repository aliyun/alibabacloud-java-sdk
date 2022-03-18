// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetErrorRequestSampleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetErrorRequestSampleResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("database")
        public String database;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("originHost")
        public String originHost;

        @NameInMap("sql")
        public String sql;

        @NameInMap("sqlId")
        public String sqlId;

        @NameInMap("tables")
        public java.util.List<String> tables;

        @NameInMap("timestamp")
        public Long timestamp;

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
