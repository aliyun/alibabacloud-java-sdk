// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DiscoveredResourceCountsSummary")
    public java.util.List<GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    public static GetAggregateResourceCountsGroupByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByRegionResponseBody self = new GetAggregateResourceCountsGroupByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggregateResourceCountsGroupByRegionResponseBody setDiscoveredResourceCountsSummary(java.util.List<GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
        this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
        return this;
    }
    public java.util.List<GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    public static class GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary extends TeaModel {
        @NameInMap("ResourceCount")
        public Long resourceCount;

        @NameInMap("Region")
        public String region;

        public static GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary self = new GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
