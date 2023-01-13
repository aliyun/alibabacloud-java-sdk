// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteConflictResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of conflicting routes.</p>
     */
    @NameInMap("RouteConflicts")
    public DescribeRouteConflictResponseBodyRouteConflicts routeConflicts;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRouteConflictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteConflictResponseBody self = new DescribeRouteConflictResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteConflictResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteConflictResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteConflictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteConflictResponseBody setRouteConflicts(DescribeRouteConflictResponseBodyRouteConflicts routeConflicts) {
        this.routeConflicts = routeConflicts;
        return this;
    }
    public DescribeRouteConflictResponseBodyRouteConflicts getRouteConflicts() {
        return this.routeConflicts;
    }

    public DescribeRouteConflictResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRouteConflictResponseBodyRouteConflictsRouteConflict extends TeaModel {
        /**
         * <p>The destination CIDR block of the conflicting route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the peer network instance on which conflicting routes are found.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the peer network instance on which conflicting routes are found.</p>
         * <br>
         * <p>*   **VPC**</p>
         * <p>*   **VBR**</p>
         * <p>*   **CCN**</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region ID of the peer network instance on which conflicting routes are found is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cause of the route error. Valid values:</p>
         * <br>
         * <p>*   **conflict**: Routes have the same destination CIDR block.</p>
         * <p>*   **overflow**: The number of routes in the route table configured on another network instance has reached the upper limit.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRouteConflictResponseBodyRouteConflictsRouteConflict build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteConflictResponseBodyRouteConflictsRouteConflict self = new DescribeRouteConflictResponseBodyRouteConflictsRouteConflict();
            return TeaModel.build(map, self);
        }

        public DescribeRouteConflictResponseBodyRouteConflictsRouteConflict setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteConflictResponseBodyRouteConflictsRouteConflict setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteConflictResponseBodyRouteConflictsRouteConflict setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRouteConflictResponseBodyRouteConflictsRouteConflict setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRouteConflictResponseBodyRouteConflictsRouteConflict setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRouteConflictResponseBodyRouteConflicts extends TeaModel {
        @NameInMap("RouteConflict")
        public java.util.List<DescribeRouteConflictResponseBodyRouteConflictsRouteConflict> routeConflict;

        public static DescribeRouteConflictResponseBodyRouteConflicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteConflictResponseBodyRouteConflicts self = new DescribeRouteConflictResponseBodyRouteConflicts();
            return TeaModel.build(map, self);
        }

        public DescribeRouteConflictResponseBodyRouteConflicts setRouteConflict(java.util.List<DescribeRouteConflictResponseBodyRouteConflictsRouteConflict> routeConflict) {
            this.routeConflict = routeConflict;
            return this;
        }
        public java.util.List<DescribeRouteConflictResponseBodyRouteConflictsRouteConflict> getRouteConflict() {
            return this.routeConflict;
        }

    }

}
