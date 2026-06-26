// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryRequest extends TeaModel {
    /**
     * <p>The date of the storage overview.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-18</p>
     */
    @NameInMap("date")
    public String date;

    public static GetCatalogSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSummaryRequest self = new GetCatalogSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogSummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
