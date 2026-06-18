// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchUpdateWafRulesShrinkRequest extends TeaModel {
    /**
     * <p>A list of configurations for individual rules.</p>
     */
    @NameInMap("Configs")
    public String configsShrink;

    /**
     * <p>The WAF rule runtime phase.</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: rate limiting rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: advanced bot rule</p>
     * </li>
     * <li><p><code>http_security_level_rule</code>: security rule</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The ID of the WAF ruleset. You can call the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>The configuration properties that are shared by all rules in this batch update.</p>
     */
    @NameInMap("Shared")
    public String sharedShrink;

    /**
     * <p>The ID of the site. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version of the site configuration. For sites that have configuration version management enabled, this parameter specifies the version to which the configuration applies. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static BatchUpdateWafRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateWafRulesShrinkRequest self = new BatchUpdateWafRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateWafRulesShrinkRequest setConfigsShrink(String configsShrink) {
        this.configsShrink = configsShrink;
        return this;
    }
    public String getConfigsShrink() {
        return this.configsShrink;
    }

    public BatchUpdateWafRulesShrinkRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public BatchUpdateWafRulesShrinkRequest setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public BatchUpdateWafRulesShrinkRequest setSharedShrink(String sharedShrink) {
        this.sharedShrink = sharedShrink;
        return this;
    }
    public String getSharedShrink() {
        return this.sharedShrink;
    }

    public BatchUpdateWafRulesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public BatchUpdateWafRulesShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
