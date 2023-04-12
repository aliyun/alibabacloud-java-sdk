// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation results returned.</p>
     */
    @NameInMap("EvaluationResults")
    public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateConfigRuleEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRuleEvaluationResultsResponseBody self = new ListAggregateConfigRuleEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRuleEvaluationResultsResponseBody setEvaluationResults(ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListAggregateConfigRuleEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier extends TeaModel {
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
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier self = new ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setIgnoreDate(String ignoreDate) {
            this.ignoreDate = ignoreDate;
            return this;
        }
        public String getIgnoreDate() {
            return this.ignoreDate;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier extends TeaModel {
        /**
         * <p>The information about the evaluated resource in the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp when the compliance evaluation was performed. Unit: milliseconds.</p>
         * <br>
         * <p>>  This timestamp indicates the time when the rule was triggered. You can obtain the timestamp from the value of the `ConfigRuleInvokedTimestamp` parameter.</p>
         */
        @NameInMap("OrderingTimestamp")
        public Long orderingTimestamp;

        public static ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier self = new ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setEvaluationResultQualifier(ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier) {
            this.evaluationResultQualifier = evaluationResultQualifier;
            return this;
        }
        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setOrderingTimestamp(Long orderingTimestamp) {
            this.orderingTimestamp = orderingTimestamp;
            return this;
        }
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

    }

    public static class ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList extends TeaModel {
        /**
         * <p>The annotation to the resource that is evaluated as incompliant. The following section describe the parameters that can be returned:</p>
         * <br>
         * <p>*   `configuration`: the current resource configuration that is evaluated as incompliant by using the rule.</p>
         * <p>*   `desiredValue`: the expected resource configuration that is evaluated as compliant by using the rule.</p>
         * <p>*   `operator`: the operator that is used to compare the current configuration with the expected configuration of the resource.</p>
         * <p>*   `property`: the JSON path of the current configuration in the resource property struct.</p>
         * <p>*   `reason`: the reason why the resource is evaluated as incompliant.</p>
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
         * <p>*   IGNORED: The resources are ignored during compliance evaluation.</p>
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
        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

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
         * <p>The timestamp when the compliance evaluation result was generated. Unit: milliseconds.</p>
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

        public static ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList self = new ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
            this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
            return this;
        }
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationResultIdentifier(ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier) {
            this.evaluationResultIdentifier = evaluationResultIdentifier;
            return this;
        }
        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setInvokingEventMessageType(String invokingEventMessageType) {
            this.invokingEventMessageType = invokingEventMessageType;
            return this;
        }
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRemediationEnabled(Boolean remediationEnabled) {
            this.remediationEnabled = remediationEnabled;
            return this;
        }
        public Boolean getRemediationEnabled() {
            return this.remediationEnabled;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setResultRecordedTimestamp(Long resultRecordedTimestamp) {
            this.resultRecordedTimestamp = resultRecordedTimestamp;
            return this;
        }
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>The details of the compliance evaluation results.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

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

        public static ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults self = new ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults setEvaluationResultList(java.util.List<ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList) {
            this.evaluationResultList = evaluationResultList;
            return this;
        }
        public java.util.List<ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
