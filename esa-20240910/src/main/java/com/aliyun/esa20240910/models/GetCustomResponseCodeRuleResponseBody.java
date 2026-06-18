// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCustomResponseCodeRuleResponseBody extends TeaModel {
    /**
     * <p>Configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><p>global: Global configuration.</p>
     * </li>
     * <li><p>rule: Rule configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The response page.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageId")
    public String pageId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ReturnCode")
    public String returnCode;

    /**
     * <p>The rule content. Use conditional expressions to match user requests. Do not set this parameter when adding a global configuration. There are two scenarios:</p>
     * <ul>
     * <li><p>Match all incoming requests: Set the value to true.</p>
     * </li>
     * <li><p>Match specific requests: Set the value to a custom expression, such as (http.host eq &quot;video.example.com&quot;).</p>
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
     * <p>The rule name. Do not set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. A smaller value indicates higher execution priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the site configuration. For sites with version control enabled, use this parameter to specify the site version where the configuration takes effect. The default is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetCustomResponseCodeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomResponseCodeRuleResponseBody self = new GetCustomResponseCodeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomResponseCodeRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetCustomResponseCodeRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetCustomResponseCodeRuleResponseBody setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public GetCustomResponseCodeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomResponseCodeRuleResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public GetCustomResponseCodeRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetCustomResponseCodeRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetCustomResponseCodeRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetCustomResponseCodeRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetCustomResponseCodeRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
