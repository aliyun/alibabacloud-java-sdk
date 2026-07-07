// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRewriteUrlRuleRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the <a href="https://help.aliyun.com/document_detail/2867480.html">ListRewriteUrlRules</a> operation to obtain the configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The query string after rewriting.</p>
     * 
     * <strong>example:</strong>
     * <p>example=123</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>The query character string rewrite type. Valid values:</p>
     * <ul>
     * <li>static: static pattern.</li>
     * <li>dynamic: dynamic pattern.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RewriteQueryStringType")
    public String rewriteQueryStringType;

    /**
     * <p>The path rewrite type. Valid values:</p>
     * <ul>
     * <li>static: static pattern.</li>
     * <li>dynamic: dynamic pattern.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("RewriteUriType")
    public String rewriteUriType;

    /**
     * <p>The rule content. A conditional expression is used to match user requests. This parameter is not required when you add a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true.</li>
     * <li>Match specified requests: Set the value to a custom expression, for example, (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>The rule switch. This parameter is not required when you add a global configuration. Valid values:</p>
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
     * <p>The rule name. This parameter is not required when you add a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>example=123</p>
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
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The target URI after rewriting.</p>
     * 
     * <strong>example:</strong>
     * <p>/image/example.jpg</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static UpdateRewriteUrlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRewriteUrlRuleRequest self = new UpdateRewriteUrlRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRewriteUrlRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateRewriteUrlRuleRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public UpdateRewriteUrlRuleRequest setRewriteQueryStringType(String rewriteQueryStringType) {
        this.rewriteQueryStringType = rewriteQueryStringType;
        return this;
    }
    public String getRewriteQueryStringType() {
        return this.rewriteQueryStringType;
    }

    public UpdateRewriteUrlRuleRequest setRewriteUriType(String rewriteUriType) {
        this.rewriteUriType = rewriteUriType;
        return this;
    }
    public String getRewriteUriType() {
        return this.rewriteUriType;
    }

    public UpdateRewriteUrlRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateRewriteUrlRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateRewriteUrlRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateRewriteUrlRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateRewriteUrlRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateRewriteUrlRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
