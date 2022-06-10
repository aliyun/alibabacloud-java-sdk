// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class FeedbackRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // good-点赞、bad-点踩
    @NameInMap("Feedback")
    public String feedback;

    // 点赞、点踩的内容
    @NameInMap("FeedbackContent")
    public String feedbackContent;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 会话窗单次会话标识
    @NameInMap("MessageId")
    public String messageId;

    // 会话Session标识，标识：IM唯一标识会话
    @NameInMap("SessionId")
    public String sessionId;

    public static FeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        FeedbackRequest self = new FeedbackRequest();
        return TeaModel.build(map, self);
    }

    public FeedbackRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public FeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public FeedbackRequest setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
        return this;
    }
    public String getFeedbackContent() {
        return this.feedbackContent;
    }

    public FeedbackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FeedbackRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public FeedbackRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
