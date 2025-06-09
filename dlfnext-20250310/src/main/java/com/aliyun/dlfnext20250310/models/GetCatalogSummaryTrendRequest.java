// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryTrendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-01</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-01</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static GetCatalogSummaryTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSummaryTrendRequest self = new GetCatalogSummaryTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogSummaryTrendRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetCatalogSummaryTrendRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
