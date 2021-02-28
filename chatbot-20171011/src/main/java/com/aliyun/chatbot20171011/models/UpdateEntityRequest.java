// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateEntityRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Regex")
    public String regex;

    @NameInMap("Members")
    public String members;

    public static UpdateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityRequest self = new UpdateEntityRequest();
        return TeaModel.build(map, self);
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

    public UpdateEntityRequest setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public UpdateEntityRequest setMembers(String members) {
        this.members = members;
        return this;
    }
    public String getMembers() {
        return this.members;
    }

}
