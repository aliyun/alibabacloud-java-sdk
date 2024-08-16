// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribePublishedRouteEntriesResponseBody extends TeaModel {
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
     * <p>A list of routes.</p>
     */
    @NameInMap("PublishedRouteEntries")
    public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries publishedRouteEntries;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FF1A7B2A-677F-4F71-96EA-6002B329F437</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePublishedRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishedRouteEntriesResponseBody self = new DescribePublishedRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublishedRouteEntriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePublishedRouteEntriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePublishedRouteEntriesResponseBody setPublishedRouteEntries(DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries publishedRouteEntries) {
        this.publishedRouteEntries = publishedRouteEntries;
        return this;
    }
    public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntries getPublishedRouteEntries() {
        return this.publishedRouteEntries;
    }

    public DescribePublishedRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublishedRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict extends TeaModel {
        /**
         * <p>The destination CIDR block of the conflicting route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.20.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the peer network instance on which conflicting routes are found.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-0q3b7oviikmm9h****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the peer network instance on which the conflicting routes are found. Valid values:</p>
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
         * <p>The ID of the region where the peer network instance on which the conflicting routes are found is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cause of the route confliction. Valid values:</p>
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

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict();
            return TeaModel.build(map, self);
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

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflictsConflict setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
        /**
         * <p>The ID of the route table configured on the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-il7qut3mjgtlcbpk2****</p>
         */
        @NameInMap("ChildInstanceRouteTableId")
        public String childInstanceRouteTableId;

        /**
         * <p>A list of conflicting routes.</p>
         */
        @NameInMap("Conflicts")
        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts conflicts;

        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/16</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ID of the instance specified as the next hop in the route.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-bp18sth14qii3pn****</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>The type of the instance specified as the next hop in the route.</p>
         * <ul>
         * <li><strong>Instance</strong>: ECS instance</li>
         * <li><strong>HaVip</strong>: high-availability virtual IP address (HAVIP).</li>
         * <li><strong>RouterInterface</strong>: router interface.</li>
         * <li><strong>NetworkInterface</strong>: elastic network interface (ENI).</li>
         * <li><strong>VpnGateway</strong>: VPN gateway.</li>
         * <li><strong>IPv6Gateway</strong>: IPv6 gateway.</li>
         * <li><strong>NatGateway</strong>: NAT gateway.</li>
         * <li><strong>Attachment</strong>: network instance connection</li>
         * <li><strong>service</strong>: cloud service</li>
         * <li><strong>VBR</strong>: VBR</li>
         * <li><strong>CCN</strong>: CCN instance</li>
         * <li><strong>VPC</strong>: VPC</li>
         * <li><strong>local</strong>: system route. No next hop is specified.</li>
         * <li><strong>TR</strong>: transit router</li>
         * <li><strong>BlackHole</strong>: blackhole route. No next hop is specified.</li>
         * <li><strong>EcRouterInterface</strong>: router interface for Express Connect</li>
         * <li><strong>HealthCheck</strong>: health check</li>
         * <li><strong>AS</strong>: access gateway for CCN</li>
         * <li><strong>classicLink</strong>: classic network-type instance</li>
         * <li><strong>GatewayEndpoint</strong>: gateway endpoint</li>
         * <li><strong>CPE</strong>: data center connected to the VBR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>Indicates whether the route is allowed to be advertised to or withdrawn from the CEN instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The route is allowed to be advertised to or withdrawn from the CEN instance.</li>
         * <li><strong>false</strong>: The route is not allowed to be advertised to or withdrawn from the CEN instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        /**
         * <p>Indicates whether the route is advertised to the CEN instance. Valid values:</p>
         * <ul>
         * <li><strong>Published</strong>: The route is advertised to the CEN instance.</li>
         * <li><strong>NonPublished</strong>: The route is not advertised to the CEN instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        /**
         * <p>The type of the route. Valid values:</p>
         * <ul>
         * <li><strong>CEN</strong>: route that is advertised through CEN</li>
         * <li><strong>System</strong>: system route</li>
         * <li><strong>Custom</strong>: custom route</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        public static DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry self = new DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setChildInstanceRouteTableId(String childInstanceRouteTableId) {
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }
        public String getChildInstanceRouteTableId() {
            return this.childInstanceRouteTableId;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setConflicts(DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts conflicts) {
            this.conflicts = conflicts;
            return this;
        }
        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntryConflicts getConflicts() {
            return this.conflicts;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
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

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DescribePublishedRouteEntriesResponseBodyPublishedRouteEntriesPublishedRouteEntry setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
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
