// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRequestDiagnosisPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("extra")
        public String extra;

        @NameInMap("list")
        public java.util.List<GetRequestDiagnosisPageResponseBodyDataList> list;

        @NameInMap("pageNo")
        public Long pageNo;

        @NameInMap("pageSize")
        public Long pageSize;

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
