// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class FeedbackRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The feedback type, which corresponds to the FeedbackType field in the session history API.</p>
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
     * <p>The content of the like or dislike feedback. You can directly enter the feedback content or pass in a JSON string as shown in the example. The content field corresponds to FeedbackUserInfo in the session history, and feedbackLabels corresponds to FeedbackLabels in the session history.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;content&quot;: &quot;I think this answer is incorrect. It should be based on facts.&quot;,
     *     &quot;feedbackLabels&quot;: [
     *         &quot;Contains factual errors&quot;
     *     ]
     * }</p>
     */
    @NameInMap("FeedbackContent")
    public String feedbackContent;

    /**
     * <p>The unique identifier of the chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID that uniquely identifies a single message in a session window.</p>
     * 
     * <strong>example:</strong>
     * <p>5ca40988-4f99-47ad-ac96-9060d0f81db9</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The session ID that uniquely identifies an IM session.</p>
     * 
     * <strong>example:</strong>
     * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
     */
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
