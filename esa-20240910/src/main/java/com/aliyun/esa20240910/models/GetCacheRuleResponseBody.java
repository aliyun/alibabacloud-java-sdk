// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCacheRuleResponseBody extends TeaModel {
    /**
     * <ul>
     * <li><p>Additional ports on which caching is enabled.</p>
     * </li>
     * <li><p>Valid values: <code>8880</code>, <code>2052</code>, <code>2082</code>, <code>2086</code>, <code>2095</code>, <code>2053</code>, <code>2083</code>, <code>2087</code>, <code>2096</code>.</p>
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
     * <li><p><code>no_cache</code>: Does not cache content.</p>
     * </li>
     * <li><p><code>follow_origin</code>: Follows the origin cache policy.</p>
     * </li>
     * <li><p><code>override_origin</code>: Overrides the origin cache policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("BrowserCacheMode")
    public String browserCacheMode;

    /**
     * <p>The browser cache TTL, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("BrowserCacheTtl")
    public String browserCacheTtl;

    /**
     * <p>Specifies whether to cache requests or bypass the cache. Valid values:</p>
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
     * <p>Specifies whether to enable Cache Deception Armor. This feature helps mitigate web cache deception attacks by ensuring that only validated content is cached. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CacheDeceptionArmor")
    public String cacheDeceptionArmor;

    /**
     * <p>The eligibility for cache reserve. This controls whether a request bypasses the cache reserve node during an origin fetch. Valid values:</p>
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
     * <p>Specifies cookies whose presence is checked when generating a cache key. If a specified cookie exists in the request, its name (case-insensitive) is added to the cache key. Separate multiple cookie names with spaces. Cookie names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: lowercase English letters a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cookiename1 cookiename2</p>
     */
    @NameInMap("CheckPresenceCookie")
    public String checkPresenceCookie;

    /**
     * <p>Specifies headers whose presence is checked when generating a cache key. If a specified header exists in the request, its name (case-insensitive) is added to the cache key. Separate multiple header names with spaces. Header names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: lowercase English letters a-z</p>
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
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Indicates whether the response contains a global or a rule configuration. Valid values:</p>
     * <ul>
     * <li><p><code>global</code>: A global configuration.</p>
     * </li>
     * <li><p><code>rule</code>: A rule configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The edge cache mode. Valid values:</p>
     * <ul>
     * <li><p><code>follow_origin</code>: Uses the origin server\&quot;s cache policy. If none is provided, the default policy applies.</p>
     * </li>
     * <li><p><code>no_cache</code>: Does not cache content.</p>
     * </li>
     * <li><p><code>override_origin</code>: Overrides the origin cache policy.</p>
     * </li>
     * <li><p><code>follow_origin_bypass</code>: Uses the origin server\&quot;s cache policy. If none is provided, content is not cached.</p>
     * </li>
     * <li><p><code>follow_origin_override</code>: Uses the origin server\&quot;s cache policy. If none is provided, a custom cache TTL applies.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("EdgeCacheMode")
    public String edgeCacheMode;

    /**
     * <p>The edge cache TTL, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeCacheTtl")
    public String edgeCacheTtl;

    /**
     * <p>The status code cache TTL, in seconds.</p>
     * <ul>
     * <li><p>Set the cache TTL for a specific status code. For example, <code>404=10</code> specifies that responses with a 404 status code are cached for 10 seconds.</p>
     * </li>
     * <li><p>Set the cache TTL for status code classes, such as 4xx and 5xx. For example, <code>4xx=10</code> specifies that all responses with a 4xx status code are cached for 10 seconds.</p>
     * </li>
     * <li><p>Separate multiple entries with commas.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5xx=0,404=10</p>
     */
    @NameInMap("EdgeStatusCodeCacheTtl")
    public String edgeStatusCodeCacheTtl;

    /**
     * <p>Specifies the cookies to include in the cache key. Both the cookie names (case-insensitive) and their values are added to the key. Separate multiple cookie names with spaces. Cookie names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: lowercase English letters a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cookiename1 cookiename2</p>
     */
    @NameInMap("IncludeCookie")
    public String includeCookie;

    /**
     * <p>Specifies the headers to include in the cache key. Both the header names (case-insensitive) and their values are added to the key. Separate multiple header names with spaces. Header names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: lowercase English letters a-z</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>headername1 headername2</p>
     */
    @NameInMap("IncludeHeader")
    public String includeHeader;

    /**
     * <p>The mode for handling the body content when generating a cache key for POST requests. Valid values:</p>
     * <ul>
     * <li><p><code>md5</code>: Calculates the MD5 hash of the body content and adds the hash to the cache key.</p>
     * </li>
     * <li><p><code>ignore</code>: Ignores the body content in the cache key.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("PostBodyCacheKey")
    public String postBodyCacheKey;

    /**
     * <p>The size limit (in KB) of the body content for POST caching. The value is an integer from 1 to 8. A null or empty value defaults to 8 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostBodySizeLimit")
    public String postBodySizeLimit;

    /**
     * <p>Specifies whether to enable the POST cache feature.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PostCache")
    public String postCache;

    /**
     * <p>Specifies the query strings to include in or exclude from the cache key. Separate multiple query strings with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>The mode for handling query strings when generating a cache key. Valid values:</p>
     * <ul>
     * <li><p><code>ignore_all</code>: Ignores all query strings.</p>
     * </li>
     * <li><p><code>exclude_query_string</code>: Excludes specified query strings.</p>
     * </li>
     * <li><p><code>reserve_all</code>: Retains all query strings. This is the default value.</p>
     * </li>
     * <li><p><code>include_query_string</code>: Includes specified query strings.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>reserve_all</p>
     */
    @NameInMap("QueryStringMode")
    public String queryStringMode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule content, which is a conditional expression used to match user requests. This parameter applies only to rule configurations.</p>
     * <ul>
     * <li><p>To match all incoming requests, use <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, use a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether the rule is enabled. This parameter applies only to rule configurations. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The name of the rule. This parameter applies only to rule configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Specifies whether to serve stale content. If enabled, edge nodes serve stale (expired) content from the cache when the origin server is unavailable. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ServeStale")
    public String serveStale;

    /**
     * <p>The version number of the site configuration. For sites with version management enabled, this indicates the configuration version. The default is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Specifies whether to sort query strings before generating the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("SortQueryStringForCache")
    public String sortQueryStringForCache;

    /**
     * <p>Specifies whether to include the client\&quot;s device type in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserDeviceType")
    public String userDeviceType;

    /**
     * <p>Specifies whether to include the client\&quot;s geographic location in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserGeo")
    public String userGeo;

    /**
     * <p>Specifies whether to include the client\&quot;s language in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enabled.</p>
     * </li>
     * <li><p><code>off</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("UserLanguage")
    public String userLanguage;

    public static GetCacheRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCacheRuleResponseBody self = new GetCacheRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCacheRuleResponseBody setAdditionalCacheablePorts(String additionalCacheablePorts) {
        this.additionalCacheablePorts = additionalCacheablePorts;
        return this;
    }
    public String getAdditionalCacheablePorts() {
        return this.additionalCacheablePorts;
    }

    public GetCacheRuleResponseBody setBrowserCacheMode(String browserCacheMode) {
        this.browserCacheMode = browserCacheMode;
        return this;
    }
    public String getBrowserCacheMode() {
        return this.browserCacheMode;
    }

    public GetCacheRuleResponseBody setBrowserCacheTtl(String browserCacheTtl) {
        this.browserCacheTtl = browserCacheTtl;
        return this;
    }
    public String getBrowserCacheTtl() {
        return this.browserCacheTtl;
    }

    public GetCacheRuleResponseBody setBypassCache(String bypassCache) {
        this.bypassCache = bypassCache;
        return this;
    }
    public String getBypassCache() {
        return this.bypassCache;
    }

    public GetCacheRuleResponseBody setCacheDeceptionArmor(String cacheDeceptionArmor) {
        this.cacheDeceptionArmor = cacheDeceptionArmor;
        return this;
    }
    public String getCacheDeceptionArmor() {
        return this.cacheDeceptionArmor;
    }

    public GetCacheRuleResponseBody setCacheReserveEligibility(String cacheReserveEligibility) {
        this.cacheReserveEligibility = cacheReserveEligibility;
        return this;
    }
    public String getCacheReserveEligibility() {
        return this.cacheReserveEligibility;
    }

    public GetCacheRuleResponseBody setCheckPresenceCookie(String checkPresenceCookie) {
        this.checkPresenceCookie = checkPresenceCookie;
        return this;
    }
    public String getCheckPresenceCookie() {
        return this.checkPresenceCookie;
    }

    public GetCacheRuleResponseBody setCheckPresenceHeader(String checkPresenceHeader) {
        this.checkPresenceHeader = checkPresenceHeader;
        return this;
    }
    public String getCheckPresenceHeader() {
        return this.checkPresenceHeader;
    }

    public GetCacheRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetCacheRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetCacheRuleResponseBody setEdgeCacheMode(String edgeCacheMode) {
        this.edgeCacheMode = edgeCacheMode;
        return this;
    }
    public String getEdgeCacheMode() {
        return this.edgeCacheMode;
    }

    public GetCacheRuleResponseBody setEdgeCacheTtl(String edgeCacheTtl) {
        this.edgeCacheTtl = edgeCacheTtl;
        return this;
    }
    public String getEdgeCacheTtl() {
        return this.edgeCacheTtl;
    }

    public GetCacheRuleResponseBody setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
        this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
        return this;
    }
    public String getEdgeStatusCodeCacheTtl() {
        return this.edgeStatusCodeCacheTtl;
    }

    public GetCacheRuleResponseBody setIncludeCookie(String includeCookie) {
        this.includeCookie = includeCookie;
        return this;
    }
    public String getIncludeCookie() {
        return this.includeCookie;
    }

    public GetCacheRuleResponseBody setIncludeHeader(String includeHeader) {
        this.includeHeader = includeHeader;
        return this;
    }
    public String getIncludeHeader() {
        return this.includeHeader;
    }

    public GetCacheRuleResponseBody setPostBodyCacheKey(String postBodyCacheKey) {
        this.postBodyCacheKey = postBodyCacheKey;
        return this;
    }
    public String getPostBodyCacheKey() {
        return this.postBodyCacheKey;
    }

    public GetCacheRuleResponseBody setPostBodySizeLimit(String postBodySizeLimit) {
        this.postBodySizeLimit = postBodySizeLimit;
        return this;
    }
    public String getPostBodySizeLimit() {
        return this.postBodySizeLimit;
    }

    public GetCacheRuleResponseBody setPostCache(String postCache) {
        this.postCache = postCache;
        return this;
    }
    public String getPostCache() {
        return this.postCache;
    }

    public GetCacheRuleResponseBody setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

    public GetCacheRuleResponseBody setQueryStringMode(String queryStringMode) {
        this.queryStringMode = queryStringMode;
        return this;
    }
    public String getQueryStringMode() {
        return this.queryStringMode;
    }

    public GetCacheRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCacheRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetCacheRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetCacheRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetCacheRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetCacheRuleResponseBody setServeStale(String serveStale) {
        this.serveStale = serveStale;
        return this;
    }
    public String getServeStale() {
        return this.serveStale;
    }

    public GetCacheRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public GetCacheRuleResponseBody setSortQueryStringForCache(String sortQueryStringForCache) {
        this.sortQueryStringForCache = sortQueryStringForCache;
        return this;
    }
    public String getSortQueryStringForCache() {
        return this.sortQueryStringForCache;
    }

    public GetCacheRuleResponseBody setUserDeviceType(String userDeviceType) {
        this.userDeviceType = userDeviceType;
        return this;
    }
    public String getUserDeviceType() {
        return this.userDeviceType;
    }

    public GetCacheRuleResponseBody setUserGeo(String userGeo) {
        this.userGeo = userGeo;
        return this;
    }
    public String getUserGeo() {
        return this.userGeo;
    }

    public GetCacheRuleResponseBody setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
        return this;
    }
    public String getUserLanguage() {
        return this.userLanguage;
    }

}
