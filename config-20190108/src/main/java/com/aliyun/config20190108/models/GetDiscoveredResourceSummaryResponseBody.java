// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceSummaryResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceSummary")
    public GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary discoveredResourceSummary;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDiscoveredResourceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceSummaryResponseBody self = new GetDiscoveredResourceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceSummaryResponseBody setDiscoveredResourceSummary(GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary discoveredResourceSummary) {
        this.discoveredResourceSummary = discoveredResourceSummary;
        return this;
    }
    public GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary getDiscoveredResourceSummary() {
        return this.discoveredResourceSummary;
    }

    public GetDiscoveredResourceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary extends TeaModel {
        @NameInMap("RegionCount")
        public Integer regionCount;

        @NameInMap("ResourceCount")
        public Integer resourceCount;

        @NameInMap("ResourceTypeCount")
        public Integer resourceTypeCount;

        public static GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary self = new GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary setRegionCount(Integer regionCount) {
            this.regionCount = regionCount;
            return this;
        }
        public Integer getRegionCount() {
            return this.regionCount;
        }

        public GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary setResourceTypeCount(Integer resourceTypeCount) {
            this.resourceTypeCount = resourceTypeCount;
            return this;
        }
        public Integer getResourceTypeCount() {
            return this.resourceTypeCount;
        }

    }

}
