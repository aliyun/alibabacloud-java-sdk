// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRewriteUrlRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example=123</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <strong>example:</strong>
     * <p>static</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
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
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <strong>example:</strong>
     * <p>/image/example.jpg</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static CreateRewriteUrlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRewriteUrlRuleRequest self = new CreateRewriteUrlRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRewriteUrlRuleRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public CreateRewriteUrlRuleRequest setRewriteQueryStringType(String rewriteQueryStringType) {
        this.rewriteQueryStringType = rewriteQueryStringType;
        return this;
    }
    public String getRewriteQueryStringType() {
        return this.rewriteQueryStringType;
    }

    public CreateRewriteUrlRuleRequest setRewriteUriType(String rewriteUriType) {
        this.rewriteUriType = rewriteUriType;
        return this;
    }
    public String getRewriteUriType() {
        return this.rewriteUriType;
    }

    public CreateRewriteUrlRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateRewriteUrlRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateRewriteUrlRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateRewriteUrlRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateRewriteUrlRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateRewriteUrlRuleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
