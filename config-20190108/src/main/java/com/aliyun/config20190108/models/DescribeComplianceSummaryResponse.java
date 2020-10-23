// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ComplianceSummary")
    @Validation(required = true)
    public DescribeComplianceSummaryResponseComplianceSummary complianceSummary;

    public static DescribeComplianceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceSummaryResponse self = new DescribeComplianceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComplianceSummaryResponse setComplianceSummary(DescribeComplianceSummaryResponseComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
        return this;
    }
    public DescribeComplianceSummaryResponseComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    public static class DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule extends TeaModel {
        @NameInMap("ComplianceSummaryTimestamp")
        @Validation(required = true)
        public Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        @Validation(required = true)
        public Integer compliantCount;

        @NameInMap("NonCompliantCount")
        @Validation(required = true)
        public Integer nonCompliantCount;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        public static DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule self = new DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource extends TeaModel {
        @NameInMap("ComplianceSummaryTimestamp")
        @Validation(required = true)
        public Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        @Validation(required = true)
        public Integer compliantCount;

        @NameInMap("NonCompliantCount")
        @Validation(required = true)
        public Integer nonCompliantCount;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        public static DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource self = new DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
            this.complianceSummaryTimestamp = complianceSummaryTimestamp;
            return this;
        }
        public Long getComplianceSummaryTimestamp() {
            return this.complianceSummaryTimestamp;
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeComplianceSummaryResponseComplianceSummary extends TeaModel {
        @NameInMap("ComplianceSummaryByConfigRule")
        @Validation(required = true)
        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

        @NameInMap("ComplianceSummaryByResource")
        @Validation(required = true)
        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource complianceSummaryByResource;

        public static DescribeComplianceSummaryResponseComplianceSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeComplianceSummaryResponseComplianceSummary self = new DescribeComplianceSummaryResponseComplianceSummary();
            return TeaModel.build(map, self);
        }

        public DescribeComplianceSummaryResponseComplianceSummary setComplianceSummaryByConfigRule(DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
            this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
            return this;
        }
        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByConfigRule getComplianceSummaryByConfigRule() {
            return this.complianceSummaryByConfigRule;
        }

        public DescribeComplianceSummaryResponseComplianceSummary setComplianceSummaryByResource(DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource complianceSummaryByResource) {
            this.complianceSummaryByResource = complianceSummaryByResource;
            return this;
        }
        public DescribeComplianceSummaryResponseComplianceSummaryComplianceSummaryByResource getComplianceSummaryByResource() {
            return this.complianceSummaryByResource;
        }

    }

}
