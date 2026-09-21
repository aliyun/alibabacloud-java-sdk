// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteProjectNameRequest extends TeaModel {
    /**
     * <p>The real-time log project name.</p>
     * <blockquote>
     * <p>Allowed character set (hyphens only, no underscores), length range, and naming rule examples (such as \&quot;ali-dcdn-log-56\&quot;)</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-dcdn-log-56</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The site ID. You can call <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> to obtain the site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312213212</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CheckSiteProjectNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteProjectNameRequest self = new CheckSiteProjectNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckSiteProjectNameRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CheckSiteProjectNameRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
