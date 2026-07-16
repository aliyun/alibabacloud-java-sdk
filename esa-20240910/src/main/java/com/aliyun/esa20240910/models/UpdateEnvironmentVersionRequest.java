// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentVersionRequest extends TeaModel {
    /**
     * <p>The name of the environment to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>默认环境</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33970510651****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The new site version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static UpdateEnvironmentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentVersionRequest self = new UpdateEnvironmentVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentVersionRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public UpdateEnvironmentVersionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateEnvironmentVersionRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
