// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteFunctionRequest extends TeaModel {
    @NameInMap("CacheReserve")
    public java.util.List<CreateSiteFunctionRequestCacheReserve> cacheReserve;

    /**
     * <p>The cache rules.</p>
     */
    @NameInMap("CacheRules")
    public java.util.List<CreateSiteFunctionRequestCacheRules> cacheRules;

    /**
     * <p>The cache tags.</p>
     */
    @NameInMap("CacheTags")
    public java.util.List<CreateSiteFunctionRequestCacheTags> cacheTags;

    /**
     * <p>The configuration of CNAME flattening.</p>
     */
    @NameInMap("CnameFlattening")
    public java.util.List<CreateSiteFunctionRequestCnameFlattening> cnameFlattening;

    /**
     * <p>The configuration of a compression rule.</p>
     */
    @NameInMap("CompressionRules")
    public java.util.List<CreateSiteFunctionRequestCompressionRules> compressionRules;

    @NameInMap("CrossBorderOptimization")
    public java.util.List<CreateSiteFunctionRequestCrossBorderOptimization> crossBorderOptimization;

    /**
     * <p>The configuration of development mode.</p>
     */
    @NameInMap("DevelopmentMode")
    public java.util.List<CreateSiteFunctionRequestDevelopmentMode> developmentMode;

    /**
     * <p>The configuration of a request header modification rule.</p>
     */
    @NameInMap("HttpRequestHeaderModificationRules")
    public java.util.List<CreateSiteFunctionRequestHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

    /**
     * <p>The configuration of a response header modification rule.</p>
     */
    @NameInMap("HttpResponseHeaderModificationRules")
    public java.util.List<CreateSiteFunctionRequestHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

    @NameInMap("HttpsApplicationConfiguration")
    public java.util.List<CreateSiteFunctionRequestHttpsApplicationConfiguration> httpsApplicationConfiguration;

    @NameInMap("HttpsBasicConfiguration")
    public java.util.List<CreateSiteFunctionRequestHttpsBasicConfiguration> httpsBasicConfiguration;

    /**
     * <p>The configuration of image transformations.</p>
     */
    @NameInMap("ImageTransform")
    public java.util.List<CreateSiteFunctionRequestImageTransform> imageTransform;

    /**
     * <p>The IPv6 configuration.</p>
     */
    @NameInMap("Ipv6")
    public java.util.List<CreateSiteFunctionRequestIpv6> ipv6;

    /**
     * <p>The configuration of managed transforms.</p>
     */
    @NameInMap("ManagedTransforms")
    public java.util.List<CreateSiteFunctionRequestManagedTransforms> managedTransforms;

    @NameInMap("NetworkOptimization")
    public java.util.List<CreateSiteFunctionRequestNetworkOptimization> networkOptimization;

    /**
     * <p>The configuration of origin protection.</p>
     */
    @NameInMap("OriginProtection")
    public java.util.List<CreateSiteFunctionRequestOriginProtection> originProtection;

    /**
     * <p>The configuration of an origin rule.</p>
     */
    @NameInMap("OriginRules")
    public java.util.List<CreateSiteFunctionRequestOriginRules> originRules;

    /**
     * <p>The configuration of a redirect rule.</p>
     */
    @NameInMap("RedirectRules")
    public java.util.List<CreateSiteFunctionRequestRedirectRules> redirectRules;

    /**
     * <p>The configuration of a URL rewrite rule.</p>
     */
    @NameInMap("RewriteUrlRules")
    public java.util.List<CreateSiteFunctionRequestRewriteUrlRules> rewriteUrlRules;

    /**
     * <p>The configuration of SEO crawler bypassing.</p>
     */
    @NameInMap("SeoBypass")
    public java.util.List<CreateSiteFunctionRequestSeoBypass> seoBypass;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateSiteFunction</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The configuration of site hold. After this feature is enabled, other accounts cannot add your website domain or its subdomains to ESA.</p>
     */
    @NameInMap("SiteNameExclusive")
    public java.util.List<CreateSiteFunctionRequestSiteNameExclusive> siteNameExclusive;

    /**
     * <p>The configuration of temporarily pausing ESA proxy on the website. If you pause ESA proxy, all requests to the domains in your DNS records go directly to your origin server.</p>
     */
    @NameInMap("SitePause")
    public java.util.List<CreateSiteFunctionRequestSitePause> sitePause;

    /**
     * <p>The version number of the website. You can use this parameter to specify a version of your website to apply the new feature settings. By default, version 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    @NameInMap("TieredCache")
    public java.util.List<CreateSiteFunctionRequestTieredCache> tieredCache;

    public static CreateSiteFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteFunctionRequest self = new CreateSiteFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteFunctionRequest setCacheReserve(java.util.List<CreateSiteFunctionRequestCacheReserve> cacheReserve) {
        this.cacheReserve = cacheReserve;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestCacheReserve> getCacheReserve() {
        return this.cacheReserve;
    }

    public CreateSiteFunctionRequest setCacheRules(java.util.List<CreateSiteFunctionRequestCacheRules> cacheRules) {
        this.cacheRules = cacheRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestCacheRules> getCacheRules() {
        return this.cacheRules;
    }

    public CreateSiteFunctionRequest setCacheTags(java.util.List<CreateSiteFunctionRequestCacheTags> cacheTags) {
        this.cacheTags = cacheTags;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestCacheTags> getCacheTags() {
        return this.cacheTags;
    }

    public CreateSiteFunctionRequest setCnameFlattening(java.util.List<CreateSiteFunctionRequestCnameFlattening> cnameFlattening) {
        this.cnameFlattening = cnameFlattening;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestCnameFlattening> getCnameFlattening() {
        return this.cnameFlattening;
    }

    public CreateSiteFunctionRequest setCompressionRules(java.util.List<CreateSiteFunctionRequestCompressionRules> compressionRules) {
        this.compressionRules = compressionRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestCompressionRules> getCompressionRules() {
        return this.compressionRules;
    }

    public CreateSiteFunctionRequest setCrossBorderOptimization(java.util.List<CreateSiteFunctionRequestCrossBorderOptimization> crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestCrossBorderOptimization> getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public CreateSiteFunctionRequest setDevelopmentMode(java.util.List<CreateSiteFunctionRequestDevelopmentMode> developmentMode) {
        this.developmentMode = developmentMode;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestDevelopmentMode> getDevelopmentMode() {
        return this.developmentMode;
    }

    public CreateSiteFunctionRequest setHttpRequestHeaderModificationRules(java.util.List<CreateSiteFunctionRequestHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
        this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestHttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
        return this.httpRequestHeaderModificationRules;
    }

    public CreateSiteFunctionRequest setHttpResponseHeaderModificationRules(java.util.List<CreateSiteFunctionRequestHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
        this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestHttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
        return this.httpResponseHeaderModificationRules;
    }

    public CreateSiteFunctionRequest setHttpsApplicationConfiguration(java.util.List<CreateSiteFunctionRequestHttpsApplicationConfiguration> httpsApplicationConfiguration) {
        this.httpsApplicationConfiguration = httpsApplicationConfiguration;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestHttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
        return this.httpsApplicationConfiguration;
    }

    public CreateSiteFunctionRequest setHttpsBasicConfiguration(java.util.List<CreateSiteFunctionRequestHttpsBasicConfiguration> httpsBasicConfiguration) {
        this.httpsBasicConfiguration = httpsBasicConfiguration;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestHttpsBasicConfiguration> getHttpsBasicConfiguration() {
        return this.httpsBasicConfiguration;
    }

    public CreateSiteFunctionRequest setImageTransform(java.util.List<CreateSiteFunctionRequestImageTransform> imageTransform) {
        this.imageTransform = imageTransform;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestImageTransform> getImageTransform() {
        return this.imageTransform;
    }

    public CreateSiteFunctionRequest setIpv6(java.util.List<CreateSiteFunctionRequestIpv6> ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestIpv6> getIpv6() {
        return this.ipv6;
    }

    public CreateSiteFunctionRequest setManagedTransforms(java.util.List<CreateSiteFunctionRequestManagedTransforms> managedTransforms) {
        this.managedTransforms = managedTransforms;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestManagedTransforms> getManagedTransforms() {
        return this.managedTransforms;
    }

    public CreateSiteFunctionRequest setNetworkOptimization(java.util.List<CreateSiteFunctionRequestNetworkOptimization> networkOptimization) {
        this.networkOptimization = networkOptimization;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestNetworkOptimization> getNetworkOptimization() {
        return this.networkOptimization;
    }

    public CreateSiteFunctionRequest setOriginProtection(java.util.List<CreateSiteFunctionRequestOriginProtection> originProtection) {
        this.originProtection = originProtection;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestOriginProtection> getOriginProtection() {
        return this.originProtection;
    }

    public CreateSiteFunctionRequest setOriginRules(java.util.List<CreateSiteFunctionRequestOriginRules> originRules) {
        this.originRules = originRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestOriginRules> getOriginRules() {
        return this.originRules;
    }

    public CreateSiteFunctionRequest setRedirectRules(java.util.List<CreateSiteFunctionRequestRedirectRules> redirectRules) {
        this.redirectRules = redirectRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestRedirectRules> getRedirectRules() {
        return this.redirectRules;
    }

    public CreateSiteFunctionRequest setRewriteUrlRules(java.util.List<CreateSiteFunctionRequestRewriteUrlRules> rewriteUrlRules) {
        this.rewriteUrlRules = rewriteUrlRules;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestRewriteUrlRules> getRewriteUrlRules() {
        return this.rewriteUrlRules;
    }

    public CreateSiteFunctionRequest setSeoBypass(java.util.List<CreateSiteFunctionRequestSeoBypass> seoBypass) {
        this.seoBypass = seoBypass;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestSeoBypass> getSeoBypass() {
        return this.seoBypass;
    }

    public CreateSiteFunctionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateSiteFunctionRequest setSiteNameExclusive(java.util.List<CreateSiteFunctionRequestSiteNameExclusive> siteNameExclusive) {
        this.siteNameExclusive = siteNameExclusive;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestSiteNameExclusive> getSiteNameExclusive() {
        return this.siteNameExclusive;
    }

    public CreateSiteFunctionRequest setSitePause(java.util.List<CreateSiteFunctionRequestSitePause> sitePause) {
        this.sitePause = sitePause;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestSitePause> getSitePause() {
        return this.sitePause;
    }

    public CreateSiteFunctionRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateSiteFunctionRequest setTieredCache(java.util.List<CreateSiteFunctionRequestTieredCache> tieredCache) {
        this.tieredCache = tieredCache;
        return this;
    }
    public java.util.List<CreateSiteFunctionRequestTieredCache> getTieredCache() {
        return this.tieredCache;
    }

    public static class CreateSiteFunctionRequestCacheReserve extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <strong>example:</strong>
         * <p>cr_hk_123456789</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateSiteFunctionRequestCacheReserve build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestCacheReserve self = new CreateSiteFunctionRequestCacheReserve();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestCacheReserve setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionRequestCacheReserve setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateSiteFunctionRequestCacheRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8880</p>
         */
        @NameInMap("AdditionalCacheablePorts")
        public String additionalCacheablePorts;

        /**
         * <p>The browser cache configuration. Valid values:</p>
         * <ul>
         * <li>no_cache: does not cache resources.</li>
         * <li>follow_origin: follows the origin\&quot;s cache rule.</li>
         * <li>override_origin: uses a custom cache rule instead of the origin\&quot;s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
         */
        @NameInMap("BrowserCacheMode")
        public String browserCacheMode;

        /**
         * <p>The browser cache TTL. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("BrowserCacheTtl")
        public String browserCacheTtl;

        /**
         * <p>The configuration of bypass cache. Valid values:</p>
         * <ul>
         * <li>cache_all: Responses of all requests are cached.</li>
         * <li>default_cache (default): Resources are cached only based on supported file extensions.</li>
         * <li>bypass_all: All requests bypass the cache component.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default_cache</p>
         */
        @NameInMap("BypassCache")
        public String bypassCache;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CacheDeceptionArmor")
        public String cacheDeceptionArmor;

        /**
         * <strong>example:</strong>
         * <p>bypass_cache_reserve</p>
         */
        @NameInMap("CacheReserveEligibility")
        public String cacheReserveEligibility;

        /**
         * <strong>example:</strong>
         * <p>cookiename</p>
         */
        @NameInMap("CheckPresenceCookie")
        public String checkPresenceCookie;

        /**
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("CheckPresenceHeader")
        public String checkPresenceHeader;

        /**
         * <p>The edge cache configuration. Valid values:</p>
         * <ul>
         * <li>follow_origin: follows the origin\&quot;s cache rule. If the origin does not have a cache rule, the default cache rule is used.</li>
         * <li>no-cache: does not cache resources.</li>
         * <li>override_origin: uses a custom cache rule instead of the origin\&quot;s.</li>
         * <li>follow_origin_bypass: follows the origin\&quot;s cache rule. If the origin does not have a cache rule, no resources are cached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
         */
        @NameInMap("EdgeCacheMode")
        public String edgeCacheMode;

        /**
         * <p>The edge cache TTL. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EdgeCacheTtl")
        public String edgeCacheTtl;

        /**
         * <p>The status code TTL. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        /**
         * <p>The cookie names and values included in the cache key. Separate multiple combinations with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookie_exapmle</p>
         */
        @NameInMap("IncludeCookie")
        public String includeCookie;

        /**
         * <p>The header names and values included in the cache key. Separate multiple combinations with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IncludeHeader")
        public String includeHeader;

        /**
         * <p>The parameters to be retained or ignored in the query string. Separate multiple values with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>Specifies how to process the query string when cache keys are generated. Valid values:</p>
         * <ul>
         * <li>ignore_all: ignores the entire query string.</li>
         * <li>exclude_query_string: ignores specified parameters in the query string.</li>
         * <li>reserve_all (default): retains the entire query string.</li>
         * <li>include_query_string: retains specified parameters in the query string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>reserve_all</p>
         */
        @NameInMap("QueryStringMode")
        public String queryStringMode;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ServeStale")
        public String serveStale;

        /**
         * <p>Specifies whether to sort query strings. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SortQueryStringForCache")
        public String sortQueryStringForCache;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UserDeviceType")
        public String userDeviceType;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UserGeo")
        public String userGeo;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UserLanguage")
        public String userLanguage;

        public static CreateSiteFunctionRequestCacheRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestCacheRules self = new CreateSiteFunctionRequestCacheRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestCacheRules setAdditionalCacheablePorts(String additionalCacheablePorts) {
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        public CreateSiteFunctionRequestCacheRules setBrowserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        public CreateSiteFunctionRequestCacheRules setBrowserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        public CreateSiteFunctionRequestCacheRules setBypassCache(String bypassCache) {
            this.bypassCache = bypassCache;
            return this;
        }
        public String getBypassCache() {
            return this.bypassCache;
        }

        public CreateSiteFunctionRequestCacheRules setCacheDeceptionArmor(String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        public CreateSiteFunctionRequestCacheRules setCacheReserveEligibility(String cacheReserveEligibility) {
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        public CreateSiteFunctionRequestCacheRules setCheckPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        public CreateSiteFunctionRequestCacheRules setCheckPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        public CreateSiteFunctionRequestCacheRules setEdgeCacheMode(String edgeCacheMode) {
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        public CreateSiteFunctionRequestCacheRules setEdgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        public CreateSiteFunctionRequestCacheRules setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        public CreateSiteFunctionRequestCacheRules setIncludeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        public CreateSiteFunctionRequestCacheRules setIncludeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        public CreateSiteFunctionRequestCacheRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public CreateSiteFunctionRequestCacheRules setQueryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
            return this;
        }
        public String getQueryStringMode() {
            return this.queryStringMode;
        }

        public CreateSiteFunctionRequestCacheRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestCacheRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestCacheRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionRequestCacheRules setServeStale(String serveStale) {
            this.serveStale = serveStale;
            return this;
        }
        public String getServeStale() {
            return this.serveStale;
        }

        public CreateSiteFunctionRequestCacheRules setSortQueryStringForCache(String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        public CreateSiteFunctionRequestCacheRules setUserDeviceType(String userDeviceType) {
            this.userDeviceType = userDeviceType;
            return this;
        }
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        public CreateSiteFunctionRequestCacheRules setUserGeo(String userGeo) {
            this.userGeo = userGeo;
            return this;
        }
        public String getUserGeo() {
            return this.userGeo;
        }

        public CreateSiteFunctionRequestCacheRules setUserLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }
        public String getUserLanguage() {
            return this.userLanguage;
        }

    }

    public static class CreateSiteFunctionRequestCacheTags extends TeaModel {
        /**
         * <p>Specifies whether the matching is not case-sensitive. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CaseInsensitive")
        public String caseInsensitive;

        /**
         * <p>The name of the custom cache tag.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static CreateSiteFunctionRequestCacheTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestCacheTags self = new CreateSiteFunctionRequestCacheTags();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestCacheTags setCaseInsensitive(String caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public String getCaseInsensitive() {
            return this.caseInsensitive;
        }

        public CreateSiteFunctionRequestCacheTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class CreateSiteFunctionRequestCnameFlattening extends TeaModel {
        /**
         * <p>The CNAME flattening mode. Valid values:</p>
         * <ul>
         * <li>flatten_all: flattens all CNAMEs.</li>
         * <li>flatten_all (default): flattens only the root domain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("FlattenMode")
        public String flattenMode;

        public static CreateSiteFunctionRequestCnameFlattening build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestCnameFlattening self = new CreateSiteFunctionRequestCnameFlattening();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestCnameFlattening setFlattenMode(String flattenMode) {
            this.flattenMode = flattenMode;
            return this;
        }
        public String getFlattenMode() {
            return this.flattenMode;
        }

    }

    public static class CreateSiteFunctionRequestCompressionRules extends TeaModel {
        /**
         * <p>Specifies whether to enable Brotli compression. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Brotli")
        public String brotli;

        /**
         * <p>Specifies whether to enable Gzip compression. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Gzip")
        public String gzip;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static CreateSiteFunctionRequestCompressionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestCompressionRules self = new CreateSiteFunctionRequestCompressionRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestCompressionRules setBrotli(String brotli) {
            this.brotli = brotli;
            return this;
        }
        public String getBrotli() {
            return this.brotli;
        }

        public CreateSiteFunctionRequestCompressionRules setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public CreateSiteFunctionRequestCompressionRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestCompressionRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestCompressionRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class CreateSiteFunctionRequestCrossBorderOptimization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestCrossBorderOptimization build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestCrossBorderOptimization self = new CreateSiteFunctionRequestCrossBorderOptimization();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestCrossBorderOptimization setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestDevelopmentMode extends TeaModel {
        /**
         * <p>Specifies whether to enable the development mode. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestDevelopmentMode build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestDevelopmentMode self = new CreateSiteFunctionRequestDevelopmentMode();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestDevelopmentMode setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification self = new CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSiteFunctionRequestHttpRequestHeaderModificationRules extends TeaModel {
        /**
         * <p>Modifies a request header. You can add, delete, or modify a response header.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
         */
        @NameInMap("RequestHeaderModification")
        public java.util.List<CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static CreateSiteFunctionRequestHttpRequestHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestHttpRequestHeaderModificationRules self = new CreateSiteFunctionRequestHttpRequestHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRules setRequestHeaderModification(java.util.List<CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<CreateSiteFunctionRequestHttpRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestHttpRequestHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification self = new CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSiteFunctionRequestHttpResponseHeaderModificationRules extends TeaModel {
        /**
         * <p>Modifies a response header. You can add, delete, or modify a request header.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
         */
        @NameInMap("ResponseHeaderModification")
        public java.util.List<CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static CreateSiteFunctionRequestHttpResponseHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestHttpResponseHeaderModificationRules self = new CreateSiteFunctionRequestHttpResponseHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRules setResponseHeaderModification(java.util.List<CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<CreateSiteFunctionRequestHttpResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestHttpResponseHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class CreateSiteFunctionRequestHttpsApplicationConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvc")
        public String altSvc;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcClear")
        public String altSvcClear;

        /**
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("AltSvcMa")
        public String altSvcMa;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcPersist")
        public String altSvcPersist;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Hsts")
        public String hsts;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsIncludeSubdomains")
        public String hstsIncludeSubdomains;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("HstsMaxAge")
        public String hstsMaxAge;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsPreload")
        public String hstsPreload;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsForce")
        public String httpsForce;

        /**
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpsForceCode")
        public String httpsForceCode;

        /**
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static CreateSiteFunctionRequestHttpsApplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestHttpsApplicationConfiguration self = new CreateSiteFunctionRequestHttpsApplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setAltSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }
        public String getAltSvc() {
            return this.altSvc;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setAltSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }
        public String getAltSvcClear() {
            return this.altSvcClear;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setAltSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }
        public String getAltSvcMa() {
            return this.altSvcMa;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setAltSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
        }
        public String getAltSvcPersist() {
            return this.altSvcPersist;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setHsts(String hsts) {
            this.hsts = hsts;
            return this;
        }
        public String getHsts() {
            return this.hsts;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }
        public String getHstsIncludeSubdomains() {
            return this.hstsIncludeSubdomains;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setHstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public String getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setHstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public String getHstsPreload() {
            return this.hstsPreload;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setHttpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }
        public String getHttpsForce() {
            return this.httpsForce;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setHttpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
            return this;
        }
        public String getHttpsForceCode() {
            return this.httpsForceCode;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestHttpsApplicationConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class CreateSiteFunctionRequestHttpsBasicConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256</p>
         */
        @NameInMap("Ciphersuite")
        public String ciphersuite;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("CiphersuiteGroup")
        public String ciphersuiteGroup;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http2")
        public String http2;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http3")
        public String http3;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Https")
        public String https;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OcspStapling")
        public String ocspStapling;

        /**
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls10")
        public String tls10;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls11")
        public String tls11;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls12")
        public String tls12;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls13")
        public String tls13;

        public static CreateSiteFunctionRequestHttpsBasicConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestHttpsBasicConfiguration self = new CreateSiteFunctionRequestHttpsBasicConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setCiphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setCiphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setHttp3(String http3) {
            this.http3 = http3;
            return this;
        }
        public String getHttp3() {
            return this.http3;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setHttps(String https) {
            this.https = https;
            return this;
        }
        public String getHttps() {
            return this.https;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setOcspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
            return this;
        }
        public String getOcspStapling() {
            return this.ocspStapling;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setTls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }
        public String getTls10() {
            return this.tls10;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setTls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }
        public String getTls11() {
            return this.tls11;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setTls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }
        public String getTls12() {
            return this.tls12;
        }

        public CreateSiteFunctionRequestHttpsBasicConfiguration setTls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public String getTls13() {
            return this.tls13;
        }

    }

    public static class CreateSiteFunctionRequestImageTransform extends TeaModel {
        /**
         * <p>Specifies whether to enable image transformations. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestImageTransform build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestImageTransform self = new CreateSiteFunctionRequestImageTransform();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestImageTransform setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestIpv6 extends TeaModel {
        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li>on (default)</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestIpv6 build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestIpv6 self = new CreateSiteFunctionRequestIpv6();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestIpv6 setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestManagedTransforms extends TeaModel {
        /**
         * <p>Specifies whether to include the header that indicates the geographical location of a client in an origin request. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AddClientGeolocationHeaders")
        public String addClientGeolocationHeaders;

        /**
         * <p>Specifies whether to include the &quot;ali-real-client-ip&quot; header that contains the client\&quot;s real IP address in an origin request. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AddRealClientIpHeader")
        public String addRealClientIpHeader;

        public static CreateSiteFunctionRequestManagedTransforms build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestManagedTransforms self = new CreateSiteFunctionRequestManagedTransforms();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestManagedTransforms setAddClientGeolocationHeaders(String addClientGeolocationHeaders) {
            this.addClientGeolocationHeaders = addClientGeolocationHeaders;
            return this;
        }
        public String getAddClientGeolocationHeaders() {
            return this.addClientGeolocationHeaders;
        }

        public CreateSiteFunctionRequestManagedTransforms setAddRealClientIpHeader(String addRealClientIpHeader) {
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }
        public String getAddRealClientIpHeader() {
            return this.addRealClientIpHeader;
        }

    }

    public static class CreateSiteFunctionRequestNetworkOptimization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Grpc")
        public String grpc;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http2Origin")
        public String http2Origin;

        /**
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SmartRouting")
        public String smartRouting;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Websocket")
        public String websocket;

        public static CreateSiteFunctionRequestNetworkOptimization build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestNetworkOptimization self = new CreateSiteFunctionRequestNetworkOptimization();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestNetworkOptimization setGrpc(String grpc) {
            this.grpc = grpc;
            return this;
        }
        public String getGrpc() {
            return this.grpc;
        }

        public CreateSiteFunctionRequestNetworkOptimization setHttp2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        public CreateSiteFunctionRequestNetworkOptimization setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestNetworkOptimization setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestNetworkOptimization setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionRequestNetworkOptimization setSmartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }
        public String getSmartRouting() {
            return this.smartRouting;
        }

        public CreateSiteFunctionRequestNetworkOptimization setUploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        public CreateSiteFunctionRequestNetworkOptimization setWebsocket(String websocket) {
            this.websocket = websocket;
            return this;
        }
        public String getWebsocket() {
            return this.websocket;
        }

    }

    public static class CreateSiteFunctionRequestOriginProtection extends TeaModel {
        /**
         * <p>Specifies whether to enable origin protection. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestOriginProtection build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestOriginProtection self = new CreateSiteFunctionRequestOriginProtection();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestOriginProtection setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestOriginRules extends TeaModel {
        /**
         * <p>The hostname that overrides the resolved hostname of an incoming request.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("DnsRecord")
        public String dnsRecord;

        /**
         * <p>The Host header in origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("OriginHttpPort")
        public String originHttpPort;

        /**
         * <strong>example:</strong>
         * <p>4433</p>
         */
        @NameInMap("OriginHttpsPort")
        public String originHttpsPort;

        /**
         * <p>The protocol used for origin requests. Valid values:</p>
         * <ul>
         * <li>http: HTTP.</li>
         * <li>https: HTTPS.</li>
         * <li>follow: follows the protocol used by the client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("OriginScheme")
        public String originScheme;

        /**
         * <p>The SNI in origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginSni")
        public String originSni;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Range")
        public String range;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static CreateSiteFunctionRequestOriginRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestOriginRules self = new CreateSiteFunctionRequestOriginRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestOriginRules setDnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public String getDnsRecord() {
            return this.dnsRecord;
        }

        public CreateSiteFunctionRequestOriginRules setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public CreateSiteFunctionRequestOriginRules setOriginHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }
        public String getOriginHttpPort() {
            return this.originHttpPort;
        }

        public CreateSiteFunctionRequestOriginRules setOriginHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }
        public String getOriginHttpsPort() {
            return this.originHttpsPort;
        }

        public CreateSiteFunctionRequestOriginRules setOriginScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }
        public String getOriginScheme() {
            return this.originScheme;
        }

        public CreateSiteFunctionRequestOriginRules setOriginSni(String originSni) {
            this.originSni = originSni;
            return this;
        }
        public String getOriginSni() {
            return this.originSni;
        }

        public CreateSiteFunctionRequestOriginRules setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public CreateSiteFunctionRequestOriginRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestOriginRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestOriginRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class CreateSiteFunctionRequestRedirectRules extends TeaModel {
        /**
         * <p>Specifies whether to retain the query string. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ReserveQueryString")
        public String reserveQueryString;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The response code that you want to use to indicate URL redirection. Valid value:</p>
         * <ul>
         * <li>301</li>
         * <li>302</li>
         * <li>303</li>
         * <li>307</li>
         * <li>308</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The destination URL to which requests are redirected.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The redirect type. Valid value:</p>
         * <ul>
         * <li>static</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateSiteFunctionRequestRedirectRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestRedirectRules self = new CreateSiteFunctionRequestRedirectRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestRedirectRules setReserveQueryString(String reserveQueryString) {
            this.reserveQueryString = reserveQueryString;
            return this;
        }
        public String getReserveQueryString() {
            return this.reserveQueryString;
        }

        public CreateSiteFunctionRequestRedirectRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestRedirectRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestRedirectRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionRequestRedirectRules setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CreateSiteFunctionRequestRedirectRules setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateSiteFunctionRequestRedirectRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateSiteFunctionRequestRewriteUrlRules extends TeaModel {
        /**
         * <p>The desired query string to which you want to rewrite the query string in the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>?example=123</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>The query string rewrite method. Valid values:</p>
         * <ul>
         * <li>static</li>
         * <li>dynamic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("RewriteQueryStringType")
        public String rewriteQueryStringType;

        /**
         * <p>The path rewrite method. Valid values:</p>
         * <ul>
         * <li>static</li>
         * <li>dynamic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("RewriteUriType")
        public String rewriteUriType;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether to enable the rule. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The desired URI to which you want to rewrite the path in the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>/image.example.com/index.html</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static CreateSiteFunctionRequestRewriteUrlRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestRewriteUrlRules self = new CreateSiteFunctionRequestRewriteUrlRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestRewriteUrlRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public CreateSiteFunctionRequestRewriteUrlRules setRewriteQueryStringType(String rewriteQueryStringType) {
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        public CreateSiteFunctionRequestRewriteUrlRules setRewriteUriType(String rewriteUriType) {
            this.rewriteUriType = rewriteUriType;
            return this;
        }
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        public CreateSiteFunctionRequestRewriteUrlRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionRequestRewriteUrlRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionRequestRewriteUrlRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionRequestRewriteUrlRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateSiteFunctionRequestSeoBypass extends TeaModel {
        /**
         * <p>Specifies whether to enable SEO crawler bypassing. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestSeoBypass build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestSeoBypass self = new CreateSiteFunctionRequestSeoBypass();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestSeoBypass setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestSiteNameExclusive extends TeaModel {
        /**
         * <p>Specifies whether to enable site hold. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionRequestSiteNameExclusive build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestSiteNameExclusive self = new CreateSiteFunctionRequestSiteNameExclusive();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestSiteNameExclusive setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionRequestSitePause extends TeaModel {
        /**
         * <p>Specifies whether ESA is paused on the website. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Paused")
        public String paused;

        public static CreateSiteFunctionRequestSitePause build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestSitePause self = new CreateSiteFunctionRequestSitePause();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestSitePause setPaused(String paused) {
            this.paused = paused;
            return this;
        }
        public String getPaused() {
            return this.paused;
        }

    }

    public static class CreateSiteFunctionRequestTieredCache extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>edge_smart</p>
         */
        @NameInMap("CacheArchitectureMode")
        public String cacheArchitectureMode;

        public static CreateSiteFunctionRequestTieredCache build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionRequestTieredCache self = new CreateSiteFunctionRequestTieredCache();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionRequestTieredCache setCacheArchitectureMode(String cacheArchitectureMode) {
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }
        public String getCacheArchitectureMode() {
            return this.cacheArchitectureMode;
        }

    }

}
