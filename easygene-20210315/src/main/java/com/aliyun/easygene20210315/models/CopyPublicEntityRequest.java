// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CopyPublicEntityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDataset</p>
     */
    @NameInMap("Dataset")
    public String dataset;

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

    public static CopyPublicEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyPublicEntityRequest self = new CopyPublicEntityRequest();
        return TeaModel.build(map, self);
    }

    public CopyPublicEntityRequest setDataset(String dataset) {
        this.dataset = dataset;
        return this;
    }
    public String getDataset() {
        return this.dataset;
    }

    public CopyPublicEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public CopyPublicEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
