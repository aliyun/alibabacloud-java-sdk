// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpRequestHeaderModificationRulesResponseBody extends TeaModel {
    /**
     * <p>The list of HTTP request header modification configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListHttpRequestHeaderModificationRulesResponseBodyConfigs> configs;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>500</strong>. Valid values: <strong>1 to 500</strong>.</p>
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
     * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
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

    public static ListHttpRequestHeaderModificationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpRequestHeaderModificationRulesResponseBody self = new ListHttpRequestHeaderModificationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpRequestHeaderModificationRulesResponseBody setConfigs(java.util.List<ListHttpRequestHeaderModificationRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListHttpRequestHeaderModificationRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListHttpRequestHeaderModificationRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpRequestHeaderModificationRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpRequestHeaderModificationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHttpRequestHeaderModificationRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHttpRequestHeaderModificationRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification extends TeaModel {
        /**
         * <p>The request header name.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: adds a header.</li>
         * <li>del: deletes a header.</li>
         * <li>modify: modifies a header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The value type. Valid values:</p>
         * <ul>
         * <li>static: static pattern.</li>
         * <li>dynamic: dynamic schema.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The request header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification self = new ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListHttpRequestHeaderModificationRulesResponseBodyConfigs extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The request header modifications, which support add, delete, and modify operations.</p>
         */
        @NameInMap("RequestHeaderModification")
        public java.util.List<ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification> requestHeaderModification;

        /**
         * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
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
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
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
         * <p>The execution order of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. The default value is version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        public static ListHttpRequestHeaderModificationRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListHttpRequestHeaderModificationRulesResponseBodyConfigs self = new ListHttpRequestHeaderModificationRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setRequestHeaderModification(java.util.List<ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<ListHttpRequestHeaderModificationRulesResponseBodyConfigsRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListHttpRequestHeaderModificationRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

    }

}
