// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RollbackEnvironmentVersionRequest extends TeaModel {
    /**
     * <p>The environment name.</p>
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
     * <p>33862229675****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static RollbackEnvironmentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackEnvironmentVersionRequest self = new RollbackEnvironmentVersionRequest();
        return TeaModel.build(map, self);
    }

    public RollbackEnvironmentVersionRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public RollbackEnvironmentVersionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
