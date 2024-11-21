// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteAccessTypeRequest extends TeaModel {
    /**
     * <p>The new DNS setup of the website. Valid values:</p>
     * <ul>
     * <li><strong>NS</strong></li>
     * <li><strong>CNAME</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSiteAccessTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteAccessTypeRequest self = new UpdateSiteAccessTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteAccessTypeRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public UpdateSiteAccessTypeRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
