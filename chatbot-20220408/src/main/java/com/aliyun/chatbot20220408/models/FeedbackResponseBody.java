// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class FeedbackResponseBody extends TeaModel {
    // good-点赞、bad-点踩
    @NameInMap("Feedback")
    public String feedback;

    // 会话窗单次会话标识
    @NameInMap("MessageId")
    public String messageId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static FeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FeedbackResponseBody self = new FeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public FeedbackResponseBody setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public FeedbackResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public FeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
