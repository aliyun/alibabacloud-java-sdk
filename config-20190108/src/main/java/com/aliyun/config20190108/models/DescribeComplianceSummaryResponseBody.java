// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ComplianceSummary")
    public DescribeComplianceSummaryResponseBodyComplianceSummary complianceSummary;

    public static DescribeComplianceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceSummaryResponseBody self = new DescribeComplianceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComplianceSummaryResponseBody setComplianceSummary(DescribeComplianceSummaryResponseBodyComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
        return this;
    }
    public DescribeComplianceSummaryResponseBodyComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    public static class DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule extends TeaModel {
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

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

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

    }

    public static class DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource extends TeaModel {
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

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

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByResource setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

    }

    public static class DescribeComplianceSummaryResponseBodyComplianceSummary extends TeaModel {
        @NameInMap("ComplianceSummaryByConfigRule")
        public DescribeComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

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
