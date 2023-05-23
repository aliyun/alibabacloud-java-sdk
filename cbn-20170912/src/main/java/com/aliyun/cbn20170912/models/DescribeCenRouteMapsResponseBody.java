// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsResponseBody extends TeaModel {
    /**
     * <p>The community set on which actions are performed.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The IDs of the destination route tables to which the routes belong. You can enter at most 32 route table IDs.</p>
     * <br>
     * <p>>  The destination route table IDs are valid only when the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to route tables in the current region.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("RouteMaps")
    public DescribeCenRouteMapsResponseBodyRouteMaps routeMaps;

    /**
     * <p>Indicates whether the source network instance IDs are excluded.</p>
     * <br>
     * <p>*   **false** (default): A route is a match if its source network instance ID is in the list specified by **SourceInstanceIds.N**.</p>
     * <p>*   **true**: A route is match if its source network instance ID is not in the list specified by **SourceInstanceIds.N**.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsResponseBody self = new DescribeCenRouteMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenRouteMapsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenRouteMapsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenRouteMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenRouteMapsResponseBody setRouteMaps(DescribeCenRouteMapsResponseBodyRouteMaps routeMaps) {
        this.routeMaps = routeMaps;
        return this;
    }
    public DescribeCenRouteMapsResponseBodyRouteMaps getRouteMaps() {
        return this.routeMaps;
    }

    public DescribeCenRouteMapsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes extends TeaModel {
        @NameInMap("DestinationChildInstanceType")
        public java.util.List<String> destinationChildInstanceType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes setDestinationChildInstanceType(java.util.List<String> destinationChildInstanceType) {
            this.destinationChildInstanceType = destinationChildInstanceType;
            return this;
        }
        public java.util.List<String> getDestinationChildInstanceType() {
            return this.destinationChildInstanceType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        public java.util.List<String> destinationCidrBlock;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks setDestinationCidrBlock(java.util.List<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public java.util.List<String> getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds extends TeaModel {
        @NameInMap("DestinationInstanceId")
        public java.util.List<String> destinationInstanceId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds setDestinationInstanceId(java.util.List<String> destinationInstanceId) {
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }
        public java.util.List<String> getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds extends TeaModel {
        @NameInMap("DestinationRouteTableId")
        public java.util.List<String> destinationRouteTableId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds setDestinationRouteTableId(java.util.List<String> destinationRouteTableId) {
            this.destinationRouteTableId = destinationRouteTableId;
            return this;
        }
        public java.util.List<String> getDestinationRouteTableId() {
            return this.destinationRouteTableId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns extends TeaModel {
        @NameInMap("MatchAsn")
        public java.util.List<String> matchAsn;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns setMatchAsn(java.util.List<String> matchAsn) {
            this.matchAsn = matchAsn;
            return this;
        }
        public java.util.List<String> getMatchAsn() {
            return this.matchAsn;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet extends TeaModel {
        @NameInMap("MatchCommunity")
        public java.util.List<String> matchCommunity;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet setMatchCommunity(java.util.List<String> matchCommunity) {
            this.matchCommunity = matchCommunity;
            return this;
        }
        public java.util.List<String> getMatchCommunity() {
            return this.matchCommunity;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet extends TeaModel {
        @NameInMap("OperateCommunity")
        public java.util.List<String> operateCommunity;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet setOperateCommunity(java.util.List<String> operateCommunity) {
            this.operateCommunity = operateCommunity;
            return this;
        }
        public java.util.List<String> getOperateCommunity() {
            return this.operateCommunity;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath extends TeaModel {
        @NameInMap("AsPath")
        public java.util.List<String> asPath;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath setAsPath(java.util.List<String> asPath) {
            this.asPath = asPath;
            return this;
        }
        public java.util.List<String> getAsPath() {
            return this.asPath;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes extends TeaModel {
        @NameInMap("RouteType")
        public java.util.List<String> routeType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes setRouteType(java.util.List<String> routeType) {
            this.routeType = routeType;
            return this;
        }
        public java.util.List<String> getRouteType() {
            return this.routeType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes extends TeaModel {
        @NameInMap("SourceChildInstanceType")
        public java.util.List<String> sourceChildInstanceType;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes setSourceChildInstanceType(java.util.List<String> sourceChildInstanceType) {
            this.sourceChildInstanceType = sourceChildInstanceType;
            return this;
        }
        public java.util.List<String> getSourceChildInstanceType() {
            return this.sourceChildInstanceType;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds extends TeaModel {
        @NameInMap("SourceInstanceId")
        public java.util.List<String> sourceInstanceId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds setSourceInstanceId(java.util.List<String> sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public java.util.List<String> getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds extends TeaModel {
        @NameInMap("SourceRegionId")
        public java.util.List<String> sourceRegionId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds setSourceRegionId(java.util.List<String> sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public java.util.List<String> getSourceRegionId() {
            return this.sourceRegionId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds extends TeaModel {
        @NameInMap("SourceRouteTableId")
        public java.util.List<String> sourceRouteTableId;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds setSourceRouteTableId(java.util.List<String> sourceRouteTableId) {
            this.sourceRouteTableId = sourceRouteTableId;
            return this;
        }
        public java.util.List<String> getSourceRouteTableId() {
            return this.sourceRouteTableId;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMapsRouteMap extends TeaModel {
        /**
         * <p>The IDs of the source route tables to which the routes belong.</p>
         */
        @NameInMap("AsPathMatchMode")
        public String asPathMatchMode;

        /**
         * <p>The number of entries returned.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("CenRegionId")
        public String cenRegionId;

        /**
         * <p>The action performed on a route that meets the match conditions.</p>
         * <br>
         * <p>*   **Permit**: the route is permitted.</p>
         * <p>*   **Deny**: the route is denied.</p>
         */
        @NameInMap("CidrMatchMode")
        public String cidrMatchMode;

        /**
         * <p>The direction in which the routing policy is applied. Valid values:</p>
         * <br>
         * <p>*   **RegionIn**: Routes are advertised to the gateways in the regions that are connected by the CEN instance.</p>
         * <br>
         * <p>    For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.</p>
         * <br>
         * <p>*   **RegionOut**: Routes are advertised from the gateways in the regions that are connected by the CEN instance.</p>
         * <br>
         * <p>    For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the current region, or to gateways deployed in other regions.</p>
         */
        @NameInMap("CommunityMatchMode")
        public String communityMatchMode;

        /**
         * <p>The information about the routing policy.</p>
         */
        @NameInMap("CommunityOperateMode")
        public String communityOperateMode;

        /**
         * <p>The AS paths based on which the routes are compared.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationChildInstanceTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes destinationChildInstanceTypes;

        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("DestinationCidrBlocks")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks destinationCidrBlocks;

        @NameInMap("DestinationInstanceIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds destinationInstanceIds;

        /**
         * <p>The description of the routing policy.</p>
         */
        @NameInMap("DestinationInstanceIdsReverseMatch")
        public Boolean destinationInstanceIdsReverseMatch;

        /**
         * <p>The types of source network instance to which the routes belong.</p>
         * <br>
         * <p>*   **VPC**: virtual private cloud (VPC)</p>
         * <p>*   **VBR**: virtual border router (VBR)</p>
         * <p>*   **CCN**: Cloud Connect Network (CCN) instance</p>
         * <p>*   **VPN**: IPsec-VPN connection</p>
         */
        @NameInMap("DestinationRouteTableIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds destinationRouteTableIds;

        /**
         * <p>The ID of the region where the routing policy is applied.</p>
         * <br>
         * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
         */
        @NameInMap("MapResult")
        public String mapResult;

        /**
         * <p>The IDs of the source network instances to which the routes belong.</p>
         */
        @NameInMap("MatchAddressType")
        public String matchAddressType;

        @NameInMap("MatchAsns")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns matchAsns;

        @NameInMap("MatchCommunitySet")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet matchCommunitySet;

        /**
         * <p>The match method that is used to match routes based on the prefix. Valid values:</p>
         * <br>
         * <p>*   **Include**: fuzzy match. A route is a match if the route prefix is included in the match conditions.</p>
         * <br>
         * <p>    For example, if you set the match condition to 10.10.0.0/16 and fuzzy match is enabled, the route whose prefix is 10.10.1.0/24 is a match.</p>
         * <br>
         * <p>*   **Complete**: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</p>
         * <br>
         * <p>    For example, if you set the match condition to 10.10.0.0/16 and exact match is enabled, a route is a match only if the prefix is 10.10.0.0/16.</p>
         */
        @NameInMap("NextPriority")
        public Integer nextPriority;

        @NameInMap("OperateCommunitySet")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet operateCommunitySet;

        /**
         * <p>The prefixes of the routes.</p>
         */
        @NameInMap("Preference")
        public Integer preference;

        @NameInMap("PrependAsPath")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath prependAsPath;

        /**
         * <p>The ID of the region where the routing policy is applied.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of IP address to be matched against the match condition. Valid values:</p>
         * <br>
         * <p>*   **IPv4**: IPv4 addresses</p>
         * <p>*   **IPv6**: IPv6 addresses</p>
         * <p>*   If no value is returned, both IPv4 and IPv6 addresses are matched against the match condition.</p>
         */
        @NameInMap("RouteMapId")
        public String routeMapId;

        @NameInMap("RouteTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes routeTypes;

        /**
         * <p>The community set based on which the routes are compared.</p>
         */
        @NameInMap("SourceChildInstanceTypes")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes sourceChildInstanceTypes;

        /**
         * <p>The direction in which the routing policy is applied.</p>
         */
        @NameInMap("SourceInstanceIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds sourceInstanceIds;

        /**
         * <p>The ID of the routing policy.</p>
         */
        @NameInMap("SourceInstanceIdsReverseMatch")
        public Boolean sourceInstanceIdsReverseMatch;

        /**
         * <p>The status of the routing policy. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The routing policy is being created.</p>
         * <p>*   **Active**: The routing policy is available.</p>
         * <p>*   **Deleting**: The routing policy is being deleted.</p>
         */
        @NameInMap("SourceRegionIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds sourceRegionIds;

        /**
         * <p>Queries the routing policies of a Cloud Enterprise Network (CEN) instance.</p>
         */
        @NameInMap("SourceRouteTableIds")
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds sourceRouteTableIds;

        /**
         * <p>The new priority of the route.</p>
         * <br>
         * <p>A smaller value indicates a higher priority.</p>
         * <br>
         * <p>This parameter indicates the action to be performed when a route meets the match condition.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The action that is performed on the community of the route.</p>
         * <br>
         * <p>*   **Additive**: adds the community to the route.</p>
         * <p>*   **Replace**: replaces the original community of the route.</p>
         * <br>
         * <p>This parameter indicates the action to be performed when a route meets the match condition.</p>
         */
        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        /**
         * <p>The ID of the routing policy.</p>
         */
        @NameInMap("TransmitDirection")
        public String transmitDirection;

        public static DescribeCenRouteMapsResponseBodyRouteMapsRouteMap build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMapsRouteMap self = new DescribeCenRouteMapsResponseBodyRouteMapsRouteMap();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setAsPathMatchMode(String asPathMatchMode) {
            this.asPathMatchMode = asPathMatchMode;
            return this;
        }
        public String getAsPathMatchMode() {
            return this.asPathMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCenRegionId(String cenRegionId) {
            this.cenRegionId = cenRegionId;
            return this;
        }
        public String getCenRegionId() {
            return this.cenRegionId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCidrMatchMode(String cidrMatchMode) {
            this.cidrMatchMode = cidrMatchMode;
            return this;
        }
        public String getCidrMatchMode() {
            return this.cidrMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCommunityMatchMode(String communityMatchMode) {
            this.communityMatchMode = communityMatchMode;
            return this;
        }
        public String getCommunityMatchMode() {
            return this.communityMatchMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setCommunityOperateMode(String communityOperateMode) {
            this.communityOperateMode = communityOperateMode;
            return this;
        }
        public String getCommunityOperateMode() {
            return this.communityOperateMode;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationChildInstanceTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes destinationChildInstanceTypes) {
            this.destinationChildInstanceTypes = destinationChildInstanceTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationChildInstanceTypes getDestinationChildInstanceTypes() {
            return this.destinationChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationCidrBlocks(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks destinationCidrBlocks) {
            this.destinationCidrBlocks = destinationCidrBlocks;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationCidrBlocks getDestinationCidrBlocks() {
            return this.destinationCidrBlocks;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationInstanceIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds destinationInstanceIds) {
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationInstanceIds getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setDestinationRouteTableIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds destinationRouteTableIds) {
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapDestinationRouteTableIds getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMapResult(String mapResult) {
            this.mapResult = mapResult;
            return this;
        }
        public String getMapResult() {
            return this.mapResult;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchAddressType(String matchAddressType) {
            this.matchAddressType = matchAddressType;
            return this;
        }
        public String getMatchAddressType() {
            return this.matchAddressType;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchAsns(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns matchAsns) {
            this.matchAsns = matchAsns;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchAsns getMatchAsns() {
            return this.matchAsns;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setMatchCommunitySet(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet matchCommunitySet) {
            this.matchCommunitySet = matchCommunitySet;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapMatchCommunitySet getMatchCommunitySet() {
            return this.matchCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setNextPriority(Integer nextPriority) {
            this.nextPriority = nextPriority;
            return this;
        }
        public Integer getNextPriority() {
            return this.nextPriority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setOperateCommunitySet(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet operateCommunitySet) {
            this.operateCommunitySet = operateCommunitySet;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapOperateCommunitySet getOperateCommunitySet() {
            return this.operateCommunitySet;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPrependAsPath(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath prependAsPath) {
            this.prependAsPath = prependAsPath;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapPrependAsPath getPrependAsPath() {
            return this.prependAsPath;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setRouteTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes routeTypes) {
            this.routeTypes = routeTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapRouteTypes getRouteTypes() {
            return this.routeTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceChildInstanceTypes(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes sourceChildInstanceTypes) {
            this.sourceChildInstanceTypes = sourceChildInstanceTypes;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceChildInstanceTypes getSourceChildInstanceTypes() {
            return this.sourceChildInstanceTypes;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceInstanceIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds sourceInstanceIds) {
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceInstanceIds getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceRegionIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds sourceRegionIds) {
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRegionIds getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setSourceRouteTableIds(DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds sourceRouteTableIds) {
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }
        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMapSourceRouteTableIds getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        public DescribeCenRouteMapsResponseBodyRouteMapsRouteMap setTransmitDirection(String transmitDirection) {
            this.transmitDirection = transmitDirection;
            return this;
        }
        public String getTransmitDirection() {
            return this.transmitDirection;
        }

    }

    public static class DescribeCenRouteMapsResponseBodyRouteMaps extends TeaModel {
        @NameInMap("RouteMap")
        public java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> routeMap;

        public static DescribeCenRouteMapsResponseBodyRouteMaps build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenRouteMapsResponseBodyRouteMaps self = new DescribeCenRouteMapsResponseBodyRouteMaps();
            return TeaModel.build(map, self);
        }

        public DescribeCenRouteMapsResponseBodyRouteMaps setRouteMap(java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> routeMap) {
            this.routeMap = routeMap;
            return this;
        }
        public java.util.List<DescribeCenRouteMapsResponseBodyRouteMapsRouteMap> getRouteMap() {
            return this.routeMap;
        }

    }

}
