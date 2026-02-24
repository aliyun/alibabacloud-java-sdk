// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourceEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The resource evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public ListResourceEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25C89DDB-BB79-487D-88C3-4A561F21EFC4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListResourceEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceEvaluationResultsResponseBody self = new ListResourceEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceEvaluationResultsResponseBody setEvaluationResults(ListResourceEvaluationResultsResponseBodyEvaluationResults evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public ListResourceEvaluationResultsResponseBodyEvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    public ListResourceEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier extends TeaModel {
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
         * <p>The date when the ignored evaluation result is automatically resumed.</p>
         * <blockquote>
         * <p>If this parameter is empty, the evaluation result is not automatically resumed. You must manually resume the result.</p>
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
         * <p>Alice</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::RAM::User</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier build(java.util.Map<String, ?> map) throws Exception {
            ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier self = new ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier();
            return TeaModel.build(map, self);
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setIgnoreDate(String ignoreDate) {
            this.ignoreDate = ignoreDate;
            return this;
        }
        public String getIgnoreDate() {
            return this.ignoreDate;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier extends TeaModel {
        /**
         * <p>The resource information in the evaluation result.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp that is displayed on the timeline. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227157</p>
         */
        @NameInMap("OrderingTimestamp")
        public Long orderingTimestamp;

        public static ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier build(java.util.Map<String, ?> map) throws Exception {
            ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier self = new ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier();
            return TeaModel.build(map, self);
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setEvaluationResultQualifier(ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier) {
            this.evaluationResultQualifier = evaluationResultQualifier;
            return this;
        }
        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setOrderingTimestamp(Long orderingTimestamp) {
            this.orderingTimestamp = orderingTimestamp;
            return this;
        }
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

    }

    public static class ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList extends TeaModel {
        /**
         * <p>Additional information about the non-compliant resource. The value of this parameter can contain the following information:</p>
         * <ul>
         * <li><p><code>configuration</code>: The current configuration of the resource, which is the non-compliant configuration.</p>
         * </li>
         * <li><p><code>desiredValue</code>: The expected configuration of the resource, which is the compliant configuration.</p>
         * </li>
         * <li><p><code>operator</code>: The comparison operator that is used to compare the current configuration with the expected configuration.</p>
         * </li>
         * <li><p><code>property</code>: The JSON path of the current configuration in the resource property struct.</p>
         * </li>
         * <li><p><code>reason</code>: The reason why the resource is non-compliant.</p>
         * </li>
         * </ul>
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
         * <li><p>INSUFFICIENT_DATA: The data is insufficient.</p>
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
         * <p>The timestamp when the rule was triggered for evaluation. Unit: milliseconds.</p>
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
        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <ul>
         * <li><p>ConfigurationItemChangeNotification: The rule is triggered by a configuration change.</p>
         * </li>
         * <li><p>ScheduledNotification: The rule is triggered periodically.</p>
         * </li>
         * <li><p>Manual: The rule is triggered manually.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ScheduledNotification</p>
         */
        @NameInMap("InvokingEventMessageType")
        public String invokingEventMessageType;

        /**
         * <p>The start time of the last non-compliance.</p>
         * 
         * <strong>example:</strong>
         * <p>1744696393000</p>
         */
        @NameInMap("LastNonCompliantRecordTimestamp")
        public Long lastNonCompliantRecordTimestamp;

        /**
         * <p>Indicates whether the remediation setting is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: The remediation setting is enabled.</p>
         * </li>
         * <li><p>false: The remediation setting is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RemediationEnabled")
        public Boolean remediationEnabled;

        /**
         * <p>The timestamp when the resource evaluation result was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624932227595</p>
         */
        @NameInMap("ResultRecordedTimestamp")
        public Long resultRecordedTimestamp;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><p>1: high risk.</p>
         * </li>
         * <li><p>2: medium risk.</p>
         * </li>
         * <li><p>3: low risk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList self = new ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList();
            return TeaModel.build(map, self);
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
            this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
            return this;
        }
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationId(String evaluationId) {
            this.evaluationId = evaluationId;
            return this;
        }
        public String getEvaluationId() {
            return this.evaluationId;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationResultIdentifier(ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier) {
            this.evaluationResultIdentifier = evaluationResultIdentifier;
            return this;
        }
        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setInvokingEventMessageType(String invokingEventMessageType) {
            this.invokingEventMessageType = invokingEventMessageType;
            return this;
        }
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setLastNonCompliantRecordTimestamp(Long lastNonCompliantRecordTimestamp) {
            this.lastNonCompliantRecordTimestamp = lastNonCompliantRecordTimestamp;
            return this;
        }
        public Long getLastNonCompliantRecordTimestamp() {
            return this.lastNonCompliantRecordTimestamp;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRemediationEnabled(Boolean remediationEnabled) {
            this.remediationEnabled = remediationEnabled;
            return this;
        }
        public Boolean getRemediationEnabled() {
            return this.remediationEnabled;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setResultRecordedTimestamp(Long resultRecordedTimestamp) {
            this.resultRecordedTimestamp = resultRecordedTimestamp;
            return this;
        }
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class ListResourceEvaluationResultsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>The list of resource evaluation results.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

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

        public static ListResourceEvaluationResultsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            ListResourceEvaluationResultsResponseBodyEvaluationResults self = new ListResourceEvaluationResultsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResults setEvaluationResultList(java.util.List<ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList) {
            this.evaluationResultList = evaluationResultList;
            return this;
        }
        public java.util.List<ListResourceEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResults setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListResourceEvaluationResultsResponseBodyEvaluationResults setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
