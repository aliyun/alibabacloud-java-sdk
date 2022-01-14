// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SetMsacAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public SetMsacAppResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static SetMsacAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMsacAppResponseBody self = new SetMsacAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMsacAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetMsacAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetMsacAppResponseBody setResultContent(SetMsacAppResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public SetMsacAppResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public SetMsacAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class SetMsacAppResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SetMsacAppResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            SetMsacAppResponseBodyResultContent self = new SetMsacAppResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public SetMsacAppResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SetMsacAppResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SetMsacAppResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetMsacAppResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
