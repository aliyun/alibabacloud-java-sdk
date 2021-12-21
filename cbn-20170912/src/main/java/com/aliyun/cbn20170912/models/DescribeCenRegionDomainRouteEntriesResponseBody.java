// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRegionDomainRouteEntriesResponseBody extends TeaModel {
    @NameInMap("CenRouteEntries")
    public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries cenRouteEntries;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenRegionDomainRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRegionDomainRouteEntriesResponseBody self = new DescribeCenRegionDomainRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setCenRouteEntries(DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries cenRouteEntries) {
        this.cenRouteEntries = cenRouteEntries;
        return this;
    }
    public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries getCenRouteEntries() {
        return this.cenRouteEntries;
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths extends TeaModel {
        @NameInMap("AsPath")
        public java.util.List<String> asPath;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths setAsPath(java.util.List<String> asPath) {
            this.asPath = asPath;
            return this;
        }
        public java.util.List<String> getAsPath() {
            return this.asPath;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMapId")
        public String routeMapId;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords extends TeaModel {
        @NameInMap("CenOutRouteMapRecord")
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord> cenOutRouteMapRecord;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords setCenOutRouteMapRecord(java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord> cenOutRouteMapRecord) {
            this.cenOutRouteMapRecord = cenOutRouteMapRecord;
            return this;
        }
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecordsCenOutRouteMapRecord> getCenOutRouteMapRecord() {
            return this.cenOutRouteMapRecord;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteMapId")
        public String routeMapId;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords extends TeaModel {
        @NameInMap("CenRouteMapRecord")
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord> cenRouteMapRecord;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords setCenRouteMapRecord(java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord> cenRouteMapRecord) {
            this.cenRouteMapRecord = cenRouteMapRecord;
            return this;
        }
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecordsCenRouteMapRecord> getCenRouteMapRecord() {
            return this.cenRouteMapRecord;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities extends TeaModel {
        @NameInMap("Community")
        public java.util.List<String> community;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities setCommunity(java.util.List<String> community) {
            this.community = community;
            return this;
        }
        public java.util.List<String> getCommunity() {
            return this.community;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry extends TeaModel {
        @NameInMap("AsPaths")
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths asPaths;

        @NameInMap("CenOutRouteMapRecords")
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords cenOutRouteMapRecords;

        @NameInMap("CenRouteMapRecords")
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords cenRouteMapRecords;

        @NameInMap("Communities")
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities communities;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("Preference")
        public Integer preference;

        @NameInMap("Status")
        public String status;

        @NameInMap("ToOtherRegionStatus")
        public String toOtherRegionStatus;

        @NameInMap("Type")
        public String type;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setAsPaths(DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths asPaths) {
            this.asPaths = asPaths;
            return this;
        }
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths getAsPaths() {
            return this.asPaths;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setCenOutRouteMapRecords(DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords cenOutRouteMapRecords) {
            this.cenOutRouteMapRecords = cenOutRouteMapRecords;
            return this;
        }
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenOutRouteMapRecords getCenOutRouteMapRecords() {
            return this.cenOutRouteMapRecords;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setCenRouteMapRecords(DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords cenRouteMapRecords) {
            this.cenRouteMapRecords = cenRouteMapRecords;
            return this;
        }
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords getCenRouteMapRecords() {
            return this.cenRouteMapRecords;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setCommunities(DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities communities) {
            this.communities = communities;
            return this;
        }
        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities getCommunities() {
            return this.communities;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setToOtherRegionStatus(String toOtherRegionStatus) {
            this.toOtherRegionStatus = toOtherRegionStatus;
            return this;
        }
        public String getToOtherRegionStatus() {
            return this.toOtherRegionStatus;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries extends TeaModel {
        @NameInMap("CenRouteEntry")
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry> cenRouteEntry;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setCenRouteEntry(java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry> cenRouteEntry) {
            this.cenRouteEntry = cenRouteEntry;
            return this;
        }
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteEntry> getCenRouteEntry() {
            return this.cenRouteEntry;
        }

    }

}
