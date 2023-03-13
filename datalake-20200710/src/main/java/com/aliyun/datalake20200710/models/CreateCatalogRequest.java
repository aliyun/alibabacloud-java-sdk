// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateCatalogRequest extends TeaModel {
    /**
     * <p>cataloginput</p>
     */
    @NameInMap("CatalogInput")
    public CatalogInput catalogInput;

    public static CreateCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCatalogRequest self = new CreateCatalogRequest();
        return TeaModel.build(map, self);
    }

    public CreateCatalogRequest setCatalogInput(CatalogInput catalogInput) {
        this.catalogInput = catalogInput;
        return this;
    }
    public CatalogInput getCatalogInput() {
        return this.catalogInput;
    }

}
