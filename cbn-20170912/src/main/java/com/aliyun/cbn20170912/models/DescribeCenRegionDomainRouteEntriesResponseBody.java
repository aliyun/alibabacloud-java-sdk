// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRegionDomainRouteEntriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CenRouteEntries")
    public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries> cenRouteEntries;

    public static DescribeCenRegionDomainRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRegionDomainRouteEntriesResponseBody self = new DescribeCenRegionDomainRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeCenRegionDomainRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenRegionDomainRouteEntriesResponseBody setCenRouteEntries(java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries> cenRouteEntries) {
        this.cenRouteEntries = cenRouteEntries;
        return this;
    }
    public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries> getCenRouteEntries() {
        return this.cenRouteEntries;
    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords extends TeaModel {
        @NameInMap("RouteMapId")
        public String routeMapId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords extends TeaModel {
        @NameInMap("RouteMapId")
        public String routeMapId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CenOutRouteMapRecords")
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords> cenOutRouteMapRecords;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        @NameInMap("AsPaths")
        public java.util.List<String> asPaths;

        @NameInMap("ToOtherRegionStatus")
        public String toOtherRegionStatus;

        @NameInMap("Communities")
        public java.util.List<String> communities;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("Preference")
        public Integer preference;

        @NameInMap("CenRouteMapRecords")
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords> cenRouteMapRecords;

        public static DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries self = new DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries();
            return TeaModel.build(map, self);
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setCenOutRouteMapRecords(java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords> cenOutRouteMapRecords) {
            this.cenOutRouteMapRecords = cenOutRouteMapRecords;
            return this;
        }
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenOutRouteMapRecords> getCenOutRouteMapRecords() {
            return this.cenOutRouteMapRecords;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setNextHopRegionId(String nextHopRegionId) {
            this.nextHopRegionId = nextHopRegionId;
            return this;
        }
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setAsPaths(java.util.List<String> asPaths) {
            this.asPaths = asPaths;
            return this;
        }
        public java.util.List<String> getAsPaths() {
            return this.asPaths;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setToOtherRegionStatus(String toOtherRegionStatus) {
            this.toOtherRegionStatus = toOtherRegionStatus;
            return this;
        }
        public String getToOtherRegionStatus() {
            return this.toOtherRegionStatus;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setCommunities(java.util.List<String> communities) {
            this.communities = communities;
            return this;
        }
        public java.util.List<String> getCommunities() {
            return this.communities;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntries setCenRouteMapRecords(java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords> cenRouteMapRecords) {
            this.cenRouteMapRecords = cenRouteMapRecords;
            return this;
        }
        public java.util.List<DescribeCenRegionDomainRouteEntriesResponseBodyCenRouteEntriesCenRouteMapRecords> getCenRouteMapRecords() {
            return this.cenRouteMapRecords;
        }

    }

}
