// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The compliance results of the resources in the compliance package.</p>
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
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The total number of compliant resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        /**
         * <p>The total number of ignored resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoredCount")
        public Integer ignoredCount;

        /**
         * <p>The total number of resources for which the evaluation data is insufficient.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InsufficientDataCount")
        public Integer insufficientDataCount;

        /**
         * <p>The number of non-compliant resources.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        /**
         * <p>The total number of resources that are not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NotApplicableCount")
        public Integer notApplicableCount;

        /**
         * <p>The total number of resources evaluated by the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setIgnoredCount(Integer ignoredCount) {
            this.ignoredCount = ignoredCount;
            return this;
        }
        public Integer getIgnoredCount() {
            return this.ignoredCount;
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setInsufficientDataCount(Integer insufficientDataCount) {
            this.insufficientDataCount = insufficientDataCount;
            return this;
        }
        public Integer getInsufficientDataCount() {
            return this.insufficientDataCount;
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateResourceComplianceByPackResponseBodyResourceComplianceResult setNotApplicableCount(Integer notApplicableCount) {
            this.notApplicableCount = notApplicableCount;
            return this;
        }
        public Integer getNotApplicableCount() {
            return this.notApplicableCount;
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
