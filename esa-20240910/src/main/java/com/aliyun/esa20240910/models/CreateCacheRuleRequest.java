// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCacheRuleRequest extends TeaModel {
    /**
     * <p>Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096</p>
     * 
     * <strong>example:</strong>
     * <p>8880</p>
     */
    @NameInMap("AdditionalCacheablePorts")
    public String additionalCacheablePorts;

    /**
     * <p>Browser cache mode. Possible values:</p>
     * <ul>
     * <li>no_cache: Do not cache.</li>
     * <li>follow_origin: Follow the origin server\&quot;s cache policy.</li>
     * <li>override_origin: Override the origin server\&quot;s cache policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("BrowserCacheMode")
    public String browserCacheMode;

    /**
     * <p>Browser cache expiration time in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("BrowserCacheTtl")
    public String browserCacheTtl;

    /**
     * <p>Set the bypass cache mode. Possible values:</p>
     * <ul>
     * <li>cache_all: Cache all requests.</li>
     * <li>bypass_all: Bypass cache for all requests.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cache_all</p>
     */
    @NameInMap("BypassCache")
    public String bypassCache;

    /**
     * <p>Cache deception protection. Used to defend against web cache deception attacks, only the cache content that passes the validation will be cached. Value range:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CacheDeceptionArmor")
    public String cacheDeceptionArmor;

    /**
     * <p>Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Possible values:</p>
     * <ul>
     * <li>bypass_cache_reserve: Requests bypass cache retention.</li>
     * <li>eligible_for_cache_reserve: Eligible for cache retention.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bypass_cache_reserve</p>
     */
    @NameInMap("CacheReserveEligibility")
    public String cacheReserveEligibility;

    /**
     * <p>When generating the cache key, check if the cookie exists. If it does, add the cookie name (case-insensitive) to the cache key. Multiple cookie names are supported, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>cookiename</p>
     */
    @NameInMap("CheckPresenceCookie")
    public String checkPresenceCookie;

    /**
     * <p>When generating the cache key, check if the header exists. If it does, add the header name (case-insensitive) to the cache key. Multiple header names are supported, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>headername</p>
     */
    @NameInMap("CheckPresenceHeader")
    public String checkPresenceHeader;

    /**
     * <p>Edge cache mode. Possible values:</p>
     * <ul>
     * <li>follow_origin: Follow the origin server\&quot;s cache policy (if it exists), otherwise use the default cache policy.</li>
     * <li>no_cache: Do not cache.</li>
     * <li>override_origin: Override the origin server\&quot;s cache policy.</li>
     * <li>follow_origin_bypass: Follow the origin server\&quot;s cache policy (if it exists), otherwise do not cache.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("EdgeCacheMode")
    public String edgeCacheMode;

    /**
     * <p>Edge cache expiration time in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeCacheTtl")
    public String edgeCacheTtl;

    /**
     * <p>Status code cache expiration time in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeStatusCodeCacheTtl")
    public String edgeStatusCodeCacheTtl;

    /**
     * <p>When generating the cache key, add the specified cookie names and their values. Multiple values are supported, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>cookie_exapmle</p>
     */
    @NameInMap("IncludeCookie")
    public String includeCookie;

    /**
     * <p>When generating the cache key, add the specified header names and their values. Multiple values are supported, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("IncludeHeader")
    public String includeHeader;

    /**
     * <p>Query strings to be reserved or excluded. Multiple values are supported, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>The processing mode for query strings when generating the cache key. Possible values:</p>
     * <ul>
     * <li>ignore_all: Ignore all.</li>
     * <li>exclude_query_string: Exclude specified query strings.</li>
     * <li>reserve_all: Default, reserve all.</li>
     * <li>include_query_string: Include specified query strings.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>reserve_all</p>
     */
    @NameInMap("QueryStringMode")
    public String queryStringMode;

    /**
     * <p>Rule content.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Serve stale cache. When enabled, the node can still respond to user requests with expired cached files when the origin server is unavailable. Value range:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ServeStale")
    public String serveStale;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version for the configuration to take effect. The default is version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Query string sorting, disabled by default. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SortQueryStringForCache")
    public String sortQueryStringForCache;

    /**
     * <p>When generating the cache key, add the client device type. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserDeviceType")
    public String userDeviceType;

    /**
     * <p>When generating the cache key, add the client\&quot;s geographic location. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserGeo")
    public String userGeo;

    /**
     * <p>When generating cache keys, include the client\&quot;s language type. The value can be: - on: enabled. - off: disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserLanguage")
    public String userLanguage;

    public static CreateCacheRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCacheRuleRequest self = new CreateCacheRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateCacheRuleRequest setAdditionalCacheablePorts(String additionalCacheablePorts) {
        this.additionalCacheablePorts = additionalCacheablePorts;
        return this;
    }
    public String getAdditionalCacheablePorts() {
        return this.additionalCacheablePorts;
    }

    public CreateCacheRuleRequest setBrowserCacheMode(String browserCacheMode) {
        this.browserCacheMode = browserCacheMode;
        return this;
    }
    public String getBrowserCacheMode() {
        return this.browserCacheMode;
    }

    public CreateCacheRuleRequest setBrowserCacheTtl(String browserCacheTtl) {
        this.browserCacheTtl = browserCacheTtl;
        return this;
    }
    public String getBrowserCacheTtl() {
        return this.browserCacheTtl;
    }

    public CreateCacheRuleRequest setBypassCache(String bypassCache) {
        this.bypassCache = bypassCache;
        return this;
    }
    public String getBypassCache() {
        return this.bypassCache;
    }

    public CreateCacheRuleRequest setCacheDeceptionArmor(String cacheDeceptionArmor) {
        this.cacheDeceptionArmor = cacheDeceptionArmor;
        return this;
    }
    public String getCacheDeceptionArmor() {
        return this.cacheDeceptionArmor;
    }

    public CreateCacheRuleRequest setCacheReserveEligibility(String cacheReserveEligibility) {
        this.cacheReserveEligibility = cacheReserveEligibility;
        return this;
    }
    public String getCacheReserveEligibility() {
        return this.cacheReserveEligibility;
    }

    public CreateCacheRuleRequest setCheckPresenceCookie(String checkPresenceCookie) {
        this.checkPresenceCookie = checkPresenceCookie;
        return this;
    }
    public String getCheckPresenceCookie() {
        return this.checkPresenceCookie;
    }

    public CreateCacheRuleRequest setCheckPresenceHeader(String checkPresenceHeader) {
        this.checkPresenceHeader = checkPresenceHeader;
        return this;
    }
    public String getCheckPresenceHeader() {
        return this.checkPresenceHeader;
    }

    public CreateCacheRuleRequest setEdgeCacheMode(String edgeCacheMode) {
        this.edgeCacheMode = edgeCacheMode;
        return this;
    }
    public String getEdgeCacheMode() {
        return this.edgeCacheMode;
    }

    public CreateCacheRuleRequest setEdgeCacheTtl(String edgeCacheTtl) {
        this.edgeCacheTtl = edgeCacheTtl;
        return this;
    }
    public String getEdgeCacheTtl() {
        return this.edgeCacheTtl;
    }

    public CreateCacheRuleRequest setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
        this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
        return this;
    }
    public String getEdgeStatusCodeCacheTtl() {
        return this.edgeStatusCodeCacheTtl;
    }

    public CreateCacheRuleRequest setIncludeCookie(String includeCookie) {
        this.includeCookie = includeCookie;
        return this;
    }
    public String getIncludeCookie() {
        return this.includeCookie;
    }

    public CreateCacheRuleRequest setIncludeHeader(String includeHeader) {
        this.includeHeader = includeHeader;
        return this;
    }
    public String getIncludeHeader() {
        return this.includeHeader;
    }

    public CreateCacheRuleRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public CreateCacheRuleRequest setQueryStringMode(String queryStringMode) {
        this.queryStringMode = queryStringMode;
        return this;
    }
    public String getQueryStringMode() {
        return this.queryStringMode;
    }

    public CreateCacheRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateCacheRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateCacheRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateCacheRuleRequest setServeStale(String serveStale) {
        this.serveStale = serveStale;
        return this;
    }
    public String getServeStale() {
        return this.serveStale;
    }

    public CreateCacheRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateCacheRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public CreateCacheRuleRequest setSortQueryStringForCache(String sortQueryStringForCache) {
        this.sortQueryStringForCache = sortQueryStringForCache;
        return this;
    }
    public String getSortQueryStringForCache() {
        return this.sortQueryStringForCache;
    }

    public CreateCacheRuleRequest setUserDeviceType(String userDeviceType) {
        this.userDeviceType = userDeviceType;
        return this;
    }
    public String getUserDeviceType() {
        return this.userDeviceType;
    }

    public CreateCacheRuleRequest setUserGeo(String userGeo) {
        this.userGeo = userGeo;
        return this;
    }
    public String getUserGeo() {
        return this.userGeo;
    }

    public CreateCacheRuleRequest setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
        return this;
    }
    public String getUserLanguage() {
        return this.userLanguage;
    }

}
