// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class FeedbackRequest extends TeaModel {
    /**
     * <p>The key for the business space. If this parameter is not set, the system uses the default business space. You can obtain the key from the business management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The feedback rating for the response. This parameter corresponds to <code>FeedbackType</code> in the session history API.</p>
     * <p>Enumerated values: \&quot;good\&quot; (a positive rating) and \&quot;bad\&quot; (a negative rating).</p>
     * 
     * <strong>example:</strong>
     * <p>good</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>The detailed feedback content. You can provide this as a raw string or as a JSON string. If you use a JSON string, the \&quot;content\&quot; field corresponds to \&quot;FeedbackUserInfo\&quot; and the \&quot;feedbackLabels\&quot; field corresponds to \&quot;FeedbackLabels\&quot; in the session history.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;content&quot;: &quot;我觉得这个答案不对，需要依据事实回答。&quot;,
     *     &quot;feedbackLabels&quot;: [
     *         &quot;存在事实性错误&quot;
     *     ]
     * }</p>
     */
    @NameInMap("FeedbackContent")
    public String feedbackContent;

    /**
     * <p>The unique identifier of the chatbot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique identifier of a single message within the session.</p>
     * 
     * <strong>example:</strong>
     * <p>5ca40988-4f99-47ad-ac96-9060d0f81db9</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The unique identifier for the session. The instant messaging (IM) system uses this ID to track the conversation.</p>
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
