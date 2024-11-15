// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>A list of route entries.</p>
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
         * <p>The route AS path.</p>
         */
        @NameInMap("AsPaths")
        public java.util.List<String> asPaths;

        /**
         * <p>The route community.</p>
         */
        @NameInMap("Communities")
        public java.util.List<String> communities;

        /**
         * <p>The source instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-m5ent6du8deaq5*****</p>
         */
        @NameInMap("OriginInstanceId")
        public String originInstanceId;

        /**
         * <p>The source instance type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>TR</strong></li>
         * <li><strong>VPN</strong></li>
         * <li><strong>CCN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        @NameInMap("OriginInstanceType")
        public String originInstanceType;

        /**
         * <p>The route type. Valid values:</p>
         * <ul>
         * <li><strong>System</strong></li>
         * <li><strong>Custom</strong></li>
         * <li><strong>static</strong></li>
         * <li><strong>BGP</strong></li>
         * <li><strong>BlackHole</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("OriginRouteType")
        public String originRouteType;

        /**
         * <p>The route priority.</p>
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
         * <p>The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only for static routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T07:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the route can be managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The route can be managed. You can delete the route.</li>
         * <li><strong>false</strong>: The route cannot be managed because it is automatically generated by the system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        /**
         * <p>The route attributes.</p>
         */
        @NameInMap("PathAttributes")
        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes pathAttributes;

        /**
         * <p>The prefix list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-k1ainl66z3527773d****</p>
         */
        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The route tag.</p>
         * <p>Only <strong>PermitVbr</strong> may be returned, which indicates that the route is advertised only to the route tables of the virtual border routers (VBRs) that are connected to the transit router.</p>
         * <blockquote>
         * <p> This parameter is returned only for routes whose CIDR blocks are automatically generated by the system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PermitVbr</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The route description.</p>
         * <blockquote>
         * <p> This parameter is returned only for static routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CidrRoute</p>
         */
        @NameInMap("TransitRouterRouteEntryDescription")
        public String transitRouterRouteEntryDescription;

        /**
         * <p>The destination CIDR block of the route entry. An IPv4 or IPv6 CIDR block is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
        public String transitRouterRouteEntryDestinationCidrBlock;

        /**
         * <p>The route ID.</p>
         * <blockquote>
         * <p> This parameter is returned only for static routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rte-oklkgwmj97z6dn****</p>
         */
        @NameInMap("TransitRouterRouteEntryId")
        public String transitRouterRouteEntryId;

        /**
         * <p>The route name.</p>
         * <blockquote>
         * <p> This parameter is returned only for static routes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("TransitRouterRouteEntryName")
        public String transitRouterRouteEntryName;

        /**
         * <p>The next hop ID. This parameter is not returned if the route is a blackhole route.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-vx6iwhjr1x1j78****</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopId")
        public String transitRouterRouteEntryNextHopId;

        /**
         * <p>The next hop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ent6du8deaq5*****</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopResourceId")
        public String transitRouterRouteEntryNextHopResourceId;

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>TR</strong></li>
         * <li><strong>VPN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopResourceType")
        public String transitRouterRouteEntryNextHopResourceType;

        /**
         * <p>The next hop type. Valid values:</p>
         * <ul>
         * <li><strong>BlackHole</strong>: a blackhole route. Packets destined for the destination CIDR block of the route are dropped.</li>
         * <li><strong>Attachment</strong>: a network instance connection. Packets destined for the destination CIDR block of the route are forwarded to the specified network instance connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BlackHole</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopType")
        public String transitRouterRouteEntryNextHopType;

        /**
         * <p>The source instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ent6du8deaq5*****</p>
         */
        @NameInMap("TransitRouterRouteEntryOriginResourceId")
        public String transitRouterRouteEntryOriginResourceId;

        /**
         * <p>The source instance type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VBR</strong></li>
         * <li><strong>TR</strong></li>
         * <li><strong>VPN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("TransitRouterRouteEntryOriginResourceType")
        public String transitRouterRouteEntryOriginResourceType;

        /**
         * <p>The route status. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong></li>
         * <li><strong>Rejected</strong></li>
         * <li><strong>Prohibited</strong></li>
         * <li><strong>Standby</strong></li>
         * <li><strong>Candidate</strong></li>
         * <li><strong>Creating</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("TransitRouterRouteEntryStatus")
        public String transitRouterRouteEntryStatus;

        /**
         * <p>The type of the route. Valid values:</p>
         * <ul>
         * <li><strong>Static</strong>: static routes.</li>
         * <li><strong>Propagated</strong>: automatically learned by the route table.</li>
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
