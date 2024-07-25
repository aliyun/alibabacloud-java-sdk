// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayRouteBackendConfig extends TeaModel {
    @NameInMap("services")
    public java.util.List<GatewayRouteBackendConfigServices> services;

    /**
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("type")
    public String type;

    public static GatewayRouteBackendConfig build(java.util.Map<String, ?> map) throws Exception {
        GatewayRouteBackendConfig self = new GatewayRouteBackendConfig();
        return TeaModel.build(map, self);
    }

    public GatewayRouteBackendConfig setServices(java.util.List<GatewayRouteBackendConfigServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<GatewayRouteBackendConfigServices> getServices() {
        return this.services;
    }

    public GatewayRouteBackendConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class GatewayRouteBackendConfigServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gs-cq2bmmdlhtgj***</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

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
         * <p>K8S</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Float weight;

        public static GatewayRouteBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            GatewayRouteBackendConfigServices self = new GatewayRouteBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public GatewayRouteBackendConfigServices setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public GatewayRouteBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GatewayRouteBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GatewayRouteBackendConfigServices setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GatewayRouteBackendConfigServices setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

}
