// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned.</p>
     */
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
        /**
         * <p>The ID of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>qt***</p>
         */
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
