// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentVersionRequest extends TeaModel {
    /**
     * <p>The environment name. The version of this environment is upgraded and deployed to the environment with the next priority level.</p>
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
     * <p>1245678****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpgradeEnvironmentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEnvironmentVersionRequest self = new UpgradeEnvironmentVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeEnvironmentVersionRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public UpgradeEnvironmentVersionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
