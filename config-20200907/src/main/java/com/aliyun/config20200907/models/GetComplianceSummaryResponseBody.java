// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetComplianceSummaryResponseBody extends TeaModel {
    /**
     * <p>The summary of compliance statistics.</p>
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
         * <p>The time when the compliance summary was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589853712165</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of rules evaluated as compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of rules evaluated as non-compliant.</p>
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
         * <p>The time when the compliance summary was generated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1589853712165</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of resources evaluated as compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("HighRiskRuleNonCompliantResourceCount")
        public Integer highRiskRuleNonCompliantResourceCount;

        @NameInMap("LowRiskRuleNonCompliantResourceCount")
        public Integer lowRiskRuleNonCompliantResourceCount;

        @NameInMap("MediumRiskRuleNonCompliantResourceCount")
        public Integer mediumRiskRuleNonCompliantResourceCount;

        /**
         * <p>The number of resources evaluated as non-compliant.</p>
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
         * <p>The summary of compliance statistics from the rule dimension.</p>
         */
        @NameInMap("ComplianceSummaryByConfigRule")
        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        /**
         * <p>The summary of compliance statistics from the resource dimension.</p>
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
