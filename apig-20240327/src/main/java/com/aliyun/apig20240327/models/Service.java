// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class Service extends TeaModel {
    /**
     * <p>The address details, which can be IP addresses or domain names.</p>
     */
    @NameInMap("addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The agent service configuration</p>
     */
    @NameInMap("agentServiceConfig")
    public AgentServiceConfig agentServiceConfig;

    /**
     * <p>The AI service configurations.</p>
     */
    @NameInMap("aiServiceConfig")
    public AiServiceConfig aiServiceConfig;

    /**
     * <p>The creation time (unix timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1725617840096</p>
     */
    @NameInMap("createTimestamp")
    public Long createTimestamp;

    /**
     * <p>The express type</p>
     * 
     * <strong>example:</strong>
     * <p>StartExecution</p>
     */
    @NameInMap("expressType")
    public String expressType;

    /**
     * <p>The gateway instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The service group name.</p>
     * 
     * <strong>example:</strong>
     * <p>publich</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The health check configurations.</p>
     */
    @NameInMap("healthCheck")
    public ServiceHealthCheck healthCheck;

    /**
     * <p>The health check status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Unhealthy</li>
     * <li>Healthy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Healthy</p>
     */
    @NameInMap("healthStatus")
    public String healthStatus;

    /**
     * <p>The label details for service version configuration</p>
     */
    @NameInMap("labelDetails")
    public java.util.List<LabelDetail> labelDetails;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>user-service</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The namespace of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The outlier endpoints list</p>
     */
    @NameInMap("outlierEndpoints")
    public java.util.List<String> outlierEndpoints;

    /**
     * <p>The list of objects containing port details.</p>
     */
    @NameInMap("ports")
    public java.util.List<ServicePorts> ports;

    /**
     * <p>The service protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The function qualifier name.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>svc-cr6pk4tlhtgm***</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The source type.</p>
     * 
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The list of unhealthy endpoints.</p>
     */
    @NameInMap("unhealthyEndpoints")
    public java.util.List<String> unhealthyEndpoints;

    /**
     * <p>The last modified time (unix timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1725868548440</p>
     */
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

    public Service setAgentServiceConfig(AgentServiceConfig agentServiceConfig) {
        this.agentServiceConfig = agentServiceConfig;
        return this;
    }
    public AgentServiceConfig getAgentServiceConfig() {
        return this.agentServiceConfig;
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

    public Service setExpressType(String expressType) {
        this.expressType = expressType;
        return this;
    }
    public String getExpressType() {
        return this.expressType;
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

    public Service setLabelDetails(java.util.List<LabelDetail> labelDetails) {
        this.labelDetails = labelDetails;
        return this;
    }
    public java.util.List<LabelDetail> getLabelDetails() {
        return this.labelDetails;
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

    public Service setOutlierEndpoints(java.util.List<String> outlierEndpoints) {
        this.outlierEndpoints = outlierEndpoints;
        return this;
    }
    public java.util.List<String> getOutlierEndpoints() {
        return this.outlierEndpoints;
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
        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol. Valid values: TCP and UDP.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
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
