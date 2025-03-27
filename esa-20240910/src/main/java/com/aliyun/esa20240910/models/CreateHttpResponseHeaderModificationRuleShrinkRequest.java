// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpResponseHeaderModificationRuleShrinkRequest extends TeaModel {
    /**
     * <p>Modify response headers, supporting add, delete, and modify operations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResponseHeaderModification")
    public String responseHeaderModificationShrink;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>To match all incoming requests: Set the value to true</li>
     * <li>To match specific requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter is not required when adding a global configuration. Possible values:</p>
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
     * <p>Rule name. This parameter is not required when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Site ID. You can obtain this by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456******</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version of the site where the configuration will take effect. The default is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpResponseHeaderModificationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpResponseHeaderModificationRuleShrinkRequest self = new CreateHttpResponseHeaderModificationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setResponseHeaderModificationShrink(String responseHeaderModificationShrink) {
        this.responseHeaderModificationShrink = responseHeaderModificationShrink;
        return this;
    }
    public String getResponseHeaderModificationShrink() {
        return this.responseHeaderModificationShrink;
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpResponseHeaderModificationRuleShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
