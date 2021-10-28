// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateEntityShrinkRequest extends TeaModel {
    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EntityItems")
    public String entityItemsShrink;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static CreateEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityShrinkRequest self = new CreateEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEntityShrinkRequest setEntityItemsShrink(String entityItemsShrink) {
        this.entityItemsShrink = entityItemsShrink;
        return this;
    }
    public String getEntityItemsShrink() {
        return this.entityItemsShrink;
    }

    public CreateEntityShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateEntityShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
