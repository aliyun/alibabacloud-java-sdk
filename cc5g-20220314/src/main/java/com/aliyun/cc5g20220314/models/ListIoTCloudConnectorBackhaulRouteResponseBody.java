// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorBackhaulRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cciot-xxxx</p>
     */
    @NameInMap("NetLinkId")
    public String netLinkId;

    /**
     * <strong>example:</strong>
     * <p>94032572-8758-575E-B306-86F59D1B826E</p>
     */
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
        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>full cidr block route</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>10.33.190.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>eni-uf677iw3xihqxiz2ssir</p>
         */
        @NameInMap("NextHopId")
        public String nextHopId;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterface</p>
         */
        @NameInMap("NextHopType")
        public String nextHopType;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
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
