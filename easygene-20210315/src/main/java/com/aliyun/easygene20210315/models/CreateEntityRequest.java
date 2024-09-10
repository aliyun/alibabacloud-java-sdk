// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateEntityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>T93cy1mMDE4OTgxNGU1ZTkK</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityItems")
    public java.util.List<CreateEntityRequestEntityItems> entityItems;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sample</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static CreateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityRequest self = new CreateEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEntityRequest setEntityItems(java.util.List<CreateEntityRequestEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<CreateEntityRequestEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public CreateEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateEntityRequestEntityItems extends TeaModel {
        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        /**
         * <strong>example:</strong>
         * <p>s1</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        public static CreateEntityRequestEntityItems build(java.util.Map<String, ?> map) throws Exception {
            CreateEntityRequestEntityItems self = new CreateEntityRequestEntityItems();
            return TeaModel.build(map, self);
        }

        public CreateEntityRequestEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

        public CreateEntityRequestEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

}
