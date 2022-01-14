// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcdpAimResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryMcdpAimResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMcdpAimResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcdpAimResponseBody self = new QueryMcdpAimResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcdpAimResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcdpAimResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcdpAimResponseBody setResultContent(QueryMcdpAimResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryMcdpAimResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryMcdpAimResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMcdpAimResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMcdpAimResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMcdpAimResponseBodyResultContent self = new QueryMcdpAimResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryMcdpAimResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMcdpAimResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMcdpAimResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMcdpAimResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
