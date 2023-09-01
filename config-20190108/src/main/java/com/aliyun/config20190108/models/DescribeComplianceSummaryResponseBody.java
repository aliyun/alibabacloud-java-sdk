// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceSummaryResponseBody extends TeaModel {
    /**
     * <p>The summary of compliance evaluations.</p>
     */
    @NameInMap("ComplianceSummary")
    public DescribeComplianceSummaryResponseBodyComplianceSummary complianceSummary;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComplianceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceSummaryResponseBody self = new DescribeComplianceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceSummaryResponseBody setComplianceSummary(DescribeComplianceSummaryResponseBodyComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
        return this;
    }
    public DescribeComplianceSummaryResponseBodyComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    public DescribeComplianceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule extends TeaModel {
        /**
         * <p>The timestamp when the summary was recorded.</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of rules whose evaluation results are compliant.</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of rules whose evaluation results are non-compliant.</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of rules.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule self = new DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource extends TeaModel {
        /**
         * <p>The timestamp when the summary was recorded.</p>
         */
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        /**
         * <p>The number of resources evaluated as compliant.</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The number of resources evaluated as non-compliant.</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of resources.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource self = new DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeComplianceSummaryResponseBodyComplianceSummary extends TeaModel {
        /**
         * <p>The summary of compliance evaluations from the rule dimension.</p>
         */
        @NameInMap("ComplianceSummaryByConfigRule")
        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        /**
         * <p>The summary of compliance evaluations from the resource dimension.</p>
         */
        @NameInMap("ComplianceSummaryByResource")
        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource complianceSummaryByResource;

        public static DescribeComplianceSummaryResponseBodyComplianceSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceSummaryResponseBodyComplianceSummary self = new DescribeComplianceSummaryResponseBodyComplianceSummary();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummary setComplianceSummaryByConfigRule(DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
            this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
            return this;
        }
        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule getComplianceSummaryByConfigRule() {
            return this.complianceSummaryByConfigRule;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummary setComplianceSummaryByResource(DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource complianceSummaryByResource) {
            this.complianceSummaryByResource = complianceSummaryByResource;
            return this;
        }
        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource getComplianceSummaryByResource() {
            return this.complianceSummaryByResource;
        }

    }

}
