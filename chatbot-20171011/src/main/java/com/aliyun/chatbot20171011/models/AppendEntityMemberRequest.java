// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AppendEntityMemberRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ApplyType")
    public String applyType;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("Member")
    public AppendEntityMemberRequestMember member;

    public static AppendEntityMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendEntityMemberRequest self = new AppendEntityMemberRequest();
        return TeaModel.build(map, self);
    }

    public AppendEntityMemberRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public AppendEntityMemberRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public AppendEntityMemberRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public AppendEntityMemberRequest setMember(AppendEntityMemberRequestMember member) {
        this.member = member;
        return this;
    }
    public AppendEntityMemberRequestMember getMember() {
        return this.member;
    }

    public static class AppendEntityMemberRequestMember extends TeaModel {
        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        public static AppendEntityMemberRequestMember build(java.util.Map<String, ?> map) throws Exception {
            AppendEntityMemberRequestMember self = new AppendEntityMemberRequestMember();
            return TeaModel.build(map, self);
        }

        public AppendEntityMemberRequestMember setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public AppendEntityMemberRequestMember setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

    }

}
