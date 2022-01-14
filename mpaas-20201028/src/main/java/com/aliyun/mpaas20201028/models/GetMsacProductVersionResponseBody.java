// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMsacProductVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetMsacProductVersionResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMsacProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsacProductVersionResponseBody self = new GetMsacProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsacProductVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsacProductVersionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsacProductVersionResponseBody setResultContent(GetMsacProductVersionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetMsacProductVersionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetMsacProductVersionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMsacProductVersionResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetMsacProductVersionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetMsacProductVersionResponseBodyResultContent self = new GetMsacProductVersionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetMsacProductVersionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMsacProductVersionResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetMsacProductVersionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMsacProductVersionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
