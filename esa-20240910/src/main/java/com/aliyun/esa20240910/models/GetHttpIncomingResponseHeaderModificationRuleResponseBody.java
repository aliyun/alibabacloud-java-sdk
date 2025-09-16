// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpIncomingResponseHeaderModificationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>432637955352576</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseHeaderModification")
    public java.util.List<GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification> responseHeaderModification;

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

    public static GetHttpIncomingResponseHeaderModificationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpIncomingResponseHeaderModificationRuleResponseBody self = new GetHttpIncomingResponseHeaderModificationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setResponseHeaderModification(java.util.List<GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification> responseHeaderModification) {
        this.responseHeaderModification = responseHeaderModification;
        return this;
    }
    public java.util.List<GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification> getResponseHeaderModification() {
        return this.responseHeaderModification;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification extends TeaModel {
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
         * <p>headerValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification self = new GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHttpIncomingResponseHeaderModificationRuleResponseBodyResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
