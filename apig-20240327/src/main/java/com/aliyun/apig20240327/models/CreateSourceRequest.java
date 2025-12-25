// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateSourceRequest extends TeaModel {
    /**
     * <p>The gateway instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6q***</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The source configuration when the source type is K8S.</p>
     */
    @NameInMap("k8sSourceConfig")
    public CreateSourceRequestK8sSourceConfig k8sSourceConfig;

    /**
     * <p>The source configuration when the source type is MSE_NACOS.</p>
     */
    @NameInMap("nacosSourceConfig")
    public CreateSourceRequestNacosSourceConfig nacosSourceConfig;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source type. Valid values:</p>
     * <ul>
     * <li>MSE_NACOS: MSE Nacos</li>
     * <li>K8S: Container Service for Kubernetes (ACK)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceRequest self = new CreateSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSourceRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateSourceRequest setK8sSourceConfig(CreateSourceRequestK8sSourceConfig k8sSourceConfig) {
        this.k8sSourceConfig = k8sSourceConfig;
        return this;
    }
    public CreateSourceRequestK8sSourceConfig getK8sSourceConfig() {
        return this.k8sSourceConfig;
    }

    public CreateSourceRequest setNacosSourceConfig(CreateSourceRequestNacosSourceConfig nacosSourceConfig) {
        this.nacosSourceConfig = nacosSourceConfig;
        return this;
    }
    public CreateSourceRequestNacosSourceConfig getNacosSourceConfig() {
        return this.nacosSourceConfig;
    }

    public CreateSourceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules extends TeaModel {
        /**
         * <p>The rule description.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The list of port ranges.</p>
         */
        @NameInMap("portRanges")
        public java.util.List<String> portRanges;

        /**
         * <p>The ID of a security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp14w4fa4j***</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        public static CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules self = new CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules();
            return TeaModel.build(map, self);
        }

        public CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules setPortRanges(java.util.List<String> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<String> getPortRanges() {
            return this.portRanges;
        }

        public CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class CreateSourceRequestK8sSourceConfig extends TeaModel {
        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("authorizeSecurityGroupRules")
        public java.util.List<CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules> authorizeSecurityGroupRules;

        /**
         * <p>The ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c3fbe6caaaece4062b*****</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        public static CreateSourceRequestK8sSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateSourceRequestK8sSourceConfig self = new CreateSourceRequestK8sSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateSourceRequestK8sSourceConfig setAuthorizeSecurityGroupRules(java.util.List<CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules> authorizeSecurityGroupRules) {
            this.authorizeSecurityGroupRules = authorizeSecurityGroupRules;
            return this;
        }
        public java.util.List<CreateSourceRequestK8sSourceConfigAuthorizeSecurityGroupRules> getAuthorizeSecurityGroupRules() {
            return this.authorizeSecurityGroupRules;
        }

        public CreateSourceRequestK8sSourceConfig setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class CreateSourceRequestNacosSourceConfig extends TeaModel {
        /**
         * <p>The Nacos instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-0dw3w***</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static CreateSourceRequestNacosSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateSourceRequestNacosSourceConfig self = new CreateSourceRequestNacosSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateSourceRequestNacosSourceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
