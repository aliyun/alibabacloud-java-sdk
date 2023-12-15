// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateEntityRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Members")
    public java.util.List<CreateEntityRequestMembers> members;

    @NameInMap("Regex")
    public String regex;

    public static CreateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityRequest self = new CreateEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateEntityRequest setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public CreateEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public CreateEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateEntityRequest setMembers(java.util.List<CreateEntityRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<CreateEntityRequestMembers> getMembers() {
        return this.members;
    }

    public CreateEntityRequest setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public static class CreateEntityRequestMembers extends TeaModel {
        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        public static CreateEntityRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateEntityRequestMembers self = new CreateEntityRequestMembers();
            return TeaModel.build(map, self);
        }

        public CreateEntityRequestMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public CreateEntityRequestMembers setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

    }

}
