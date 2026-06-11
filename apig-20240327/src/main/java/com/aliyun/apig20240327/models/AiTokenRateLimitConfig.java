// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiTokenRateLimitConfig extends TeaModel {
    /**
     * <p>Controls whether global rules are enabled. If set to <code>true</code>, the rules in <code>globalRules</code> are applied. Defaults to <code>false</code>.</p>
     */
    @NameInMap("enableGlobalRules")
    public Boolean enableGlobalRules;

    /**
     * <p>A list of global rate limit rules. These rules are applied when no specific rule in <code>rules</code> is matched.</p>
     */
    @NameInMap("globalRules")
    public java.util.List<AiTokenRateLimitConfigRule> globalRules;

    /**
     * <p>Specifies the status of the plugin, such as <code>enabled</code> or <code>disabled</code>.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>Specifies the Redis configuration for distributed rate limiting.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("redisConfig")
    public AiPolicyRedisConfig redisConfig;

    /**
     * <p>A list of specific rate limit rules.</p>
     */
    @NameInMap("rules")
    public java.util.List<AiTokenRateLimitConfigRule> rules;

    public static AiTokenRateLimitConfig build(java.util.Map<String, ?> map) throws Exception {
        AiTokenRateLimitConfig self = new AiTokenRateLimitConfig();
        return TeaModel.build(map, self);
    }

    public AiTokenRateLimitConfig setEnableGlobalRules(Boolean enableGlobalRules) {
        this.enableGlobalRules = enableGlobalRules;
        return this;
    }
    public Boolean getEnableGlobalRules() {
        return this.enableGlobalRules;
    }

    public AiTokenRateLimitConfig setGlobalRules(java.util.List<AiTokenRateLimitConfigRule> globalRules) {
        this.globalRules = globalRules;
        return this;
    }
    public java.util.List<AiTokenRateLimitConfigRule> getGlobalRules() {
        return this.globalRules;
    }

    public AiTokenRateLimitConfig setPluginStatus(AiPluginStatus pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    public AiTokenRateLimitConfig setRedisConfig(AiPolicyRedisConfig redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }
    public AiPolicyRedisConfig getRedisConfig() {
        return this.redisConfig;
    }

    public AiTokenRateLimitConfig setRules(java.util.List<AiTokenRateLimitConfigRule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<AiTokenRateLimitConfigRule> getRules() {
        return this.rules;
    }

}
