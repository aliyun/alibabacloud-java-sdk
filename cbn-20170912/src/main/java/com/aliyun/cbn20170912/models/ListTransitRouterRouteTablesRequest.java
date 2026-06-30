// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li><p>If this is your first query or no next query is to be sent, do not specify this parameter.</p>
     * </li>
     * <li><p>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned from the last API call.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The features of the route table.</p>
     */
    @NameInMap("RouteTableOptions")
    public ListTransitRouterRouteTablesRequestRouteTableOptions routeTableOptions;

    /**
     * <p>The tag.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTransitRouterRouteTablesRequestTag> tag;

    /**
     * <p>The ID of the Enterprise Edition transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf654ttymmljlvh2x****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The ID of the route table.</p>
     * <p>You can query multiple route tables at a time. The maximum value of <strong>N</strong> is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1l8awdb4iuo9uwu****</p>
     */
    @NameInMap("TransitRouterRouteTableIds")
    public java.util.List<String> transitRouterRouteTableIds;

    /**
     * <p>The name of the route table.</p>
     * <p>You can query multiple route tables at a time. The maximum value of <strong>N</strong> is <strong>20</strong>.</p>
     * <blockquote>
     * <p>If you query route tables using both <strong>TransitRouterRouteTableNames.N</strong> and <strong>TransitRouterRouteTableIds.N</strong>, make sure that the names and IDs match.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterRouteTableNames")
    public java.util.List<String> transitRouterRouteTableNames;

    /**
     * <p>The status of the route table. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The route table is being created.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The route table is being deleted.</p>
     * </li>
     * <li><p><strong>Active</strong>: The route table is available.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("TransitRouterRouteTableStatus")
    public String transitRouterRouteTableStatus;

    /**
     * <p>The type of the route table. Valid values:</p>
     * <ul>
     * <li><p><strong>Custom</strong>: a custom route table.</p>
     * </li>
     * <li><p><strong>System</strong>: the default route table.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("TransitRouterRouteTableType")
    public String transitRouterRouteTableType;

    public static ListTransitRouterRouteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablesRequest self = new ListTransitRouterRouteTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterRouteTablesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterRouteTablesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterRouteTablesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterRouteTablesRequest setRouteTableOptions(ListTransitRouterRouteTablesRequestRouteTableOptions routeTableOptions) {
        this.routeTableOptions = routeTableOptions;
        return this;
    }
    public ListTransitRouterRouteTablesRequestRouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    public ListTransitRouterRouteTablesRequest setTag(java.util.List<ListTransitRouterRouteTablesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTransitRouterRouteTablesRequestTag> getTag() {
        return this.tag;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableIds(java.util.List<String> transitRouterRouteTableIds) {
        this.transitRouterRouteTableIds = transitRouterRouteTableIds;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteTableIds() {
        return this.transitRouterRouteTableIds;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableNames(java.util.List<String> transitRouterRouteTableNames) {
        this.transitRouterRouteTableNames = transitRouterRouteTableNames;
        return this;
    }
    public java.util.List<String> getTransitRouterRouteTableNames() {
        return this.transitRouterRouteTableNames;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
        this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
        return this;
    }
    public String getTransitRouterRouteTableStatus() {
        return this.transitRouterRouteTableStatus;
    }

    public ListTransitRouterRouteTablesRequest setTransitRouterRouteTableType(String transitRouterRouteTableType) {
        this.transitRouterRouteTableType = transitRouterRouteTableType;
        return this;
    }
    public String getTransitRouterRouteTableType() {
        return this.transitRouterRouteTableType;
    }

    public static class ListTransitRouterRouteTablesRequestRouteTableOptions extends TeaModel {
        /**
         * <p>The multi-region equal-cost multi-path (ECMP) routing feature. Valid values:</p>
         * <ul>
         * <li><p><strong>disable</strong>: Disables multi-region ECMP routing. After this feature is disabled, for routes that are learned from different regions and have the same prefix and other attributes, the system selects the transit router with the smallest region ID as the next hop. Region IDs are sorted in alphabetical order. This changes the latency and bandwidth consumption between different regions. Make sure that you fully evaluate the impact before you disable the feature.</p>
         * </li>
         * <li><p><strong>enable</strong>: Enables multi-region ECMP routing. After this feature is enabled, for routes that are learned from different regions and have the same prefix and other attributes, ECMP routing is formed. This changes the latency and bandwidth consumption between different regions. Make sure that you fully evaluate the impact before you enable the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("MultiRegionECMP")
        public String multiRegionECMP;

        public static ListTransitRouterRouteTablesRequestRouteTableOptions build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablesRequestRouteTableOptions self = new ListTransitRouterRouteTablesRequestRouteTableOptions();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablesRequestRouteTableOptions setMultiRegionECMP(String multiRegionECMP) {
            this.multiRegionECMP = multiRegionECMP;
            return this;
        }
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

    }

    public static class ListTransitRouterRouteTablesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>Each tag key must have a corresponding tag value. You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterRouteTablesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablesRequestTag self = new ListTransitRouterRouteTablesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterRouteTablesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
