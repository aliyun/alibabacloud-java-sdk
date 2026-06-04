// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesShrinkRequest extends TeaModel {
    /**
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
