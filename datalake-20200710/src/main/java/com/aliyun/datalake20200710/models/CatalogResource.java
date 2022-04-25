// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CatalogResource extends TeaModel {
    // Catalog id
    @NameInMap("CatalogId")
    public String catalogId;

    public static CatalogResource build(java.util.Map<String, ?> map) throws Exception {
        CatalogResource self = new CatalogResource();
        return TeaModel.build(map, self);
    }

    public CatalogResource setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

}
