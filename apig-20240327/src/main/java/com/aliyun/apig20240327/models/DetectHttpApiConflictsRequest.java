// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DetectHttpApiConflictsRequest extends TeaModel {
    @NameInMap("restApiConfig")
    public DetectHttpApiConflictsRequestRestApiConfig restApiConfig;

    @NameInMap("routeId")
    public String routeId;

    public static DetectHttpApiConflictsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectHttpApiConflictsRequest self = new DetectHttpApiConflictsRequest();
        return TeaModel.build(map, self);
    }

    public DetectHttpApiConflictsRequest setRestApiConfig(DetectHttpApiConflictsRequestRestApiConfig restApiConfig) {
        this.restApiConfig = restApiConfig;
        return this;
    }
    public DetectHttpApiConflictsRequestRestApiConfig getRestApiConfig() {
        return this.restApiConfig;
    }

    public DetectHttpApiConflictsRequest setRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }
    public String getRouteId() {
        return this.routeId;
    }

    public static class DetectHttpApiConflictsRequestRestApiConfigServiceConfigs extends TeaModel {
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        @NameInMap("port")
        public Integer port;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("version")
        public String version;

        @NameInMap("weight")
        public Integer weight;

        public static DetectHttpApiConflictsRequestRestApiConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            DetectHttpApiConflictsRequestRestApiConfigServiceConfigs self = new DetectHttpApiConflictsRequestRestApiConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public DetectHttpApiConflictsRequestRestApiConfigServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
        }

        public DetectHttpApiConflictsRequestRestApiConfigServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DetectHttpApiConflictsRequestRestApiConfigServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DetectHttpApiConflictsRequestRestApiConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public DetectHttpApiConflictsRequestRestApiConfigServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DetectHttpApiConflictsRequestRestApiConfigServiceConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DetectHttpApiConflictsRequestRestApiConfig extends TeaModel {
        @NameInMap("backendScene")
        public String backendScene;

        @NameInMap("customDomainIds")
        public java.util.List<String> customDomainIds;

        @NameInMap("environmentId")
        public String environmentId;

        @NameInMap("gatewayId")
        public String gatewayId;

        @NameInMap("serviceConfigs")
        public java.util.List<DetectHttpApiConflictsRequestRestApiConfigServiceConfigs> serviceConfigs;

        public static DetectHttpApiConflictsRequestRestApiConfig build(java.util.Map<String, ?> map) throws Exception {
            DetectHttpApiConflictsRequestRestApiConfig self = new DetectHttpApiConflictsRequestRestApiConfig();
            return TeaModel.build(map, self);
        }

        public DetectHttpApiConflictsRequestRestApiConfig setBackendScene(String backendScene) {
            this.backendScene = backendScene;
            return this;
        }
        public String getBackendScene() {
            return this.backendScene;
        }

        public DetectHttpApiConflictsRequestRestApiConfig setCustomDomainIds(java.util.List<String> customDomainIds) {
            this.customDomainIds = customDomainIds;
            return this;
        }
        public java.util.List<String> getCustomDomainIds() {
            return this.customDomainIds;
        }

        public DetectHttpApiConflictsRequestRestApiConfig setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DetectHttpApiConflictsRequestRestApiConfig setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DetectHttpApiConflictsRequestRestApiConfig setServiceConfigs(java.util.List<DetectHttpApiConflictsRequestRestApiConfigServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<DetectHttpApiConflictsRequestRestApiConfigServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

}
