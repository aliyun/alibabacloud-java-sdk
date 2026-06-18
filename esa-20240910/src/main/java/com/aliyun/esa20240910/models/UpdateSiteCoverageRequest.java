// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCoverageRequest extends TeaModel {
    /**
     * <p>The target acceleration area to modify. Valid values:</p>
     * <ul>
     * <li><p><strong>domestic</strong>: Only the Chinese mainland.</p>
     * </li>
     * <li><p><strong>global</strong>: Global.</p>
     * </li>
     * <li><p><strong>overseas</strong>: Global (excluding the Chinese mainland).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The site ID. Get this by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateSiteCoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCoverageRequest self = new UpdateSiteCoverageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCoverageRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public UpdateSiteCoverageRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
