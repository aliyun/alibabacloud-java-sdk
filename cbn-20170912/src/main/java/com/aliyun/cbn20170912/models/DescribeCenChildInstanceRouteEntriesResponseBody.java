// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenChildInstanceRouteEntriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CenRouteEntries")
    public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries> cenRouteEntries;

    public static DescribeCenChildInstanceRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenChildInstanceRouteEntriesResponseBody self = new DescribeCenChildInstanceRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setCenRouteEntries(java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries> cenRouteEntries) {
        this.cenRouteEntries = cenRouteEntries;
        return this;
    }
    public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries> getCenRouteEntries() {
        return this.cenRouteEntries;
    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts extends TeaModel {
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

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords extends TeaModel {
        @NameInMap("RouteMapId")
        public String routeMapId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("AsPaths")
        public java.util.List<String> asPaths;

        @NameInMap("Conflicts")
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts> conflicts;

        @NameInMap("Communities")
        public java.util.List<String> communities;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("CenRouteMapRecords")
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords> cenRouteMapRecords;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setOperationalMode(Boolean operationalMode) {
            this.operationalMode = operationalMode;
            return this;
        }
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setAsPaths(java.util.List<String> asPaths) {
            this.asPaths = asPaths;
            return this;
        }
        public java.util.List<String> getAsPaths() {
            return this.asPaths;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setConflicts(java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts> conflicts) {
            this.conflicts = conflicts;
            return this;
        }
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesConflicts> getConflicts() {
            return this.conflicts;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setCommunities(java.util.List<String> communities) {
            this.communities = communities;
            return this;
        }
        public java.util.List<String> getCommunities() {
            return this.communities;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setCenRouteMapRecords(java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords> cenRouteMapRecords) {
            this.cenRouteMapRecords = cenRouteMapRecords;
            return this;
        }
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords> getCenRouteMapRecords() {
            return this.cenRouteMapRecords;
        }

    }

}
