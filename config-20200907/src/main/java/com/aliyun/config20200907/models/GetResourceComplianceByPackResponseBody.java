// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceByPackResponseBody extends TeaModel {
    @NameInMap("ResourceComplianceResult")
    public GetResourceComplianceByPackResponseBodyResourceComplianceResult resourceComplianceResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceByPackResponseBody self = new GetResourceComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceByPackResponseBody setResourceComplianceResult(GetResourceComplianceByPackResponseBodyResourceComplianceResult resourceComplianceResult) {
        this.resourceComplianceResult = resourceComplianceResult;
        return this;
    }
    public GetResourceComplianceByPackResponseBodyResourceComplianceResult getResourceComplianceResult() {
        return this.resourceComplianceResult;
    }

    public GetResourceComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceComplianceByPackResponseBodyResourceComplianceResult extends TeaModel {
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

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

        public GetResourceComplianceByPackResponseBodyResourceComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
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
