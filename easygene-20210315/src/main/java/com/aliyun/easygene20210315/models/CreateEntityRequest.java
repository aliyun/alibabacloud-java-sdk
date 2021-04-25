// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateEntityRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityItems")
    public java.util.List<CreateEntityRequestEntityItems> entityItems;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityRequest self = new CreateEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateEntityRequest setEntityItems(java.util.List<CreateEntityRequestEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<CreateEntityRequestEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public CreateEntityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateEntityRequestEntityItems extends TeaModel {
        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        public static CreateEntityRequestEntityItems build(java.util.Map<String, ?> map) throws Exception {
            CreateEntityRequestEntityItems self = new CreateEntityRequestEntityItems();
            return TeaModel.build(map, self);
        }

        public CreateEntityRequestEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public CreateEntityRequestEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

    }

}
