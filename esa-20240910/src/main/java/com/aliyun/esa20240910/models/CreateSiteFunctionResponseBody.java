// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteFunctionResponseBody extends TeaModel {
    @NameInMap("Configs")
    public CreateSiteFunctionResponseBodyConfigs configs;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSiteFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteFunctionResponseBody self = new CreateSiteFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteFunctionResponseBody setConfigs(CreateSiteFunctionResponseBodyConfigs configs) {
        this.configs = configs;
        return this;
    }
    public CreateSiteFunctionResponseBodyConfigs getConfigs() {
        return this.configs;
    }

    public CreateSiteFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSiteFunctionResponseBodyConfigsCacheReserve extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateSiteFunctionResponseBodyConfigsCacheReserve build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCacheReserve self = new CreateSiteFunctionResponseBodyConfigsCacheReserve();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCacheReserve setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheReserve setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheReserve setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCacheRules extends TeaModel {
        @NameInMap("AdditionalCacheablePorts")
        public String additionalCacheablePorts;

        @NameInMap("BrowserCacheMode")
        public String browserCacheMode;

        @NameInMap("BrowserCacheTtl")
        public String browserCacheTtl;

        @NameInMap("BypassCache")
        public String bypassCache;

        @NameInMap("CacheDeceptionArmor")
        public String cacheDeceptionArmor;

        @NameInMap("CacheReserveEligibility")
        public String cacheReserveEligibility;

        @NameInMap("CheckPresenceCookie")
        public String checkPresenceCookie;

        @NameInMap("CheckPresenceHeader")
        public String checkPresenceHeader;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("EdgeCacheMode")
        public String edgeCacheMode;

        @NameInMap("EdgeCacheTtl")
        public String edgeCacheTtl;

        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        @NameInMap("IncludeCookie")
        public String includeCookie;

        @NameInMap("IncludeHeader")
        public String includeHeader;

        @NameInMap("QueryString")
        public String queryString;

        @NameInMap("QueryStringMode")
        public String queryStringMode;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("ServeStale")
        public String serveStale;

        @NameInMap("SortQueryStringForCache")
        public String sortQueryStringForCache;

        @NameInMap("UserDeviceType")
        public String userDeviceType;

        @NameInMap("UserGeo")
        public String userGeo;

        @NameInMap("UserLanguage")
        public String userLanguage;

        public static CreateSiteFunctionResponseBodyConfigsCacheRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCacheRules self = new CreateSiteFunctionResponseBodyConfigsCacheRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setAdditionalCacheablePorts(String additionalCacheablePorts) {
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setBrowserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setBrowserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setBypassCache(String bypassCache) {
            this.bypassCache = bypassCache;
            return this;
        }
        public String getBypassCache() {
            return this.bypassCache;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCacheDeceptionArmor(String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCacheReserveEligibility(String cacheReserveEligibility) {
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCheckPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCheckPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setEdgeCacheMode(String edgeCacheMode) {
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setEdgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setIncludeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setIncludeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setQueryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
            return this;
        }
        public String getQueryStringMode() {
            return this.queryStringMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setServeStale(String serveStale) {
            this.serveStale = serveStale;
            return this;
        }
        public String getServeStale() {
            return this.serveStale;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setSortQueryStringForCache(String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setUserDeviceType(String userDeviceType) {
            this.userDeviceType = userDeviceType;
            return this;
        }
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setUserGeo(String userGeo) {
            this.userGeo = userGeo;
            return this;
        }
        public String getUserGeo() {
            return this.userGeo;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setUserLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }
        public String getUserLanguage() {
            return this.userLanguage;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCacheTags extends TeaModel {
        @NameInMap("CaseInsensitive")
        public String caseInsensitive;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("TagName")
        public String tagName;

        public static CreateSiteFunctionResponseBodyConfigsCacheTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCacheTags self = new CreateSiteFunctionResponseBodyConfigsCacheTags();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setCaseInsensitive(String caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public String getCaseInsensitive() {
            return this.caseInsensitive;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCnameFlattening extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("FlattenMode")
        public String flattenMode;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsCnameFlattening build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCnameFlattening self = new CreateSiteFunctionResponseBodyConfigsCnameFlattening();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCnameFlattening setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCnameFlattening setFlattenMode(String flattenMode) {
            this.flattenMode = flattenMode;
            return this;
        }
        public String getFlattenMode() {
            return this.flattenMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCnameFlattening setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCompressionRules extends TeaModel {
        @NameInMap("Brotli")
        public String brotli;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Gzip")
        public String gzip;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsCompressionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCompressionRules self = new CreateSiteFunctionResponseBodyConfigsCompressionRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setBrotli(String brotli) {
            this.brotli = brotli;
            return this;
        }
        public String getBrotli() {
            return this.brotli;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization self = new CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsDevelopmentMode extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsDevelopmentMode build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsDevelopmentMode self = new CreateSiteFunctionResponseBodyConfigsDevelopmentMode();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsDevelopmentMode setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsDevelopmentMode setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsDevelopmentMode setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification self = new CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("RequestHeaderModification")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules self = new CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRequestHeaderModification(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification self = new CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ResponseHeaderModification")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules self = new CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setResponseHeaderModification(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration extends TeaModel {
        @NameInMap("AltSvc")
        public String altSvc;

        @NameInMap("AltSvcClear")
        public String altSvcClear;

        @NameInMap("AltSvcMa")
        public String altSvcMa;

        @NameInMap("AltSvcPersist")
        public String altSvcPersist;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Hsts")
        public String hsts;

        @NameInMap("HstsIncludeSubdomains")
        public String hstsIncludeSubdomains;

        @NameInMap("HstsMaxAge")
        public String hstsMaxAge;

        @NameInMap("HstsPreload")
        public String hstsPreload;

        @NameInMap("HttpsForce")
        public String httpsForce;

        @NameInMap("HttpsForceCode")
        public String httpsForceCode;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration self = new CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }
        public String getAltSvc() {
            return this.altSvc;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }
        public String getAltSvcClear() {
            return this.altSvcClear;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }
        public String getAltSvcMa() {
            return this.altSvcMa;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
        }
        public String getAltSvcPersist() {
            return this.altSvcPersist;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHsts(String hsts) {
            this.hsts = hsts;
            return this;
        }
        public String getHsts() {
            return this.hsts;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }
        public String getHstsIncludeSubdomains() {
            return this.hstsIncludeSubdomains;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public String getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public String getHstsPreload() {
            return this.hstsPreload;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHttpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }
        public String getHttpsForce() {
            return this.httpsForce;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHttpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
            return this;
        }
        public String getHttpsForceCode() {
            return this.httpsForceCode;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration extends TeaModel {
        @NameInMap("Ciphersuite")
        public String ciphersuite;

        @NameInMap("CiphersuiteGroup")
        public String ciphersuiteGroup;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Http2")
        public String http2;

        @NameInMap("Http3")
        public String http3;

        @NameInMap("Https")
        public String https;

        @NameInMap("OcspStapling")
        public String ocspStapling;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("Tls10")
        public String tls10;

        @NameInMap("Tls11")
        public String tls11;

        @NameInMap("Tls12")
        public String tls12;

        @NameInMap("Tls13")
        public String tls13;

        public static CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration self = new CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setCiphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setCiphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setHttp3(String http3) {
            this.http3 = http3;
            return this;
        }
        public String getHttp3() {
            return this.http3;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setHttps(String https) {
            this.https = https;
            return this;
        }
        public String getHttps() {
            return this.https;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setOcspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
            return this;
        }
        public String getOcspStapling() {
            return this.ocspStapling;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }
        public String getTls10() {
            return this.tls10;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }
        public String getTls11() {
            return this.tls11;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }
        public String getTls12() {
            return this.tls12;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public String getTls13() {
            return this.tls13;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsImageTransform extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsImageTransform build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsImageTransform self = new CreateSiteFunctionResponseBodyConfigsImageTransform();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsImageTransform setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsImageTransform setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsImageTransform setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsIpv6 extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsIpv6 build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsIpv6 self = new CreateSiteFunctionResponseBodyConfigsIpv6();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsIpv6 setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsIpv6 setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsIpv6 setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsManagedTransforms extends TeaModel {
        @NameInMap("AddClientGeolocationHeaders")
        public String addClientGeolocationHeaders;

        @NameInMap("AddRealClientIpHeader")
        public String addRealClientIpHeader;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsManagedTransforms build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsManagedTransforms self = new CreateSiteFunctionResponseBodyConfigsManagedTransforms();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setAddClientGeolocationHeaders(String addClientGeolocationHeaders) {
            this.addClientGeolocationHeaders = addClientGeolocationHeaders;
            return this;
        }
        public String getAddClientGeolocationHeaders() {
            return this.addClientGeolocationHeaders;
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setAddRealClientIpHeader(String addRealClientIpHeader) {
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }
        public String getAddRealClientIpHeader() {
            return this.addRealClientIpHeader;
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsNetworkOptimization extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Grpc")
        public String grpc;

        @NameInMap("Http2Origin")
        public String http2Origin;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("SmartRouting")
        public String smartRouting;

        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

        @NameInMap("Websocket")
        public String websocket;

        public static CreateSiteFunctionResponseBodyConfigsNetworkOptimization build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsNetworkOptimization self = new CreateSiteFunctionResponseBodyConfigsNetworkOptimization();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setGrpc(String grpc) {
            this.grpc = grpc;
            return this;
        }
        public String getGrpc() {
            return this.grpc;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setHttp2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setSmartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }
        public String getSmartRouting() {
            return this.smartRouting;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setUploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setWebsocket(String websocket) {
            this.websocket = websocket;
            return this;
        }
        public String getWebsocket() {
            return this.websocket;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsOriginRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("DnsRecord")
        public String dnsRecord;

        @NameInMap("OriginHost")
        public String originHost;

        @NameInMap("OriginHttpPort")
        public String originHttpPort;

        @NameInMap("OriginHttpsPort")
        public String originHttpsPort;

        @NameInMap("OriginScheme")
        public String originScheme;

        @NameInMap("OriginSni")
        public String originSni;

        @NameInMap("Range")
        public String range;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsOriginRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsOriginRules self = new CreateSiteFunctionResponseBodyConfigsOriginRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setDnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public String getDnsRecord() {
            return this.dnsRecord;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }
        public String getOriginHttpPort() {
            return this.originHttpPort;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }
        public String getOriginHttpsPort() {
            return this.originHttpsPort;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }
        public String getOriginScheme() {
            return this.originScheme;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginSni(String originSni) {
            this.originSni = originSni;
            return this;
        }
        public String getOriginSni() {
            return this.originSni;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsRedirectRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ReserveQueryString")
        public String reserveQueryString;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("Type")
        public String type;

        public static CreateSiteFunctionResponseBodyConfigsRedirectRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsRedirectRules self = new CreateSiteFunctionResponseBodyConfigsRedirectRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setReserveQueryString(String reserveQueryString) {
            this.reserveQueryString = reserveQueryString;
            return this;
        }
        public String getReserveQueryString() {
            return this.reserveQueryString;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsRewriteUrlRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("QueryString")
        public String queryString;

        @NameInMap("RewriteQueryStringType")
        public String rewriteQueryStringType;

        @NameInMap("RewriteUriType")
        public String rewriteUriType;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("Uri")
        public String uri;

        public static CreateSiteFunctionResponseBodyConfigsRewriteUrlRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsRewriteUrlRules self = new CreateSiteFunctionResponseBodyConfigsRewriteUrlRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRewriteQueryStringType(String rewriteQueryStringType) {
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRewriteUriType(String rewriteUriType) {
            this.rewriteUriType = rewriteUriType;
            return this;
        }
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsSeoBypass extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsSeoBypass build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsSeoBypass self = new CreateSiteFunctionResponseBodyConfigsSeoBypass();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsSeoBypass setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsSeoBypass setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsSeoBypass setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsSiteNameExclusive extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsSiteNameExclusive build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsSiteNameExclusive self = new CreateSiteFunctionResponseBodyConfigsSiteNameExclusive();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsSiteNameExclusive setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsSiteNameExclusive setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsSiteNameExclusive setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsSitePause extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Paused")
        public String paused;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsSitePause build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsSitePause self = new CreateSiteFunctionResponseBodyConfigsSitePause();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsSitePause setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsSitePause setPaused(String paused) {
            this.paused = paused;
            return this;
        }
        public String getPaused() {
            return this.paused;
        }

        public CreateSiteFunctionResponseBodyConfigsSitePause setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsTieredCache extends TeaModel {
        @NameInMap("CacheArchitectureMode")
        public String cacheArchitectureMode;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsTieredCache build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsTieredCache self = new CreateSiteFunctionResponseBodyConfigsTieredCache();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsTieredCache setCacheArchitectureMode(String cacheArchitectureMode) {
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }
        public String getCacheArchitectureMode() {
            return this.cacheArchitectureMode;
        }

        public CreateSiteFunctionResponseBodyConfigsTieredCache setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsTieredCache setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigs extends TeaModel {
        @NameInMap("CacheReserve")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheReserve> cacheReserve;

        @NameInMap("CacheRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheRules> cacheRules;

        @NameInMap("CacheTags")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheTags> cacheTags;

        @NameInMap("CnameFlattening")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCnameFlattening> cnameFlattening;

        @NameInMap("CompressionRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCompressionRules> compressionRules;

        @NameInMap("CrossBorderOptimization")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization;

        @NameInMap("DevelopmentMode")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsDevelopmentMode> developmentMode;

        @NameInMap("HttpRequestHeaderModificationRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

        @NameInMap("HttpResponseHeaderModificationRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

        @NameInMap("HttpsApplicationConfiguration")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration;

        @NameInMap("HttpsBasicConfiguration")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration;

        @NameInMap("ImageTransform")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsImageTransform> imageTransform;

        @NameInMap("Ipv6")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsIpv6> ipv6;

        @NameInMap("ManagedTransforms")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsManagedTransforms> managedTransforms;

        @NameInMap("NetworkOptimization")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsNetworkOptimization> networkOptimization;

        @NameInMap("OriginRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsOriginRules> originRules;

        @NameInMap("RedirectRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRedirectRules> redirectRules;

        @NameInMap("RewriteUrlRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRewriteUrlRules> rewriteUrlRules;

        @NameInMap("SeoBypass")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSeoBypass> seoBypass;

        @NameInMap("SiteNameExclusive")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSiteNameExclusive> siteNameExclusive;

        @NameInMap("SitePause")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSitePause> sitePause;

        @NameInMap("TieredCache")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsTieredCache> tieredCache;

        public static CreateSiteFunctionResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigs self = new CreateSiteFunctionResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigs setCacheReserve(java.util.List<CreateSiteFunctionResponseBodyConfigsCacheReserve> cacheReserve) {
            this.cacheReserve = cacheReserve;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheReserve> getCacheReserve() {
            return this.cacheReserve;
        }

        public CreateSiteFunctionResponseBodyConfigs setCacheRules(java.util.List<CreateSiteFunctionResponseBodyConfigsCacheRules> cacheRules) {
            this.cacheRules = cacheRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheRules> getCacheRules() {
            return this.cacheRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setCacheTags(java.util.List<CreateSiteFunctionResponseBodyConfigsCacheTags> cacheTags) {
            this.cacheTags = cacheTags;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheTags> getCacheTags() {
            return this.cacheTags;
        }

        public CreateSiteFunctionResponseBodyConfigs setCnameFlattening(java.util.List<CreateSiteFunctionResponseBodyConfigsCnameFlattening> cnameFlattening) {
            this.cnameFlattening = cnameFlattening;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCnameFlattening> getCnameFlattening() {
            return this.cnameFlattening;
        }

        public CreateSiteFunctionResponseBodyConfigs setCompressionRules(java.util.List<CreateSiteFunctionResponseBodyConfigsCompressionRules> compressionRules) {
            this.compressionRules = compressionRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCompressionRules> getCompressionRules() {
            return this.compressionRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setCrossBorderOptimization(java.util.List<CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization) {
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization> getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        public CreateSiteFunctionResponseBodyConfigs setDevelopmentMode(java.util.List<CreateSiteFunctionResponseBodyConfigsDevelopmentMode> developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsDevelopmentMode> getDevelopmentMode() {
            return this.developmentMode;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpRequestHeaderModificationRules(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
            this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
            return this.httpRequestHeaderModificationRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpResponseHeaderModificationRules(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
            this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
            return this.httpResponseHeaderModificationRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpsApplicationConfiguration(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration) {
            this.httpsApplicationConfiguration = httpsApplicationConfiguration;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
            return this.httpsApplicationConfiguration;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpsBasicConfiguration(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration) {
            this.httpsBasicConfiguration = httpsBasicConfiguration;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration> getHttpsBasicConfiguration() {
            return this.httpsBasicConfiguration;
        }

        public CreateSiteFunctionResponseBodyConfigs setImageTransform(java.util.List<CreateSiteFunctionResponseBodyConfigsImageTransform> imageTransform) {
            this.imageTransform = imageTransform;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsImageTransform> getImageTransform() {
            return this.imageTransform;
        }

        public CreateSiteFunctionResponseBodyConfigs setIpv6(java.util.List<CreateSiteFunctionResponseBodyConfigsIpv6> ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsIpv6> getIpv6() {
            return this.ipv6;
        }

        public CreateSiteFunctionResponseBodyConfigs setManagedTransforms(java.util.List<CreateSiteFunctionResponseBodyConfigsManagedTransforms> managedTransforms) {
            this.managedTransforms = managedTransforms;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsManagedTransforms> getManagedTransforms() {
            return this.managedTransforms;
        }

        public CreateSiteFunctionResponseBodyConfigs setNetworkOptimization(java.util.List<CreateSiteFunctionResponseBodyConfigsNetworkOptimization> networkOptimization) {
            this.networkOptimization = networkOptimization;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsNetworkOptimization> getNetworkOptimization() {
            return this.networkOptimization;
        }

        public CreateSiteFunctionResponseBodyConfigs setOriginRules(java.util.List<CreateSiteFunctionResponseBodyConfigsOriginRules> originRules) {
            this.originRules = originRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsOriginRules> getOriginRules() {
            return this.originRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setRedirectRules(java.util.List<CreateSiteFunctionResponseBodyConfigsRedirectRules> redirectRules) {
            this.redirectRules = redirectRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRedirectRules> getRedirectRules() {
            return this.redirectRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setRewriteUrlRules(java.util.List<CreateSiteFunctionResponseBodyConfigsRewriteUrlRules> rewriteUrlRules) {
            this.rewriteUrlRules = rewriteUrlRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRewriteUrlRules> getRewriteUrlRules() {
            return this.rewriteUrlRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setSeoBypass(java.util.List<CreateSiteFunctionResponseBodyConfigsSeoBypass> seoBypass) {
            this.seoBypass = seoBypass;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSeoBypass> getSeoBypass() {
            return this.seoBypass;
        }

        public CreateSiteFunctionResponseBodyConfigs setSiteNameExclusive(java.util.List<CreateSiteFunctionResponseBodyConfigsSiteNameExclusive> siteNameExclusive) {
            this.siteNameExclusive = siteNameExclusive;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSiteNameExclusive> getSiteNameExclusive() {
            return this.siteNameExclusive;
        }

        public CreateSiteFunctionResponseBodyConfigs setSitePause(java.util.List<CreateSiteFunctionResponseBodyConfigsSitePause> sitePause) {
            this.sitePause = sitePause;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSitePause> getSitePause() {
            return this.sitePause;
        }

        public CreateSiteFunctionResponseBodyConfigs setTieredCache(java.util.List<CreateSiteFunctionResponseBodyConfigsTieredCache> tieredCache) {
            this.tieredCache = tieredCache;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsTieredCache> getTieredCache() {
            return this.tieredCache;
        }

    }

}
