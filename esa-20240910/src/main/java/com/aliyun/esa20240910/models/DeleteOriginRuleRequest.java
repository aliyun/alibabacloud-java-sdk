// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteOriginRuleRequest extends TeaModel {
    /**
     * <p>ConfigId of the configuration, which can be obtained by calling the <a href="~~ListOriginRules~~">ListOriginRules</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33793140540****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3400350********</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteOriginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOriginRuleRequest self = new DeleteOriginRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOriginRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public DeleteOriginRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
