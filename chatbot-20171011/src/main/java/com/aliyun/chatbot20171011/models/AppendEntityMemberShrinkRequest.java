// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AppendEntityMemberShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ApplyType")
    public String applyType;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("Member")
    public String memberShrink;

    public static AppendEntityMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendEntityMemberShrinkRequest self = new AppendEntityMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AppendEntityMemberShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public AppendEntityMemberShrinkRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public AppendEntityMemberShrinkRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public AppendEntityMemberShrinkRequest setMemberShrink(String memberShrink) {
        this.memberShrink = memberShrink;
        return this;
    }
    public String getMemberShrink() {
        return this.memberShrink;
    }

}
