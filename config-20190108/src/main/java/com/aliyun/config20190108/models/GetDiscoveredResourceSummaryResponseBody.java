// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceSummaryResponseBody extends TeaModel {
    /**
     * <p>The statistics of the resources monitored by Cloud Config.</p>
     */
    @NameInMap("DiscoveredResourceSummary")
    public GetDiscoveredResourceSummaryResponseBodyDiscoveredResourceSummary discoveredResourceSummary;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The number of the regions involved in the monitoring.</p>
         */
        @NameInMap("RegionCount")
        public Integer regionCount;

        /**
         * <p>The number of the resources monitored by Cloud Config.</p>
         */
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        /**
         * <p>The number of the resource types monitored by Cloud Config.</p>
         */
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
