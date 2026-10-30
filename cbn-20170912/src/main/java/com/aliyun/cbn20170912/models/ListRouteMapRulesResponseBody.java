// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListRouteMapRulesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
     * <li>If <strong>NextToken</strong> has a return value, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF44D7B7-6248-5A60-8A4C-A92388605A57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of route map rules.</p>
     */
    @NameInMap("RouteMapRules")
    public java.util.List<ListRouteMapRulesResponseBodyRouteMapRules> routeMapRules;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRouteMapRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapRulesResponseBody self = new ListRouteMapRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteMapRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteMapRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteMapRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteMapRulesResponseBody setRouteMapRules(java.util.List<ListRouteMapRulesResponseBodyRouteMapRules> routeMapRules) {
        this.routeMapRules = routeMapRules;
        return this;
    }
    public java.util.List<ListRouteMapRulesResponseBodyRouteMapRules> getRouteMapRules() {
        return this.routeMapRules;
    }

    public ListRouteMapRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions extends TeaModel {
        /**
         * <p>The route prefix list for fuzzy matching.</p>
         * <p>A match succeeds if the route prefix in the match condition contains the route prefix of the matched route.</p>
         * <p>For example, a policy defined with 10.0.0.0/8 can fuzzy match a route with 10.10.10.0/24.</p>
         * <p>IP address ranges use the CIDR format. Both IPv4 and IPv6 are supported.</p>
         * <p>This parameter and <strong>AddressPrefixesMatch</strong> are mutually exclusive and cannot be specified at the same time.</p>
         */
        @NameInMap("AddressPrefixesInclude")
        public java.util.List<String> addressPrefixesInclude;

        /**
         * <p>The route prefix list for exact matching.</p>
         * <p>A match succeeds only when the route prefix in the match condition is exactly the same as the route prefix of the matched route.</p>
         * <p>For example, a policy defined with 10.0.0.0/8 can only exactly match a route with 10.0.0.0/8.</p>
         * <p>IP address ranges use the CIDR format. Both IPv4 and IPv6 are supported.</p>
         * <p>This parameter and <strong>AddressPrefixesInclude</strong> are mutually exclusive and cannot be specified at the same time.</p>
         */
        @NameInMap("AddressPrefixesMatch")
        public java.util.List<String> addressPrefixesMatch;

        /**
         * <p>The list of AS paths for fuzzy matching.</p>
         * <p>A match succeeds if the AS path in the match condition overlaps with the AS path of the matched route.</p>
         * <p>This parameter and <strong>AsPathsMatch</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <blockquote>
         * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only a list of AS numbers is supported, and sets and sub-lists are not supported.</p>
         * </blockquote>
         */
        @NameInMap("AsPathsInclude")
        public java.util.List<Long> asPathsInclude;

        /**
         * <p>The list of AS paths for exact matching.</p>
         * <p>A match succeeds only when the AS path in the match condition is exactly the same as the AS path of the matched route.</p>
         * <p>This parameter and <strong>AsPathsInclude</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <blockquote>
         * <p>Only AS SEQUENCE is supported. AS SET, AS CONFED SEQUENCE, and AS CONFED SET are not supported. This means only a list of AS numbers is supported, and sets and sub-lists are not supported.</p>
         * </blockquote>
         */
        @NameInMap("AsPathsMatch")
        public java.util.List<Long> asPathsMatch;

        /**
         * <p>The community set for fuzzy matching.</p>
         * <p>A match succeeds if the community in the match condition overlaps with the community of the matched route.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter and <strong>CommunitySetMatch</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunitySetInclude")
        public java.util.List<String> communitySetInclude;

        /**
         * <p>The community set for exact matching.</p>
         * <p>A match succeeds only when the community in the match condition is exactly the same as the community of the matched route.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter and <strong>CommunitySetInclude</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunitySetMatch")
        public java.util.List<String> communitySetMatch;

        /**
         * <p>The list of destination instance IDs to match. The following instance types are supported:</p>
         * <ul>
         * <li>Virtual private cloud (VPC) instance IDs</li>
         * <li>Virtual border router (VBR) instance IDs</li>
         * </ul>
         * <blockquote>
         * <p>The list of destination instance IDs takes effect only when the direction of the route map is outbound.</p>
         * </blockquote>
         */
        @NameInMap("DestinationInstanceIds")
        public java.util.List<String> destinationInstanceIds;

        /**
         * <p>Specifies whether to use the exclude matching mode for the list of destination instance IDs. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): no. A match succeeds when the destination instance ID of the route is in <strong>DestinationInstanceIds.N</strong>.</li>
         * <li><strong>true</strong>: yes. A match succeeds when the destination instance ID of the route is not in <strong>DestinationInstanceIds.N</strong>.</li>
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
         * <li><strong>VPC</strong>: VPC instance.</li>
         * <li><strong>VBR</strong>: VBR instance.</li>
         * </ul>
         * <blockquote>
         * <p>The list of destination instance types takes effect only when the direction of the route map is outbound.</p>
         * </blockquote>
         */
        @NameInMap("DestinationInstanceTypes")
        public java.util.List<String> destinationInstanceTypes;

        /**
         * <p>The list of destination region IDs to match.</p>
         */
        @NameInMap("DestinationRegionIds")
        public java.util.List<String> destinationRegionIds;

        /**
         * <p>The list of destination route table IDs to match.</p>
         * <blockquote>
         * <p>The list of destination route table IDs takes effect only when the direction of the route map is outbound.</p>
         * </blockquote>
         */
        @NameInMap("DestinationRouteTableIds")
        public java.util.List<String> destinationRouteTableIds;

        /**
         * <p>The IP address type to match. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: matches only IPv4 routes.</li>
         * <li><strong>IPv6</strong>: matches only IPv6 routes.</li>
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
         * <li><strong>System</strong>: system route, which is automatically generated by the system.</li>
         * <li><strong>Custom</strong>: custom route, which is manually added by a user.</li>
         * <li><strong>BGP</strong>: BGP route, which is propagated through the BGP routable protocol.</li>
         * </ul>
         * <p>You can specify multiple route types.</p>
         */
        @NameInMap("RouteTypes")
        public java.util.List<String> routeTypes;

        /**
         * <p>The list of source instance IDs to match. The following instance types are supported:</p>
         * <ul>
         * <li>Virtual private cloud (VPC) instance IDs</li>
         * <li>Virtual border router (VBR) instance IDs</li>
         * </ul>
         */
        @NameInMap("SourceInstanceIds")
        public java.util.List<String> sourceInstanceIds;

        /**
         * <p>Specifies whether to use the exclude matching mode for the list of source instance IDs. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): no. A match succeeds when the source instance ID of the route is in <strong>SourceInstanceIds.N</strong>.</li>
         * <li><strong>true</strong>: yes. A match succeeds when the source instance ID of the route is not in <strong>SourceInstanceIds.N</strong>.</li>
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
         * <li><strong>VPC</strong>: VPC instance.</li>
         * <li><strong>VBR</strong>: VBR instance.</li>
         * </ul>
         */
        @NameInMap("SourceInstanceTypes")
        public java.util.List<String> sourceInstanceTypes;

        /**
         * <p>The list of source region IDs to match.</p>
         */
        @NameInMap("SourceRegionIds")
        public java.util.List<String> sourceRegionIds;

        /**
         * <p>The list of source route table IDs to match.</p>
         */
        @NameInMap("SourceRouteTableIds")
        public java.util.List<String> sourceRouteTableIds;

        public static ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions self = new ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions();
            return TeaModel.build(map, self);
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setAddressPrefixesInclude(java.util.List<String> addressPrefixesInclude) {
            this.addressPrefixesInclude = addressPrefixesInclude;
            return this;
        }
        public java.util.List<String> getAddressPrefixesInclude() {
            return this.addressPrefixesInclude;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setAddressPrefixesMatch(java.util.List<String> addressPrefixesMatch) {
            this.addressPrefixesMatch = addressPrefixesMatch;
            return this;
        }
        public java.util.List<String> getAddressPrefixesMatch() {
            return this.addressPrefixesMatch;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setAsPathsInclude(java.util.List<Long> asPathsInclude) {
            this.asPathsInclude = asPathsInclude;
            return this;
        }
        public java.util.List<Long> getAsPathsInclude() {
            return this.asPathsInclude;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setAsPathsMatch(java.util.List<Long> asPathsMatch) {
            this.asPathsMatch = asPathsMatch;
            return this;
        }
        public java.util.List<Long> getAsPathsMatch() {
            return this.asPathsMatch;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setCommunitySetInclude(java.util.List<String> communitySetInclude) {
            this.communitySetInclude = communitySetInclude;
            return this;
        }
        public java.util.List<String> getCommunitySetInclude() {
            return this.communitySetInclude;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setCommunitySetMatch(java.util.List<String> communitySetMatch) {
            this.communitySetMatch = communitySetMatch;
            return this;
        }
        public java.util.List<String> getCommunitySetMatch() {
            return this.communitySetMatch;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setDestinationInstanceIds(java.util.List<String> destinationInstanceIds) {
            this.destinationInstanceIds = destinationInstanceIds;
            return this;
        }
        public java.util.List<String> getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
            this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setDestinationInstanceTypes(java.util.List<String> destinationInstanceTypes) {
            this.destinationInstanceTypes = destinationInstanceTypes;
            return this;
        }
        public java.util.List<String> getDestinationInstanceTypes() {
            return this.destinationInstanceTypes;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setDestinationRegionIds(java.util.List<String> destinationRegionIds) {
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }
        public java.util.List<String> getDestinationRegionIds() {
            return this.destinationRegionIds;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setDestinationRouteTableIds(java.util.List<String> destinationRouteTableIds) {
            this.destinationRouteTableIds = destinationRouteTableIds;
            return this;
        }
        public java.util.List<String> getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setMatchAddressType(String matchAddressType) {
            this.matchAddressType = matchAddressType;
            return this;
        }
        public String getMatchAddressType() {
            return this.matchAddressType;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setRouteTypes(java.util.List<String> routeTypes) {
            this.routeTypes = routeTypes;
            return this;
        }
        public java.util.List<String> getRouteTypes() {
            return this.routeTypes;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setSourceInstanceIds(java.util.List<String> sourceInstanceIds) {
            this.sourceInstanceIds = sourceInstanceIds;
            return this;
        }
        public java.util.List<String> getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
            this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
            return this;
        }
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setSourceInstanceTypes(java.util.List<String> sourceInstanceTypes) {
            this.sourceInstanceTypes = sourceInstanceTypes;
            return this;
        }
        public java.util.List<String> getSourceInstanceTypes() {
            return this.sourceInstanceTypes;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setSourceRegionIds(java.util.List<String> sourceRegionIds) {
            this.sourceRegionIds = sourceRegionIds;
            return this;
        }
        public java.util.List<String> getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions setSourceRouteTableIds(java.util.List<String> sourceRouteTableIds) {
            this.sourceRouteTableIds = sourceRouteTableIds;
            return this;
        }
        public java.util.List<String> getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

    }

    public static class ListRouteMapRulesResponseBodyRouteMapRulesSetActions extends TeaModel {
        /**
         * <p>The AS path to prepend when the regional gateway receives or advertises routes.</p>
         * <p>This parameter and <strong>AsPathReplace</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         */
        @NameInMap("AsPathPrepend")
        public java.util.List<Long> asPathPrepend;

        /**
         * <p>The AS path to replace when the regional gateway receives or advertises routes. The original AS path of the route is replaced with the list of AS numbers specified in this parameter.</p>
         * <p>This parameter and <strong>AsPathPrepend</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         */
        @NameInMap("AsPathReplace")
        public java.util.List<Long> asPathReplace;

        /**
         * <p>The community set to add to the route.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter and <strong>CommunityReplace</strong> are mutually exclusive and cannot be specified at the same time.</p>
         * <p>This parameter specifies the action to execute after a route meets the match conditions.</p>
         * <blockquote>
         * <p>Incorrect community configurations may prevent routes from being advertised to the on-premises data center.</p>
         * </blockquote>
         */
        @NameInMap("CommunityAdd")
        public java.util.List<String> communityAdd;

        /**
         * <p>The community set to replace the original community of the route.</p>
         * <p>Each community is in the format of n:m, where n and m range from <strong>1</strong> to <strong>65535</strong>. The community must comply with RFC 1997. Large communities (RFC 8092) are not supported.</p>
         * <p>This parameter and <strong>CommunityAdd</strong> are mutually exclusive and cannot be specified at the same time.</p>
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
         * <li>You can set policy priority of the associated route map rule only when <strong>RouteAction</strong> is set to <strong>Permit</strong>. Only the permitted routes continue to match the associated next route map rule.</li>
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
         * <li><strong>Permit</strong>: permits the matched routes.</li>
         * <li><strong>Deny</strong>: denies the matched routes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Permit</p>
         */
        @NameInMap("RouteAction")
        public String routeAction;

        public static ListRouteMapRulesResponseBodyRouteMapRulesSetActions build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapRulesResponseBodyRouteMapRulesSetActions self = new ListRouteMapRulesResponseBodyRouteMapRulesSetActions();
            return TeaModel.build(map, self);
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setAsPathPrepend(java.util.List<Long> asPathPrepend) {
            this.asPathPrepend = asPathPrepend;
            return this;
        }
        public java.util.List<Long> getAsPathPrepend() {
            return this.asPathPrepend;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setAsPathReplace(java.util.List<Long> asPathReplace) {
            this.asPathReplace = asPathReplace;
            return this;
        }
        public java.util.List<Long> getAsPathReplace() {
            return this.asPathReplace;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setCommunityAdd(java.util.List<String> communityAdd) {
            this.communityAdd = communityAdd;
            return this;
        }
        public java.util.List<String> getCommunityAdd() {
            return this.communityAdd;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setCommunityReplace(java.util.List<String> communityReplace) {
            this.communityReplace = communityReplace;
            return this;
        }
        public java.util.List<String> getCommunityReplace() {
            return this.communityReplace;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setNextPriority(Long nextPriority) {
            this.nextPriority = nextPriority;
            return this;
        }
        public Long getNextPriority() {
            return this.nextPriority;
        }

        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setRouteAction(String routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public String getRouteAction() {
            return this.routeAction;
        }

    }

    public static class ListRouteMapRulesResponseBodyRouteMapRules extends TeaModel {
        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Matches production prefixes from on-prem and sets a higher local preference.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The match conditions of the route map rule. The system executes the actions defined in <strong>SetActions</strong> only when a route meets all the match conditions defined in this parameter.</p>
         */
        @NameInMap("MatchConditions")
        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions matchConditions;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Permit-Prod-Prefixes-Set-LP</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the route map.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-0a1b2c3d4e5f6a7b8</p>
         */
        @NameInMap("RouteMapId")
        public String routeMapId;

        /**
         * <p>The ID of the route map rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rmr-3dm13f66wtctcnydup</p>
         */
        @NameInMap("RouteMapRuleId")
        public String routeMapRuleId;

        /**
         * <p>The actions to execute for the route map rule. After a route meets all the match conditions defined in <strong>MatchConditions</strong>, the system processes the route based on the actions defined in this parameter.</p>
         */
        @NameInMap("SetActions")
        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions setActions;

        /**
         * <p>The status of the route map rule. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The rule is being created.</li>
         * <li><strong>Updating</strong>: The rule is being updated.</li>
         * <li><strong>Active</strong>: The rule is available.</li>
         * <li><strong>Deleting</strong>: The rule is being deleted.</li>
         * <li><strong>Deleted</strong>: The rule is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListRouteMapRulesResponseBodyRouteMapRules build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapRulesResponseBodyRouteMapRules self = new ListRouteMapRulesResponseBodyRouteMapRules();
            return TeaModel.build(map, self);
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setMatchConditions(ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions matchConditions) {
            this.matchConditions = matchConditions;
            return this;
        }
        public ListRouteMapRulesResponseBodyRouteMapRulesMatchConditions getMatchConditions() {
            return this.matchConditions;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setRouteMapRuleId(String routeMapRuleId) {
            this.routeMapRuleId = routeMapRuleId;
            return this;
        }
        public String getRouteMapRuleId() {
            return this.routeMapRuleId;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setSetActions(ListRouteMapRulesResponseBodyRouteMapRulesSetActions setActions) {
            this.setActions = setActions;
            return this;
        }
        public ListRouteMapRulesResponseBodyRouteMapRulesSetActions getSetActions() {
            return this.setActions;
        }

        public ListRouteMapRulesResponseBodyRouteMapRules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
