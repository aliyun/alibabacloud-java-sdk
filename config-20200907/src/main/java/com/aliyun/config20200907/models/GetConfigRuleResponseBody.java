// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleResponseBody extends TeaModel {
    @NameInMap("ConfigRule")
    public GetConfigRuleResponseBodyConfigRule configRule;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleResponseBody self = new GetConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleResponseBody setConfigRule(GetConfigRuleResponseBodyConfigRule configRule) {
        this.configRule = configRule;
        return this;
    }
    public GetConfigRuleResponseBodyConfigRule getConfigRule() {
        return this.configRule;
    }

    public GetConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus extends TeaModel {
        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        @NameInMap("FirstEvaluationStarted")
        public Boolean firstEvaluationStarted;

        @NameInMap("LastErrorCode")
        public String lastErrorCode;

        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        @NameInMap("LastSuccessfulInvocationTimestamp")
        public Long lastSuccessfulInvocationTimestamp;

        public static GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus self = new GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setFirstActivatedTimestamp(Long firstActivatedTimestamp) {
            this.firstActivatedTimestamp = firstActivatedTimestamp;
            return this;
        }
        public Long getFirstActivatedTimestamp() {
            return this.firstActivatedTimestamp;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
            this.firstEvaluationStarted = firstEvaluationStarted;
            return this;
        }
        public Boolean getFirstEvaluationStarted() {
            return this.firstEvaluationStarted;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorCode(String lastErrorCode) {
            this.lastErrorCode = lastErrorCode;
            return this;
        }
        public String getLastErrorCode() {
            return this.lastErrorCode;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
            this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
            return this;
        }
        public Long getLastFailedEvaluationTimestamp() {
            return this.lastFailedEvaluationTimestamp;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
            this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
            return this;
        }
        public Long getLastFailedInvocationTimestamp() {
            return this.lastFailedInvocationTimestamp;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
            this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
            return this;
        }
        public Long getLastSuccessfulEvaluationTimestamp() {
            return this.lastSuccessfulEvaluationTimestamp;
        }

        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
            this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
            return this;
        }
        public Long getLastSuccessfulInvocationTimestamp() {
            return this.lastSuccessfulInvocationTimestamp;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleCreateBy extends TeaModel {
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("CompliancePackName")
        public String compliancePackName;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        public static GetConfigRuleResponseBodyConfigRuleCreateBy build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleCreateBy self = new GetConfigRuleResponseBodyConfigRuleCreateBy();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleCreateBy setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetConfigRuleResponseBodyConfigRuleCreateBy setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public GetConfigRuleResponseBodyConfigRuleCreateBy setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetConfigRuleResponseBodyConfigRuleCreateBy setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        public String messageType;

        public static GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails self = new GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleManagedRule extends TeaModel {
        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        @NameInMap("Description")
        public String description;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        @NameInMap("SourceDetails")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails;

        public static GetConfigRuleResponseBodyConfigRuleManagedRule build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleManagedRule self = new GetConfigRuleResponseBodyConfigRuleManagedRule();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public GetConfigRuleResponseBodyConfigRuleManagedRule setSourceDetails(java.util.List<GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleSourceSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        public String messageType;

        public static GetConfigRuleResponseBodyConfigRuleSourceSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleSourceSourceDetails self = new GetConfigRuleResponseBodyConfigRuleSourceSourceDetails();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleSourceSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public GetConfigRuleResponseBodyConfigRuleSourceSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetConfigRuleResponseBodyConfigRuleSourceSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleSource extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SourceDetails")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails;

        public static GetConfigRuleResponseBodyConfigRuleSource build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleSource self = new GetConfigRuleResponseBodyConfigRuleSource();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleSource setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetConfigRuleResponseBodyConfigRuleSource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetConfigRuleResponseBodyConfigRuleSource setSourceDetails(java.util.List<GetConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<GetConfigRuleResponseBodyConfigRuleSourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRule extends TeaModel {
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        @NameInMap("ConfigRuleEvaluationStatus")
        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleState")
        public String configRuleState;

        @NameInMap("ConfigRuleTriggerTypes")
        public String configRuleTriggerTypes;

        @NameInMap("CreateBy")
        public GetConfigRuleResponseBodyConfigRuleCreateBy createBy;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        @NameInMap("ManagedRule")
        public GetConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("ModifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        @NameInMap("Source")
        public GetConfigRuleResponseBodyConfigRuleSource source;

        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        @NameInMap("TagValueScope")
        public String tagValueScope;

        public static GetConfigRuleResponseBodyConfigRule build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRule self = new GetConfigRuleResponseBodyConfigRule();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRule setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public GetConfigRuleResponseBodyConfigRule setConfigRuleEvaluationStatus(GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus) {
            this.configRuleEvaluationStatus = configRuleEvaluationStatus;
            return this;
        }
        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
            return this.configRuleEvaluationStatus;
        }

        public GetConfigRuleResponseBodyConfigRule setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetConfigRuleResponseBodyConfigRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetConfigRuleResponseBodyConfigRule setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public GetConfigRuleResponseBodyConfigRule setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
            this.configRuleTriggerTypes = configRuleTriggerTypes;
            return this;
        }
        public String getConfigRuleTriggerTypes() {
            return this.configRuleTriggerTypes;
        }

        public GetConfigRuleResponseBodyConfigRule setCreateBy(GetConfigRuleResponseBodyConfigRuleCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public GetConfigRuleResponseBodyConfigRuleCreateBy getCreateBy() {
            return this.createBy;
        }

        public GetConfigRuleResponseBodyConfigRule setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetConfigRuleResponseBodyConfigRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConfigRuleResponseBodyConfigRule setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setInputParameters(java.util.Map<String, ?> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.Map<String, ?> getInputParameters() {
            return this.inputParameters;
        }

        public GetConfigRuleResponseBodyConfigRule setManagedRule(GetConfigRuleResponseBodyConfigRuleManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }
        public GetConfigRuleResponseBodyConfigRuleManagedRule getManagedRule() {
            return this.managedRule;
        }

        public GetConfigRuleResponseBodyConfigRule setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetConfigRuleResponseBodyConfigRule setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public GetConfigRuleResponseBodyConfigRule setRegionIdsScope(String regionIdsScope) {
            this.regionIdsScope = regionIdsScope;
            return this;
        }
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setResourceGroupIdsScope(String resourceGroupIdsScope) {
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public GetConfigRuleResponseBodyConfigRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetConfigRuleResponseBodyConfigRule setSource(GetConfigRuleResponseBodyConfigRuleSource source) {
            this.source = source;
            return this;
        }
        public GetConfigRuleResponseBodyConfigRuleSource getSource() {
            return this.source;
        }

        public GetConfigRuleResponseBodyConfigRule setTagKeyLogicScope(String tagKeyLogicScope) {
            this.tagKeyLogicScope = tagKeyLogicScope;
            return this;
        }
        public String getTagKeyLogicScope() {
            return this.tagKeyLogicScope;
        }

        public GetConfigRuleResponseBodyConfigRule setTagKeyScope(String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        public GetConfigRuleResponseBodyConfigRule setTagValueScope(String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public String getTagValueScope() {
            return this.tagValueScope;
        }

    }

}
