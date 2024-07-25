// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PublishHttpApiRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowOverwrite")
    public Boolean allowOverwrite;

    @NameInMap("description")
    public String description;

    @NameInMap("environment")
    public PublishHttpApiRequestEnvironment environment;

    /**
     * <strong>example:</strong>
     * <p>apr-xxx</p>
     */
    @NameInMap("revisionId")
    public String revisionId;

    public static PublishHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishHttpApiRequest self = new PublishHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public PublishHttpApiRequest setAllowOverwrite(Boolean allowOverwrite) {
        this.allowOverwrite = allowOverwrite;
        return this;
    }
    public Boolean getAllowOverwrite() {
        return this.allowOverwrite;
    }

    public PublishHttpApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishHttpApiRequest setEnvironment(PublishHttpApiRequestEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public PublishHttpApiRequestEnvironment getEnvironment() {
        return this.environment;
    }

    public PublishHttpApiRequest setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public static class PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs extends TeaModel {
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>test-service</p>
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

        public static PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs self = new PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs extends TeaModel {
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <strong>example:</strong>
         * <p>fc-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        @NameInMap("quanlifer")
        public String quanlifer;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs self = new PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs setQuanlifer(String quanlifer) {
            this.quanlifer = quanlifer;
            return this;
        }
        public String getQuanlifer() {
            return this.quanlifer;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs extends TeaModel {
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
         * <p>provider</p>
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
        public String weight;

        public static PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs self = new PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class PublishHttpApiRequestEnvironmentCloudProductConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FC</p>
         */
        @NameInMap("cloudProductType")
        public String cloudProductType;

        @NameInMap("containerServiceConfigs")
        public java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs> containerServiceConfigs;

        @NameInMap("functionConfigs")
        public java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs> functionConfigs;

        @NameInMap("mseNacosConfigs")
        public java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs> mseNacosConfigs;

        public static PublishHttpApiRequestEnvironmentCloudProductConfig build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentCloudProductConfig self = new PublishHttpApiRequestEnvironmentCloudProductConfig();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfig setCloudProductType(String cloudProductType) {
            this.cloudProductType = cloudProductType;
            return this;
        }
        public String getCloudProductType() {
            return this.cloudProductType;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfig setContainerServiceConfigs(java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs> containerServiceConfigs) {
            this.containerServiceConfigs = containerServiceConfigs;
            return this;
        }
        public java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigContainerServiceConfigs> getContainerServiceConfigs() {
            return this.containerServiceConfigs;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfig setFunctionConfigs(java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs> functionConfigs) {
            this.functionConfigs = functionConfigs;
            return this;
        }
        public java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigFunctionConfigs> getFunctionConfigs() {
            return this.functionConfigs;
        }

        public PublishHttpApiRequestEnvironmentCloudProductConfig setMseNacosConfigs(java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs> mseNacosConfigs) {
            this.mseNacosConfigs = mseNacosConfigs;
            return this;
        }
        public java.util.List<PublishHttpApiRequestEnvironmentCloudProductConfigMseNacosConfigs> getMseNacosConfigs() {
            return this.mseNacosConfigs;
        }

    }

    public static class PublishHttpApiRequestEnvironmentDnsConfigs extends TeaModel {
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

        public static PublishHttpApiRequestEnvironmentDnsConfigs build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentDnsConfigs self = new PublishHttpApiRequestEnvironmentDnsConfigs();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentDnsConfigs setDnsList(java.util.List<String> dnsList) {
            this.dnsList = dnsList;
            return this;
        }
        public java.util.List<String> getDnsList() {
            return this.dnsList;
        }

        public PublishHttpApiRequestEnvironmentDnsConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public PublishHttpApiRequestEnvironmentDnsConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class PublishHttpApiRequestEnvironmentServiceConfigs extends TeaModel {
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

        public static PublishHttpApiRequestEnvironmentServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentServiceConfigs self = new PublishHttpApiRequestEnvironmentServiceConfigs();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public PublishHttpApiRequestEnvironmentServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public PublishHttpApiRequestEnvironmentServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public PublishHttpApiRequestEnvironmentServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public PublishHttpApiRequestEnvironmentServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public PublishHttpApiRequestEnvironmentServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class PublishHttpApiRequestEnvironmentVipConfigs extends TeaModel {
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

        public static PublishHttpApiRequestEnvironmentVipConfigs build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironmentVipConfigs self = new PublishHttpApiRequestEnvironmentVipConfigs();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironmentVipConfigs setEndpoints(java.util.List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<String> getEndpoints() {
            return this.endpoints;
        }

        public PublishHttpApiRequestEnvironmentVipConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public PublishHttpApiRequestEnvironmentVipConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class PublishHttpApiRequestEnvironment extends TeaModel {
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
        public PublishHttpApiRequestEnvironmentCloudProductConfig cloudProductConfig;

        @NameInMap("customDomainIds")
        public java.util.List<String> customDomainIds;

        @NameInMap("dnsConfigs")
        public java.util.List<PublishHttpApiRequestEnvironmentDnsConfigs> dnsConfigs;

        /**
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        @NameInMap("serviceConfigs")
        public java.util.List<PublishHttpApiRequestEnvironmentServiceConfigs> serviceConfigs;

        @NameInMap("vipConfigs")
        public java.util.List<PublishHttpApiRequestEnvironmentVipConfigs> vipConfigs;

        public static PublishHttpApiRequestEnvironment build(java.util.Map<String, ?> map) throws Exception {
            PublishHttpApiRequestEnvironment self = new PublishHttpApiRequestEnvironment();
            return TeaModel.build(map, self);
        }

        public PublishHttpApiRequestEnvironment setBackendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }
        public String getBackendScene() {
            return this.backendScene;
        }

        public PublishHttpApiRequestEnvironment setBackendType(String backendType) {
            this.backendType = backendType;
            return this;
        }
        public String getBackendType() {
            return this.backendType;
        }

        public PublishHttpApiRequestEnvironment setCloudProductConfig(PublishHttpApiRequestEnvironmentCloudProductConfig cloudProductConfig) {
            this.cloudProductConfig = cloudProductConfig;
            return this;
        }
        public PublishHttpApiRequestEnvironmentCloudProductConfig getCloudProductConfig() {
            return this.cloudProductConfig;
        }

        public PublishHttpApiRequestEnvironment setCustomDomainIds(java.util.List<String> customDomainIds) {
            this.customDomainIds = customDomainIds;
            return this;
        }
        public java.util.List<String> getCustomDomainIds() {
            return this.customDomainIds;
        }

        public PublishHttpApiRequestEnvironment setDnsConfigs(java.util.List<PublishHttpApiRequestEnvironmentDnsConfigs> dnsConfigs) {
            this.dnsConfigs = dnsConfigs;
            return this;
        }
        public java.util.List<PublishHttpApiRequestEnvironmentDnsConfigs> getDnsConfigs() {
            return this.dnsConfigs;
        }

        public PublishHttpApiRequestEnvironment setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public PublishHttpApiRequestEnvironment setServiceConfigs(java.util.List<PublishHttpApiRequestEnvironmentServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<PublishHttpApiRequestEnvironmentServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public PublishHttpApiRequestEnvironment setVipConfigs(java.util.List<PublishHttpApiRequestEnvironmentVipConfigs> vipConfigs) {
            this.vipConfigs = vipConfigs;
            return this;
        }
        public java.util.List<PublishHttpApiRequestEnvironmentVipConfigs> getVipConfigs() {
            return this.vipConfigs;
        }

    }

}
