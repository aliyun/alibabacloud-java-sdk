// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesRequest extends TeaModel {
    /**
     * <p>An array of IDs for the meta entities to delete. You can specify up to 10 IDs in a single request. All entities in the batch must have the same EntityType.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<String> ids;

    public static BatchDeleteMetaEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMetaEntitiesRequest self = new BatchDeleteMetaEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMetaEntitiesRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
