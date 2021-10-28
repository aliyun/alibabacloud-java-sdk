// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityItemsRequest extends TeaModel {
    @NameInMap("EntityNames")
    public java.util.List<String> entityNames;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static DeleteEntityItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityItemsRequest self = new DeleteEntityItemsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEntityItemsRequest setEntityNames(java.util.List<String> entityNames) {
        this.entityNames = entityNames;
        return this;
    }
    public java.util.List<String> getEntityNames() {
        return this.entityNames;
    }

    public DeleteEntityItemsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DeleteEntityItemsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
