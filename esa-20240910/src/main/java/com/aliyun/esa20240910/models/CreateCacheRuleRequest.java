// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCacheRuleRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>Specifies additional ports on which caching is enabled.</p>
     * </li>
     * <li><p>Valid values: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, and 2096.</p>
     * </li>
     * <li><p>You can specify multiple ports, separated by commas (,).</p>
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
     * <li><p><code>no_cache</code>: Disables browser caching.</p>
     * </li>
     * <li><p><code>follow_origin</code>: Follows the origin server cache policy.</p>
     * </li>
     * <li><p><code>override_origin</code>: Overrides the origin server cache policy.</p>
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
     * <p>The bypass cache mode. Valid values:</p>
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
     * <p>Specifies whether to enable cache deception defense. This feature helps defend against web cache deception attacks. When this feature is enabled, only content that passes validation is cached. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the defense.</p>
     * </li>
     * <li><p><code>off</code>: Disables the defense.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CacheDeceptionArmor")
    public String cacheDeceptionArmor;

    /**
     * <p>Specifies whether requests bypass cache reservation nodes during an origin fetch. Valid values:</p>
     * <ul>
     * <li><p><code>bypass_cache_reserve</code>: The request bypasses cache reservation.</p>
     * </li>
     * <li><p><code>eligible_for_cache_reserve</code>: The request is eligible for cache reservation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bypass_cache_reserve</p>
     */
    @NameInMap("CacheReserveEligibility")
    public String cacheReserveEligibility;

    /**
     * <p>Specifies the cookies to check for presence when generating a cache key. If a specified cookie is present in the request, its name (case-insensitive) is included in the cache key. To specify multiple cookies, separate their names with spaces. The cookie names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: a-z (lowercase)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cookiename1 cookiename2</p>
     */
    @NameInMap("CheckPresenceCookie")
    public String checkPresenceCookie;

    /**
     * <p>Specifies the headers to check for presence when generating a cache key. If a specified header is present in the request, its name (case-insensitive) is included in the cache key. To specify multiple headers, separate their names with spaces. The header names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: a-z (lowercase)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>headername1 headername2</p>
     */
    @NameInMap("CheckPresenceHeader")
    public String checkPresenceHeader;

    /**
     * <p>The edge cache mode. Valid values:</p>
     * <ul>
     * <li><p><code>follow_origin</code>: Follows the origin server cache policy if one exists; otherwise, uses the default cache policy.</p>
     * </li>
     * <li><p><code>no_cache</code>: Disables caching on the edge node.</p>
     * </li>
     * <li><p><code>override_origin</code>: Overrides the origin server cache policy.</p>
     * </li>
     * <li><p><code>follow_origin_bypass</code>: Follows the origin server cache policy if one exists; otherwise, the content is not cached.</p>
     * </li>
     * <li><p><code>follow_origin_override</code>: Follows the origin server cache policy if one exists; otherwise, uses a custom edge cache TTL.</p>
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
     * <li><p>You can set the cache TTL for a specific status code. For example, <code>404=10</code> caches responses with a 404 status code for 10 seconds.</p>
     * </li>
     * <li><p>You can set the cache TTL for a series of status codes, such as 4xx or 5xx. For example, <code>4xx=10</code> caches all responses that have a status code in the 4xx series for 10 seconds.</p>
     * </li>
     * <li><p>You can specify multiple status code TTLs, separated by commas (,).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5xx=0,404=10</p>
     */
    @NameInMap("EdgeStatusCodeCacheTtl")
    public String edgeStatusCodeCacheTtl;

    /**
     * <p>The cookies to include in the cache key. Both the cookie names (case-insensitive) and their values are included. Separate multiple cookie names with spaces. The cookie names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: a-z (lowercase)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cookiename1 cookiename2</p>
     */
    @NameInMap("IncludeCookie")
    public String includeCookie;

    /**
     * <p>The headers to include in the cache key. Both the header names (case-insensitive) and their values are included. Separate multiple header names with spaces. The header names can contain the following characters:</p>
     * <ul>
     * <li><p>Symbols: ! # $ % &amp; \&quot; \* + - . ^ _ | \~</p>
     * </li>
     * <li><p>Digits: 0-9</p>
     * </li>
     * <li><p>Letters: a-z (lowercase)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>headername1 headername2</p>
     */
    @NameInMap("IncludeHeader")
    public String includeHeader;

    /**
     * <p>Specifies how to process the request body when generating a cache key for POST requests. The following modes are supported:</p>
     * <ul>
     * <li><p><code>md5</code>: Calculates the MD5 hash of the request body and adds the hash value to the cache key.</p>
     * </li>
     * <li><p><code>ignore</code>: Ignores the request body when the cache key is generated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("PostBodyCacheKey")
    public String postBodyCacheKey;

    /**
     * <p>The size limit for the request body when using POST request caching, in KB. Supported values range from 1 to 8. If unspecified, the default is 8 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostBodySizeLimit")
    public String postBodySizeLimit;

    /**
     * <p>Specifies whether to enable POST request caching.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PostCache")
    public String postCache;

    /**
     * <p>The query strings to include in or exclude from the cache key. Separate multiple query strings with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <p>The mode for processing query strings when generating a cache key. Valid values:</p>
     * <ul>
     * <li><p><code>ignore_all</code>: Ignores all query strings.</p>
     * </li>
     * <li><p><code>exclude_query_string</code>: Excludes specified query strings.</p>
     * </li>
     * <li><p><code>reserve_all</code>: Includes all query strings (the default).</p>
     * </li>
     * <li><p><code>include_query_string</code>: Includes only specified query strings.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>reserve_all</p>
     */
    @NameInMap("QueryStringMode")
    public String queryStringMode;

    /**
     * <p>The content of the rule, which is a conditional expression used to match user requests. This parameter is not required for a global configuration.</p>
     * <ul>
     * <li><p>To match all requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. This parameter is not required for a global configuration. Valid values:</p>
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
     * <p>The rule name. This parameter is not required for a global configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The execution order of the rule. A smaller number indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Specifies whether to serve stale content. If enabled, an edge node can serve stale (expired) content when the origin server is unavailable. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables serving stale content.</p>
     * </li>
     * <li><p><code>off</code>: Disables serving stale content.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("ServeStale")
    public String serveStale;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site configuration version. For sites with version management enabled, this parameter specifies the site version to which the configuration applies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Specifies whether to sort query strings. This feature is disabled by default. Valid values:</p>
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
     * <p>Specifies whether to include the client device type in the cache key. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Includes the client device type.</p>
     * </li>
     * <li><p><code>off</code>: Does not include the client device type.</p>
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
     * <li><p><code>on</code>: Includes the geographic location.</p>
     * </li>
     * <li><p><code>off</code>: Does not include the geographic location.</p>
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
     * <li><p><code>on</code>: Includes the language.</p>
     * </li>
     * <li><p><code>off</code>: Does not include the language.</p>
     * </li>
     * </ul>
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

    public CreateCacheRuleRequest setPostBodyCacheKey(String postBodyCacheKey) {
        this.postBodyCacheKey = postBodyCacheKey;
        return this;
    }
    public String getPostBodyCacheKey() {
        return this.postBodyCacheKey;
    }

    public CreateCacheRuleRequest setPostBodySizeLimit(String postBodySizeLimit) {
        this.postBodySizeLimit = postBodySizeLimit;
        return this;
    }
    public String getPostBodySizeLimit() {
        return this.postBodySizeLimit;
    }

    public CreateCacheRuleRequest setPostCache(String postCache) {
        this.postCache = postCache;
        return this;
    }
    public String getPostCache() {
        return this.postCache;
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

    public CreateCacheRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
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
