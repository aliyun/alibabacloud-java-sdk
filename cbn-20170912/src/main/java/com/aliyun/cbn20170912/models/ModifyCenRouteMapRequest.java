// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenRouteMapRequest extends TeaModel {
    /**
     * <p>The match method that is used to match routes against the AS paths. Valid values:</p>
     * <ul>
     * <li><strong>Include</strong>: fuzzy match. A route meets the match condition if the AS path of the route overlaps with the AS paths specified in the match condition.</li>
     * <li><strong>Complete</strong>: exact match. A route is a match only if the AS path of the route is the same as an AS path specified in the match condition.</li>
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
     * <li><p><strong>Include</strong>: fuzzy match. A route is a match if the route prefix is included in the match conditions.</p>
     * <p>For example, if you set the match condition to 10.10.0.0/16 and fuzzy match is enabled, the route whose prefix is 10.10.1.0/24 is a match.</p>
     * </li>
     * <li><p><strong>Complete</strong>: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</p>
     * <p>For example, if you set the match condition to 10.10.0.0/16 and exact match is enabled, a route is a match only if the prefix is 10.10.0.0/16.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CidrMatchMode")
    public String cidrMatchMode;

    /**
     * <p>The match method that is sed to match routes based on the community. Valid values:</p>
     * <ul>
     * <li><strong>Include</strong>: fuzzy match. A route meets the match condition if the community of the route overlaps with the community specified in the match condition.</li>
     * <li><strong>Complete</strong>: exact match. A route meets the match condition only if the community of the route is the same as the community specified in the match condition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CommunityMatchMode")
    public String communityMatchMode;

    /**
     * <p>The action that is performed on the community. Valid values:</p>
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
     * <p>The description cannot start with <code>http://</code> or <code>https://</code>. It must start with a letter and can contain letters, digits, hyphens (-), periods (.), and underscores (_).</p>
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
     * <p>The destination network instance types are valid only if the routing policy is applied to scenarios where routes are advertised from the gateway in the current region to network instances in the current region.</p>
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
     * <p>vpc-avcdsg34ds****</p>
     */
    @NameInMap("DestinationInstanceIds")
    public java.util.List<String> destinationInstanceIds;

    /**
     * <p>Specifies whether to exclude the destination network instance IDs. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default value): A route is a match if its destination network instance ID is in the list specified by <strong>DestinationInstanceIds.N</strong>.</li>
     * <li><strong>true</strong>: A route meets the match condition if its destination network instance ID is not in the list specified by <strong>DestinationInstanceIds.N</strong>.</li>
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
     * <p>The IDs of the destination route tables to which the routes belong. You can enter at most 32 route table IDs.</p>
     * <blockquote>
     * <p>The destination route table IDs take effect only when Direction is set to Export from Regional Gateway and the destination route tables belong to network instances deployed in the current region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vtb-adfg53c322v****</p>
     */
    @NameInMap("DestinationRouteTableIds")
    public java.util.List<String> destinationRouteTableIds;

    /**
     * <p>The action to be performed on a route that meets all match conditions. Valid values:</p>
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
     * <p>The AS paths against which routes are matched.</p>
     * <blockquote>
     * <p>Only the AS-SEQUENCE parameter is supported. The AS-SET, AS-CONFED-SEQUENCE, and AS-CONFED-SET parameters are not supported. In other words, only the AS number list is supported. Sets and sub-lists are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("MatchAsns")
    public java.util.List<Integer> matchAsns;

    /**
     * <p>The community against which routes are matched.</p>
     * <p>Specify the community in the format of n:m. Valid values of n and m: <strong>1</strong> to <strong>65535</strong>. Each community must comply with the RFC 1997 standard. The RFC 8092 standard that defines BGP large communities is not supported.</p>
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
     * <li>The priority of the routing policy to be associated must be lower than the priority of the current routing policy.</li>
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
     * <p>22</p>
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
     * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
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
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the routing policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cenrmap-abcdedfghij****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    /**
     * <p>The type of route to be matched against the match condition. The following route types are supported:</p>
     * <ul>
     * <li><strong>System</strong>: system routes that are automatically generated by the system.</li>
     * <li><strong>Custom</strong>: custom routes that are manually added.</li>
     * <li><strong>BGP</strong>: routes that are advertised over BGP.</li>
     * </ul>
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
     * <li><p><strong>VPN</strong> :VPN gateway or IPsec-VPN connection</p>
     * <ul>
     * <li>If the IPsec-VPN connection or SSL client is associated with a VPN gateway, the VPC associated with the VPN gateway must be connected to a transit router, and the VPN gateway must use Border Gateway Protocol (BGP) dynamic routing. Otherwise, this parameter cannot take effect.</li>
     * <li>This parameter takes effect if the IPsec connection is directly connected to a transit router.</li>
     * </ul>
     * </li>
     * </ul>
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
     * <p>vpc-afsfdf5435vcvc****</p>
     */
    @NameInMap("SourceInstanceIds")
    public java.util.List<String> sourceInstanceIds;

    /**
     * <p>Specifies whether to exclude the source network instance IDs. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default value): A route is a match if its source network instance ID is in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
     * <li><strong>true</strong>: A route is a match if its source network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceInstanceIdsReverseMatch")
    public Boolean sourceInstanceIdsReverseMatch;

    /**
     * <p>The IDs of the source regions to which the routes belong. You can enter at most 32 region IDs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionIds")
    public java.util.List<String> sourceRegionIds;

    /**
     * <p>The IDs of the source route tables to which the routes belong. You can enter at most 32 route table IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-acdbvtbr342cd****</p>
     */
    @NameInMap("SourceRouteTableIds")
    public java.util.List<String> sourceRouteTableIds;

    public static ModifyCenRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenRouteMapRequest self = new ModifyCenRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCenRouteMapRequest setAsPathMatchMode(String asPathMatchMode) {
        this.asPathMatchMode = asPathMatchMode;
        return this;
    }
    public String getAsPathMatchMode() {
        return this.asPathMatchMode;
    }

    public ModifyCenRouteMapRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ModifyCenRouteMapRequest setCenRegionId(String cenRegionId) {
        this.cenRegionId = cenRegionId;
        return this;
    }
    public String getCenRegionId() {
        return this.cenRegionId;
    }

    public ModifyCenRouteMapRequest setCidrMatchMode(String cidrMatchMode) {
        this.cidrMatchMode = cidrMatchMode;
        return this;
    }
    public String getCidrMatchMode() {
        return this.cidrMatchMode;
    }

    public ModifyCenRouteMapRequest setCommunityMatchMode(String communityMatchMode) {
        this.communityMatchMode = communityMatchMode;
        return this;
    }
    public String getCommunityMatchMode() {
        return this.communityMatchMode;
    }

    public ModifyCenRouteMapRequest setCommunityOperateMode(String communityOperateMode) {
        this.communityOperateMode = communityOperateMode;
        return this;
    }
    public String getCommunityOperateMode() {
        return this.communityOperateMode;
    }

    public ModifyCenRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCenRouteMapRequest setDestinationChildInstanceTypes(java.util.List<String> destinationChildInstanceTypes) {
        this.destinationChildInstanceTypes = destinationChildInstanceTypes;
        return this;
    }
    public java.util.List<String> getDestinationChildInstanceTypes() {
        return this.destinationChildInstanceTypes;
    }

    public ModifyCenRouteMapRequest setDestinationCidrBlocks(java.util.List<String> destinationCidrBlocks) {
        this.destinationCidrBlocks = destinationCidrBlocks;
        return this;
    }
    public java.util.List<String> getDestinationCidrBlocks() {
        return this.destinationCidrBlocks;
    }

    public ModifyCenRouteMapRequest setDestinationInstanceIds(java.util.List<String> destinationInstanceIds) {
        this.destinationInstanceIds = destinationInstanceIds;
        return this;
    }
    public java.util.List<String> getDestinationInstanceIds() {
        return this.destinationInstanceIds;
    }

    public ModifyCenRouteMapRequest setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
        this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
        return this;
    }
    public Boolean getDestinationInstanceIdsReverseMatch() {
        return this.destinationInstanceIdsReverseMatch;
    }

    public ModifyCenRouteMapRequest setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
        this.destinationRegionIds = destinationRegionIds;
        return this;
    }
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    public ModifyCenRouteMapRequest setDestinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
        this.destinationRouteTableIds = destinationRouteTableIds;
        return this;
    }
    public java.util.List<String> getDestinationRouteTableIds() {
        return this.destinationRouteTableIds;
    }

    public ModifyCenRouteMapRequest setMapResult(String mapResult) {
        this.mapResult = mapResult;
        return this;
    }
    public String getMapResult() {
        return this.mapResult;
    }

    public ModifyCenRouteMapRequest setMatchAddressType(String matchAddressType) {
        this.matchAddressType = matchAddressType;
        return this;
    }
    public String getMatchAddressType() {
        return this.matchAddressType;
    }

    public ModifyCenRouteMapRequest setMatchAsns(java.util.List<Integer> matchAsns) {
        this.matchAsns = matchAsns;
        return this;
    }
    public java.util.List<Integer> getMatchAsns() {
        return this.matchAsns;
    }

    public ModifyCenRouteMapRequest setMatchCommunitySet(java.util.List<String> matchCommunitySet) {
        this.matchCommunitySet = matchCommunitySet;
        return this;
    }
    public java.util.List<String> getMatchCommunitySet() {
        return this.matchCommunitySet;
    }

    public ModifyCenRouteMapRequest setNextPriority(Integer nextPriority) {
        this.nextPriority = nextPriority;
        return this;
    }
    public Integer getNextPriority() {
        return this.nextPriority;
    }

    public ModifyCenRouteMapRequest setOperateCommunitySet(java.util.List<String> operateCommunitySet) {
        this.operateCommunitySet = operateCommunitySet;
        return this;
    }
    public java.util.List<String> getOperateCommunitySet() {
        return this.operateCommunitySet;
    }

    public ModifyCenRouteMapRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCenRouteMapRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCenRouteMapRequest setPreference(Integer preference) {
        this.preference = preference;
        return this;
    }
    public Integer getPreference() {
        return this.preference;
    }

    public ModifyCenRouteMapRequest setPrependAsPath(java.util.List<Long> prependAsPath) {
        this.prependAsPath = prependAsPath;
        return this;
    }
    public java.util.List<Long> getPrependAsPath() {
        return this.prependAsPath;
    }

    public ModifyCenRouteMapRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyCenRouteMapRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCenRouteMapRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCenRouteMapRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public ModifyCenRouteMapRequest setRouteTypes(java.util.List<String> routeTypes) {
        this.routeTypes = routeTypes;
        return this;
    }
    public java.util.List<String> getRouteTypes() {
        return this.routeTypes;
    }

    public ModifyCenRouteMapRequest setSourceChildInstanceTypes(java.util.List<String> sourceChildInstanceTypes) {
        this.sourceChildInstanceTypes = sourceChildInstanceTypes;
        return this;
    }
    public java.util.List<String> getSourceChildInstanceTypes() {
        return this.sourceChildInstanceTypes;
    }

    public ModifyCenRouteMapRequest setSourceInstanceIds(java.util.List<String> sourceInstanceIds) {
        this.sourceInstanceIds = sourceInstanceIds;
        return this;
    }
    public java.util.List<String> getSourceInstanceIds() {
        return this.sourceInstanceIds;
    }

    public ModifyCenRouteMapRequest setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
        this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
        return this;
    }
    public Boolean getSourceInstanceIdsReverseMatch() {
        return this.sourceInstanceIdsReverseMatch;
    }

    public ModifyCenRouteMapRequest setSourceRegionIds(java.util.List<String> sourceRegionIds) {
        this.sourceRegionIds = sourceRegionIds;
        return this;
    }
    public java.util.List<String> getSourceRegionIds() {
        return this.sourceRegionIds;
    }

    public ModifyCenRouteMapRequest setSourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
        this.sourceRouteTableIds = sourceRouteTableIds;
        return this;
    }
    public java.util.List<String> getSourceRouteTableIds() {
        return this.sourceRouteTableIds;
    }

}
