// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class AssociateShrinkRequest extends TeaModel {
    /**
     * <p>The workspace key. If this parameter is not specified, the service uses the default workspace. You can obtain the key from the workspace management page of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The code for a perspective. Use this to retrieve answers from different perspectives that share the same knowledge title. When constructing the request, pass the value in the &quot;Perspective={perspective_code}&quot; format, for example, \&amp;Perspective=[&quot;FZJBY3raWr&quot;]. If you use an SDK, pass the parameter as defined by the SDK. You can specify only one perspective in each request.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;qyzzVfyFfa&quot;]</p>
     */
    @NameInMap("Perspective")
    public String perspectiveShrink;

    /**
     * <p>The number of recommended FAQs to return. The value must be an integer from 1 to 10. This parameter takes effect only when recommendations are generated. The number of FAQs returned is less than or equal to the value you specify.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RecommendNum")
    public Long recommendNum;

    /**
     * <p>The session ID that identifies a conversation and maintains context. For the first request from a new user, you can omit this parameter. The service automatically starts a session and returns a session ID in the response. To continue the conversation, you must include the session ID in subsequent requests.</p>
     * 
     * <strong>example:</strong>
     * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The user\&quot;s utterance.</p>
     * 
     * <strong>example:</strong>
     * <p>公积金提取</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    public static AssociateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateShrinkRequest self = new AssociateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AssociateShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public AssociateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateShrinkRequest setPerspectiveShrink(String perspectiveShrink) {
        this.perspectiveShrink = perspectiveShrink;
        return this;
    }
    public String getPerspectiveShrink() {
        return this.perspectiveShrink;
    }

    public AssociateShrinkRequest setRecommendNum(Long recommendNum) {
        this.recommendNum = recommendNum;
        return this;
    }
    public Long getRecommendNum() {
        return this.recommendNum;
    }

    public AssociateShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AssociateShrinkRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
