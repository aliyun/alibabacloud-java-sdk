// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorBackhaulRouteResponseBody extends TeaModel {
    @NameInMap("NetLinkId")
    public String netLinkId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Routes")
    public java.util.List<ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes> routes;

    public static ListIoTCloudConnectorBackhaulRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorBackhaulRouteResponseBody self = new ListIoTCloudConnectorBackhaulRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorBackhaulRouteResponseBody setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public ListIoTCloudConnectorBackhaulRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCloudConnectorBackhaulRouteResponseBody setRoutes(java.util.List<ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes> getRoutes() {
        return this.routes;
    }

    public static class ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("Status")
        public String status;

        public static ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes self = new ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes();
            return TeaModel.build(map, self);
        }

        public ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListIoTCloudConnectorBackhaulRouteResponseBodyRoutes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
