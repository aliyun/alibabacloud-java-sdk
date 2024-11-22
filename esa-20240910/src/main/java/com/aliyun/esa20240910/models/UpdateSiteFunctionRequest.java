// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteFunctionRequest extends TeaModel {
    @NameInMap("CacheReserve")
    public java.util.List<UpdateSiteFunctionRequestCacheReserve> cacheReserve;

    @NameInMap("CacheRules")
    public java.util.List<UpdateSiteFunctionRequestCacheRules> cacheRules;

    @NameInMap("CacheTags")
    public java.util.List<UpdateSiteFunctionRequestCacheTags> cacheTags;

    @NameInMap("CnameFlattening")
    public java.util.List<UpdateSiteFunctionRequestCnameFlattening> cnameFlattening;

    @NameInMap("CompressionRules")
    public java.util.List<UpdateSiteFunctionRequestCompressionRules> compressionRules;

    @NameInMap("CrossBorderOptimization")
    public java.util.List<UpdateSiteFunctionRequestCrossBorderOptimization> crossBorderOptimization;

    @NameInMap("DevelopmentMode")
    public java.util.List<UpdateSiteFunctionRequestDevelopmentMode> developmentMode;

    @NameInMap("HttpRequestHeaderModificationRules")
    public java.util.List<UpdateSiteFunctionRequestHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

    @NameInMap("HttpResponseHeaderModificationRules")
    public java.util.List<UpdateSiteFunctionRequestHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

    @NameInMap("HttpsApplicationConfiguration")
    public java.util.List<UpdateSiteFunctionRequestHttpsApplicationConfiguration> httpsApplicationConfiguration;

    @NameInMap("HttpsBasicConfiguration")
    public java.util.List<UpdateSiteFunctionRequestHttpsBasicConfiguration> httpsBasicConfiguration;

    @NameInMap("ImageTransform")
    public java.util.List<UpdateSiteFunctionRequestImageTransform> imageTransform;

    @NameInMap("Ipv6")
    public java.util.List<UpdateSiteFunctionRequestIpv6> ipv6;

    @NameInMap("ManagedTransforms")
    public java.util.List<UpdateSiteFunctionRequestManagedTransforms> managedTransforms;

    @NameInMap("NetworkOptimization")
    public java.util.List<UpdateSiteFunctionRequestNetworkOptimization> networkOptimization;

    @NameInMap("OriginRules")
    public java.util.List<UpdateSiteFunctionRequestOriginRules> originRules;

    @NameInMap("RedirectRules")
    public java.util.List<UpdateSiteFunctionRequestRedirectRules> redirectRules;

    @NameInMap("RewriteUrlRules")
    public java.util.List<UpdateSiteFunctionRequestRewriteUrlRules> rewriteUrlRules;

    @NameInMap("SeoBypass")
    public java.util.List<UpdateSiteFunctionRequestSeoBypass> seoBypass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateSiteFunction</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SiteNameExclusive")
    public java.util.List<UpdateSiteFunctionRequestSiteNameExclusive> siteNameExclusive;

    @NameInMap("SitePause")
    public java.util.List<UpdateSiteFunctionRequestSitePause> sitePause;

    @NameInMap("TieredCache")
    public java.util.List<UpdateSiteFunctionRequestTieredCache> tieredCache;

    public static UpdateSiteFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteFunctionRequest self = new UpdateSiteFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSiteFunctionRequest setCacheReserve(java.util.List<UpdateSiteFunctionRequestCacheReserve> cacheReserve) {
        this.cacheReserve = cacheReserve;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestCacheReserve> getCacheReserve() {
        return this.cacheReserve;
    }

    public UpdateSiteFunctionRequest setCacheRules(java.util.List<UpdateSiteFunctionRequestCacheRules> cacheRules) {
        this.cacheRules = cacheRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestCacheRules> getCacheRules() {
        return this.cacheRules;
    }

    public UpdateSiteFunctionRequest setCacheTags(java.util.List<UpdateSiteFunctionRequestCacheTags> cacheTags) {
        this.cacheTags = cacheTags;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestCacheTags> getCacheTags() {
        return this.cacheTags;
    }

    public UpdateSiteFunctionRequest setCnameFlattening(java.util.List<UpdateSiteFunctionRequestCnameFlattening> cnameFlattening) {
        this.cnameFlattening = cnameFlattening;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestCnameFlattening> getCnameFlattening() {
        return this.cnameFlattening;
    }

    public UpdateSiteFunctionRequest setCompressionRules(java.util.List<UpdateSiteFunctionRequestCompressionRules> compressionRules) {
        this.compressionRules = compressionRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestCompressionRules> getCompressionRules() {
        return this.compressionRules;
    }

    public UpdateSiteFunctionRequest setCrossBorderOptimization(java.util.List<UpdateSiteFunctionRequestCrossBorderOptimization> crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestCrossBorderOptimization> getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public UpdateSiteFunctionRequest setDevelopmentMode(java.util.List<UpdateSiteFunctionRequestDevelopmentMode> developmentMode) {
        this.developmentMode = developmentMode;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestDevelopmentMode> getDevelopmentMode() {
        return this.developmentMode;
    }

    public UpdateSiteFunctionRequest setHttpRequestHeaderModificationRules(java.util.List<UpdateSiteFunctionRequestHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
        this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestHttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
        return this.httpRequestHeaderModificationRules;
    }

    public UpdateSiteFunctionRequest setHttpResponseHeaderModificationRules(java.util.List<UpdateSiteFunctionRequestHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
        this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestHttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
        return this.httpResponseHeaderModificationRules;
    }

    public UpdateSiteFunctionRequest setHttpsApplicationConfiguration(java.util.List<UpdateSiteFunctionRequestHttpsApplicationConfiguration> httpsApplicationConfiguration) {
        this.httpsApplicationConfiguration = httpsApplicationConfiguration;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestHttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
        return this.httpsApplicationConfiguration;
    }

    public UpdateSiteFunctionRequest setHttpsBasicConfiguration(java.util.List<UpdateSiteFunctionRequestHttpsBasicConfiguration> httpsBasicConfiguration) {
        this.httpsBasicConfiguration = httpsBasicConfiguration;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestHttpsBasicConfiguration> getHttpsBasicConfiguration() {
        return this.httpsBasicConfiguration;
    }

    public UpdateSiteFunctionRequest setImageTransform(java.util.List<UpdateSiteFunctionRequestImageTransform> imageTransform) {
        this.imageTransform = imageTransform;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestImageTransform> getImageTransform() {
        return this.imageTransform;
    }

    public UpdateSiteFunctionRequest setIpv6(java.util.List<UpdateSiteFunctionRequestIpv6> ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestIpv6> getIpv6() {
        return this.ipv6;
    }

    public UpdateSiteFunctionRequest setManagedTransforms(java.util.List<UpdateSiteFunctionRequestManagedTransforms> managedTransforms) {
        this.managedTransforms = managedTransforms;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestManagedTransforms> getManagedTransforms() {
        return this.managedTransforms;
    }

    public UpdateSiteFunctionRequest setNetworkOptimization(java.util.List<UpdateSiteFunctionRequestNetworkOptimization> networkOptimization) {
        this.networkOptimization = networkOptimization;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestNetworkOptimization> getNetworkOptimization() {
        return this.networkOptimization;
    }

    public UpdateSiteFunctionRequest setOriginRules(java.util.List<UpdateSiteFunctionRequestOriginRules> originRules) {
        this.originRules = originRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestOriginRules> getOriginRules() {
        return this.originRules;
    }

    public UpdateSiteFunctionRequest setRedirectRules(java.util.List<UpdateSiteFunctionRequestRedirectRules> redirectRules) {
        this.redirectRules = redirectRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestRedirectRules> getRedirectRules() {
        return this.redirectRules;
    }

    public UpdateSiteFunctionRequest setRewriteUrlRules(java.util.List<UpdateSiteFunctionRequestRewriteUrlRules> rewriteUrlRules) {
        this.rewriteUrlRules = rewriteUrlRules;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestRewriteUrlRules> getRewriteUrlRules() {
        return this.rewriteUrlRules;
    }

    public UpdateSiteFunctionRequest setSeoBypass(java.util.List<UpdateSiteFunctionRequestSeoBypass> seoBypass) {
        this.seoBypass = seoBypass;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestSeoBypass> getSeoBypass() {
        return this.seoBypass;
    }

    public UpdateSiteFunctionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateSiteFunctionRequest setSiteNameExclusive(java.util.List<UpdateSiteFunctionRequestSiteNameExclusive> siteNameExclusive) {
        this.siteNameExclusive = siteNameExclusive;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestSiteNameExclusive> getSiteNameExclusive() {
        return this.siteNameExclusive;
    }

    public UpdateSiteFunctionRequest setSitePause(java.util.List<UpdateSiteFunctionRequestSitePause> sitePause) {
        this.sitePause = sitePause;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestSitePause> getSitePause() {
        return this.sitePause;
    }

    public UpdateSiteFunctionRequest setTieredCache(java.util.List<UpdateSiteFunctionRequestTieredCache> tieredCache) {
        this.tieredCache = tieredCache;
        return this;
    }
    public java.util.List<UpdateSiteFunctionRequestTieredCache> getTieredCache() {
        return this.tieredCache;
    }

    public static class UpdateSiteFunctionRequestCacheReserve extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("InstanceId")
        public String instanceId;

        public static UpdateSiteFunctionRequestCacheReserve build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestCacheReserve self = new UpdateSiteFunctionRequestCacheReserve();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestCacheReserve setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestCacheReserve setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public UpdateSiteFunctionRequestCacheReserve setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateSiteFunctionRequestCacheRules extends TeaModel {
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

        public static UpdateSiteFunctionRequestCacheRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestCacheRules self = new UpdateSiteFunctionRequestCacheRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestCacheRules setAdditionalCacheablePorts(String additionalCacheablePorts) {
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        public UpdateSiteFunctionRequestCacheRules setBrowserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        public UpdateSiteFunctionRequestCacheRules setBrowserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        public UpdateSiteFunctionRequestCacheRules setBypassCache(String bypassCache) {
            this.bypassCache = bypassCache;
            return this;
        }
        public String getBypassCache() {
            return this.bypassCache;
        }

        public UpdateSiteFunctionRequestCacheRules setCacheDeceptionArmor(String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        public UpdateSiteFunctionRequestCacheRules setCacheReserveEligibility(String cacheReserveEligibility) {
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        public UpdateSiteFunctionRequestCacheRules setCheckPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        public UpdateSiteFunctionRequestCacheRules setCheckPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        public UpdateSiteFunctionRequestCacheRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestCacheRules setEdgeCacheMode(String edgeCacheMode) {
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        public UpdateSiteFunctionRequestCacheRules setEdgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        public UpdateSiteFunctionRequestCacheRules setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        public UpdateSiteFunctionRequestCacheRules setIncludeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        public UpdateSiteFunctionRequestCacheRules setIncludeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        public UpdateSiteFunctionRequestCacheRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public UpdateSiteFunctionRequestCacheRules setQueryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
            return this;
        }
        public String getQueryStringMode() {
            return this.queryStringMode;
        }

        public UpdateSiteFunctionRequestCacheRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestCacheRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestCacheRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateSiteFunctionRequestCacheRules setServeStale(String serveStale) {
            this.serveStale = serveStale;
            return this;
        }
        public String getServeStale() {
            return this.serveStale;
        }

        public UpdateSiteFunctionRequestCacheRules setSortQueryStringForCache(String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        public UpdateSiteFunctionRequestCacheRules setUserDeviceType(String userDeviceType) {
            this.userDeviceType = userDeviceType;
            return this;
        }
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        public UpdateSiteFunctionRequestCacheRules setUserGeo(String userGeo) {
            this.userGeo = userGeo;
            return this;
        }
        public String getUserGeo() {
            return this.userGeo;
        }

        public UpdateSiteFunctionRequestCacheRules setUserLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }
        public String getUserLanguage() {
            return this.userLanguage;
        }

    }

    public static class UpdateSiteFunctionRequestCacheTags extends TeaModel {
        @NameInMap("CaseInsensitive")
        public String caseInsensitive;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("TagName")
        public String tagName;

        public static UpdateSiteFunctionRequestCacheTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestCacheTags self = new UpdateSiteFunctionRequestCacheTags();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestCacheTags setCaseInsensitive(String caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public String getCaseInsensitive() {
            return this.caseInsensitive;
        }

        public UpdateSiteFunctionRequestCacheTags setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestCacheTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class UpdateSiteFunctionRequestCnameFlattening extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("FlattenMode")
        public String flattenMode;

        public static UpdateSiteFunctionRequestCnameFlattening build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestCnameFlattening self = new UpdateSiteFunctionRequestCnameFlattening();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestCnameFlattening setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestCnameFlattening setFlattenMode(String flattenMode) {
            this.flattenMode = flattenMode;
            return this;
        }
        public String getFlattenMode() {
            return this.flattenMode;
        }

    }

    public static class UpdateSiteFunctionRequestCompressionRules extends TeaModel {
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

        public static UpdateSiteFunctionRequestCompressionRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestCompressionRules self = new UpdateSiteFunctionRequestCompressionRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestCompressionRules setBrotli(String brotli) {
            this.brotli = brotli;
            return this;
        }
        public String getBrotli() {
            return this.brotli;
        }

        public UpdateSiteFunctionRequestCompressionRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestCompressionRules setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public UpdateSiteFunctionRequestCompressionRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestCompressionRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestCompressionRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class UpdateSiteFunctionRequestCrossBorderOptimization extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static UpdateSiteFunctionRequestCrossBorderOptimization build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestCrossBorderOptimization self = new UpdateSiteFunctionRequestCrossBorderOptimization();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestCrossBorderOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestCrossBorderOptimization setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class UpdateSiteFunctionRequestDevelopmentMode extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static UpdateSiteFunctionRequestDevelopmentMode build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestDevelopmentMode self = new UpdateSiteFunctionRequestDevelopmentMode();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestDevelopmentMode setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestDevelopmentMode setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification self = new UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateSiteFunctionRequestHttpRequestHeaderModificationRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("RequestHeaderModification")
        public java.util.List<UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        public static UpdateSiteFunctionRequestHttpRequestHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestHttpRequestHeaderModificationRules self = new UpdateSiteFunctionRequestHttpRequestHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRules setRequestHeaderModification(java.util.List<UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<UpdateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestHttpRequestHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification self = new UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateSiteFunctionRequestHttpResponseHeaderModificationRules extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ResponseHeaderModification")
        public java.util.List<UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        public static UpdateSiteFunctionRequestHttpResponseHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestHttpResponseHeaderModificationRules self = new UpdateSiteFunctionRequestHttpResponseHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRules setResponseHeaderModification(java.util.List<UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<UpdateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestHttpResponseHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class UpdateSiteFunctionRequestHttpsApplicationConfiguration extends TeaModel {
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

        public static UpdateSiteFunctionRequestHttpsApplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestHttpsApplicationConfiguration self = new UpdateSiteFunctionRequestHttpsApplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setAltSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }
        public String getAltSvc() {
            return this.altSvc;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setAltSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }
        public String getAltSvcClear() {
            return this.altSvcClear;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setAltSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }
        public String getAltSvcMa() {
            return this.altSvcMa;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setAltSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
        }
        public String getAltSvcPersist() {
            return this.altSvcPersist;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setHsts(String hsts) {
            this.hsts = hsts;
            return this;
        }
        public String getHsts() {
            return this.hsts;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }
        public String getHstsIncludeSubdomains() {
            return this.hstsIncludeSubdomains;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setHstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public String getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setHstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public String getHstsPreload() {
            return this.hstsPreload;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setHttpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }
        public String getHttpsForce() {
            return this.httpsForce;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setHttpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
            return this;
        }
        public String getHttpsForceCode() {
            return this.httpsForceCode;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestHttpsApplicationConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class UpdateSiteFunctionRequestHttpsBasicConfiguration extends TeaModel {
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

        @NameInMap("Tls10")
        public String tls10;

        @NameInMap("Tls11")
        public String tls11;

        @NameInMap("Tls12")
        public String tls12;

        @NameInMap("Tls13")
        public String tls13;

        public static UpdateSiteFunctionRequestHttpsBasicConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestHttpsBasicConfiguration self = new UpdateSiteFunctionRequestHttpsBasicConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setCiphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setCiphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setHttp3(String http3) {
            this.http3 = http3;
            return this;
        }
        public String getHttp3() {
            return this.http3;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setHttps(String https) {
            this.https = https;
            return this;
        }
        public String getHttps() {
            return this.https;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setOcspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
            return this;
        }
        public String getOcspStapling() {
            return this.ocspStapling;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setTls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }
        public String getTls10() {
            return this.tls10;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setTls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }
        public String getTls11() {
            return this.tls11;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setTls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }
        public String getTls12() {
            return this.tls12;
        }

        public UpdateSiteFunctionRequestHttpsBasicConfiguration setTls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public String getTls13() {
            return this.tls13;
        }

    }

    public static class UpdateSiteFunctionRequestImageTransform extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static UpdateSiteFunctionRequestImageTransform build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestImageTransform self = new UpdateSiteFunctionRequestImageTransform();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestImageTransform setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestImageTransform setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class UpdateSiteFunctionRequestIpv6 extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static UpdateSiteFunctionRequestIpv6 build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestIpv6 self = new UpdateSiteFunctionRequestIpv6();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestIpv6 setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestIpv6 setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class UpdateSiteFunctionRequestManagedTransforms extends TeaModel {
        @NameInMap("AddClientGeolocationHeaders")
        public String addClientGeolocationHeaders;

        @NameInMap("AddRealClientIpHeader")
        public String addRealClientIpHeader;

        @NameInMap("ConfigId")
        public Long configId;

        public static UpdateSiteFunctionRequestManagedTransforms build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestManagedTransforms self = new UpdateSiteFunctionRequestManagedTransforms();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestManagedTransforms setAddClientGeolocationHeaders(String addClientGeolocationHeaders) {
            this.addClientGeolocationHeaders = addClientGeolocationHeaders;
            return this;
        }
        public String getAddClientGeolocationHeaders() {
            return this.addClientGeolocationHeaders;
        }

        public UpdateSiteFunctionRequestManagedTransforms setAddRealClientIpHeader(String addRealClientIpHeader) {
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }
        public String getAddRealClientIpHeader() {
            return this.addRealClientIpHeader;
        }

        public UpdateSiteFunctionRequestManagedTransforms setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

    }

    public static class UpdateSiteFunctionRequestNetworkOptimization extends TeaModel {
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

        @NameInMap("SmartRouting")
        public String smartRouting;

        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

        @NameInMap("Websocket")
        public String websocket;

        public static UpdateSiteFunctionRequestNetworkOptimization build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestNetworkOptimization self = new UpdateSiteFunctionRequestNetworkOptimization();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestNetworkOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setGrpc(String grpc) {
            this.grpc = grpc;
            return this;
        }
        public String getGrpc() {
            return this.grpc;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setHttp2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setSmartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }
        public String getSmartRouting() {
            return this.smartRouting;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setUploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        public UpdateSiteFunctionRequestNetworkOptimization setWebsocket(String websocket) {
            this.websocket = websocket;
            return this;
        }
        public String getWebsocket() {
            return this.websocket;
        }

    }

    public static class UpdateSiteFunctionRequestOriginRules extends TeaModel {
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

        public static UpdateSiteFunctionRequestOriginRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestOriginRules self = new UpdateSiteFunctionRequestOriginRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestOriginRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestOriginRules setDnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public String getDnsRecord() {
            return this.dnsRecord;
        }

        public UpdateSiteFunctionRequestOriginRules setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public UpdateSiteFunctionRequestOriginRules setOriginHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }
        public String getOriginHttpPort() {
            return this.originHttpPort;
        }

        public UpdateSiteFunctionRequestOriginRules setOriginHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }
        public String getOriginHttpsPort() {
            return this.originHttpsPort;
        }

        public UpdateSiteFunctionRequestOriginRules setOriginScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }
        public String getOriginScheme() {
            return this.originScheme;
        }

        public UpdateSiteFunctionRequestOriginRules setOriginSni(String originSni) {
            this.originSni = originSni;
            return this;
        }
        public String getOriginSni() {
            return this.originSni;
        }

        public UpdateSiteFunctionRequestOriginRules setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public UpdateSiteFunctionRequestOriginRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestOriginRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestOriginRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class UpdateSiteFunctionRequestRedirectRules extends TeaModel {
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

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("Type")
        public String type;

        public static UpdateSiteFunctionRequestRedirectRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestRedirectRules self = new UpdateSiteFunctionRequestRedirectRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestRedirectRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestRedirectRules setReserveQueryString(String reserveQueryString) {
            this.reserveQueryString = reserveQueryString;
            return this;
        }
        public String getReserveQueryString() {
            return this.reserveQueryString;
        }

        public UpdateSiteFunctionRequestRedirectRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestRedirectRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestRedirectRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateSiteFunctionRequestRedirectRules setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public UpdateSiteFunctionRequestRedirectRules setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateSiteFunctionRequestRedirectRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateSiteFunctionRequestRewriteUrlRules extends TeaModel {
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

        @NameInMap("Uri")
        public String uri;

        public static UpdateSiteFunctionRequestRewriteUrlRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestRewriteUrlRules self = new UpdateSiteFunctionRequestRewriteUrlRules();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setRewriteQueryStringType(String rewriteQueryStringType) {
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setRewriteUriType(String rewriteUriType) {
            this.rewriteUriType = rewriteUriType;
            return this;
        }
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateSiteFunctionRequestRewriteUrlRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class UpdateSiteFunctionRequestSeoBypass extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static UpdateSiteFunctionRequestSeoBypass build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestSeoBypass self = new UpdateSiteFunctionRequestSeoBypass();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestSeoBypass setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestSeoBypass setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class UpdateSiteFunctionRequestSiteNameExclusive extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        public static UpdateSiteFunctionRequestSiteNameExclusive build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestSiteNameExclusive self = new UpdateSiteFunctionRequestSiteNameExclusive();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestSiteNameExclusive setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestSiteNameExclusive setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class UpdateSiteFunctionRequestSitePause extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Paused")
        public String paused;

        public static UpdateSiteFunctionRequestSitePause build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestSitePause self = new UpdateSiteFunctionRequestSitePause();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestSitePause setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public UpdateSiteFunctionRequestSitePause setPaused(String paused) {
            this.paused = paused;
            return this;
        }
        public String getPaused() {
            return this.paused;
        }

    }

    public static class UpdateSiteFunctionRequestTieredCache extends TeaModel {
        @NameInMap("CacheArchitectureMode")
        public String cacheArchitectureMode;

        @NameInMap("ConfigId")
        public Long configId;

        public static UpdateSiteFunctionRequestTieredCache build(java.util.Map<String, ?> map) throws Exception {
            UpdateSiteFunctionRequestTieredCache self = new UpdateSiteFunctionRequestTieredCache();
            return TeaModel.build(map, self);
        }

        public UpdateSiteFunctionRequestTieredCache setCacheArchitectureMode(String cacheArchitectureMode) {
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }
        public String getCacheArchitectureMode() {
            return this.cacheArchitectureMode;
        }

        public UpdateSiteFunctionRequestTieredCache setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

    }

}
