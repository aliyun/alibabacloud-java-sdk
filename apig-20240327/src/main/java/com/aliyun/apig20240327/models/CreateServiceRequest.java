// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    /**
     * <p>Gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtg***</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>List of service configuration information.</p>
     */
    @NameInMap("serviceConfigs")
    public java.util.List<CreateServiceRequestServiceConfigs> serviceConfigs;

    /**
     * <p>Service source:</p>
     * <ul>
     * <li>MSE_NACOS: Services in MSE Nacos.</li>
     * <li>K8S: Services in the K8S cluster of container service.</li>
     * <li>VIP: Fixed address service.</li>
     * <li>DNS: DNS domain name service.</li>
     * <li>FC3: Function Compute service.</li>
     * <li>SAE_K8S_SERVICE: SAE K8S service.</li>
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
         * <p>List of domain names or fixed addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>AI service configuration.</p>
         */
        @NameInMap("aiServiceConfig")
        public AiServiceConfig aiServiceConfig;

        /**
         * <p>List of DNS server addresses.</p>
         */
        @NameInMap("dnsServers")
        public java.util.List<String> dnsServers;

        /**
         * <p>Service group name.
         * Needs to be specified when <code>sourceType</code> is MSE_NACOS.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>Service name.</p>
         * 
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Namespace of the service:</p>
         * <ul>
         * <li>When <code>sourceType</code> is K8S, it represents the namespace where the K8S service is located.</li>
         * <li>When <code>sourceType</code> is MSE_NACOS, it represents the namespace in Nacos.</li>
         * </ul>
         * <p>It needs to be specified when <code>sourceType</code> is K8S or MSE_NACOS.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>Function version or alias.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

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

    }

}
