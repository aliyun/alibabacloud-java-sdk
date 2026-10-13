// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class FeedbackResponseBody extends TeaModel {
    /**
     * <p>The feedback type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>good: Like.</li>
     * <li>bad: Dislike.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>good</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>The ID that uniquely identifies a single message in a session window.</p>
     * 
     * <strong>example:</strong>
     * <p>5ca40988-4f99-47ad-ac96-9060d0f81db9</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4e5eea71-f326-450c-8849-49515473ef64</p>
     */
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
