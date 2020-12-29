// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribePublishedRouteEntriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PublishedRouteEntries")
    public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries> publishedRouteEntries;

    public static DescribePublishedRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishedRouteEntriesResponseBody self = new DescribePublishedRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublishedRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePublishedRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePublishedRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublishedRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePublishedRouteEntriesResponseBody setPublishedRouteEntries(java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries> publishedRouteEntries) {
        this.publishedRouteEntries = publishedRouteEntries;
        return this;
    }
    public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries> getPublishedRouteEntries() {
        return this.publishedRouteEntries;
    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts extends TeaModel {
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

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries extends TeaModel {
        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("Conflicts")
        public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts> conflicts;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("ChildInstanceRouteTableId")
        public String childInstanceRouteTableId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("RouteType")
        public String routeType;

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setConflicts(java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts> conflicts) {
            this.conflicts = conflicts;
            return this;
        }
        public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesConflicts> getConflicts() {
            return this.conflicts;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setChildInstanceRouteTableId(String childInstanceRouteTableId) {
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }
        public String getChildInstanceRouteTableId() {
            return this.childInstanceRouteTableId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setOperationalMode(Boolean operationalMode) {
            this.operationalMode = operationalMode;
            return this;
        }
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

    }

}
