// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetCodeCompletionResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetCodeCompletionResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetCodeCompletionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCodeCompletionResponseBody self = new GetCodeCompletionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCodeCompletionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCodeCompletionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCodeCompletionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCodeCompletionResponseBody setResult(GetCodeCompletionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCodeCompletionResponseBodyResult getResult() {
        return this.result;
    }

    public GetCodeCompletionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCodeCompletionResponseBodyResult extends TeaModel {
        @NameInMap("Body")
        public String body;

        @NameInMap("ClientTimestamp")
        public String clientTimestamp;

        @NameInMap("FetchTimestamp")
        public String fetchTimestamp;

        @NameInMap("InvokeTimestamp")
        public String invokeTimestamp;

        @NameInMap("ReceiveTimestamp")
        public String receiveTimestamp;

        @NameInMap("RspTimestamp")
        public String rspTimestamp;

        public static GetCodeCompletionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCodeCompletionResponseBodyResult self = new GetCodeCompletionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCodeCompletionResponseBodyResult setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public GetCodeCompletionResponseBodyResult setClientTimestamp(String clientTimestamp) {
            this.clientTimestamp = clientTimestamp;
            return this;
        }
        public String getClientTimestamp() {
            return this.clientTimestamp;
        }

        public GetCodeCompletionResponseBodyResult setFetchTimestamp(String fetchTimestamp) {
            this.fetchTimestamp = fetchTimestamp;
            return this;
        }
        public String getFetchTimestamp() {
            return this.fetchTimestamp;
        }

        public GetCodeCompletionResponseBodyResult setInvokeTimestamp(String invokeTimestamp) {
            this.invokeTimestamp = invokeTimestamp;
            return this;
        }
        public String getInvokeTimestamp() {
            return this.invokeTimestamp;
        }

        public GetCodeCompletionResponseBodyResult setReceiveTimestamp(String receiveTimestamp) {
            this.receiveTimestamp = receiveTimestamp;
            return this;
        }
        public String getReceiveTimestamp() {
            return this.receiveTimestamp;
        }

        public GetCodeCompletionResponseBodyResult setRspTimestamp(String rspTimestamp) {
            this.rspTimestamp = rspTimestamp;
            return this;
        }
        public String getRspTimestamp() {
            return this.rspTimestamp;
        }

    }

}
