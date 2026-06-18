// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheRuleRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>Enables caching on the specified ports.</p>
     * </li>
     * <li><p>Valid values: <code>8880</code>, <code>2052</code>, <code>2082</code>, <code>2086</code>, <code>2095</code>, <code>2053</code>, <code>2083</code>, <code>2087</code>, <code>2096</code></p>
     * </li>
     * <li><p>Separate multiple ports with commas.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8880,2052,2086</p>
     */
    @NameInMap("AdditionalCacheablePorts")
    public String additionalCacheablePorts;

    /**
     * <p>The browser cache mode. Valid values:</p>
     * <ul>
     * <li><p><code>no_cache</code>: Does not cache content in the browser.</p>
     * </li>
     * <li><p><code>follow_origin</code>: Follows the caching policy of the origin server.</p>
     * </li>
     * <li><p><code>override_origin</code>: Overrides the caching policy of the origin server.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no_cache</p>
     */
    @NameInMap("BrowserCacheMode")
    public String browserCacheMode;

    /**
     * <p>The browser cache TTL (Time to Live), in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("BrowserCacheTtl")
    public String browserCacheTtl;

    /**
     * <p>The cache bypass mode. Valid values:</p>
     * <ul>
     * <li><p><code>cache_all</code>: Caches all requests.</p>
     * </li>
     * <li><p><code>bypass_all</code>: Bypasses the cache for all requests.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cache_all</p>
     */
    @NameInMap("BypassCache")
    public String bypassCache;

    /**
     * <p>Defends against Web Cache Deception attacks by caching only validated content. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CacheDeceptionArmor")
    public String cacheDeceptionArmor;

    /**
     * <p>Controls whether requests bypass the cache reserve node during an origin-pull. Valid values:</p>
     * <ul>
     * <li><p><code>bypass_cache_reserve</code>: The request bypasses the cache reserve.</p>
     * </li>
     * <li><p><code>eligible_for_cache_reserve</code>: The request is eligible for cache reserve.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bypass_cache_reserve</p>
     */
    @NameInMap("CacheReserveEligibility")
    public String cacheReserveEligibility;

    /**
     * <p>The cookies to check for. If a specified cookie is present in the request, its name (case-insensitive) is added to the cache key. Separate multiple cookies with spaces. Cookie names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Lowercase letters: a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cookiename1 cookiename2</p>
     */
    @NameInMap("CheckPresenceCookie")
    public String checkPresenceCookie;

    /**
     * <p>The headers to check for. If a specified header is present in the request, its name (case-insensitive) is added to the cache key. Separate multiple headers with spaces. Header names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Lowercase letters: a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>headername1 headername2</p>
     */
    @NameInMap("CheckPresenceHeader")
    public String checkPresenceHeader;

    /**
     * <p>The configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The cache mode for the edge node. Valid values:</p>
     * <ul>
     * <li><p><code>follow_origin</code>: Follows the origin server\&quot;s caching policy. If the origin server has no policy, the default policy is used.</p>
     * </li>
     * <li><p><code>no_cache</code>: Does not cache content.</p>
     * </li>
     * <li><p><code>override_origin</code>: Overrides the caching policy of the origin server.</p>
     * </li>
     * <li><p><code>follow_origin_bypass</code>: Follows the caching policy of the origin server, if one exists. Otherwise, content is not cached.</p>
     * </li>
     * <li><p><code>follow_origin_override</code>: Follows the caching policy of the origin server, if one exists. Otherwise, a custom cache TTL is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("EdgeCacheMode")
    public String edgeCacheMode;

    /**
     * <p>The edge node cache TTL (Time to Live), in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeCacheTtl")
    public String edgeCacheTtl;

    /**
     * <p>The cache TTL for specific status codes, in seconds.</p>
     * <ul>
     * <li><p>You can set the cache TTL for a specific status code. For example, <code>404=10</code> caches responses with a 404 status code for 10 seconds.</p>
     * </li>
     * <li><p>You can set the cache TTL for <code>4xx</code> and <code>5xx</code> status code ranges. For example, <code>4xx=10</code> caches all responses with a <code>4xx</code> status code for 10 seconds.</p>
     * </li>
     * <li><p>Separate multiple status code settings with commas.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5xx=0,404=10</p>
     */
    @NameInMap("EdgeStatusCodeCacheTtl")
    public String edgeStatusCodeCacheTtl;

    /**
     * <p>The cookies to include in the cache key. Both the cookie names (case-insensitive) and their values are used. Separate multiple cookies with spaces. Cookie names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Lowercase letters: a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cookiename1 cookiename2</p>
     */
    @NameInMap("IncludeCookie")
    public String includeCookie;

    /**
     * <p>The headers to include in the cache key. Both the header names (case-insensitive) and their values are used. Separate multiple headers with spaces. Header names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Lowercase letters: a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>headername1 headername2</p>
     */
    @NameInMap("IncludeHeader")
    public String includeHeader;

    /**
     * <p>Controls how the request body is used to generate the cache key for POST requests. Valid values:</p>
     * <ul>
     * <li><p><code>md5</code>: Calculates the MD5 hash of the request body and includes the hash in the cache key.</p>
     * </li>
     * <li><p><code>ignore</code>: Ignores the request body when generating the cache key.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("PostBodyCacheKey")
    public String postBodyCacheKey;

    /**
     * <p>The maximum size of a request body for POST caching, in KB. The value must be an integer from 1 to 8. If you leave this parameter empty, the default value of 8 KB is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostBodySizeLimit")
    public String postBodySizeLimit;

    /**
     * <p>Controls whether to cache responses to POST requests.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PostCache")
    public String postCache;

    /**
     * <p>The query string parameters to include in or exclude from the cache key. Separate multiple parameters with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>example1 example2</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>Controls how query strings are used to generate a cache key. Valid values:</p>
     * <ul>
     * <li><p><code>ignore_all</code>: Ignores all query strings.</p>
     * </li>
     * <li><p><code>exclude_query_string</code>: Removes specified query strings.</p>
     * </li>
     * <li><p><code>reserve_all</code>: Retains all query strings. This is the default value.</p>
     * </li>
     * <li><p><code>include_query_string</code>: Retains only specified query strings.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore_all</p>
     */
    @NameInMap("QueryStringMode")
    public String queryStringMode;

    /**
     * <p>A conditional expression that matches user requests. This parameter is optional for a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, for example, <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Controls whether the rule is enabled. This parameter is optional for a global configuration. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the rule.</p>
     * </li>
     * <li><p><code>off</code>: Disables the rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the rule. This parameter is optional for a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution priority of the rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Controls whether to serve stale content. If enabled, an edge node can serve expired content from its cache if the origin server is unavailable. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables this feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables this feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ServeStale")
    public String serveStale;

    /**
     * <p>The ID of the site. To get this ID, call the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Controls whether to sort query string parameters when generating a cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables sorting.</p>
     * </li>
     * <li><p><code>off</code>: Disables sorting.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SortQueryStringForCache")
    public String sortQueryStringForCache;

    /**
     * <p>Controls whether to include the client device type in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables this feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables this feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserDeviceType")
    public String userDeviceType;

    /**
     * <p>Controls whether to include the client\&quot;s geographic location in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables this feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables this feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserGeo")
    public String userGeo;

    /**
     * <p>Controls whether to include the client\&quot;s language in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables this feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables this feature.</p>
     * </li>
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

    public UpdateCacheRuleRequest setPostBodyCacheKey(String postBodyCacheKey) {
        this.postBodyCacheKey = postBodyCacheKey;
        return this;
    }
    public String getPostBodyCacheKey() {
        return this.postBodyCacheKey;
    }

    public UpdateCacheRuleRequest setPostBodySizeLimit(String postBodySizeLimit) {
        this.postBodySizeLimit = postBodySizeLimit;
        return this;
    }
    public String getPostBodySizeLimit() {
        return this.postBodySizeLimit;
    }

    public UpdateCacheRuleRequest setPostCache(String postCache) {
        this.postCache = postCache;
        return this;
    }
    public String getPostCache() {
        return this.postCache;
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
