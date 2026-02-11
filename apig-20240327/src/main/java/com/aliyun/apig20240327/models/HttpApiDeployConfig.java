// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiDeployConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDeploy")
    public Boolean autoDeploy;

    /**
     * <p>The publishing scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>SingleService</p>
     */
    @NameInMap("backendScene")
    public String backendScene;

    /**
     * <p>The IDs of the custom domain names.</p>
     */
    @NameInMap("customDomainIds")
    public java.util.List<String> customDomainIds;

    /**
     * <p>The information about the custom domain names.</p>
     */
    @NameInMap("customDomainInfos")
    public java.util.List<HttpApiDeployConfigCustomDomainInfos> customDomainInfos;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The instance information.</p>
     */
    @NameInMap("gatewayInfo")
    public GatewayInfo gatewayInfo;

    /**
     * <p>网关类型</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The Mock settings.</p>
     */
    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <p>The policy configurations.</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<HttpApiDeployConfigPolicyConfigs> policyConfigs;

    /**
     * <p>routeBackend</p>
     */
    @NameInMap("routeBackend")
    public Backend routeBackend;

    /**
     * <p>The service configurations.</p>
     */
    @NameInMap("serviceConfigs")
    public java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs;

    /**
     * <p>The information about the sub-domain names.</p>
     */
    @NameInMap("subDomains")
    public java.util.List<HttpApiDeployConfigSubDomains> subDomains;

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

    public HttpApiDeployConfig setCustomDomainInfos(java.util.List<HttpApiDeployConfigCustomDomainInfos> customDomainInfos) {
        this.customDomainInfos = customDomainInfos;
        return this;
    }
    public java.util.List<HttpApiDeployConfigCustomDomainInfos> getCustomDomainInfos() {
        return this.customDomainInfos;
    }

    public HttpApiDeployConfig setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public HttpApiDeployConfig setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public HttpApiDeployConfig setGatewayInfo(GatewayInfo gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
        return this;
    }
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    public HttpApiDeployConfig setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public HttpApiDeployConfig setMock(HttpApiMockContract mock) {
        this.mock = mock;
        return this;
    }
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    public HttpApiDeployConfig setPolicyConfigs(java.util.List<HttpApiDeployConfigPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfigPolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public HttpApiDeployConfig setRouteBackend(Backend routeBackend) {
        this.routeBackend = routeBackend;
        return this;
    }
    public Backend getRouteBackend() {
        return this.routeBackend;
    }

    public HttpApiDeployConfig setServiceConfigs(java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfigServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public HttpApiDeployConfig setSubDomains(java.util.List<HttpApiDeployConfigSubDomains> subDomains) {
        this.subDomains = subDomains;
        return this;
    }
    public java.util.List<HttpApiDeployConfigSubDomains> getSubDomains() {
        return this.subDomains;
    }

    public static class HttpApiDeployConfigCustomDomainInfos extends TeaModel {
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cshee6dlhtgkf4muio3g</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>hello-server.com</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HttpApiDeployConfigCustomDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigCustomDomainInfos self = new HttpApiDeployConfigCustomDomainInfos();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigCustomDomainInfos setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpApiDeployConfigCustomDomainInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigCustomDomainInfos setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs extends TeaModel {
        /**
         * <p>Service ID for fallback</p>
         * 
         * <strong>example:</strong>
         * <p>svc-******</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>targetModelName</p>
         * 
         * <strong>example:</strong>
         * <p>gpt-4/llama3-70b</p>
         */
        @NameInMap("targetModelName")
        public String targetModelName;

        public static HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs self = new HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs setTargetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }
        public String getTargetModelName() {
            return this.targetModelName;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiFallbackConfig extends TeaModel {
        /**
         * <p>List of fallback service configurations</p>
         */
        @NameInMap("serviceConfigs")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs;

        public static HttpApiDeployConfigPolicyConfigsAiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiFallbackConfig self = new HttpApiDeployConfigPolicyConfigsAiFallbackConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig setServiceConfigs(java.util.List<HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService extends TeaModel {
        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>exact/prefix</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Modality type</p>
         * 
         * <strong>example:</strong>
         * <p>text/image</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>Consumer name for matching</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Request check service name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://checker.example.com/validate">https://checker.example.com/validate</a></p>
         */
        @NameInMap("requestCheckService")
        public String requestCheckService;

        /**
         * <p>requestImageCheckService</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image-check.example.com/scan">https://image-check.example.com/scan</a></p>
         */
        @NameInMap("requestImageCheckService")
        public String requestImageCheckService;

        public static HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService self = new HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService extends TeaModel {
        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>term</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Modality type</p>
         * 
         * <strong>example:</strong>
         * <p>text/image</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>Consumer name for matching</p>
         * 
         * <strong>example:</strong>
         * <p>AI_API</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Response check service name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://checker.example.com/validate-response">https://checker.example.com/validate-response</a></p>
         */
        @NameInMap("responseCheckService")
        public String responseCheckService;

        /**
         * <p>responseImageCheckService</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image-check.example.com/scan-response">https://image-check.example.com/scan-response</a></p>
         */
        @NameInMap("responseImageCheckService")
        public String responseImageCheckService;

        public static HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService self = new HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel extends TeaModel {
        /**
         * <p>Risk alert level</p>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>term</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Consumer name for matching</p>
         * 
         * <strong>example:</strong>
         * <p>APIG-UI</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Risk type</p>
         * 
         * <strong>example:</strong>
         * <p>K8S</p>
         */
        @NameInMap("type")
        public String type;

        public static HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel self = new HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules extends TeaModel {
        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>term</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Pattern for matching</p>
         * 
         * <strong>example:</strong>
         * <p>first</p>
         */
        @NameInMap("pattern")
        public String pattern;

        public static HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules self = new HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig extends TeaModel {
        /**
         * <p>Consumer-specific rules</p>
         */
        @NameInMap("consumerRules")
        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules;

        /**
         * <p>Risk alert level</p>
         * 
         * <strong>example:</strong>
         * <p>Critical</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Risk type identifier</p>
         * 
         * <strong>example:</strong>
         * <p>K8S</p>
         */
        @NameInMap("type")
        public String type;

        public static HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig self = new HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig setConsumerRules(HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules) {
            this.consumerRules = consumerRules;
            return this;
        }
        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig extends TeaModel {
        /**
         * <p>bufferLimit</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("bufferLimit")
        public Integer bufferLimit;

        /**
         * <p>Whether to check request content</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkRequest")
        public Boolean checkRequest;

        /**
         * <p>Whether to check request content</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkRequestImage")
        public Boolean checkRequestImage;

        /**
         * <p>Whether to check response content</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkResponse")
        public Boolean checkResponse;

        /**
         * <p>Whether to check response content</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkResponseImage")
        public Boolean checkResponseImage;

        /**
         * <p>Consumer-specific request check configs</p>
         */
        @NameInMap("consumerRequestCheckService")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService;

        /**
         * <p>Consumer-specific Response check configs</p>
         */
        @NameInMap("consumerResponseCheckService")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService;

        /**
         * <p>Consumer-specific risk level configs</p>
         */
        @NameInMap("consumerRiskLevel")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel;

        /**
         * <p>Request check service name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://checker.example.com/validate-request">https://checker.example.com/validate-request</a></p>
         */
        @NameInMap("requestCheckService")
        public String requestCheckService;

        /**
         * <p>Request check service name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image-checker.example.com/scan">https://image-checker.example.com/scan</a></p>
         */
        @NameInMap("requestImageCheckService")
        public String requestImageCheckService;

        /**
         * <p>Response check service name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://checker.example.com/validate-response">https://checker.example.com/validate-response</a></p>
         */
        @NameInMap("responseCheckService")
        public String responseCheckService;

        /**
         * <p>Response check service name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image-checker.example.com/scan-response">https://image-checker.example.com/scan-response</a></p>
         */
        @NameInMap("responseImageCheckService")
        public String responseImageCheckService;

        /**
         * <p>Risk alert level for content moderation</p>
         * 
         * <strong>example:</strong>
         * <p>low/medium/high</p>
         */
        @NameInMap("riskAlertLevel")
        public String riskAlertLevel;

        /**
         * <p>riskConfig</p>
         */
        @NameInMap("riskConfig")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig;

        /**
         * <p>Security guard service address</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.example.com/v1">https://api.example.com/v1</a></p>
         */
        @NameInMap("serviceAddress")
        public String serviceAddress;

        public static HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig self = new HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setBufferLimit(Integer bufferLimit) {
            this.bufferLimit = bufferLimit;
            return this;
        }
        public Integer getBufferLimit() {
            return this.bufferLimit;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setCheckRequest(Boolean checkRequest) {
            this.checkRequest = checkRequest;
            return this;
        }
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setCheckRequestImage(Boolean checkRequestImage) {
            this.checkRequestImage = checkRequestImage;
            return this;
        }
        public Boolean getCheckRequestImage() {
            return this.checkRequestImage;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setCheckResponse(Boolean checkResponse) {
            this.checkResponse = checkResponse;
            return this;
        }
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setCheckResponseImage(Boolean checkResponseImage) {
            this.checkResponseImage = checkResponseImage;
            return this;
        }
        public Boolean getCheckResponseImage() {
            return this.checkResponseImage;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setConsumerRequestCheckService(java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService) {
            this.consumerRequestCheckService = consumerRequestCheckService;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> getConsumerRequestCheckService() {
            return this.consumerRequestCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setConsumerResponseCheckService(java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService) {
            this.consumerResponseCheckService = consumerResponseCheckService;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> getConsumerResponseCheckService() {
            return this.consumerResponseCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setConsumerRiskLevel(java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel) {
            this.consumerRiskLevel = consumerRiskLevel;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> getConsumerRiskLevel() {
            return this.consumerRiskLevel;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setRiskAlertLevel(String riskAlertLevel) {
            this.riskAlertLevel = riskAlertLevel;
            return this;
        }
        public String getRiskAlertLevel() {
            return this.riskAlertLevel;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setRiskConfig(java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig) {
            this.riskConfig = riskConfig;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfigRiskConfig> getRiskConfig() {
            return this.riskConfig;
        }

        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules extends TeaModel {
        /**
         * <p>Limit mode for global rules</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("limitMode")
        public String limitMode;

        /**
         * <p>Limit type for global rules</p>
         * 
         * <strong>example:</strong>
         * <p>request</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>Limit value for global rules</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("limitValue")
        public Integer limitValue;

        /**
         * <p>Match key</p>
         * 
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("matchKey")
        public String matchKey;

        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>term</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Match value</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        @NameInMap("matchValue")
        public String matchValue;

        public static HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules self = new HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public String getLimitMode() {
            return this.limitMode;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitValue(Integer limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public Integer getLimitValue() {
            return this.limitValue;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }
        public String getMatchKey() {
            return this.matchKey;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public String getMatchValue() {
            return this.matchValue;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules extends TeaModel {
        /**
         * <p>Limit mode</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("limitMode")
        public String limitMode;

        /**
         * <p>Limit type</p>
         * 
         * <strong>example:</strong>
         * <p>request/token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>Limit value</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("limitValue")
        public Integer limitValue;

        /**
         * <p>Match key</p>
         * 
         * <strong>example:</strong>
         * <p>user_id/api_path</p>
         */
        @NameInMap("matchKey")
        public String matchKey;

        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>term</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Match value</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        @NameInMap("matchValue")
        public String matchValue;

        public static HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules self = new HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules setLimitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public String getLimitMode() {
            return this.limitMode;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules setLimitValue(Integer limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public Integer getLimitValue() {
            return this.limitValue;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules setMatchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }
        public String getMatchKey() {
            return this.matchKey;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules setMatchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public String getMatchValue() {
            return this.matchValue;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig extends TeaModel {
        /**
         * <p>Whether to enable global rate limit rules</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableGlobalRules")
        public Boolean enableGlobalRules;

        /**
         * <p>List of global rate limit rules</p>
         */
        @NameInMap("globalRules")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules;

        /**
         * <p>List of rate limit rules</p>
         */
        @NameInMap("rules")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules> rules;

        public static HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig self = new HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig setEnableGlobalRules(Boolean enableGlobalRules) {
            this.enableGlobalRules = enableGlobalRules;
            return this;
        }
        public Boolean getEnableGlobalRules() {
            return this.enableGlobalRules;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig setGlobalRules(java.util.List<HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules) {
            this.globalRules = globalRules;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigGlobalRules> getGlobalRules() {
            return this.globalRules;
        }

        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig setRules(java.util.List<HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfigRules> getRules() {
            return this.rules;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigs extends TeaModel {
        /**
         * <p>The fallback configurations</p>
         */
        @NameInMap("aiFallbackConfig")
        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig aiFallbackConfig;

        /**
         * <p>AI Security Guard configuration</p>
         */
        @NameInMap("aiSecurityGuardConfig")
        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig;

        /**
         * <p>AI Token Rate Limit configuration</p>
         */
        @NameInMap("aiTokenRateLimitConfig")
        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig;

        /**
         * <p>Specifies whether to enable the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The type of the policy. Valid values:</p>
         * 
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

        public HttpApiDeployConfigPolicyConfigs setAiSecurityGuardConfig(HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig) {
            this.aiSecurityGuardConfig = aiSecurityGuardConfig;
            return this;
        }
        public HttpApiDeployConfigPolicyConfigsAiSecurityGuardConfig getAiSecurityGuardConfig() {
            return this.aiSecurityGuardConfig;
        }

        public HttpApiDeployConfigPolicyConfigs setAiTokenRateLimitConfig(HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig) {
            this.aiTokenRateLimitConfig = aiTokenRateLimitConfig;
            return this;
        }
        public HttpApiDeployConfigPolicyConfigsAiTokenRateLimitConfig getAiTokenRateLimitConfig() {
            return this.aiTokenRateLimitConfig;
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

    public static class HttpApiDeployConfigServiceConfigsObservabilityRouteConfig extends TeaModel {
        /**
         * <p>Routing mode</p>
         * 
         * <strong>example:</strong>
         * <p>LeastBusy</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>Queue size</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("queueSize")
        public Integer queueSize;

        /**
         * <p>Max traffic ratio per single service</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("rateLimit")
        public Float rateLimit;

        public static HttpApiDeployConfigServiceConfigsObservabilityRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigServiceConfigsObservabilityRouteConfig self = new HttpApiDeployConfigServiceConfigsObservabilityRouteConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig setQueueSize(Integer queueSize) {
            this.queueSize = queueSize;
            return this;
        }
        public Integer getQueueSize() {
            return this.queueSize;
        }

        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig setRateLimit(Float rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public Float getRateLimit() {
            return this.rateLimit;
        }

    }

    public static class HttpApiDeployConfigServiceConfigs extends TeaModel {
        /**
         * <p>Legacy gateway service ID for backward compatibility</p>
         * 
         * <strong>example:</strong>
         * <p>gw-svc-abc123</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>Intent classification code</p>
         * 
         * <strong>example:</strong>
         * <p>INQUIRY</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <p>Match conditions</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model name matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-*</p>
         */
        @NameInMap("modelNamePattern")
        public String modelNamePattern;

        /**
         * <p>Multi-service routing strategy type</p>
         * 
         * <strong>example:</strong>
         * <p>ByWeight</p>
         */
        @NameInMap("multiServiceRouteStrategy")
        public String multiServiceRouteStrategy;

        /**
         * <p>Service display name</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-Max-Service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Observability metrics-based routing config</p>
         */
        @NameInMap("observabilityRouteConfig")
        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig observabilityRouteConfig;

        /**
         * <p>Service port number</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Service protocol</p>
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
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Service version tag for tag-based routing scenarios</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Long weight;

        public static HttpApiDeployConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigServiceConfigs self = new HttpApiDeployConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiDeployConfigServiceConfigs setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public HttpApiDeployConfigServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
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

        public HttpApiDeployConfigServiceConfigs setMultiServiceRouteStrategy(String multiServiceRouteStrategy) {
            this.multiServiceRouteStrategy = multiServiceRouteStrategy;
            return this;
        }
        public String getMultiServiceRouteStrategy() {
            return this.multiServiceRouteStrategy;
        }

        public HttpApiDeployConfigServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigServiceConfigs setObservabilityRouteConfig(HttpApiDeployConfigServiceConfigsObservabilityRouteConfig observabilityRouteConfig) {
            this.observabilityRouteConfig = observabilityRouteConfig;
            return this;
        }
        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig getObservabilityRouteConfig() {
            return this.observabilityRouteConfig;
        }

        public HttpApiDeployConfigServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiDeployConfigServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiDeployConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiDeployConfigServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public HttpApiDeployConfigServiceConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiDeployConfigSubDomains extends TeaModel {
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-csmn42um1hksudfk9eng</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static HttpApiDeployConfigSubDomains build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigSubDomains self = new HttpApiDeployConfigSubDomains();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigSubDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpApiDeployConfigSubDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigSubDomains setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public HttpApiDeployConfigSubDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
