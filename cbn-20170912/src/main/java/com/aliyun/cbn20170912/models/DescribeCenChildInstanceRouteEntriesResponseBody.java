// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenChildInstanceRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The information about the route.</p>
     */
    @NameInMap("CenRouteEntries")
    public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntries cenRouteEntries;

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
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The region ID of the routing policy.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The routing policy ID.</p>
         */
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
        /**
         * <p>The destination CIDR block of the overlapping route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the peer network instance on which the overlapping routes are found.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the peer network instance on which the overlapping routes are found. Valid values:</p>
         * <br>
         * <p>*   **VPC**</p>
         * <p>*   **VBR**</p>
         * <p>*   **CCN**</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The region ID of the peer network instance on which the overlapping routes are found.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cause of the route error. Valid values:</p>
         * <br>
         * <p>*   **conflict**: The routes have the same destination CIDR block.</p>
         * <p>*   **overflow**: The number of routes in the route table configured on another network instance has reached the upper limit.</p>
         */
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
        /**
         * <p>The AS paths of the routes.</p>
         */
        @NameInMap("AsPaths")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryAsPaths asPaths;

        /**
         * <p>The routing policy that the routes match.</p>
         */
        @NameInMap("CenRouteMapRecords")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCenRouteMapRecords cenRouteMapRecords;

        /**
         * <p>The community attributes of the route entries.</p>
         */
        @NameInMap("Communities")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryCommunities communities;

        /**
         * <p>A list of overlapping routes.</p>
         */
        @NameInMap("Conflicts")
        public DescribeCenChildInstanceRouteEntriesResponseBodyCenRouteEntriesCenRouteEntryConflicts conflicts;

        /**
         * <p>The destination CIDR block of the route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the instance specified as the next hop in the route.</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        /**
         * <p>The region ID of the instance specified as the next hop in the route.</p>
         */
        @NameInMap("NextHopRegionId")
        public String nextHopRegionId;

        /**
         * <p>The type of the instance specified as the next hop in the route. Valid values:</p>
         * <br>
         * <p>*   **Instance**: an ECS instance</p>
         * <p>*   **HaVip**: an HAVIP</p>
         * <p>*   **RouterInterface**: a router interface</p>
         * <p>*   **NetworkInterface**: an ENI</p>
         * <p>*   **VpnGateway**: a VPN gateway</p>
         * <p>*   **IPv6Gateway**: an IPv6 gateway</p>
         * <p>*   **Ipv4Gateway**: an IPv4 gateway</p>
         * <p>*   **NatGateway**: a NAT gateway</p>
         * <p>*   **Attachment**: a network instance connection</p>
         * <p>*   **service**: a cloud service</p>
         * <p>*   **VBR**: a VBR</p>
         * <p>*   **CCN**: a CCN instance</p>
         * <p>*   **VPC**: a VPC</p>
         * <p>*   **local**: a system route (no next hop is specified)</p>
         * <p>*   **TR**: a transit router</p>
         * <p>*   **BlackHole**: a blackhole route (no next hop is specified)</p>
         * <p>*   **EcRouterInterface**: a router interface for Express Connect</p>
         * <p>*   **HealthCheck**: a health check</p>
         * <p>*   **AS**: an access gateway for CCN</p>
         * <p>*   **classic**: a classic network-type instance</p>
         * <p>*   **GatewayEndpoint**: a gateway endpoint</p>
         * <p>*   **CPE**: a data center connected to a VBR</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>Indicates whether the route is allowed to be advertised to or withdrawn from the CEN instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        /**
         * <p>Indicates whether the route is advertised to the CEN instance. Valid values:</p>
         * <br>
         * <p>*   **Published**</p>
         * <p>*   **NonPublished**</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        /**
         * <p>The route table ID.</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        /**
         * <p>The route status. Valid values:</p>
         * <br>
         * <p>*   **Active**: available routes</p>
         * <p>*   **Candidate**: standby routes</p>
         * <p>*   **Rejected**: rejected routes</p>
         * <p>*   **Prohibited**: prohibited routes</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The route type. Valid values:</p>
         * <br>
         * <p>*   **CEN**: route that is advertised through CEN</p>
         * <p>*   **System**: system route</p>
         * <p>*   **Custom**: custom route</p>
         */
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
