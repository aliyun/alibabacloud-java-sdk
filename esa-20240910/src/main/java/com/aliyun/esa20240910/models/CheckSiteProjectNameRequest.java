// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteProjectNameRequest extends TeaModel {
    /**
     * <p>The name of the real-time log delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_log</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
