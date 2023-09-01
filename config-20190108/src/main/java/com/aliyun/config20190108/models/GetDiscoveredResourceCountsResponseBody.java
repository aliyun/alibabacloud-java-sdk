// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsResponseBody extends TeaModel {
    /**
     * <p>The returned information about resources.</p>
     */
    @NameInMap("GroupedResourceCounts")
    public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts groupedResourceCounts;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDiscoveredResourceCountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsResponseBody self = new GetDiscoveredResourceCountsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsResponseBody setGroupedResourceCounts(GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts groupedResourceCounts) {
        this.groupedResourceCounts = groupedResourceCounts;
        return this;
    }
    public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts getGroupedResourceCounts() {
        return this.groupedResourceCounts;
    }

    public GetDiscoveredResourceCountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList extends TeaModel {
        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The number of resources in the group.</p>
         */
        @NameInMap("ResourceCount")
        public Long resourceCount;

        public static GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList self = new GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

    }

    public static class GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts extends TeaModel {
        /**
         * <p>The dimension by which resources are grouped.</p>
         */
        @NameInMap("GroupByKey")
        public String groupByKey;

        /**
         * <p>The information about resources in a specific group.</p>
         */
        @NameInMap("GroupedResourceCountList")
        public java.util.List<GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList> groupedResourceCountList;

        public static GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts self = new GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts setGroupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }
        public String getGroupByKey() {
            return this.groupByKey;
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts setGroupedResourceCountList(java.util.List<GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList> groupedResourceCountList) {
            this.groupedResourceCountList = groupedResourceCountList;
            return this;
        }
        public java.util.List<GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList> getGroupedResourceCountList() {
            return this.groupedResourceCountList;
        }

    }

}
