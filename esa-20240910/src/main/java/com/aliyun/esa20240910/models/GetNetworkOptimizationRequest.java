// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetNetworkOptimizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312213212</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetNetworkOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkOptimizationRequest self = new GetNetworkOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkOptimizationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetNetworkOptimizationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
