// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeployHttpApiRequest extends TeaModel {
    @NameInMap("httpApiConfig")
    public DeployHttpApiRequestHttpApiConfig httpApiConfig;

    /**
     * <p>Rest API deployment configuration. Required when deploying an HTTP API as a Rest API.</p>
     */
    @NameInMap("restApiConfig")
    public DeployHttpApiRequestRestApiConfig restApiConfig;

    /**
     * <p>Route ID. This must be provided when publishing the route of an HTTP API.</p>
     * 
     * <strong>example:</strong>
     * <p>hr-cr82undlhtgrl***</p>
     */
    @NameInMap("routeId")
    public String routeId;

    public static DeployHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployHttpApiRequest self = new DeployHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public DeployHttpApiRequest setHttpApiConfig(DeployHttpApiRequestHttpApiConfig httpApiConfig) {
        this.httpApiConfig = httpApiConfig;
        return this;
    }
    public DeployHttpApiRequestHttpApiConfig getHttpApiConfig() {
        return this.httpApiConfig;
    }

    public DeployHttpApiRequest setRestApiConfig(DeployHttpApiRequestRestApiConfig restApiConfig) {
        this.restApiConfig = restApiConfig;
        return this;
    }
    public DeployHttpApiRequestRestApiConfig getRestApiConfig() {
        return this.restApiConfig;
    }

    public DeployHttpApiRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public static class DeployHttpApiRequestHttpApiConfig extends TeaModel {
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("routeIds")
        public java.util.List<String> routeIds;

        public static DeployHttpApiRequestHttpApiConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHttpApiRequestHttpApiConfig self = new DeployHttpApiRequestHttpApiConfig();
            return TeaModel.build(map, self);
        }

        public DeployHttpApiRequestHttpApiConfig setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DeployHttpApiRequestHttpApiConfig setRouteIds(java.util.List<String> routeIds) {
            this.routeIds = routeIds;
            return this;
        }
        public java.util.List<String> getRouteIds() {
            return this.routeIds;
        }

    }

    public static class DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs extends TeaModel {
        /**
         * <p>Configuration of matching conditions related to API deployment.</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>Service port, do not provide for dynamic ports.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Service protocol:</p>
         * <ul>
         * <li>HTTP.</li>
         * <li>HTTPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>Service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-cr6pk4tlhtgm58e***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>Weight, range [1,100], valid only in the by-ratio scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs self = new DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs();
            return TeaModel.build(map, self);
        }

        public DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DeployHttpApiRequestRestApiConfigEnvironment extends TeaModel {
        /**
         * <p>API publication scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("backendScene")
        public String backendScene;

        /**
         * <p>List of user domains.</p>
         */
        @NameInMap("customDomainIds")
        public java.util.List<String> customDomainIds;

        /**
         * <p>Environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cpqnr6tlhtgubc***</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Existing service configurations. Only one entry is allowed in a single-service scenario, while multiple entries are allowed in scenarios such as by ratio or by content.</p>
         */
        @NameInMap("serviceConfigs")
        public java.util.List<DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs> serviceConfigs;

        public static DeployHttpApiRequestRestApiConfigEnvironment build(java.util.Map<String, ?> map) throws Exception {
            DeployHttpApiRequestRestApiConfigEnvironment self = new DeployHttpApiRequestRestApiConfigEnvironment();
            return TeaModel.build(map, self);
        }

        public DeployHttpApiRequestRestApiConfigEnvironment setBackendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }
        public String getBackendScene() {
            return this.backendScene;
        }

        public DeployHttpApiRequestRestApiConfigEnvironment setCustomDomainIds(java.util.List<String> customDomainIds) {
            this.customDomainIds = customDomainIds;
            return this;
        }
        public java.util.List<String> getCustomDomainIds() {
            return this.customDomainIds;
        }

        public DeployHttpApiRequestRestApiConfigEnvironment setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DeployHttpApiRequestRestApiConfigEnvironment setServiceConfigs(java.util.List<DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

    public static class DeployHttpApiRequestRestApiConfig extends TeaModel {
        /**
         * <p>Publication description.</p>
         * 
         * <strong>example:</strong>
         * <p>用户服务API发布。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Publication environment configuration.</p>
         */
        @NameInMap("environment")
        public DeployHttpApiRequestRestApiConfigEnvironment environment;

        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("operationIds")
        public java.util.List<String> operationIds;

        /**
         * <p>Historical version number. If this field is specified, the publication information will be based on the historical version information.</p>
         * 
         * <strong>example:</strong>
         * <p>apr-xxx</p>
         */
        @NameInMap("revisionId")
        public String revisionId;

        public static DeployHttpApiRequestRestApiConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployHttpApiRequestRestApiConfig self = new DeployHttpApiRequestRestApiConfig();
            return TeaModel.build(map, self);
        }

        public DeployHttpApiRequestRestApiConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeployHttpApiRequestRestApiConfig setEnvironment(DeployHttpApiRequestRestApiConfigEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public DeployHttpApiRequestRestApiConfigEnvironment getEnvironment() {
            return this.environment;
        }

        public DeployHttpApiRequestRestApiConfig setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DeployHttpApiRequestRestApiConfig setOperationIds(java.util.List<String> operationIds) {
            this.operationIds = operationIds;
            return this;
        }
        public java.util.List<String> getOperationIds() {
            return this.operationIds;
        }

        public DeployHttpApiRequestRestApiConfig setRevisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public String getRevisionId() {
            return this.revisionId;
        }

    }

}
