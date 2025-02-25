// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteNetworkOptimizationRequest extends TeaModel {
    /**
     * <p>ConfigId of the configuration, which can be obtained by calling the <a href="~~ListNetworkOptimizations~~">ListNetworkOptimizations</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816**********</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteNetworkOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkOptimizationRequest self = new DeleteNetworkOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkOptimizationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public DeleteNetworkOptimizationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
