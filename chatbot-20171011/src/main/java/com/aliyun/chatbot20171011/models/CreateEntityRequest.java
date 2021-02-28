// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateEntityRequest extends TeaModel {
    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Regex")
    public String regex;

    @NameInMap("Members")
    public String members;

    public static CreateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityRequest self = new CreateEntityRequest();
        return TeaModel.build(map, self);
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

    public CreateEntityRequest setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public CreateEntityRequest setMembers(String members) {
        this.members = members;
        return this;
    }
    public String getMembers() {
        return this.members;
    }

}
