// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenChildInstanceRouteEntriesResponseBody extends TeaModel {
    @NameInMap("CenRouteEntries")
    public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries cenRouteEntries;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenChildInstanceRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenChildInstanceRouteEntriesResponseBody self = new DescribeCenChildInstanceRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setCenRouteEntries(DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries cenRouteEntries) {
        this.cenRouteEntries = cenRouteEntries;
        return this;
    }
    public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries getCenRouteEntries() {
        return this.cenRouteEntries;
    }

    public DescribeCenChildInstanceRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeCenChildInstanceRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths extends TeaModel {
        @NameInMap("AsPath")
        public java.util.List<String> asPath;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths setAsPath(java.util.List<String> asPath) {
            this.asPath = asPath;
            return this;
        }
        public java.util.List<String> getAsPath() {
            return this.asPath;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMapId")
        public String routeMapId;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords extends TeaModel {
        @NameInMap("CenRouteMapRecord")
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord> cenRouteMapRecord;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords setCenRouteMapRecord(java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord> cenRouteMapRecord) {
            this.cenRouteMapRecord = cenRouteMapRecord;
            return this;
        }
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord> getCenRouteMapRecord() {
            return this.cenRouteMapRecord;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities extends TeaModel {
        @NameInMap("Community")
        public java.util.List<String> community;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities setCommunity(java.util.List<String> community) {
            this.community = community;
            return this;
        }
        public java.util.List<String> getCommunity() {
            return this.community;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts extends TeaModel {
        @NameInMap("Conflict")
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict> conflict;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts setConflict(java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict> conflict) {
            this.conflict = conflict;
            return this;
        }
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflictsConflict> getConflict() {
            return this.conflict;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry extends TeaModel {
        @NameInMap("AsPaths")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths asPaths;

        @NameInMap("CenRouteMapRecords")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords cenRouteMapRecords;

        @NameInMap("Communities")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities communities;

        @NameInMap("Conflicts")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts conflicts;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        @NameInMap("PublishStatus")
        public String publishStatus;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setAsPaths(DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths asPaths) {
            this.asPaths = asPaths;
            return this;
        }
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths getAsPaths() {
            return this.asPaths;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setCenRouteMapRecords(DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords cenRouteMapRecords) {
            this.cenRouteMapRecords = cenRouteMapRecords;
            return this;
        }
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords getCenRouteMapRecords() {
            return this.cenRouteMapRecords;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setCommunities(DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities communities) {
            this.communities = communities;
            return this;
        }
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities getCommunities() {
            return this.communities;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setConflicts(DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts conflicts) {
            this.conflicts = conflicts;
            return this;
        }
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts getConflicts() {
            return this.conflicts;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setOperationalMode(Boolean operationalMode) {
            this.operationalMode = operationalMode;
            return this;
        }
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries extends TeaModel {
        @NameInMap("CenRouteEntry")
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry> cenRouteEntry;

        public static DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries self = new DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries setCenRouteEntry(java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry> cenRouteEntry) {
            this.cenRouteEntry = cenRouteEntry;
            return this;
        }
        public java.util.List<DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry> getCenRouteEntry() {
            return this.cenRouteEntry;
        }

    }

}
