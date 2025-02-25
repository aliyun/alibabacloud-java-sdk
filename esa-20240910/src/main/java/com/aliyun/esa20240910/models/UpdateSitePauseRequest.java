// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSitePauseRequest extends TeaModel {
    /**
     * <p>Used to temporarily pause the proxy acceleration function of the entire site. When enabled, all DNS records will directly return their values to the client. Value range:</p>
     * <ul>
     * <li>true: Pause site acceleration.</li>
     * <li>false: Normal site acceleration.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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
