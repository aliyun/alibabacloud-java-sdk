// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SetMsacAppInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public SetMsacAppInstanceResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static SetMsacAppInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetMsacAppInstanceResponseBody self = new SetMsacAppInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetMsacAppInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetMsacAppInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetMsacAppInstanceResponseBody setResultContent(SetMsacAppInstanceResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public SetMsacAppInstanceResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public SetMsacAppInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class SetMsacAppInstanceResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SetMsacAppInstanceResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            SetMsacAppInstanceResponseBodyResultContent self = new SetMsacAppInstanceResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public SetMsacAppInstanceResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SetMsacAppInstanceResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SetMsacAppInstanceResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SetMsacAppInstanceResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
