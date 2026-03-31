// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByPackResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The compliance evaluation results returned.</p>
     */
    @NameInMap("ResourceComplianceResult")
    public GetResourceComplianceByPackResponseBodyResourceComplianceResult resourceComplianceResult;

    public static GetResourceComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByPackResponseBody self = new GetResourceComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceComplianceByPackResponseBody setResourceComplianceResult(GetResourceComplianceByPackResponseBodyResourceComplianceResult resourceComplianceResult) {
        this.resourceComplianceResult = resourceComplianceResult;
        return this;
    }
    public GetResourceComplianceByPackResponseBodyResourceComplianceResult getResourceComplianceResult() {
        return this.resourceComplianceResult;
    }

    public static class GetResourceComplianceByPackResponseBodyResourceComplianceResult extends TeaModel {
        /**
         * <p>The ID of the compliance package.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af0087****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("IgnoredCount")
        public Integer ignoredCount;

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

        @NameInMap("NotApplicableCount")
        public Integer notApplicableCount;

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetResourceComplianceByPackResponseBodyResourceComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceByPackResponseBodyResourceComplianceResult self = new GetResourceComplianceByPackResponseBodyResourceComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setIgnoredCount(Integer ignoredCount) {
            this.ignoredCount = ignoredCount;
            return this;
        }
        public Integer getIgnoredCount() {
            return this.ignoredCount;
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setInsufficientDataCount(Integer insufficientDataCount) {
            this.insufficientDataCount = insufficientDataCount;
            return this;
        }
        public Integer getInsufficientDataCount() {
            return this.insufficientDataCount;
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setNotApplicableCount(Integer notApplicableCount) {
            this.notApplicableCount = notApplicableCount;
            return this;
        }
        public Integer getNotApplicableCount() {
            return this.notApplicableCount;
        }

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
