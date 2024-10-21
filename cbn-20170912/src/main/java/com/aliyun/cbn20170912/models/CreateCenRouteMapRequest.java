// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapRequest extends TeaModel {
    /**
     * <p>The match method that is used to match routes based on the AS path. Valid values:</p>
     * <ul>
     * <li><strong>Include</strong>: fuzzy match. A route is a match if the AS path of the route overlaps with the AS path in the match conditions.</li>
     * <li><strong>Complete</strong>: exact match. A route is a match only if the AS path of the route matches the AS path in the match conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("AsPathMatchMode")
    public String asPathMatchMode;

    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the region in which the routing policy is applied.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CenRegionId")
    public String cenRegionId;

    /**
     * <p>The match method that is used to match routes against the prefix list. Valid values:</p>
     * <ul>
     * <li><strong>Include</strong>: fuzzy match. A route is a match if the route prefix is included in the match conditions.</li>
     * </ul>
     * <p>For example, if you set the match condition to 1.1.0.0/16 and fuzzy match is applied, the route whose prefix is 1.1.1.0/24 meets the match condition.</p>
     * <ul>
     * <li><strong>Complete</strong>: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</li>
     * </ul>
     * <p>For example, if you set the match condition to 1.1.0.0/16 and exact match is applied, only the route whose prefix is 1.1.0.0/16 meets the match condition.</p>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CidrMatchMode")
    public String cidrMatchMode;

    /**
     * <p>The match method that is used to match routes based on the community. Valid values:</p>
     * <ul>
     * <li><strong>Include</strong>: fuzzy match. A route is a match if the community of the route overlaps with the community in the match conditions.</li>
     * <li><strong>Complete</strong>: exact match. A route is a match only if the community of the route matches the community in the match conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CommunityMatchMode")
    public String communityMatchMode;

    /**
     * <p>The action to be performed on the community. Valid values:</p>
     * <ul>
     * <li><strong>Additive</strong>: adds the community to the route.</li>
     * <li><strong>Replace</strong>: replaces the original community of the route.</li>
     * </ul>
     * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
     * 
     * <strong>example:</strong>
     * <p>Additive</p>
     */
    @NameInMap("CommunityOperateMode")
    public String communityOperateMode;

    /**
     * <p>The description of the routing policy.</p>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The types of destination network instance to which the routes belong. The following types of network instances are supported:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC</p>
     * </li>
     * <li><p><strong>VBR</strong>: VBR</p>
     * </li>
     * <li><p><strong>CCN</strong>: CCN instance</p>
     * </li>
     * <li><p><strong>VPN</strong>: IPsec connection</p>
     * <blockquote>
     * <p>This parameter does not take effect if the IPsec-VPN connection or SSL client is associated with a transit router through a VPN gateway and a VPC. This parameter takes effect only if the IPsec connection is directly connected to the transit router.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>You can specify one or more network instance types.</p>
     * <blockquote>
     * <p>The destination network instance types are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DestinationChildInstanceTypes")
    public java.util.List<String> destinationChildInstanceTypes;

    /**
     * <p>The prefix list against which routes are matched.</p>
     * <p>You must specify the IP addresses in CIDR notation. You can enter at most 32 CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("DestinationCidrBlocks")
    public java.util.List<String> destinationCidrBlocks;

    /**
     * <p>The IDs of the destination network instances to which the routes belong. The following network instance types are supported:</p>
     * <ul>
     * <li>VPC</li>
     * <li>VBR</li>
     * <li>CCN instance</li>
     * <li>SAG instance</li>
     * <li>The ID of the IPsec-VPN connection.</li>
     * </ul>
     * <p>You can enter at most 32 IDs.</p>
     * <blockquote>
     * <p>The destination instance IDs take effect only when Direction is set to Export from Regional Gateway and the destination instances are deployed in the current region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-afrfs434465fdf****</p>
     */
    @NameInMap("DestinationInstanceIds")
    public java.util.List<String> destinationInstanceIds;

    /**
     * <p>Specifies whether to exclude destination instance IDs. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): A route is a match if the destination instance ID is included in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
     * <li><strong>true</strong>: A route is a match if the destination network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DestinationInstanceIdsReverseMatch")
    public Boolean destinationInstanceIdsReverseMatch;

    @NameInMap("DestinationRegionIds")
    public java.util.List<String> destinationRegionIds;

    /**
     * <p>The IDs of the destination route tables to which routes are evaluated. You can enter at most 32 route table IDs.</p>
     * <blockquote>
     * <p>The destination route table IDs take effect only when Direction is set to Export from Regional Gateway and the destination route tables belong to network instances deployed in the current region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vtb-adefrgtr144vf****</p>
     */
    @NameInMap("DestinationRouteTableIds")
    public java.util.List<String> destinationRouteTableIds;

    /**
     * <p>The action to be performed on a route that meets all the match conditions. Valid values:</p>
     * <ul>
     * <li><strong>Permit</strong>: the route is permitted.</li>
     * <li><strong>Deny</strong>: the route is denied.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Permit</p>
     */
    @NameInMap("MapResult")
    public String mapResult;

    /**
     * <p>The type of IP address in the match condition. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4 address</li>
     * <li><strong>IPv6</strong>: IPv6 address</li>
     * </ul>
     * <p>This parameter can be empty. If no value is specified, all types of IP address are a match.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("MatchAddressType")
    public String matchAddressType;

    /**
     * <p>The AS paths based on which routes are compared.</p>
     * <p>You can specify at most 32 AS numbers.</p>
     * <blockquote>
     * <p>Only the AS-SEQUENCE parameter is supported. The AS-SET, AS-CONFED-SEQUENCE, and AS-CONFED-SET parameters are not supported. In other words, only the AS number list is supported. Sets and sub-lists are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("MatchAsns")
    public java.util.List<Long> matchAsns;

    /**
     * <p>The community set based on which routes are compared.</p>
     * <p>Specify the community in the format of n:m. Valid values of n and m: <strong>1</strong> to <strong>65535</strong>. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines Border Gateway Protocol (BGP) large communities is not supported.</p>
     * <p>You can specify at most 32 communities.</p>
     * <blockquote>
     * <p>If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501:1</p>
     */
    @NameInMap("MatchCommunitySet")
    public java.util.List<String> matchCommunitySet;

    /**
     * <p>The priority of the routing policy that you want to associate with the current one.</p>
     * <ul>
     * <li>This parameter takes effect only when the <strong>MapResult</strong> parameter is set to <strong>Permit</strong>. This way, the permitted route is matched against the next routing policy.</li>
     * <li>The region and direction of the routing policy to be associated must be the same as those of the current routing policy.</li>
     * <li>The priority of the next routing policy must be lower than the priority of the current routing policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NextPriority")
    public Integer nextPriority;

    /**
     * <p>The community set on which actions are performed.</p>
     * <p>Specify the community in the format of n:m. Valid values of n and m: <strong>1</strong> to <strong>65535</strong>. Each community must comply with RFC 1997. The RFC 8092 standard that defines BGP large communities is not supported.</p>
     * <p>You can specify at most 32 communities.</p>
     * <blockquote>
     * <p>If the configurations of the communities are incorrect, routes may fail to be advertised to your data center.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501:1</p>
     */
    @NameInMap("OperateCommunitySet")
    public java.util.List<String> operateCommunitySet;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new priority of the route.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100</strong>. The default priority is <strong>50</strong>. A smaller value indicates a higher priority.</p>
     * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Preference")
    public Integer preference;

    /**
     * <p>The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.</p>
     * <p>The AS paths vary based on the direction in which the routing policy is applied:</p>
     * <ul>
     * <li>If AS paths are prepended to a routing policy that is applied in the inbound direction, you must specify source network instance IDs and the source region in the match condition. In addition, the source region must be the same as the region where the routing policy is applied.</li>
     * <li>If AS paths are prepended to a routing policy that is applied in the outbound direction, you must specify destination network instance IDs in the match condition.</li>
     * </ul>
     * <p>This parameter specifies the action to be performed when a route meets the match condition. You can specify at most 32 AS numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("PrependAsPath")
    public java.util.List<Long> prependAsPath;

    /**
     * <p>The priority of the routing policy. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>You cannot specify the same priority for routing policies that apply in the same region and direction. The system matches routes against the match conditions of routing policies in descending order of priority. A smaller value indicates a higher priority. You must set the priorities to proper values.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of route to be compared. Valid values: The following route types are supported:</p>
     * <ul>
     * <li><strong>System</strong>: system routes that are automatically generated by the system.</li>
     * <li><strong>Custom</strong>: custom routes that are manually added.</li>
     * <li><strong>BGP</strong>: routes that are advertised over BGP.</li>
     * </ul>
     * <p>You can specify multiple route types.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("RouteTypes")
    public java.util.List<String> routeTypes;

    /**
     * <p>The types of source network instance to which the routes belong. The following types of network instances are supported:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC</p>
     * </li>
     * <li><p><strong>VBR</strong>: VBR</p>
     * </li>
     * <li><p><strong>CCN</strong>: CCN instance</p>
     * </li>
     * <li><p><strong>VPN</strong>: VPN gateway or IPsec connection</p>
     * <ul>
     * <li>If the IPsec-VPN connection or SSL client is associated with a VPN gateway, the VPC associated with the VPN gateway must be connected to a transit router, and the VPN gateway must use BGP dynamic routing. Otherwise, this parameter cannot take effect.</li>
     * <li>This parameter takes effect if the IPsec connection is directly connected to a transit router.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>You can specify one or more network instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("SourceChildInstanceTypes")
    public java.util.List<String> sourceChildInstanceTypes;

    /**
     * <p>The IDs of the source network instances to which the routes belong. The following network instance types are supported:</p>
     * <ul>
     * <li>Virtual private cloud (VPC)</li>
     * <li>Virtual border router (VBR)</li>
     * <li>Cloud Connect Network (CCN) instance</li>
     * <li>Smart Access Gateway (SAG) instance</li>
     * <li>The ID of the IPsec-VPN connection.</li>
     * </ul>
     * <p>You can enter at most 32 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-adeg3544fdf34vf****</p>
     */
    @NameInMap("SourceInstanceIds")
    public java.util.List<String> sourceInstanceIds;

    /**
     * <p>Specifies whether to exclude source instance IDs. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): A route is a match if the source instance ID is included in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
     * <li><strong>true</strong>: A route is a match if the source network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceInstanceIdsReverseMatch")
    public Boolean sourceInstanceIdsReverseMatch;

    /**
     * <p>The IDs of the source regions from which routes are evaluated. You can enter at most 32 region IDs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionIds")
    public java.util.List<String> sourceRegionIds;

    /**
     * <p>The IDs of the source route tables from which routes are evaluated. You can enter at most 32 route table IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-adfr233vf34rvd4****</p>
     */
    @NameInMap("SourceRouteTableIds")
    public java.util.List<String> sourceRouteTableIds;

    /**
     * <p>The ID of the route table of the transit router.</p>
     * <p>If you do not specify a route table ID, the routing policy is automatically associated with the default route table of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-gw8nx3515m1mbd1z1****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    /**
     * <p>The direction in which the routing policy is applied. Valid values:</p>
     * <ul>
     * <li><strong>RegionIn</strong>: Routes are advertised to the gateways in the regions that are connected by the CEN instance.</li>
     * </ul>
     * <p>For example, routes are advertised from network instances deployed in the current region or other regions to the gateway deployed in the current region.</p>
     * <ul>
     * <li><strong>RegionOut</strong>: Routes are advertised from the gateways in the regions that are connected by the CEN instance.</li>
     * </ul>
     * <p>For example, routes are advertised from the gateway deployed in the current region to network instances deployed in the same region, or to gateways deployed in other regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RegionIn</p>
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

    public CreateCenRouteMapRequest setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
        this.destinationRegionIds = destinationRegionIds;
        return this;
    }
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
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
