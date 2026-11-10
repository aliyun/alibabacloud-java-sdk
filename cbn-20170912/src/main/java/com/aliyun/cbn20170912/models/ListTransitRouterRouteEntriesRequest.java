// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesRequest extends TeaModel {
    /**
     * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
     * <li>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned from the last API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fce19****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-6ehtn5kqxgeyy08fi****</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The filter conditions for the CIDR blocks of the route entry in the routing table.</p>
     */
    @NameInMap("RouteFilter")
    public java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> routeFilter;

    /**
     * <p>The destination CIDR block of the route entry (<strong>This parameter is deprecated. Use the RouteFilter parameter instead</strong>).</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/24</p>
     */
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @Deprecated
    public String transitRouterRouteEntryDestinationCidrBlock;

    /**
     * <p>The IDs of the route entry in the routing table.</p>
     * 
     * <strong>example:</strong>
     * <p>rte-oklkgwmj97z6dn****</p>
     */
    @NameInMap("TransitRouterRouteEntryIds")
    public java.util.List<String> transitRouterRouteEntryIds;

    /**
     * <p>The names of the route entry in the routing table.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterRouteEntryNames")
    public java.util.List<String> transitRouterRouteEntryNames;

    /**
     * <p>The ID of the network instance connection associated with the next hop of the route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-nls9fzkfat8934****</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopId")
    public String transitRouterRouteEntryNextHopId;

    /**
     * <p>The next hop instance ID of the route entry in the routing table.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5ent6du8deaq5*****</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopResourceId")
    public String transitRouterRouteEntryNextHopResourceId;

    /**
     * <p>The next hop instance type of the route entry. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: VPC.</li>
     * <li><strong>VBR</strong>: VBR.</li>
     * <li><strong>TR</strong>: transit router.</li>
     * <li><strong>VPN</strong>: IPsec connection.</li>
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
     * <li><strong>BlackHole</strong>: specifies that the route entry is a blackhole route.</li>
     * <li><strong>Attachment</strong>: specifies that the next hop of the route entry is a network instance connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Attachment</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopType")
    public String transitRouterRouteEntryNextHopType;

    /**
     * <p>The origin instance ID of the route entry in the routing table.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5ent6du8deaq5*****</p>
     */
    @NameInMap("TransitRouterRouteEntryOriginResourceId")
    public String transitRouterRouteEntryOriginResourceId;

    /**
     * <p>The origin instance type of the route entry. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: VPC.</li>
     * <li><strong>VBR</strong>: VBR.</li>
     * <li><strong>TR</strong>: transit router.</li>
     * <li><strong>VPN</strong>: IPsec connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TransitRouterRouteEntryOriginResourceType")
    public String transitRouterRouteEntryOriginResourceType;

    /**
     * <p>The status of the route entry. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: queries route entries in all states.</li>
     * <li><strong>Active</strong> (default): queries only active route entries.</li>
     * <li><strong>Rejected</strong>: queries only route entries that are rejected due to route conflicts.</li>
     * <li><strong>Prohibited</strong>: queries only route entries that are prohibited by route maps.</li>
     * <li><strong>Standby</strong>: queries only standby route entries.</li>
     * <li><strong>Candidate</strong>: queries only candidate route entries.</li>
     * </ul>
     * <p>If you do not specify this parameter, the system queries only active route entries by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("TransitRouterRouteEntryStatus")
    public String transitRouterRouteEntryStatus;

    /**
     * <p>The destination type of the route entry. Valid values:</p>
     * <ul>
     * <li><strong>Propagated</strong>: generated by automatic learning of the current routing table.</li>
     * <li><strong>Static</strong>: statically configured in the current routing table.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Propagated</p>
     */
    @NameInMap("TransitRouterRouteEntryType")
    public String transitRouterRouteEntryType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1dudbh2d5na6b50****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static ListTransitRouterRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteEntriesRequest self = new ListTransitRouterRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterRouteEntriesRequest setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public ListTransitRouterRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterRouteEntriesRequest setRouteFilter(java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }
    public java.util.List<ListTransitRouterRouteEntriesRequestRouteFilter> getRouteFilter() {
        return this.routeFilter;
    }

    @Deprecated
    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
        this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
        return this;
    }
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryIds(java.util.List<String> transitRouterRouteEntryIds) {
        this.transitRouterRouteEntryIds = transitRouterRouteEntryIds;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteEntryIds() {
        return this.transitRouterRouteEntryIds;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNames(java.util.List<String> transitRouterRouteEntryNames) {
        this.transitRouterRouteEntryNames = transitRouterRouteEntryNames;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteEntryNames() {
        return this.transitRouterRouteEntryNames;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
        this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
        this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopResourceId() {
        return this.transitRouterRouteEntryNextHopResourceId;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
        this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopResourceType() {
        return this.transitRouterRouteEntryNextHopResourceType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
        this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
        this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
        return this;
    }
    public String getTransitRouterRouteEntryOriginResourceId() {
        return this.transitRouterRouteEntryOriginResourceId;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
        this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
        return this;
    }
    public String getTransitRouterRouteEntryOriginResourceType() {
        return this.transitRouterRouteEntryOriginResourceType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
        this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
        return this;
    }
    public String getTransitRouterRouteEntryStatus() {
        return this.transitRouterRouteEntryStatus;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
        this.transitRouterRouteEntryType = transitRouterRouteEntryType;
        return this;
    }
    public String getTransitRouterRouteEntryType() {
        return this.transitRouterRouteEntryType;
    }

    public ListTransitRouterRouteEntriesRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static class ListTransitRouterRouteEntriesRequestRouteFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>PrefixExactMatchCidrs</strong>: exact match.</li>
         * <li><strong>LongestPrefixMatchCidrs</strong>: longest prefix match. Both IP addresses and CIDR blocks are supported.</li>
         * <li><strong>SubnetOfMatchCidrs</strong>: subnet match. Matches the subnets of the specified CIDR block, including the specified CIDR block.</li>
         * <li><strong>SupernetOfMatchCidrs</strong>: supernet match. Matches the supernets of the specified CIDR block, including the specified CIDR block.</li>
         * </ul>
         * <p>Multiple filter conditions are connected by the <strong>AND</strong> logical operator by default. A route entry must meet all filter conditions to be considered a match. You cannot specify duplicate filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>PrefixExactMatchCidrs</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of filter condition values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListTransitRouterRouteEntriesRequestRouteFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteEntriesRequestRouteFilter self = new ListTransitRouterRouteEntriesRequestRouteFilter();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteEntriesRequestRouteFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterRouteEntriesRequestRouteFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
