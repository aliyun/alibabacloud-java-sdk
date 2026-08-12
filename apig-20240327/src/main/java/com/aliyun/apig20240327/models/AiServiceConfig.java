// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiServiceConfig extends TeaModel {
    /**
     * <p>API key generation mode.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ApiKeyGenerateMode")
    public String apiKeyGenerateMode;

    /**
     * <p>The service endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyun.com">https://dashscope.aliyun.com</a></p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>The API keys.</p>
     */
    @NameInMap("apiKeys")
    public java.util.List<String> apiKeys;

    /**
     * <p>Bedrock service configuration.</p>
     */
    @NameInMap("bedrockServiceConfig")
    public AiServiceConfigBedrockServiceConfig bedrockServiceConfig;

    /**
     * <p>Supported compatible protocols.</p>
     */
    @NameInMap("compatibleProtocols")
    public java.util.List<String> compatibleProtocols;

    /**
     * <p>Default model name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-turbo</p>
     */
    @NameInMap("defaultModelName")
    public String defaultModelName;

    /**
     * <p>Specifies whether to enable health check.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableHealthCheck")
    public Boolean enableHealthCheck;

    /**
     * <p>Enable outlier detection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableOutlierDetection")
    public Boolean enableOutlierDetection;

    /**
     * <p>PAI-EAS service configuration settings.</p>
     */
    @NameInMap("paiEASServiceConfig")
    public AiServiceConfigPaiEASServiceConfig paiEASServiceConfig;

    /**
     * <p>The LLM protocols.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The Large Language Model (LLM) provider.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("provider")
    public String provider;

    /**
     * <p>Vertex AI service configuration.</p>
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

    public AiServiceConfig setApiKeys(java.util.List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    public AiServiceConfig setBedrockServiceConfig(AiServiceConfigBedrockServiceConfig bedrockServiceConfig) {
        this.bedrockServiceConfig = bedrockServiceConfig;
        return this;
    }
    public AiServiceConfigBedrockServiceConfig getBedrockServiceConfig() {
        return this.bedrockServiceConfig;
    }

    public AiServiceConfig setCompatibleProtocols(java.util.List<String> compatibleProtocols) {
        this.compatibleProtocols = compatibleProtocols;
        return this;
    }
    public java.util.List<String> getCompatibleProtocols() {
        return this.compatibleProtocols;
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

    public AiServiceConfig setVertexServiceConfig(AiServiceConfigVertexServiceConfig vertexServiceConfig) {
        this.vertexServiceConfig = vertexServiceConfig;
        return this;
    }
    public AiServiceConfigVertexServiceConfig getVertexServiceConfig() {
        return this.vertexServiceConfig;
    }

    public static class AiServiceConfigBedrockServiceConfig extends TeaModel {
        /**
         * <p>AWS-AccessKey</p>
         * 
         * <strong>example:</strong>
         * <p>AKIAIOSFODNN7EXAMPLE</p>
         */
        @NameInMap("awsAccessKey")
        public String awsAccessKey;

        /**
         * <p>AWS-Region</p>
         * 
         * <strong>example:</strong>
         * <p>us-west-2</p>
         */
        @NameInMap("awsRegion")
        public String awsRegion;

        /**
         * <p>AWS-SecretKey</p>
         * 
         * <strong>example:</strong>
         * <p>wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY</p>
         */
        @NameInMap("awsSecretKey")
        public String awsSecretKey;

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

    }

    public static class AiServiceConfigPaiEASServiceConfig extends TeaModel {
        /**
         * <p>Type of endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;public&quot;，&quot;private&quot;</p>
         */
        @NameInMap("endpointType")
        public String endpointType;

        /**
         * <p>Service identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-d33onfmm1hkn5duhuqjg</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-hello</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>Workspace identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>plw-d5g7qsem1hkmih54g210</p>
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

    public static class AiServiceConfigVertexServiceConfig extends TeaModel {
        /**
         * <p>Gemini safety settings.</p>
         */
        @NameInMap("geminiSafetySetting")
        public java.util.Map<String, String> geminiSafetySetting;

        /**
         * <p>Vertex AI authentication key.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;service_account\&quot;,\&quot;project_id\&quot;:\&quot;xxx\&quot;,\&quot;private_key\&quot;:\&quot;-----BEGIN PRIVATE KEY-----\&quot;,\&quot;client_email\&quot;:\&quot;<a href="mailto:xxx@xxx.iam.gserviceaccount.com">xxx@xxx.iam.gserviceaccount.com</a>\&quot;,\&quot;token_uri\&quot;:\&quot;<a href="https://oauth2.googleapis.com/token%5C%5C%22%7D">https://oauth2.googleapis.com/token\\&quot;}</a></p>
         */
        @NameInMap("vertexAuthKey")
        public String vertexAuthKey;

        /**
         * <p>Vertex AI auth service name.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-vertex-auth</p>
         */
        @NameInMap("vertexAuthServiceName")
        public String vertexAuthServiceName;

        /**
         * <p>Vertex AI project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>my-gcp-project-123</p>
         */
        @NameInMap("vertexProjectId")
        public String vertexProjectId;

        /**
         * <p>Vertex AI region.</p>
         * 
         * <strong>example:</strong>
         * <p>us-central1</p>
         */
        @NameInMap("vertexRegion")
        public String vertexRegion;

        /**
         * <p>Vertex token refresh lead time.</p>
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
