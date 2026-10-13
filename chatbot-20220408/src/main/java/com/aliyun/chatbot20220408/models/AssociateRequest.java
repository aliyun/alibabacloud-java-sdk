// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class AssociateRequest extends TeaModel {
    /**
     * <p>The business space key. If not specified, the default business space is accessed. Obtain the key value from the business management page of the primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique identifier of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The perspective code, which is used to call answers from different perspectives under the same knowledge title. When assembling request parameters, pass the parameter in the format Perspective={perspective code}. For example: &amp;Perspective=[&quot;FZJBY3raWr&quot;]. When using the SDK, use the parameters defined in the SDK. Currently, only one perspective answer can be called.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;qyzzVfyFfa&quot;]</p>
     */
    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    /**
     * <p>The number of recommended questions, ranging from 1 to 10. This parameter takes effect only when recommendations are returned. The number of returned recommended questions is less than or equal to RecommendNum.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("RecommendNum")
    public Long recommendNum;

    /**
     * <p>The session ID, which is used to identify a visitor\&quot;s session and maintain context information. For a new visitor, you do not need to pass this field when calling the Chat operation for the first time. The robot starts a session and returns the SessionId of the session in the response of the Chat operation. For subsequent conversation turns of the visitor, pass the SessionId of the current session when calling the Chat operation so that the robot can continue the conversation based on the SessionId.</p>
     * 
     * <strong>example:</strong>
     * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The user utterance.</p>
     * 
     * <strong>example:</strong>
     * <p>Housing fund withdrawal</p>
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
