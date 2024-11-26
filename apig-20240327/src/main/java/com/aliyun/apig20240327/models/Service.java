// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Service extends TeaModel {
    @NameInMap("addresses")
    public java.util.List<String> addresses;

    @NameInMap("aiServiceConfig")
    public AiServiceConfig aiServiceConfig;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>publich</p>
     */
    @NameInMap("groupName")
    public String groupName;

    @NameInMap("healthCheck")
    public ServiceHealthCheck healthCheck;

    @NameInMap("healthStatus")
    public String healthStatus;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("ports")
    public java.util.List<ServicePorts> ports;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("serviceId")
    public String serviceId;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("unhealthyEndpoints")
    public java.util.List<String> unhealthyEndpoints;

    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static Service build(java.util.Map<String, ?> map) throws Exception {
        Service self = new Service();
        return TeaModel.build(map, self);
    }

    public Service setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public Service setAiServiceConfig(AiServiceConfig aiServiceConfig) {
        this.aiServiceConfig = aiServiceConfig;
        return this;
    }
    public AiServiceConfig getAiServiceConfig() {
        return this.aiServiceConfig;
    }

    public Service setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public Service setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public Service setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public Service setHealthCheck(ServiceHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public ServiceHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public Service setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Service setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Service setPorts(java.util.List<ServicePorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<ServicePorts> getPorts() {
        return this.ports;
    }

    public Service setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public Service setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public Service setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Service setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public Service setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public Service setUnhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
        this.unhealthyEndpoints = unhealthyEndpoints;
        return this;
    }
    public java.util.List<String> getUnhealthyEndpoints() {
        return this.unhealthyEndpoints;
    }

    public Service setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class ServicePorts extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("port")
        public Integer port;

        @NameInMap("protocol")
        public String protocol;

        public static ServicePorts build(java.util.Map<String, ?> map) throws Exception {
            ServicePorts self = new ServicePorts();
            return TeaModel.build(map, self);
        }

        public ServicePorts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ServicePorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ServicePorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
