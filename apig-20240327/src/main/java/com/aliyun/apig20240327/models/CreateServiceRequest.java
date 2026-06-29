// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    /**
     * <p>The gateway ID.</p>
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
     * <p>The list of service configurations. At least one service configuration is required.</p>
     */
    @NameInMap("serviceConfigs")
    public java.util.List<CreateServiceRequestServiceConfigs> serviceConfigs;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE_NACOS: a service in MSE Nacos.</li>
     * <li>K8S: a service in a Kubernetes cluster of Container Service.</li>
     * <li>VIP: a fixed address service.</li>
     * <li>DNS: a DNS domain name service.</li>
     * <li>FC3: a service in Function Compute.</li>
     * <li>SAE_K8S_SERVICE: an SAE Kubernetes service.</li>
     * <li>AI: an AI service.</li>
     * <li>AGENT: an Agent service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

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

    public CreateServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateServiceRequestServiceConfigsValidationOptions extends TeaModel {
        /**
         * <p>Specifies whether to skip AI chat completion verification.</p>
         */
        @NameInMap("skipVerifyAIChatCompletion")
        public Boolean skipVerifyAIChatCompletion;

        public static CreateServiceRequestServiceConfigsValidationOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRequestServiceConfigsValidationOptions self = new CreateServiceRequestServiceConfigsValidationOptions();
            return TeaModel.build(map, self);
        }

        public CreateServiceRequestServiceConfigsValidationOptions setSkipVerifyAIChatCompletion(Boolean skipVerifyAIChatCompletion) {
            this.skipVerifyAIChatCompletion = skipVerifyAIChatCompletion;
            return this;
        }
        public Boolean getSkipVerifyAIChatCompletion() {
            return this.skipVerifyAIChatCompletion;
        }

    }

    public static class CreateServiceRequestServiceConfigs extends TeaModel {
        /**
         * <p>The list of domain names or fixed addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The Agent service configuration. This parameter is required when sourceType is set to AGENT.</p>
         */
        @NameInMap("agentServiceConfig")
        public AgentServiceConfig agentServiceConfig;

        /**
         * <p>The AI service configuration.</p>
         */
        @NameInMap("aiServiceConfig")
        public AiServiceConfig aiServiceConfig;

        /**
         * <p>The list of DNS server addresses.</p>
         */
        @NameInMap("dnsServers")
        public java.util.List<String> dnsServers;

        /**
         * <p>The service expression type that identifies the special type or mode of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("expressType")
        public String expressType;

        /**
         * <p>The service group name. This parameter is required when sourceType is set to MSE_NACOS.</p>
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
         * <p>The namespace of the service.</p>
         * <ul>
         * <li>If sourceType is set to K8S, this parameter specifies the namespace of the Kubernetes service.</li>
         * <li>If sourceType is set to MSE_NACOS, this parameter specifies the namespace in Nacos.</li>
         * </ul>
         * <p>This parameter is required when sourceType is set to K8S or MSE_NACOS.</p>
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

        /**
         * <p>The service source ID. This parameter is required in multi-Nacos instance scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>nacos-instance-001</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The validation options for service verification configuration.</p>
         */
        @NameInMap("validationOptions")
        public CreateServiceRequestServiceConfigsValidationOptions validationOptions;

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

        public CreateServiceRequestServiceConfigs setExpressType(String expressType) {
            this.expressType = expressType;
            return this;
        }
        public String getExpressType() {
            return this.expressType;
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

        public CreateServiceRequestServiceConfigs setValidationOptions(CreateServiceRequestServiceConfigsValidationOptions validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }
        public CreateServiceRequestServiceConfigsValidationOptions getValidationOptions() {
            return this.validationOptions;
        }

    }

}
