// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveEntityMemberRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("RemoveType")
    public String removeType;

    @NameInMap("Member")
    public String member;

    public static RemoveEntityMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityMemberRequest self = new RemoveEntityMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntityMemberRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public RemoveEntityMemberRequest setRemoveType(String removeType) {
        this.removeType = removeType;
        return this;
    }
    public String getRemoveType() {
        return this.removeType;
    }

    public RemoveEntityMemberRequest setMember(String member) {
        this.member = member;
        return this;
    }
    public String getMember() {
        return this.member;
    }

}
