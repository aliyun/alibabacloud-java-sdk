// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteEntries")
    public java.util.List<DescribeRouteEntryListResponseBodyRouteEntries> routeEntries;

    public static DescribeRouteEntryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListResponseBody self = new DescribeRouteEntryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteEntryListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRouteEntryListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRouteEntryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteEntryListResponseBody setRouteEntries(java.util.List<DescribeRouteEntryListResponseBodyRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<DescribeRouteEntryListResponseBodyRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public static class DescribeRouteEntryListResponseBodyRouteEntriesNextHops extends TeaModel {
        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        public static DescribeRouteEntryListResponseBodyRouteEntriesNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntriesNextHops self = new DescribeRouteEntryListResponseBodyRouteEntriesNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntriesNextHops setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntriesNextHops setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

    }

    public static class DescribeRouteEntryListResponseBodyRouteEntries extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("NextHops")
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntriesNextHops> nextHops;

        @NameInMap("RouteEntryId")
        public String routeEntryId;

        @NameInMap("RouteEntryName")
        public String routeEntryName;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeRouteEntryListResponseBodyRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteEntryListResponseBodyRouteEntries self = new DescribeRouteEntryListResponseBodyRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setNextHops(java.util.List<DescribeRouteEntryListResponseBodyRouteEntriesNextHops> nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public java.util.List<DescribeRouteEntryListResponseBodyRouteEntriesNextHops> getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteEntryListResponseBodyRouteEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
