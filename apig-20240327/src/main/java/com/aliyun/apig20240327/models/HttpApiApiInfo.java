// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiApiInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("basePath")
    public String basePath;

    @NameInMap("description")
    public String description;

    @NameInMap("environments")
    public java.util.List<HttpApiApiInfoEnvironments> environments;

    /**
     * <strong>example:</strong>
     * <p>api-xxx</p>
     */
    @NameInMap("httpApiId")
    public String httpApiId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("protocols")
    public java.util.List<String> protocols;

    @NameInMap("versionInfo")
    public HttpApiVersionInfo versionInfo;

    public static HttpApiApiInfo build(java.util.Map<String, ?> map) throws Exception {
        HttpApiApiInfo self = new HttpApiApiInfo();
        return TeaModel.build(map, self);
    }

    public HttpApiApiInfo setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public HttpApiApiInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpApiApiInfo setEnvironments(java.util.List<HttpApiApiInfoEnvironments> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.List<HttpApiApiInfoEnvironments> getEnvironments() {
        return this.environments;
    }

    public HttpApiApiInfo setHttpApiId(String httpApiId) {
        this.httpApiId = httpApiId;
        return this;
    }
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public HttpApiApiInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiApiInfo setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public HttpApiApiInfo setVersionInfo(HttpApiVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }
    public HttpApiVersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    public static class HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
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
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs self = new HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>test-function</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs self = new HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>springboot-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs self = new HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironmentsCloudProductConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("cloudProductType")
        public String cloudProductType;

        @NameInMap("containerServiceConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs> containerServiceConfigs;

        @NameInMap("functionConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs> functionConfigs;

        @NameInMap("mseNacosConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs> mseNacosConfigs;

        public static HttpApiApiInfoEnvironmentsCloudProductConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsCloudProductConfig self = new HttpApiApiInfoEnvironmentsCloudProductConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfig setCloudProductType(String cloudProductType) {
            this.cloudProductType = cloudProductType;
            return this;
        }
        public String getCloudProductType() {
            return this.cloudProductType;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfig setContainerServiceConfigs(java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs> containerServiceConfigs) {
            this.containerServiceConfigs = containerServiceConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigContainerServiceConfigs> getContainerServiceConfigs() {
            return this.containerServiceConfigs;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfig setFunctionConfigs(java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs> functionConfigs) {
            this.functionConfigs = functionConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigFunctionConfigs> getFunctionConfigs() {
            return this.functionConfigs;
        }

        public HttpApiApiInfoEnvironmentsCloudProductConfig setMseNacosConfigs(java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs> mseNacosConfigs) {
            this.mseNacosConfigs = mseNacosConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsCloudProductConfigMseNacosConfigs> getMseNacosConfigs() {
            return this.mseNacosConfigs;
        }

    }

    public static class HttpApiApiInfoEnvironmentsDnsConfigs extends TeaModel {
        @NameInMap("dnsList")
        public java.util.List<String> dnsList;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsDnsConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsDnsConfigs self = new HttpApiApiInfoEnvironmentsDnsConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsDnsConfigs setDnsList(java.util.List<String> dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public java.util.List<String> getDnsList() {
            return this.dnsList;
        }

        public HttpApiApiInfoEnvironmentsDnsConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsDnsConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironmentsServiceConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gs-xxx</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>demo-service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsServiceConfigs self = new HttpApiApiInfoEnvironmentsServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public HttpApiApiInfoEnvironmentsServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironmentsVipConfigs extends TeaModel {
        @NameInMap("endpoints")
        public java.util.List<String> endpoints;

        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static HttpApiApiInfoEnvironmentsVipConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironmentsVipConfigs self = new HttpApiApiInfoEnvironmentsVipConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironmentsVipConfigs setEndpoints(java.util.List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<String> getEndpoints() {
            return this.endpoints;
        }

        public HttpApiApiInfoEnvironmentsVipConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public HttpApiApiInfoEnvironmentsVipConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiApiInfoEnvironments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("backendScene")
        public String backendScene;

        /**
         * <strong>example:</strong>
         * <p>Service</p>
         */
        @NameInMap("backendType")
        public String backendType;

        @NameInMap("cloudProductConfig")
        public HttpApiApiInfoEnvironmentsCloudProductConfig cloudProductConfig;

        @NameInMap("dnsConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsDnsConfigs> dnsConfigs;

        /**
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        @NameInMap("serviceConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> serviceConfigs;

        @NameInMap("vipConfigs")
        public java.util.List<HttpApiApiInfoEnvironmentsVipConfigs> vipConfigs;

        public static HttpApiApiInfoEnvironments build(java.util.Map<String, ?> map) throws Exception {
            HttpApiApiInfoEnvironments self = new HttpApiApiInfoEnvironments();
            return TeaModel.build(map, self);
        }

        public HttpApiApiInfoEnvironments setBackendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }
        public String getBackendScene() {
            return this.backendScene;
        }

        public HttpApiApiInfoEnvironments setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public HttpApiApiInfoEnvironments setCloudProductConfig(HttpApiApiInfoEnvironmentsCloudProductConfig cloudProductConfig) {
            this.cloudProductConfig = cloudProductConfig;
            return this;
        }
        public HttpApiApiInfoEnvironmentsCloudProductConfig getCloudProductConfig() {
            return this.cloudProductConfig;
        }

        public HttpApiApiInfoEnvironments setDnsConfigs(java.util.List<HttpApiApiInfoEnvironmentsDnsConfigs> dnsConfigs) {
            this.dnsConfigs = dnsConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsDnsConfigs> getDnsConfigs() {
            return this.dnsConfigs;
        }

        public HttpApiApiInfoEnvironments setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public HttpApiApiInfoEnvironments setServiceConfigs(java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public HttpApiApiInfoEnvironments setVipConfigs(java.util.List<HttpApiApiInfoEnvironmentsVipConfigs> vipConfigs) {
            this.vipConfigs = vipConfigs;
            return this;
        }
        public java.util.List<HttpApiApiInfoEnvironmentsVipConfigs> getVipConfigs() {
            return this.vipConfigs;
        }

    }

}
