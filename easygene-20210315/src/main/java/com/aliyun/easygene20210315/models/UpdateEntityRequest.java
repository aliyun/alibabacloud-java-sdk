// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityRequest extends TeaModel {
    @NameInMap("EntityItems")
    public java.util.List<UpdateEntityRequestEntityItems> entityItems;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityRequest self = new UpdateEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityRequest setEntityItems(java.util.List<UpdateEntityRequestEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<UpdateEntityRequestEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public UpdateEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateEntityRequestEntityItems extends TeaModel {
        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        // 实体元素名称
        @NameInMap("EntityName")
        public String entityName;

        public static UpdateEntityRequestEntityItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateEntityRequestEntityItems self = new UpdateEntityRequestEntityItems();
            return TeaModel.build(map, self);
        }

        public UpdateEntityRequestEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

        public UpdateEntityRequestEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

}
