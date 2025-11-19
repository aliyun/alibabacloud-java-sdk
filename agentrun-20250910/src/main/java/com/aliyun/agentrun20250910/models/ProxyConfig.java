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

    public static class ProxyConfigPolicies extends TeaModel {
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

        public static ProxyConfigPolicies build(java.util.Map<String, ?> map) throws Exception {
            ProxyConfigPolicies self = new ProxyConfigPolicies();
            return TeaModel.build(map, self);
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

    }

}
