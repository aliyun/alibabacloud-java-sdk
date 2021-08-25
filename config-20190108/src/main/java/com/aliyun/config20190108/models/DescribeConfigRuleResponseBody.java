// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigRule")
    public DescribeConfigRuleResponseBodyConfigRule configRule;

    public static DescribeConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigRuleResponseBody self = new DescribeConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigRuleResponseBody setConfigRule(DescribeConfigRuleResponseBodyConfigRule configRule) {
        this.configRule = configRule;
        return this;
    }
    public DescribeConfigRuleResponseBodyConfigRule getConfigRule() {
        return this.configRule;
    }

    public static class DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails extends TeaModel {
        @NameInMap("MessageType")
        public String messageType;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        public static DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails self = new DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions extends TeaModel {
        @NameInMap("DesiredValue")
        public String desiredValue;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Name")
        public String name;

        public static DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions self = new DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setDesiredValue(String desiredValue) {
            this.desiredValue = desiredValue;
            return this;
        }
        public String getDesiredValue() {
            return this.desiredValue;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleSource extends TeaModel {
        @NameInMap("SourceDetails")
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SourceConditions")
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions> sourceConditions;

        @NameInMap("Identifier")
        public String identifier;

        public static DescribeConfigRuleResponseBodyConfigRuleSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleSource self = new DescribeConfigRuleResponseBodyConfigRuleSource();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleSource setSourceDetails(java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSource setSourceConditions(java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions> sourceConditions) {
            this.sourceConditions = sourceConditions;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions> getSourceConditions() {
            return this.sourceConditions;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSource setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails extends TeaModel {
        @NameInMap("MessageType")
        public String messageType;

        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        public static DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails self = new DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleManagedRule extends TeaModel {
        @NameInMap("SourceDetails")
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails;

        @NameInMap("Description")
        public String description;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        public static DescribeConfigRuleResponseBodyConfigRuleManagedRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleManagedRule self = new DescribeConfigRuleResponseBodyConfigRuleManagedRule();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setSourceDetails(java.util.List<DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleScope extends TeaModel {
        @NameInMap("ComplianceResourceTypes")
        public java.util.List<String> complianceResourceTypes;

        @NameInMap("ComplianceResourceId")
        public String complianceResourceId;

        public static DescribeConfigRuleResponseBodyConfigRuleScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleScope self = new DescribeConfigRuleResponseBodyConfigRuleScope();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

        public DescribeConfigRuleResponseBodyConfigRuleScope setComplianceResourceId(String complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }
        public String getComplianceResourceId() {
            return this.complianceResourceId;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus extends TeaModel {
        @NameInMap("LastErrorCode")
        public String lastErrorCode;

        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        @NameInMap("FirstEvaluationStarted")
        public Boolean firstEvaluationStarted;

        @NameInMap("LastSuccessfulInvocationTimestamp")
        public Long lastSuccessfulInvocationTimestamp;

        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        public static DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus self = new DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorCode(String lastErrorCode) {
            this.lastErrorCode = lastErrorCode;
            return this;
        }
        public String getLastErrorCode() {
            return this.lastErrorCode;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
            this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
            return this;
        }
        public Long getLastSuccessfulEvaluationTimestamp() {
            return this.lastSuccessfulEvaluationTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setFirstActivatedTimestamp(Long firstActivatedTimestamp) {
            this.firstActivatedTimestamp = firstActivatedTimestamp;
            return this;
        }
        public Long getFirstActivatedTimestamp() {
            return this.firstActivatedTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
            this.firstEvaluationStarted = firstEvaluationStarted;
            return this;
        }
        public Boolean getFirstEvaluationStarted() {
            return this.firstEvaluationStarted;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
            this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
            return this;
        }
        public Long getLastSuccessfulInvocationTimestamp() {
            return this.lastSuccessfulInvocationTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
            this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
            return this;
        }
        public Long getLastFailedEvaluationTimestamp() {
            return this.lastFailedEvaluationTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
            this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
            return this;
        }
        public Long getLastFailedInvocationTimestamp() {
            return this.lastFailedInvocationTimestamp;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRule extends TeaModel {
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        @NameInMap("Source")
        public DescribeConfigRuleResponseBodyConfigRuleSource source;

        @NameInMap("ConfigRuleState")
        public String configRuleState;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("ManagedRule")
        public DescribeConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        @NameInMap("Description")
        public String description;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("Scope")
        public DescribeConfigRuleResponseBodyConfigRuleScope scope;

        @NameInMap("ConfigRuleEvaluationStatus")
        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ModifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeConfigRuleResponseBodyConfigRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRule self = new DescribeConfigRuleResponseBodyConfigRule();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeConfigRuleResponseBodyConfigRule setInputParameters(java.util.Map<String, ?> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.Map<String, ?> getInputParameters() {
            return this.inputParameters;
        }

        public DescribeConfigRuleResponseBodyConfigRule setSource(DescribeConfigRuleResponseBodyConfigRuleSource source) {
            this.source = source;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleSource getSource() {
            return this.source;
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public DescribeConfigRuleResponseBodyConfigRule setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public DescribeConfigRuleResponseBodyConfigRule setManagedRule(DescribeConfigRuleResponseBodyConfigRuleManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleManagedRule getManagedRule() {
            return this.managedRule;
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public DescribeConfigRuleResponseBodyConfigRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public DescribeConfigRuleResponseBodyConfigRule setScope(DescribeConfigRuleResponseBodyConfigRuleScope scope) {
            this.scope = scope;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleScope getScope() {
            return this.scope;
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleEvaluationStatus(DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus) {
            this.configRuleEvaluationStatus = configRuleEvaluationStatus;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
            return this.configRuleEvaluationStatus;
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DescribeConfigRuleResponseBodyConfigRule setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRule setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
