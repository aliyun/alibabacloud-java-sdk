// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRewriteUrlRuleResponseBody extends TeaModel {
    /**
     * <p>Configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Configuration type. Possible values:</p>
     * <ul>
     * <li>global: Global configuration;</li>
     * <li>rule: Rule-based configuration;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The rewritten query string.</p>
     * 
     * <strong>example:</strong>
     * <p>example=123</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Query string rewrite type. Possible values:</p>
     * <ul>
     * <li>static: Static mode.</li>
     * <li>dynamic: Dynamic mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RewriteQueryStringType")
    public String rewriteQueryStringType;

    /**
     * <p>URI rewrite type. Possible values:</p>
     * <ul>
     * <li>static: Static mode.</li>
     * <li>dynamic: Dynamic mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RewriteUriType")
    public String rewriteUriType;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Possible values:</p>
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
     * <p>Rule name. This parameter does not need to be set when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Rule execution order. The smaller the value, the higher the priority for execution.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the site, defaulting to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>The target URI after rewriting.</p>
     * 
     * <strong>example:</strong>
     * <p>/image/example.jpg</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static GetRewriteUrlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRewriteUrlRuleResponseBody self = new GetRewriteUrlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRewriteUrlRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetRewriteUrlRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetRewriteUrlRuleResponseBody setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public GetRewriteUrlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRewriteUrlRuleResponseBody setRewriteQueryStringType(String rewriteQueryStringType) {
        this.rewriteQueryStringType = rewriteQueryStringType;
        return this;
    }
    public String getRewriteQueryStringType() {
        return this.rewriteQueryStringType;
    }

    public GetRewriteUrlRuleResponseBody setRewriteUriType(String rewriteUriType) {
        this.rewriteUriType = rewriteUriType;
        return this;
    }
    public String getRewriteUriType() {
        return this.rewriteUriType;
    }

    public GetRewriteUrlRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetRewriteUrlRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetRewriteUrlRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetRewriteUrlRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetRewriteUrlRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public GetRewriteUrlRuleResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
