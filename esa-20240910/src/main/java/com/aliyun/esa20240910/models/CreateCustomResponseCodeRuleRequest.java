// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomResponseCodeRuleRequest extends TeaModel {
    /**
     * <p>Response page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageId")
    public String pageId;

    /**
     * <p>Response code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ReturnCode")
    public String returnCode;

    /**
     * <p>Rule content. Use a conditional expression to match user requests. Do not set this parameter when adding a global configuration. There are two scenarios:</p>
     * <ul>
     * <li><p>Match all incoming requests: Set the value to true.</p>
     * </li>
     * <li><p>Match specific requests: Set the value to a custom expression, such as: (http.host eq &quot;video.example.com&quot;).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. Do not set this parameter when adding a global configuration. Valid values:</p>
     * <ul>
     * <li><p>on: Enable.</p>
     * </li>
     * <li><p>off: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name. Do not set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Rule execution order. A smaller value indicates higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Site ID. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API to get it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>805864735361584</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Site configuration version number. For sites with version management enabled, use this parameter to specify the site version where the configuration takes effect. The default is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateCustomResponseCodeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomResponseCodeRuleRequest self = new CreateCustomResponseCodeRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomResponseCodeRuleRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public CreateCustomResponseCodeRuleRequest setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public CreateCustomResponseCodeRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateCustomResponseCodeRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateCustomResponseCodeRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateCustomResponseCodeRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateCustomResponseCodeRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateCustomResponseCodeRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
