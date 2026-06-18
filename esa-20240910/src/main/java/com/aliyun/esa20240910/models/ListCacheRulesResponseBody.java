// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheRulesResponseBody extends TeaModel {
    /**
     * <p>The list of configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListCacheRulesResponseBodyConfigs> configs;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of records.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListCacheRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCacheRulesResponseBody self = new ListCacheRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCacheRulesResponseBody setConfigs(java.util.List<ListCacheRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListCacheRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListCacheRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCacheRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCacheRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCacheRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCacheRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListCacheRulesResponseBodyConfigs extends TeaModel {
        /**
         * <ul>
         * <li><p>Enables caching on the specified ports.</p>
         * </li>
         * <li><p>Valid values: <code>8880</code>, <code>2052</code>, <code>2082</code>, <code>2086</code>, <code>2095</code>, <code>2053</code>, <code>2083</code>, <code>2087</code>, and <code>2096</code>.</p>
         * </li>
         * <li><p>You can specify multiple ports, separated by commas (<code>,</code>).</p>
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
         * <li><p><code>follow_origin</code>: Follows the origin server\&quot;s cache policy.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the origin server\&quot;s cache policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no_cache</p>
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
         * <p>Specifies the bypass cache mode. Valid values:</p>
         * <ul>
         * <li><p><code>cache_all</code>: Caches all requests.</p>
         * </li>
         * <li><p><code>bypass_all</code>: Bypasses all requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cache_all</p>
         */
        @NameInMap("BypassCache")
        public String bypassCache;

        /**
         * <p>The cache deception protection. This feature defends against web cache deception attacks by caching only validated content. Valid values:</p>
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
         * <p>The cache reserve eligibility. This setting controls whether a user request bypasses the cache reserve node when it is forwarded to the origin server. Valid values:</p>
         * <ul>
         * <li><p><code>bypass_cache_reserve</code>: The request bypasses the cache reserve.</p>
         * </li>
         * <li><p><code>eligible_for_cache_reserve</code>: The request is eligible for the cache reserve.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bypass_cache_reserve</p>
         */
        @NameInMap("CacheReserveEligibility")
        public String cacheReserveEligibility;

        /**
         * <p>Checks for the presence of specified cookies when generating the cache key. If a cookie exists, its name (case-insensitive) is included in the cache key. Separate multiple cookie names with spaces. Cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: <code>! # $ % &amp; \\&quot; * + - . ^ _ ` | ~</code></p>
         * </li>
         * <li><p>Digits: <code>0-9</code></p>
         * </li>
         * <li><p>Letters: lowercase English letters <code>a-z</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookiename1 cookiename2</p>
         */
        @NameInMap("CheckPresenceCookie")
        public String checkPresenceCookie;

        /**
         * <p>Checks for the presence of specified headers when generating the cache key. If a header exists, its name (case-insensitive) is included in the cache key. Separate multiple header names with spaces. Header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: <code>! # $ % &amp; \\&quot; * + - . ^ _ ` | ~</code></p>
         * </li>
         * <li><p>Digits: <code>0-9</code></p>
         * </li>
         * <li><p>Letters: lowercase English letters <code>a-z</code></p>
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
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configuration type, which indicates whether the configuration is global or rule-specific. Valid values:</p>
         * <ul>
         * <li><p><code>global</code></p>
         * </li>
         * <li><p><code>rule</code></p>
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
         * <li><p><code>follow_origin</code>: Follows the origin server\&quot;s cache policy. If no policy exists, the default policy is used.</p>
         * </li>
         * <li><p><code>no_cache</code>: Disables caching on edge nodes.</p>
         * </li>
         * <li><p><code>override_origin</code>: Overrides the origin server\&quot;s cache policy.</p>
         * </li>
         * <li><p><code>follow_origin_bypass</code>: Follows the origin server\&quot;s cache policy. If no policy exists, requests bypass the cache.</p>
         * </li>
         * <li><p><code>follow_origin_override</code>: Follows the cache policy of the origin server. If no policy exists, a custom cache TTL is used.</p>
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
         * <li><p>You can set the cache TTL for a series of status codes, such as 4xx and 5xx. For example, <code>4xx=10</code> caches all responses with a 4xx status code for 10 seconds.</p>
         * </li>
         * <li><p>Separate multiple settings with commas (<code>,</code>).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5xx=0,404=10</p>
         */
        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        /**
         * <p>The cookie names whose values are included in the cache key. Names are case-insensitive. Separate multiple names with spaces. Cookie names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: <code>! # $ % &amp; \\&quot; * + - . ^ _ ` | ~</code></p>
         * </li>
         * <li><p>Digits: <code>0-9</code></p>
         * </li>
         * <li><p>Letters: lowercase English letters <code>a-z</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookiename1 cookiename2</p>
         */
        @NameInMap("IncludeCookie")
        public String includeCookie;

        /**
         * <p>The header names whose values are included in the cache key. Names are case-insensitive. Separate multiple names with spaces. Header names can contain the following characters:</p>
         * <ul>
         * <li><p>Symbols: <code>! # $ % &amp; \\&quot; * + - . ^ _ ` | ~</code></p>
         * </li>
         * <li><p>Digits: <code>0-9</code></p>
         * </li>
         * <li><p>Letters: lowercase English letters <code>a-z</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>headername1 headername2</p>
         */
        @NameInMap("IncludeHeader")
        public String includeHeader;

        /**
         * <p>The handling mode for the request body when generating the cache key for a POST request.</p>
         * <ul>
         * <li><p><code>md5</code>: Calculates the MD5 hash of the body content and includes the hash in the cache key.</p>
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
         * <p>The maximum size of a POST request body that can be cached, in KB. The value must be an integer from 1 to 8. The default is 8 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostBodySizeLimit")
        public String postBodySizeLimit;

        /**
         * <p>Specifies whether to enable caching for POST requests.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PostCache")
        public String postCache;

        /**
         * <p>The query strings to include in or exclude from the cache key. Separate multiple values with spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>Specifies how to handle query strings when generating a cache key. Valid values:</p>
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
         * <p>ignore_all</p>
         */
        @NameInMap("QueryStringMode")
        public String queryStringMode;

        /**
         * <p>The rule content, which uses a conditional expression to match user requests. This parameter is not required for a global configuration.</p>
         * <ul>
         * <li><p>To match all incoming requests, set this to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, set this to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule status. This parameter is not required for a global configuration. Valid values:</p>
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
         * <p>The rule name. This parameter is not required for a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution sequence. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Specifies whether to serve stale content. If enabled, edge nodes serve expired cached files when the origin server is unavailable. Valid values:</p>
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
         * <p>The site version. If version management is enabled for the site, this specifies the version to which the configuration applies. The default is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>Specifies whether to enable query string sorting. Valid values:</p>
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
         * <p>Specifies whether to include the client device type in the cache key. Valid values:</p>
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
         * <p>Specifies whether to include the client\&quot;s geographical location in the cache key. Valid values:</p>
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
         * <p>Specifies whether to include the client language in the cache key. Valid values:</p>
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

        public static ListCacheRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCacheRulesResponseBodyConfigs self = new ListCacheRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListCacheRulesResponseBodyConfigs setAdditionalCacheablePorts(String additionalCacheablePorts) {
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        public ListCacheRulesResponseBodyConfigs setBrowserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        public ListCacheRulesResponseBodyConfigs setBrowserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        public ListCacheRulesResponseBodyConfigs setBypassCache(String bypassCache) {
            this.bypassCache = bypassCache;
            return this;
        }
        public String getBypassCache() {
            return this.bypassCache;
        }

        public ListCacheRulesResponseBodyConfigs setCacheDeceptionArmor(String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        public ListCacheRulesResponseBodyConfigs setCacheReserveEligibility(String cacheReserveEligibility) {
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        public ListCacheRulesResponseBodyConfigs setCheckPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        public ListCacheRulesResponseBodyConfigs setCheckPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        public ListCacheRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListCacheRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListCacheRulesResponseBodyConfigs setEdgeCacheMode(String edgeCacheMode) {
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        public ListCacheRulesResponseBodyConfigs setEdgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        public ListCacheRulesResponseBodyConfigs setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        public ListCacheRulesResponseBodyConfigs setIncludeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        public ListCacheRulesResponseBodyConfigs setIncludeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        public ListCacheRulesResponseBodyConfigs setPostBodyCacheKey(String postBodyCacheKey) {
            this.postBodyCacheKey = postBodyCacheKey;
            return this;
        }
        public String getPostBodyCacheKey() {
            return this.postBodyCacheKey;
        }

        public ListCacheRulesResponseBodyConfigs setPostBodySizeLimit(String postBodySizeLimit) {
            this.postBodySizeLimit = postBodySizeLimit;
            return this;
        }
        public String getPostBodySizeLimit() {
            return this.postBodySizeLimit;
        }

        public ListCacheRulesResponseBodyConfigs setPostCache(String postCache) {
            this.postCache = postCache;
            return this;
        }
        public String getPostCache() {
            return this.postCache;
        }

        public ListCacheRulesResponseBodyConfigs setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public ListCacheRulesResponseBodyConfigs setQueryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
            return this;
        }
        public String getQueryStringMode() {
            return this.queryStringMode;
        }

        public ListCacheRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListCacheRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListCacheRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListCacheRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListCacheRulesResponseBodyConfigs setServeStale(String serveStale) {
            this.serveStale = serveStale;
            return this;
        }
        public String getServeStale() {
            return this.serveStale;
        }

        public ListCacheRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListCacheRulesResponseBodyConfigs setSortQueryStringForCache(String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        public ListCacheRulesResponseBodyConfigs setUserDeviceType(String userDeviceType) {
            this.userDeviceType = userDeviceType;
            return this;
        }
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        public ListCacheRulesResponseBodyConfigs setUserGeo(String userGeo) {
            this.userGeo = userGeo;
            return this;
        }
        public String getUserGeo() {
            return this.userGeo;
        }

        public ListCacheRulesResponseBodyConfigs setUserLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }
        public String getUserLanguage() {
            return this.userLanguage;
        }

    }

}
