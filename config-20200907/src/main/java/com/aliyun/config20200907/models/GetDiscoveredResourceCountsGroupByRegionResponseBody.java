// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByRegionResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceCountsSummary")
    public java.util.List<GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDiscoveredResourceCountsGroupByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsGroupByRegionResponseBody self = new GetDiscoveredResourceCountsGroupByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsGroupByRegionResponseBody setDiscoveredResourceCountsSummary(java.util.List<GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
        this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
        return this;
    }
    public java.util.List<GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    public GetDiscoveredResourceCountsGroupByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceCount")
        public Long resourceCount;

        public static GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary self = new GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

    }

}
