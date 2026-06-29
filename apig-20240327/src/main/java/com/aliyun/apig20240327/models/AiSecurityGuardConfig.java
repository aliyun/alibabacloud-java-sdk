// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiSecurityGuardConfig extends TeaModel {
    /**
     * <p>The response buffer size in KB. Default value: 1000. Valid values: 1 to 1500.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("bufferLimit")
    public Integer bufferLimit;

    /**
     * <p>Specifies whether to check request content.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("checkRequest")
    public Boolean checkRequest;

    /**
     * <p>Specifies whether to check request images.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("checkRequestImage")
    public Boolean checkRequestImage;

    /**
     * <p>Specifies whether to check response content.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("checkResponse")
    public Boolean checkResponse;

    /**
     * <p>Specifies whether to check response images.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("checkResponseImage")
    public Boolean checkResponseImage;

    /**
     * <p>The consumer-level request detection service configuration.</p>
     */
    @NameInMap("consumerRequestCheckService")
    public java.util.List<AiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService;

    /**
     * <p>The consumer-level response detection service configuration.</p>
     */
    @NameInMap("consumerResponseCheckService")
    public java.util.List<AiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService;

    /**
     * <p>The consumer-level risk level configuration.</p>
     */
    @NameInMap("consumerRiskLevel")
    public java.util.List<AiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel;

    /**
     * <p>The plugin running status.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>The ServiceCode of the request text detection service (system-injected default value).</p>
     * 
     * <strong>example:</strong>
     * <p>query_security_check</p>
     */
    @NameInMap("requestCheckService")
    public String requestCheckService;

    /**
     * <p>The ServiceCode of the request image detection service (system-injected default value).</p>
     * 
     * <strong>example:</strong>
     * <p>img_query_guard</p>
     */
    @NameInMap("requestImageCheckService")
    public String requestImageCheckService;

    /**
     * <p>The ServiceCode of the response text detection service (system-injected default value).</p>
     * 
     * <strong>example:</strong>
     * <p>response_security_check</p>
     */
    @NameInMap("responseCheckService")
    public String responseCheckService;

    /**
     * <p>The ServiceCode of the response image detection service (system-injected default value).</p>
     * 
     * <strong>example:</strong>
     * <p>img_response_guard</p>
     */
    @NameInMap("responseImageCheckService")
    public String responseImageCheckService;

    /**
     * <p>The global risk alert level.</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("riskAlertLevel")
    public String riskAlertLevel;

    /**
     * <p>The risk dimension configuration list (system-injected, normalized from ConsumerRiskLevel).</p>
     */
    @NameInMap("riskConfig")
    public java.util.List<AiSecurityGuardConfigRiskConfig> riskConfig;

    /**
     * <p>The security guardrail service address (green-cip endpoint). Use the VPC internal address when the gateway and security guardrail are in the same region.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://green-cip-vpc.cn-shanghai.aliyuncs.com">https://green-cip-vpc.cn-shanghai.aliyuncs.com</a></p>
     */
    @NameInMap("serviceAddress")
    public String serviceAddress;

    public static AiSecurityGuardConfig build(java.util.Map<String, ?> map) throws Exception {
        AiSecurityGuardConfig self = new AiSecurityGuardConfig();
        return TeaModel.build(map, self);
    }

    public AiSecurityGuardConfig setBufferLimit(Integer bufferLimit) {
        this.bufferLimit = bufferLimit;
        return this;
    }
    public Integer getBufferLimit() {
        return this.bufferLimit;
    }

    public AiSecurityGuardConfig setCheckRequest(Boolean checkRequest) {
        this.checkRequest = checkRequest;
        return this;
    }
    public Boolean getCheckRequest() {
        return this.checkRequest;
    }

    public AiSecurityGuardConfig setCheckRequestImage(Boolean checkRequestImage) {
        this.checkRequestImage = checkRequestImage;
        return this;
    }
    public Boolean getCheckRequestImage() {
        return this.checkRequestImage;
    }

    public AiSecurityGuardConfig setCheckResponse(Boolean checkResponse) {
        this.checkResponse = checkResponse;
        return this;
    }
    public Boolean getCheckResponse() {
        return this.checkResponse;
    }

    public AiSecurityGuardConfig setCheckResponseImage(Boolean checkResponseImage) {
        this.checkResponseImage = checkResponseImage;
        return this;
    }
    public Boolean getCheckResponseImage() {
        return this.checkResponseImage;
    }

    public AiSecurityGuardConfig setConsumerRequestCheckService(java.util.List<AiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService) {
        this.consumerRequestCheckService = consumerRequestCheckService;
        return this;
    }
    public java.util.List<AiSecurityGuardConfigConsumerRequestCheckService> getConsumerRequestCheckService() {
        return this.consumerRequestCheckService;
    }

    public AiSecurityGuardConfig setConsumerResponseCheckService(java.util.List<AiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService) {
        this.consumerResponseCheckService = consumerResponseCheckService;
        return this;
    }
    public java.util.List<AiSecurityGuardConfigConsumerResponseCheckService> getConsumerResponseCheckService() {
        return this.consumerResponseCheckService;
    }

    public AiSecurityGuardConfig setConsumerRiskLevel(java.util.List<AiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel) {
        this.consumerRiskLevel = consumerRiskLevel;
        return this;
    }
    public java.util.List<AiSecurityGuardConfigConsumerRiskLevel> getConsumerRiskLevel() {
        return this.consumerRiskLevel;
    }

    public AiSecurityGuardConfig setPluginStatus(AiPluginStatus pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    public AiSecurityGuardConfig setRequestCheckService(String requestCheckService) {
        this.requestCheckService = requestCheckService;
        return this;
    }
    public String getRequestCheckService() {
        return this.requestCheckService;
    }

    public AiSecurityGuardConfig setRequestImageCheckService(String requestImageCheckService) {
        this.requestImageCheckService = requestImageCheckService;
        return this;
    }
    public String getRequestImageCheckService() {
        return this.requestImageCheckService;
    }

    public AiSecurityGuardConfig setResponseCheckService(String responseCheckService) {
        this.responseCheckService = responseCheckService;
        return this;
    }
    public String getResponseCheckService() {
        return this.responseCheckService;
    }

    public AiSecurityGuardConfig setResponseImageCheckService(String responseImageCheckService) {
        this.responseImageCheckService = responseImageCheckService;
        return this;
    }
    public String getResponseImageCheckService() {
        return this.responseImageCheckService;
    }

    public AiSecurityGuardConfig setRiskAlertLevel(String riskAlertLevel) {
        this.riskAlertLevel = riskAlertLevel;
        return this;
    }
    public String getRiskAlertLevel() {
        return this.riskAlertLevel;
    }

    public AiSecurityGuardConfig setRiskConfig(java.util.List<AiSecurityGuardConfigRiskConfig> riskConfig) {
        this.riskConfig = riskConfig;
        return this;
    }
    public java.util.List<AiSecurityGuardConfigRiskConfig> getRiskConfig() {
        return this.riskConfig;
    }

    public AiSecurityGuardConfig setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
        return this;
    }
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public static class AiSecurityGuardConfigConsumerRequestCheckService extends TeaModel {
        /**
         * <p>The consumer matching method.</p>
         * 
         * <strong>example:</strong>
         * <p>exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The modality type.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The check service.</p>
         * 
         * <strong>example:</strong>
         * <p>query_security_check</p>
         */
        @NameInMap("requestCheckService")
        public String requestCheckService;

        /**
         * <p>The image check service.</p>
         * 
         * <strong>example:</strong>
         * <p>img_query_guard</p>
         */
        @NameInMap("requestImageCheckService")
        public String requestImageCheckService;

        public static AiSecurityGuardConfigConsumerRequestCheckService build(java.util.Map<String, ?> map) throws Exception {
            AiSecurityGuardConfigConsumerRequestCheckService self = new AiSecurityGuardConfigConsumerRequestCheckService();
            return TeaModel.build(map, self);
        }

        public AiSecurityGuardConfigConsumerRequestCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AiSecurityGuardConfigConsumerRequestCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public AiSecurityGuardConfigConsumerRequestCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AiSecurityGuardConfigConsumerRequestCheckService setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public AiSecurityGuardConfigConsumerRequestCheckService setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

    }

    public static class AiSecurityGuardConfigConsumerResponseCheckService extends TeaModel {
        /**
         * <p>The consumer matching method.</p>
         * 
         * <strong>example:</strong>
         * <p>exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The modality type.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The check service.</p>
         * 
         * <strong>example:</strong>
         * <p>query_security_check</p>
         */
        @NameInMap("responseCheckService")
        public String responseCheckService;

        /**
         * <p>The image check service.</p>
         * 
         * <strong>example:</strong>
         * <p>img_query_guard</p>
         */
        @NameInMap("responseImageCheckService")
        public String responseImageCheckService;

        public static AiSecurityGuardConfigConsumerResponseCheckService build(java.util.Map<String, ?> map) throws Exception {
            AiSecurityGuardConfigConsumerResponseCheckService self = new AiSecurityGuardConfigConsumerResponseCheckService();
            return TeaModel.build(map, self);
        }

        public AiSecurityGuardConfigConsumerResponseCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AiSecurityGuardConfigConsumerResponseCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public AiSecurityGuardConfigConsumerResponseCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AiSecurityGuardConfigConsumerResponseCheckService setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public AiSecurityGuardConfigConsumerResponseCheckService setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

    }

    public static class AiSecurityGuardConfigConsumerRiskLevel extends TeaModel {
        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The consumer matching method.</p>
         * 
         * <strong>example:</strong>
         * <p>exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The risk dimension type.</p>
         * 
         * <strong>example:</strong>
         * <p>ContentModeration</p>
         */
        @NameInMap("type")
        public String type;

        public static AiSecurityGuardConfigConsumerRiskLevel build(java.util.Map<String, ?> map) throws Exception {
            AiSecurityGuardConfigConsumerRiskLevel self = new AiSecurityGuardConfigConsumerRiskLevel();
            return TeaModel.build(map, self);
        }

        public AiSecurityGuardConfigConsumerRiskLevel setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AiSecurityGuardConfigConsumerRiskLevel setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AiSecurityGuardConfigConsumerRiskLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AiSecurityGuardConfigConsumerRiskLevel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AiSecurityGuardConfigRiskConfigConsumerRules extends TeaModel {
        /**
         * <p>The matching method.</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The consumer matching pattern value.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-a</p>
         */
        @NameInMap("pattern")
        public String pattern;

        public static AiSecurityGuardConfigRiskConfigConsumerRules build(java.util.Map<String, ?> map) throws Exception {
            AiSecurityGuardConfigRiskConfigConsumerRules self = new AiSecurityGuardConfigRiskConfigConsumerRules();
            return TeaModel.build(map, self);
        }

        public AiSecurityGuardConfigRiskConfigConsumerRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AiSecurityGuardConfigRiskConfigConsumerRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class AiSecurityGuardConfigRiskConfig extends TeaModel {
        /**
         * <p>The consumer-level matching rules.</p>
         */
        @NameInMap("consumerRules")
        public AiSecurityGuardConfigRiskConfigConsumerRules consumerRules;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The risk dimension type.</p>
         * 
         * <strong>example:</strong>
         * <p>ContentModeration</p>
         */
        @NameInMap("type")
        public String type;

        public static AiSecurityGuardConfigRiskConfig build(java.util.Map<String, ?> map) throws Exception {
            AiSecurityGuardConfigRiskConfig self = new AiSecurityGuardConfigRiskConfig();
            return TeaModel.build(map, self);
        }

        public AiSecurityGuardConfigRiskConfig setConsumerRules(AiSecurityGuardConfigRiskConfigConsumerRules consumerRules) {
            this.consumerRules = consumerRules;
            return this;
        }
        public AiSecurityGuardConfigRiskConfigConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        public AiSecurityGuardConfigRiskConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AiSecurityGuardConfigRiskConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
