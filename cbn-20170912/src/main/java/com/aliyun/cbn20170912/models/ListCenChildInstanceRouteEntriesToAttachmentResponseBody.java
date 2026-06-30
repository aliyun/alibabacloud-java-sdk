// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenChildInstanceRouteEntriesToAttachmentResponseBody extends TeaModel {
    /**
     * <p>The token that is used for the next query.</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no subsequent query is sent.</p>
     * </li>
     * <li><p>If a value is returned for <strong>NextToken</strong>, the value is the token that is used for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>530BC816-F575-412A-AAB2-435125D26328</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the route.</p>
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
         * 
         * <strong>example:</strong>
         * <p>cen-9adwg6ghpq8oq4dp7q</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The ID of the route table of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1tlaj1c4nxr2t3e****</p>
         */
        @NameInMap("ChildInstanceRouteTableId")
        public String childInstanceRouteTableId;

        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The type of the managed routing service. If this parameter is empty, the route is not managed. The value TR indicates that the route is managed by a transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>TR</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the route. Valid values:</p>
         * <ul>
         * <li><p><strong>Available</strong>: The route is active.</p>
         * </li>
         * <li><p><strong>Pending</strong>: The route is being configured.</p>
         * </li>
         * <li><p><strong>Modifying</strong>: The route is being modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-y463sghkkv1loe****</p>
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
