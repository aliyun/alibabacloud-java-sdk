// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribePublishedRouteEntriesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PublishedRouteEntries")
    public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries publishedRouteEntries;

    public static DescribePublishedRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishedRouteEntriesResponseBody self = new DescribePublishedRouteEntriesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribePublishedRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePublishedRouteEntriesResponseBody setPublishedRouteEntries(DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries publishedRouteEntries) {
        this.publishedRouteEntries = publishedRouteEntries;
        return this;
    }
    public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries getPublishedRouteEntries() {
        return this.publishedRouteEntries;
    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict extends TeaModel {
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

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts extends TeaModel {
        @NameInMap("Conflict")
        public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict> conflict;

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts setConflict(java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict> conflict) {
            this.conflict = conflict;
            return this;
        }
        public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict> getConflict() {
            return this.conflict;
        }

    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry extends TeaModel {
        @NameInMap("NextHopId")
        public String nextHopId;

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

        @NameInMap("Conflicts")
        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts conflicts;

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setChildInstanceRouteTableId(String childInstanceRouteTableId) {
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }
        public String getChildInstanceRouteTableId() {
            return this.childInstanceRouteTableId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setOperationalMode(Boolean operationalMode) {
            this.operationalMode = operationalMode;
            return this;
        }
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setConflicts(DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts conflicts) {
            this.conflicts = conflicts;
            return this;
        }
        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts getConflicts() {
            return this.conflicts;
        }

    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries extends TeaModel {
        @NameInMap("PublishedRouteEntry")
        public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry> publishedRouteEntry;

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries setPublishedRouteEntry(java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry> publishedRouteEntry) {
            this.publishedRouteEntry = publishedRouteEntry;
            return this;
        }
        public java.util.List<DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry> getPublishedRouteEntry() {
            return this.publishedRouteEntry;
        }

    }

}
