// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheRulesResponseBody extends TeaModel {
    /**
     * <p>The configuration list in the response body.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListCacheRulesResponseBodyConfigs> configs;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>The total number of records.</p>
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
         * <li>Enables caching on specified ports.</li>
         * <li>Valid values: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, and 2096.</li>
         * <li>Multiple ports are separated by commas (,).</li>
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
         * <li>no_cache: does not cache.</li>
         * <li>follow_origin: follows the origin cache policy.</li>
         * <li>override_origin: overrides the origin cache policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no_cache</p>
         */
        @NameInMap("BrowserCacheMode")
        public String browserCacheMode;

        /**
         * <p>The browser cache expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("BrowserCacheTtl")
        public String browserCacheTtl;

        /**
         * <p>The bypass cache mode. Valid values:</p>
         * <ul>
         * <li>cache_all: caches all requests.</li>
         * <li>bypass_all: bypasses cache for all requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cache_all</p>
         */
        @NameInMap("BypassCache")
        public String bypassCache;

        /**
         * <p>The cache deception armor. Protects against web cache deception attacks by caching only content that passes validation. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CacheDeceptionArmor")
        public String cacheDeceptionArmor;

        /**
         * <p>The cache reserve eligibility. Controls whether user requests bypass the cache reserve node during back-to-origin. Valid values:</p>
         * <ul>
         * <li>bypass_cache_reserve: requests bypass cache reserve.</li>
         * <li>eligible_for_cache_reserve: requests are eligible for cache reserve.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bypass_cache_reserve</p>
         */
        @NameInMap("CacheReserveEligibility")
        public String cacheReserveEligibility;

        /**
         * <p>When generating cache keys, checks whether the specified cookies exist. If a cookie exists, its name (case-insensitive) is added to the cache key. Multiple cookie names are separated by spaces. Cookie names support the following character types:</p>
         * <ul>
         * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
         * <li>Digits: 0-9</li>
         * <li>Letters: lowercase a-z.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookiename1 cookiename2</p>
         */
        @NameInMap("CheckPresenceCookie")
        public String checkPresenceCookie;

        /**
         * <p>When generating cache keys, checks whether the specified headers exist. If a header exists, its name (case-insensitive) is added to the cache key. Multiple header names are separated by spaces. Header names support the following character types:</p>
         * <ul>
         * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
         * <li>Digits: 0-9</li>
         * <li>Letters: lowercase a-z.</li>
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
         * <p>The configuration type. You can use this parameter to query global or rule configurations. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
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
         * <li>follow_origin: follows the origin cache policy if present. Otherwise, uses the default cache policy.</li>
         * <li>no_cache: does not cache.</li>
         * <li>override_origin: overrides the origin cache policy.</li>
         * <li>follow_origin_bypass: follows the origin cache policy if present. Otherwise, does not cache.</li>
         * <li>follow_origin_override: follows the origin cache policy if present. Otherwise, uses a custom cache TTL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
         */
        @NameInMap("EdgeCacheMode")
        public String edgeCacheMode;

        /**
         * <p>The edge cache expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EdgeCacheTtl")
        public String edgeCacheTtl;

        /**
         * <p>The status code cache expiration time, in seconds.</p>
         * <ul>
         * <li>You can set the cache expiration time for specific status codes. For example, 404=10 indicates that the 404 status code is cached for 10 seconds.</li>
         * <li>You can set the cache expiration time for 4xx or 5xx series status codes. For example, 4xx=10 indicates that all 4xx status codes are cached for 10 seconds.</li>
         * <li>You can set the cache expiration time for multiple status codes. Separate multiple status codes with commas (,).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5xx=0,404=10</p>
         */
        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        /**
         * <p>The specified cookie names (case-insensitive) and their values to include when generating cache keys. Multiple values are separated by spaces. Cookie names support the following character types:</p>
         * <ul>
         * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
         * <li>Digits: 0-9</li>
         * <li>Letters: lowercase a-z.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cookiename1 cookiename2</p>
         */
        @NameInMap("IncludeCookie")
        public String includeCookie;

        /**
         * <p>The specified header names (case-insensitive) and their values to include when generating cache keys. Multiple values are separated by spaces. Header names support the following character types:</p>
         * <ul>
         * <li>Symbols: ! # $ % &amp; \&quot; * + - . ^ _ ` | ~</li>
         * <li>Digits: 0-9</li>
         * <li>Letters: lowercase a-z.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>headername1 headername2</p>
         */
        @NameInMap("IncludeHeader")
        public String includeHeader;

        /**
         * <p>The cache key handling mode for POST caching. The following two modes are supported:</p>
         * <ul>
         * <li>md5: calculates the MD5 hash of the body content and adds the MD5 value to the cache key.</li>
         * <li>ignore: ignores the body content in the cache key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("PostBodyCacheKey")
        public String postBodyCacheKey;

        /**
         * <p>The body size limit for POST caching. The value is a number in KB. Valid values: 1 to 8. If this parameter is left empty, the default value of 8 KB takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostBodySizeLimit")
        public String postBodySizeLimit;

        /**
         * <p>Specifies whether to enable POST caching.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PostCache")
        public String postCache;

        /**
         * <p>The query strings to retain or remove when generating cache keys. Multiple values are separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>The query string handling mode when generating cache keys. Valid values:</p>
         * <ul>
         * <li>ignore_all: ignores all query strings.</li>
         * <li>exclude_query_string: removes specified query strings.</li>
         * <li>reserve_all: retains all query strings. This is the default value.</li>
         * <li>include_query_string: retains specified query strings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ignore_all</p>
         */
        @NameInMap("QueryStringMode")
        public String queryStringMode;

        /**
         * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when you add a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: set the value to true.</li>
         * <li>Match specified requests: set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. You do not need to set this parameter when you add a global configuration. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name. You do not need to set this parameter when you add a global configuration.</p>
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
         * <p>Specifies whether to serve stale cache. When enabled, edge nodes can respond to user requests with cached expired files when the origin server is unavailable. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ServeStale")
        public String serveStale;

        /**
         * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>Specifies whether to sort query strings. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SortQueryStringForCache")
        public String sortQueryStringForCache;

        /**
         * <p>Specifies whether to include the type of the client when generating cache keys. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UserDeviceType")
        public String userDeviceType;

        /**
         * <p>Specifies whether to include the client geographic location when generating cache keys. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UserGeo")
        public String userGeo;

        /**
         * <p>Specifies whether to include the client language type when generating cache keys. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
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
