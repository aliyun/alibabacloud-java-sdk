// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The collection of evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A6662516-D056-4325-B6A7-CD3E89C97C39</p>
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
         * 
         * <strong>example:</strong>
         * <p>cr-7263fd26622af00bc****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::100931896542****:rule/cr-888f626622af00ae****</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-888f626622af00ae****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS存储空间开启同城冗余存储</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The date when the ignored evaluation result is automatically restored.</p>
         * <blockquote>
         * <p>If this parameter is empty, the result is not automatically restored. You must manually restore it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-06-01</p>
         */
        @NameInMap("IgnoreDate")
        public String ignoreDate;

        /**
         * <p>The ID of the region to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the resource belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm26cicib****</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Bucket-test</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>Bucket-test</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>173808452267****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::OSS::Bucket</p>
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

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * <p>The information about the resource that is evaluated.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp that is displayed on the timeline. Unit: milliseconds.</p>
         * <blockquote>
         * <p>This is the timestamp when the rule was triggered to evaluate the resource. It is the same as the value of the <code>ConfigRuleInvokedTimestamp</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1624869012713</p>
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
         * <p>The annotation of the non-compliant resource. The annotation may include the following information:</p>
         * <ul>
         * <li><p><code>configuration</code>: the current configuration of the resource, which is the non-compliant configuration.</p>
         * </li>
         * <li><p><code>desiredValue</code>: the expected configuration of the resource, which is the compliant configuration.</p>
         * </li>
         * <li><p><code>operator</code>: the comparison operator that is used to compare the current configuration with the expected configuration.</p>
         * </li>
         * <li><p><code>property</code>: the JSON path of the current configuration in the resource property struct.</p>
         * </li>
         * <li><p><code>reason</code>: the reason why the resource is non-compliant.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;configuration\&quot;:\&quot;LRS\&quot;,\&quot;desiredValue\&quot;:\&quot;ZRS\&quot;,\&quot;operator\&quot;:\&quot;StringEquals\&quot;,\&quot;property\&quot;:\&quot;$.DataRedundancyType\&quot;}</p>
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
         * <li><p>INSUFFICIENT_DATA: No data is available.</p>
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
         * <p>The timestamp when the rule was triggered to evaluate the resource. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624869012713</p>
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
         * <p>The identifier of the evaluation result.</p>
         */
        @NameInMap("EvaluationResultIdentifier")
        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

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
         * <p>The timestamp when the resource was last remediated to a compliant state. This parameter is not returned if a new resource or rule is evaluated as compliant for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>1768788515723</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("LastCompliantFixedTimestamp")
        public Long lastCompliantFixedTimestamp;

        /**
         * <p>The timestamp when the resource last became non-compliant.</p>
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
         * <p>false</p>
         */
        @NameInMap("RemediationEnabled")
        public Boolean remediationEnabled;

        /**
         * <p>The timestamp when the evaluation result was recorded. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1624869013065</p>
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

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationId(String evaluationId) {
            this.evaluationId = evaluationId;
            return this;
        }
        public String getEvaluationId() {
            return this.evaluationId;
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

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setLastCompliantFixedTimestamp(Long lastCompliantFixedTimestamp) {
            this.lastCompliantFixedTimestamp = lastCompliantFixedTimestamp;
            return this;
        }
        public Long getLastCompliantFixedTimestamp() {
            return this.lastCompliantFixedTimestamp;
        }

        public ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setLastNonCompliantRecordTimestamp(Long lastNonCompliantRecordTimestamp) {
            this.lastNonCompliantRecordTimestamp = lastNonCompliantRecordTimestamp;
            return this;
        }
        public Long getLastNonCompliantRecordTimestamp() {
            return this.lastNonCompliantRecordTimestamp;
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
         * <p>A list of evaluation results.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListAggregateConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
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
