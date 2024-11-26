// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiDeployConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDeploy")
    public Boolean autoDeploy;

    /**
     * <strong>example:</strong>
     * <p>SingleService</p>
     */
    @NameInMap("backendScene")
    public String backendScene;

    @NameInMap("customDomainIds")
    public java.util.List<String> customDomainIds;

    /**
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    @NameInMap("policyConfigs")
    public java.util.List<HttpApiDeployConfigPolicyConfigs> policyConfigs;

    @NameInMap("serviceConfigs")
    public java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs;

    public static HttpApiDeployConfig build(java.util.Map<String, ?> map) throws Exception {
        HttpApiDeployConfig self = new HttpApiDeployConfig();
        return TeaModel.build(map, self);
    }

    public HttpApiDeployConfig setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    public HttpApiDeployConfig setBackendScene(String backendScene) {
        this.backendScene = backendScene;
        return this;
    }
    public String getBackendScene() {
        return this.backendScene;
    }

    public HttpApiDeployConfig setCustomDomainIds(java.util.List<String> customDomainIds) {
        this.customDomainIds = customDomainIds;
        return this;
    }
    public java.util.List<String> getCustomDomainIds() {
        return this.customDomainIds;
    }

    public HttpApiDeployConfig setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public HttpApiDeployConfig setPolicyConfigs(java.util.List<HttpApiDeployConfigPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfigPolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public HttpApiDeployConfig setServiceConfigs(java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfigServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public static class HttpApiDeployConfigPolicyConfigsAiFallbackConfig extends TeaModel {
        @NameInMap("serviceIds")
        public java.util.List<String> serviceIds;

        public static HttpApiDeployConfigPolicyConfigsAiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiFallbackConfig self = new HttpApiDeployConfigPolicyConfigsAiFallbackConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig setServiceIds(java.util.List<String> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }
        public java.util.List<String> getServiceIds() {
            return this.serviceIds;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigs extends TeaModel {
        @NameInMap("aiFallbackConfig")
        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig aiFallbackConfig;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>AiFallback</p>
         */
        @NameInMap("type")
        public String type;

        public static HttpApiDeployConfigPolicyConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigs self = new HttpApiDeployConfigPolicyConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigs setAiFallbackConfig(HttpApiDeployConfigPolicyConfigsAiFallbackConfig aiFallbackConfig) {
            this.aiFallbackConfig = aiFallbackConfig;
            return this;
        }
        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig getAiFallbackConfig() {
            return this.aiFallbackConfig;
        }

        public HttpApiDeployConfigPolicyConfigs setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public HttpApiDeployConfigPolicyConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiDeployConfigServiceConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>qwen-*</p>
         */
        @NameInMap("modelNamePattern")
        public String modelNamePattern;

        /**
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Long weight;

        public static HttpApiDeployConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigServiceConfigs self = new HttpApiDeployConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigServiceConfigs setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public HttpApiDeployConfigServiceConfigs setModelNamePattern(String modelNamePattern) {
            this.modelNamePattern = modelNamePattern;
            return this;
        }
        public String getModelNamePattern() {
            return this.modelNamePattern;
        }

        public HttpApiDeployConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiDeployConfigServiceConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

}
