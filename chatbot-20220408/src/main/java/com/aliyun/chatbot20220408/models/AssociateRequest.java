// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class AssociateRequest extends TeaModel {
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
    public java.util.List<String> perspective;

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

    public static AssociateRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateRequest self = new AssociateRequest();
        return TeaModel.build(map, self);
    }

    public AssociateRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public AssociateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateRequest setPerspective(java.util.List<String> perspective) {
        this.perspective = perspective;
        return this;
    }
    public java.util.List<String> getPerspective() {
        return this.perspective;
    }

    public AssociateRequest setRecommendNum(Long recommendNum) {
        this.recommendNum = recommendNum;
        return this;
    }
    public Long getRecommendNum() {
        return this.recommendNum;
    }

    public AssociateRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AssociateRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

}
