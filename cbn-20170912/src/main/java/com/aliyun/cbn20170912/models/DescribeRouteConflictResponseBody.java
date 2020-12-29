// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteConflictResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouteConflicts")
    public java.util.List<DescribeRouteConflictResponseBodyRouteConflicts> routeConflicts;

    public static DescribeRouteConflictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteConflictResponseBody self = new DescribeRouteConflictResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteConflictResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeRouteConflictResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteConflictResponseBody setRouteConflicts(java.util.List<DescribeRouteConflictResponseBodyRouteConflicts> routeConflicts) {
        this.routeConflicts = routeConflicts;
        return this;
    }
    public java.util.List<DescribeRouteConflictResponseBodyRouteConflicts> getRouteConflicts() {
        return this.routeConflicts;
    }

    public static class DescribeRouteConflictResponseBodyRouteConflicts extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRouteConflictResponseBodyRouteConflicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteConflictResponseBodyRouteConflicts self = new DescribeRouteConflictResponseBodyRouteConflicts();
            return TeaModel.build(map, self);
        }

        public DescribeRouteConflictResponseBodyRouteConflicts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteConflictResponseBodyRouteConflicts setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteConflictResponseBodyRouteConflicts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteConflictResponseBodyRouteConflicts setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRouteConflictResponseBodyRouteConflicts setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
