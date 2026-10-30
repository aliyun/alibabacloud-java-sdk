// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRouteMapRequest extends TeaModel {
    /**
     * <p>The match mode of the AS path list. Valid values:</p>
     * <ul>
     * <li><p><strong>Include</strong>: fuzzy match. A route meets the match condition if the AS path in the match condition overlaps with the AS path of the route. </p>
     * </li>
     * <li><p><strong>Complete</strong>: exact match. A route meets the match condition only if the AS path in the match condition is exactly the same as the AS path of the route.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("AsPathMatchMode")
    public String asPathMatchMode;

    /**
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the region where the route map is applied.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CenRegionId")
    public String cenRegionId;

    /**
     * <p>The match mode of the prefix list. Valid values:</p>
     * <ul>
     * <li><strong>Include</strong>: fuzzy match. A route meets the match condition if the route prefix in the match condition contains the prefix of the route.</li>
     * </ul>
     * <p> For example, if the match condition is 10.10.0.0/16, a route with the prefix 10.10.1.0/24 meets the condition.</p>
     * <ul>
     * <li><strong>Complete</strong>: exact match. A route meets the match condition only if the route prefix in the match condition is exactly the same as the prefix of the route.</li>
     * </ul>
     * <p> For example, if the match condition is 10.10.0.0/16, only a route with the prefix 10.10.0.0/16 meets the condition.</p>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CidrMatchMode")
    public String cidrMatchMode;

    /**
     * <p>The match mode of the community. Valid values:</p>
     * <ul>
     * <li><p><strong>Include</strong>: fuzzy match. A route meets the match condition if the community in the match condition overlaps with the community of the route. </p>
     * </li>
     * <li><p><strong>Complete</strong>: exact match. A route meets the match condition only if the community in the match condition is exactly the same as the community of the route.</p>
     * </li>
     * <li><p><strong>Contain</strong>: contain match. A route meets the match condition only if the community of the route contains all communities specified in the match condition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CommunityMatchMode")
    public String communityMatchMode;

    /**
     * <p>The action mode of the community. Valid values:</p>
     * <ul>
     * <li><p><strong>Additive</strong>: adds a community to the route.</p>
     * </li>
     * <li><p><strong>Replace</strong>: replaces the existing community of the route.</p>
     * </li>
     * </ul>
     * <p>This parameter specifies the action to be performed after a route meets the match conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>Additive</p>
     */
    @NameInMap("CommunityOperateMode")
    public String communityOperateMode;

    /**
     * <p>The description of the route map. The description must be 1 to 256 characters in length, and cannot start with http:// or https://. The description can be left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of destination instance types to be matched. The following instance types are supported:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC instance.</p>
     * </li>
     * <li><p><strong>VBR</strong>: VBR instance.</p>
     * </li>
     * <li><p><strong>CCN</strong>: CCN instance.</p>
     * </li>
     * <li><p><strong>VPN</strong>: IPsec connection.</p>
     * <blockquote>
     * <p>If an IPsec connection or SSL server is associated with a VPN gateway instance and connected to a transit router instance through the VPC associated with the VPN gateway instance, this parameter does not take effect. This parameter takes effect only when an IPsec connection is directly associated with a transit router instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>You can enter multiple instance types.</p>
     * <blockquote>
     * <p>The destination instance type list takes effect only when the application direction of the route map is set to RegionOut and the destination instance types are the types of instances in the local region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DestinationChildInstanceTypes")
    public java.util.List<String> destinationChildInstanceTypes;

    /**
     * <p>The prefix list to be matched.</p>
     * <p>The CIDR blocks in the prefix list must be in CIDR format. You can enter up to 64 CIDR blocks.</p>
     * <p>Both IPv4 and IPv6 formats are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("DestinationCidrBlocks")
    public java.util.List<String> destinationCidrBlocks;

    /**
     * <p>The list of destination instance IDs to be matched. You can enter the IDs of the following types of instances:</p>
     * <ul>
     * <li>Virtual Private Cloud (VPC) instance IDs</li>
     * <li>Virtual Border Router (VBR) instance IDs</li>
     * <li>Cloud Connect Network (CCN) instance IDs</li>
     * <li>Smart Access Gateway (SAG) instance IDs</li>
     * <li>IPsec connection IDs</li>
     * </ul>
     * <p>You can enter up to 64 instance IDs.</p>
     * <blockquote>
     * <p>The destination instance ID list takes effect only when the application direction of the route map is set to RegionOut and the destination instance IDs are the IDs of instances in the local region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-afrfs434465fdf****</p>
     */
    @NameInMap("DestinationInstanceIds")
    public java.util.List<String> destinationInstanceIds;

    /**
     * <p>Specifies whether to use the exclude match mode for the destination instance ID list. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): no. A route meets the match condition if the destination instance ID of the route is in <strong>DestinationInstanceIds.N</strong>.</p>
     * </li>
     * <li><p><strong>true</strong>: yes. A route meets the match condition if the destination instance ID of the route is not in <strong>DestinationInstanceIds.N</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DestinationInstanceIdsReverseMatch")
    public Boolean destinationInstanceIdsReverseMatch;

    /**
     * <p>The list of destination region IDs to be matched. You can enter up to 64 region IDs.</p>
     */
    @NameInMap("DestinationRegionIds")
    public java.util.List<String> destinationRegionIds;

    /**
     * <p>The list of destination route table IDs to be matched. You can enter up to 64 route table IDs.</p>
     * <blockquote>
     * <p>The destination route table ID list takes effect only when the application direction of the route map is set to RegionOut and the destination route table IDs are the IDs of route tables of network instances in the local region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vtb-adefrgtr144vf****</p>
     */
    @NameInMap("DestinationRouteTableIds")
    public java.util.List<String> destinationRouteTableIds;

    /**
     * <p>The action to be performed when a route meets all match conditions. Valid values:</p>
     * <ul>
     * <li><p><strong>Permit</strong>: permits the matched route.</p>
     * </li>
     * <li><p><strong>Deny</strong>: denies the matched route.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Permit</p>
     */
    @NameInMap("MapResult")
    public String mapResult;

    /**
     * <p>The IP address type of the routes to be matched. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: matches only IPv4 routes.</li>
     * <li><strong>IPv6</strong>: matches only IPv6 routes.</li>
     * </ul>
     * <p>If this parameter is left empty, all types of routes are matched.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("MatchAddressType")
    public String matchAddressType;

    /**
     * <p>The AS path list to be matched.</p>
     * <p>You can enter up to 64 AS numbers.</p>
     * <blockquote>
     * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only AS number lists are supported, and sets and sub-lists are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("MatchAsns")
    public java.util.List<Long> matchAsns;

    /**
     * <p>The community set to be matched.</p>
     * <p>Each community must be in the format of n:m, where n and m are integers from <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
     * <p>You can enter up to 64 communities.</p>
     * <blockquote>
     * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501:1</p>
     */
    @NameInMap("MatchCommunitySet")
    public java.util.List<String> matchCommunitySet;

    /**
     * <p>Policy priority of the next route map to be associated.</p>
     * <ul>
     * <li>You can set this parameter only when <strong>MapResult</strong> is set to <strong>Permit</strong>. Only permitted routes are matched against the next associated route map.</li>
     * <li>The next route map to be associated must be applied to the same region and in the same direction as the current route map.</li>
     * <li>Policy priority of the next route map to be associated must be lower than that of the current route map.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NextPriority")
    public Integer nextPriority;

    /**
     * <p>The community set to be operated.</p>
     * <p>Each community must be in the format of n:m, where n and m are integers from <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
     * <p>You can enter up to 32 communities.</p>
     * <blockquote>
     * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
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
     * <p>The priority of the route to be modified.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100</strong>. The default priority of a route is <strong>50</strong>. A smaller value indicates a higher priority.</p>
     * <p>This parameter specifies the action to be performed after a route meets the match conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Preference")
    public Integer preference;

    /**
     * <p>The AS path to be prepended when the regional gateway receives or performs publish route entry.</p>
     * <p>The requirements for configuring the prepended AS path vary based on the application direction of the policy:</p>
     * <ul>
     * <li><p>If the application direction is RegionIn, you must configure the source instance ID list and source region in the match conditions, and the source region must be the same as the region where the policy is applied.</p>
     * </li>
     * <li><p>If the application direction is RegionOut, you must configure the destination instance ID list in the match conditions.</p>
     * </li>
     * </ul>
     * <p>This parameter specifies the action to be executed after routing meets the match conditions. You can enter up to 32 AS numbers.</p>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("PrependAsPath")
    public java.util.List<Long> prependAsPath;

    /**
     * <p>The policy priority of the route map. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>The policy priority of each route map applied to the same region in the same direction must be unique. When the policy is executed, the system matches routing against the conditional statements of the policy with the smallest priority value first. Therefore, specify the policy priority based on the expected match order.</p>
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
     * <p>The list of route types to be matched. The following route types are supported:</p>
     * <ul>
     * <li><p><strong>System</strong>: system routing, which is automatically generated by the system.</p>
     * </li>
     * <li><p><strong>Custom</strong>: custom routing, which is manually added by a user.</p>
     * </li>
     * <li><p><strong>BGP</strong>: BGP routing, which is propagated through the BGP routable protocol.</p>
     * </li>
     * </ul>
     * <p>You can enter multiple route types.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("RouteTypes")
    public java.util.List<String> routeTypes;

    /**
     * <p>The list of source instance types to be matched. The following instance types are supported:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC instance.</p>
     * </li>
     * <li><p><strong>VBR</strong>: border router instance.</p>
     * </li>
     * <li><p><strong>CCN</strong>: CCN instance.</p>
     * </li>
     * <li><p><strong>VPN</strong>: VPN gateway instance or IPsec connection.</p>
     * <ul>
     * <li>If an IPsec connection or SSL server is attached to a VPN gateway instance, the VPC associated with the VPN gateway instance must be connected to a forward router instance, and the VPN gateway instance must run the BGP dynamic routing routable protocol for this parameter to take effect.</li>
     * <li>If an IPsec connection is directly attached to a forward router instance, this parameter takes effect.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>You can enter multiple instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("SourceChildInstanceTypes")
    public java.util.List<String> sourceChildInstanceTypes;

    /**
     * <p>The list of source instance IDs to be matched. You can enter the IDs of the following types of instances:</p>
     * <ul>
     * <li>Virtual Private Cloud (VPC) instance IDs</li>
     * <li>Virtual Border Router (VBR) instance IDs</li>
     * <li>Cloud Connect Network (CCN) instance IDs</li>
     * <li>Smart Access Gateway (SAG) instance IDs</li>
     * <li>IPsec connection IDs</li>
     * </ul>
     * <p>You can enter up to 64 instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-adeg3544fdf34vf****</p>
     */
    @NameInMap("SourceInstanceIds")
    public java.util.List<String> sourceInstanceIds;

    /**
     * <p>Specifies whether to use the exclude match mode for the source instance ID list. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): no. A route meets the match condition if the source instance ID of the route is in <strong>SourceInstanceIds.N</strong>.</p>
     * </li>
     * <li><p><strong>true</strong>: yes. A route meets the match condition if the source instance ID of the route is not in <strong>SourceInstanceIds.N</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceInstanceIdsReverseMatch")
    public Boolean sourceInstanceIdsReverseMatch;

    /**
     * <p>The list of source region IDs to be matched. You can enter up to 64 region IDs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionIds")
    public java.util.List<String> sourceRegionIds;

    /**
     * <p>The list of source route table IDs to be matched. You can enter up to 64 route table IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-adfr233vf34rvd4****</p>
     */
    @NameInMap("SourceRouteTableIds")
    public java.util.List<String> sourceRouteTableIds;

    /**
     * <p>The ID of the route table of the transit router.</p>
     * <p>If you do not specify a route table ID, the route map is automatically associated with the default route table of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-gw8nx3515m1mbd1z1****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    /**
     * <p>The application direction of the route map. Valid values:</p>
     * <ul>
     * <li><p><strong>RegionIn</strong>: the direction in which routes are transmitted to the regional gateway of the CEN instance. For example, routes are advertised from a network instance in a region to the regional gateway in the same region, or routes are advertised from another region to the regional gateway.</p>
     * </li>
     * <li><p><strong>RegionOut</strong>: the direction in which routes are transmitted from the regional gateway of the CEN instance. For example, routes are advertised from the regional gateway to a network instance in the same region, or to a regional gateway in another region.</p>
     * </li>
     * </ul>
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
