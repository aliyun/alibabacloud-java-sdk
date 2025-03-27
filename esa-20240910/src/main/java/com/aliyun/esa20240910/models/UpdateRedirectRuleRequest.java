// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRedirectRuleRequest extends TeaModel {
    /**
     * <p>Configuration ID. It can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2867474.html">ListRedirectRules</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Preserve query string. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ReserveQueryString")
    public String reserveQueryString;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
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
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The response status code used by the node to respond with the redirect address to the client. Value range:</p>
     * <ul>
     * <li>301</li>
     * <li>302</li>
     * <li>303</li>
     * <li>307</li>
     * <li>308</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>301</p>
     */
    @NameInMap("StatusCode")
    public String statusCode;

    /**
     * <p>The target URL after redirection.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
     */
    @NameInMap("TargetUrl")
    public String targetUrl;

    /**
     * <p>Redirect type. Value range:</p>
     * <ul>
     * <li>static: Static mode.</li>
     * <li>dynamic: Dynamic mode.</li>
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
