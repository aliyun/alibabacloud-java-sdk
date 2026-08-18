// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchCreateMetaEntitiesShrinkRequest extends TeaModel {
    /**
     * <p>The list of entities. A maximum of five entities are supported. All entities in the same batch must have the same entityType.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Entities")
    public String entitiesShrink;

    public static BatchCreateMetaEntitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateMetaEntitiesShrinkRequest self = new BatchCreateMetaEntitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateMetaEntitiesShrinkRequest setEntitiesShrink(String entitiesShrink) {
        this.entitiesShrink = entitiesShrink;
        return this;
    }
    public String getEntitiesShrink() {
        return this.entitiesShrink;
    }

}
