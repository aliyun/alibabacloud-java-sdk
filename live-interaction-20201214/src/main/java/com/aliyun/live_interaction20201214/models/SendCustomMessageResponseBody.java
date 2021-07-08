// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 请求是否成功。
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码，请求异常时返回。
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息，请求异常时返回。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求的返回结果。
    @NameInMap("Result")
    public SendCustomMessageResponseBodyResult result;

    public static SendCustomMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageResponseBody self = new SendCustomMessageResponseBody();
        return TeaModel.build(map, self);
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

    public SendCustomMessageResponseBody setResult(SendCustomMessageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendCustomMessageResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendCustomMessageResponseBodyResult extends TeaModel {
        // 消息的唯一ID标识。由数字、大小写字母组成，长度不超过20。
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
