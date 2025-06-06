// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteCurrentNSRequest extends TeaModel {
    /**
     * <p>The website ID. It can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteCurrentNSRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteCurrentNSRequest self = new GetSiteCurrentNSRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteCurrentNSRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
