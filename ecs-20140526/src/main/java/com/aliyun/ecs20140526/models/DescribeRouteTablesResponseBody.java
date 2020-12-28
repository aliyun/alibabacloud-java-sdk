// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouteTables")
    public java.util.List<DescribeRouteTablesResponseBodyRouteTables> routeTables;

    public static DescribeRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesResponseBody self = new DescribeRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTablesResponseBody setRouteTables(java.util.List<DescribeRouteTablesResponseBodyRouteTables> routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public java.util.List<DescribeRouteTablesResponseBodyRouteTables> getRouteTables() {
        return this.routeTables;
    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops extends TeaModel {
        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("Enabled")
        public Integer enabled;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops self = new DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteEntrys extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("NextHops")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops> nextHops;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteEntrys self = new DescribeRouteTablesResponseBodyRouteTablesRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setNextHops(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops> nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteEntrysNextHops> getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteEntrys setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTables extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("RouteEntrys")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteEntrys> routeEntrys;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeRouteTablesResponseBodyRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTables self = new DescribeRouteTablesResponseBodyRouteTables();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTables setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTablesResponseBodyRouteTables setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeRouteTablesResponseBodyRouteTables setRouteEntrys(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteEntrys> routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteEntrys> getRouteEntrys() {
            return this.routeEntrys;
        }

        public DescribeRouteTablesResponseBodyRouteTables setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTablesResponseBodyRouteTables setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTablesResponseBodyRouteTables setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
