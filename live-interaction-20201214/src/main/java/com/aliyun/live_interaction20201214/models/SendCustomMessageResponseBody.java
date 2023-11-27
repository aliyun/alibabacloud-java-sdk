// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("Result")
    public SendCustomMessageResponseBodyResult result;

    public static SendCustomMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageResponseBody self = new SendCustomMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SendCustomMessageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SendCustomMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCustomMessageResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public SendCustomMessageResponseBody setResult(SendCustomMessageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendCustomMessageResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendCustomMessageResponseBodyResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        public static SendCustomMessageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageResponseBodyResult self = new SendCustomMessageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageResponseBodyResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
