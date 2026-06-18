// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSitePauseRequest extends TeaModel {
    /**
     * <p>Indicates whether to pause proxy acceleration for the site. If set to <code>true</code>, DNS queries for the site return the record values directly to the client. Valid values:</p>
     * <ul>
     * <li><p>true: Pauses proxy acceleration for the site.</p>
     * </li>
     * <li><p>false: Resumes proxy acceleration for the site.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    /**
     * <p>The site ID. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
