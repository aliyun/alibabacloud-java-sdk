// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCatalogResponseBody extends TeaModel {
    @NameInMap("Catalog")
    public Catalog catalog;

    /**
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogResponseBody self = new GetCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogResponseBody setCatalog(Catalog catalog) {
        this.catalog = catalog;
        return this;
    }
    public Catalog getCatalog() {
        return this.catalog;
    }

    public GetCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
