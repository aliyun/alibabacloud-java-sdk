// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeEvaluationResultsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EvaluationResults")
    @Validation(required = true)
    public DescribeEvaluationResultsResponseEvaluationResults evaluationResults;

    public static DescribeEvaluationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluationResultsResponse self = new DescribeEvaluationResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluationResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluationResultsResponse setEvaluationResults(DescribeEvaluationResultsResponseEvaluationResults evaluationResults) {
        this.evaluationResults = evaluationResults;
        return this;
    }
    public DescribeEvaluationResultsResponseEvaluationResults getEvaluationResults() {
        return this.evaluationResults;
    }

    public static class DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier extends TeaModel {
        @NameInMap("ConfigRuleArn")
        @Validation(required = true)
        public String configRuleArn;

        @NameInMap("ConfigRuleId")
        @Validation(required = true)
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        @Validation(required = true)
        public String configRuleName;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier self = new DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier extends TeaModel {
        @NameInMap("OrderingTimestamp")
        @Validation(required = true)
        public Long orderingTimestamp;

        @NameInMap("EvaluationResultQualifier")
        @Validation(required = true)
        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier;

        public static DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier self = new DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier setOrderingTimestamp(Long orderingTimestamp) {
            this.orderingTimestamp = orderingTimestamp;
            return this;
        }
        public Long getOrderingTimestamp() {
            return this.orderingTimestamp;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier setEvaluationResultQualifier(DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier evaluationResultQualifier) {
            this.evaluationResultQualifier = evaluationResultQualifier;
            return this;
        }
        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifierEvaluationResultQualifier getEvaluationResultQualifier() {
            return this.evaluationResultQualifier;
        }

    }

    public static class DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList extends TeaModel {
        @NameInMap("Annotation")
        @Validation(required = true)
        public String annotation;

        @NameInMap("ComplianceType")
        @Validation(required = true)
        public String complianceType;

        @NameInMap("ConfigRuleInvokedTimestamp")
        @Validation(required = true)
        public Long configRuleInvokedTimestamp;

        @NameInMap("InvokingEventMessageType")
        @Validation(required = true)
        public String invokingEventMessageType;

        @NameInMap("ResultRecordedTimestamp")
        @Validation(required = true)
        public Long resultRecordedTimestamp;

        @NameInMap("RiskLevel")
        @Validation(required = true)
        public Integer riskLevel;

        @NameInMap("EvaluationResultIdentifier")
        @Validation(required = true)
        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier;

        public static DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList self = new DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setConfigRuleInvokedTimestamp(Long configRuleInvokedTimestamp) {
            this.configRuleInvokedTimestamp = configRuleInvokedTimestamp;
            return this;
        }
        public Long getConfigRuleInvokedTimestamp() {
            return this.configRuleInvokedTimestamp;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setInvokingEventMessageType(String invokingEventMessageType) {
            this.invokingEventMessageType = invokingEventMessageType;
            return this;
        }
        public String getInvokingEventMessageType() {
            return this.invokingEventMessageType;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setResultRecordedTimestamp(Long resultRecordedTimestamp) {
            this.resultRecordedTimestamp = resultRecordedTimestamp;
            return this;
        }
        public Long getResultRecordedTimestamp() {
            return this.resultRecordedTimestamp;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList setEvaluationResultIdentifier(DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier evaluationResultIdentifier) {
            this.evaluationResultIdentifier = evaluationResultIdentifier;
            return this;
        }
        public DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultListEvaluationResultIdentifier getEvaluationResultIdentifier() {
            return this.evaluationResultIdentifier;
        }

    }

    public static class DescribeEvaluationResultsResponseEvaluationResults extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("EvaluationResultList")
        @Validation(required = true)
        public java.util.List<DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList> evaluationResultList;

        public static DescribeEvaluationResultsResponseEvaluationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluationResultsResponseEvaluationResults self = new DescribeEvaluationResultsResponseEvaluationResults();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluationResultsResponseEvaluationResults setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeEvaluationResultsResponseEvaluationResults setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeEvaluationResultsResponseEvaluationResults setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeEvaluationResultsResponseEvaluationResults setEvaluationResultList(java.util.List<DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList> evaluationResultList) {
            this.evaluationResultList = evaluationResultList;
            return this;
        }
        public java.util.List<DescribeEvaluationResultsResponseEvaluationResultsEvaluationResultList> getEvaluationResultList() {
            return this.evaluationResultList;
        }

    }

}
