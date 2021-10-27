// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCommentResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 调用发送直播间弹幕的返回结果。
    @NameInMap("Result")
    public SendCommentResponseBodyResult result;

    public static SendCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCommentResponseBody self = new SendCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCommentResponseBody setResult(SendCommentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendCommentResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendCommentResponseBodyResultCommentVO extends TeaModel {
        // 弹幕的唯一ID。
        @NameInMap("CommentId")
        public String commentId;

        // 弹幕的内容。
        @NameInMap("Content")
        public String content;

        // 弹幕的创建时间，Unix时间戳，单位：毫秒。
        @NameInMap("CreateAt")
        public Long createAt;

        // 扩展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 弹幕的发送者ID标识。
        @NameInMap("SenderId")
        public String senderId;

        // 弹幕发送者的昵称。
        @NameInMap("SenderNick")
        public String senderNick;

        public static SendCommentResponseBodyResultCommentVO build(java.util.Map<String, ?> map) throws Exception {
            SendCommentResponseBodyResultCommentVO self = new SendCommentResponseBodyResultCommentVO();
            return TeaModel.build(map, self);
        }

        public SendCommentResponseBodyResultCommentVO setCommentId(String commentId) {
            this.commentId = commentId;
            return this;
        }
        public String getCommentId() {
            return this.commentId;
        }

        public SendCommentResponseBodyResultCommentVO setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SendCommentResponseBodyResultCommentVO setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public SendCommentResponseBodyResultCommentVO setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public SendCommentResponseBodyResultCommentVO setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public SendCommentResponseBodyResultCommentVO setSenderNick(String senderNick) {
            this.senderNick = senderNick;
            return this;
        }
        public String getSenderNick() {
            return this.senderNick;
        }

    }

    public static class SendCommentResponseBodyResult extends TeaModel {
        // 返回的弹幕数据模型。
        @NameInMap("CommentVO")
        public SendCommentResponseBodyResultCommentVO commentVO;

        public static SendCommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendCommentResponseBodyResult self = new SendCommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendCommentResponseBodyResult setCommentVO(SendCommentResponseBodyResultCommentVO commentVO) {
            this.commentVO = commentVO;
            return this;
        }
        public SendCommentResponseBodyResultCommentVO getCommentVO() {
            return this.commentVO;
        }

    }

}
