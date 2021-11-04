// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRequestDiagnosisResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("dbSchema")
        public String dbSchema;

        @NameInMap("engine")
        public String engine;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("messageId")
        public String messageId;

        @NameInMap("param")
        public String param;

        @NameInMap("result")
        public String result;

        @NameInMap("sqlId")
        public String sqlId;

        @NameInMap("state")
        public Integer state;

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
