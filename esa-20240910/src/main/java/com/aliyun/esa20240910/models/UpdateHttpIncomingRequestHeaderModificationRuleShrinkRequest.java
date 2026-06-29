// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>Configuration ID. Can be obtained by calling the ListHttpIncomingRequestHeaderModificationRules API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>419717024278528</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Modify request headers. Three operation types are supported: add, delete, and modify.</p>
     */
    @NameInMap("RequestHeaderModification")
    public String requestHeaderModificationShrink;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true.</li>
     * <li>Match specified requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Valid values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name. This parameter does not need to be set when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Rule execution order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>568181195163328</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest self = new UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setRequestHeaderModificationShrink(String requestHeaderModificationShrink) {
        this.requestHeaderModificationShrink = requestHeaderModificationShrink;
        return this;
    }
    public String getRequestHeaderModificationShrink() {
        return this.requestHeaderModificationShrink;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
