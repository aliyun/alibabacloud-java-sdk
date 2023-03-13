// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenChildInstanceRouteEntriesToAttachmentResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("ChildInstanceRouteTableId")
        public String childInstanceRouteTableId;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

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
