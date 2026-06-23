// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>The response header modifications. Three operation types are supported: add, delete, and modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public String responseHeaderModificationShrink;

    /**
     * <p>The rule content, which uses a conditional expression to match user requests. You do not need to set this parameter when you add a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: set the value to true.</li>
     * <li>Match specified requests: set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. You do not need to set this parameter when you add a global configuration. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when you add a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>608665779308176</p>
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

    public static CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest self = new CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setResponseHeaderModificationShrink(String responseHeaderModificationShrink) {
        this.responseHeaderModificationShrink = responseHeaderModificationShrink;
        return this;
    }
    public String getResponseHeaderModificationShrink() {
        return this.responseHeaderModificationShrink;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpIncomingResponseHeaderModificationRuleShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
