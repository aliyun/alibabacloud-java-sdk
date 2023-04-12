// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The compliance evaluation result returned.</p>
     */
    @NameInMap("EvaluationResults")
    public ListConfigRuleEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigRuleEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleEvaluationResultsResponseBody self = new ListConfigRuleEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleEvaluationResultsResponseBody setEvaluationResults(ListConfigRuleEvaluationResultsResponseBodyEvaluationResults evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public ListConfigRuleEvaluationResultsResponseBodyEvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListConfigRuleEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier extends TeaModel {
        /**
         * <p>The ID of the compliance package to which the rule belongs.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The date on which the system automatically re-evaluates the ignored incompliant resources.</p>
         * <br>
         * <p>>  If this parameter is left empty, the system does not automatically re-evaluate the ignored incompliant resources. You must manually re-evaluate the ignored incompliant resources.</p>
         */
        @NameInMap("IgnoreDate")
        public String ignoreDate;

        /**
         * <p>The ID of the region where the resource resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resources belong.</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier self = new ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier();
            return TeaModel.build(map, self);
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setIgnoreDate(String ignoreDate) {
            this.ignoreDate = ignoreDate;
            return this;
        }
        public String getIgnoreDate() {
            return this.ignoreDate;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier extends TeaModel {
        /**
         * <p>The information about the evaluated resource in the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp when the compliance evaluation was performed. Unit: milliseconds.</p>
         */
        @NameInMap("OrderingTimestamp")
        public Long orderingTimestamp;

        public static ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier self = new ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier();
            return TeaModel.build(map, self);
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setEvaluationResultQualifier(ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier) {
            this.evaluationResultQualifier = evaluationResultQualifier;
            return this;
        }
        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setOrderingTimestamp(Long orderingTimestamp) {
            this.orderingTimestamp = orderingTimestamp;
            return this;
        }
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

    }

    public static class ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList extends TeaModel {
        /**
         * <p>The annotation to the resource that is evaluated as non-compliant. The following parameters may be returned:</p>
         * <br>
         * <p>*   `configuration`: the current resource configuration that is evaluated as non-compliant.</p>
         * <p>*   `desiredValue`: the expected resource configuration that is evaluated as compliant.</p>
         * <p>*   `operator`: the operator that compares the current configuration with the expected configuration of the resource.</p>
         * <p>*   `property`: the JSON path of the current configuration in the resource property struct.</p>
         * <p>*   `reason`: the reason why the resource is evaluated as non-compliant.</p>
         */
        @NameInMap("Annotation")
        public String annotation;

        /**
         * <p>The compliance evaluation result of the resources. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resources are evaluated as non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to the resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
         * <p>*   IGNORED: The resource is ignored during compliance evaluation.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The timestamp when the rule was triggered for the compliance evaluation. Unit: milliseconds.</p>
         */
        @NameInMap("ConfigRuleInvokedTimestamp")
        public Long configRuleInvokedTimestamp;

        /**
         * <p>The identifier of the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultIdentifier")
        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The rule is periodically triggered.</p>
         */
        @NameInMap("InvokingEventMessageType")
        public String invokingEventMessageType;

        /**
         * <p>Indicates whether the remediation template is enabled. Valid values:</p>
         * <br>
         * <p>- true: The remediation template is enabled.</p>
         * <p>- false: The remediation template is disabled.</p>
         */
        @NameInMap("RemediationEnabled")
        public Boolean remediationEnabled;

        /**
         * <p>The timestamp when the compliance evaluation result was recorded. Unit: milliseconds.</p>
         */
        @NameInMap("ResultRecordedTimestamp")
        public Long resultRecordedTimestamp;

        /**
         * <p>The risk level of the resources that are not compliant with the rule. Valid values:</p>
         * <br>
         * <p>*   1: high risk level</p>
         * <p>*   2: medium risk level</p>
         * <p>*   3: low risk level</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList self = new ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList();
            return TeaModel.build(map, self);
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
            this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
            return this;
        }
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationResultIdentifier(ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier) {
            this.evaluationResultIdentifier = evaluationResultIdentifier;
            return this;
        }
        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setInvokingEventMessageType(String invokingEventMessageType) {
            this.invokingEventMessageType = invokingEventMessageType;
            return this;
        }
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRemediationEnabled(Boolean remediationEnabled) {
            this.remediationEnabled = remediationEnabled;
            return this;
        }
        public Boolean getRemediationEnabled() {
            return this.remediationEnabled;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setResultRecordedTimestamp(Long resultRecordedTimestamp) {
            this.resultRecordedTimestamp = resultRecordedTimestamp;
            return this;
        }
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListConfigRuleEvaluationResultsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>The details of the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that was used to initiate the next request.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListConfigRuleEvaluationResultsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRuleEvaluationResultsResponseBodyEvaluationResults self = new ListConfigRuleEvaluationResultsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResults setEvaluationResultList(java.util.List<ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList) {
            this.evaluationResultList = evaluationResultList;
            return this;
        }
        public java.util.List<ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResults setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResults setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
