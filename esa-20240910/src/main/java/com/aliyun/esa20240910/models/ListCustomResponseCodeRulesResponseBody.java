// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCustomResponseCodeRulesResponseBody extends TeaModel {
    /**
     * <p>You can modify the response code configuration list.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListCustomResponseCodeRulesResponseBodyConfigs> configs;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default value: 500. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListCustomResponseCodeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomResponseCodeRulesResponseBody self = new ListCustomResponseCodeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomResponseCodeRulesResponseBody setConfigs(java.util.List<ListCustomResponseCodeRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListCustomResponseCodeRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListCustomResponseCodeRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomResponseCodeRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomResponseCodeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomResponseCodeRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCustomResponseCodeRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListCustomResponseCodeRulesResponseBodyConfigs extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li><p>global: Global configuration.</p>
         * </li>
         * <li><p>rule: Rule configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The response page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReturnCode")
        public String returnCode;

        /**
         * <p>The rule content. Use a conditional expression to match user requests. Do not set this parameter when adding a global configuration. There are two scenarios:</p>
         * <ul>
         * <li><p>Match all incoming requests: Set the value to true.</p>
         * </li>
         * <li><p>Match specific requests: Set the value to a custom expression, such as (http.host eq &quot;video.example.com&quot;).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Do not set this parameter when adding a global configuration. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
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
         * <p>The rule execution order. A smaller value indicates higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The version number of the site configuration. For sites with configuration version control enabled, this parameter specifies the site version for which the configuration takes effect. The default value is version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        public static ListCustomResponseCodeRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCustomResponseCodeRulesResponseBodyConfigs self = new ListCustomResponseCodeRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListCustomResponseCodeRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

    }

}
