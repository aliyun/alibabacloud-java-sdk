// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    public static GetCatalogSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSummaryRequest self = new GetCatalogSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogSummaryRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

}
