// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesShrinkRequest extends TeaModel {
    /**
     * <p>An array of IDs for the meta entities to delete. You can specify up to 10 IDs in a single request. All entities in the batch must have the same EntityType.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    public static BatchDeleteMetaEntitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMetaEntitiesShrinkRequest self = new BatchDeleteMetaEntitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMetaEntitiesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
