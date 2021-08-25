// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class QueryAsynTokenResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public QueryAsynTokenResultResponseBodyData data;

    public static QueryAsynTokenResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAsynTokenResultResponseBody self = new QueryAsynTokenResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAsynTokenResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAsynTokenResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAsynTokenResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAsynTokenResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public QueryAsynTokenResultResponseBody setData(QueryAsynTokenResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAsynTokenResultResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAsynTokenResultResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        public static QueryAsynTokenResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAsynTokenResultResponseBodyData self = new QueryAsynTokenResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAsynTokenResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryAsynTokenResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
