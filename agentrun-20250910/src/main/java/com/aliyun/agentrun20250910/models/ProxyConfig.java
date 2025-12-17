// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ProxyConfig extends TeaModel {
    @NameInMap("endpoints")
    public java.util.List<ProxyConfigEndpoints> endpoints;

    @NameInMap("policies")
    public ProxyConfigPolicies policies;

    public static ProxyConfig build(java.util.Map<String, ?> map) throws Exception {
        ProxyConfig self = new ProxyConfig();
        return TeaModel.build(map, self);
    }

    public ProxyConfig setEndpoints(java.util.List<ProxyConfigEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ProxyConfigEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ProxyConfig setPolicies(ProxyConfigPolicies policies) {
        this.policies = policies;
        return this;
    }
    public ProxyConfigPolicies getPolicies() {
        return this.policies;
    }

    public static class ProxyConfigEndpoints extends TeaModel {
        @NameInMap("baseUrl")
        public String baseUrl;

        @NameInMap("modelNames")
        public java.util.List<String> modelNames;

        @NameInMap("modelServiceName")
        public String modelServiceName;

        @NameInMap("weight")
        public Integer weight;

        public static ProxyConfigEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ProxyConfigEndpoints self = new ProxyConfigEndpoints();
            return TeaModel.build(map, self);
        }

        public ProxyConfigEndpoints setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public ProxyConfigEndpoints setModelNames(java.util.List<String> modelNames) {
            this.modelNames = modelNames;
            return this;
        }
        public java.util.List<String> getModelNames() {
            return this.modelNames;
        }

        public ProxyConfigEndpoints setModelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        public ProxyConfigEndpoints setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ProxyConfigPoliciesAiGuardrailConfig extends TeaModel {
        @NameInMap("blockOnContentModeration")
        public Boolean blockOnContentModeration;

        @NameInMap("blockOnMaliciousUrl")
        public Boolean blockOnMaliciousUrl;

        @NameInMap("blockOnModelHallucination")
        public Boolean blockOnModelHallucination;

        @NameInMap("blockOnPromptAttack")
        public Boolean blockOnPromptAttack;

        @NameInMap("blockOnSensitiveData")
        public Boolean blockOnSensitiveData;

        @NameInMap("checkRequest")
        public Boolean checkRequest;

        @NameInMap("checkResponse")
        public Boolean checkResponse;

        @NameInMap("level")
        public String level;

        @NameInMap("maxTextLength")
        public Integer maxTextLength;

        public static ProxyConfigPoliciesAiGuardrailConfig build(java.util.Map<String, ?> map) throws Exception {
            ProxyConfigPoliciesAiGuardrailConfig self = new ProxyConfigPoliciesAiGuardrailConfig();
            return TeaModel.build(map, self);
        }

        public ProxyConfigPoliciesAiGuardrailConfig setBlockOnContentModeration(Boolean blockOnContentModeration) {
            this.blockOnContentModeration = blockOnContentModeration;
            return this;
        }
        public Boolean getBlockOnContentModeration() {
            return this.blockOnContentModeration;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setBlockOnMaliciousUrl(Boolean blockOnMaliciousUrl) {
            this.blockOnMaliciousUrl = blockOnMaliciousUrl;
            return this;
        }
        public Boolean getBlockOnMaliciousUrl() {
            return this.blockOnMaliciousUrl;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setBlockOnModelHallucination(Boolean blockOnModelHallucination) {
            this.blockOnModelHallucination = blockOnModelHallucination;
            return this;
        }
        public Boolean getBlockOnModelHallucination() {
            return this.blockOnModelHallucination;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setBlockOnPromptAttack(Boolean blockOnPromptAttack) {
            this.blockOnPromptAttack = blockOnPromptAttack;
            return this;
        }
        public Boolean getBlockOnPromptAttack() {
            return this.blockOnPromptAttack;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setBlockOnSensitiveData(Boolean blockOnSensitiveData) {
            this.blockOnSensitiveData = blockOnSensitiveData;
            return this;
        }
        public Boolean getBlockOnSensitiveData() {
            return this.blockOnSensitiveData;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setCheckRequest(Boolean checkRequest) {
            this.checkRequest = checkRequest;
            return this;
        }
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setCheckResponse(Boolean checkResponse) {
            this.checkResponse = checkResponse;
            return this;
        }
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ProxyConfigPoliciesAiGuardrailConfig setMaxTextLength(Integer maxTextLength) {
            this.maxTextLength = maxTextLength;
            return this;
        }
        public Integer getMaxTextLength() {
            return this.maxTextLength;
        }

    }

    public static class ProxyConfigPoliciesFallbacks extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("modelServiceName")
        public String modelServiceName;

        public static ProxyConfigPoliciesFallbacks build(java.util.Map<String, ?> map) throws Exception {
            ProxyConfigPoliciesFallbacks self = new ProxyConfigPoliciesFallbacks();
            return TeaModel.build(map, self);
        }

        public ProxyConfigPoliciesFallbacks setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ProxyConfigPoliciesFallbacks setModelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }
        public String getModelServiceName() {
            return this.modelServiceName;
        }

    }

    public static class ProxyConfigPoliciesTokenRateLimiter extends TeaModel {
        @NameInMap("tpd")
        public Integer tpd;

        @NameInMap("tph")
        public Integer tph;

        @NameInMap("tpm")
        public Integer tpm;

        @NameInMap("tps")
        public Integer tps;

        public static ProxyConfigPoliciesTokenRateLimiter build(java.util.Map<String, ?> map) throws Exception {
            ProxyConfigPoliciesTokenRateLimiter self = new ProxyConfigPoliciesTokenRateLimiter();
            return TeaModel.build(map, self);
        }

        public ProxyConfigPoliciesTokenRateLimiter setTpd(Integer tpd) {
            this.tpd = tpd;
            return this;
        }
        public Integer getTpd() {
            return this.tpd;
        }

        public ProxyConfigPoliciesTokenRateLimiter setTph(Integer tph) {
            this.tph = tph;
            return this;
        }
        public Integer getTph() {
            return this.tph;
        }

        public ProxyConfigPoliciesTokenRateLimiter setTpm(Integer tpm) {
            this.tpm = tpm;
            return this;
        }
        public Integer getTpm() {
            return this.tpm;
        }

        public ProxyConfigPoliciesTokenRateLimiter setTps(Integer tps) {
            this.tps = tps;
            return this;
        }
        public Integer getTps() {
            return this.tps;
        }

    }

    public static class ProxyConfigPolicies extends TeaModel {
        @NameInMap("aiGuardrailConfig")
        public ProxyConfigPoliciesAiGuardrailConfig aiGuardrailConfig;

        @NameInMap("cache")
        public Boolean cache;

        @NameInMap("concurrencyLimit")
        public Integer concurrencyLimit;

        @NameInMap("fallbacks")
        public java.util.List<ProxyConfigPoliciesFallbacks> fallbacks;

        @NameInMap("numRetries")
        public Integer numRetries;

        @NameInMap("requestTimeout")
        public Integer requestTimeout;

        @NameInMap("tokenRateLimiter")
        public ProxyConfigPoliciesTokenRateLimiter tokenRateLimiter;

        public static ProxyConfigPolicies build(java.util.Map<String, ?> map) throws Exception {
            ProxyConfigPolicies self = new ProxyConfigPolicies();
            return TeaModel.build(map, self);
        }

        public ProxyConfigPolicies setAiGuardrailConfig(ProxyConfigPoliciesAiGuardrailConfig aiGuardrailConfig) {
            this.aiGuardrailConfig = aiGuardrailConfig;
            return this;
        }
        public ProxyConfigPoliciesAiGuardrailConfig getAiGuardrailConfig() {
            return this.aiGuardrailConfig;
        }

        public ProxyConfigPolicies setCache(Boolean cache) {
            this.cache = cache;
            return this;
        }
        public Boolean getCache() {
            return this.cache;
        }

        public ProxyConfigPolicies setConcurrencyLimit(Integer concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }
        public Integer getConcurrencyLimit() {
            return this.concurrencyLimit;
        }

        public ProxyConfigPolicies setFallbacks(java.util.List<ProxyConfigPoliciesFallbacks> fallbacks) {
            this.fallbacks = fallbacks;
            return this;
        }
        public java.util.List<ProxyConfigPoliciesFallbacks> getFallbacks() {
            return this.fallbacks;
        }

        public ProxyConfigPolicies setNumRetries(Integer numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        public Integer getNumRetries() {
            return this.numRetries;
        }

        public ProxyConfigPolicies setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public ProxyConfigPolicies setTokenRateLimiter(ProxyConfigPoliciesTokenRateLimiter tokenRateLimiter) {
            this.tokenRateLimiter = tokenRateLimiter;
            return this;
        }
        public ProxyConfigPoliciesTokenRateLimiter getTokenRateLimiter() {
            return this.tokenRateLimiter;
        }

    }

}
