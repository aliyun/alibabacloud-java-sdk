// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRewriteUrlRulesResponseBody extends TeaModel {
    /**
     * <p>List of rewrite URL configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListRewriteUrlRulesResponseBodyConfigs> configs;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The size of the page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListRewriteUrlRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRewriteUrlRulesResponseBody self = new ListRewriteUrlRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRewriteUrlRulesResponseBody setConfigs(java.util.List<ListRewriteUrlRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListRewriteUrlRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListRewriteUrlRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRewriteUrlRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRewriteUrlRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRewriteUrlRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRewriteUrlRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListRewriteUrlRulesResponseBodyConfigs extends TeaModel {
        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39538644977****</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Configuration type. Value range:</p>
         * <ul>
         * <li>global: Global configuration;</li>
         * <li>rule: Rule configuration;</li>
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
         * <p>Query string rewrite type. Value range:</p>
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
         * <p>URI rewrite type. Value range:</p>
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
         * <p>Rule content, using conditional expressions to match user requests. Not required when adding a global configuration. There are two usage scenarios:</p>
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
         * <p>Rule switch. Not required when adding a global configuration. Value range:</p>
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
         * <p>Rule name. Not required when adding a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Rule execution order. The smaller the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the configuration, defaulting to version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>Target URI after rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>/image.example.com/index.html</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static ListRewriteUrlRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListRewriteUrlRulesResponseBodyConfigs self = new ListRewriteUrlRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListRewriteUrlRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setRewriteQueryStringType(String rewriteQueryStringType) {
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setRewriteUriType(String rewriteUriType) {
            this.rewriteUriType = rewriteUriType;
            return this;
        }
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListRewriteUrlRulesResponseBodyConfigs setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
