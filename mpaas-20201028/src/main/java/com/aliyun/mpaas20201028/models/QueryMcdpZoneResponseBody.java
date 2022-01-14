// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcdpZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryMcdpZoneResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMcdpZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcdpZoneResponseBody self = new QueryMcdpZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcdpZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcdpZoneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcdpZoneResponseBody setResultContent(QueryMcdpZoneResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryMcdpZoneResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryMcdpZoneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMcdpZoneResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMcdpZoneResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMcdpZoneResponseBodyResultContent self = new QueryMcdpZoneResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryMcdpZoneResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMcdpZoneResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMcdpZoneResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMcdpZoneResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
