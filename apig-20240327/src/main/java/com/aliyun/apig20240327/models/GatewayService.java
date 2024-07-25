// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GatewayService extends TeaModel {
    @NameInMap("addresses")
    public java.util.List<String> addresses;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("gatewayServiceId")
    public String gatewayServiceId;

    @NameInMap("healthCheck")
    public ServiceHealthCheck healthCheck;

    @NameInMap("healthStatus")
    public String healthStatus;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("ports")
    public java.util.List<GatewayServicePorts> ports;

    /**
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("unhealthyEndpoints")
    public java.util.List<String> unhealthyEndpoints;

    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static GatewayService build(java.util.Map<String, ?> map) throws Exception {
        GatewayService self = new GatewayService();
        return TeaModel.build(map, self);
    }

    public GatewayService setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public GatewayService setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public GatewayService setGatewayServiceId(String gatewayServiceId) {
        this.gatewayServiceId = gatewayServiceId;
        return this;
    }
    public String getGatewayServiceId() {
        return this.gatewayServiceId;
    }

    public GatewayService setHealthCheck(ServiceHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public ServiceHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public GatewayService setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public GatewayService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GatewayService setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GatewayService setPorts(java.util.List<GatewayServicePorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<GatewayServicePorts> getPorts() {
        return this.ports;
    }

    public GatewayService setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public GatewayService setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GatewayService setUnhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
        this.unhealthyEndpoints = unhealthyEndpoints;
        return this;
    }
    public java.util.List<String> getUnhealthyEndpoints() {
        return this.unhealthyEndpoints;
    }

    public GatewayService setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class GatewayServicePorts extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("port")
        public Integer port;

        @NameInMap("protocol")
        public String protocol;

        public static GatewayServicePorts build(java.util.Map<String, ?> map) throws Exception {
            GatewayServicePorts self = new GatewayServicePorts();
            return TeaModel.build(map, self);
        }

        public GatewayServicePorts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GatewayServicePorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GatewayServicePorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
