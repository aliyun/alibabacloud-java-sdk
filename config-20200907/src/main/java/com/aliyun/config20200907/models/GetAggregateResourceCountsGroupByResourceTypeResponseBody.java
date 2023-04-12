// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The statistics on the resources.</p>
     */
    @NameInMap("DiscoveredResourceCountsSummary")
    public java.util.List<GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateResourceCountsGroupByResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByResourceTypeResponseBody self = new GetAggregateResourceCountsGroupByResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponseBody setDiscoveredResourceCountsSummary(java.util.List<GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
        this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
        return this;
    }
    public java.util.List<GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary extends TeaModel {
        /**
         * <p>This parameter is expired. The resource type by which statistics are collected.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The total number of resources in the region.</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        /**
         * <p>The resource type by which statistics are collected.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary self = new GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetAggregateResourceCountsGroupByResourceTypeResponseBodyDiscoveredResourceCountsSummary setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
