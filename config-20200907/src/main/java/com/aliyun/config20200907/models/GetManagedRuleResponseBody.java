// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetManagedRuleResponseBody extends TeaModel {
    @NameInMap("ManagedRule")
    public GetManagedRuleResponseBodyManagedRule managedRule;

    @NameInMap("RequestId")
    public String requestId;

    public static GetManagedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedRuleResponseBody self = new GetManagedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedRuleResponseBody setManagedRule(GetManagedRuleResponseBodyManagedRule managedRule) {
        this.managedRule = managedRule;
        return this;
    }
    public GetManagedRuleResponseBodyManagedRule getManagedRule() {
        return this.managedRule;
    }

    public GetManagedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetManagedRuleResponseBodyManagedRuleScope extends TeaModel {
        @NameInMap("ComplianceResourceTypes")
        public java.util.List<String> complianceResourceTypes;

        public static GetManagedRuleResponseBodyManagedRuleScope build(java.util.Map<String, ?> map) throws Exception {
            GetManagedRuleResponseBodyManagedRuleScope self = new GetManagedRuleResponseBodyManagedRuleScope();
            return TeaModel.build(map, self);
        }

        public GetManagedRuleResponseBodyManagedRuleScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

    }

    public static class GetManagedRuleResponseBodyManagedRuleSourceDetails extends TeaModel {
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        public String messageType;

        public static GetManagedRuleResponseBodyManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetManagedRuleResponseBodyManagedRuleSourceDetails self = new GetManagedRuleResponseBodyManagedRuleSourceDetails();
            return TeaModel.build(map, self);
        }

        public GetManagedRuleResponseBodyManagedRuleSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetManagedRuleResponseBodyManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class GetManagedRuleResponseBodyManagedRule extends TeaModel {
        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("Description")
        public String description;

        @NameInMap("HelpUrls")
        public String helpUrls;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("Scope")
        public GetManagedRuleResponseBodyManagedRuleScope scope;

        @NameInMap("SourceDetails")
        public java.util.List<GetManagedRuleResponseBodyManagedRuleSourceDetails> sourceDetails;

        public static GetManagedRuleResponseBodyManagedRule build(java.util.Map<String, ?> map) throws Exception {
            GetManagedRuleResponseBodyManagedRule self = new GetManagedRuleResponseBodyManagedRule();
            return TeaModel.build(map, self);
        }

        public GetManagedRuleResponseBodyManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public GetManagedRuleResponseBodyManagedRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetManagedRuleResponseBodyManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetManagedRuleResponseBodyManagedRule setHelpUrls(String helpUrls) {
            this.helpUrls = helpUrls;
            return this;
        }
        public String getHelpUrls() {
            return this.helpUrls;
        }

        public GetManagedRuleResponseBodyManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetManagedRuleResponseBodyManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetManagedRuleResponseBodyManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public GetManagedRuleResponseBodyManagedRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetManagedRuleResponseBodyManagedRule setScope(GetManagedRuleResponseBodyManagedRuleScope scope) {
            this.scope = scope;
            return this;
        }
        public GetManagedRuleResponseBodyManagedRuleScope getScope() {
            return this.scope;
        }

        public GetManagedRuleResponseBodyManagedRule setSourceDetails(java.util.List<GetManagedRuleResponseBodyManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<GetManagedRuleResponseBodyManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

}
