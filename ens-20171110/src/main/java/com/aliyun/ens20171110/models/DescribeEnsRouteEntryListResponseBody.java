// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRouteEntryListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the route.</p>
     */
    @NameInMap("RouteEntrys")
    public java.util.List<DescribeEnsRouteEntryListResponseBodyRouteEntrys> routeEntrys;

    /**
     * <p>The number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEnsRouteEntryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRouteEntryListResponseBody self = new DescribeEnsRouteEntryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRouteEntryListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRouteEntryListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRouteEntryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRouteEntryListResponseBody setRouteEntrys(java.util.List<DescribeEnsRouteEntryListResponseBodyRouteEntrys> routeEntrys) {
        this.routeEntrys = routeEntrys;
        return this;
    }
    public java.util.List<DescribeEnsRouteEntryListResponseBodyRouteEntrys> getRouteEntrys() {
        return this.routeEntrys;
    }

    public DescribeEnsRouteEntryListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops extends TeaModel {
        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the next hop. Valid values:</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        public static DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops self = new DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

    }

    public static class DescribeEnsRouteEntryListResponseBodyRouteEntrys extends TeaModel {
        /**
         * <p>Enter a description for the route.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block of the route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The information about the next hop.</p>
         */
        @NameInMap("NextHops")
        public java.util.List<DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops> nextHops;

        /**
         * <p>The ID of the route.</p>
         */
        @NameInMap("RouteEntryId")
        public String routeEntryId;

        /**
         * <p>The name of the route.</p>
         */
        @NameInMap("RouteEntryName")
        public String routeEntryName;

        /**
         * <p>The ID of the route table.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The status of the route entry. Valid values:</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the route entry.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeEnsRouteEntryListResponseBodyRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRouteEntryListResponseBodyRouteEntrys self = new DescribeEnsRouteEntryListResponseBodyRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setNextHops(java.util.List<DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops> nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public java.util.List<DescribeEnsRouteEntryListResponseBodyRouteEntrysNextHops> getNextHops() {
            return this.nextHops;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setRouteEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setRouteEntryName(String routeEntryName) {
            this.routeEntryName = routeEntryName;
            return this;
        }
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEnsRouteEntryListResponseBodyRouteEntrys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
