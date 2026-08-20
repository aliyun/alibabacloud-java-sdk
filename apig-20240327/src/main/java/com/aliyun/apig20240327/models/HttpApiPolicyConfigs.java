// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiPolicyConfigs extends TeaModel {
    /**
     * <p>The AI cache configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("aiCacheConfig")
    public AiCacheConfig aiCacheConfig;

    /**
     * <p>The AI fallback configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("aiFallbackConfig")
    public AiFallbackConfig aiFallbackConfig;

    /**
     * <p>The AI web search configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("aiNetworkSearchConfig")
    public AiNetworkSearchConfig aiNetworkSearchConfig;

    /**
     * <p>The AI security protection configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("aiSecurityGuardConfig")
    public AiSecurityGuardConfig aiSecurityGuardConfig;

    /**
     * <p>The AI statistics configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("aiStatisticsConfig")
    public AiStatisticsConfig aiStatisticsConfig;

    /**
     * <p>The AI token rate limiting configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("aiTokenRateLimitConfig")
    @Deprecated
    public AiTokenRateLimitConfig aiTokenRateLimitConfig;

    /**
     * <p>The AI tool selection configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("aiToolSelectionConfig")
    public AiToolSelectionConfig aiToolSelectionConfig;

    /**
     * <p>Indicates whether the policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The read-only compatible reference. GetHttpApi returns policyId/policyAttachmentId for ModelAPI AiTokenRateLimit. This must be stripped before write path persistence and is not used as a bind/unbind instruction.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("policyReference")
    public HttpApiPolicyReference policyReference;

    /**
     * <p>The semantic routing configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("semanticRouterConfig")
    public HttpApiPolicyConfigsSemanticRouterConfig semanticRouterConfig;

    /**
     * <p>The policy template type.</p>
     * 
     * <strong>example:</strong>
     * <p>K8S</p>
     */
    @NameInMap("type")
    public String type;

    public static HttpApiPolicyConfigs build(java.util.Map<String, ?> map) throws Exception {
        HttpApiPolicyConfigs self = new HttpApiPolicyConfigs();
        return TeaModel.build(map, self);
    }

    public HttpApiPolicyConfigs setAiCacheConfig(AiCacheConfig aiCacheConfig) {
        this.aiCacheConfig = aiCacheConfig;
        return this;
    }
    public AiCacheConfig getAiCacheConfig() {
        return this.aiCacheConfig;
    }

    public HttpApiPolicyConfigs setAiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
        this.aiFallbackConfig = aiFallbackConfig;
        return this;
    }
    public AiFallbackConfig getAiFallbackConfig() {
        return this.aiFallbackConfig;
    }

    public HttpApiPolicyConfigs setAiNetworkSearchConfig(AiNetworkSearchConfig aiNetworkSearchConfig) {
        this.aiNetworkSearchConfig = aiNetworkSearchConfig;
        return this;
    }
    public AiNetworkSearchConfig getAiNetworkSearchConfig() {
        return this.aiNetworkSearchConfig;
    }

    public HttpApiPolicyConfigs setAiSecurityGuardConfig(AiSecurityGuardConfig aiSecurityGuardConfig) {
        this.aiSecurityGuardConfig = aiSecurityGuardConfig;
        return this;
    }
    public AiSecurityGuardConfig getAiSecurityGuardConfig() {
        return this.aiSecurityGuardConfig;
    }

    public HttpApiPolicyConfigs setAiStatisticsConfig(AiStatisticsConfig aiStatisticsConfig) {
        this.aiStatisticsConfig = aiStatisticsConfig;
        return this;
    }
    public AiStatisticsConfig getAiStatisticsConfig() {
        return this.aiStatisticsConfig;
    }

    @Deprecated
    public HttpApiPolicyConfigs setAiTokenRateLimitConfig(AiTokenRateLimitConfig aiTokenRateLimitConfig) {
        this.aiTokenRateLimitConfig = aiTokenRateLimitConfig;
        return this;
    }
    public AiTokenRateLimitConfig getAiTokenRateLimitConfig() {
        return this.aiTokenRateLimitConfig;
    }

    public HttpApiPolicyConfigs setAiToolSelectionConfig(AiToolSelectionConfig aiToolSelectionConfig) {
        this.aiToolSelectionConfig = aiToolSelectionConfig;
        return this;
    }
    public AiToolSelectionConfig getAiToolSelectionConfig() {
        return this.aiToolSelectionConfig;
    }

    public HttpApiPolicyConfigs setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public HttpApiPolicyConfigs setPolicyReference(HttpApiPolicyReference policyReference) {
        this.policyReference = policyReference;
        return this;
    }
    public HttpApiPolicyReference getPolicyReference() {
        return this.policyReference;
    }

    public HttpApiPolicyConfigs setSemanticRouterConfig(HttpApiPolicyConfigsSemanticRouterConfig semanticRouterConfig) {
        this.semanticRouterConfig = semanticRouterConfig;
        return this;
    }
    public HttpApiPolicyConfigsSemanticRouterConfig getSemanticRouterConfig() {
        return this.semanticRouterConfig;
    }

    public HttpApiPolicyConfigs setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class HttpApiPolicyConfigsSemanticRouterConfig extends TeaModel {
        /**
         * <p>The timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static HttpApiPolicyConfigsSemanticRouterConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsSemanticRouterConfig self = new HttpApiPolicyConfigsSemanticRouterConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsSemanticRouterConfig setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

}
