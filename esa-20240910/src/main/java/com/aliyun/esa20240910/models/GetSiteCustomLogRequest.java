// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteCustomLogRequest extends TeaModel {
    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11223***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteCustomLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteCustomLogRequest self = new GetSiteCustomLogRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteCustomLogRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
