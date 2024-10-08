// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the region by which statistics are collected.</p>
     */
    @NameInMap("DiscoveredResourceCountsSummary")
    public java.util.List<GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>399BD94C-D20C-4D27-88D4-89E8D75C0595</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateResourceCountsGroupByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByRegionResponseBody self = new GetAggregateResourceCountsGroupByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByRegionResponseBody setDiscoveredResourceCountsSummary(java.util.List<GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
        this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
        return this;
    }
    public java.util.List<GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    public GetAggregateResourceCountsGroupByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary extends TeaModel {
        /**
         * <p>The dimension by which statistics are collected.</p>
         * <blockquote>
         * <p> In most cases, the <code>Region</code> parameter is returned instead of the GroupName parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the region by which statistics are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The total number of resources in the region.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        public static GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary self = new GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAggregateResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

    }

}
