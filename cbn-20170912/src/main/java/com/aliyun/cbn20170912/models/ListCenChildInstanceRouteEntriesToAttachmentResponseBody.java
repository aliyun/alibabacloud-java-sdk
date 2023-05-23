// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenChildInstanceRouteEntriesToAttachmentResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is not returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The detailed information about the route.</p>
     */
    @NameInMap("RouteEntry")
    public java.util.List<ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry> routeEntry;

    public static ListCenChildInstanceRouteEntriesToAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCenChildInstanceRouteEntriesToAttachmentResponseBody self = new ListCenChildInstanceRouteEntriesToAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCenChildInstanceRouteEntriesToAttachmentResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCenChildInstanceRouteEntriesToAttachmentResponseBody setRouteEntry(java.util.List<ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry> routeEntry) {
        this.routeEntry = routeEntry;
        return this;
    }
    public java.util.List<ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry> getRouteEntry() {
        return this.routeEntry;
    }

    public static class ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry extends TeaModel {
        /**
         * <p>The ID of the CEN instance.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The ID of the route table configured on the network instance.</p>
         */
        @NameInMap("ChildInstanceRouteTableId")
        public String childInstanceRouteTableId;

        /**
         * <p>The destination CIDR block of the route.</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>Indicates whether the route is hosted. If the parameter is empty, the route is not hosted. A value of TR indicates that the route is hosted on a transit router.</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the route. Valid values:</p>
         * <br>
         * <p>*   **Available**: The route is available.</p>
         * <p>*   **Pending**: The route is being configured.</p>
         * <p>*   **Modifying**: the route is being modified.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        public static ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry self = new ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry();
            return TeaModel.build(map, self);
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry setChildInstanceRouteTableId(String childInstanceRouteTableId) {
            this.childInstanceRouteTableId = childInstanceRouteTableId;
            return this;
        }
        public String getChildInstanceRouteTableId() {
            return this.childInstanceRouteTableId;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCenChildInstanceRouteEntriesToAttachmentResponseBodyRouteEntry setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

    }

}
