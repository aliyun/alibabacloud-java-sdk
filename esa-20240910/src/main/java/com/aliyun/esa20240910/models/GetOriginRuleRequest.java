// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginRuleRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. You can call the <a href="https://help.aliyun.com/document_detail/2866989.html">ListSiteRoutes</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33793140540****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3400350********</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetOriginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOriginRuleRequest self = new GetOriginRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetOriginRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetOriginRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
