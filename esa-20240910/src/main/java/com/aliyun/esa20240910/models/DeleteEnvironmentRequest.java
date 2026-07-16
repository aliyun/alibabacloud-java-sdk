// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentRequest extends TeaModel {
    /**
     * <p>The environment name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>环境1</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890**</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentRequest self = new DeleteEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public DeleteEnvironmentRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
