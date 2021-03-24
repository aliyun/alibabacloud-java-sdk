// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMessageByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Result")
    public GetMessageByIdResponseBodyResult result;

    public static GetMessageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageByIdResponseBody self = new GetMessageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMessageByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMessageByIdResponseBody setResult(GetMessageByIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMessageByIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMessageByIdResponseBodyResult extends TeaModel {
        // 消息Id
        @NameInMap("MsgId")
        public String msgId;

        // 会话Id
        @NameInMap("AppCid")
        public String appCid;

        // 会话类型
        @NameInMap("ConversationType")
        public Integer conversationType;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 发送者的用户Id
        @NameInMap("SenderId")
        public String senderId;

        // 消息类型
        @NameInMap("ContentType")
        public Integer contentType;

        // 消息体
        @NameInMap("Content")
        public String content;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static GetMessageByIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMessageByIdResponseBodyResult self = new GetMessageByIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMessageByIdResponseBodyResult setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public GetMessageByIdResponseBodyResult setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public GetMessageByIdResponseBodyResult setConversationType(Integer conversationType) {
            this.conversationType = conversationType;
            return this;
        }
        public Integer getConversationType() {
            return this.conversationType;
        }

        public GetMessageByIdResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMessageByIdResponseBodyResult setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public GetMessageByIdResponseBodyResult setContentType(Integer contentType) {
            this.contentType = contentType;
            return this;
        }
        public Integer getContentType() {
            return this.contentType;
        }

        public GetMessageByIdResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMessageByIdResponseBodyResult setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

}
