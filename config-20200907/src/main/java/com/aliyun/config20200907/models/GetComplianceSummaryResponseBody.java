// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetComplianceSummaryResponseBody extends TeaModel {
    /**
     * <p>The compliance summary.</p>
     */
    @NameInMap("ComplianceSummary")
    public GetComplianceSummaryResponseBodyComplianceSummary complianceSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CAEE6F34-DEDC-4BAA-AA8C-946D5D008737</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetComplianceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComplianceSummaryResponseBody self = new GetComplianceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComplianceSummaryResponseBody setComplianceSummary(GetComplianceSummaryResponseBodyComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
        return this;
    }
    public GetComplianceSummaryResponseBodyComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    public GetComplianceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule extends TeaModel {
        /**
         * <p>The timestamp when the compliance summary was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589853712165</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of compliant rules.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of non-compliant rules.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule build(java.util.Map<String, ?> map) throws Exception {
            GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule self = new GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule();
            return TeaModel.build(map, self);
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource extends TeaModel {
        /**
         * <p>The timestamp when the compliance summary was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589853712165</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of compliant resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of non-compliant resources detected by high-risk rules.</p>
         * <blockquote>
         * <p>Note: This value can be greater than the total number of resources in your account. Resources are counted based on each rule. For example, if a resource is evaluated as non-compliant by two rules, the value of this parameter increases by 2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HighRiskRuleNonCompliantResourceCount")
        public Integer highRiskRuleNonCompliantResourceCount;

        /**
         * <p>The number of non-compliant resources detected by low-risk rules.</p>
         * <blockquote>
         * <p>Note: This value can be greater than the total number of resources in your account. Resources are counted based on each rule. For example, if a resource is evaluated as non-compliant by two low-risk rules, the value of this parameter increases by 2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LowRiskRuleNonCompliantResourceCount")
        public Integer lowRiskRuleNonCompliantResourceCount;

        /**
         * <p>The number of non-compliant resources detected by medium-risk rules.</p>
         * <blockquote>
         * <p>Note: This value can be greater than the total number of resources in your account. Resources are counted based on each rule. For example, if a resource is evaluated as non-compliant by two rules, the value of this parameter increases by 2.</p>
         * </blockquote>
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
         * <p>12</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource build(java.util.Map<String, ?> map) throws Exception {
            GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource self = new GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource();
            return TeaModel.build(map, self);
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setHighRiskRuleNonCompliantResourceCount(Integer highRiskRuleNonCompliantResourceCount) {
            this.highRiskRuleNonCompliantResourceCount = highRiskRuleNonCompliantResourceCount;
            return this;
        }
        public Integer getHighRiskRuleNonCompliantResourceCount() {
            return this.highRiskRuleNonCompliantResourceCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setLowRiskRuleNonCompliantResourceCount(Integer lowRiskRuleNonCompliantResourceCount) {
            this.lowRiskRuleNonCompliantResourceCount = lowRiskRuleNonCompliantResourceCount;
            return this;
        }
        public Integer getLowRiskRuleNonCompliantResourceCount() {
            return this.lowRiskRuleNonCompliantResourceCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setMediumRiskRuleNonCompliantResourceCount(Integer mediumRiskRuleNonCompliantResourceCount) {
            this.mediumRiskRuleNonCompliantResourceCount = mediumRiskRuleNonCompliantResourceCount;
            return this;
        }
        public Integer getMediumRiskRuleNonCompliantResourceCount() {
            return this.mediumRiskRuleNonCompliantResourceCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetComplianceSummaryResponseBodyComplianceSummary extends TeaModel {
        /**
         * <p>The compliance summary by rule.</p>
         */
        @NameInMap("ComplianceSummaryByConfigRule")
        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        /**
         * <p>The compliance summary by resource.</p>
         */
        @NameInMap("ComplianceSummaryByResource")
        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource complianceSummaryByResource;

        public static GetComplianceSummaryResponseBodyComplianceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetComplianceSummaryResponseBodyComplianceSummary self = new GetComplianceSummaryResponseBodyComplianceSummary();
            return TeaModel.build(map, self);
        }

        public GetComplianceSummaryResponseBodyComplianceSummary setComplianceSummaryByConfigRule(GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
            this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
            return this;
        }
        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule getComplianceSummaryByConfigRule() {
            return this.complianceSummaryByConfigRule;
        }

        public GetComplianceSummaryResponseBodyComplianceSummary setComplianceSummaryByResource(GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource complianceSummaryByResource) {
            this.complianceSummaryByResource = complianceSummaryByResource;
            return this;
        }
        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource getComplianceSummaryByResource() {
            return this.complianceSummaryByResource;
        }

    }

}
