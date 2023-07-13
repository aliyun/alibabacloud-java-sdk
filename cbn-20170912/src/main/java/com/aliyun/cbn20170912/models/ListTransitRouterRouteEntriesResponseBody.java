// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If the **NextToken** parameter is empty, no next page exists.</p>
     * <p>*   If a value of **NextToken** was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The queried routes.</p>
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
        @NameInMap("AsPaths")
        public java.util.List<String> asPaths;

        @NameInMap("Communities")
        public java.util.List<String> communities;

        @NameInMap("OriginInstanceId")
        public String originInstanceId;

        @NameInMap("OriginInstanceType")
        public String originInstanceType;

        @NameInMap("OriginRouteType")
        public String originRouteType;

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
         * <p>The time when the route was created.</p>
         * <br>
         * <p>The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
         * <br>
         * <p>>  This parameter is returned only for static routes.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the route can be managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The route can be managed. You can delete the route.</p>
         * <p>*   **false**: The route cannot be managed because it is automatically generated by the system.</p>
         */
        @NameInMap("OperationalMode")
        public Boolean operationalMode;

        @NameInMap("PathAttributes")
        public ListTransitRouterRouteEntriesResponseBodyTransitRouterRouteEntriesPathAttributes pathAttributes;

        @NameInMap("PrefixListId")
        public String prefixListId;

        /**
         * <p>The tag of the route.</p>
         * <br>
         * <p>Only **PermitVbr** may be returned, which indicates that the route is advertised only to the route table of the virtual border router (VBR) that is connected to the transit router.</p>
         * <br>
         * <p>>  This parameter is returned only for automatically learned routes.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The description of the route.</p>
         * <br>
         * <p>>  This parameter is returned only for static routes.</p>
         */
        @NameInMap("TransitRouterRouteEntryDescription")
        public String transitRouterRouteEntryDescription;

        /**
         * <p>The destination CIDR block of the route.</p>
         */
        @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
        public String transitRouterRouteEntryDestinationCidrBlock;

        /**
         * <p>The route ID.</p>
         * <br>
         * <p>>  This parameter is returned only for static routes.</p>
         */
        @NameInMap("TransitRouterRouteEntryId")
        public String transitRouterRouteEntryId;

        /**
         * <p>The route name.</p>
         * <br>
         * <p>>  This parameter is returned only for static routes.</p>
         */
        @NameInMap("TransitRouterRouteEntryName")
        public String transitRouterRouteEntryName;

        /**
         * <p>The ID of the next hop.</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopId")
        public String transitRouterRouteEntryNextHopId;

        @NameInMap("TransitRouterRouteEntryNextHopResourceId")
        public String transitRouterRouteEntryNextHopResourceId;

        @NameInMap("TransitRouterRouteEntryNextHopResourceType")
        public String transitRouterRouteEntryNextHopResourceType;

        /**
         * <p>The type of next hop. Valid values:</p>
         * <br>
         * <p>*   **BlackHole**: a blackhole route. Packets destined for the destination CIDR block of the route are dropped.</p>
         * <p>*   **Attachment**: a network instance connection. Packets destined for the destination CIDR block of the route are forwarded to the specified network instance connection.</p>
         */
        @NameInMap("TransitRouterRouteEntryNextHopType")
        public String transitRouterRouteEntryNextHopType;

        @NameInMap("TransitRouterRouteEntryOriginResourceId")
        public String transitRouterRouteEntryOriginResourceId;

        @NameInMap("TransitRouterRouteEntryOriginResourceType")
        public String transitRouterRouteEntryOriginResourceType;

        /**
         * <p>The status of the route. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The route is being created.</p>
         * <p>*   **Active**: The route is available.</p>
         * <p>*   **Deleting**: The route is being deleted.</p>
         */
        @NameInMap("TransitRouterRouteEntryStatus")
        public String transitRouterRouteEntryStatus;

        /**
         * <p>The type of the route. Valid values:</p>
         * <br>
         * <p>*   **Static**: a static route</p>
         * <p>*   **Propagated**: an automatically learned route</p>
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
