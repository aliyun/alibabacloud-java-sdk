// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPerformanceDataCollectionRequest extends TeaModel {
    /**
     * <p>The Site ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetPerformanceDataCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPerformanceDataCollectionRequest self = new GetPerformanceDataCollectionRequest();
        return TeaModel.build(map, self);
    }

    public GetPerformanceDataCollectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
