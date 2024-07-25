// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayRouteBackend extends TeaModel {
    @NameInMap("services")
    public java.util.List<GatewayRouteBackendServices> services;

    /**
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("type")
    public String type;

    public static GatewayRouteBackend build(java.util.Map<String, ?> map) throws Exception {
        GatewayRouteBackend self = new GatewayRouteBackend();
        return TeaModel.build(map, self);
    }

    public GatewayRouteBackend setServices(java.util.List<GatewayRouteBackendServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<GatewayRouteBackendServices> getServices() {
        return this.services;
    }

    public GatewayRouteBackend setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class GatewayRouteBackendServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gs-cq2bmmdlhtgj***</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <strong>example:</strong>
         * <p>item-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Float weight;

        public static GatewayRouteBackendServices build(java.util.Map<String, ?> map) throws Exception {
            GatewayRouteBackendServices self = new GatewayRouteBackendServices();
            return TeaModel.build(map, self);
        }

        public GatewayRouteBackendServices setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public GatewayRouteBackendServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GatewayRouteBackendServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GatewayRouteBackendServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GatewayRouteBackendServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GatewayRouteBackendServices setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

}
