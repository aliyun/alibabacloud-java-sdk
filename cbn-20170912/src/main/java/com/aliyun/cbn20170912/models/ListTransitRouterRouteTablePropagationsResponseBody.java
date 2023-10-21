// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablePropagationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>A list of route learning correlations.</p>
     */
    @NameInMap("TransitRouterPropagations")
    public java.util.List<ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations> transitRouterPropagations;

    public static ListTransitRouterRouteTablePropagationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablePropagationsResponseBody self = new ListTransitRouterRouteTablePropagationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setTransitRouterPropagations(java.util.List<ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations> transitRouterPropagations) {
        this.transitRouterPropagations = transitRouterPropagations;
        return this;
    }
    public java.util.List<ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations> getTransitRouterPropagations() {
        return this.transitRouterPropagations;
    }

    public static class ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations extends TeaModel {
        /**
         * <p>The ID of the network instance.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <br>
         * <p>*   **VPC**: VPC</p>
         * <p>*   **VBR**: VBR</p>
         * <p>*   **TR**: transit router</p>
         * <p>*   **VPN**: VPN connection</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the route learning correlation. Valid values:</p>
         * <br>
         * <p>*   **Enabling**: being enabled</p>
         * <p>*   **Disabling**: being disabled</p>
         * <p>*   **Active**: available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the route table of the Enterprise Edition transit router.</p>
         */
        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        public static ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations self = new ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

    }

}
