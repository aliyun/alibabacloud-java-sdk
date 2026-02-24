// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The rule evaluation results.</p>
     */
    @NameInMap("EvaluationResults")
    public ListConfigRuleEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A4A33BD-8186-4D60-91B9-42174EED75B5</p>
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
         * 
         * <strong>example:</strong>
         * <p>cp-bcc33457e0d900d5****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::120886317861****:rule/cr-cac56457e0d900d3****</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-cac56457e0d900d3****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS实例CPU核数满足最低要求</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The date when the ignored evaluation result is automatically resumed.</p>
         * <blockquote>
         * <p>If this parameter is empty, the result is not automatically resumed. You must manually resume it.</p>
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
         * <p>rg-aek3tprgnnc****</p>
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
         * <p>i-hp3e4kvhzqn2s11t****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>iZuf6j91r34rnwawoox****</p>
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
        public Long resourceOwnerId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
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

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * <p>The resource information in the rule evaluation result.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The UNIX timestamp displayed on the timeline. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1622802307081</p>
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
         * <p>The supplementary information about the non-compliant resource. This may include the following information:</p>
         * <ul>
         * <li><p><code>configuration</code>: The current configuration of the resource, which is the non-compliant configuration.</p>
         * </li>
         * <li><p><code>desiredValue</code>: The expected configuration of the resource, which is the compliant configuration.</p>
         * </li>
         * <li><p><code>operator</code>: The comparison operator used to compare the current configuration with the expected configuration.</p>
         * </li>
         * <li><p><code>property</code>: The JSON path of the current configuration in the resource property struct.</p>
         * </li>
         * <li><p><code>reason</code>: The reason why the resource is non-compliant.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;configuration\&quot;:\&quot;\&quot;,\&quot;desiredValue\&quot;:\&quot;\&quot;,\&quot;operator\&quot;:\&quot;IsNotStringEmpty\&quot;,\&quot;property\&quot;:\&quot;$.KeyPairName\&quot;,\&quot;reason\&quot;:\&quot;No property contains.\&quot;}</p>
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
         * <p>The UNIX timestamp when the rule was triggered for evaluation. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1622802307081</p>
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
         * <p>The identifier of the rule evaluation result.</p>
         */
        @NameInMap("EvaluationResultIdentifier")
        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

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
         * <p>ConfigurationItemChangeNotification</p>
         */
        @NameInMap("InvokingEventMessageType")
        public String invokingEventMessageType;

        /**
         * <p>The time when the resource was last remediated to a compliant state. This value is not recorded when a new resource or rule is evaluated as compliant for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>1768788515723</p>
         */
        @NameInMap("LastCompliantFixedTimestamp")
        public Long lastCompliantFixedTimestamp;

        /**
         * <p>The start time of the last non-compliance.</p>
         * 
         * <strong>example:</strong>
         * <p>1744696665000</p>
         */
        @NameInMap("LastNonCompliantRecordTimestamp")
        public Long lastNonCompliantRecordTimestamp;

        /**
         * <p>Indicates whether the remediation setting is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: The remediation setting is enabled.</p>
         * </li>
         * <li><p>false: The remediation setting is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemediationEnabled")
        public Boolean remediationEnabled;

        /**
         * <p>The UNIX timestamp when the resource evaluation result was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1622802307150</p>
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

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationId(String evaluationId) {
            this.evaluationId = evaluationId;
            return this;
        }
        public String getEvaluationId() {
            return this.evaluationId;
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

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setLastCompliantFixedTimestamp(Long lastCompliantFixedTimestamp) {
            this.lastCompliantFixedTimestamp = lastCompliantFixedTimestamp;
            return this;
        }
        public Long getLastCompliantFixedTimestamp() {
            return this.lastCompliantFixedTimestamp;
        }

        public ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setLastNonCompliantRecordTimestamp(Long lastNonCompliantRecordTimestamp) {
            this.lastNonCompliantRecordTimestamp = lastNonCompliantRecordTimestamp;
            return this;
        }
        public Long getLastNonCompliantRecordTimestamp() {
            return this.lastNonCompliantRecordTimestamp;
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
         * <p>The list of rule evaluation results.</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<ListConfigRuleEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
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
