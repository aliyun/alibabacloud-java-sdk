// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopSiteRequest extends TeaModel {
    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34003500310****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static StopSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSiteRequest self = new StopSiteRequest();
        return TeaModel.build(map, self);
    }

    public StopSiteRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
