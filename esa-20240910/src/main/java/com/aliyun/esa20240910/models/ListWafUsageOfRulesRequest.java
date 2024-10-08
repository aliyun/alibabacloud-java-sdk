// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafUsageOfRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>ListWafUsageOfRules</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListWafUsageOfRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafUsageOfRulesRequest self = new ListWafUsageOfRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWafUsageOfRulesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListWafUsageOfRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
