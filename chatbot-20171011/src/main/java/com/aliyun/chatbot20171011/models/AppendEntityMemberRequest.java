// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AppendEntityMemberRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("ApplyType")
    public String applyType;

    @NameInMap("Member")
    public String member;

    public static AppendEntityMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendEntityMemberRequest self = new AppendEntityMemberRequest();
        return TeaModel.build(map, self);
    }

    public AppendEntityMemberRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public AppendEntityMemberRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public AppendEntityMemberRequest setMember(String member) {
        this.member = member;
        return this;
    }
    public String getMember() {
        return this.member;
    }

}
