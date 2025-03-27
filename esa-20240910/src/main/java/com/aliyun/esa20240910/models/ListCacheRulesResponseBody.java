// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheRulesResponseBody extends TeaModel {
    /**
     * <p>Response body configuration.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListCacheRulesResponseBodyConfigs> configs;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
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
         * <p>Enable caching on specified ports. Value range: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, 2096.</p>
         * 
         * <strong>example:</strong>
         * <p>2082</p>
         */
        @NameInMap("AdditionalCacheablePorts")
        public String additionalCacheablePorts;

        /**
         * <p>Browser cache mode. Possible values:</p>
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
         * <p>Set bypass cache mode. Possible values:</p>
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
         * <p>Cache deception defense. Used to defend against web cache deception attacks; only verified cache content will be cached. Value range:</p>
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
         * <p>Cache reserve eligibility. This is used to control whether user requests bypass the cache reserve node when returning to the origin. The value range is as follows:</p>
         * <ul>
         * <li>bypass_cache_reserve: Requests bypass the cache reserve.</li>
         * <li>eligible_for_cache_reserve: Eligible for cache reserve.</li>
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
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Configuration type, which can be used to query global or rule-based configurations. Possible values:</p>
         * <ul>
         * <li>global: Query global configuration.</li>
         * <li>rule: Query rule-based configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Edge cache mode. The value range is as follows:</p>
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
         * <p>Edge cache expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EdgeCacheTtl")
        public String edgeCacheTtl;

        /**
         * <p>Edge cache expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        /**
         * <p>Include the specified cookie names and their values when generating the cache key. Multiple values are supported, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookie_exapmle</p>
         */
        @NameInMap("IncludeCookie")
        public String includeCookie;

        /**
         * <p>Include the specified header names and their values when generating the cache key. Multiple values are supported, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IncludeHeader")
        public String includeHeader;

        /**
         * <p>The query strings to be reserved or excluded. Multiple values are supported, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>The processing mode for query strings when generating the cache key. The value range is as follows:</p>
         * <ul>
         * <li>ignore_all: Ignore all query strings.</li>
         * <li>exclude_query_string: Exclude specified query strings.</li>
         * <li>reserve_all: Default, reserve all query strings.</li>
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
         * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq \&quot;video.example.com\&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Rule switch. This parameter is not required when adding a global configuration. Possible values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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

        /**
         * <p>Rule execution order. The smaller the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Serve stale cache. When enabled, the node can still respond to user requests with expired cached files even when the origin server is unavailable. Value range:</p>
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
         * <p>Site configuration version number. For sites with version management enabled, this parameter can specify the site version for which the configuration takes effect, defaulting to version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>Query string sorting. The value range is as follows:</p>
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
         * <p>Include the client device type when generating the cache key. The value range is as follows:</p>
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
         * <p>Include the client\&quot;s geographic location when generating the cache key. The value range is as follows:</p>
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
         * <p>Include the client\&quot;s language type when generating the cache key. The value range is as follows:</p>
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
