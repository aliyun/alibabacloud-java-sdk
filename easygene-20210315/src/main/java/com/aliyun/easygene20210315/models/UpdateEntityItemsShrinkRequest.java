// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityItemsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityItems")
    public String entityItemsShrink;

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

    public static UpdateEntityItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityItemsShrinkRequest self = new UpdateEntityItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEntityItemsShrinkRequest setEntityItemsShrink(String entityItemsShrink) {
        this.entityItemsShrink = entityItemsShrink;
        return this;
    }
    public String getEntityItemsShrink() {
        return this.entityItemsShrink;
    }

    public UpdateEntityItemsShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public UpdateEntityItemsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
