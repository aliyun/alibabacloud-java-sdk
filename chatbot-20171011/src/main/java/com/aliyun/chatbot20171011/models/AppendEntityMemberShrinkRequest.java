// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AppendEntityMemberShrinkRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("ApplyType")
    public String applyType;

    @NameInMap("Member")
    public String memberShrink;

    public static AppendEntityMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendEntityMemberShrinkRequest self = new AppendEntityMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AppendEntityMemberShrinkRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public AppendEntityMemberShrinkRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public AppendEntityMemberShrinkRequest setMemberShrink(String memberShrink) {
        this.memberShrink = memberShrink;
        return this;
    }
    public String getMemberShrink() {
        return this.memberShrink;
    }

}
