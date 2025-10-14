// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpIncomingResponseHeaderModificationRulesResponseBody extends TeaModel {
    /**
     * <p>The list of incoming response header modification rules.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs> configs;

    /**
     * <p>The number of the returned page. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 500. Valid values: 1 to 500.</p>
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
     * <p>CF02C6F6-DB59-5438-8C05-3CE42DFCB0AD</p>
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
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListHttpIncomingResponseHeaderModificationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpIncomingResponseHeaderModificationRulesResponseBody self = new ListHttpIncomingResponseHeaderModificationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponseBody setConfigs(java.util.List<ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHttpIncomingResponseHeaderModificationRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification extends TeaModel {
        /**
         * <p>The name of the response header.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The action. Specifies whether to check the image used by the instance supports hot migration. Valid values:</p>
         * <ul>
         * <li>add: adds a response header.</li>
         * <li>del: deletes a response header.</li>
         * <li>modify: modifies a response header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The type of the header. Valid values:</p>
         * <ul>
         * <li>static</li>
         * <li>dynamic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the response header.</p>
         * 
         * <strong>example:</strong>
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification self = new ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>430559776208896</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The type of the configuration. Specifies whether to check the image used by the instance supports hot migration. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The configurations of modifying response headers. You can add, delete, or modify a response header.</p>
         */
        @NameInMap("ResponseHeaderModification")
        public java.util.List<ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification> responseHeaderModification;

        /**
         * <p>The content of the rule. A conditional expression is used to match a user request. You do not need to set this parameter when you add global configuration. Use cases:</p>
         * <ul>
         * <li>true: Match all incoming requests.</li>
         * <li>Set the value to a custom expression, for example:(http.host eq &quot;video.example.com&quot;): Match the specified request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values: You do not need to set this parameter when you add global configuration. Specifies whether to check the image used by the instance supports hot migration. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name. You do not need to set this parameter when you add global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The order in which the rule is executed. A smaller value gives priority to the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The version number of the website configurations. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        public static ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs self = new ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setResponseHeaderModification(java.util.List<ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigsResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListHttpIncomingResponseHeaderModificationRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

    }

}
