// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteNameExclusiveRequest extends TeaModel {
    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetSiteNameExclusiveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteNameExclusiveRequest self = new GetSiteNameExclusiveRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteNameExclusiveRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
