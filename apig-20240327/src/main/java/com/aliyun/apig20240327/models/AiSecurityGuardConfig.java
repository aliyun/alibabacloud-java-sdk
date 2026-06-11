// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiSecurityGuardConfig extends TeaModel {
    /**
     * <p>The buffer limit in bytes for streaming content checks. The service buffers content up to this limit before sending it for analysis.</p>
     */
    @NameInMap("bufferLimit")
    public Integer bufferLimit;

    /**
     * <p>Specifies whether to check the content of incoming requests.</p>
     */
    @NameInMap("checkRequest")
    public Boolean checkRequest;

    /**
     * <p>Specifies whether to check incoming requests for image content. Requires <code>checkRequest</code> to be <code>true</code>.</p>
     */
    @NameInMap("checkRequestImage")
    public Boolean checkRequestImage;

    /**
     * <p>Specifies whether to check the content of outgoing responses.</p>
     */
    @NameInMap("checkResponse")
    public Boolean checkResponse;

    /**
     * <p>Specifies whether to check outgoing responses for image content. Requires <code>checkResponse</code> to be <code>true</code>.</p>
     */
    @NameInMap("checkResponseImage")
    public Boolean checkResponseImage;

    /**
     * <p>Specifies consumer-specific configurations for the request check service.</p>
     */
    @NameInMap("consumerRequestCheckService")
    public java.util.List<AiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService;

    /**
     * <p>Specifies consumer-specific configurations for the response check service.</p>
     */
    @NameInMap("consumerResponseCheckService")
    public java.util.List<AiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService;

    /**
     * <p>Specifies customized risk thresholds for different consumers.</p>
     */
    @NameInMap("consumerRiskLevel")
    public java.util.List<AiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel;

    /**
     * <p>Controls whether the AI Security Guard plugin is enabled or disabled.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>The identifier of the request check service for text content.</p>
     */
    @NameInMap("requestCheckService")
    public String requestCheckService;

    /**
     * <p>The identifier of the request check service for image content.</p>
     */
    @NameInMap("requestImageCheckService")
    public String requestImageCheckService;

    /**
     * <p>The identifier of the response check service for text content.</p>
     */
    @NameInMap("responseCheckService")
    public String responseCheckService;

    /**
     * <p>The identifier of the response check service for image content.</p>
     */
    @NameInMap("responseImageCheckService")
    public String responseImageCheckService;

    /**
     * <p>The risk alert level. The service triggers an alert when a detected risk meets or exceeds this level.</p>
     */
    @NameInMap("riskAlertLevel")
    public String riskAlertLevel;

    /**
     * <p>Specifies general risk configurations.</p>
     */
    @NameInMap("riskConfig")
    public java.util.List<AiSecurityGuardConfigRiskConfig> riskConfig;

    /**
     * <p>The service address of the security check endpoint.</p>
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
         * <p>The match type for identifying the consumer. For example: <code>header</code> or <code>query</code>.</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The modality type for this rule. For example: <code>text</code> or <code>image</code>.</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>The identifier of the consumer.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The identifier of the request check service for text content for this consumer.</p>
         */
        @NameInMap("requestCheckService")
        public String requestCheckService;

        /**
         * <p>The identifier of the request check service for image content for this consumer.</p>
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
         * <p>The match type for identifying the consumer. For example: <code>header</code> or <code>query</code>.</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The modality type for this rule. For example: <code>text</code> or <code>image</code>.</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>The identifier of the consumer.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The identifier of the response check service for text content for this consumer.</p>
         */
        @NameInMap("responseCheckService")
        public String responseCheckService;

        /**
         * <p>The identifier of the response check service for image content for this consumer.</p>
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
         * <p>The risk level to apply to the specified consumer and risk type. For example: <code>low</code>, <code>medium</code>, or <code>high</code>.</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The match type for identifying the consumer. For example: <code>header</code> or <code>query</code>.</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The identifier of the consumer.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of risk to configure. For example: <code>profanity</code> or <code>spam</code>.</p>
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
         * <p>The location in the request to search for the <code>pattern</code>. For example: <code>header</code> or <code>query</code>.</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>The pattern for matching a consumer. This can be a regular expression.</p>
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
         * <p>Contains rules that override the default settings for specific consumers.</p>
         */
        @NameInMap("consumerRules")
        public AiSecurityGuardConfigRiskConfigConsumerRules consumerRules;

        /**
         * <p>The default risk level for this risk type. For example: <code>low</code>, <code>medium</code>, or <code>high</code>.</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The type of risk to configure. For example: <code>profanity</code> or <code>spam</code>.</p>
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
