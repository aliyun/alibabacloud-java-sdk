// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheRuleRequest extends TeaModel {
    /**
     * <p>Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096.</p>
     * 
     * <strong>example:</strong>
     * <p>8880</p>
     */
    @NameInMap("AdditionalCacheablePorts")
    public String additionalCacheablePorts;

    /**
     * <p>Browser cache mode. Value range:</p>
     * <ul>
     * <li>no_cache: Do not cache.</li>
     * <li>follow_origin: Follow origin cache policy.</li>
     * <li>override_origin: Override origin cache policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no_cache</p>
     */
    @NameInMap("BrowserCacheMode")
    public String browserCacheMode;

    /**
     * <p>Browser cache expiration time, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("BrowserCacheTtl")
    public String browserCacheTtl;

    /**
     * <p>Set bypass cache mode. Value range:</p>
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
     * <p>Cache deception defense. Used to defend against web cache deception attacks; only the cache content that passes the validation will be cached. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CacheDeceptionArmor")
    public String cacheDeceptionArmor;

    /**
     * <p>Cache retention eligibility. Used to control whether user requests bypass the cache retention node when returning to the origin. Value range:</p>
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
     * <p>Check if the cookie exists when generating cache keys, and if it does, add the cookie name (case-insensitive) to the cache key. Supports multiple cookie names, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>cookiename</p>
     */
    @NameInMap("CheckPresenceCookie")
    public String checkPresenceCookie;

    /**
     * <p>Check if the header exists when generating cache keys, and if it does, add the header name (case-insensitive) to the cache key. Supports multiple header names, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>headername</p>
     */
    @NameInMap("CheckPresenceHeader")
    public String checkPresenceHeader;

    /**
     * <p>Configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Edge cache mode. Value range:</p>
     * <ul>
     * <li>follow_origin: Follow origin cache policy (if exists), otherwise use the default cache policy.</li>
     * <li>no_cache: Do not cache.</li>
     * <li>override_origin: Override origin cache policy.</li>
     * <li>follow_origin_bypass: Follow origin cache policy (if exists), otherwise do not cache.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("EdgeCacheMode")
    public String edgeCacheMode;

    /**
     * <p>Edge cache expiration time, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeCacheTtl")
    public String edgeCacheTtl;

    /**
     * <p>Status code cache expiration time, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeStatusCodeCacheTtl")
    public String edgeStatusCodeCacheTtl;

    /**
     * <p>Include the specified cookie names and their values when generating cache keys, supporting multiple values separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>cookiename</p>
     */
    @NameInMap("IncludeCookie")
    public String includeCookie;

    /**
     * <p>Include the specified header names and their values when generating cache keys, supporting multiple values separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>headername</p>
     */
    @NameInMap("IncludeHeader")
    public String includeHeader;

    /**
     * <p>Query strings to be retained or excluded, supporting multiple values separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>The processing mode of query strings when generating cache keys. Values:</p>
     * <ul>
     * <li>ignore_all: Ignore all.</li>
     * <li>exclude_query_string: Exclude specified query strings.</li>
     * <li>reserve_all: Default, reserve all.</li>
     * <li>include_query_string: Include specified query strings.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore_all</p>
     */
    @NameInMap("QueryStringMode")
    public String queryStringMode;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
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
     * <p>Rule name. This parameter is not required when adding a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Serve stale cache. When enabled, the node can still use the expired cached files to respond to user requests even if the origin server is unavailable. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
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
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Query string sorting. Value range:</p>
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
     * <p>When generating cache keys, include the client device type. Value range: </p>
     * <ul>
     * <li>on: enabled. </li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserDeviceType")
    public String userDeviceType;

    /**
     * <p>Include the client\&quot;s geographical location when generating the cache key. Value range:</p>
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
     * <p>Include the client\&quot;s language type when generating the cache key. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserLanguage")
    public String userLanguage;

    public static UpdateCacheRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheRuleRequest self = new UpdateCacheRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCacheRuleRequest setAdditionalCacheablePorts(String additionalCacheablePorts) {
        this.additionalCacheablePorts = additionalCacheablePorts;
        return this;
    }
    public String getAdditionalCacheablePorts() {
        return this.additionalCacheablePorts;
    }

    public UpdateCacheRuleRequest setBrowserCacheMode(String browserCacheMode) {
        this.browserCacheMode = browserCacheMode;
        return this;
    }
    public String getBrowserCacheMode() {
        return this.browserCacheMode;
    }

    public UpdateCacheRuleRequest setBrowserCacheTtl(String browserCacheTtl) {
        this.browserCacheTtl = browserCacheTtl;
        return this;
    }
    public String getBrowserCacheTtl() {
        return this.browserCacheTtl;
    }

    public UpdateCacheRuleRequest setBypassCache(String bypassCache) {
        this.bypassCache = bypassCache;
        return this;
    }
    public String getBypassCache() {
        return this.bypassCache;
    }

    public UpdateCacheRuleRequest setCacheDeceptionArmor(String cacheDeceptionArmor) {
        this.cacheDeceptionArmor = cacheDeceptionArmor;
        return this;
    }
    public String getCacheDeceptionArmor() {
        return this.cacheDeceptionArmor;
    }

    public UpdateCacheRuleRequest setCacheReserveEligibility(String cacheReserveEligibility) {
        this.cacheReserveEligibility = cacheReserveEligibility;
        return this;
    }
    public String getCacheReserveEligibility() {
        return this.cacheReserveEligibility;
    }

    public UpdateCacheRuleRequest setCheckPresenceCookie(String checkPresenceCookie) {
        this.checkPresenceCookie = checkPresenceCookie;
        return this;
    }
    public String getCheckPresenceCookie() {
        return this.checkPresenceCookie;
    }

    public UpdateCacheRuleRequest setCheckPresenceHeader(String checkPresenceHeader) {
        this.checkPresenceHeader = checkPresenceHeader;
        return this;
    }
    public String getCheckPresenceHeader() {
        return this.checkPresenceHeader;
    }

    public UpdateCacheRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateCacheRuleRequest setEdgeCacheMode(String edgeCacheMode) {
        this.edgeCacheMode = edgeCacheMode;
        return this;
    }
    public String getEdgeCacheMode() {
        return this.edgeCacheMode;
    }

    public UpdateCacheRuleRequest setEdgeCacheTtl(String edgeCacheTtl) {
        this.edgeCacheTtl = edgeCacheTtl;
        return this;
    }
    public String getEdgeCacheTtl() {
        return this.edgeCacheTtl;
    }

    public UpdateCacheRuleRequest setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
        this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
        return this;
    }
    public String getEdgeStatusCodeCacheTtl() {
        return this.edgeStatusCodeCacheTtl;
    }

    public UpdateCacheRuleRequest setIncludeCookie(String includeCookie) {
        this.includeCookie = includeCookie;
        return this;
    }
    public String getIncludeCookie() {
        return this.includeCookie;
    }

    public UpdateCacheRuleRequest setIncludeHeader(String includeHeader) {
        this.includeHeader = includeHeader;
        return this;
    }
    public String getIncludeHeader() {
        return this.includeHeader;
    }

    public UpdateCacheRuleRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public UpdateCacheRuleRequest setQueryStringMode(String queryStringMode) {
        this.queryStringMode = queryStringMode;
        return this;
    }
    public String getQueryStringMode() {
        return this.queryStringMode;
    }

    public UpdateCacheRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateCacheRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateCacheRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateCacheRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateCacheRuleRequest setServeStale(String serveStale) {
        this.serveStale = serveStale;
        return this;
    }
    public String getServeStale() {
        return this.serveStale;
    }

    public UpdateCacheRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateCacheRuleRequest setSortQueryStringForCache(String sortQueryStringForCache) {
        this.sortQueryStringForCache = sortQueryStringForCache;
        return this;
    }
    public String getSortQueryStringForCache() {
        return this.sortQueryStringForCache;
    }

    public UpdateCacheRuleRequest setUserDeviceType(String userDeviceType) {
        this.userDeviceType = userDeviceType;
        return this;
    }
    public String getUserDeviceType() {
        return this.userDeviceType;
    }

    public UpdateCacheRuleRequest setUserGeo(String userGeo) {
        this.userGeo = userGeo;
        return this;
    }
    public String getUserGeo() {
        return this.userGeo;
    }

    public UpdateCacheRuleRequest setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
        return this;
    }
    public String getUserLanguage() {
        return this.userLanguage;
    }

}
