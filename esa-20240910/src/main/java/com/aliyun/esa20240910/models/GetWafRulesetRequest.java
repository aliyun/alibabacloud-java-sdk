// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRulesetRequest extends TeaModel {
    /**
     * <p>The ID of the WAF ruleset. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The execution phase of the WAF ruleset. Valid values:</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: A whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: A custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: A managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: A scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: A rate limit rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: An IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: A bot rule</p>
     * </li>
     * <li><p><code>http_security_level_rule</code>: A security rule</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The site ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWafRulesetRequest self = new GetWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public GetWafRulesetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetWafRulesetRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetWafRulesetRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
