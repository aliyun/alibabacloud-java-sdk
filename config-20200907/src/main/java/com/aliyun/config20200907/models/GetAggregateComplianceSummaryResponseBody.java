// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateComplianceSummaryResponseBody extends TeaModel {
    /**
     * <p>The compliance summary.</p>
     */
    @NameInMap("ComplianceSummary")
    public GetAggregateComplianceSummaryResponseBodyComplianceSummary complianceSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>929B8360-BD57-54FF-96DB-AD1D9B476769</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateComplianceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateComplianceSummaryResponseBody self = new GetAggregateComplianceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateComplianceSummaryResponseBody setComplianceSummary(GetAggregateComplianceSummaryResponseBodyComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
        return this;
    }
    public GetAggregateComplianceSummaryResponseBodyComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    public GetAggregateComplianceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule extends TeaModel {
        /**
         * <p>The timestamp of the compliance summary. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589853822103</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of compliant rules.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of non-compliant rules.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule self = new GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule();
            return TeaModel.build(map, self);
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource extends TeaModel {
        /**
         * <p>The timestamp of the compliance summary. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589853822103</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of compliant resources.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of non-compliant resources detected by high-risk rules. Note: This value is not deduplicated by resource. If a resource is evaluated as non-compliant by two different rules, it is counted twice.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HighRiskRuleNonCompliantResourceCount")
        public Integer highRiskRuleNonCompliantResourceCount;

        /**
         * <p>The number of non-compliant resources detected by low-risk rules. Note: This value is not deduplicated by resource. If a resource is evaluated as non-compliant by two different rules, it is counted twice.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LowRiskRuleNonCompliantResourceCount")
        public Integer lowRiskRuleNonCompliantResourceCount;

        /**
         * <p>The number of non-compliant resources detected by medium-risk rules. Note: This value is not deduplicated by resource. If a resource is evaluated as non-compliant by two different rules, it is counted twice.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("MediumRiskRuleNonCompliantResourceCount")
        public Integer mediumRiskRuleNonCompliantResourceCount;

        /**
         * <p>The number of non-compliant resources.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource self = new GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource();
            return TeaModel.build(map, self);
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setHighRiskRuleNonCompliantResourceCount(Integer highRiskRuleNonCompliantResourceCount) {
            this.highRiskRuleNonCompliantResourceCount = highRiskRuleNonCompliantResourceCount;
            return this;
        }
        public Integer getHighRiskRuleNonCompliantResourceCount() {
            return this.highRiskRuleNonCompliantResourceCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setLowRiskRuleNonCompliantResourceCount(Integer lowRiskRuleNonCompliantResourceCount) {
            this.lowRiskRuleNonCompliantResourceCount = lowRiskRuleNonCompliantResourceCount;
            return this;
        }
        public Integer getLowRiskRuleNonCompliantResourceCount() {
            return this.lowRiskRuleNonCompliantResourceCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setMediumRiskRuleNonCompliantResourceCount(Integer mediumRiskRuleNonCompliantResourceCount) {
            this.mediumRiskRuleNonCompliantResourceCount = mediumRiskRuleNonCompliantResourceCount;
            return this;
        }
        public Integer getMediumRiskRuleNonCompliantResourceCount() {
            return this.mediumRiskRuleNonCompliantResourceCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetAggregateComplianceSummaryResponseBodyComplianceSummary extends TeaModel {
        /**
         * <p>The compliance summary by rule.</p>
         */
        @NameInMap("ComplianceSummaryByConfigRule")
        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        /**
         * <p>The compliance summary by resource.</p>
         */
        @NameInMap("ComplianceSummaryByResource")
        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource complianceSummaryByResource;

        public static GetAggregateComplianceSummaryResponseBodyComplianceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateComplianceSummaryResponseBodyComplianceSummary self = new GetAggregateComplianceSummaryResponseBodyComplianceSummary();
            return TeaModel.build(map, self);
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummary setComplianceSummaryByConfigRule(GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
            this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
            return this;
        }
        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule getComplianceSummaryByConfigRule() {
            return this.complianceSummaryByConfigRule;
        }

        public GetAggregateComplianceSummaryResponseBodyComplianceSummary setComplianceSummaryByResource(GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource complianceSummaryByResource) {
            this.complianceSummaryByResource = complianceSummaryByResource;
            return this;
        }
        public GetAggregateComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource getComplianceSummaryByResource() {
            return this.complianceSummaryByResource;
        }

    }

}
