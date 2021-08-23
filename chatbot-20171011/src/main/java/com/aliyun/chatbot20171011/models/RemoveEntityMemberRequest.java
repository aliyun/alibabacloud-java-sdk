// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class RemoveEntityMemberRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("RemoveType")
    public String removeType;

    @NameInMap("Member")
    public RemoveEntityMemberRequestMember member;

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

    public RemoveEntityMemberRequest setMember(RemoveEntityMemberRequestMember member) {
        this.member = member;
        return this;
    }
    public RemoveEntityMemberRequestMember getMember() {
        return this.member;
    }

    public static class RemoveEntityMemberRequestMember extends TeaModel {
        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        public static RemoveEntityMemberRequestMember build(java.util.Map<String, ?> map) throws Exception {
            RemoveEntityMemberRequestMember self = new RemoveEntityMemberRequestMember();
            return TeaModel.build(map, self);
        }

        public RemoveEntityMemberRequestMember setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public RemoveEntityMemberRequestMember setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

    }

}
