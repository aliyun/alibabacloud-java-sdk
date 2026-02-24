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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>811234F4-C3AB-4D15-B90B-F55016D1B5AA</p>
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
         * <p>The compliance evaluation result. Valid values:</p>
         * <ul>
         * <li><p>COMPLIANT: The resource is compliant.</p>
         * </li>
         * <li><p>NON_COMPLIANT: The resource is not compliant.</p>
         * </li>
         * <li><p>NOT_APPLICABLE: The rule does not apply to the resource.</p>
         * </li>
         * <li><p>INSUFFICIENT_DATA: No data is available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NON_COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of resources that have the corresponding compliance evaluation result.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The timestamp when the rule was first activated.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932221993</p>
         */
        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        /**
         * <p>Indicates whether the rule has been evaluated. Valid values:</p>
         * <ul>
         * <li><p>true: The rule has been evaluated.</p>
         * </li>
         * <li><p>false: The rule has not been evaluated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FirstEvaluationStarted")
        public Boolean firstEvaluationStarted;

        /**
         * <p>The error code returned for the last failed execution of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TimeOut</p>
         */
        @NameInMap("LastErrorCode")
        public String lastErrorCode;

        /**
         * <p>The error message returned for the last failed execution of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>time out</p>
         */
        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        /**
         * <p>The timestamp of the last failed evaluation. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        /**
         * <p>The timestamp of the last failed invocation. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        /**
         * <p>The timestamp of the last successful evaluation. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227486</p>
         */
        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        /**
         * <p>The timestamp of the last successful invocation. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227476</p>
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
         * 
         * <strong>example:</strong>
         * <p>ca-04b3fd170e340007****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The name of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_Group</p>
         */
        @NameInMap("AggregatorName")
        public String aggregatorName;

        /**
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af008****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The name of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS合规基线</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the account that created the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the rule creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The type of the rule creator. Only <code>AGGREGATOR</code> (account group) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>AGGREGATOR</p>
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

    public static class GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-2</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope self = new GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails extends TeaModel {
        /**
         * <p>The event source.</p>
         * <blockquote>
         * <p>Only Cloud Config events are supported: aliyun.config.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The frequency at which the rule is executed.</p>
         * <ul>
         * <li><p>One_Hour: 1 hour.</p>
         * </li>
         * <li><p>Three_Hours: 3 hours.</p>
         * </li>
         * <li><p>Six_Hours: 6 hours.</p>
         * </li>
         * <li><p>Twelve_Hours: 12 hours.</p>
         * </li>
         * <li><p>TwentyFour_Hours: 24 hours.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>One_Hour</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <ul>
         * <li><p>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
         * </li>
         * <li><p>ScheduledNotification: The rule is triggered periodically.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigurationItemChangeNotification</p>
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
         * <p>The details of the required input parameters for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        /**
         * <p>The description of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS磁盘未因欠费或安全等原因而被锁定，视为“合规”。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The identifier of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-user-mfa-check</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>A list of labels for the managed rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The name of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM用户开启MFA</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>The details of the optional input parameters for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        /**
         * <p>The details of the managed rule source.</p>
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
         * <p>The event source.</p>
         * <blockquote>
         * <p>Only Cloud Config events are supported: aliyun.config.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The frequency at which the rule is executed. Valid values:</p>
         * <ul>
         * <li><p>One_Hour: 1 hour.</p>
         * </li>
         * <li><p>Three_Hours: 3 hours.</p>
         * </li>
         * <li><p>Six_Hours: 6 hours.</p>
         * </li>
         * <li><p>Twelve_Hours: 12 hours.</p>
         * </li>
         * <li><p>TwentyFour_Hours: 24 hours.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>One_Hour</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <ul>
         * <li><p>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
         * </li>
         * <li><p>ScheduledNotification: The rule is triggered periodically.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigurationItemChangeNotification</p>
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
         * <ul>
         * <li><p>If the rule is a managed rule, the value of this parameter is the identifier of the managed rule.</p>
         * </li>
         * <li><p>If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of the function.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/specific-config</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The owner of the rule. Valid values:</p>
         * <ul>
         * <li><p>CUSTOM_FC: a custom rule.</p>
         * </li>
         * <li><p>ALIYUN: a managed rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The details of the rule source.</p>
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

    public static class GetAggregateConfigRuleResponseBodyConfigRuleTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetAggregateConfigRuleResponseBodyConfigRuleTags build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleTags self = new GetAggregateConfigRuleResponseBodyConfigRuleTags();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRuleTagsScope extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetAggregateConfigRuleResponseBodyConfigRuleTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleResponseBodyConfigRuleTagsScope self = new GetAggregateConfigRuleResponseBodyConfigRuleTagsScope();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetAggregateConfigRuleResponseBodyConfigRuleTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetAggregateConfigRuleResponseBodyConfigRule extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The rule applies only to resources in the specified member accounts. Separate multiple member account IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountIdsScope")
        public String accountIdsScope;

        /**
         * <p>The compliance statistics of the rule.</p>
         */
        @NameInMap("Compliance")
        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance compliance;

        /**
         * <p>The ARN of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::100931896542****:rule/cr-7f7d626622af0041****</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The execution status of the rule.</p>
         */
        @NameInMap("ConfigRuleEvaluationStatus")
        public GetAggregateConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-7f7d626622af0041****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM用户开启MFA</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><p>ACTIVE: The rule is enabled.</p>
         * </li>
         * <li><p>DELETING: The rule is being deleted.</p>
         * </li>
         * <li><p>EVALUATING: The rule is being evaluated.</p>
         * </li>
         * <li><p>INACTIVE: The rule is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <ul>
         * <li><p>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
         * </li>
         * <li><p>ScheduledNotification: The rule is triggered periodically.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigurationItemChangeNotification</p>
         */
        @NameInMap("ConfigRuleTriggerTypes")
        public String configRuleTriggerTypes;

        /**
         * <p>The information about the creator of the rule.</p>
         */
        @NameInMap("CreateBy")
        public GetAggregateConfigRuleResponseBodyConfigRuleCreateBy createBy;

        /**
         * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1604684022000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM用户开启MFA，视为“合规”。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The rule does not apply to resources in the specified member accounts. The system does not evaluate resources in these accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("ExcludeAccountIdsScope")
        public String excludeAccountIdsScope;

        /**
         * <p>The rule does not apply to resources within the member accounts in the specified folders of the resource directory. The system does not evaluate resources in these folders.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-pWmkqZ****</p>
         */
        @NameInMap("ExcludeFolderIdsScope")
        public String excludeFolderIdsScope;

        /**
         * <p>The rule does not apply to resources in the specified regions. The system does not evaluate resources in these regions. Separate multiple region IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The rule does not apply to resources in the specified resource groups. The system does not evaluate resources in these resource groups. Separate multiple resource group IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The IDs of the resources that are not evaluated by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>23642660635687****</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The excluded scope of the tags.</p>
         */
        @NameInMap("ExcludeTagsScope")
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope> excludeTagsScope;

        /**
         * <p>The extended content. This parameter is used to configure the trigger time for a rule that is triggered on a 24-hour cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
         */
        @NameInMap("ExtendContent")
        public String extendContent;

        /**
         * <p>The rule applies only to resources within the member accounts in the specified folders of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-ZtHsRH****</p>
         */
        @NameInMap("FolderIdsScope")
        public String folderIdsScope;

        /**
         * <p>The input parameters of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tag1Key&quot;:&quot;ECS&quot;,&quot;tag1Value&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        /**
         * <p>The details of the managed rule.</p>
         */
        @NameInMap("ManagedRule")
        public GetAggregateConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        /**
         * <p>The frequency at which the rule is executed.</p>
         * <ul>
         * <li><p>One_Hour: 1 hour.</p>
         * </li>
         * <li><p>Three_Hours: 3 hours.</p>
         * </li>
         * <li><p>Six_Hours: 6 hours.</p>
         * </li>
         * <li><p>Twelve_Hours: 12 hours.</p>
         * </li>
         * <li><p>TwentyFour_Hours: 24 hours.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>One_Hour</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The timestamp when the rule was last updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("ModifiedTimestamp")
        public Long modifiedTimestamp;

        /**
         * <p>The rule applies only to resources in the specified regions.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The rule applies only to resources in the specified resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The rule applies only to the specified resources. Separate multiple resource IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The rule applies only to resources that have the specified names.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ResourceNameScope")
        public String resourceNameScope;

        /**
         * <p>The resource types that are evaluated by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><p>1: high</p>
         * </li>
         * <li><p>2: medium</p>
         * </li>
         * <li><p>3: low</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The source of the rule.</p>
         */
        @NameInMap("Source")
        public GetAggregateConfigRuleResponseBodyConfigRuleSource source;

        /**
         * <p>This parameter is not returned for rules that are created using the <code>TagsScope</code> parameter.</p>
         * <p>This parameter is returned only for rules that are created using the deprecated <code>TagKeyScope</code> parameter. For example, if <code>TagKeyScope</code> is set to <code>ECS,OSS</code> and this parameter is set to <code>AND</code>, the rule applies to resources that have both the <code>ECS</code> and <code>OSS</code> tags.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>AND</p>
         * </li>
         * <li><p>OR</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        /**
         * <p>This parameter is deprecated. Use the <code>TagsScope</code> parameter instead.</p>
         * <p>The rule applies only to resources that have the specified tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("TagKeyScope")
        @Deprecated
        public String tagKeyScope;

        /**
         * <p>This parameter is deprecated. Use the <code>TagsScope</code> parameter instead.</p>
         * <p>The rule applies only to resources that have the specified tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>MFA</p>
         */
        @NameInMap("TagValueScope")
        @Deprecated
        public String tagValueScope;

        /**
         * <p>The resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTags> tags;

        /**
         * <p>The scope of the tags.</p>
         */
        @NameInMap("TagsScope")
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTagsScope> tagsScope;

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

        public GetAggregateConfigRuleResponseBodyConfigRule setAccountIdsScope(String accountIdsScope) {
            this.accountIdsScope = accountIdsScope;
            return this;
        }
        public String getAccountIdsScope() {
            return this.accountIdsScope;
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

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeRegionIdsScope(String excludeRegionIdsScope) {
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExcludeTagsScope(java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope> excludeTagsScope) {
            this.excludeTagsScope = excludeTagsScope;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope> getExcludeTagsScope() {
            return this.excludeTagsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setExtendContent(String extendContent) {
            this.extendContent = extendContent;
            return this;
        }
        public String getExtendContent() {
            return this.extendContent;
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

        public GetAggregateConfigRuleResponseBodyConfigRule setResourceIdsScope(String resourceIdsScope) {
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setResourceNameScope(String resourceNameScope) {
            this.resourceNameScope = resourceNameScope;
            return this;
        }
        public String getResourceNameScope() {
            return this.resourceNameScope;
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

        @Deprecated
        public GetAggregateConfigRuleResponseBodyConfigRule setTagKeyScope(String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        @Deprecated
        public GetAggregateConfigRuleResponseBodyConfigRule setTagValueScope(String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public String getTagValueScope() {
            return this.tagValueScope;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setTags(java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTags> getTags() {
            return this.tags;
        }

        public GetAggregateConfigRuleResponseBodyConfigRule setTagsScope(java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTagsScope> tagsScope) {
            this.tagsScope = tagsScope;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTagsScope> getTagsScope() {
            return this.tagsScope;
        }

    }

}
