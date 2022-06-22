// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleResponseBody extends TeaModel {
    @NameInMap("ConfigRule")
    public GetAggregateConfigRuleResponseBodyConfigRule configRule;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleResponseBody self = new GetAggregateConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleResponseBody setConfigRule(GetAggregateConfigRuleResponseBodyConfigRule configRule) {
        this.configRule = configRule;
        return this;
    }
    public GetAggregateConfigRuleResponseBodyConfigRule getConfigRule() {
        return this.configRule;
    }

    public GetAggregateConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleCompliance extends TeaModel {
        @NameInMap("ComplianceType")
        public String complianceType;

        @NameInMap("Count")
        public Integer count;

        public static GetAggregateConfigRuleResponseBodyConfigRuleCompliance build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleCompliance self = new GetAggregateConfigRuleResponseBodyConfigRuleCompliance();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus extends TeaModel {
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

        public static GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus self = new GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setFirstActivatedTimestamp(Long firstActivatedTimestamp) {
            this.firstActivatedTimestamp = firstActivatedTimestamp;
            return this;
        }
        public Long getFirstActivatedTimestamp() {
            return this.firstActivatedTimestamp;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setFirstEvaluationStarted(Boolean firstEvaluationStarted) {
            this.firstEvaluationStarted = firstEvaluationStarted;
            return this;
        }
        public Boolean getFirstEvaluationStarted() {
            return this.firstEvaluationStarted;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorCode(String lastErrorCode) {
            this.lastErrorCode = lastErrorCode;
            return this;
        }
        public String getLastErrorCode() {
            return this.lastErrorCode;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastFailedEvaluationTimestamp(Long lastFailedEvaluationTimestamp) {
            this.lastFailedEvaluationTimestamp = lastFailedEvaluationTimestamp;
            return this;
        }
        public Long getLastFailedEvaluationTimestamp() {
            return this.lastFailedEvaluationTimestamp;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastFailedInvocationTimestamp(Long lastFailedInvocationTimestamp) {
            this.lastFailedInvocationTimestamp = lastFailedInvocationTimestamp;
            return this;
        }
        public Long getLastFailedInvocationTimestamp() {
            return this.lastFailedInvocationTimestamp;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
            this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
            return this;
        }
        public Long getLastSuccessfulEvaluationTimestamp() {
            return this.lastSuccessfulEvaluationTimestamp;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
            this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
            return this;
        }
        public Long getLastSuccessfulInvocationTimestamp() {
            return this.lastSuccessfulInvocationTimestamp;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleCreateBy extends TeaModel {
        @NameInMap("AggregatorId")
        public String aggregatorId;

        @NameInMap("AggregatorName")
        public String aggregatorName;

        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("CompliancePackName")
        public String compliancePackName;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("CreatorType")
        public String creatorType;

        public static GetAggregateConfigRuleResponseBodyConfigRuleCreateBy build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleCreateBy self = new GetAggregateConfigRuleResponseBodyConfigRuleCreateBy();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setAggregatorName(String aggregatorName) {
            this.aggregatorName = aggregatorName;
            return this;
        }
        public String getAggregatorName() {
            return this.aggregatorName;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        public String messageType;

        public static GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails self = new GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleManagedRule extends TeaModel {
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
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails;

        public static GetAggregateConfigRuleResponseBodyConfigRuleManagedRule build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleManagedRule self = new GetAggregateConfigRuleResponseBodyConfigRuleManagedRule();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule setSourceDetails(java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails extends TeaModel {
        @NameInMap("EventSource")
        public String eventSource;

        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        @NameInMap("MessageType")
        public String messageType;

        public static GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails self = new GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails setEventSource(String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public String getEventSource() {
            return this.eventSource;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleSource extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SourceDetails")
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails;

        public static GetAggregateConfigRuleResponseBodyConfigRuleSource build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleSource self = new GetAggregateConfigRuleResponseBodyConfigRuleSource();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleSource setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleSource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleSource setSourceDetails(java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleSourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRule extends TeaModel {
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("Compliance")
        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance compliance;

        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        @NameInMap("ConfigRuleEvaluationStatus")
        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        @NameInMap("ConfigRuleState")
        public String configRuleState;

        @NameInMap("ConfigRuleTriggerTypes")
        public String configRuleTriggerTypes;

        @NameInMap("CreateBy")
        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy createBy;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExcludeAccountIdsScope")
        public String excludeAccountIdsScope;

        @NameInMap("ExcludeFolderIdsScope")
        public String excludeFolderIdsScope;

        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        @NameInMap("FolderIdsScope")
        public String folderIdsScope;

        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        @NameInMap("ManagedRule")
        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule managedRule;

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
        public GetAggregateConfigRuleResponseBodyConfigRuleSource source;

        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        @NameInMap("TagValueScope")
        public String tagValueScope;

        public static GetAggregateConfigRuleResponseBodyConfigRule build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRule self = new GetAggregateConfigRuleResponseBodyConfigRule();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setCompliance(GetAggregateConfigRuleResponseBodyConfigRuleCompliance compliance) {
            this.compliance = compliance;
            return this;
        }
        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance getCompliance() {
            return this.compliance;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setConfigRuleEvaluationStatus(GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus) {
            this.configRuleEvaluationStatus = configRuleEvaluationStatus;
            return this;
        }
        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus getConfigRuleEvaluationStatus() {
            return this.configRuleEvaluationStatus;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
            this.configRuleTriggerTypes = configRuleTriggerTypes;
            return this;
        }
        public String getConfigRuleTriggerTypes() {
            return this.configRuleTriggerTypes;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setCreateBy(GetAggregateConfigRuleResponseBodyConfigRuleCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy getCreateBy() {
            return this.createBy;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeAccountIdsScope(String excludeAccountIdsScope) {
            this.excludeAccountIdsScope = excludeAccountIdsScope;
            return this;
        }
        public String getExcludeAccountIdsScope() {
            return this.excludeAccountIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeFolderIdsScope(String excludeFolderIdsScope) {
            this.excludeFolderIdsScope = excludeFolderIdsScope;
            return this;
        }
        public String getExcludeFolderIdsScope() {
            return this.excludeFolderIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setFolderIdsScope(String folderIdsScope) {
            this.folderIdsScope = folderIdsScope;
            return this;
        }
        public String getFolderIdsScope() {
            return this.folderIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setInputParameters(java.util.Map<String, ?> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.Map<String, ?> getInputParameters() {
            return this.inputParameters;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setManagedRule(GetAggregateConfigRuleResponseBodyConfigRuleManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }
        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule getManagedRule() {
            return this.managedRule;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setRegionIdsScope(String regionIdsScope) {
            this.regionIdsScope = regionIdsScope;
            return this;
        }
        public String getRegionIdsScope() {
            return this.regionIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setResourceGroupIdsScope(String resourceGroupIdsScope) {
            this.resourceGroupIdsScope = resourceGroupIdsScope;
            return this;
        }
        public String getResourceGroupIdsScope() {
            return this.resourceGroupIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setSource(GetAggregateConfigRuleResponseBodyConfigRuleSource source) {
            this.source = source;
            return this;
        }
        public GetAggregateConfigRuleResponseBodyConfigRuleSource getSource() {
            return this.source;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setTagKeyLogicScope(String tagKeyLogicScope) {
            this.tagKeyLogicScope = tagKeyLogicScope;
            return this;
        }
        public String getTagKeyLogicScope() {
            return this.tagKeyLogicScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setTagKeyScope(String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setTagValueScope(String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public String getTagValueScope() {
            return this.tagValueScope;
        }

    }

}
