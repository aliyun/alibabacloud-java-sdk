// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class AssociateRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 视角编码，用于调用同一知识标题下不同视角的答案。在拼装请求参数时，需要以Perspective={视角编码}的格式传递参数。如：&Perspective=["FZJBY3raWr"]。使用SDK时以SDK中定义的参数为准。目前仅支持一个视角答案的调用。       （公有云）
    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    // 推荐问题数量，1-10，当出推荐的时候才生效，返回不大于RecommendN
    @NameInMap("RecommendNum")
    public Long recommendNum;

    // 会话ID，用于标识一个访问者的会话和保持上下文信息。对于一个新的访问者，首次调用Chat接口时无需传递此字段，机器人会开启一个会话，并在Chat接口的响应中返回该会话的SessionId。对于该访问者的后续轮次的会话，调用Chat接口时传递当前会话的SessionId，机器人即可基于SessionId继续该轮次会话。
    @NameInMap("SessionId")
    public String sessionId;

    // 用户表述
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
