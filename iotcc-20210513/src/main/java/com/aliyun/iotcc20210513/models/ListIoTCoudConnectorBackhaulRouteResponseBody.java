// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListIoTCoudConnectorBackhaulRouteResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Routes")
    public java.util.List<ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes> routes;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIoTCoudConnectorBackhaulRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCoudConnectorBackhaulRouteResponseBody self = new ListIoTCoudConnectorBackhaulRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIoTCoudConnectorBackhaulRouteResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIoTCoudConnectorBackhaulRouteResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIoTCoudConnectorBackhaulRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIoTCoudConnectorBackhaulRouteResponseBody setRoutes(java.util.List<ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes> getRoutes() {
        return this.routes;
    }

    public ListIoTCoudConnectorBackhaulRouteResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes extends TeaModel {
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

        public static ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes self = new ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes();
            return TeaModel.build(map, self);
        }

        public ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public ListIoTCoudConnectorBackhaulRouteResponseBodyRoutes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
