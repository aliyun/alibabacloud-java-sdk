// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenRouteMapRequest extends TeaModel {
    /**
     * <p>The match mode of the AS path list. Valid values:</p>
     * <ul>
     * <li><p><strong>Include</strong>: fuzzy match. A match is successful if the AS path in the match condition overlaps with the AS path of the route to be matched. </p>
     * </li>
     * <li><p><strong>Complete</strong>: exact match. A match is successful only if the AS path in the match condition is the same as the AS path of the route to be matched.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("AsPathMatchMode")
    public String asPathMatchMode;

    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the region where the routing policy is applied.</p>
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
     * <li><strong>Include</strong>: fuzzy match. A match is successful if the route prefix in the match condition contains the route prefix of the route to be matched.</li>
     * </ul>
     * <p> For example, a policy that defines 10.10.0.0/16 can fuzzy match the route 10.10.1.0/24.</p>
     * <ul>
     * <li><strong>Complete</strong>: exact match. A match is successful only if the route prefix in the match condition is the same as the route prefix of the route to be matched.</li>
     * </ul>
     * <p> For example, a policy that defines 10.10.0.0/16 can exact match only the route 10.10.0.0/16.</p>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CidrMatchMode")
    public String cidrMatchMode;

    /**
     * <p>The match mode of the Community. Valid values:</p>
     * <ul>
     * <li><p><strong>Include</strong>: fuzzy match. A match is successful if the Community in the match condition overlaps with the Community of the route to be matched. </p>
     * </li>
     * <li><p><strong>Complete</strong>: exact match. A match is successful only if the Community in the match condition is the same as the Community of the route to be matched.</p>
     * </li>
     * <li><p><strong>Contain</strong>: contains match. A match is successful only if the Community of the route to be matched contains all the Communities specified in the match condition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Include</p>
     */
    @NameInMap("CommunityMatchMode")
    public String communityMatchMode;

    /**
     * <p>The action to perform on the Community. Valid values:</p>
     * <ul>
     * <li><p><strong>Additive</strong>: adds the Community to the route.</p>
     * </li>
     * <li><p><strong>Replace</strong>: replaces the original Community of the route.</p>
     * </li>
     * </ul>
     * <p>This parameter specifies the action to perform on a route after the route matches the match conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>Additive</p>
     */
    @NameInMap("CommunityOperateMode")
    public String communityOperateMode;

    /**
     * <p>The description of the routing policy.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of destination instance types that the route must match. The following instance types are supported:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC instance.</p>
     * </li>
     * <li><p><strong>VBR</strong>: VBR instance.</p>
     * </li>
     * <li><p><strong>CCN</strong>: CCN instance.</p>
     * </li>
     * <li><p><strong>VPN</strong>: IPsec connection.</p>
     * <blockquote>
     * <p>If the IPsec connection or SSL server is bound to a VPN gateway instance and is connected to a transit router instance through the VPC associated with the VPN gateway instance, this parameter does not take effect. This parameter takes effect only when the IPsec connection is directly bound to a transit router instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>The destination instance type list takes effect only when the direction of the routing policy is Export from Regional Gateway and the destination instance types are instance types in the local region.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("DestinationChildInstanceTypes")
    public java.util.List<String> destinationChildInstanceTypes;

    /**
     * <p>The prefix list that the route must match.</p>
     * <p>IP address ranges in the prefix list are in CIDR format. A maximum of 64 IP address ranges can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.0/24</p>
     */
    @NameInMap("DestinationCidrBlocks")
    public java.util.List<String> destinationCidrBlocks;

    /**
     * <p>The list of destination instance IDs that the route must match. The following types of instance IDs are supported:</p>
     * <ul>
     * <li>Virtual Private Cloud (VPC) instance ID</li>
     * <li>Virtual Border Router (VBR) instance ID</li>
     * <li>Cloud Connect Network (CCN) instance ID</li>
     * <li>Smart Access Gateway instance ID</li>
     * <li>IPsec connection ID</li>
     * </ul>
     * <p>A maximum of 64 instance IDs can be specified.</p>
     * <blockquote>
     * <p>The destination instance ID list takes effect only when the direction of the routing policy is Export from Regional Gateway and the destination instance IDs are in the local region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-avcdsg34ds****</p>
     */
    @NameInMap("DestinationInstanceIds")
    public java.util.List<String> destinationInstanceIds;

    /**
     * <p>Specifies whether to use the reverse match mode for the destination instance ID list. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): No. A match is successful if the destination instance ID of the route is in <strong>DestinationInstanceIds.N</strong>.</p>
     * </li>
     * <li><p><strong>true</strong>: Yes. A match is successful if the destination instance ID of the route is not in <strong>DestinationInstanceIds.N</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DestinationInstanceIdsReverseMatch")
    public Boolean destinationInstanceIdsReverseMatch;

    /**
     * <p>The list of destination region IDs that the route must match. A maximum of 64 region IDs can be specified.</p>
     */
    @NameInMap("DestinationRegionIds")
    public java.util.List<String> destinationRegionIds;

    /**
     * <p>The list of destination route table IDs that the route must match. A maximum of 64 route table IDs can be specified.</p>
     * <blockquote>
     * <p>The destination route table ID list takes effect only when the direction of the routing policy is Export from Regional Gateway and the destination route table IDs are route table IDs of network instances in the local region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vtb-adfg53c322v****</p>
     */
    @NameInMap("DestinationRouteTableIds")
    public java.util.List<String> destinationRouteTableIds;

    /**
     * <p>The action to perform on a route that matches all the match conditions. Valid values:</p>
     * <ul>
     * <li><p><strong>Permit</strong>: The route is permitted to pass.</p>
     * </li>
     * <li><p><strong>Deny</strong>: The route is denied from passing.</p>
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
     * <p>The IP address type that the route must match. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: matches only IPv4 routes.</li>
     * <li><strong>IPv6</strong>: matches only IPv6 routes.</li>
     * </ul>
     * <p>This parameter can be left empty, which indicates that all types of routes are matched.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("MatchAddressType")
    public String matchAddressType;

    /**
     * <p>The AS path list that the route must match.</p>
     * <blockquote>
     * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. Specifically, only AS number lists are supported. Sets and sublists are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("MatchAsns")
    public java.util.List<Integer> matchAsns;

    /**
     * <p>The Community set that the route must match.</p>
     * <p>Each Community is in the n:m format, where the value ranges of n and m are <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large Communities (RFC 8092) are not supported.</p>
     * <p>A maximum of 64 Communities can be specified.</p>
     * <blockquote>
     * <p>Incorrect Community configurations may cause routes to fail to be advertised to on-premises data centers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65501:1</p>
     */
    @NameInMap("MatchCommunitySet")
    public java.util.List<String> matchCommunitySet;

    /**
     * <p>Policy priority of the next associated routing policy.</p>
     * <ul>
     * <li>You can set policy priority of the next associated routing policy only when <strong>MapResult</strong> is set to <strong>Permit</strong>. Only routes that are permitted to pass continue to match the next associated routing policy.</li>
     * <li>The next associated routing policy must have the same region and direction as the current routing policy.</li>
     * <li>Policy priority of the next associated routing policy must be lower than (a number greater than) policy priority of the current routing policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("NextPriority")
    public Integer nextPriority;

    /**
     * <p>The Community set to be executed.</p>
     * <p>Each Community is in the n:m format, where the value ranges of n and m are <strong>1</strong> to <strong>65535</strong>. Communities must comply with RFC 1997. Large Communities (RFC 8092) are not supported.</p>
     * <p>A maximum of 32 Communities can be specified.</p>
     * <blockquote>
     * <p>Incorrect Community configurations may cause routes to fail to be advertised to on-premises data centers.</p>
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
     * <p>This parameter specifies the action to perform on a route after the route matches the match conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Preference")
    public Integer preference;

    /**
     * <p>The AS path that is prepended when the regional gateway receives or publishes route entries.</p>
     * <p>The requirements for configuring the prepended AS path vary based on the direction of the routing policy:</p>
     * <ul>
     * <li><p>When configuring the prepended AS path for the Import to Regional Gateway direction, you must configure the source instance ID list and source region in the match conditions, and the source region must be the same as the region where the routing policy is applied.</p>
     * </li>
     * <li><p>When configuring the prepended AS path for the Export from Regional Gateway direction, you must configure the destination instance ID list in the match conditions.</p>
     * </li>
     * </ul>
     * <p>This parameter specifies the action to execute on a route after the route matches the match conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>65501</p>
     */
    @NameInMap("PrependAsPath")
    public java.util.List<Long> prependAsPath;

    /**
     * <p>Policy priority of the routing policy. Valid values: <strong>1</strong> to <strong>100</strong>. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>Policy priority of routing policies in the same region and with the same direction must be unique. When the system executes routing policies, it starts matching conditional statements from the routing policy with the smallest priority number. Specify policy priority based on the expected matching order.</p>
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
     * <p>The list of routing types that the route must match. The following routing types are supported:</p>
     * <ul>
     * <li><p><strong>System</strong>: system routes that are automatically generated by the system.</p>
     * </li>
     * <li><p><strong>Custom</strong>: custom routes that are manually added by users.</p>
     * </li>
     * <li><p><strong>BGP</strong>: BGP routes that are propagated through the BGP routing protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("RouteTypes")
    public java.util.List<String> routeTypes;

    /**
     * <p>The list of source instance types that the route must match. The following instance types are supported:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC instance.</p>
     * </li>
     * <li><p><strong>VBR</strong>: border router instance.</p>
     * </li>
     * <li><p><strong>CCN</strong>: CCN instance.</p>
     * </li>
     * <li><p><strong>VPN</strong>: VPN gateway instance or IPsec connection.</p>
     * <ul>
     * <li>If the IPsec connection or SSL server is attached to a VPN gateway instance, the VPC associated with the VPN gateway instance must be connected to a transit router instance, and the VPN gateway instance must run the BGP dynamic routing protocol for this parameter to take effect.</li>
     * <li>If the IPsec connection is directly attached to a transit router instance, this parameter takes effect.</li>
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
     * <p>The list of source instance IDs that the route must match. The following types of instance IDs are supported:</p>
     * <ul>
     * <li>Virtual Private Cloud (VPC) instance ID</li>
     * <li>Virtual Border Router (VBR) instance ID</li>
     * <li>Cloud Connect Network (CCN) instance ID</li>
     * <li>Smart Access Gateway instance ID</li>
     * <li>IPsec connection ID</li>
     * </ul>
     * <p>A maximum of 64 instance IDs can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-afsfdf5435vcvc****</p>
     */
    @NameInMap("SourceInstanceIds")
    public java.util.List<String> sourceInstanceIds;

    /**
     * <p>Specifies whether to use the reverse match mode for the source instance ID list. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): No. A match is successful if the source instance ID of the route is in <strong>SourceInstanceIds.N</strong>.</p>
     * </li>
     * <li><p><strong>true</strong>: Yes. A match is successful if the source instance ID of the route is not in <strong>SourceInstanceIds.N</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceInstanceIdsReverseMatch")
    public Boolean sourceInstanceIdsReverseMatch;

    /**
     * <p>The list of source region IDs that the route must match. A maximum of 64 region IDs can be specified.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SourceRegionIds")
    public java.util.List<String> sourceRegionIds;

    /**
     * <p>The list of source route table IDs that the route must match. A maximum of 64 route table IDs can be specified.</p>
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
