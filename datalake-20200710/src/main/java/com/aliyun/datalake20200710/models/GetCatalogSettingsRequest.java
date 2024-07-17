// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSettingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    public static GetCatalogSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSettingsRequest self = new GetCatalogSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogSettingsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

}
