// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpIncomingRequestHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>402411533580288</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("RequestHeaderModification")
    public java.util.List<GetHttpIncomingRequestHeaderModificationRuleResponseBodyRequestHeaderModification> requestHeaderModification;

    /**
     * <strong>example:</strong>
     * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
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
         * <strong>example:</strong>
         * <p>headerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
