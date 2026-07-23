// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteInstanceRequest extends TeaModel {
    /**
     * <p>The target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-bckh96ri1eyo</p>
     */
    @NameInMap("NewInstanceId")
    public String newInstanceId;

    @NameInMap("ResourceOwner")
    public Long resourceOwner;

    /**
     * <p>The site ID. You can call <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>901109460617712</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSiteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteInstanceRequest self = new UpdateSiteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteInstanceRequest setNewInstanceId(String newInstanceId) {
        this.newInstanceId = newInstanceId;
        return this;
    }
    public String getNewInstanceId() {
        return this.newInstanceId;
    }

    public UpdateSiteInstanceRequest setResourceOwner(Long resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

    public UpdateSiteInstanceRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
