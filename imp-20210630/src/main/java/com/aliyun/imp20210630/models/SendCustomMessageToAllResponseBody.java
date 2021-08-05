// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToAllResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public SendCustomMessageToAllResponseBodyResult result;

    public static SendCustomMessageToAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToAllResponseBody self = new SendCustomMessageToAllResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCustomMessageToAllResponseBody setResult(SendCustomMessageToAllResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendCustomMessageToAllResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendCustomMessageToAllResponseBodyResult extends TeaModel {
        // 消息的唯一ID标识。由数字、大小写字母组成，长度不超过20。
        @NameInMap("MessageId")
        public String messageId;

        public static SendCustomMessageToAllResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageToAllResponseBodyResult self = new SendCustomMessageToAllResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageToAllResponseBodyResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
