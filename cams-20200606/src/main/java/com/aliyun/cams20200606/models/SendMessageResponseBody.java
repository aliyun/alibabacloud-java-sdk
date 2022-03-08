// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    @NameInMap("Module")
    public SendMessageResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setModule(SendMessageResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public SendMessageResponseBodyModule getModule() {
        return this.module;
    }

    public SendMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendMessageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class SendMessageResponseBodyModule extends TeaModel {
        @NameInMap("FromId")
        public String fromId;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ToId")
        public String toId;

        public static SendMessageResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyModule self = new SendMessageResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyModule setFromId(String fromId) {
            this.fromId = fromId;
            return this;
        }
        public String getFromId() {
            return this.fromId;
        }

        public SendMessageResponseBodyModule setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SendMessageResponseBodyModule setToId(String toId) {
            this.toId = toId;
            return this;
        }
        public String getToId() {
            return this.toId;
        }

    }

}
