// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class AssociateShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;qyzzVfyFfa&quot;]</p>
     */
    @NameInMap("Perspective")
    public String perspectiveShrink;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RecommendNum")
    public Long recommendNum;

    /**
     * <strong>example:</strong>
     * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
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
