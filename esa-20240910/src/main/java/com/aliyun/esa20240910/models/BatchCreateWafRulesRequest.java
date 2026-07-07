// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateWafRulesRequest extends TeaModel {
    /**
     * <p>The list of rule configurations. Specifies the detailed configuration for each rule.</p>
     * <p><strong>Required subfields for each phase</strong> (applicable only to the two phases supported by this batch operation):</p>
     * <ul>
     * <li><code>http_anti_scan</code>: You must specify <code>Type</code> and at least one of <code>ManagedList</code> or <code>RateLimit</code>.</li>
     * <li><code>http_bot</code>: You must specify the advanced mode bots configuration. The subfields are defined in the <code>WafRuleConfig</code> data structure.</li>
     * </ul>
     * <blockquote>
     * <p>Note: Other phases such as <code>http_custom</code> and <code>http_whitelist</code> cannot use this batch operation. Use the single-rule operation <code>CreateWafRule</code> instead. The subfield constraints are described in the single-rule operation documentation.</p>
     * </blockquote>
     * <blockquote>
     * <p>If <code>Configs</code> is not specified or required subfields are missing, the service returns <code>InvalidParameter(400)</code> or <code>Rule.Config.Malformed</code>.</p>
     * </blockquote>
     */
    @NameInMap("Configs")
    public java.util.List<WafRuleConfig> configs;

    /**
     * <p>The WAF rule execution phase. This <strong>batch operation supports only</strong> the following two phases. For other phases, use the single-rule operations <code>CreateWafRule</code> or <code>UpdateWafRule</code>:</p>
     * <ul>
     * <li><code>http_anti_scan</code>: scan protection rules</li>
     * <li><code>http_bot</code>: advanced mode bots</li>
     * </ul>
     * <blockquote>
     * <p>Note: The <code>http_anti_scan</code> and <code>http_bot</code> phases <strong>support only batch creation</strong>. The single-rule operation <code>CreateWafRule</code> does not accept these two values. Conversely, other phases such as <code>http_custom</code> and <code>http_whitelist</code> can be created only by using single-rule operations and cannot use this batch operation.</p>
     * </blockquote>
     * <p><strong>Required constraint</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>required</strong> when you call this batch operation. If this parameter is not specified, the service returns <code>InvalidParameter(400)</code>.</p>
     * <p><strong>Plan prerequisite</strong>: <code>http_anti_scan</code> requires the site to have a <strong>high or higher plan</strong>. Calling this operation with a basic plan returns <code>Phase.HttpAntiScan.NotSupport</code>. Verify the site plan before calling this operation.</p>
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
     * <p>The shared configuration for multiple rules. Specifies the common properties of multiple rules.</p>
     * <p><strong>Conditionally required</strong>: Although this parameter is marked as optional (required: false) in the specification, it is <strong>required</strong> when <code>Phase=http_anti_scan</code>. If this parameter is not specified, the service returns <code>InvalidParameter(400)</code>.</p>
     * <p><strong>Subfield requirements</strong>: In the <code>http_anti_scan</code> phase, Shared must include shared fields such as <code>Name</code> (rule name) and <code>Action</code> (rule action). For other phases, the required subfields of Shared vary depending on the specific phase.</p>
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

    public static BatchCreateWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateWafRulesRequest self = new BatchCreateWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateWafRulesRequest setConfigs(java.util.List<WafRuleConfig> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<WafRuleConfig> getConfigs() {
        return this.configs;
    }

    public BatchCreateWafRulesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public BatchCreateWafRulesRequest setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public BatchCreateWafRulesRequest setShared(WafBatchRuleShared shared) {
        this.shared = shared;
        return this;
    }
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    public BatchCreateWafRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public BatchCreateWafRulesRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
