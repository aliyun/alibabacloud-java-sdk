// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRedirectRulesResponseBody extends TeaModel {
    /**
     * <p>List of redirect configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListRedirectRulesResponseBodyConfigs> configs;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

    public static ListRedirectRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRedirectRulesResponseBody self = new ListRedirectRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRedirectRulesResponseBody setConfigs(java.util.List<ListRedirectRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListRedirectRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListRedirectRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRedirectRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRedirectRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRedirectRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRedirectRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListRedirectRulesResponseBodyConfigs extends TeaModel {
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
         * <li>global: Global configuration.</li>
         * <li>rule: Rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Preserve query string. Value range:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ReserveQueryString")
        public String reserveQueryString;

        /**
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
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
         * <p>Rule execution order. The smaller the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the site configuration, with the default being version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>Response status code used by the node to respond to the client with the redirect address. Possible values:</p>
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
         * <p>Target URL after redirection.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>Redirect type. Possible values:</p>
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

        public static ListRedirectRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListRedirectRulesResponseBodyConfigs self = new ListRedirectRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListRedirectRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListRedirectRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListRedirectRulesResponseBodyConfigs setReserveQueryString(String reserveQueryString) {
            this.reserveQueryString = reserveQueryString;
            return this;
        }
        public String getReserveQueryString() {
            return this.reserveQueryString;
        }

        public ListRedirectRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListRedirectRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListRedirectRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListRedirectRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListRedirectRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListRedirectRulesResponseBodyConfigs setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListRedirectRulesResponseBodyConfigs setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public ListRedirectRulesResponseBodyConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
