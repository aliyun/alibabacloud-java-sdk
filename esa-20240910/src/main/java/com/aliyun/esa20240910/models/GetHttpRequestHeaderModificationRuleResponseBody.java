// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpRequestHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><p>global: A global configuration.</p>
     * </li>
     * <li><p>rule: A rule-based configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The request header modifications. The add, delete, and modify operations are supported.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The content of the rule, which uses a conditional expression to match user requests. This parameter is not required for global configurations. There are two scenarios:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to true.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, such as (http.host eq &quot;video.example.com&quot;).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether the rule is enabled. This parameter is not required for global configurations. Valid values:</p>
     * <ul>
     * <li><p>on: The rule is enabled.</p>
     * </li>
     * <li><p>off: The rule is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the rule. This parameter is not required for global configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order of the rule. Rules with smaller values are executed first.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, this parameter specifies the site version to which the configuration applies. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetHttpRequestHeaderModificationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpRequestHeaderModificationRuleResponseBody self = new GetHttpRequestHeaderModificationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setRequestHeaderModification(java.util.List<GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification> requestHeaderModification) {
        this.requestHeaderModification = requestHeaderModification;
        return this;
    }
    public java.util.List<GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetHttpRequestHeaderModificationRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification extends TeaModel {
        /**
         * <p>The name of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation to perform. Valid values:</p>
         * <ul>
         * <li><p>add: Adds a header.</p>
         * </li>
         * <li><p>del: Deletes a header.</p>
         * </li>
         * <li><p>modify: Modifies a header.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The type of the value. Valid values:</p>
         * <ul>
         * <li><p>static: A static value.</p>
         * </li>
         * <li><p>dynamic: A dynamic value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>headValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification self = new GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHttpRequestHeaderModificationRuleResponseBodyRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
