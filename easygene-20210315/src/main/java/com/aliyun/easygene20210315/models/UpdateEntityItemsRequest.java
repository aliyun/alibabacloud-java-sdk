// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityItemsRequest extends TeaModel {
    @NameInMap("EntityItems")
    public java.util.List<UpdateEntityItemsRequestEntityItems> entityItems;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateEntityItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityItemsRequest self = new UpdateEntityItemsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityItemsRequest setEntityItems(java.util.List<UpdateEntityItemsRequestEntityItems> entityItems) {
        this.entityItems = entityItems;
        return this;
    }
    public java.util.List<UpdateEntityItemsRequestEntityItems> getEntityItems() {
        return this.entityItems;
    }

    public UpdateEntityItemsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityItemsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateEntityItemsRequestEntityItems extends TeaModel {
        @NameInMap("EntityData")
        public java.util.Map<String, String> entityData;

        // 实体元素名称
        @NameInMap("EntityName")
        public String entityName;

        public static UpdateEntityItemsRequestEntityItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateEntityItemsRequestEntityItems self = new UpdateEntityItemsRequestEntityItems();
            return TeaModel.build(map, self);
        }

        public UpdateEntityItemsRequestEntityItems setEntityData(java.util.Map<String, String> entityData) {
            this.entityData = entityData;
            return this;
        }
        public java.util.Map<String, String> getEntityData() {
            return this.entityData;
        }

        public UpdateEntityItemsRequestEntityItems setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

}
