// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceCountsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GroupedResourceCounts")
    @Validation(required = true)
    public GetDiscoveredResourceCountsResponseGroupedResourceCounts groupedResourceCounts;

    public static GetDiscoveredResourceCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceCountsResponse self = new GetDiscoveredResourceCountsResponse();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceCountsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDiscoveredResourceCountsResponse setGroupedResourceCounts(GetDiscoveredResourceCountsResponseGroupedResourceCounts groupedResourceCounts) {
        this.groupedResourceCounts = groupedResourceCounts;
        return this;
    }
    public GetDiscoveredResourceCountsResponseGroupedResourceCounts getGroupedResourceCounts() {
        return this.groupedResourceCounts;
    }

    public static class GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("ResourceCount")
        @Validation(required = true)
        public Long resourceCount;

        public static GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList self = new GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList setResourceCount(Long resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Long getResourceCount() {
            return this.resourceCount;
        }

    }

    public static class GetDiscoveredResourceCountsResponseGroupedResourceCounts extends TeaModel {
        @NameInMap("GroupByKey")
        @Validation(required = true)
        public String groupByKey;

        @NameInMap("GroupedResourceCountList")
        @Validation(required = true)
        public java.util.List<GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList> groupedResourceCountList;

        public static GetDiscoveredResourceCountsResponseGroupedResourceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetDiscoveredResourceCountsResponseGroupedResourceCounts self = new GetDiscoveredResourceCountsResponseGroupedResourceCounts();
            return TeaModel.build(map, self);
        }

        public GetDiscoveredResourceCountsResponseGroupedResourceCounts setGroupByKey(String groupByKey) {
            this.groupByKey = groupByKey;
            return this;
        }
        public String getGroupByKey() {
            return this.groupByKey;
        }

        public GetDiscoveredResourceCountsResponseGroupedResourceCounts setGroupedResourceCountList(java.util.List<GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList> groupedResourceCountList) {
            this.groupedResourceCountList = groupedResourceCountList;
            return this;
        }
        public java.util.List<GetDiscoveredResourceCountsResponseGroupedResourceCountsGroupedResourceCountList> getGroupedResourceCountList() {
            return this.groupedResourceCountList;
        }

    }

}
