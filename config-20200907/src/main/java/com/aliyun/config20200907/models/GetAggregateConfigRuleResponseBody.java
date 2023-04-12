// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("ConfigRule")
    public GetAggregateConfigRuleResponseBodyConfigRule configRule;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The statistics on the compliance evaluation results by compliance type. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of evaluated resources.</p>
         */
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
        /**
         * <p>The timestamp when the rule was first triggered.</p>
         */
        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        /**
         * <p>Indicates whether resources were evaluated based on the rule. Valid values:</p>
         * <br>
         * <p>*   true: Resources were evaluated based on the rule.</p>
         * <p>*   false: Resources were not evaluated based on the rule.</p>
         */
        @NameInMap("FirstEvaluationStarted")
        public Boolean firstEvaluationStarted;

        /**
         * <p>The error code returned for the last failed compliance evaluation.</p>
         */
        @NameInMap("LastErrorCode")
        public String lastErrorCode;

        /**
         * <p>The error message returned for the last failed compliance evaluation.</p>
         */
        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        /**
         * <p>The timestamp when the last failed compliance evaluation of the rule ended. Unit: milliseconds.</p>
         */
        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        /**
         * <p>The timestamp when the last failed compliance evaluation of the rule started. Unit: milliseconds.</p>
         */
        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        /**
         * <p>The timestamp when the last successful compliance evaluation of the rule ended. Unit: milliseconds.</p>
         */
        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        /**
         * <p>The timestamp when the last successful compliance evaluation of the rule started. Unit: milliseconds.</p>
         */
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
        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The name of the account group.</p>
         */
        @NameInMap("AggregatorName")
        public String aggregatorName;

        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the account that was used to create the rule.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the account that was used to create the rule.</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The type of the entity to which the rule belongs. The value is fixed to `AGGREGATOR`, which indicates an account group.</p>
         */
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
        /**
         * <p>The event source of the managed rule.</p>
         * <br>
         * <p>>  Only events related to Cloud Config are supported. The value is fixed to aliyun.config.</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The intervals at which the managed rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour.</p>
         * <p>*   Three_Hours: 3 hours.</p>
         * <p>*   Six_Hours: 6 hours.</p>
         * <p>*   Twelve_Hours: 12 hours</p>
         * <p>*   TwentyFour_Hours: 24 hours</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The managed rule is periodically triggered.</p>
         */
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
        /**
         * <p>The required input parameters of the managed rule.</p>
         */
        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        /**
         * <p>The description of the managed rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the managed rule.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The tags of the managed rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The name of the managed rule.</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>The optional input parameters of the managed rule.</p>
         */
        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        /**
         * <p>The details of the source of the managed rule.</p>
         */
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
        /**
         * <p>The event source of the managed rule.</p>
         * <br>
         * <p>>  Only events related to Cloud Config are supported. The value is fixed to aliyun.config.</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The intervals at which the managed rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour.</p>
         * <p>*   Three_Hours: 3 hours.</p>
         * <p>*   Six_Hours: 6 hours.</p>
         * <p>*   Twelve_Hours: 12 hours</p>
         * <p>*   TwentyFour_Hours: 24 hours</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The managed rule is periodically triggered.</p>
         */
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
        /**
         * <p>The identifier of the rule.</p>
         * <br>
         * <p>*   If the rule was created based on a managed rule, the value of this parameter is the name of the managed rule.</p>
         * <p>*   If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The way in which the rule was created. Valid values:</p>
         * <br>
         * <p>*   CUSTOM_FC: The rule is a custom rule.</p>
         * <p>*   ALIYUN: The rule was created based on a managed rule of Alibaba Cloud.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The details of the source of the rule.</p>
         */
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
        /**
         * <p>The ID of the Alibaba Cloud account to which the rule belongs.</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The details of compliance evaluation results.</p>
         */
        @NameInMap("Compliance")
        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance compliance;

        /**
         * <p>The ARN of the managed rule.</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The information about compliance evaluations performed by the rule.</p>
         */
        @NameInMap("ConfigRuleEvaluationStatus")
        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the monitoring rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   ACTIVE: The rule is being used to monitor resource configurations.</p>
         * <p>*   DELETING: The rule is being deleted.</p>
         * <p>*   EVALUATING: The rule is triggered and is being used to monitor resource configurations.</p>
         * <p>*   INACTIVE: The rule is disabled and is no longer used to monitor resource configurations.</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The managed rule is periodically triggered.</p>
         */
        @NameInMap("ConfigRuleTriggerTypes")
        public String configRuleTriggerTypes;

        /**
         * <p>The information about the creation of the rule.</p>
         */
        @NameInMap("CreateBy")
        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy createBy;

        /**
         * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the managed rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule.</p>
         * <br>
         * <p>>  This parameter applies only to a managed rule.</p>
         */
        @NameInMap("ExcludeAccountIdsScope")
        public String excludeAccountIdsScope;

        /**
         * <p>The ID of the resource directory to which the rule does not apply, which means that the resources within member accounts in the resource directory are not evaluated based on the rule.</p>
         * <br>
         * <p>> </p>
         * <p>*   This parameter applies only to a rule of a global account group.</p>
         * <p>*   This parameter applies only to a managed rule.</p>
         */
        @NameInMap("ExcludeFolderIdsScope")
        public String excludeFolderIdsScope;

        /**
         * <p>The ID of the resource excluded from the compliance evaluations performed by the rule.</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The ID of the resource directory to which the rule applies, which means that the resources within member accounts in the resource directory are evaluated based on the rule.</p>
         * <br>
         * <p>> </p>
         * <p>*   This parameter applies only to rules of a global account group.</p>
         * <p>*   This parameter applies only to managed rules.</p>
         */
        @NameInMap("FolderIdsScope")
        public String folderIdsScope;

        /**
         * <p>The input parameters of the rule.</p>
         */
        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        /**
         * <p>The details of the managed rule.</p>
         */
        @NameInMap("ManagedRule")
        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        /**
         * <p>The intervals at which the managed rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour.</p>
         * <p>*   Three_Hours: 3 hours.</p>
         * <p>*   Six_Hours: 6 hours.</p>
         * <p>*   Twelve_Hours: 12 hours</p>
         * <p>*   TwentyFour_Hours: 24 hours</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The timestamp when the rule was last updated. Unit: milliseconds.</p>
         */
        @NameInMap("ModifiedTimestamp")
        public Long modifiedTimestamp;

        /**
         * <p>The ID of the region to which the rule applies.</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The ID of the resource group to which the rule applies.</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The type of the resource evaluated by the rule.</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
         * <br>
         * <p>*   1: high risk level</p>
         * <p>*   2: medium risk level</p>
         * <p>*   3: low risk level</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The information about how the rule was created.</p>
         */
        @NameInMap("Source")
        public GetAggregateConfigRuleResponseBodyConfigRuleSource source;

        /**
         * <p>The logical relationship among the tag keys if you specify multiple tag keys by using the `TagKeyScope` parameter. For example, if the `TagKeyScope` parameter is set to `ECS,OSS` and the TagKeyLogicScope parameter is set to `AND`, the rule applies to resources with both the `ECS` and `OSS` tag keys. Valid values:</p>
         * <br>
         * <p>*   AND: the logical relationship of AND</p>
         * <p>*   OR: the logical relationship of OR</p>
         */
        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        /**
         * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
         */
        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        /**
         * <p>The tag value used to filter resources. The rule applies only to the resources with the specified tag value.</p>
         */
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
