// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteCatalogRequest extends TeaModel {
    /**
     * <p>CatalogId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>catalog_test</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAsync")
    public Boolean isAsync;

    public static DeleteCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCatalogRequest self = new DeleteCatalogRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCatalogRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeleteCatalogRequest setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Boolean getIsAsync() {
        return this.isAsync;
    }

}
