// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityShrinkRequest extends TeaModel {
    @NameInMap("EntityItems")
    public String entityItemsShrink;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityShrinkRequest self = new UpdateEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityShrinkRequest setEntityItemsShrink(String entityItemsShrink) {
        this.entityItemsShrink = entityItemsShrink;
        return this;
    }
    public String getEntityItemsShrink() {
        return this.entityItemsShrink;
    }

    public UpdateEntityShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
