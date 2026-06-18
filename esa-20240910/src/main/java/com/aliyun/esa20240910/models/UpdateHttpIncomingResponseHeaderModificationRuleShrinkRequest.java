// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can obtain this ID by calling the <code>ListHttpIncomingResponseHeaderModificationRules</code> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>A list of objects specifying modifications to response headers. Supported operations include <code>add</code>, <code>del</code>, and <code>modify</code>.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public String responseHeaderModificationShrink;

    /**
     * <p>The condition expression used to match incoming requests. This parameter is not required for a global configuration. You can use this parameter in two ways:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
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
     * <li><p><code>on</code>: Enables the rule.</p>
     * </li>
     * <li><p><code>off</code>: Disables the rule.</p>
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
     * <p>The priority of the rule. Rules with a lower value are executed first.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. You can obtain this ID by calling the <code>ListSites</code> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>498607398028944</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest self = new UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setResponseHeaderModificationShrink(String responseHeaderModificationShrink) {
        this.responseHeaderModificationShrink = responseHeaderModificationShrink;
        return this;
    }
    public String getResponseHeaderModificationShrink() {
        return this.responseHeaderModificationShrink;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpIncomingResponseHeaderModificationRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
