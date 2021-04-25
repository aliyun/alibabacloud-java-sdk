// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateEntityShrinkRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityItems")
    public String entityItemsShrink;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEntityShrinkRequest self = new CreateEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEntityShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateEntityShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CreateEntityShrinkRequest setEntityItemsShrink(String entityItemsShrink) {
        this.entityItemsShrink = entityItemsShrink;
        return this;
    }
    public String getEntityItemsShrink() {
        return this.entityItemsShrink;
    }

    public CreateEntityShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
