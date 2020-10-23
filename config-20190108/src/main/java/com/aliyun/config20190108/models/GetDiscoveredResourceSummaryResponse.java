// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceSummaryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DiscoveredResourceSummary")
    @Validation(required = true)
    public GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary discoveredResourceSummary;

    public static GetDiscoveredResourceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceSummaryResponse self = new GetDiscoveredResourceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceSummaryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiscoveredResourceSummaryResponse setDiscoveredResourceSummary(GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary discoveredResourceSummary) {
        this.discoveredResourceSummary = discoveredResourceSummary;
        return this;
    }
    public GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary getDiscoveredResourceSummary() {
        return this.discoveredResourceSummary;
    }

    public static class GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary extends TeaModel {
        @NameInMap("ResourceCount")
        @Validation(required = true)
        public Integer resourceCount;

        @NameInMap("ResourceTypeCount")
        @Validation(required = true)
        public Integer resourceTypeCount;

        @NameInMap("RegionCount")
        @Validation(required = true)
        public Integer regionCount;

        public static GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary self = new GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary setResourceTypeCount(Integer resourceTypeCount) {
            this.resourceTypeCount = resourceTypeCount;
            return this;
        }
        public Integer getResourceTypeCount() {
            return this.resourceTypeCount;
        }

        public GetDiscoveredResourceSummaryResponseDiscoveredResourceSummary setRegionCount(Integer regionCount) {
            this.regionCount = regionCount;
            return this;
        }
        public Integer getRegionCount() {
            return this.regionCount;
        }

    }

}
