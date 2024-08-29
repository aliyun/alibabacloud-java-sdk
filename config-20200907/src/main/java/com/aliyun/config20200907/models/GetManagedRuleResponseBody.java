// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetManagedRuleResponseBody extends TeaModel {
    /**
     * <p>The details of the managed rule.</p>
     */
    @NameInMap("ManagedRule")
    public GetManagedRuleResponseBodyManagedRule managedRule;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7E6DDC09-87C1-5310-A924-3491EAAE6F90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetManagedRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedRuleResponseBody self = new GetManagedRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedRuleResponseBody setManagedRule(GetManagedRuleResponseBodyManagedRule managedRule) {
        this.managedRule = managedRule;
        return this;
    }
    public GetManagedRuleResponseBodyManagedRule getManagedRule() {
        return this.managedRule;
    }

    public GetManagedRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetManagedRuleResponseBodyManagedRuleScope extends TeaModel {
        /**
         * <p>The types of resources to which the managed rule applies.</p>
         */
        @NameInMap("ComplianceResourceTypes")
        public java.util.List<String> complianceResourceTypes;

        public static GetManagedRuleResponseBodyManagedRuleScope build(java.util.Map<String, ?> map) throws Exception {
            GetManagedRuleResponseBodyManagedRuleScope self = new GetManagedRuleResponseBodyManagedRuleScope();
            return TeaModel.build(map, self);
        }

        public GetManagedRuleResponseBodyManagedRuleScope setComplianceResourceTypes(java.util.List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }
        public java.util.List<String> getComplianceResourceTypes() {
            return this.complianceResourceTypes;
        }

    }

    public static class GetManagedRuleResponseBodyManagedRuleSourceDetails extends TeaModel {
        /**
         * <p>The interval at which the rule is triggered. Valid values: Valid values:</p>
         * <ul>
         * <li>One_Hour</li>
         * <li>Three_Hours</li>
         * <li>Six_Hours</li>
         * <li>Twelve_Hours</li>
         * <li>TwentyFour_Hours</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TwentyFour_Hours</p>
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

        public static GetManagedRuleResponseBodyManagedRuleSourceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetManagedRuleResponseBodyManagedRuleSourceDetails self = new GetManagedRuleResponseBodyManagedRuleSourceDetails();
            return TeaModel.build(map, self);
        }

        public GetManagedRuleResponseBodyManagedRuleSourceDetails setMaximumExecutionFrequency(String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public String getMaximumExecutionFrequency() {
            return this.maximumExecutionFrequency;
        }

        public GetManagedRuleResponseBodyManagedRuleSourceDetails setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

    public static class GetManagedRuleResponseBodyManagedRule extends TeaModel {
        /**
         * <p>The details of the required input parameters for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CompulsoryInputParameterDetails")
        public java.util.Map<String, ?> compulsoryInputParameterDetails;

        /**
         * <p>The name of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn-domain-https-enabled</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The description of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>If HTTPS encryption is enabled for the CDN domain name, the configuration is considered compliant.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the topic that provides guidance on remediation for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyundoc.com">https://example.aliyundoc.com</a></p>
         */
        @NameInMap("HelpUrls")
        public String helpUrls;

        /**
         * <p>The identifier of the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn-domain-https-enabled</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The tags of the managed rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The details of the optional input parameters for the managed rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OptionalInputParameterDetails")
        public java.util.Map<String, ?> optionalInputParameterDetails;

        /**
         * <p>The risk level of the managed rule. Valid values:</p>
         * <ul>
         * <li>1: high</li>
         * <li>2: medium</li>
         * <li>3: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The effective scope of the managed rule.</p>
         */
        @NameInMap("Scope")
        public GetManagedRuleResponseBodyManagedRuleScope scope;

        /**
         * <p>The information about the trigger type of the managed rule.</p>
         */
        @NameInMap("SourceDetails")
        public java.util.List<GetManagedRuleResponseBodyManagedRuleSourceDetails> sourceDetails;

        public static GetManagedRuleResponseBodyManagedRule build(java.util.Map<String, ?> map) throws Exception {
            GetManagedRuleResponseBodyManagedRule self = new GetManagedRuleResponseBodyManagedRule();
            return TeaModel.build(map, self);
        }

        public GetManagedRuleResponseBodyManagedRule setCompulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
            this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        public GetManagedRuleResponseBodyManagedRule setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetManagedRuleResponseBodyManagedRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetManagedRuleResponseBodyManagedRule setHelpUrls(String helpUrls) {
            this.helpUrls = helpUrls;
            return this;
        }
        public String getHelpUrls() {
            return this.helpUrls;
        }

        public GetManagedRuleResponseBodyManagedRule setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetManagedRuleResponseBodyManagedRule setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetManagedRuleResponseBodyManagedRule setOptionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
            this.optionalInputParameterDetails = optionalInputParameterDetails;
            return this;
        }
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        public GetManagedRuleResponseBodyManagedRule setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetManagedRuleResponseBodyManagedRule setScope(GetManagedRuleResponseBodyManagedRuleScope scope) {
            this.scope = scope;
            return this;
        }
        public GetManagedRuleResponseBodyManagedRuleScope getScope() {
            return this.scope;
        }

        public GetManagedRuleResponseBodyManagedRule setSourceDetails(java.util.List<GetManagedRuleResponseBodyManagedRuleSourceDetails> sourceDetails) {
            this.sourceDetails = sourceDetails;
            return this;
        }
        public java.util.List<GetManagedRuleResponseBodyManagedRuleSourceDetails> getSourceDetails() {
            return this.sourceDetails;
        }

    }

}
