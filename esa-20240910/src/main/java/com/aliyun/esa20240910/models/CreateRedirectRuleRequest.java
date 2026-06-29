// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRedirectRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to preserve the query string. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ReserveQueryString")
    public String reserveQueryString;

    /**
     * <p>The rule content, which uses a conditional expression to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true.</li>
     * <li>Match specified requests: Set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when adding a global configuration.</p>
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
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version on which the configuration takes effect. The default value is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>The response status code used by the node when responding to the client with the redirect address. Valid values:</p>
     * <ul>
     * <li>301</li>
     * <li>302</li>
     * <li>303</li>
     * <li>307</li>
     * <li><ol start="308">
     * <li></li>
     * </ol>
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
     * <p>The target URL after redirection.</p>
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
     * <li>static: Static pattern.</li>
     * <li>dynamic: Dynamic pattern.</li>
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
