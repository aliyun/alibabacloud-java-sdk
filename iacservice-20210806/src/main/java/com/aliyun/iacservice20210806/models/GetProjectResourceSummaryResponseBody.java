// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectResourceSummaryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceSummary")
    public GetProjectResourceSummaryResponseBodyResourceSummary resourceSummary;

    public static GetProjectResourceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResourceSummaryResponseBody self = new GetProjectResourceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResourceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResourceSummaryResponseBody setResourceSummary(GetProjectResourceSummaryResponseBodyResourceSummary resourceSummary) {
        this.resourceSummary = resourceSummary;
        return this;
    }
    public GetProjectResourceSummaryResponseBodyResourceSummary getResourceSummary() {
        return this.resourceSummary;
    }

    public static class GetProjectResourceSummaryResponseBodyResourceSummaryDetail extends TeaModel {
        @NameInMap("resourceCnt")
        public Long resourceCnt;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("taskIds")
        public java.util.List<String> taskIds;

        public static GetProjectResourceSummaryResponseBodyResourceSummaryDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResourceSummaryResponseBodyResourceSummaryDetail self = new GetProjectResourceSummaryResponseBodyResourceSummaryDetail();
            return TeaModel.build(map, self);
        }

        public GetProjectResourceSummaryResponseBodyResourceSummaryDetail setResourceCnt(Long resourceCnt) {
            this.resourceCnt = resourceCnt;
            return this;
        }
        public Long getResourceCnt() {
            return this.resourceCnt;
        }

        public GetProjectResourceSummaryResponseBodyResourceSummaryDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetProjectResourceSummaryResponseBodyResourceSummaryDetail setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

    }

    public static class GetProjectResourceSummaryResponseBodyResourceSummary extends TeaModel {
        @NameInMap("detail")
        public java.util.List<GetProjectResourceSummaryResponseBodyResourceSummaryDetail> detail;

        @NameInMap("resourceCnt")
        public Long resourceCnt;

        @NameInMap("resourceTypeCnt")
        public Long resourceTypeCnt;

        public static GetProjectResourceSummaryResponseBodyResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResourceSummaryResponseBodyResourceSummary self = new GetProjectResourceSummaryResponseBodyResourceSummary();
            return TeaModel.build(map, self);
        }

        public GetProjectResourceSummaryResponseBodyResourceSummary setDetail(java.util.List<GetProjectResourceSummaryResponseBodyResourceSummaryDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetProjectResourceSummaryResponseBodyResourceSummaryDetail> getDetail() {
            return this.detail;
        }

        public GetProjectResourceSummaryResponseBodyResourceSummary setResourceCnt(Long resourceCnt) {
            this.resourceCnt = resourceCnt;
            return this;
        }
        public Long getResourceCnt() {
            return this.resourceCnt;
        }

        public GetProjectResourceSummaryResponseBodyResourceSummary setResourceTypeCnt(Long resourceTypeCnt) {
            this.resourceTypeCnt = resourceTypeCnt;
            return this;
        }
        public Long getResourceTypeCnt() {
            return this.resourceTypeCnt;
        }

    }

}
