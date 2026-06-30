// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</p>
     * </li>
     * <li><p>If a value is returned for <strong>NextToken</strong>, the value is the token that is used for the next query.</p>
     * </li>
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
     * <p>82678F4A-C9F7-4CC1-8BF0-D619A63BFC57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of route tables.</p>
     */
    @NameInMap("TransitRouterRouteTables")
    public java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables> transitRouterRouteTables;

    public static ListTransitRouterRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablesResponseBody self = new ListTransitRouterRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteTablesResponseBody setTransitRouterRouteTables(java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables> transitRouterRouteTables) {
        this.transitRouterRouteTables = transitRouterRouteTables;
        return this;
    }
    public java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables> getTransitRouterRouteTables() {
        return this.transitRouterRouteTables;
    }

    public static class ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions extends TeaModel {
        /**
         * <p>The multi-region ECMP routing feature. Valid values:</p>
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

        public static ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions self = new ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions setMultiRegionECMP(String multiRegionECMP) {
            this.multiRegionECMP = multiRegionECMP;
            return this;
        }
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

    }

    public static class ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags self = new ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables extends TeaModel {
        /**
         * <p>The time when the route table was created.</p>
         * <p>The time is displayed in the YYYY-MM-DDThh:mmZ format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T09:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The features of the route table.</p>
         */
        @NameInMap("RouteTableOptions")
        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions routeTableOptions;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags> tags;

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-8vb8bie2koduo5awz****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The description of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        @NameInMap("TransitRouterRouteTableDescription")
        public String transitRouterRouteTableDescription;

        /**
         * <p>The route table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1dudbh2d5na6b50****</p>
         */
        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        /**
         * <p>The name of the route table.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("TransitRouterRouteTableName")
        public String transitRouterRouteTableName;

        /**
         * <p>The status of the route table.</p>
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
         * <p>The type of the route table.</p>
         * <ul>
         * <li><p><strong>Custom</strong>: a custom route table.</p>
         * </li>
         * <li><p><strong>System</strong>: the default route table.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("TransitRouterRouteTableType")
        public String transitRouterRouteTableType;

        public static ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables self = new ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setRouteTableOptions(ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions routeTableOptions) {
            this.routeTableOptions = routeTableOptions;
            return this;
        }
        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesRouteTableOptions getRouteTableOptions() {
            return this.routeTableOptions;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTags(java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTablesTags> getTags() {
            return this.tags;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
            this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
            return this;
        }
        public String getTransitRouterRouteTableDescription() {
            return this.transitRouterRouteTableDescription;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableName(String transitRouterRouteTableName) {
            this.transitRouterRouteTableName = transitRouterRouteTableName;
            return this;
        }
        public String getTransitRouterRouteTableName() {
            return this.transitRouterRouteTableName;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
            this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
            return this;
        }
        public String getTransitRouterRouteTableStatus() {
            return this.transitRouterRouteTableStatus;
        }

        public ListTransitRouterRouteTablesResponseBodyTransitRouterRouteTables setTransitRouterRouteTableType(String transitRouterRouteTableType) {
            this.transitRouterRouteTableType = transitRouterRouteTableType;
            return this;
        }
        public String getTransitRouterRouteTableType() {
            return this.transitRouterRouteTableType;
        }

    }

}
