// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DownloadEntityShrinkRequest extends TeaModel {
    @NameInMap("EntityNames")
    public String entityNamesShrink;

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

    public static DownloadEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadEntityShrinkRequest self = new DownloadEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DownloadEntityShrinkRequest setEntityNamesShrink(String entityNamesShrink) {
        this.entityNamesShrink = entityNamesShrink;
        return this;
    }
    public String getEntityNamesShrink() {
        return this.entityNamesShrink;
    }

    public DownloadEntityShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DownloadEntityShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
