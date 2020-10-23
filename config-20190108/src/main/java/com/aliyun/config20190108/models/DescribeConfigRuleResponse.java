// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ConfigRule")
    @Validation(required = true)
    public DescribeConfigRuleResponseConfigRule configRule;

    public static DescribeConfigRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigRuleResponse self = new DescribeConfigRuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigRuleResponse setConfigRule(DescribeConfigRuleResponseConfigRule configRule) {
        this.configRule = configRule;
        return this;
    }
    public DescribeConfigRuleResponseConfigRule getConfigRule() {
        return this.configRule;
    }

    public static class DescribeConfigRuleResponseConfigRuleCreateBy extends TeaModel {
        @NameInMap("CreatorType")
        @Validation(required = true)
        public String creatorType;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("CreatorName")
        @Validation(required = true)
        public String creatorName;

        @NameInMap("ConfigRuleSceneId")
        @Validation(required = true)
        public String configRuleSceneId;

        @NameInMap("ConfigRuleSceneName")
        @Validation(required = true)
        public String configRuleSceneName;

        public static DescribeConfigRuleResponseConfigRuleCreateBy build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleCreateBy self = new DescribeConfigRuleResponseConfigRuleCreateBy();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleCreateBy setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public DescribeConfigRuleResponseConfigRuleCreateBy setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public DescribeConfigRuleResponseConfigRuleCreateBy setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public DescribeConfigRuleResponseConfigRuleCreateBy setConfigRuleSceneId(String configRuleSceneId) {
            this.configRuleSceneId = configRuleSceneId;
            return this;
        }
        public String getConfigRuleSceneId() {
            return this.configRuleSceneId;
        }

        public DescribeConfigRuleResponseConfigRuleCreateBy setConfigRuleSceneName(String configRuleSceneName) {
            this.configRuleSceneName = configRuleSceneName;
            return this;
        }
        public String getConfigRuleSceneName() {
            return this.configRuleSceneName;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus extends TeaModel {
        @NameInMap("FirstActivatedTimestamp")
        @Validation(required = true)
        public Long firstActivatedTimestamp;

        @NameInMap("FirstEvaluationStarted")
        @Validation(required = true)
        public Boolean firstEvaluationStarted;

        @NameInMap("LastErrorCode")
        @Validation(required = true)
        public String lastErrorCode;

        @NameInMap("LastErrorMessage")
        @Validation(required = true)
        public String lastErrorMessage;

        @NameInMap("LastFailedEvaluationTimestamp")
        @Validation(required = true)
        public Long lastFailedEvaluationTimestamp;

        @NameInMap("LastFailedInvocationTimestamp")
        @Validation(required = true)
        public Long lastFailedInvocationTimestamp;

        @NameInMap("LastSuccessfulEvaluationTimestamp")
        @Validation(required = true)
        public Long lastSuccessfulEvaluationTimestamp;

        @NameInMap("LastSuccessfulInvocationTimestamp")
        @Validation(required = true)
        public Long lastSuccessfulInvocationTimestamp;

        public static DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus self = new DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setFirstActivatedTimestamp(Long firstActivatedTimestamp) {
            this.firstActivatedTimestamp = firstActivatedTimestamp;
            return this;
        }
        public Long getFirstActivatedTimestamp() {
            return this.firstActivatedTimestamp;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
            this.firstEvaluationStarted = firstEvaluationStarted;
            return this;
        }
        public Boolean getFirstEvaluationStarted() {
            return this.firstEvaluationStarted;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setLastErrorCode(String lastErrorCode) {
            this.lastErrorCode = lastErrorCode;
            return this;
        }
        public String getLastErrorCode() {
            return this.lastErrorCode;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setLastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
            this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
            return this;
        }
        public Long getLastFailedEvaluationTimestamp() {
            return this.lastFailedEvaluationTimestamp;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setLastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
            this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
            return this;
        }
        public Long getLastFailedInvocationTimestamp() {
            return this.lastFailedInvocationTimestamp;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
            this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
            return this;
        }
        public Long getLastSuccessfulEvaluationTimestamp() {
            return this.lastSuccessfulEvaluationTimestamp;
        }

        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
            this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
            return this;
        }
        public Long getLastSuccessfulInvocationTimestamp() {
            return this.lastSuccessfulInvocationTimestamp;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        @Validation(required = true)
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        @Validation(required = true)
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        @Validation(required = true)
        public String messageType;

        public static DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails self = new DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleManagedRule extends TeaModel {
        @NameInMap("ManagedRuleName")
        @Validation(required = true)
        public String managedRuleName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("CompulsoryInputParameterDetails")
        @Validation(required = true)
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        @NameInMap("OptionalInputParameterDetails")
        @Validation(required = true)
        public java.util.Map<String, ?> optionalInputParameterDetails;

        @NameInMap("HelpUrl")
        @Validation(required = true)
        public String helpUrl;

        @NameInMap("SourceDetails")
        @Validation(required = true)
        public java.util.List<DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails> sourceDetails;

        @NameInMap("Labels")
        @Validation(required = true)
        public java.util.List<String> labels;

        public static DescribeConfigRuleResponseConfigRuleManagedRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleManagedRule self = new DescribeConfigRuleResponseConfigRuleManagedRule();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setHelpUrl(String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }
        public String getHelpUrl() {
            return this.helpUrl;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setSourceDetails(java.util.List<DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseConfigRuleManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

        public DescribeConfigRuleResponseConfigRuleManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleSourceSourceConditions extends TeaModel {
        @NameInMap("DesiredValue")
        @Validation(required = true)
        public String desiredValue;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Required")
        @Validation(required = true)
        public Boolean required;

        @NameInMap("SelectPath")
        @Validation(required = true)
        public String selectPath;

        @NameInMap("Tips")
        @Validation(required = true)
        public String tips;

        public static DescribeConfigRuleResponseConfigRuleSourceSourceConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleSourceSourceConditions self = new DescribeConfigRuleResponseConfigRuleSourceSourceConditions();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceConditions setDesiredValue(String desiredValue) {
            this.desiredValue = desiredValue;
            return this;
        }
        public String getDesiredValue() {
            return this.desiredValue;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceConditions setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceConditions setSelectPath(String selectPath) {
            this.selectPath = selectPath;
            return this;
        }
        public String getSelectPath() {
            return this.selectPath;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceConditions setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleSourceSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        @Validation(required = true)
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        @Validation(required = true)
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        @Validation(required = true)
        public String messageType;

        public static DescribeConfigRuleResponseConfigRuleSourceSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleSourceSourceDetails self = new DescribeConfigRuleResponseConfigRuleSourceSourceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public DescribeConfigRuleResponseConfigRuleSourceSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleSource extends TeaModel {
        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("SourceConditions")
        @Validation(required = true)
        public java.util.List<DescribeConfigRuleResponseConfigRuleSourceSourceConditions> sourceConditions;

        @NameInMap("SourceDetails")
        @Validation(required = true)
        public java.util.List<DescribeConfigRuleResponseConfigRuleSourceSourceDetails> sourceDetails;

        public static DescribeConfigRuleResponseConfigRuleSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleSource self = new DescribeConfigRuleResponseConfigRuleSource();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleSource setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeConfigRuleResponseConfigRuleSource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeConfigRuleResponseConfigRuleSource setSourceConditions(java.util.List<DescribeConfigRuleResponseConfigRuleSourceSourceConditions> sourceConditions) {
            this.sourceConditions = sourceConditions;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseConfigRuleSourceSourceConditions> getSourceConditions() {
            return this.sourceConditions;
        }

        public DescribeConfigRuleResponseConfigRuleSource setSourceDetails(java.util.List<DescribeConfigRuleResponseConfigRuleSourceSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseConfigRuleSourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class DescribeConfigRuleResponseConfigRuleScope extends TeaModel {
        @NameInMap("ComplianceResourceId")
        @Validation(required = true)
        public String complianceResourceId;

        @NameInMap("ComplianceResourceTypes")
        @Validation(required = true)
        public java.util.List<String> complianceResourceTypes;

        public static DescribeConfigRuleResponseConfigRuleScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRuleScope self = new DescribeConfigRuleResponseConfigRuleScope();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRuleScope setComplianceResourceId(String complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }
        public String getComplianceResourceId() {
            return this.complianceResourceId;
        }

        public DescribeConfigRuleResponseConfigRuleScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

    }

    public static class DescribeConfigRuleResponseConfigRule extends TeaModel {
        @NameInMap("ConfigRuleArn")
        @Validation(required = true)
        public String configRuleArn;

        @NameInMap("ConfigRuleId")
        @Validation(required = true)
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        @Validation(required = true)
        public String configRuleName;

        @NameInMap("ConfigRuleState")
        @Validation(required = true)
        public String configRuleState;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("InputParameters")
        @Validation(required = true)
        public java.util.Map<String, ?> inputParameters;

        @NameInMap("ModifiedTimestamp")
        @Validation(required = true)
        public Long modifiedTimestamp;

        @NameInMap("RiskLevel")
        @Validation(required = true)
        public Integer riskLevel;

        @NameInMap("MaximumExecutionFrequency")
        @Validation(required = true)
        public String maximumExecutionFrequency;

        @NameInMap("CreateBy")
        @Validation(required = true)
        public DescribeConfigRuleResponseConfigRuleCreateBy createBy;

        @NameInMap("ConfigRuleEvaluationStatus")
        @Validation(required = true)
        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        @NameInMap("ManagedRule")
        @Validation(required = true)
        public DescribeConfigRuleResponseConfigRuleManagedRule managedRule;

        @NameInMap("Source")
        @Validation(required = true)
        public DescribeConfigRuleResponseConfigRuleSource source;

        @NameInMap("Scope")
        @Validation(required = true)
        public DescribeConfigRuleResponseConfigRuleScope scope;

        public static DescribeConfigRuleResponseConfigRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseConfigRule self = new DescribeConfigRuleResponseConfigRule();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseConfigRule setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public DescribeConfigRuleResponseConfigRule setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DescribeConfigRuleResponseConfigRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public DescribeConfigRuleResponseConfigRule setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public DescribeConfigRuleResponseConfigRule setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeConfigRuleResponseConfigRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigRuleResponseConfigRule setInputParameters(java.util.Map<String, ?> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.Map<String, ?> getInputParameters() {
            return this.inputParameters;
        }

        public DescribeConfigRuleResponseConfigRule setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public DescribeConfigRuleResponseConfigRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeConfigRuleResponseConfigRule setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public DescribeConfigRuleResponseConfigRule setCreateBy(DescribeConfigRuleResponseConfigRuleCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public DescribeConfigRuleResponseConfigRuleCreateBy getCreateBy() {
            return this.createBy;
        }

        public DescribeConfigRuleResponseConfigRule setConfigRuleEvaluationStatus(DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus) {
            this.configRuleEvaluationStatus = configRuleEvaluationStatus;
            return this;
        }
        public DescribeConfigRuleResponseConfigRuleConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
            return this.configRuleEvaluationStatus;
        }

        public DescribeConfigRuleResponseConfigRule setManagedRule(DescribeConfigRuleResponseConfigRuleManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }
        public DescribeConfigRuleResponseConfigRuleManagedRule getManagedRule() {
            return this.managedRule;
        }

        public DescribeConfigRuleResponseConfigRule setSource(DescribeConfigRuleResponseConfigRuleSource source) {
            this.source = source;
            return this;
        }
        public DescribeConfigRuleResponseConfigRuleSource getSource() {
            return this.source;
        }

        public DescribeConfigRuleResponseConfigRule setScope(DescribeConfigRuleResponseConfigRuleScope scope) {
            this.scope = scope;
            return this;
        }
        public DescribeConfigRuleResponseConfigRuleScope getScope() {
            return this.scope;
        }

    }

}
