// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRewriteUrlRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>example=123</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("RewriteQueryStringType")
    public String rewriteQueryStringType;

    /**
     * <strong>example:</strong>
     * <p>static</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("RewriteUriType")
    public String rewriteUriType;

    /**
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <strong>example:</strong>
     * <p>example=123</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
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
