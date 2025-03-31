// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCrossBorderOptimizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetCrossBorderOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCrossBorderOptimizationRequest self = new GetCrossBorderOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public GetCrossBorderOptimizationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
