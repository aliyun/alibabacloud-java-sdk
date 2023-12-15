// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveEntityMemberShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("Member")
    public String memberShrink;

    @NameInMap("RemoveType")
    public String removeType;

    public static RemoveEntityMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityMemberShrinkRequest self = new RemoveEntityMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntityMemberShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public RemoveEntityMemberShrinkRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public RemoveEntityMemberShrinkRequest setMemberShrink(String memberShrink) {
        this.memberShrink = memberShrink;
        return this;
    }
    public String getMemberShrink() {
        return this.memberShrink;
    }

    public RemoveEntityMemberShrinkRequest setRemoveType(String removeType) {
        this.removeType = removeType;
        return this;
    }
    public String getRemoveType() {
        return this.removeType;
    }

}
