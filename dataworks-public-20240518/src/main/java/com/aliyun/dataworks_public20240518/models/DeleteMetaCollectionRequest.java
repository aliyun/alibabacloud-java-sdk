// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionRequest self = new DeleteMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
