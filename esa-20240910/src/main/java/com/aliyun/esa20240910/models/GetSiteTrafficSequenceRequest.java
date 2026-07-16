// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteTrafficSequenceRequest extends TeaModel {
    /**
     * <p>The site ID. You can obtain the site ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site. After version management is enabled for the site, you can specify a site version number to obtain the traffic sequence information of the corresponding version. The default version is 0. If version management is not enabled for the site, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetSiteTrafficSequenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSiteTrafficSequenceRequest self = new GetSiteTrafficSequenceRequest();
        return TeaModel.build(map, self);
    }

    public GetSiteTrafficSequenceRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetSiteTrafficSequenceRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
