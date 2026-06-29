// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCoverageRequest extends TeaModel {
    /**
     * <p>The target acceleration region to change to. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: the Chinese mainland only.</li>
     * <li><strong>global</strong>: global.</li>
     * <li><strong>overseas</strong>: global (excluding the Chinese mainland).</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;If the value is set to domestic or global, the site corresponding to SiteId must have a valid ICP filing..</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>overseas</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to query the site ID.</p>
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
