// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SendMessageToGroupUsersResponseBodyResult result;

    public static SendMessageToGroupUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupUsersResponseBody self = new SendMessageToGroupUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageToGroupUsersResponseBody setResult(SendMessageToGroupUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendMessageToGroupUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendMessageToGroupUsersResponseBodyResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        public static SendMessageToGroupUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendMessageToGroupUsersResponseBodyResult self = new SendMessageToGroupUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendMessageToGroupUsersResponseBodyResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
