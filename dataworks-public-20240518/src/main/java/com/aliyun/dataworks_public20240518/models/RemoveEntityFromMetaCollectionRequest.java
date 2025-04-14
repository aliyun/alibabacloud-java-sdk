// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveEntityFromMetaCollectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dlf-table:123456789:test_catalog:test_database::test_table</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("MetaCollectionId")
    public String metaCollectionId;

    public static RemoveEntityFromMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEntityFromMetaCollectionRequest self = new RemoveEntityFromMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEntityFromMetaCollectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RemoveEntityFromMetaCollectionRequest setMetaCollectionId(String metaCollectionId) {
        this.metaCollectionId = metaCollectionId;
        return this;
    }
    public String getMetaCollectionId() {
        return this.metaCollectionId;
    }

}
