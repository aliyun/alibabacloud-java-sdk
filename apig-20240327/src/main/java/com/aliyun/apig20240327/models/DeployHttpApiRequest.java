// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeployHttpApiRequest extends TeaModel {
    /**
     * <p>httpApiConfig</p>
     */
    @NameInMap("httpApiConfig")
    @Deprecated
    public DeployHttpApiRequestHttpApiConfig httpApiConfig;

    /**
     * <p>The REST API deployment configuration. This parameter is required when you publish a REST API.</p>
     */
    @NameInMap("restApiConfig")
    public DeployHttpApiRequestRestApiConfig restApiConfig;

    /**
     * <p>The route ID. You must specify this parameter when you publish an HTTP API.</p>
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

    @Deprecated
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
        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-csrhgfmm1hknf0hu6o3g</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>routeIds</p>
         */
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
         * <p>The matching condition configurations related to API publishing.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;change_order_revision\&quot;:\&quot;3.657.33_fc-hz-yunqi.1662568293908382_faas-eerouter\&quot;}</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The service port. If you want to use a dynamic port, do not pass this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-cr6pk4tlhtgm58e***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The version of the microservice.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The weight. Valid values: [1,100]. This parameter is valid only in proportional routing.</p>
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
         * <p>The publishing scenario.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SingleService</li>
         * <li>MultiServiceByRatio</li>
         * <li>MultiServiceByContent</li>
         * <li>Mock</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("backendScene")
        @Deprecated
        public String backendScene;

        /**
         * <p>The custom domain names.</p>
         */
        @NameInMap("customDomainIds")
        public java.util.List<String> customDomainIds;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cpqnr6tlhtgubc***</p>
         */
        @NameInMap("environmentId")
        @Deprecated
        public String environmentId;

        /**
         * <p>The configurations of existing services. For single-service publishing, only one entry is allowed. For other scenarios, multiple entries are allowed.</p>
         */
        @NameInMap("serviceConfigs")
        @Deprecated
        public java.util.List<DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs> serviceConfigs;

        public static DeployHttpApiRequestRestApiConfigEnvironment build(java.util.Map<String, ?> map) throws Exception {
            DeployHttpApiRequestRestApiConfigEnvironment self = new DeployHttpApiRequestRestApiConfigEnvironment();
            return TeaModel.build(map, self);
        }

        @Deprecated
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

        @Deprecated
        public DeployHttpApiRequestRestApiConfigEnvironment setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        @Deprecated
        public DeployHttpApiRequestRestApiConfigEnvironment setServiceConfigs(java.util.List<DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<DeployHttpApiRequestRestApiConfigEnvironmentServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

    public static class DeployHttpApiRequestRestApiConfigOperationDeployments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Publish</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>op-d5s57hmm1hks653u9dkg</p>
         */
        @NameInMap("operationId")
        public String operationId;

        public static DeployHttpApiRequestRestApiConfigOperationDeployments build(java.util.Map<String, ?> map) throws Exception {
            DeployHttpApiRequestRestApiConfigOperationDeployments self = new DeployHttpApiRequestRestApiConfigOperationDeployments();
            return TeaModel.build(map, self);
        }

        public DeployHttpApiRequestRestApiConfigOperationDeployments setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DeployHttpApiRequestRestApiConfigOperationDeployments setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

    public static class DeployHttpApiRequestRestApiConfig extends TeaModel {
        /**
         * <p>The publish description.</p>
         * 
         * <strong>example:</strong>
         * <p>The user service API</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configurations.</p>
         */
        @NameInMap("environment")
        public DeployHttpApiRequestRestApiConfigEnvironment environment;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cvn2u46m1hkun04oll8g</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("operationDeployments")
        public java.util.List<DeployHttpApiRequestRestApiConfigOperationDeployments> operationDeployments;

        /**
         * <p>operationIds</p>
         */
        @NameInMap("operationIds")
        @Deprecated
        public java.util.List<String> operationIds;

        /**
         * <p>The historical version of the API. If you specify this parameter, the corresponding version of the API is published.</p>
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

        public DeployHttpApiRequestRestApiConfig setOperationDeployments(java.util.List<DeployHttpApiRequestRestApiConfigOperationDeployments> operationDeployments) {
            this.operationDeployments = operationDeployments;
            return this;
        }
        public java.util.List<DeployHttpApiRequestRestApiConfigOperationDeployments> getOperationDeployments() {
            return this.operationDeployments;
        }

        @Deprecated
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
