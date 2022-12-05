// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SendMessageToGroupResponseBodyResult result;

    public static SendMessageToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupResponseBody self = new SendMessageToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageToGroupResponseBody setResult(SendMessageToGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendMessageToGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendMessageToGroupResponseBodyResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        public static SendMessageToGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendMessageToGroupResponseBodyResult self = new SendMessageToGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendMessageToGroupResponseBodyResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
