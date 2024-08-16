// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteConflictResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE3A2CC7-41F1-58DB-8306-CFC99D9C747B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of overlapping routes.</p>
     */
    @NameInMap("RouteConflicts")
    public DescribeRouteConflictResponseBodyRouteConflicts routeConflicts;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The destination CIDR block of the overlapping route.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/16</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the peer network instance on which the overlapping routes are found.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-0q3b7oviikmm9h****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the peer network instance on which the overlapping routes are found.</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC</li>
         * <li><strong>VBR</strong>: VBR</li>
         * <li><strong>CCN</strong>: CCN instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CCN</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region ID of the peer network instance on which the overlapping routes are found is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cause of the route error. Valid values:</p>
         * <ul>
         * <li><strong>conflict</strong>: The routes have the same destination CIDR block.</li>
         * <li><strong>overflow</strong>: The number of routes in the route table configured on another network instance has reached the upper limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>conflict</p>
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
