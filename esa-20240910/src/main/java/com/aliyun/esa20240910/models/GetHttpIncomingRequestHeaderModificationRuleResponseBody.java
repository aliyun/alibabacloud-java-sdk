// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpIncomingRequestHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>402411533580288</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The type of the configuration. Valid values:</p>
     * <ul>
     * <li>global: the global configuration.</li>
     * <li>rule: the rule configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The configurations for modifying request headers. You can add, delete, or edit a request header.</p>
     */
    @NameInMap("RequestHeaderModification")
    public java.util.List<GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification> requestHeaderModification;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The content of the rule. A conditional expression is used to match a user request. You do not need to set this parameter when you add global configuration. Use cases:</p>
     * <ul>
     * <li>true: Match all incoming requests.</li>
     * <li>Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;): Match the specified request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq &quot;video.example.com&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. Valid values: You do not need to set this parameter when you add global configuration. Valid values:</p>
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

    public static GetHttpIncomingRequestHeaderModificationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpIncomingRequestHeaderModificationRuleResponseBody self = new GetHttpIncomingRequestHeaderModificationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setRequestHeaderModification(java.util.List<GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification> requestHeaderModification) {
        this.requestHeaderModification = requestHeaderModification;
        return this;
    }
    public java.util.List<GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification extends TeaModel {
        /**
         * <p>The name of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The action. Valid values:</p>
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
         * <p>The value type. Valid values:</p>
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
         * <p>The value of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>headValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification self = new GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
