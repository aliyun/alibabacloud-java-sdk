// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    /**
     * <p>The gateway instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtg***</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of service configurations.</p>
     */
    @NameInMap("serviceConfigs")
    public java.util.List<CreateServiceRequestServiceConfigs> serviceConfigs;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE_NACOS: a service in an MSE Nacos instance</li>
     * <li>K8S: a service in a Kubernetes (K8s) cluster in Container Service for Kubernetes (ACK)</li>
     * <li>VIP: a fixed IP address</li>
     * <li>DNS: a Domain Name System (DNS) domain name</li>
     * <li>FC3: a service in Function Compute</li>
     * <li>SAE_K8S_SERVICE: a service in a K8s cluster in Serverless App Engine (SAE)</li>
     * </ul>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>SAE_K8S_SERVICE</li>
     * <li>K8S</li>
     * <li>FC3</li>
     * <li>DNS</li>
     * <li>VIP</li>
     * <li>MSE_NACOS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateServiceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateServiceRequest setServiceConfigs(java.util.List<CreateServiceRequestServiceConfigs> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<CreateServiceRequestServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public CreateServiceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public static class CreateServiceRequestServiceConfigs extends TeaModel {
        /**
         * <p>The list of domain names or fixed addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        @NameInMap("agentServiceConfig")
        public AgentServiceConfig agentServiceConfig;

        /**
         * <p>The AI service configurations.</p>
         */
        @NameInMap("aiServiceConfig")
        public AiServiceConfig aiServiceConfig;

        /**
         * <p>The list of DNS service addresses.</p>
         */
        @NameInMap("dnsServers")
        public java.util.List<String> dnsServers;

        /**
         * <p>The service group name. This parameter is required if sourceType is set to MSE_NACOS.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The service namespace. This parameter is required when sourceType is set to K8S or MSE_NACOS.</p>
         * <ul>
         * <li>If sourceType is set to K8S, this parameter specifies the namespace where the K8s service resides.</li>
         * <li>If sourceType is set to MSE_NACOS, this parameter specifies a namespace in Nacos.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The function version or alias.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        @NameInMap("sourceId")
        public String sourceId;

        public static CreateServiceRequestServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestServiceConfigs self = new CreateServiceRequestServiceConfigs();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestServiceConfigs setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateServiceRequestServiceConfigs setAgentServiceConfig(AgentServiceConfig agentServiceConfig) {
            this.agentServiceConfig = agentServiceConfig;
            return this;
        }
        public AgentServiceConfig getAgentServiceConfig() {
            return this.agentServiceConfig;
        }

        public CreateServiceRequestServiceConfigs setAiServiceConfig(AiServiceConfig aiServiceConfig) {
            this.aiServiceConfig = aiServiceConfig;
            return this;
        }
        public AiServiceConfig getAiServiceConfig() {
            return this.aiServiceConfig;
        }

        public CreateServiceRequestServiceConfigs setDnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public java.util.List<String> getDnsServers() {
            return this.dnsServers;
        }

        public CreateServiceRequestServiceConfigs setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateServiceRequestServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateServiceRequestServiceConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateServiceRequestServiceConfigs setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public CreateServiceRequestServiceConfigs setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

}
