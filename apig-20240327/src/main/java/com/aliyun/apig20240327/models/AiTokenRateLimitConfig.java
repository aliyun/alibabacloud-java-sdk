// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiTokenRateLimitConfig extends TeaModel {
    @NameInMap("enableGlobalRules")
    public Boolean enableGlobalRules;

    @NameInMap("globalRules")
    public java.util.List<AiTokenRateLimitConfigRule> globalRules;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("redisConfig")
    public AiPolicyRedisConfig redisConfig;

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
