// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesShrinkRequest extends TeaModel {
    /**
     * <p>The list of entity IDs to delete. A maximum of 10 IDs are supported. All entities in the same batch must be of the same entityType.</p>
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
