// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingRequestHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. To obtain this ID, call the ListHttpIncomingRequestHeaderModificationRules API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>419717024278528</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>An array of objects that defines the request header modifications. Supported operations include <code>add</code>, <code>del</code>, and <code>modify</code>.</p>
     */
    @NameInMap("RequestHeaderModification")
    public String requestHeaderModificationShrink;

    /**
     * <p>The rule expression, a conditional expression that matches user requests. This parameter is not required for a global configuration. You can use this parameter in two ways:</p>
     * <ul>
     * <li><p>To match all incoming requests, set this value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, provide a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The status of the rule. This parameter is not required for a global configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The rule is enabled.</p>
     * </li>
     * <li><p><code>off</code>: The rule is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the rule. This parameter is not required for a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies the rule\&quot;s priority. Rules with a lower value are executed first.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the site. To obtain this ID, call the <a href="~~ListSites~~">ListSites</a> API.</p>
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
