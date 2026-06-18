// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateWafRulesShrinkRequest extends TeaModel {
    /**
     * <p>An array of rule configurations. Each object defines the settings for a single rule.</p>
     */
    @NameInMap("Configs")
    public String configsShrink;

    /**
     * <p>The WAF phase in which the rules are executed.</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: rate limit rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: bot control rule</p>
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
     * <p>The shared configuration object that specifies common properties for all rules created in the batch.</p>
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
     * <p>For sites with version management enabled, use this parameter to specify which site version the configuration applies to. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static BatchCreateWafRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateWafRulesShrinkRequest self = new BatchCreateWafRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateWafRulesShrinkRequest setConfigsShrink(String configsShrink) {
        this.configsShrink = configsShrink;
        return this;
    }
    public String getConfigsShrink() {
        return this.configsShrink;
    }

    public BatchCreateWafRulesShrinkRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public BatchCreateWafRulesShrinkRequest setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public BatchCreateWafRulesShrinkRequest setSharedShrink(String sharedShrink) {
        this.sharedShrink = sharedShrink;
        return this;
    }
    public String getSharedShrink() {
        return this.sharedShrink;
    }

    public BatchCreateWafRulesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public BatchCreateWafRulesShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
