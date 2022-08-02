// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseSummaryRequest extends TeaModel {
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("Name")
    public String name;

    public static GetDatabaseSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseSummaryRequest self = new GetDatabaseSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseSummaryRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetDatabaseSummaryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
