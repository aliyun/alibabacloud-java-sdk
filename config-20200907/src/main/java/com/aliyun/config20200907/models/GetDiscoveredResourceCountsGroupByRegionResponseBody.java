// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByRegionResponseBody extends TeaModel {
    /**
     * <p>The statistics on the resources.</p>
     */
    @NameInMap("DiscoveredResourceCountsSummary")
    public java.util.List<GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>399BD94C-D20C-4D27-88D4-89E8D75C0595</p>
     */
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
        /**
         * <p>The dimension by which statistics are collected.</p>
         * <blockquote>
         * <p> In most cases, the <code>Region</code> parameter instead of the GroupName parameter is returned.</p>
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
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        public static GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary self = new GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsGroupByRegionResponseBodyDiscoveredResourceCountsSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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
