// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SendMessageResponseBodyResult result;

    public static SendMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendMessageResponseBody self = new SendMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendMessageResponseBody setResult(SendMessageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendMessageResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendMessageResponseBodyResult extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("MsgId")
        public String msgId;

        public static SendMessageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendMessageResponseBodyResult self = new SendMessageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendMessageResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SendMessageResponseBodyResult setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

}
