// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpRequestHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>An array of objects that define Request Header modifications. Supported operations include add, del, and modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestHeaderModification")
    public String requestHeaderModificationShrink;

    /**
     * <p>The content of the Rule, which uses a Conditional Expression to match user requests. This parameter is not required when you add a global configuration. Supports two Use Cases:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to true.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, for example, (http.host eq &quot;video.example.com&quot;).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the Rule. This parameter is not required when you add a global configuration. Valid values are:</p>
     * <ul>
     * <li><p>on: Enables the Rule.</p>
     * </li>
     * <li><p>off: Disables the Rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the Rule. This parameter is not required when you add a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order of the Rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the Site. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The Version of the Site configuration. For a Site with configuration versioning enabled, this parameter specifies the configuration\&quot;s target Version. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpRequestHeaderModificationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpRequestHeaderModificationRuleShrinkRequest self = new CreateHttpRequestHeaderModificationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setRequestHeaderModificationShrink(String requestHeaderModificationShrink) {
        this.requestHeaderModificationShrink = requestHeaderModificationShrink;
        return this;
    }
    public String getRequestHeaderModificationShrink() {
        return this.requestHeaderModificationShrink;
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpRequestHeaderModificationRuleShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
