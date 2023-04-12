// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The compliance evaluation results of resources monitored by the compliance package.</p>
     */
    @NameInMap("ResourceComplianceResult")
    public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult resourceComplianceResult;

    public static GetAggregateResourceComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceByPackResponseBody self = new GetAggregateResourceComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggregateResourceComplianceByPackResponseBody setResourceComplianceResult(GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult resourceComplianceResult) {
        this.resourceComplianceResult = resourceComplianceResult;
        return this;
    }
    public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult getResourceComplianceResult() {
        return this.resourceComplianceResult;
    }

    public static class GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult extends TeaModel {
        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The number of non-compliant resources.</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of monitored resources.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult self = new GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
