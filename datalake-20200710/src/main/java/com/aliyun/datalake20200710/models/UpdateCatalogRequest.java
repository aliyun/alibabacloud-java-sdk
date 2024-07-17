// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateCatalogRequest extends TeaModel {
    /**
     * <p>cataloginput</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CatalogInput")
    public CatalogInput catalogInput;

    public static UpdateCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCatalogRequest self = new UpdateCatalogRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCatalogRequest setCatalogInput(CatalogInput catalogInput) {
        this.catalogInput = catalogInput;
        return this;
    }
    public CatalogInput getCatalogInput() {
        return this.catalogInput;
    }

}
