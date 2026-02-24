// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("ConfigRule")
    public GetConfigRuleResponseBodyConfigRule configRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>811234F4-C3AB-4D15-B90B-F55016D1B5AA</p>
     */
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

    public static class GetConfigRuleResponseBodyConfigRuleCompliance extends TeaModel {
        /**
         * <p>The compliance evaluation result. Valid values:</p>
         * <ul>
         * <li><p>COMPLIANT: The resource is compliant.</p>
         * </li>
         * <li><p>NON_COMPLIANT: The resource is non-compliant.</p>
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
         * <p>The number of resources that are evaluated based on the compliance result.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static GetConfigRuleResponseBodyConfigRuleCompliance build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleCompliance self = new GetConfigRuleResponseBodyConfigRuleCompliance();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleCompliance setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetConfigRuleResponseBodyConfigRuleCompliance setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus extends TeaModel {
        /**
         * <p>The timestamp when the rule was first activated. Unit: milliseconds.</p>
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
         * <p>Time out</p>
         */
        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        /**
         * <p>The timestamp when the last failed evaluation of the rule ended. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        /**
         * <p>The timestamp when the last failed invocation of the rule started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        /**
         * <p>The timestamp when the last successful evaluation of the rule ended. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227486</p>
         */
        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        /**
         * <p>The timestamp when the last successful invocation of the rule started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227476</p>
         */
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
         * <p>The ID of the Alibaba Cloud account that was used to create the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
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

    public static class GetConfigRuleResponseBodyConfigRuleExcludeTagsScope extends TeaModel {
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

        public static GetConfigRuleResponseBodyConfigRuleExcludeTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleExcludeTagsScope self = new GetConfigRuleResponseBodyConfigRuleExcludeTagsScope();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleExcludeTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetConfigRuleResponseBodyConfigRuleExcludeTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails extends TeaModel {
        /**
         * <p>The event source.</p>
         * <blockquote>
         * <p>Only Cloud Config events are supported. The value is aliyun.config.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The execution frequency of the rule. Valid values:</p>
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
         * <blockquote>
         * <p>This parameter is returned only when the rule is triggered periodically.</p>
         * </blockquote>
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
        /**
         * <p>The details of the required input parameters of the managed rule.</p>
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
         * <p>The list of rule labels.</p>
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
         * <p>The details of the optional input parameters of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        /**
         * <p>The source details of the managed rule.</p>
         */
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

    public static class GetConfigRuleResponseBodyConfigRuleScope extends TeaModel {
        /**
         * <p>The list of resource types that are evaluated by the rule. You can also view this information in the ResourceTypesScope field.</p>
         */
        @NameInMap("ComplianceResourceTypes")
        public java.util.List<String> complianceResourceTypes;

        public static GetConfigRuleResponseBodyConfigRuleScope build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleScope self = new GetConfigRuleResponseBodyConfigRuleScope();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleSourceSourceDetails extends TeaModel {
        /**
         * <p>The event source.</p>
         * <blockquote>
         * <p>Only Cloud Config events are supported. The value is aliyun.config.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The execution frequency of the rule. Valid values:</p>
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
         * <blockquote>
         * <p>This parameter is returned only when the rule is triggered periodically.</p>
         * </blockquote>
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
        /**
         * <p>The identifier of the rule.</p>
         * <ul>
         * <li><p>If the rule is a managed rule, the value of this parameter is the identifier of the managed rule.</p>
         * </li>
         * <li><p>If the rule is a custom rule, the value of this parameter is the ARN of the function.</p>
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
         * <p>The source details.</p>
         */
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

    public static class GetConfigRuleResponseBodyConfigRuleTags extends TeaModel {
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

        public static GetConfigRuleResponseBodyConfigRuleTags build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleTags self = new GetConfigRuleResponseBodyConfigRuleTags();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetConfigRuleResponseBodyConfigRuleTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRuleTagsScope extends TeaModel {
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

        public static GetConfigRuleResponseBodyConfigRuleTagsScope build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRuleTagsScope self = new GetConfigRuleResponseBodyConfigRuleTagsScope();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRuleTagsScope setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetConfigRuleResponseBodyConfigRuleTagsScope setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetConfigRuleResponseBodyConfigRule extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The compliance statistics of the rule.</p>
         */
        @NameInMap("Compliance")
        public GetConfigRuleResponseBodyConfigRuleCompliance compliance;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
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
        public GetConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-7f7d626622af0041****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The rule name.</p>
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
         * <li><p>EVALUATING: The rule is being used to evaluate resource configurations.</p>
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
        public GetConfigRuleResponseBodyConfigRuleCreateBy createBy;

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
         * <p>The IDs of the regions where the rule does not apply. The rule does not evaluate resources in these regions. Separate multiple region IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>The IDs of the resource groups where the rule does not apply. The rule does not evaluate resources in these resource groups. Separate multiple resource group IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        @NameInMap("ExcludeResourceGroupIdsScope")
        public String excludeResourceGroupIdsScope;

        /**
         * <p>The IDs of the resources that are not evaluated by the rule. Separate multiple resource IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>23642660635687****</p>
         */
        @NameInMap("ExcludeResourceIdsScope")
        public String excludeResourceIdsScope;

        /**
         * <p>The tags of the resources that are not evaluated by the rule.</p>
         */
        @NameInMap("ExcludeTagsScope")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleExcludeTagsScope> excludeTagsScope;

        /**
         * <p>The extended content. This parameter is used only to specify the trigger time for a rule that is triggered on a 24-hour cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
         */
        @NameInMap("ExtendContent")
        public String extendContent;

        /**
         * <p>The input parameters of the rule.</p>
         */
        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        /**
         * <p>The details of the managed rule.</p>
         */
        @NameInMap("ManagedRule")
        public GetConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        /**
         * <p>The execution frequency of the rule. Valid values:</p>
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
         * <blockquote>
         * <p>This parameter is returned only when the rule is triggered periodically.</p>
         * </blockquote>
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
         * <p>The IDs of the regions where the rule applies. The rule evaluates only resources in these regions.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("RegionIdsScope")
        public String regionIdsScope;

        /**
         * <p>The IDs of the resource groups where the rule applies. The rule evaluates only resources in these resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzdibsjjc****</p>
         */
        @NameInMap("ResourceGroupIdsScope")
        public String resourceGroupIdsScope;

        /**
         * <p>The IDs of the resources that are evaluated by the rule. Separate multiple resource IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The rule evaluates only resources that have the specified names.</p>
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
         * <p>The types of the resources that are evaluated by the rule.</p>
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
         * <p>The effective scope of the rule.</p>
         */
        @NameInMap("Scope")
        public GetConfigRuleResponseBodyConfigRuleScope scope;

        /**
         * <p>The source of the rule.</p>
         */
        @NameInMap("Source")
        public GetConfigRuleResponseBodyConfigRuleSource source;

        /**
         * <p>This parameter is not returned for rules that are created using the <code>TagsScope</code> parameter.</p>
         * <p>This parameter is returned for rules that are created using the deprecated TagKeyScope parameter. We do not recommend that you use the <code>TagKeyScope</code> parameter. For example, if <code>TagKeyScope</code> is set to <code>ECS,OSS</code> and this parameter is set to <code>AND</code>, the rule applies only to resources that have both the <code>ECS</code> and <code>OSS</code> tags.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>AND</p>
         * </li>
         * <li><p>OR</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        /**
         * <p>This parameter is deprecated. Use the <code>TagsScope</code> parameter instead.</p>
         * <p>The rule applies only to resources with the specified tag.</p>
         * <blockquote>
         * <p>The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters are returned at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("TagKeyScope")
        @Deprecated
        public String tagKeyScope;

        /**
         * <p>This parameter is deprecated. Use the <code>TagsScope</code> parameter instead.</p>
         * <p>The rule applies only to resources with the specified tag.</p>
         * <blockquote>
         * <p>The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters are returned at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MFA</p>
         */
        @NameInMap("TagValueScope")
        @Deprecated
        public String tagValueScope;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleTags> tags;

        /**
         * <p>The tag-based scope.</p>
         */
        @NameInMap("TagsScope")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleTagsScope> tagsScope;

        public static GetConfigRuleResponseBodyConfigRule build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleResponseBodyConfigRule self = new GetConfigRuleResponseBodyConfigRule();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleResponseBodyConfigRule setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetConfigRuleResponseBodyConfigRule setCompliance(GetConfigRuleResponseBodyConfigRuleCompliance compliance) {
            this.compliance = compliance;
            return this;
        }
        public GetConfigRuleResponseBodyConfigRuleCompliance getCompliance() {
            return this.compliance;
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

        public GetConfigRuleResponseBodyConfigRule setExcludeRegionIdsScope(String excludeRegionIdsScope) {
            this.excludeRegionIdsScope = excludeRegionIdsScope;
            return this;
        }
        public String getExcludeRegionIdsScope() {
            return this.excludeRegionIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
            this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
            return this;
        }
        public String getExcludeResourceGroupIdsScope() {
            return this.excludeResourceGroupIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setExcludeResourceIdsScope(String excludeResourceIdsScope) {
            this.excludeResourceIdsScope = excludeResourceIdsScope;
            return this;
        }
        public String getExcludeResourceIdsScope() {
            return this.excludeResourceIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setExcludeTagsScope(java.util.List<GetConfigRuleResponseBodyConfigRuleExcludeTagsScope> excludeTagsScope) {
            this.excludeTagsScope = excludeTagsScope;
            return this;
        }
        public java.util.List<GetConfigRuleResponseBodyConfigRuleExcludeTagsScope> getExcludeTagsScope() {
            return this.excludeTagsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setExtendContent(String extendContent) {
            this.extendContent = extendContent;
            return this;
        }
        public String getExtendContent() {
            return this.extendContent;
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

        public GetConfigRuleResponseBodyConfigRule setResourceIdsScope(String resourceIdsScope) {
            this.resourceIdsScope = resourceIdsScope;
            return this;
        }
        public String getResourceIdsScope() {
            return this.resourceIdsScope;
        }

        public GetConfigRuleResponseBodyConfigRule setResourceNameScope(String resourceNameScope) {
            this.resourceNameScope = resourceNameScope;
            return this;
        }
        public String getResourceNameScope() {
            return this.resourceNameScope;
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

        public GetConfigRuleResponseBodyConfigRule setScope(GetConfigRuleResponseBodyConfigRuleScope scope) {
            this.scope = scope;
            return this;
        }
        public GetConfigRuleResponseBodyConfigRuleScope getScope() {
            return this.scope;
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

        @Deprecated
        public GetConfigRuleResponseBodyConfigRule setTagKeyScope(String tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public String getTagKeyScope() {
            return this.tagKeyScope;
        }

        @Deprecated
        public GetConfigRuleResponseBodyConfigRule setTagValueScope(String tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public String getTagValueScope() {
            return this.tagValueScope;
        }

        public GetConfigRuleResponseBodyConfigRule setTags(java.util.List<GetConfigRuleResponseBodyConfigRuleTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetConfigRuleResponseBodyConfigRuleTags> getTags() {
            return this.tags;
        }

        public GetConfigRuleResponseBodyConfigRule setTagsScope(java.util.List<GetConfigRuleResponseBodyConfigRuleTagsScope> tagsScope) {
            this.tagsScope = tagsScope;
            return this;
        }
        public java.util.List<GetConfigRuleResponseBodyConfigRuleTagsScope> getTagsScope() {
            return this.tagsScope;
        }

    }

}
