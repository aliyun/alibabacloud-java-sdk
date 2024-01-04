// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapRequest extends TeaModel {
    /**
     * <p>The match method that is used to match routes against the AS paths. Valid values:</p>
     * <br>
     * <p>*   **Include**: fuzzy match. A route meets the match condition if the AS path of the route overlaps with the AS paths specified in the match condition.</p>
     * <p>*   **Complete**: exact match. A route is a match only if the AS path of the route is the same as an AS path specified in the match condition.</p>
     */
    @NameInMap("AsPathMatchMode")
    public String asPathMatchMode;

    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the region in which the routing policy is applied.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("CenRegionId")
    public String cenRegionId;

    /**
     * <p>The match method that is used to match routes against the prefix list. Valid values:</p>
     * <br>
     * <p>*   **Include**: fuzzy match. A route is a match if the route prefix is included in the match conditions.</p>
     * <br>
     * <p>    For example, if you set the match condition to 10.10.0.0/16 and fuzzy match is enabled, the route whose prefix is 10.10.1.0/24 is a match.</p>
     * <br>
     * <p>*   **Complete**: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</p>
     * <br>
     * <p>    For example, if you set the match condition to 10.10.0.0/16 and exact match is enabled, a route is a match only if the prefix is 10.10.0.0/16.</p>
     */
    @NameInMap("CidrMatchMode")
    public String cidrMatchMode;

    /**
     * <p>The match method that is used to match routes based on the community. Valid values:</p>
     * <br>
     * <p>*   **Include**: fuzzy match. A route meets the match condition if the community of the route overlaps with the community specified in the match condition.</p>
     * <p>*   **Complete**: exact match. A route meets the match condition only if the community of the route is the same as the community specified in the match condition.</p>
     */
    @NameInMap("CommunityMatchMode")
    public String communityMatchMode;

    /**
     * <p>The action that is performed on the community. Valid values:</p>
     * <br>
     * <p>*   **Additive**: adds the community to the route.</p>
     * <p>*   **Replace**: replaces the original community of the route.</p>
     * <br>
     * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
     */
    @NameInMap("CommunityOperateMode")
    public String communityOperateMode;

    /**
     * <p>The description of the routing policy.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, hyphens (-), periods (.), and underscores (\_). It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The types of destination network instance to which the routes belong. The following types of network instances are supported:</p>
     * <br>
     * <p>*   **VPC**: VPC</p>
     * <br>
     * <p>*   **VBR**: VBR</p>
     * <br>
     * <p>*   **CCN**: CCN instance</p>
     * <br>
     * <p>*   **VPN**: IPsec connection</p>
     * <br>
     * <p>    >This parameter does not take effect if the IPsec-VPN connection or SSL client is associated with a transit router through a VPN gateway and a VPC. This parameter takes effect only if the IPsec connection is directly connected to the transit router.</p>
     * <br>
     * <p>You can specify one or more network instance types.</p>
     * <br>
     * <p>> The destination network instance types are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.</p>
     */
    @NameInMap("DestinationChildInstanceTypes")
    public java.util.List<String> destinationChildInstanceTypes;

    /**
     * <p>The prefix list against which routes are matched.</p>
     * <br>
     * <p>You must specify the IP addresses in CIDR notation. You can enter at most 32 CIDR blocks.</p>
     */
    @NameInMap("DestinationCidrBlocks")
    public java.util.List<String> destinationCidrBlocks;

    /**
     * <p>The IDs of the destination network instances to which the routes belong. The following network instance types are supported:</p>
     * <br>
     * <p>*   VPC</p>
     * <p>*   VBR</p>
     * <p>*   CCN instance</p>
     * <p>*   SAG instance</p>
     * <p>*   The ID of the IPsec-VPN connection.</p>
     * <br>
     * <p>You can enter at most 32 IDs.</p>
     * <br>
     * <p>> The destination instance IDs take effect only when Direction is set to Export from Regional Gateway and the destination instances are deployed in the current region.</p>
     */
    @NameInMap("DestinationInstanceIds")
    public java.util.List<String> destinationInstanceIds;

    /**
     * <p>Specifies whether to exclude the destination network instance IDs. Valid values:</p>
     * <br>
     * <p>*   **false** (default value): A route is a match if its destination network instance ID is in the list specified by **DestinationInstanceIds.N**.</p>
     * <p>*   **true**: A route meets the match condition if its destination network instance ID is not in the list specified by **DestinationInstanceIds.N**.</p>
     */
    @NameInMap("DestinationInstanceIdsReverseMatch")
    public Boolean destinationInstanceIdsReverseMatch;

    /**
     * <p>The IDs of the destination route tables to which routes are evaluated. You can enter at most 32 route table IDs.</p>
     * <br>
     * <p>> The destination route table IDs take effect only when Direction is set to Export from Regional Gateway and the destination route tables belong to network instances deployed in the current region.</p>
     */
    @NameInMap("DestinationRouteTableIds")
    public java.util.List<String> destinationRouteTableIds;

    /**
     * <p>The action to be performed on a route that meets all match conditions. Valid values:</p>
     * <br>
     * <p>*   **Permit**: the route is permitted.</p>
     * <p>*   **Deny**: the route is denied.</p>
     */
    @NameInMap("MapResult")
    public String mapResult;

    /**
     * <p>The type of IP address in the match condition. Valid values:</p>
     * <br>
     * <p>*   **IPv4**: IPv4 address</p>
     * <p>*   **IPv6**: IPv6 address</p>
     * <br>
     * <p>This parameter can be empty. If no value is specified, all types of IP address are a match.</p>
     */
    @NameInMap("MatchAddressType")
    public String matchAddressType;

    /**
     * <p>The AS paths based on which routes are compared.</p>
     * <br>
     * <p>You can specify at most 32 AS numbers.</p>
     * <br>
     * <p>> Only the AS-SEQUENCE parameter is supported. The AS-SET, AS-CONFED-SEQUENCE, and AS-CONFED-SET parameters are not supported. In other words, only the AS number list is supported. Sets and sub-lists are not supported.</p>
     */
    @NameInMap("MatchAsns")
    public java.util.List<Long> matchAsns;

    /**
     * <p>The community set based on which routes are compared.</p>
     * <br>
     * <p>Specify the community in the format of n:m. Valid values of n and m: **1** to **65535**. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines Border Gateway Protocol (BGP) large communities is not supported.</p>
     * <br>
     * <p>You can specify at most 32 communities.</p>
     * <br>
     * <p>> If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.</p>
     */
    @NameInMap("MatchCommunitySet")
    public java.util.List<String> matchCommunitySet;

    /**
     * <p>The priority of the routing policy that you want to associate with the current one.</p>
     * <br>
     * <p>*   This parameter takes effect only when the **MapResult** parameter is set to **Permit**. This way, the permitted route is matched against the next routing policy.</p>
     * <p>*   The region and direction of the routing policy to be associated must be the same as those of the current routing policy.</p>
     * <p>*   The priority of the next routing policy must be lower than the priority of the current routing policy.</p>
     */
    @NameInMap("NextPriority")
    public Integer nextPriority;

    /**
     * <p>The community set on which actions are performed.</p>
     * <br>
     * <p>Specify the community in the format of n:m. Valid values of n and m: **1** to **65535**. Each community must comply with RFC 1997. The RFC 8092 standard that defines BGP large communities is not supported.</p>
     * <br>
     * <p>You can specify at most 32 communities.</p>
     * <br>
     * <p>> If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.</p>
     */
    @NameInMap("OperateCommunitySet")
    public java.util.List<String> operateCommunitySet;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new priority of the route.</p>
     * <br>
     * <p>Valid values: **1** to **100**. The default priority is **50**. A smaller value indicates a higher priority.</p>
     * <br>
     * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
     */
    @NameInMap("Preference")
    public Integer preference;

    /**
     * <p>The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.</p>
     * <br>
     * <p>The AS paths vary based on the direction in which the routing policy is applied:</p>
     * <br>
     * <p>*   If AS paths are prepended to a routing policy that is applied in the inbound direction, you must specify source network instance IDs and the source region in the match condition. In addition, the source region must be the same as the region where the routing policy is applied.</p>
     * <p>*   If AS paths are prepended to a routing policy that is applied in the outbound direction, you must specify destination network instance IDs in the match condition.</p>
     * <br>
     * <p>This parameter specifies the action to be performed when a route meets the match condition. You can specify at most 32 AS numbers.</p>
     */
    @NameInMap("PrependAsPath")
    public java.util.List<Long> prependAsPath;

    /**
     * <p>The priority of the routing policy. Valid values: **1** to **100**. A smaller value indicates a higher priority.</p>
     * <br>
     * <p>> You cannot specify the same priority for routing policies that apply in the same region and direction. The system matches routes against the match conditions of routing policies in descending order of priority. A smaller value indicates a higher priority. You must set the priorities to proper values.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of route to be compared. Valid values: The following route types are supported:</p>
     * <br>
     * <p>*   **System**: system routes that are automatically generated by the system.</p>
     * <p>*   **Custom**: custom routes that are manually added.</p>
     * <p>*   **BGP**: routes that are advertised over BGP.</p>
     * <br>
     * <p>You can specify multiple route types.</p>
     */
    @NameInMap("RouteTypes")
    public java.util.List<String> routeTypes;

    /**
     * <p>The types of source network instance to which the routes belong. The following types of network instances are supported:</p>
     * <br>
     * <p>*   **VPC**: VPC</p>
     * <br>
     * <p>*   **VBR**: VBR</p>
     * <br>
     * <p>*   **CCN**: CCN instance</p>
     * <br>
     * <p>*   **VPN**: VPN gateway or IPsec connection</p>
     * <br>
     * <p>    *   If the IPsec-VPN connection or SSL client is associated with a VPN gateway, the VPC associated with the VPN gateway must be connected to a transit router, and the VPN gateway must use BGP dynamic routing. Otherwise, this parameter cannot take effect.</p>
     * <p>    *   This parameter takes effect if the IPsec connection is directly connected to a transit router.</p>
     * <br>
     * <p>You can specify one or more network instance types.</p>
     */
    @NameInMap("SourceChildInstanceTypes")
    public java.util.List<String> sourceChildInstanceTypes;

    /**
     * <p>The IDs of the source network instances to which the routes belong. The following network instance types are supported:</p>
     * <br>
     * <p>*   Virtual private cloud (VPC)</p>
     * <p>*   Virtual border router (VBR)</p>
     * <p>*   Cloud Connect Network (CCN) instance</p>
     * <p>*   Smart Access Gateway (SAG) instance</p>
     * <p>*   The ID of the IPsec-VPN connection.</p>
     * <br>
     * <p>You can enter at most 32 IDs.</p>
     */
    @NameInMap("SourceInstanceIds")
    public java.util.List<String> sourceInstanceIds;

    /**
     * <p>Specifies whether to exclude the source network instance IDs. Valid values:</p>
     * <br>
     * <p>*   **false** (default value): A route is a match if its source network instance ID is in the list specified by **SourceInstanceIds.N**.</p>
     * <p>*   **true**: A route is a match if its source network instance ID is not in the list specified by **SourceInstanceIds.N**.</p>
     */
    @NameInMap("SourceInstanceIdsReverseMatch")
    public Boolean sourceInstanceIdsReverseMatch;

    /**
     * <p>The IDs of the source regions from which routes are evaluated. You can enter at most 32 region IDs.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("SourceRegionIds")
    public java.util.List<String> sourceRegionIds;

    /**
     * <p>The IDs of the source route tables from which routes are evaluated. You can enter at most 32 route table IDs.</p>
     */
    @NameInMap("SourceRouteTableIds")
    public java.util.List<String> sourceRouteTableIds;

    /**
     * <p>The ID of the route table of the transit router.</p>
     * <br>
     * <p>If you do not specify a route table ID, the routing policy is automatically associated with the default route table of the transit router.</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    /**
     * <p>The direction in which the routing policy is applied. Valid values:</p>
     * <br>
     * <p>*   **RegionIn**: Routes are advertised to the gateways in the regions that are connected by the CEN instance.</p>
     * <br>
     * <p>    For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.</p>
     * <br>
     * <p>*   **RegionOut**: Routes are advertised from the gateways in the regions that are connected by the CEN instance.</p>
     * <br>
     * <p>    For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the same region, or to gateways deployed in other regions.</p>
     */
    @NameInMap("TransmitDirection")
    public String transmitDirection;

    public static CreateCenRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenRouteMapRequest self = new CreateCenRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenRouteMapRequest setAsPathMatchMode(String asPathMatchMode) {
        this.asPathMatchMode = asPathMatchMode;
        return this;
    }
    public String getAsPathMatchMode() {
        return this.asPathMatchMode;
    }

    public CreateCenRouteMapRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenRouteMapRequest setCenRegionId(String cenRegionId) {
        this.cenRegionId = cenRegionId;
        return this;
    }
    public String getCenRegionId() {
        return this.cenRegionId;
    }

    public CreateCenRouteMapRequest setCidrMatchMode(String cidrMatchMode) {
        this.cidrMatchMode = cidrMatchMode;
        return this;
    }
    public String getCidrMatchMode() {
        return this.cidrMatchMode;
    }

    public CreateCenRouteMapRequest setCommunityMatchMode(String communityMatchMode) {
        this.communityMatchMode = communityMatchMode;
        return this;
    }
    public String getCommunityMatchMode() {
        return this.communityMatchMode;
    }

    public CreateCenRouteMapRequest setCommunityOperateMode(String communityOperateMode) {
        this.communityOperateMode = communityOperateMode;
        return this;
    }
    public String getCommunityOperateMode() {
        return this.communityOperateMode;
    }

    public CreateCenRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCenRouteMapRequest setDestinationChildInstanceTypes(java.util.List<String> destinationChildInstanceTypes) {
        this.destinationChildInstanceTypes = destinationChildInstanceTypes;
        return this;
    }
    public java.util.List<String> getDestinationChildInstanceTypes() {
        return this.destinationChildInstanceTypes;
    }

    public CreateCenRouteMapRequest setDestinationCidrBlocks(java.util.List<String> destinationCidrBlocks) {
        this.destinationCidrBlocks = destinationCidrBlocks;
        return this;
    }
    public java.util.List<String> getDestinationCidrBlocks() {
        return this.destinationCidrBlocks;
    }

    public CreateCenRouteMapRequest setDestinationInstanceIds(java.util.List<String> destinationInstanceIds) {
        this.destinationInstanceIds = destinationInstanceIds;
        return this;
    }
    public java.util.List<String> getDestinationInstanceIds() {
        return this.destinationInstanceIds;
    }

    public CreateCenRouteMapRequest setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
        this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
        return this;
    }
    public Boolean getDestinationInstanceIdsReverseMatch() {
        return this.destinationInstanceIdsReverseMatch;
    }

    public CreateCenRouteMapRequest setDestinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
        this.destinationRouteTableIds = destinationRouteTableIds;
        return this;
    }
    public java.util.List<String> getDestinationRouteTableIds() {
        return this.destinationRouteTableIds;
    }

    public CreateCenRouteMapRequest setMapResult(String mapResult) {
        this.mapResult = mapResult;
        return this;
    }
    public String getMapResult() {
        return this.mapResult;
    }

    public CreateCenRouteMapRequest setMatchAddressType(String matchAddressType) {
        this.matchAddressType = matchAddressType;
        return this;
    }
    public String getMatchAddressType() {
        return this.matchAddressType;
    }

    public CreateCenRouteMapRequest setMatchAsns(java.util.List<Long> matchAsns) {
        this.matchAsns = matchAsns;
        return this;
    }
    public java.util.List<Long> getMatchAsns() {
        return this.matchAsns;
    }

    public CreateCenRouteMapRequest setMatchCommunitySet(java.util.List<String> matchCommunitySet) {
        this.matchCommunitySet = matchCommunitySet;
        return this;
    }
    public java.util.List<String> getMatchCommunitySet() {
        return this.matchCommunitySet;
    }

    public CreateCenRouteMapRequest setNextPriority(Integer nextPriority) {
        this.nextPriority = nextPriority;
        return this;
    }
    public Integer getNextPriority() {
        return this.nextPriority;
    }

    public CreateCenRouteMapRequest setOperateCommunitySet(java.util.List<String> operateCommunitySet) {
        this.operateCommunitySet = operateCommunitySet;
        return this;
    }
    public java.util.List<String> getOperateCommunitySet() {
        return this.operateCommunitySet;
    }

    public CreateCenRouteMapRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenRouteMapRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenRouteMapRequest setPreference(Integer preference) {
        this.preference = preference;
        return this;
    }
    public Integer getPreference() {
        return this.preference;
    }

    public CreateCenRouteMapRequest setPrependAsPath(java.util.List<Long> prependAsPath) {
        this.prependAsPath = prependAsPath;
        return this;
    }
    public java.util.List<Long> getPrependAsPath() {
        return this.prependAsPath;
    }

    public CreateCenRouteMapRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateCenRouteMapRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenRouteMapRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenRouteMapRequest setRouteTypes(java.util.List<String> routeTypes) {
        this.routeTypes = routeTypes;
        return this;
    }
    public java.util.List<String> getRouteTypes() {
        return this.routeTypes;
    }

    public CreateCenRouteMapRequest setSourceChildInstanceTypes(java.util.List<String> sourceChildInstanceTypes) {
        this.sourceChildInstanceTypes = sourceChildInstanceTypes;
        return this;
    }
    public java.util.List<String> getSourceChildInstanceTypes() {
        return this.sourceChildInstanceTypes;
    }

    public CreateCenRouteMapRequest setSourceInstanceIds(java.util.List<String> sourceInstanceIds) {
        this.sourceInstanceIds = sourceInstanceIds;
        return this;
    }
    public java.util.List<String> getSourceInstanceIds() {
        return this.sourceInstanceIds;
    }

    public CreateCenRouteMapRequest setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
        this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
        return this;
    }
    public Boolean getSourceInstanceIdsReverseMatch() {
        return this.sourceInstanceIdsReverseMatch;
    }

    public CreateCenRouteMapRequest setSourceRegionIds(java.util.List<String> sourceRegionIds) {
        this.sourceRegionIds = sourceRegionIds;
        return this;
    }
    public java.util.List<String> getSourceRegionIds() {
        return this.sourceRegionIds;
    }

    public CreateCenRouteMapRequest setSourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
        this.sourceRouteTableIds = sourceRouteTableIds;
        return this;
    }
    public java.util.List<String> getSourceRouteTableIds() {
        return this.sourceRouteTableIds;
    }

    public CreateCenRouteMapRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public CreateCenRouteMapRequest setTransmitDirection(String transmitDirection) {
        this.transmitDirection = transmitDirection;
        return this;
    }
    public String getTransmitDirection() {
        return this.transmitDirection;
    }

}
