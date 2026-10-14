// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticCatalogRequest extends TeaModel {
    /**
     * <p>The catalog UUID. You can obtain it by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    public static GetAgenticCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticCatalogRequest self = new GetAgenticCatalogRequest();
        return TeaModel.build(map, self);
    }

    public GetAgenticCatalogRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

}
