// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateCatalogSettingsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("CatalogSettings")
    public CatalogSettings catalogSettings;

    public static UpdateCatalogSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCatalogSettingsRequest self = new UpdateCatalogSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCatalogSettingsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public UpdateCatalogSettingsRequest setCatalogSettings(CatalogSettings catalogSettings) {
        this.catalogSettings = catalogSettings;
        return this;
    }
    public CatalogSettings getCatalogSettings() {
        return this.catalogSettings;
    }

}
