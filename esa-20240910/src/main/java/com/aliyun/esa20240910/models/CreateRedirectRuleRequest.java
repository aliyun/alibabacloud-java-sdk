// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRedirectRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to preserve the query string from the original request. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Preserves the query string.</p>
     * </li>
     * <li><p><code>off</code>: Discards the query string.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ReserveQueryString")
    public String reserveQueryString;

    /**
     * <p>The rule content, which is a conditional expression used to match user requests. Do not set this parameter when adding a global configuration. The following use cases are supported:</p>
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
     * <p>Specifies whether to enable the rule. Do not set this parameter when adding a global configuration. Valid values:</p>
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
     * <p>The rule name. Do not set this parameter when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution priority of the rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. To get this value, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>For sites with configuration version management enabled, specify the version to which this configuration applies.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>The status code that the edge node returns to the client for the redirect. Valid values:</p>
     * <ul>
     * <li><p>301</p>
     * </li>
     * <li><p>302</p>
     * </li>
     * <li><p>303</p>
     * </li>
     * <li><p>307</p>
     * </li>
     * <li><p>308</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>301</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>The target URL for the redirect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
     */
    @NameInMap("TargetUrl")
    public String targetUrl;

    /**
     * <p>The redirect type. Valid values:</p>
     * <ul>
     * <li><p><code>static</code>: Static mode.</p>
     * </li>
     * <li><p><code>dynamic</code>: Dynamic mode.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateRedirectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRedirectRuleRequest self = new CreateRedirectRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRedirectRuleRequest setReserveQueryString(String reserveQueryString) {
        this.reserveQueryString = reserveQueryString;
        return this;
    }
    public String getReserveQueryString() {
        return this.reserveQueryString;
    }

    public CreateRedirectRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateRedirectRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateRedirectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRedirectRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateRedirectRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateRedirectRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateRedirectRuleRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public CreateRedirectRuleRequest setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public CreateRedirectRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
