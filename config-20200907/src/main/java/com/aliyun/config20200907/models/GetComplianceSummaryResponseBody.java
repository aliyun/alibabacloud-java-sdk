// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetComplianceSummaryResponseBody extends TeaModel {
    @NameInMap("ComplianceSummary")
    public GetComplianceSummaryResponseBodyComplianceSummary complianceSummary;

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
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

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
        @NameInMap("ComplianceSummaryTimestamp")
        public Long complianceSummaryTimestamp;

        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

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
        @NameInMap("ComplianceSummaryByConfigRule")
        public GetComplianceSummaryResponseBodyComplianceSummaryComplianceSummaryByConfigRule complianceSummaryByConfigRule;

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
