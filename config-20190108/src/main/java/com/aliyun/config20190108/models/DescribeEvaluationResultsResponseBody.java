// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The information about the compliance evaluation results returned.</p>
     */
    @NameInMap("EvaluationResults")
    public DescribeEvaluationResultsResponseBodyEvaluationResults evaluationResults;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluationResultsResponseBody self = new DescribeEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluationResultsResponseBody setEvaluationResults(DescribeEvaluationResultsResponseBodyEvaluationResults evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public DescribeEvaluationResultsResponseBodyEvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    public DescribeEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier extends TeaModel {
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
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the evaluated resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the evaluated resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the evaluated resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier self = new DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier extends TeaModel {
        /**
         * <p>The information of the rule and the evaluated resource.</p>
         */
        @NameInMap("EvaluationResultQualifier")
        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        /**
         * <p>The timestamp that was generated when the compliance evaluation was performed.</p>
         */
        @NameInMap("OrderingTimestamp")
        public Long orderingTimestamp;

        public static DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier self = new DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setEvaluationResultQualifier(DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier) {
            this.evaluationResultQualifier = evaluationResultQualifier;
            return this;
        }
        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier setOrderingTimestamp(Long orderingTimestamp) {
            this.orderingTimestamp = orderingTimestamp;
            return this;
        }
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

    }

    public static class DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList extends TeaModel {
        /**
         * <p>The annotation to the resource that is evaluated to be non-compliant.</p>
         */
        @NameInMap("Annotation")
        public String annotation;

        /**
         * <p>The compliance evaluation result of the resource. Valid values:</p>
         * <br>
         * <p>*   COMPLIANT: The resource is evaluated to be compliant.</p>
         * <p>*   NON_COMPLIANT: The resource is evaluated to be non-compliant.</p>
         * <p>*   NOT_APPLICABLE: The rule does not apply to the resource.</p>
         * <p>*   INSUFFICIENT_DATA: The resource data is insufficient.</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The timestamp that was generated when the rule was triggered.</p>
         */
        @NameInMap("ConfigRuleInvokedTimestamp")
        public Long configRuleInvokedTimestamp;

        /**
         * <p>The identifier of the compliance evaluation result.</p>
         */
        @NameInMap("EvaluationResultIdentifier")
        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

        /**
         * <p>The trigger type of the rule. Valid values:</p>
         * <br>
         * <p>*   ConfigurationItemChangeNotification: The rule is triggered by configuration changes.</p>
         * <p>*   ScheduledNotification: The rule is triggered as scheduled.</p>
         */
        @NameInMap("InvokingEventMessageType")
        public String invokingEventMessageType;

        /**
         * <p>Specifies whether to enable the remediation template. Valid values:</p>
         * <br>
         * <p>* **true**</p>
         * <p>* **false**</p>
         */
        @NameInMap("RemediationEnabled")
        public Boolean remediationEnabled;

        /**
         * <p>The timestamp that was generated when the compliance evaluation result was recorded.</p>
         */
        @NameInMap("ResultRecordedTimestamp")
        public Long resultRecordedTimestamp;

        /**
         * <p>The risk level of the non-compliant resource. Valid values:</p>
         * <br>
         * <p>*   1: high risk</p>
         * <p>*   2: medium risk</p>
         * <p>*   3: low risk</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList self = new DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
            this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
            return this;
        }
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setEvaluationResultIdentifier(DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier) {
            this.evaluationResultIdentifier = evaluationResultIdentifier;
            return this;
        }
        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultListEvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setInvokingEventMessageType(String invokingEventMessageType) {
            this.invokingEventMessageType = invokingEventMessageType;
            return this;
        }
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRemediationEnabled(Boolean remediationEnabled) {
            this.remediationEnabled = remediationEnabled;
            return this;
        }
        public Boolean getRemediationEnabled() {
            return this.remediationEnabled;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setResultRecordedTimestamp(Long resultRecordedTimestamp) {
            this.resultRecordedTimestamp = resultRecordedTimestamp;
            return this;
        }
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeEvaluationResultsResponseBodyEvaluationResults extends TeaModel {
        /**
         * <p>Indicates whether remediation is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("EvaluationResultList")
        public java.util.List<DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList;

        /**
         * <p>The page number of the returned page. Pages start from page 1.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Valid values: 1 to 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of compliance evaluation results.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeEvaluationResultsResponseBodyEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseBodyEvaluationResults self = new DescribeEvaluationResultsResponseBodyEvaluationResults();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResults setEvaluationResultList(java.util.List<DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> evaluationResultList) {
            this.evaluationResultList = evaluationResultList;
            return this;
        }
        public java.util.List<DescribeEvaluationResultsResponseBodyEvaluationResultsEvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResults setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResults setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeEvaluationResultsResponseBodyEvaluationResults setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
