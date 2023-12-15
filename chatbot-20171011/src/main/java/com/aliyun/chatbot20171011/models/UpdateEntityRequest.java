// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateEntityRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Members")
    public java.util.List<UpdateEntityRequestMembers> members;

    @NameInMap("Regex")
    public String regex;

    public static UpdateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityRequest self = new UpdateEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateEntityRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public UpdateEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public UpdateEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityRequest setMembers(java.util.List<UpdateEntityRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<UpdateEntityRequestMembers> getMembers() {
        return this.members;
    }

    public UpdateEntityRequest setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public static class UpdateEntityRequestMembers extends TeaModel {
        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        public static UpdateEntityRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            UpdateEntityRequestMembers self = new UpdateEntityRequestMembers();
            return TeaModel.build(map, self);
        }

        public UpdateEntityRequestMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public UpdateEntityRequestMembers setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

    }

}
