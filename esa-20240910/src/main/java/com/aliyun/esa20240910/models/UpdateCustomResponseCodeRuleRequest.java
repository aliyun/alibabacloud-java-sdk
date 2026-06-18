// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCustomResponseCodeRuleRequest extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The response page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageId")
    public String pageId;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ReturnCode")
    public String returnCode;

    /**
     * <p>The rule content. Use a conditional expression to match user requests. Do not set this parameter when adding a global configuration. There are two scenarios:</p>
     * <ul>
     * <li><p>Match all incoming requests: Set the value to \<code>true\\</code>.</p>
     * </li>
     * <li><p>Match specific requests: Set the value to a custom expression, such as: \<code>(http.host eq &quot;video.example.com&quot;)\\</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. Do not set this parameter when adding a global configuration. Valid values:</p>
     * <ul>
     * <li><p>on: Enable the rule.</p>
     * </li>
     * <li><p>off: Disable the rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. Do not set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. A smaller value indicates higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. Get it by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>437375513708224</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateCustomResponseCodeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomResponseCodeRuleRequest self = new UpdateCustomResponseCodeRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomResponseCodeRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateCustomResponseCodeRuleRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public UpdateCustomResponseCodeRuleRequest setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public UpdateCustomResponseCodeRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateCustomResponseCodeRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateCustomResponseCodeRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateCustomResponseCodeRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateCustomResponseCodeRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
