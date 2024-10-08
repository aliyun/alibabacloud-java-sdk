// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteProjectNameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_log</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
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
