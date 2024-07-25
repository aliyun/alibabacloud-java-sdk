// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateServiceSourceRequest extends TeaModel {
    @NameInMap("k8sServiceSourceConfig")
    public CreateServiceSourceRequestK8sServiceSourceConfig k8sServiceSourceConfig;

    @NameInMap("nacosServiceSourceConfig")
    public CreateServiceSourceRequestNacosServiceSourceConfig nacosServiceSourceConfig;

    @NameInMap("type")
    public String type;

    public static CreateServiceSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceSourceRequest self = new CreateServiceSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceSourceRequest setK8sServiceSourceConfig(CreateServiceSourceRequestK8sServiceSourceConfig k8sServiceSourceConfig) {
        this.k8sServiceSourceConfig = k8sServiceSourceConfig;
        return this;
    }
    public CreateServiceSourceRequestK8sServiceSourceConfig getK8sServiceSourceConfig() {
        return this.k8sServiceSourceConfig;
    }

    public CreateServiceSourceRequest setNacosServiceSourceConfig(CreateServiceSourceRequestNacosServiceSourceConfig nacosServiceSourceConfig) {
        this.nacosServiceSourceConfig = nacosServiceSourceConfig;
        return this;
    }
    public CreateServiceSourceRequestNacosServiceSourceConfig getNacosServiceSourceConfig() {
        return this.nacosServiceSourceConfig;
    }

    public CreateServiceSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("portRanges")
        public java.util.List<String> portRanges;

        @NameInMap("securityGroupId")
        public String securityGroupId;

        public static CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules self = new CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules();
            return TeaModel.build(map, self);
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules setPortRanges(java.util.List<String> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<String> getPortRanges() {
            return this.portRanges;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("ingressClass")
        public String ingressClass;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overrideIngressIp")
        public Boolean overrideIngressIp;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("watchNamespace")
        public String watchNamespace;

        public static CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig self = new CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig();
            return TeaModel.build(map, self);
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig setIngressClass(String ingressClass) {
            this.ingressClass = ingressClass;
            return this;
        }
        public String getIngressClass() {
            return this.ingressClass;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig setOverrideIngressIp(Boolean overrideIngressIp) {
            this.overrideIngressIp = overrideIngressIp;
            return this;
        }
        public Boolean getOverrideIngressIp() {
            return this.overrideIngressIp;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig setWatchNamespace(String watchNamespace) {
            this.watchNamespace = watchNamespace;
            return this;
        }
        public String getWatchNamespace() {
            return this.watchNamespace;
        }

    }

    public static class CreateServiceSourceRequestK8sServiceSourceConfig extends TeaModel {
        @NameInMap("authorizeSecurityGroupRules")
        public java.util.List<CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules> authorizeSecurityGroupRules;

        /**
         * <strong>example:</strong>
         * <p>c4a21b3560fad4ec299f3e******</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("ingressConfig")
        public CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig ingressConfig;

        public static CreateServiceSourceRequestK8sServiceSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceSourceRequestK8sServiceSourceConfig self = new CreateServiceSourceRequestK8sServiceSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateServiceSourceRequestK8sServiceSourceConfig setAuthorizeSecurityGroupRules(java.util.List<CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules> authorizeSecurityGroupRules) {
            this.authorizeSecurityGroupRules = authorizeSecurityGroupRules;
            return this;
        }
        public java.util.List<CreateServiceSourceRequestK8sServiceSourceConfigAuthorizeSecurityGroupRules> getAuthorizeSecurityGroupRules() {
            return this.authorizeSecurityGroupRules;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfig setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateServiceSourceRequestK8sServiceSourceConfig setIngressConfig(CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig ingressConfig) {
            this.ingressConfig = ingressConfig;
            return this;
        }
        public CreateServiceSourceRequestK8sServiceSourceConfigIngressConfig getIngressConfig() {
            return this.ingressConfig;
        }

    }

    public static class CreateServiceSourceRequestNacosServiceSourceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mse-cn-328fc8***</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static CreateServiceSourceRequestNacosServiceSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceSourceRequestNacosServiceSourceConfig self = new CreateServiceSourceRequestNacosServiceSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateServiceSourceRequestNacosServiceSourceConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
