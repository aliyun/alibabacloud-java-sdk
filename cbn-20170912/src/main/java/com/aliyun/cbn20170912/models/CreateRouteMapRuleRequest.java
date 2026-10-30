// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateRouteMapRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client. Make sure that the token is unique across different requests. The client token supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The detailed description of the rule. The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Matches production prefixes from on-prem and sets a higher local preference.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Prechecks the request without creating the route map rule. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Sends the request. After the request passes the precheck, the route map rule is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The match conditions of the route map rule. The system executes the actions defined in <strong>SetActions</strong> only when a route meets all the match conditions defined in this parameter.</p>
     */
    @NameInMap("MatchConditions")
    public CreateRouteMapRuleRequestMatchConditions matchConditions;

    /**
     * <p>The name of the rule for easy identification. The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Permit-Prod-Prefixes-Set-LP</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority of the rule. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the route map.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-0a1b2c3d4e5f6a7b8</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    /**
     * <p>The actions to execute for the route map rule. After a route meets all the match conditions defined in <strong>MatchConditions</strong>, the system processes the route based on the actions defined in this parameter.</p>
     */
    @NameInMap("SetActions")
    public CreateRouteMapRuleRequestSetActions setActions;

    public static CreateRouteMapRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteMapRuleRequest self = new CreateRouteMapRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteMapRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteMapRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouteMapRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateRouteMapRuleRequest setMatchConditions(CreateRouteMapRuleRequestMatchConditions matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }
    public CreateRouteMapRuleRequestMatchConditions getMatchConditions() {
        return this.matchConditions;
    }

    public CreateRouteMapRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouteMapRuleRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateRouteMapRuleRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public CreateRouteMapRuleRequest setSetActions(CreateRouteMapRuleRequestSetActions setActions) {
        this.setActions = setActions;
        return this;
    }
    public CreateRouteMapRuleRequestSetActions getSetActions() {
        return this.setActions;
    }

    public static class CreateRouteMapRuleRequestMatchConditions extends TeaModel {
        /**
         * <p>The route prefix list for fuzzy match. You can specify up to 64 IP address blocks.</p>
         * <p>A match is successful if the route prefix in the match condition contains the route prefix of the matched route.</p>
         * <p>For example, a policy defined with 10.0.0.0/8 can fuzzy match a route with 10.10.10.0/24.</p>
         * <p>IP address blocks use the CIDR format and support IPv4 and IPv6.</p>
         * <p>This parameter is mutually exclusive with <strong>AddressPrefixesMatch</strong>. You cannot specify both parameters at the same time.</p>
         */
        @NameInMap("AddressPrefixesInclude")
        public java.util.List<String> addressPrefixesInclude;

        /**
         * <p>The route prefix list for exact match. You can specify up to 64 IP address blocks.</p>
         * <p>A match is successful only if the route prefix in the match condition is exactly the same as the route prefix of the matched route.</p>
         * <p>For example, a policy defined with 10.0.0.0/8 can only exactly match a route with 10.0.0.0/8.</p>
         * <p>IP address blocks use the CIDR format and support IPv4 and IPv6.</p>
         * <p>This parameter is mutually exclusive with <strong>AddressPrefixesInclude</strong>. You cannot specify both parameters at the same time.</p>
         */
        @NameInMap("AddressPrefixesMatch")
        public java.util.List<String> addressPrefixesMatch;

        /**
         * <p>The list of AS paths for fuzzy match. You can specify up to 64 AS numbers.</p>
         * <p>A match is successful if the AS path in the match condition overlaps with the AS path of the matched route.</p>
         * <p>This parameter is mutually exclusive with <strong>AsPathsMatch</strong>. You cannot specify both parameters at the same time.</p>
         * <blockquote>
         * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only a list of AS numbers is supported, and sets and sublists are not supported.</p>
         * </blockquote>
         */
        @NameInMap("AsPathsInclude")
        public java.util.List<Long> asPathsInclude;

        /**
         * <p>The list of AS paths for exact match. You can specify up to 64 AS numbers.</p>
         * <p>A match is successful only if the AS path in the match condition is exactly the same as the AS path of the matched route.</p>
         * <p>This parameter is mutually exclusive with <strong>AsPathsInclude</strong>. You cannot specify both parameters at the same time.</p>
         * <blockquote>
         * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only a list of AS numbers is supported, and sets and sublists are not supported.</p>
         * </blockquote>
         */
        @NameInMap("AsPathsMatch")
        public java.util.List<Long> asPathsMatch;

        /**
         * <p>The community set for fuzzy match. You can specify up to 64 communities.</p>
         * <p>A match is successful if the community in the match condition overlaps with the community of the matched route.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter is mutually exclusive with <strong>CommunitySetMatch</strong>. You cannot specify both parameters at the same time.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunitySetInclude")
        public java.util.List<String> communitySetInclude;

        /**
         * <p>The community set for exact match. You can specify up to 64 communities.</p>
         * <p>A match is successful only if the community in the match condition is exactly the same as the community of the matched route.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter is mutually exclusive with <strong>CommunitySetInclude</strong>. You cannot specify both parameters at the same time.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunitySetMatch")
        public java.util.List<String> communitySetMatch;

        /**
         * <p>The list of destination instance IDs to match. You can specify the following types of instance IDs:</p>
         * <ul>
         * <li>Virtual Private Cloud (VPC) instance IDs</li>
         * <li>Virtual Border Router (VBR) instance IDs</li>
         * </ul>
         * <p>You can specify up to 64 instance IDs.</p>
         * <blockquote>
         * <p>The list of destination instance IDs takes effect only when the direction of the route map is outbound.</p>
         * </blockquote>
         */
        @NameInMap("DestinationInstanceIds")
        public java.util.List<String> destinationInstanceIds;

        /**
         * <p>Specifies whether to use the exclusion match mode for the list of destination instance IDs. Valid values:</p>
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
         * <p>The list of destination instance types to match. The following instance types are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC instance.</p>
         * </li>
         * <li><p><strong>VBR</strong>: VBR instance.</p>
         * </li>
         * </ul>
         * <p>You can specify multiple instance types.</p>
         * <blockquote>
         * <p>The list of destination instance types takes effect only when the direction of the route map is outbound.</p>
         * </blockquote>
         */
        @NameInMap("DestinationInstanceTypes")
        public java.util.List<String> destinationInstanceTypes;

        /**
         * <p>The list of destination region IDs to match. You can specify up to 64 region IDs.</p>
         */
        @NameInMap("DestinationRegionIds")
        public java.util.List<String> destinationRegionIds;

        /**
         * <p>The list of destination route table IDs to match. You can specify up to 64 route table IDs.</p>
         * <blockquote>
         * <p>The list of destination route table IDs takes effect only when the direction of the route map is outbound.</p>
         * </blockquote>
         */
        @NameInMap("DestinationRouteTableIds")
        public java.util.List<String> destinationRouteTableIds;

        /**
         * <p>The IP address type of the routes to match. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: Matches only IPv4 routes.</li>
         * <li><strong>IPv6</strong>: Matches only IPv6 routes.</li>
         * </ul>
         * <p>You can leave this parameter empty to match routes of all types.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("MatchAddressType")
        public String matchAddressType;

        /**
         * <p>The list of route types to match. The following route types are supported:</p>
         * <ul>
         * <li><p><strong>System</strong>: system route, which is automatically generated by the system.</p>
         * </li>
         * <li><p><strong>Custom</strong>: custom route, which is manually added by the user.</p>
         * </li>
         * <li><p><strong>BGP</strong>: BGP route, which is propagated through the BGP routable protocol.</p>
         * </li>
         * </ul>
         * <p>You can specify multiple route types.</p>
         */
        @NameInMap("RouteTypes")
        public java.util.List<String> routeTypes;

        /**
         * <p>The list of source instance IDs to match. You can specify the following types of instance IDs:</p>
         * <ul>
         * <li>Virtual Private Cloud (VPC) instance IDs</li>
         * <li>Virtual Border Router (VBR) instance IDs</li>
         * </ul>
         * <p>You can specify up to 64 instance IDs.</p>
         */
        @NameInMap("SourceInstanceIds")
        public java.util.List<String> sourceInstanceIds;

        /**
         * <p>Specifies whether to use the exclusion match mode for the list of source instance IDs. Valid values:</p>
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
         * <p>The list of source instance types to match. The following instance types are supported:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC instance.</p>
         * </li>
         * <li><p><strong>VBR</strong>: VBR instance.</p>
         * </li>
         * </ul>
         * <p>You can specify multiple instance types.</p>
         */
        @NameInMap("SourceInstanceTypes")
        public java.util.List<String> sourceInstanceTypes;

        /**
         * <p>The list of source region IDs to match. You can specify up to 64 region IDs.</p>
         */
        @NameInMap("SourceRegionIds")
        public java.util.List<String> sourceRegionIds;

        /**
         * <p>The list of source route table IDs to match. You can specify up to 64 route table IDs.</p>
         */
        @NameInMap("SourceRouteTableIds")
        public java.util.List<String> sourceRouteTableIds;

        public static CreateRouteMapRuleRequestMatchConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteMapRuleRequestMatchConditions self = new CreateRouteMapRuleRequestMatchConditions();
            return TeaModel.build(map, self);
        }

        public CreateRouteMapRuleRequestMatchConditions setAddressPrefixesInclude(java.util.List<String> addressPrefixesInclude) {
            this.addressPrefixesInclude = addressPrefixesInclude;
            return this;
        }
        public java.util.List<String> getAddressPrefixesInclude() {
            return this.addressPrefixesInclude;
        }

        public CreateRouteMapRuleRequestMatchConditions setAddressPrefixesMatch(java.util.List<String> addressPrefixesMatch) {
            this.addressPrefixesMatch = addressPrefixesMatch;
            return this;
        }
        public java.util.List<String> getAddressPrefixesMatch() {
            return this.addressPrefixesMatch;
        }

        public CreateRouteMapRuleRequestMatchConditions setAsPathsInclude(java.util.List<Long> asPathsInclude) {
            this.asPathsInclude = asPathsInclude;
            return this;
        }
        public java.util.List<Long> getAsPathsInclude() {
            return this.asPathsInclude;
        }

        public CreateRouteMapRuleRequestMatchConditions setAsPathsMatch(java.util.List<Long> asPathsMatch) {
            this.asPathsMatch = asPathsMatch;
            return this;
        }
        public java.util.List<Long> getAsPathsMatch() {
            return this.asPathsMatch;
        }

        public CreateRouteMapRuleRequestMatchConditions setCommunitySetInclude(java.util.List<String> communitySetInclude) {
            this.communitySetInclude = communitySetInclude;
            return this;
        }
        public java.util.List<String> getCommunitySetInclude() {
            return this.communitySetInclude;
        }

        public CreateRouteMapRuleRequestMatchConditions setCommunitySetMatch(java.util.List<String> communitySetMatch) {
            this.communitySetMatch = communitySetMatch;
            return this;
        }
        public java.util.List<String> getCommunitySetMatch() {
            return this.communitySetMatch;
        }

        public CreateRouteMapRuleRequestMatchConditions setDestinationInstanceIds(java.util.List<String> destinationInstanceIds) {
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }
        public java.util.List<String> getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        public CreateRouteMapRuleRequestMatchConditions setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        public CreateRouteMapRuleRequestMatchConditions setDestinationInstanceTypes(java.util.List<String> destinationInstanceTypes) {
            this.destinationInstanceTypes = destinationInstanceTypes;
            return this;
        }
        public java.util.List<String> getDestinationInstanceTypes() {
            return this.destinationInstanceTypes;
        }

        public CreateRouteMapRuleRequestMatchConditions setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }
        public java.util.List<String> getDestinationRegionIds() {
            return this.destinationRegionIds;
        }

        public CreateRouteMapRuleRequestMatchConditions setDestinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }
        public java.util.List<String> getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        public CreateRouteMapRuleRequestMatchConditions setMatchAddressType(String matchAddressType) {
            this.matchAddressType = matchAddressType;
            return this;
        }
        public String getMatchAddressType() {
            return this.matchAddressType;
        }

        public CreateRouteMapRuleRequestMatchConditions setRouteTypes(java.util.List<String> routeTypes) {
            this.routeTypes = routeTypes;
            return this;
        }
        public java.util.List<String> getRouteTypes() {
            return this.routeTypes;
        }

        public CreateRouteMapRuleRequestMatchConditions setSourceInstanceIds(java.util.List<String> sourceInstanceIds) {
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }
        public java.util.List<String> getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        public CreateRouteMapRuleRequestMatchConditions setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        public CreateRouteMapRuleRequestMatchConditions setSourceInstanceTypes(java.util.List<String> sourceInstanceTypes) {
            this.sourceInstanceTypes = sourceInstanceTypes;
            return this;
        }
        public java.util.List<String> getSourceInstanceTypes() {
            return this.sourceInstanceTypes;
        }

        public CreateRouteMapRuleRequestMatchConditions setSourceRegionIds(java.util.List<String> sourceRegionIds) {
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }
        public java.util.List<String> getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        public CreateRouteMapRuleRequestMatchConditions setSourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }
        public java.util.List<String> getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

    }

    public static class CreateRouteMapRuleRequestSetActions extends TeaModel {
        /**
         * <p>The AS path to prepend when the regional gateway receives a route or executes a publish route entry. You can specify up to 64 AS numbers.</p>
         * <p>This parameter is mutually exclusive with <strong>AsPathReplace</strong>. You cannot specify both parameters at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         */
        @NameInMap("AsPathPrepend")
        public java.util.List<Long> asPathPrepend;

        /**
         * <p>The AS path to replace when the regional gateway receives a route or executes a publish route entry. The original AS path of the route is replaced with the list of AS numbers specified in this parameter. You can specify up to 64 AS numbers.</p>
         * <p>This parameter is mutually exclusive with <strong>AsPathPrepend</strong>. You cannot specify both parameters at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         */
        @NameInMap("AsPathReplace")
        public java.util.List<Long> asPathReplace;

        /**
         * <p>The community set to add to the route. You can specify up to 64 communities.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter is mutually exclusive with <strong>CommunityReplace</strong>. You cannot specify both parameters at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunityAdd")
        public java.util.List<String> communityAdd;

        /**
         * <p>The community set to replace the original community of the route. You can specify up to 64 communities.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter is mutually exclusive with <strong>CommunityAdd</strong>. You cannot specify both parameters at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunityReplace")
        public java.util.List<String> communityReplace;

        /**
         * <p>Policy priority of the associated next route map rule.</p>
         * <ul>
         * <li>You can set policy priority of the associated route map rule only when <strong>RouteAction</strong> is set to <strong>Permit</strong>. Only the routes that are permitted continue to match the associated next route map rule.</li>
         * <li>Policy priority of the associated next route map rule must be lower than policy priority of the current route map rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextPriority")
        public Long nextPriority;

        /**
         * <p>The policy action after all conditions are met. Valid values:</p>
         * <ul>
         * <li><p><strong>Permit</strong>: Permits the matched routes.</p>
         * </li>
         * <li><p><strong>Deny</strong>: Denies the matched routes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Permit</p>
         */
        @NameInMap("RouteAction")
        public String routeAction;

        public static CreateRouteMapRuleRequestSetActions build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteMapRuleRequestSetActions self = new CreateRouteMapRuleRequestSetActions();
            return TeaModel.build(map, self);
        }

        public CreateRouteMapRuleRequestSetActions setAsPathPrepend(java.util.List<Long> asPathPrepend) {
            this.asPathPrepend = asPathPrepend;
            return this;
        }
        public java.util.List<Long> getAsPathPrepend() {
            return this.asPathPrepend;
        }

        public CreateRouteMapRuleRequestSetActions setAsPathReplace(java.util.List<Long> asPathReplace) {
            this.asPathReplace = asPathReplace;
            return this;
        }
        public java.util.List<Long> getAsPathReplace() {
            return this.asPathReplace;
        }

        public CreateRouteMapRuleRequestSetActions setCommunityAdd(java.util.List<String> communityAdd) {
            this.communityAdd = communityAdd;
            return this;
        }
        public java.util.List<String> getCommunityAdd() {
            return this.communityAdd;
        }

        public CreateRouteMapRuleRequestSetActions setCommunityReplace(java.util.List<String> communityReplace) {
            this.communityReplace = communityReplace;
            return this;
        }
        public java.util.List<String> getCommunityReplace() {
            return this.communityReplace;
        }

        public CreateRouteMapRuleRequestSetActions setNextPriority(Long nextPriority) {
            this.nextPriority = nextPriority;
            return this;
        }
        public Long getNextPriority() {
            return this.nextPriority;
        }

        public CreateRouteMapRuleRequestSetActions setRouteAction(String routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public String getRouteAction() {
            return this.routeAction;
        }

    }

}
