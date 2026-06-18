// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineRouteRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. Call the <a href="https://help.aliyun.com/document_detail/2879631.html">ListSiteRoutes</a> operation to get the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The ID of the site. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to get the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetRoutineRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineRouteRequest self = new GetRoutineRouteRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineRouteRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetRoutineRouteRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
