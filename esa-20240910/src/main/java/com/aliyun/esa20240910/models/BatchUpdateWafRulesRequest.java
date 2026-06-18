// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchUpdateWafRulesRequest extends TeaModel {
    /**
     * <p>A list of configurations for individual rules.</p>
     */
    @NameInMap("Configs")
    public java.util.List<WafRuleConfig> configs;

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
    public WafBatchRuleShared shared;

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

    public static BatchUpdateWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateWafRulesRequest self = new BatchUpdateWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateWafRulesRequest setConfigs(java.util.List<WafRuleConfig> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<WafRuleConfig> getConfigs() {
        return this.configs;
    }

    public BatchUpdateWafRulesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public BatchUpdateWafRulesRequest setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public BatchUpdateWafRulesRequest setShared(WafBatchRuleShared shared) {
        this.shared = shared;
        return this;
    }
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    public BatchUpdateWafRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public BatchUpdateWafRulesRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
