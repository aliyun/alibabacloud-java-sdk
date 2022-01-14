// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMsacTinyAppInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetMsacTinyAppInfoResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMsacTinyAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsacTinyAppInfoResponseBody self = new GetMsacTinyAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsacTinyAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsacTinyAppInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsacTinyAppInfoResponseBody setResultContent(GetMsacTinyAppInfoResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetMsacTinyAppInfoResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetMsacTinyAppInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMsacTinyAppInfoResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetMsacTinyAppInfoResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetMsacTinyAppInfoResponseBodyResultContent self = new GetMsacTinyAppInfoResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetMsacTinyAppInfoResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMsacTinyAppInfoResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetMsacTinyAppInfoResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMsacTinyAppInfoResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
