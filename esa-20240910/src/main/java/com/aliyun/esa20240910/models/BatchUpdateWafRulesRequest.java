// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchUpdateWafRulesRequest extends TeaModel {
    /**
     * <p>The list of rule configurations. Specifies the detailed configuration for each rule.</p>
     * <p><strong>Required subfields for each phase</strong> (applicable only to the two phases supported by this batch operation):</p>
     * <ul>
     * <li><code>http_anti_scan</code>: You must provide <code>Type</code> and at least one of <code>ManagedList</code> or <code>RateLimit</code>.</li>
     * <li><code>http_bot</code>: You must provide the advanced mode bots configuration. The subfields are defined in the <code>WafRuleConfig</code> data structure.</li>
     * </ul>
     * <blockquote>
     * <p>Note: Other phases such as <code>http_custom</code> and <code>http_whitelist</code> cannot use this batch operation. Use the single-rule operation <code>UpdateWafRule</code> instead. The subfield constraints for those phases are described in the single-rule operation documentation.</p>
     * </blockquote>
     * <blockquote>
     * <p>Important: If <code>Configs</code> is missing or subfields are incomplete, the server returns <code>InvalidParameter(400)</code> or <code>Rule.Config.Malformed</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Configs")
    public java.util.List<WafRuleConfig> configs;

    /**
     * <p>The WAF rule execution phase. This <strong>batch operation supports only</strong> the following two phases. For other phases, use the single-rule operation <code>UpdateWafRule</code>:</p>
     * <ul>
     * <li><code>http_anti_scan</code>: scan protection rules</li>
     * <li><code>http_bot</code>: advanced mode bots</li>
     * </ul>
     * <blockquote>
     * <p>Note: The <code>http_anti_scan</code> and <code>http_bot</code> phases <strong>support only batch updates</strong>. The single-rule operation <code>UpdateWafRule</code> does not accept these two values. Conversely, other phases such as <code>http_custom</code> and <code>http_whitelist</code> can be updated only by using the single-rule operation, not this batch operation.</p>
     * </blockquote>
     * <p><strong>Required constraint</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>required</strong> when you call this batch operation. The server cannot determine the target ruleset without the Phase parameter and returns <code>InvalidParameter(400)</code> if it is not provided.</p>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The ID of the WAF ruleset. You can call the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation to obtain the ruleset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>The shared configuration for multiple rules. Specifies the common properties shared across multiple rules.</p>
     * <p><strong>Conditionally required</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>required</strong> when <code>Phase=http_anti_scan</code>. The server returns <code>InvalidParameter(400)</code> if it is not provided.</p>
     * <p><strong>Subfield requirements</strong>: When the phase is <code>http_anti_scan</code>, Shared must include the <code>Name</code> (rule name), <code>Expression</code> (match expression), and <code>Action</code> (rule action) shared fields. For other phases, the required subfields of Shared vary depending on the specific phase.</p>
     */
    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is 0.</p>
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
