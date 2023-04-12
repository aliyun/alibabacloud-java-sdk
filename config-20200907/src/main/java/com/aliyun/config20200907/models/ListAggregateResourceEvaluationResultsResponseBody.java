// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation results returned.</p>
     */
    @NameInMap("EvaluationResults")
    public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateResourceEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourceEvaluationResultsResponseBody self = new ListAggregateResourceEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourceEvaluationResultsResponseBody setEvaluationResults(ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListAggregateResourceEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier extends TeaModel {
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
         * <p>The name of the monitoring rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The date from which the system automatically re-evaluates the ignored incompliant resources.</p>
         * <br>
         * <p>>  If the value of this parameter is left empty, the system does not automatically re-evaluate the ignored incompliant resources. You must manually re-evaluate the ignored incompliant resources.</p>
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
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier self = new ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setIgnoreDate(String ignoreDate) {
            this.ignoreDate = ignoreDate;
            return this;
        }
        public String getIgnoreDate() {
            return this.ignoreDate;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier extends TeaModel {
        /**
         * <p>The information about the evaluated resource in the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp when the compliance evaluation was performed. Unit: milliseconds.</p>
         */
        @NameInMap("OrderingTimestamp")
        public Long orderingTimestamp;

        public static ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier self = new ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setEvaluationResultQualifier(ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier) {
            this.evaluationResultQualifier = evaluationResultQualifier;
            return this;
        }
        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setOrderingTimestamp(Long orderingTimestamp) {
            this.orderingTimestamp = orderingTimestamp;
            return this;
        }
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

    }

    public static class ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList extends TeaModel {
        /**
         * <p>The annotation to the resource that is evaluated as incompliant.</p>
         */
        @NameInMap("Annotation")
        public String annotation;

        /**
         * <p>The compliance evaluation result of the resources. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resources are evaluated as compliant.</p>
         * <p>*   NON_COMPLIANT: The resources are evaluated as incompliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to your resources.</p>
         * <p>*   INSUFFICIENT_DATA: No resource data is available.</p>
         * <p>*   IGNORED: The resource is ignored during compliance evaluation.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The timestamp when the rule was triggered. Unit: milliseconds.</p>
         */
        @NameInMap("ConfigRuleInvokedTimestamp")
        public Long configRuleInvokedTimestamp;

        /**
         * <p>The identifying information about the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultIdentifier")
        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

        /**
         * <p>The trigger type of the managed rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The managed rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The managed rule is periodically triggered.</p>
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

        public static ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList self = new ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
            this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
            return this;
        }
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationResultIdentifier(ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier) {
            this.evaluationResultIdentifier = evaluationResultIdentifier;
            return this;
        }
        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setInvokingEventMessageType(String invokingEventMessageType) {
            this.invokingEventMessageType = invokingEventMessageType;
            return this;
        }
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRemediationEnabled(Boolean remediationEnabled) {
            this.remediationEnabled = remediationEnabled;
            return this;
        }
        public Boolean getRemediationEnabled() {
            return this.remediationEnabled;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setResultRecordedTimestamp(Long resultRecordedTimestamp) {
            this.resultRecordedTimestamp = resultRecordedTimestamp;
            return this;
        }
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>The details of the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

        /**
         * <p>The maximum number of entries returned on each page.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that was used to initiate the next request.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults self = new ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults setEvaluationResultList(java.util.List<ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList) {
            this.evaluationResultList = evaluationResultList;
            return this;
        }
        public java.util.List<ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
