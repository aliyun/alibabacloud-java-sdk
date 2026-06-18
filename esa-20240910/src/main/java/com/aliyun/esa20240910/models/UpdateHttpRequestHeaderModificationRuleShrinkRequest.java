// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpRequestHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>The configuration ID. Call the <a href="https://help.aliyun.com/document_detail/2867483.html">ListHttpRequestHeaderModificationRules</a> operation to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Specifies the modifications for the request header. Supported operations include <code>add</code>, <code>del</code>, and <code>modify</code>.</p>
     */
    @NameInMap("RequestHeaderModification")
    public String requestHeaderModificationShrink;

    /**
     * <p>The Conditional Expression used to match User Requests. This parameter is not required for a Global Configuration. Use cases:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, use a custom expression, for example, <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether the Rule is enabled. This parameter is not required for a Global Configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enable</p>
     * </li>
     * <li><p><code>off</code>: Disable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the Rule. This parameter is not required for a Global Configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution priority of the Rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpRequestHeaderModificationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpRequestHeaderModificationRuleShrinkRequest self = new UpdateHttpRequestHeaderModificationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setRequestHeaderModificationShrink(String requestHeaderModificationShrink) {
        this.requestHeaderModificationShrink = requestHeaderModificationShrink;
        return this;
    }
    public String getRequestHeaderModificationShrink() {
        return this.requestHeaderModificationShrink;
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpRequestHeaderModificationRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
