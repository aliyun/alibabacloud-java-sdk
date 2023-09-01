// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeConfigRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("ConfigRule")
    public DescribeConfigRuleResponseBodyConfigRule configRule;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigRuleResponseBody self = new DescribeConfigRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigRuleResponseBody setConfigRule(DescribeConfigRuleResponseBodyConfigRule configRule) {
        this.configRule = configRule;
        return this;
    }
    public DescribeConfigRuleResponseBodyConfigRule getConfigRule() {
        return this.configRule;
    }

    public DescribeConfigRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus extends TeaModel {
        /**
         * <p>The timestamp when the rule was first triggered.</p>
         */
        @NameInMap("FirstActivatedTimestamp")
        public Long firstActivatedTimestamp;

        /**
         * <p>Indicates whether resources were evaluated based on the rule. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
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
         * <p>The timestamp when the last failed compliance evaluation of the rule ended.</p>
         */
        @NameInMap("LastFailedEvaluationTimestamp")
        public Long lastFailedEvaluationTimestamp;

        /**
         * <p>The timestamp when the last failed compliance evaluation of the rule started.</p>
         */
        @NameInMap("LastFailedInvocationTimestamp")
        public Long lastFailedInvocationTimestamp;

        /**
         * <p>The timestamp when the last successful compliance evaluation of the rule ended.</p>
         */
        @NameInMap("LastSuccessfulEvaluationTimestamp")
        public Long lastSuccessfulEvaluationTimestamp;

        /**
         * <p>The timestamp when the last successful compliance evaluation of the rule started.</p>
         */
        @NameInMap("LastSuccessfulInvocationTimestamp")
        public Long lastSuccessfulInvocationTimestamp;

        public static DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus self = new DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus();
            return TeaModel.build(map, self);
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

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastErrorCode(String lastErrorCode) {
            this.lastErrorCode = lastErrorCode;
            return this;
        }
        public String getLastErrorCode() {
            return this.lastErrorCode;
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

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulEvaluationTimestamp(Long lastSuccessfulEvaluationTimestamp) {
            this.lastSuccessfulEvaluationTimestamp = lastSuccessfulEvaluationTimestamp;
            return this;
        }
        public Long getLastSuccessfulEvaluationTimestamp() {
            return this.lastSuccessfulEvaluationTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus setLastSuccessfulInvocationTimestamp(Long lastSuccessfulInvocationTimestamp) {
            this.lastSuccessfulInvocationTimestamp = lastSuccessfulInvocationTimestamp;
            return this;
        }
        public Long getLastSuccessfulInvocationTimestamp() {
            return this.lastSuccessfulInvocationTimestamp;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails extends TeaModel {
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
         * <p>*   Twelve_Hours: 12 hours.</p>
         * <p>*   TwentyFour_Hours: 24 hours.</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The trigger type of the managed rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The managed rule is triggered as scheduled.</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        public static DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails self = new DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails();
            return TeaModel.build(map, self);
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

        public DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleManagedRule extends TeaModel {
        /**
         * <p>The settings of the required input parameters for the managed rule.</p>
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
         * <p>The labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The name of the managed rule.</p>
         */
        @NameInMap("ManagedRuleName")
        public String managedRuleName;

        /**
         * <p>The settings of the optional input parameters for the managed rule.</p>
         */
        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        /**
         * <p>The intervals at which the rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour</p>
         * <p>*   Three_Hours: 3 hours</p>
         * <p>*   Six_Hours: 6 hours</p>
         * <p>*   Twelve_Hours: 12 hours.</p>
         * <p>*   TwentyFour_Hours: 24 hours.</p>
         */
        @NameInMap("SourceDetails")
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails;

        public static DescribeConfigRuleResponseBodyConfigRuleManagedRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleManagedRule self = new DescribeConfigRuleResponseBodyConfigRuleManagedRule();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setManagedRuleName(String managedRuleName) {
            this.managedRuleName = managedRuleName;
            return this;
        }
        public String getManagedRuleName() {
            return this.managedRuleName;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public DescribeConfigRuleResponseBodyConfigRuleManagedRule setSourceDetails(java.util.List<DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleScope extends TeaModel {
        /**
         * <p>The ID of the resource to be evaluated.</p>
         */
        @NameInMap("ComplianceResourceId")
        public String complianceResourceId;

        /**
         * <p>The types of the resources to be evaluated.</p>
         */
        @NameInMap("ComplianceResourceTypes")
        public java.util.List<String> complianceResourceTypes;

        public static DescribeConfigRuleResponseBodyConfigRuleScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleScope self = new DescribeConfigRuleResponseBodyConfigRuleScope();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleScope setComplianceResourceId(String complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }
        public String getComplianceResourceId() {
            return this.complianceResourceId;
        }

        public DescribeConfigRuleResponseBodyConfigRuleScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions extends TeaModel {
        /**
         * <p>The expected value of the input parameter.</p>
         */
        @NameInMap("DesiredValue")
        public String desiredValue;

        /**
         * <p>The name of the input parameter for the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operator used to compare the actual value against the expected value of the input parameter. The operator varies based on the type of data returned for the SelectPath parameter.</p>
         * <br>
         * <p>*   Valid values for the String data type:</p>
         * <br>
         * <p>    *   StringEquals: The actual value is equal to the expected value.</p>
         * <p>    *   NotStringEquals: The actual value is not equal to the expected value.</p>
         * <p>    *   StringIn: The actual value exists in the expected value.</p>
         * <p>    *   NotStringIn: The actual value does not exist in the expected value.</p>
         * <p>    *   StringContains: The actual value contains the expected value.</p>
         * <p>    *   NotStringContains: The actual value does not contain the expected value.</p>
         * <br>
         * <p>*   Valid values for the Number data type:</p>
         * <br>
         * <p>    *   Equals: The actual value is equal to the expected value.</p>
         * <p>    *   NotEquals: The actual value is not equal to the expected value.</p>
         * <p>    *   Less: The actual value is less than the expected value.</p>
         * <p>    *   LessOrEquals: The actual value is less than or equal to the expected value.</p>
         * <p>    *   Greater: The actual value is greater than the expected value.</p>
         * <p>    *   GreaterOrEquals: The actual value is greater than or equal to the expected value.</p>
         * <br>
         * <p>*   Valid values for the Base64String data type that indicates a Base64-encoded string:</p>
         * <br>
         * <p>    *   Base64Contains: The actual value contains the expected value.</p>
         * <p>    *   NotBase64Contains: The actual value does not contain the expected value.</p>
         * <p>    *   Base64ContainsAll: The actual value contains all characters in the expected value.</p>
         * <p>    *   Base64ExcludeAll: The actual value excludes all characters in the expected value.</p>
         * <br>
         * <p>*   Valid values for the Array data type:</p>
         * <br>
         * <p>    *   Contains: The actual value contains the expected value.</p>
         * <p>    *   NotContains: The actual value does not contain the expected value.</p>
         * <p>    *   In: The actual value exists in the expected value.</p>
         * <p>    *   NotIn: The actual value does not exist in the expected value.</p>
         * <p>    *   ContainsAll: The actual value contains all elements of the expected value.</p>
         * <p>    *   ExcludeAll: The actual value excludes all elements of the expected value.</p>
         * <p>    *   IsEmpty: The actual value is null.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The description of the input parameter.</p>
         */
        @NameInMap("Tips")
        public String tips;

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

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails extends TeaModel {
        /**
         * <p>The event source of the rule.</p>
         * <br>
         * <p>>  Only events related to Cloud Config are supported. The value is fixed to aliyun.config.</p>
         */
        @NameInMap("EventSource")
        public String eventSource;

        /**
         * <p>The intervals at which the rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour.</p>
         * <p>*   Three_Hours: 3 hours.</p>
         * <p>*   Six_Hours: 6 hours.</p>
         * <p>*   Twelve_Hours: 12 hours.</p>
         * <p>*   TwentyFour_Hours: 24 hours.</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The rule is triggered as scheduled.</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        public static DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails self = new DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails();
            return TeaModel.build(map, self);
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

        public DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRuleSource extends TeaModel {
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
         * <p>The name of the input parameter for the rule.</p>
         */
        @NameInMap("SourceConditions")
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceConditions> sourceConditions;

        /**
         * <p>The intervals at which the rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour</p>
         * <p>*   Three_Hours: 3 hours</p>
         * <p>*   Six_Hours: 6 hours</p>
         * <p>*   Twelve_Hours: 12 hours.</p>
         * <p>*   TwentyFour_Hours: 24 hours.</p>
         */
        @NameInMap("SourceDetails")
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails;

        public static DescribeConfigRuleResponseBodyConfigRuleSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRuleSource self = new DescribeConfigRuleResponseBodyConfigRuleSource();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRuleSource setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
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

        public DescribeConfigRuleResponseBodyConfigRuleSource setSourceDetails(java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<DescribeConfigRuleResponseBodyConfigRuleSourceSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

    public static class DescribeConfigRuleResponseBodyConfigRule extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The information about compliance evaluations performed by the rule.</p>
         */
        @NameInMap("ConfigRuleEvaluationStatus")
        public DescribeConfigRuleResponseBodyConfigRuleConfigRuleEvaluationStatus configRuleEvaluationStatus;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the evaluation rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   ACTIVE: The rule is enabled.</p>
         * <p>*   EVALUATING: The rule was triggered and is being used to monitor resource configurations.</p>
         * <p>*   INACTIVE: The rule was disabled.</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The timestamp when the rule was created.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The description of the system defense rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input parameters of the rule.</p>
         */
        @NameInMap("InputParameters")
        public java.util.Map<String, ?> inputParameters;

        /**
         * <p>The details of the managed rule.</p>
         */
        @NameInMap("ManagedRule")
        public DescribeConfigRuleResponseBodyConfigRuleManagedRule managedRule;

        /**
         * <p>The intervals at which the rule is triggered. Valid values:</p>
         * <br>
         * <p>*   One_Hour: 1 hour</p>
         * <p>*   Three_Hours: 3 hours</p>
         * <p>*   Six_Hours: 6 hours</p>
         * <p>*   Twelve_Hours: 12 hours.</p>
         * <p>*   TwentyFour_Hours: 24 hours.</p>
         */
        @NameInMap("MaximumExecutionFrequency")
        public String maximumExecutionFrequency;

        /**
         * <p>The timestamp when the rule was last modified.</p>
         */
        @NameInMap("ModifiedTimestamp")
        public Long modifiedTimestamp;

        /**
         * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
         * <br>
         * <p>*   1: high</p>
         * <p>*   2: medium</p>
         * <p>*   3: low</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The monitoring scope of the rule.</p>
         */
        @NameInMap("Scope")
        public DescribeConfigRuleResponseBodyConfigRuleScope scope;

        /**
         * <p>The information about the trigger of the rule.</p>
         */
        @NameInMap("Source")
        public DescribeConfigRuleResponseBodyConfigRuleSource source;

        public static DescribeConfigRuleResponseBodyConfigRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigRuleResponseBodyConfigRule self = new DescribeConfigRuleResponseBodyConfigRule();
            return TeaModel.build(map, self);
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
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

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public DescribeConfigRuleResponseBodyConfigRule setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public DescribeConfigRuleResponseBodyConfigRule setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigRuleResponseBodyConfigRule setInputParameters(java.util.Map<String, ?> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.Map<String, ?> getInputParameters() {
            return this.inputParameters;
        }

        public DescribeConfigRuleResponseBodyConfigRule setManagedRule(DescribeConfigRuleResponseBodyConfigRuleManagedRule managedRule) {
            this.managedRule = managedRule;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleManagedRule getManagedRule() {
            return this.managedRule;
        }

        public DescribeConfigRuleResponseBodyConfigRule setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public DescribeConfigRuleResponseBodyConfigRule setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public DescribeConfigRuleResponseBodyConfigRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeConfigRuleResponseBodyConfigRule setScope(DescribeConfigRuleResponseBodyConfigRuleScope scope) {
            this.scope = scope;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleScope getScope() {
            return this.scope;
        }

        public DescribeConfigRuleResponseBodyConfigRule setSource(DescribeConfigRuleResponseBodyConfigRuleSource source) {
            this.source = source;
            return this;
        }
        public DescribeConfigRuleResponseBodyConfigRuleSource getSource() {
            return this.source;
        }

    }

}
