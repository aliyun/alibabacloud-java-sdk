// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterRouteEntries")
    public java.util.List<ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries> transitRouterRouteEntries;

    public static ListTransitRouterRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteEntriesResponseBody self = new ListTransitRouterRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteEntriesResponseBody setTransitRouterRouteEntries(java.util.List<ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries> transitRouterRouteEntries) {
        this.transitRouterRouteEntries = transitRouterRouteEntries;
        return this;
    }
    public java.util.List<ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries> getTransitRouterRouteEntries() {
        return this.transitRouterRouteEntries;
    }

    public static class ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TransitRouterRouteEntryDescription")
        public String transitRouterRouteEntryDescription;

        @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
        public String transitRouterRouteEntryDestinationCidrBlock;

        @NameInMap("TransitRouterRouteEntryId")
        public String transitRouterRouteEntryId;

        @NameInMap("TransitRouterRouteEntryName")
        public String transitRouterRouteEntryName;

        @NameInMap("TransitRouterRouteEntryNextHopId")
        public String transitRouterRouteEntryNextHopId;

        @NameInMap("TransitRouterRouteEntryNextHopType")
        public String transitRouterRouteEntryNextHopType;

        @NameInMap("TransitRouterRouteEntryStatus")
        public String transitRouterRouteEntryStatus;

        @NameInMap("TransitRouterRouteEntryType")
        public String transitRouterRouteEntryType;

        public static ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries self = new ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
            return this;
        }
        public String getTransitRouterRouteEntryDescription() {
            return this.transitRouterRouteEntryDescription;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }
        public String getTransitRouterRouteEntryDestinationCidrBlock() {
            return this.transitRouterRouteEntryDestinationCidrBlock;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.transitRouterRouteEntryId = transitRouterRouteEntryId;
            return this;
        }
        public String getTransitRouterRouteEntryId() {
            return this.transitRouterRouteEntryId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.transitRouterRouteEntryName = transitRouterRouteEntryName;
            return this;
        }
        public String getTransitRouterRouteEntryName() {
            return this.transitRouterRouteEntryName;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }
        public String getTransitRouterRouteEntryNextHopId() {
            return this.transitRouterRouteEntryNextHopId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }
        public String getTransitRouterRouteEntryNextHopType() {
            return this.transitRouterRouteEntryNextHopType;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
            this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
            return this;
        }
        public String getTransitRouterRouteEntryStatus() {
            return this.transitRouterRouteEntryStatus;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
            this.transitRouterRouteEntryType = transitRouterRouteEntryType;
            return this;
        }
        public String getTransitRouterRouteEntryType() {
            return this.transitRouterRouteEntryType;
        }

    }

}
