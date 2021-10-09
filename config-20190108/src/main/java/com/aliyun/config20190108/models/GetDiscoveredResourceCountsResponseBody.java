// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupedResourceCounts")
    public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts groupedResourceCounts;

    public static GetDiscoveredResourceCountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsResponseBody self = new GetDiscoveredResourceCountsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiscoveredResourceCountsResponseBody setGroupedResourceCounts(GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts groupedResourceCounts) {
        this.groupedResourceCounts = groupedResourceCounts;
        return this;
    }
    public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts getGroupedResourceCounts() {
        return this.groupedResourceCounts;
    }

    public static class GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList extends TeaModel {
        @NameInMap("ResourceCount")
        public Long resourceCount;

        @NameInMap("GroupName")
        public String groupName;

        public static GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList self = new GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts extends TeaModel {
        @NameInMap("GroupedResourceCountList")
        public java.util.List<GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList> groupedResourceCountList;

        @NameInMap("GroupByKey")
        public String groupByKey;

        public static GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts self = new GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts setGroupedResourceCountList(java.util.List<GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList> groupedResourceCountList) {
            this.groupedResourceCountList = groupedResourceCountList;
            return this;
        }
        public java.util.List<GetDiscoveredResourceCountsResponseBodyGroupedResourceCountsGroupedResourceCountList> getGroupedResourceCountList() {
            return this.groupedResourceCountList;
        }

        public GetDiscoveredResourceCountsResponseBodyGroupedResourceCounts setGroupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }
        public String getGroupByKey() {
            return this.groupByKey;
        }

    }

}
