// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetLogUrlInMsaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetLogUrlInMsaResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetLogUrlInMsaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogUrlInMsaResponseBody self = new GetLogUrlInMsaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogUrlInMsaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogUrlInMsaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLogUrlInMsaResponseBody setResultContent(GetLogUrlInMsaResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetLogUrlInMsaResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetLogUrlInMsaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetLogUrlInMsaResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static GetLogUrlInMsaResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetLogUrlInMsaResponseBodyResultContent self = new GetLogUrlInMsaResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetLogUrlInMsaResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetLogUrlInMsaResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetLogUrlInMsaResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLogUrlInMsaResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
