// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiServiceConfig extends TeaModel {
    /**
     * <p>The generation mode of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("ApiKeyGenerateMode")
    public String apiKeyGenerateMode;

    /**
     * <p>The service address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyun.com">https://dashscope.aliyun.com</a></p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The configuration for API key failure ejection and recovery.</p>
     */
    @NameInMap("apiKeyFailover")
    public AiServiceConfigApiKeyFailover apiKeyFailover;

    /**
     * <p>The read-only summary of KMS reference names, excluding credential values.</p>
     */
    @NameInMap("apiKeyReferences")
    public java.util.List<String> apiKeyReferences;

    /**
     * <p>The list of API keys.</p>
     */
    @NameInMap("apiKeys")
    public java.util.List<String> apiKeys;

    /**
     * <p>The name of the request header used to pass authentication credentials to the upstream.</p>
     * 
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("authHeaderKey")
    public String authHeaderKey;

    /**
     * <p>The Bedrock service-specific configuration.</p>
     */
    @NameInMap("bedrockServiceConfig")
    public AiServiceConfigBedrockServiceConfig bedrockServiceConfig;

    /**
     * <p>Specifies whether to enable Claude Code compatibility mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("claudeCodeMode")
    public Boolean claudeCodeMode;

    /**
     * <p>The list of compatible protocols supported by the service.</p>
     */
    @NameInMap("compatibleProtocols")
    public java.util.List<String> compatibleProtocols;

    /**
     * <p>The read-only service configuration version. Use expectedConfigRevision for conditional updates.</p>
     * 
     * <strong>example:</strong>
     * <p>7e4f52a9b0c34d16a268e913f5c2087b</p>
     */
    @NameInMap("configRevision")
    public String configRevision;

    /**
     * <p>The name of the default model.</p>
     * 
     * <strong>example:</strong>
     * <p>gpt-4</p>
     */
    @NameInMap("defaultModelName")
    public String defaultModelName;

    /**
     * <p>Specifies whether to enable health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableHealthCheck")
    public Boolean enableHealthCheck;

    /**
     * <p>Specifies whether to enable the outlier detection feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableOutlierDetection")
    public Boolean enableOutlierDetection;

    /**
     * <p>The authentication and token configuration specific to the KlingAI service.</p>
     */
    @NameInMap("klingServiceConfig")
    public AiServiceConfigKlingServiceConfig klingServiceConfig;

    /**
     * <p>The PAI-EAS service-specific configuration.</p>
     */
    @NameInMap("paiEASServiceConfig")
    public AiServiceConfigPaiEASServiceConfig paiEASServiceConfig;

    /**
     * <p>The list of model protocols.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The large language model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen
     * moonshot
     * baichuan
     * yi
     * zhipuai
     * 360ai
     * hunyuan
     * stepfun
     * spark
     * openai
     * claude
     * anthropic
     * doubao
     * minimax
     * gemini
     * azure
     * deepseek
     * custom
     * pai-eas
     * bedrock
     * vertex</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>The configuration for retrying with a different key after the current request fails.</p>
     */
    @NameInMap("retryOnFailure")
    public AiServiceConfigRetryOnFailure retryOnFailure;

    /**
     * <p>The upstream authentication mode, which distinguishes between API key authentication, no authentication, and pass-through downstream authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>api-key</p>
     */
    @NameInMap("upstreamAuthMode")
    public String upstreamAuthMode;

    /**
     * <p>The configuration information for the Vertex AI service.</p>
     */
    @NameInMap("vertexServiceConfig")
    public AiServiceConfigVertexServiceConfig vertexServiceConfig;

    public static AiServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        AiServiceConfig self = new AiServiceConfig();
        return TeaModel.build(map, self);
    }

    public AiServiceConfig setApiKeyGenerateMode(String apiKeyGenerateMode) {
        this.apiKeyGenerateMode = apiKeyGenerateMode;
        return this;
    }
    public String getApiKeyGenerateMode() {
        return this.apiKeyGenerateMode;
    }

    public AiServiceConfig setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AiServiceConfig setApiKeyFailover(AiServiceConfigApiKeyFailover apiKeyFailover) {
        this.apiKeyFailover = apiKeyFailover;
        return this;
    }
    public AiServiceConfigApiKeyFailover getApiKeyFailover() {
        return this.apiKeyFailover;
    }

    public AiServiceConfig setApiKeyReferences(java.util.List<String> apiKeyReferences) {
        this.apiKeyReferences = apiKeyReferences;
        return this;
    }
    public java.util.List<String> getApiKeyReferences() {
        return this.apiKeyReferences;
    }

    public AiServiceConfig setApiKeys(java.util.List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    public AiServiceConfig setAuthHeaderKey(String authHeaderKey) {
        this.authHeaderKey = authHeaderKey;
        return this;
    }
    public String getAuthHeaderKey() {
        return this.authHeaderKey;
    }

    public AiServiceConfig setBedrockServiceConfig(AiServiceConfigBedrockServiceConfig bedrockServiceConfig) {
        this.bedrockServiceConfig = bedrockServiceConfig;
        return this;
    }
    public AiServiceConfigBedrockServiceConfig getBedrockServiceConfig() {
        return this.bedrockServiceConfig;
    }

    public AiServiceConfig setClaudeCodeMode(Boolean claudeCodeMode) {
        this.claudeCodeMode = claudeCodeMode;
        return this;
    }
    public Boolean getClaudeCodeMode() {
        return this.claudeCodeMode;
    }

    public AiServiceConfig setCompatibleProtocols(java.util.List<String> compatibleProtocols) {
        this.compatibleProtocols = compatibleProtocols;
        return this;
    }
    public java.util.List<String> getCompatibleProtocols() {
        return this.compatibleProtocols;
    }

    public AiServiceConfig setConfigRevision(String configRevision) {
        this.configRevision = configRevision;
        return this;
    }
    public String getConfigRevision() {
        return this.configRevision;
    }

    public AiServiceConfig setDefaultModelName(String defaultModelName) {
        this.defaultModelName = defaultModelName;
        return this;
    }
    public String getDefaultModelName() {
        return this.defaultModelName;
    }

    public AiServiceConfig setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    public AiServiceConfig setEnableOutlierDetection(Boolean enableOutlierDetection) {
        this.enableOutlierDetection = enableOutlierDetection;
        return this;
    }
    public Boolean getEnableOutlierDetection() {
        return this.enableOutlierDetection;
    }

    public AiServiceConfig setKlingServiceConfig(AiServiceConfigKlingServiceConfig klingServiceConfig) {
        this.klingServiceConfig = klingServiceConfig;
        return this;
    }
    public AiServiceConfigKlingServiceConfig getKlingServiceConfig() {
        return this.klingServiceConfig;
    }

    public AiServiceConfig setPaiEASServiceConfig(AiServiceConfigPaiEASServiceConfig paiEASServiceConfig) {
        this.paiEASServiceConfig = paiEASServiceConfig;
        return this;
    }
    public AiServiceConfigPaiEASServiceConfig getPaiEASServiceConfig() {
        return this.paiEASServiceConfig;
    }

    public AiServiceConfig setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public AiServiceConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public AiServiceConfig setRetryOnFailure(AiServiceConfigRetryOnFailure retryOnFailure) {
        this.retryOnFailure = retryOnFailure;
        return this;
    }
    public AiServiceConfigRetryOnFailure getRetryOnFailure() {
        return this.retryOnFailure;
    }

    public AiServiceConfig setUpstreamAuthMode(String upstreamAuthMode) {
        this.upstreamAuthMode = upstreamAuthMode;
        return this;
    }
    public String getUpstreamAuthMode() {
        return this.upstreamAuthMode;
    }

    public AiServiceConfig setVertexServiceConfig(AiServiceConfigVertexServiceConfig vertexServiceConfig) {
        this.vertexServiceConfig = vertexServiceConfig;
        return this;
    }
    public AiServiceConfigVertexServiceConfig getVertexServiceConfig() {
        return this.vertexServiceConfig;
    }

    public static class AiServiceConfigApiKeyFailover extends TeaModel {
        /**
         * <p>The cooldown duration after an API key is ejected.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("cooldownDuration")
        public Long cooldownDuration;

        /**
         * <p>Specifies whether to enable API key failure ejection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The set of response status matching rules that trigger API key failure ejection.</p>
         */
        @NameInMap("failoverOnStatus")
        public java.util.List<String> failoverOnStatus;

        /**
         * <p>The failure count threshold that triggers API key ejection.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("failureThreshold")
        public Long failureThreshold;

        public static AiServiceConfigApiKeyFailover build(java.util.Map<String, ?> map) throws Exception {
            AiServiceConfigApiKeyFailover self = new AiServiceConfigApiKeyFailover();
            return TeaModel.build(map, self);
        }

        public AiServiceConfigApiKeyFailover setCooldownDuration(Long cooldownDuration) {
            this.cooldownDuration = cooldownDuration;
            return this;
        }
        public Long getCooldownDuration() {
            return this.cooldownDuration;
        }

        public AiServiceConfigApiKeyFailover setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AiServiceConfigApiKeyFailover setFailoverOnStatus(java.util.List<String> failoverOnStatus) {
            this.failoverOnStatus = failoverOnStatus;
            return this;
        }
        public java.util.List<String> getFailoverOnStatus() {
            return this.failoverOnStatus;
        }

        public AiServiceConfigApiKeyFailover setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

    }

    public static class AiServiceConfigBedrockServiceConfig extends TeaModel {
        /**
         * <p>The AWS access key.</p>
         * 
         * <strong>example:</strong>
         * <p>AKIAIOSFODNN7EXAMPLE</p>
         */
        @NameInMap("awsAccessKey")
        public String awsAccessKey;

        /**
         * <p>The AWS region.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("awsRegion")
        public String awsRegion;

        /**
         * <p>The AWS secret key.</p>
         * 
         * <strong>example:</strong>
         * <p>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</p>
         */
        @NameInMap("awsSecretKey")
        public String awsSecretKey;

        /**
         * <p>Configures whether to insert Bedrock cache markers based on prompt positions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;systemPrompt&quot;:true}</p>
         */
        @NameInMap("bedrockPromptCachePointPositions")
        public java.util.Map<String, Boolean> bedrockPromptCachePointPositions;

        /**
         * <p>The Bedrock service endpoint mode, which supports runtime and mantle. If omitted, runtime is used.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        @NameInMap("endpointMode")
        public String endpointMode;

        /**
         * <p>Specifies whether to enable prompt caching for the Bedrock upstream.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("promptCacheEnable")
        public Boolean promptCacheEnable;

        /**
         * <p>The data retention policy for the prompt cache.</p>
         * 
         * <strong>example:</strong>
         * <p>in_memory</p>
         */
        @NameInMap("promptCacheRetention")
        public String promptCacheRetention;

        /**
         * <p>The applicable model strategy for Bedrock prompt caching.</p>
         * 
         * <strong>example:</strong>
         * <p>supported_models_only</p>
         */
        @NameInMap("promptCacheStrategy")
        public String promptCacheStrategy;

        public static AiServiceConfigBedrockServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            AiServiceConfigBedrockServiceConfig self = new AiServiceConfigBedrockServiceConfig();
            return TeaModel.build(map, self);
        }

        public AiServiceConfigBedrockServiceConfig setAwsAccessKey(String awsAccessKey) {
            this.awsAccessKey = awsAccessKey;
            return this;
        }
        public String getAwsAccessKey() {
            return this.awsAccessKey;
        }

        public AiServiceConfigBedrockServiceConfig setAwsRegion(String awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }
        public String getAwsRegion() {
            return this.awsRegion;
        }

        public AiServiceConfigBedrockServiceConfig setAwsSecretKey(String awsSecretKey) {
            this.awsSecretKey = awsSecretKey;
            return this;
        }
        public String getAwsSecretKey() {
            return this.awsSecretKey;
        }

        public AiServiceConfigBedrockServiceConfig setBedrockPromptCachePointPositions(java.util.Map<String, Boolean> bedrockPromptCachePointPositions) {
            this.bedrockPromptCachePointPositions = bedrockPromptCachePointPositions;
            return this;
        }
        public java.util.Map<String, Boolean> getBedrockPromptCachePointPositions() {
            return this.bedrockPromptCachePointPositions;
        }

        public AiServiceConfigBedrockServiceConfig setEndpointMode(String endpointMode) {
            this.endpointMode = endpointMode;
            return this;
        }
        public String getEndpointMode() {
            return this.endpointMode;
        }

        public AiServiceConfigBedrockServiceConfig setPromptCacheEnable(Boolean promptCacheEnable) {
            this.promptCacheEnable = promptCacheEnable;
            return this;
        }
        public Boolean getPromptCacheEnable() {
            return this.promptCacheEnable;
        }

        public AiServiceConfigBedrockServiceConfig setPromptCacheRetention(String promptCacheRetention) {
            this.promptCacheRetention = promptCacheRetention;
            return this;
        }
        public String getPromptCacheRetention() {
            return this.promptCacheRetention;
        }

        public AiServiceConfigBedrockServiceConfig setPromptCacheStrategy(String promptCacheStrategy) {
            this.promptCacheStrategy = promptCacheStrategy;
            return this;
        }
        public String getPromptCacheStrategy() {
            return this.promptCacheStrategy;
        }

    }

    public static class AiServiceConfigKlingServiceConfig extends TeaModel {
        /**
         * <p>The KlingAI access key identifier. Examples use desensitized values.</p>
         * 
         * <strong>example:</strong>
         * <p>kling-access-key-****</p>
         */
        @NameInMap("klingAccessKey")
        public String klingAccessKey;

        /**
         * <p>The KlingAI secret key. Examples use desensitized values.</p>
         * 
         * <strong>example:</strong>
         * <p>kling-secret-key-****</p>
         */
        @NameInMap("klingSecretKey")
        public String klingSecretKey;

        /**
         * <p>The advance refresh configuration for KlingAI tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("klingTokenRefreshAhead")
        public Long klingTokenRefreshAhead;

        public static AiServiceConfigKlingServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            AiServiceConfigKlingServiceConfig self = new AiServiceConfigKlingServiceConfig();
            return TeaModel.build(map, self);
        }

        public AiServiceConfigKlingServiceConfig setKlingAccessKey(String klingAccessKey) {
            this.klingAccessKey = klingAccessKey;
            return this;
        }
        public String getKlingAccessKey() {
            return this.klingAccessKey;
        }

        public AiServiceConfigKlingServiceConfig setKlingSecretKey(String klingSecretKey) {
            this.klingSecretKey = klingSecretKey;
            return this;
        }
        public String getKlingSecretKey() {
            return this.klingSecretKey;
        }

        public AiServiceConfigKlingServiceConfig setKlingTokenRefreshAhead(Long klingTokenRefreshAhead) {
            this.klingTokenRefreshAhead = klingTokenRefreshAhead;
            return this;
        }
        public Long getKlingTokenRefreshAhead() {
            return this.klingTokenRefreshAhead;
        }

    }

    public static class AiServiceConfigPaiEASServiceConfig extends TeaModel {
        /**
         * <p>The connection type, which can be a private network (VPC) or a public network.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;public&quot;，&quot;private&quot;</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-cvaeb0um1hkqp79k72v0</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-ai-service</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb89d4de30042df4459442589664e00d</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static AiServiceConfigPaiEASServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            AiServiceConfigPaiEASServiceConfig self = new AiServiceConfigPaiEASServiceConfig();
            return TeaModel.build(map, self);
        }

        public AiServiceConfigPaiEASServiceConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public AiServiceConfigPaiEASServiceConfig setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AiServiceConfigPaiEASServiceConfig setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public AiServiceConfigPaiEASServiceConfig setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class AiServiceConfigRetryOnFailure extends TeaModel {
        /**
         * <p>Specifies whether to enable retries upon current request failure.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of retries for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("maxRetries")
        public Long maxRetries;

        /**
         * <p>The set of response status matching rules that trigger retries for the current request.</p>
         */
        @NameInMap("retryOnStatus")
        public java.util.List<String> retryOnStatus;

        /**
         * <p>The retry timeout configuration for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("retryTimeout")
        public Long retryTimeout;

        public static AiServiceConfigRetryOnFailure build(java.util.Map<String, ?> map) throws Exception {
            AiServiceConfigRetryOnFailure self = new AiServiceConfigRetryOnFailure();
            return TeaModel.build(map, self);
        }

        public AiServiceConfigRetryOnFailure setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AiServiceConfigRetryOnFailure setMaxRetries(Long maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Long getMaxRetries() {
            return this.maxRetries;
        }

        public AiServiceConfigRetryOnFailure setRetryOnStatus(java.util.List<String> retryOnStatus) {
            this.retryOnStatus = retryOnStatus;
            return this;
        }
        public java.util.List<String> getRetryOnStatus() {
            return this.retryOnStatus;
        }

        public AiServiceConfigRetryOnFailure setRetryTimeout(Long retryTimeout) {
            this.retryTimeout = retryTimeout;
            return this;
        }
        public Long getRetryTimeout() {
            return this.retryTimeout;
        }

    }

    public static class AiServiceConfigVertexServiceConfig extends TeaModel {
        /**
         * <p>The safety filtering level settings for the Gemini model.</p>
         */
        @NameInMap("geminiSafetySetting")
        public java.util.Map<String, String> geminiSafetySetting;

        /**
         * <p>The authentication key for Vertex AI.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;service_account\&quot;,\&quot;project_id\&quot;:\&quot;my-project\&quot;,\&quot;private_key\&quot;:\&quot;-----BEGIN PRIVATE KEY-----...\&quot;,\&quot;client_email\&quot;:\&quot;<a href="mailto:xxx@xxx.iam.gserviceaccount.com">xxx@xxx.iam.gserviceaccount.com</a>\&quot;,\&quot;token_uri\&quot;:\&quot;<a href="https://oauth2.googleapis.com/token%5C%5C%22%7D">https://oauth2.googleapis.com/token\\&quot;}</a></p>
         */
        @NameInMap("vertexAuthKey")
        public String vertexAuthKey;

        /**
         * <p>The authentication service name used by Vertex AI.</p>
         * 
         * <strong>example:</strong>
         * <p>google-oauth2</p>
         */
        @NameInMap("vertexAuthServiceName")
        public String vertexAuthServiceName;

        /**
         * <p>Specifies whether to use the OpenAI-compatible interface of Vertex AI.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("vertexOpenAICompatible")
        public Boolean vertexOpenAICompatible;

        /**
         * <p>The Google Cloud project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        @NameInMap("vertexProjectId")
        public String vertexProjectId;

        /**
         * <p>The Google Cloud region where the Vertex AI service is located.</p>
         * 
         * <strong>example:</strong>
         * <p>us-central1</p>
         */
        @NameInMap("vertexRegion")
        public String vertexRegion;

        /**
         * <p>The number of seconds before access token expiration to trigger an advance refresh.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("vertexTokenRefreshAhead")
        public Integer vertexTokenRefreshAhead;

        public static AiServiceConfigVertexServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            AiServiceConfigVertexServiceConfig self = new AiServiceConfigVertexServiceConfig();
            return TeaModel.build(map, self);
        }

        public AiServiceConfigVertexServiceConfig setGeminiSafetySetting(java.util.Map<String, String> geminiSafetySetting) {
            this.geminiSafetySetting = geminiSafetySetting;
            return this;
        }
        public java.util.Map<String, String> getGeminiSafetySetting() {
            return this.geminiSafetySetting;
        }

        public AiServiceConfigVertexServiceConfig setVertexAuthKey(String vertexAuthKey) {
            this.vertexAuthKey = vertexAuthKey;
            return this;
        }
        public String getVertexAuthKey() {
            return this.vertexAuthKey;
        }

        public AiServiceConfigVertexServiceConfig setVertexAuthServiceName(String vertexAuthServiceName) {
            this.vertexAuthServiceName = vertexAuthServiceName;
            return this;
        }
        public String getVertexAuthServiceName() {
            return this.vertexAuthServiceName;
        }

        public AiServiceConfigVertexServiceConfig setVertexOpenAICompatible(Boolean vertexOpenAICompatible) {
            this.vertexOpenAICompatible = vertexOpenAICompatible;
            return this;
        }
        public Boolean getVertexOpenAICompatible() {
            return this.vertexOpenAICompatible;
        }

        public AiServiceConfigVertexServiceConfig setVertexProjectId(String vertexProjectId) {
            this.vertexProjectId = vertexProjectId;
            return this;
        }
        public String getVertexProjectId() {
            return this.vertexProjectId;
        }

        public AiServiceConfigVertexServiceConfig setVertexRegion(String vertexRegion) {
            this.vertexRegion = vertexRegion;
            return this;
        }
        public String getVertexRegion() {
            return this.vertexRegion;
        }

        public AiServiceConfigVertexServiceConfig setVertexTokenRefreshAhead(Integer vertexTokenRefreshAhead) {
            this.vertexTokenRefreshAhead = vertexTokenRefreshAhead;
            return this;
        }
        public Integer getVertexTokenRefreshAhead() {
            return this.vertexTokenRefreshAhead;
        }

    }

}
