// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchUpdateWafRulesShrinkRequest extends TeaModel {
    @NameInMap("Configs")
    public String configsShrink;

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
    public String sharedShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

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
