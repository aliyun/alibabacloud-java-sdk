// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSitePauseRequest extends TeaModel {
    /**
     * <p>Specifies whether to temporarily pause the proxy acceleration feature for the entire site. After the feature is paused, all DNS records directly return record values to the client. Valid values:</p>
     * <ul>
     * <li>true: Pauses site acceleration.</li>
     * <li>false: Resumes normal site acceleration.</li>
     * </ul>
     * <p>When site acceleration is paused, only activated sites with NS access mode are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID. Check the Status field to confirm the site status and the AccessType field to confirm the access mode of the site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSitePauseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSitePauseRequest self = new UpdateSitePauseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSitePauseRequest setPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }
    public Boolean getPaused() {
        return this.paused;
    }

    public UpdateSitePauseRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
