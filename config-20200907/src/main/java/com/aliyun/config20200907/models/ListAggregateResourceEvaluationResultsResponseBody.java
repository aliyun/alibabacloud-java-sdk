// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourceEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The evaluation results of the resources.</p>
     */
    @NameInMap("EvaluationResults")
    public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25C89DDB-BB79-487D-88C3-4A561F21EFC4</p>
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
         * <p>The ARN of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::100931896542****:rule/cr-7f7d626622af0041****</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

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
         * <p>ram-user-mfa-check</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The date on which the ignored evaluation result is automatically resumed.</p>
         * <blockquote>
         * <p>If this parameter is empty, the result is not automatically resumed. You must manually resume the result.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-06-01</p>
         */
        @NameInMap("IgnoreDate")
        public String ignoreDate;

        /**
         * <p>The ID of the region where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23642660635396****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>rd_member</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>120886317861****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Integer resourceOwnerId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
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

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceOwnerId(Integer resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Integer getResourceOwnerId() {
            return this.resourceOwnerId;
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
         * <p>The resource information in the evaluation result.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp displayed on the timeline. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227157</p>
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
         * <p>The supplementary information about the non-compliant resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;configuration\&quot;:\&quot;false\&quot;,\&quot;desiredValue\&quot;:\&quot;True\&quot;,\&quot;operator\&quot;:\&quot;StringEquals\&quot;,\&quot;property\&quot;:\&quot;$.LoginProfile.MFABindRequired\&quot;}</p>
         */
        @NameInMap("Annotation")
        public String annotation;

        /**
         * <p>The compliance evaluation result. Valid values:</p>
         * <ul>
         * <li><p>COMPLIANT: The resource is compliant.</p>
         * </li>
         * <li><p>NON_COMPLIANT: The resource is non-compliant.</p>
         * </li>
         * <li><p>NOT_APPLICABLE: The rule does not apply to the resource.</p>
         * </li>
         * <li><p>INSUFFICIENT_DATA: No data is available for the resource.</p>
         * </li>
         * <li><p>IGNORED: The evaluation result is ignored.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NON_COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The timestamp when the rule was invoked to evaluate the resource. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227157</p>
         */
        @NameInMap("ConfigRuleInvokedTimestamp")
        public Long configRuleInvokedTimestamp;

        /**
         * <p>The unique ID of the evaluation result.</p>
         * 
         * <strong>example:</strong>
         * <p>00000089-4e0d-58b5-a96a-8e54112110f3</p>
         */
        @NameInMap("EvaluationId")
        public String evaluationId;

        /**
         * <p>The identifier of the resource evaluation result.</p>
         */
        @NameInMap("EvaluationResultIdentifier")
        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <ul>
         * <li><p>ConfigurationItemChangeNotification: The rule is triggered by a configuration change.</p>
         * </li>
         * <li><p>ScheduledNotification: The rule is triggered periodically.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ScheduledNotification</p>
         */
        @NameInMap("InvokingEventMessageType")
        public String invokingEventMessageType;

        /**
         * <p>The timestamp when the resource last became non-compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>1744696665000</p>
         */
        @NameInMap("LastNonCompliantRecordTimestamp")
        public Long lastNonCompliantRecordTimestamp;

        /**
         * <p>Indicates whether remediation is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Remediation is enabled.</p>
         * </li>
         * <li><p>false: Remediation is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemediationEnabled")
        public Boolean remediationEnabled;

        /**
         * <p>The timestamp when the evaluation result was recorded. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227595</p>
         */
        @NameInMap("ResultRecordedTimestamp")
        public Long resultRecordedTimestamp;

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

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationId(String evaluationId) {
            this.evaluationId = evaluationId;
            return this;
        }
        public String getEvaluationId() {
            return this.evaluationId;
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

        public ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setLastNonCompliantRecordTimestamp(Long lastNonCompliantRecordTimestamp) {
            this.lastNonCompliantRecordTimestamp = lastNonCompliantRecordTimestamp;
            return this;
        }
        public Long getLastNonCompliantRecordTimestamp() {
            return this.lastNonCompliantRecordTimestamp;
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
         * <p>A list of resource evaluation results.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListAggregateResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
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
