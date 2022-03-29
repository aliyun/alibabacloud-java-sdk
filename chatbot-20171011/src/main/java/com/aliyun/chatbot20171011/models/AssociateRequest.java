// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AssociateRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    @NameInMap("RecommendNum")
    public Integer recommendNum;

    @NameInMap("SessionId")
    public String sessionId;

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

    public AssociateRequest setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
        return this;
    }
    public Integer getRecommendNum() {
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
