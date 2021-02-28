// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class FeedbackRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("Feedback")
    public String feedback;

    public static FeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackRequest self = new FeedbackRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FeedbackRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FeedbackRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public FeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

}
