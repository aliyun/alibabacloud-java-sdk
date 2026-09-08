// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page when entries are returned in pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query is to be sent.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fce19****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C3835E5E-1504-4344-B1BB-98A4110F1079</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of route entries.</p>
     */
    @NameInMap("TransitRouterRouteEntries")
    public java.util.List<ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries> transitRouterRouteEntries;

    public static ListTransitRouterRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteEntriesResponseBody self = new ListTransitRouterRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteEntriesResponseBody setTransitRouterRouteEntries(java.util.List<ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries> transitRouterRouteEntries) {
        this.transitRouterRouteEntries = transitRouterRouteEntries;
        return this;
    }
    public java.util.List<ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries> getTransitRouterRouteEntries() {
        return this.transitRouterRouteEntries;
    }

    public static class ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes extends TeaModel {
        /**
         * <p>The list of AS Path attributes of the route entry.</p>
         */
        @NameInMap("AsPaths")
        public java.util.List<String> asPaths;

        /**
         * <p>The list of Community attributes of the route entry.</p>
         */
        @NameInMap("Communities")
        public java.util.List<String> communities;

        /**
         * <p>The instance ID of the original instance from which the route entry originates.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-m5ent6du8deaq5*****</p>
         */
        @NameInMap("OriginInstanceId")
        public String originInstanceId;

        /**
         * <p>The type of the instance from which the route originates.</p>
         * <ul>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC) instance.</li>
         * <li><strong>VBR</strong>: Virtual Border Router (VBR) instance.</li>
         * <li><strong>TR</strong>: transit router instance.</li>
         * <li><strong>VPN</strong>: IPsec connection instance.</li>
         * <li><strong>CCN</strong>: Cloud Connect Network (CCN) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        @NameInMap("OriginInstanceType")
        public String originInstanceType;

        /**
         * <p>The original route type when the route was generated.</p>
         * <ul>
         * <li><strong>System</strong>: system route.</li>
         * <li><strong>Custom</strong>: custom route.</li>
         * <li><strong>Static</strong>: static route.</li>
         * <li><strong>BGP</strong>: BGP route.</li>
         * <li><strong>BlackHole</strong>: blackhole route.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("OriginRouteType")
        public String originRouteType;

        /**
         * <p>The priority of the route entry.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Preference")
        public Integer preference;

        public static ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes self = new ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes setAsPaths(java.util.List<String> asPaths) {
            this.asPaths = asPaths;
            return this;
        }
        public java.util.List<String> getAsPaths() {
            return this.asPaths;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes setCommunities(java.util.List<String> communities) {
            this.communities = communities;
            return this;
        }
        public java.util.List<String> getCommunities() {
            return this.communities;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes setOriginInstanceId(String originInstanceId) {
            this.originInstanceId = originInstanceId;
            return this;
        }
        public String getOriginInstanceId() {
            return this.originInstanceId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes setOriginInstanceType(String originInstanceType) {
            this.originInstanceType = originInstanceType;
            return this;
        }
        public String getOriginInstanceType() {
            return this.originInstanceType;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes setOriginRouteType(String originRouteType) {
            this.originRouteType = originRouteType;
            return this;
        }
        public String getOriginRouteType() {
            return this.originRouteType;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes setPreference(Integer preference) {
            this.preference = preference;
            return this;
        }
        public Integer getPreference() {
            return this.preference;
        }

    }

    public static class ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries extends TeaModel {
        /**
         * <p>The time when the route entry was created.</p>
         * <p>The time is displayed in UTC in the YYYY-MM-DDThh:mmZ format.</p>
         * <blockquote>
         * <p>This parameter is returned only for statically configured routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T07:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the current route entry can be modified.</p>
         * <ul>
         * <li><strong>true</strong>: the route entry can be modified. You can delete the route entry.</li>
         * <li><strong>false</strong>: the route entry cannot be modified. The route entry is automatically generated by the system and does not support editing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        /**
         * <p>The path attributes of the route.</p>
         */
        @NameInMap("PathAttributes")
        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes pathAttributes;

        /**
         * <p>The ID of the prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-k1ainl66z3527773d****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The tag of the route entry.</p>
         * <p>The only valid value is <strong>PermitVbr</strong>, which indicates that the current route entry is propagated only to the route tables of VBR instances under the transit router instance.</p>
         * <blockquote>
         * <p>This parameter is returned only for system-generated routes for transit router CIDR blocks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PermitVbr</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The description of the route entry.</p>
         * <blockquote>
         * <p>This parameter is returned only for statically configured routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CidrRoute</p>
         */
        @NameInMap("TransitRouterRouteEntryDescription")
        public String transitRouterRouteEntryDescription;

        /**
         * <p>The destination CIDR block of the route entry. An IPv4 CIDR block or an IPv6 CIDR block is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
        public String transitRouterRouteEntryDestinationCidrBlock;

        /**
         * <p>The ID of the route entry.</p>
         * <blockquote>
         * <p>This parameter is returned only for statically configured routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rte-oklkgwmj97z6dn****</p>
         */
        @NameInMap("TransitRouterRouteEntryId")
        public String transitRouterRouteEntryId;

        /**
         * <p>The name of the route entry.</p>
         * <blockquote>
         * <p>This parameter is returned only for statically configured routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("TransitRouterRouteEntryName")
        public String transitRouterRouteEntryName;

        /**
         * <p>The next hop ID of the route entry. This parameter is not returned for blackhole routes.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-vx6iwhjr1x1j78****</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopId")
        public String transitRouterRouteEntryNextHopId;

        /**
         * <p>The instance ID of the next hop of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ent6du8deaq5*****</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopResourceId")
        public String transitRouterRouteEntryNextHopResourceId;

        /**
         * <p>The type of the next hop instance of the route entry.</p>
         * <ul>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC) instance.</li>
         * <li><strong>VBR</strong>: Virtual Border Router (VBR) instance.</li>
         * <li><strong>TR</strong>: transit router instance.</li>
         * <li><strong>VPN</strong>: IPsec connection instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopResourceType")
        public String transitRouterRouteEntryNextHopResourceType;

        /**
         * <p>The next hop type of the route entry.</p>
         * <ul>
         * <li><strong>BlackHole</strong>: the route entry is a blackhole route. All traffic destined for the destination CIDR block is dropped.</li>
         * <li><strong>Attachment</strong>: the next hop of the route entry is a network instance connection. All traffic destined for the destination CIDR block is forwarded to the specified network instance connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlackHole</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopType")
        public String transitRouterRouteEntryNextHopType;

        /**
         * <p>The instance ID of the origin of the route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ent6du8deaq5*****</p>
         */
        @NameInMap("TransitRouterRouteEntryOriginResourceId")
        public String transitRouterRouteEntryOriginResourceId;

        /**
         * <p>The type of the origin instance of the route entry.</p>
         * <ul>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC) instance.</li>
         * <li><strong>VBR</strong>: Virtual Border Router (VBR) instance.</li>
         * <li><strong>TR</strong>: transit router instance.</li>
         * <li><strong>VPN</strong>: IPsec connection instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("TransitRouterRouteEntryOriginResourceType")
        public String transitRouterRouteEntryOriginResourceType;

        /**
         * <p>The status of the route entry.</p>
         * <ul>
         * <li><strong>Active</strong>: active.</li>
         * <li><strong>Rejected</strong>: rejected due to a route conflict.</li>
         * <li><strong>Prohibited</strong>: prohibited by a routing policy.</li>
         * <li><strong>Standby</strong>: standby.</li>
         * <li><strong>Candidate</strong>: candidate.</li>
         * <li><strong>Creating</strong>: being created.</li>
         * <li><strong>Deleting</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("TransitRouterRouteEntryStatus")
        public String transitRouterRouteEntryStatus;

        /**
         * <p>The type of the route entry.</p>
         * <ul>
         * <li><strong>Static</strong>: a statically configured route entry.</li>
         * <li><strong>Propagated</strong>: a route entry generated by automatic learning.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Static</p>
         */
        @NameInMap("TransitRouterRouteEntryType")
        public String transitRouterRouteEntryType;

        public static ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries self = new ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setOperationalMode(Boolean operationalMode) {
            this.operationalMode = operationalMode;
            return this;
        }
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setPathAttributes(ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes pathAttributes) {
            this.pathAttributes = pathAttributes;
            return this;
        }
        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes getPathAttributes() {
            return this.pathAttributes;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setPrefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        public String getPrefixListId() {
            return this.prefixListId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
            return this;
        }
        public String getTransitRouterRouteEntryDescription() {
            return this.transitRouterRouteEntryDescription;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }
        public String getTransitRouterRouteEntryDestinationCidrBlock() {
            return this.transitRouterRouteEntryDestinationCidrBlock;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.transitRouterRouteEntryId = transitRouterRouteEntryId;
            return this;
        }
        public String getTransitRouterRouteEntryId() {
            return this.transitRouterRouteEntryId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.transitRouterRouteEntryName = transitRouterRouteEntryName;
            return this;
        }
        public String getTransitRouterRouteEntryName() {
            return this.transitRouterRouteEntryName;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }
        public String getTransitRouterRouteEntryNextHopId() {
            return this.transitRouterRouteEntryNextHopId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
            this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
            return this;
        }
        public String getTransitRouterRouteEntryNextHopResourceId() {
            return this.transitRouterRouteEntryNextHopResourceId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
            this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
            return this;
        }
        public String getTransitRouterRouteEntryNextHopResourceType() {
            return this.transitRouterRouteEntryNextHopResourceType;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }
        public String getTransitRouterRouteEntryNextHopType() {
            return this.transitRouterRouteEntryNextHopType;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
            this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
            return this;
        }
        public String getTransitRouterRouteEntryOriginResourceId() {
            return this.transitRouterRouteEntryOriginResourceId;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
            this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
            return this;
        }
        public String getTransitRouterRouteEntryOriginResourceType() {
            return this.transitRouterRouteEntryOriginResourceType;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
            this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
            return this;
        }
        public String getTransitRouterRouteEntryStatus() {
            return this.transitRouterRouteEntryStatus;
        }

        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntries setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
            this.transitRouterRouteEntryType = transitRouterRouteEntryType;
            return this;
        }
        public String getTransitRouterRouteEntryType() {
            return this.transitRouterRouteEntryType;
        }

    }

}
