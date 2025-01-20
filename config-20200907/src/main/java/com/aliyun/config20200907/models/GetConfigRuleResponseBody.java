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
         * <p>The statistics on the compliance evaluation results by compliance type. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resource was evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resource was evaluated as incompliant.</li>
         * <li>NOT_APPLICABLE: The rule did not apply to your resource.</li>
         * <li>INSUFFICIENT_DATA: No resource data was available.</li>
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
         * <p>The timestamp generated when the rule was first triggered. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932221993</p>
         */
        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        /**
         * <p>Indicates whether resource configurations were evaluated based on the rule. Valid values:</p>
         * <ul>
         * <li>true: Resource configurations were evaluated based on the rule.</li>
         * <li>false: Resource configurations were not evaluated based on the rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FirstEvaluationStarted")
        public Boolean firstEvaluationStarted;

        /**
         * <p>The error code returned for the previous failed compliance evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>TimeOut</p>
         */
        @NameInMap("LastErrorCode")
        public String lastErrorCode;

        /**
         * <p>The error message returned for the previous failed compliance evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>Time out</p>
         */
        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        /**
         * <p>The timestamp generated when the previous failed compliance evaluation of the rule ended. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        /**
         * <p>The timestamp generated when the previous failed compliance evaluation of the rule started. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1614687022000</p>
         */
        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        /**
         * <p>The timestamp generated when the previous successful compliance evaluation of the rule ended. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227486</p>
         */
        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        /**
         * <p>The timestamp generated when the previous successful compliance evaluation of the rule started. Unit: millisecond.</p>
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
         * <p>The compliance package ID.</p>
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
         * <p>example-name</p>
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
         * <p> Only aliyun.config is returned, which indicates that only events related to Cloud Config are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The interval at which the rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour</li>
         * <li>Three_Hours</li>
         * <li>Six_Hours</li>
         * <li>Twelve_Hours</li>
         * <li>TwentyFour_Hours</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned if the rule is periodically triggered.</p>
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
         * <li>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</li>
         * <li>ScheduledNotification: The rule is periodically triggered.</li>
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
         * <p>The settings of the required input parameters for the managed rule.</p>
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
         * <p>example-description</p>
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
         * <p>The rule tags.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The name of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>example-name</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>The settings of the optional input parameters for the managed rule.</p>
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
         * <p>The types of the resources to be evaluated against the rule. You can also view the resource types by using the ResourceTypesScope parameter.</p>
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
         * <p> Only aliyun.config is returned, which indicates that only events related to Cloud Config are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun.config</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The interval at which the rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour</li>
         * <li>Three_Hours</li>
         * <li>Six_Hours</li>
         * <li>Twelve_Hours</li>
         * <li>TwentyFour_Hours</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned if the rule is periodically triggered.</p>
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
         * <li>ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</li>
         * <li>ScheduledNotification: The rule is periodically triggered.</li>
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
         * <li>If the rule is a managed rule, the value of this parameter is the identifier of the managed rule.</li>
         * <li>If the rule is a custom rule, the value of this parameter is the Alibaba Cloud Resource Name (ARN) of a function.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/specific-config</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>CUSTOM_FC: a custom rule.</li>
         * <li>ALIYUN: a managed rule.</li>
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
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <p>TagKey</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>TagValue</p>
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
         * <p>The details of compliance evaluation results.</p>
         */
        @NameInMap("Compliance")
        public GetConfigRuleResponseBodyConfigRuleCompliance compliance;

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
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-disk-auto-snapshot-policy</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>ACTIVE: The rule is enabled.</li>
         * <li>DELETING: The rule is being deleted.</li>
         * <li>EVALUATING: The rule is being used to evaluate resource configurations.</li>
         * <li>INACTIVE: The rule is disabled.</li>
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
         * <li>ConfigurationItemChangeNotification: The rule was triggered by configuration changes.</li>
         * <li>ScheduledNotification: The rule was periodically triggered.</li>
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
        public GetConfigRuleResponseBodyConfigRuleCreateBy createBy;

        /**
         * <p>The timestamp generated when the rule was created. Unit: millisecond.</p>
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
         * <p>example-description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ExcludeRegionIdsScope</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("ExcludeRegionIdsScope")
        public String excludeRegionIdsScope;

        /**
         * <p>ExcludeResourceGroupIdsScope</p>
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
         * <p>ExcludeTagsScope</p>
         */
        @NameInMap("ExcludeTagsScope")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleExcludeTagsScope> excludeTagsScope;

        /**
         * <p>Optional field, only used in conjunction with the 24-hour cycle execution to set the trigger time.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fixedHour&quot;:&quot;12&quot;}</p>
         */
        @NameInMap("ExtendContent")
        public String extendContent;

        /**
         * <p>The input parameters of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        /**
         * <p>The details of the managed rule.</p>
         */
        @NameInMap("ManagedRule")
        public GetConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        /**
         * <p>The interval at which the rule is triggered. Valid values:</p>
         * <ul>
         * <li>One_Hour</li>
         * <li>Three_Hours</li>
         * <li>Six_Hours</li>
         * <li>Twelve_Hours</li>
         * <li>TwentyFour_Hours</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned if the rule is periodically triggered.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>One_Hour</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The timestamp generated when the rule was last updated. Unit: millisecond.</p>
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
         * <p>ResourceIdsScope</p>
         * 
         * <strong>example:</strong>
         * <p>eip-8vbf3x310fn56ijfd****</p>
         */
        @NameInMap("ResourceIdsScope")
        public String resourceIdsScope;

        /**
         * <p>The type of the resource to be evaluated by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the resources that do not comply with the rule. Valid values:</p>
         * <ul>
         * <li>1: high.</li>
         * <li>2: medium.</li>
         * <li>3: low.</li>
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
         * <p>The information about how the rule was created.</p>
         */
        @NameInMap("Source")
        public GetConfigRuleResponseBodyConfigRuleSource source;

        /**
         * <p>The ID of the member account to which the rule does not apply, which means that the resources within the member account are not evaluated based on the rule.</p>
         * <blockquote>
         * <p>This parameter applies only to a managed rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("TagKeyLogicScope")
        public String tagKeyLogicScope;

        /**
         * <p>The tag key used to filter resources. The rule applies only to the resources with the specified tag key.</p>
         * <blockquote>
         * <p>The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters are returned at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("TagKeyScope")
        public String tagKeyScope;

        /**
         * <p>The tag value used to filter resources. The rule applies only to the resources with the specified tag value.</p>
         * <blockquote>
         * <p>The <code>TagKeyScope</code> and <code>TagValueScope</code> parameters are returned at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MFA</p>
         */
        @NameInMap("TagValueScope")
        public String tagValueScope;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetConfigRuleResponseBodyConfigRuleTags> tags;

        /**
         * <p>TagsScope</p>
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
