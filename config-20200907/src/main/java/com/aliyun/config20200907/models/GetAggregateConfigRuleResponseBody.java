// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The rules.</p>
     */
    @NameInMap("ConfigRule")
    public GetAggregateConfigRuleResponseBodyConfigRule configRule;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The statistics on the compliance evaluation results by compliance type. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resources are evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resources are evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to your resources.</li>
         * <li>INSUFFICIENT_DATA: No resource data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NON_COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of evaluated resources.</p>
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
         * <p>The timestamp when the rule was first triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932221993</p>
         */
        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        /**
         * <p>Indicates whether resources were evaluated based on the rule. Valid values:</p>
         * <ul>
         * <li>true: Resources were evaluated based on the rule.</li>
         * <li>false: Resources were not evaluated based on the rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FirstEvaluationStarted")
        public Boolean firstEvaluationStarted;

        /**
         * <p>The error code returned for the last failed compliance evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>TimeOut</p>
         */
        @NameInMap("LastErrorCode")
        public String lastErrorCode;

        /**
         * <p>The error message returned for the last failed compliance evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>time out</p>
         */
        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        /**
         * <p>The timestamp when the last failed compliance evaluation of the rule ended. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        /**
         * <p>The timestamp when the last failed compliance evaluation of the rule started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        /**
         * <p>The timestamp when the last successful compliance evaluation of the rule ended. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227486</p>
         */
        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        /**
         * <p>The timestamp when the last successful compliance evaluation of the rule started. Unit: milliseconds.</p>
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
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        /**
         * <p>The ID of the account that was used to create the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the account that was used to create the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The type of the entity to which the rule belongs. The value is fixed to <code>AGGREGATOR</code>, which indicates an account group.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key-2</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
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
         * <p>The event source of the managed rule.</p>
         * <blockquote>
         * <p> Only events related to Cloud Config are supported. The value is fixed to aliyun.config.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The intervals at which the managed rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour: 1 hour.</li>
         * <li>Three_Hours: 3 hours.</li>
         * <li>Six_Hours: 6 hours.</li>
         * <li>Twelve_Hours: 12 hours</li>
         * <li>TwentyFour_Hours: 24 hours</li>
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
         * <li>ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</li>
         * <li>ScheduledNotification: The managed rule is periodically triggered.</li>
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
         * <p>The required input parameters of the managed rule.</p>
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
         * <p>The description of the managed rule.</p>
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
         * <p>The tags of the managed rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The name of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-user-mfa-check</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>The optional input parameters of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
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
         * <blockquote>
         * <p> Only events related to Cloud Config are supported. The value is fixed to aliyun.config.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The intervals at which the managed rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour: 1 hour.</li>
         * <li>Three_Hours: 3 hours.</li>
         * <li>Six_Hours: 6 hours.</li>
         * <li>Twelve_Hours: 12 hours</li>
         * <li>TwentyFour_Hours: 24 hours</li>
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
         * <li>ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</li>
         * <li>ScheduledNotification: The managed rule is periodically triggered.</li>
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
         * <li>If the rule was created based on a managed rule, the value of this parameter is the name of the managed rule.</li>
         * <li>If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of the relevant function in Function Compute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/specific-config</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The way in which the rule was created. Valid values:</p>
         * <ul>
         * <li>CUSTOM_FC: The rule is a custom rule.</li>
         * <li>ALIYUN: The rule was created based on a managed rule of Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
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
         * <p>The IDs of the members to which the rule applies. Separate multiple member IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountIdsScope")
        public String accountIdsScope;

        /**
         * <p>The details of compliance evaluation results.</p>
         */
        @NameInMap("Compliance")
        public GetAggregateConfigRuleResponseBodyConfigRuleCompliance compliance;

        /**
         * <p>The ARN of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::100931896542****:rule/cr-7f7d626622af0041****</p>
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
         * 
         * <strong>example:</strong>
         * <p>cr-7f7d626622af0041****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the monitoring rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>ACTIVE: The rule is being used to monitor resource configurations.</li>
         * <li>DELETING: The rule is being deleted.</li>
         * <li>EVALUATING: The rule is triggered and is being used to monitor resource configurations.</li>
         * <li>INACTIVE: The rule is disabled and is no longer used to monitor resource configurations.</li>
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
         * <li>ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</li>
         * <li>ScheduledNotification: The managed rule is periodically triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigurationItemChangeNotification</p>
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
         * 
         * <strong>example:</strong>
         * <p>1604684022000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the managed rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule.</p>
         * <blockquote>
         * <p> This parameter applies only to a managed rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("ExcludeAccountIdsScope")
        public String excludeAccountIdsScope;

        /**
         * <p>The ID of the resource directory to which the rule does not apply, which means that the resources within member accounts in the resource directory are not evaluated based on the rule.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter applies only to a rule of a global account group.</li>
         * <li>This parameter applies only to a managed rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fd-pWmkqZ****</p>
         */
        @NameInMap("ExcludeFolderIdsScope")
        public String excludeFolderIdsScope;

        /**
         * <p>The IDs of the regions excluded from the compliance evaluations performed by the rule. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The IDs of the resource groups excluded from the compliance evaluations performed by the rule. Separate multiple resource group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The ID of the resource excluded from the compliance evaluations performed by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>23642660635687****</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The scope of the tag that is excluded.</p>
         */
        @NameInMap("ExcludeTagsScope")
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleExcludeTagsScope> excludeTagsScope;

        /**
         * <p>The extended content, which is temporarily only used to configure the trigger time with a 24-hour cycle trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
         */
        @NameInMap("ExtendContent")
        public String extendContent;

        /**
         * <p>The ID of the resource directory to which the rule applies, which means that the resources within member accounts in the resource directory are evaluated based on the rule.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter applies only to rules of a global account group.</li>
         * <li>This parameter applies only to managed rules.</li>
         * </ul>
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
         * <p>The intervals at which the managed rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour: 1 hour.</li>
         * <li>Three_Hours: 3 hours.</li>
         * <li>Six_Hours: 6 hours.</li>
         * <li>Twelve_Hours: 12 hours</li>
         * <li>TwentyFour_Hours: 24 hours</li>
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
         * <p>The ID of the region to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The ID of the resource group to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The IDs of the resources to which the rule applies. Separate multiple resource IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The type of the resource evaluated by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
         * <ul>
         * <li>1: high risk level</li>
         * <li>2: medium risk level</li>
         * <li>3: low risk level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The information about how the rule was created.</p>
         */
        @NameInMap("Source")
        public GetAggregateConfigRuleResponseBodyConfigRuleSource source;

        /**
         * <p>The logical relationship among the tag keys if you specify multiple tag keys by using the <code>TagKeyScope</code> parameter. For example, if the <code>TagKeyScope</code> parameter is set to <code>ECS,OSS</code> and the TagKeyLogicScope parameter is set to <code>AND</code>, the rule applies to resources with both the <code>ECS</code> and <code>OSS</code> tag keys. Valid values:</p>
         * <ul>
         * <li>AND: the logical relationship of AND</li>
         * <li>OR: the logical relationship of OR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        /**
         * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        /**
         * <p>The tag value used to filter resources. The rule applies only to the resources with the specified tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>MFA</p>
         */
        @NameInMap("TagValueScope")
        public String tagValueScope;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetAggregateConfigRuleResponseBodyConfigRuleTags> tags;

        /**
         * <p>The tag scope.</p>
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
