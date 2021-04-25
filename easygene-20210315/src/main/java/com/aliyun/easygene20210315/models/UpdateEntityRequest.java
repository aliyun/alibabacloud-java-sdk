// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityItems")
    public java.util.List<UpdateEntityRequestEntityItems> entityItems;

    public static UpdateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityRequest self = new UpdateEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UpdateEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityRequest setEntityItems(java.util.List<UpdateEntityRequestEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<UpdateEntityRequestEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public static class UpdateEntityRequestEntityItems extends TeaModel {
        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        public static UpdateEntityRequestEntityItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateEntityRequestEntityItems self = new UpdateEntityRequestEntityItems();
            return TeaModel.build(map, self);
        }

        public UpdateEntityRequestEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public UpdateEntityRequestEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

    }

}
