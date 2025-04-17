// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateWafRulesRequest extends TeaModel {
    /**
     * <p>A list of configurations for each rule, specifying detailed configurations for each rule.</p>
     */
    @NameInMap("Configs")
    public java.util.List<WafRuleConfig> configs;

    /**
     * <p>WAF rule type, with values:</p>
     * <ul>
     * <li><strong>http_anti_scan</strong>: Scan protection.</li>
     * <li><strong>http_bot</strong>: Bots.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Ruleset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>Shared configuration for multiple rules, specifying common attributes of multiple rules.</p>
     */
    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Site version.</p>
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
