// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateWafRulesRequest extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<WafRuleConfig> configs;

    /**
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

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
