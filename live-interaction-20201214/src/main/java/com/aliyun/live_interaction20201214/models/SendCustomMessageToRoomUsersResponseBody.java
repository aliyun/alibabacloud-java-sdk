// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendCustomMessageToRoomUsersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("Result")
    public SendCustomMessageToRoomUsersResponseBodyResult result;

    public static SendCustomMessageToRoomUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToRoomUsersResponseBody self = new SendCustomMessageToRoomUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToRoomUsersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SendCustomMessageToRoomUsersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SendCustomMessageToRoomUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCustomMessageToRoomUsersResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public SendCustomMessageToRoomUsersResponseBody setResult(SendCustomMessageToRoomUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendCustomMessageToRoomUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendCustomMessageToRoomUsersResponseBodyResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        public static SendCustomMessageToRoomUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageToRoomUsersResponseBodyResult self = new SendCustomMessageToRoomUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageToRoomUsersResponseBodyResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
