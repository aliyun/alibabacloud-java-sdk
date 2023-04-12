// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsGroupByResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The statistics on the resources.</p>
     */
    @NameInMap("DiscoveredResourceCountsSummary")
    public java.util.List<GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDiscoveredResourceCountsGroupByResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsGroupByResourceTypeResponseBody self = new GetDiscoveredResourceCountsGroupByResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponseBody setDiscoveredResourceCountsSummary(java.util.List<GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
        this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
        return this;
    }
    public java.util.List<GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary extends TeaModel {
        /**
         * <p>The resource type by which the statistics are collected.</p>
         * <br>
         * <p>>  We recommend that you use the `ResourceType` parameter.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The total number of resources.</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        /**
         * <p>The resource type by which the statistics are collected.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary self = new GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetDiscoveredResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
