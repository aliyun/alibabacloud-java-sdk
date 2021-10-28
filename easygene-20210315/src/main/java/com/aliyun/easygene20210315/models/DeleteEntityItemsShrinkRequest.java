// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityItemsShrinkRequest extends TeaModel {
    @NameInMap("EntityNames")
    public String entityNamesShrink;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static DeleteEntityItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityItemsShrinkRequest self = new DeleteEntityItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEntityItemsShrinkRequest setEntityNamesShrink(String entityNamesShrink) {
        this.entityNamesShrink = entityNamesShrink;
        return this;
    }
    public String getEntityNamesShrink() {
        return this.entityNamesShrink;
    }

    public DeleteEntityItemsShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DeleteEntityItemsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
