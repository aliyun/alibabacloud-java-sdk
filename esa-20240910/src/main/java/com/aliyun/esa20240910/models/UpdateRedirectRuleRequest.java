// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRedirectRuleRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. To get this ID, call the <a href="https://help.aliyun.com/document_detail/2867474.html">ListRedirectRules</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Specifies whether to preserve the query string of the original request. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Preserves the query string.</p>
     * </li>
     * <li><p><code>off</code>: Does not preserve the query string.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ReserveQueryString")
    public String reserveQueryString;

    /**
     * <p>The conditional expression that matches user requests. This parameter is not required for a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li><p>To match all requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, use a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. This parameter is not required for a global configuration. Valid values:</p>
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
     * <p>The execution order of the rule. A lower value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the site. To get this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The response status code that the edge node returns to the client for the redirect. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>301</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>The URL to which requests are redirected.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
     */
    @NameInMap("TargetUrl")
    public String targetUrl;

    /**
     * <p>The redirection type. Valid values:</p>
     * <ul>
     * <li><p><code>static</code>: Static mode.</p>
     * </li>
     * <li><p><code>dynamic</code>: Dynamic mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateRedirectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRedirectRuleRequest self = new UpdateRedirectRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRedirectRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateRedirectRuleRequest setReserveQueryString(String reserveQueryString) {
        this.reserveQueryString = reserveQueryString;
        return this;
    }
    public String getReserveQueryString() {
        return this.reserveQueryString;
    }

    public UpdateRedirectRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateRedirectRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateRedirectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateRedirectRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateRedirectRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateRedirectRuleRequest setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public UpdateRedirectRuleRequest setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public UpdateRedirectRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
