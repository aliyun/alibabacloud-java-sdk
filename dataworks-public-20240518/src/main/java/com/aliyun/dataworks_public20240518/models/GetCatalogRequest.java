// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCatalogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-catalog:123456XXX:test_catalog
     * starrocks-catalog:c-abc123xxx:default_catalog</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogRequest self = new GetCatalogRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
