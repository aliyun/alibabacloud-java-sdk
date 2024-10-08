// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchUpdateWafRulesRequest extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<WafRuleConfig> configs;

    /**
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

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
