// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteFunctionsResponseBody extends TeaModel {
    /**
     * <p>The configuration information.</p>
     */
    @NameInMap("Configs")
    public ListSiteFunctionsResponseBodyConfigs configs;

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
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
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

    public static ListSiteFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSiteFunctionsResponseBody self = new ListSiteFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSiteFunctionsResponseBody setConfigs(ListSiteFunctionsResponseBodyConfigs configs) {
        this.configs = configs;
        return this;
    }
    public ListSiteFunctionsResponseBodyConfigs getConfigs() {
        return this.configs;
    }

    public ListSiteFunctionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSiteFunctionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSiteFunctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSiteFunctionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSiteFunctionsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListSiteFunctionsResponseBodyConfigsCacheReserve extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>392382988376064</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable cache reserve. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The cache reserve instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr_hk_123456789</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListSiteFunctionsResponseBodyConfigsCacheReserve build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCacheReserve self = new ListSiteFunctionsResponseBodyConfigsCacheReserve();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCacheReserve setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheReserve setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheReserve setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsCacheRules extends TeaModel {
        /**
         * <p>The ports on which caching is enabled. Valid values: 8880, 2052, 2082, 2086, 2095, 2053, 2083, 2087, and 2096.</p>
         * 
         * <strong>example:</strong>
         * <p>8880</p>
         */
        @NameInMap("AdditionalCacheablePorts")
        public String additionalCacheablePorts;

        /**
         * <p>The browser cache mode. Valid values:</p>
         * <ul>
         * <li>no_cache: no caching.</li>
         * <li>follow_origin: follows the origin server cache policy.</li>
         * <li>override_origin: overrides the origin server cache policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin</p>
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
         * <li>cache_all: all requests are cached.</li>
         * <li>bypass_all: all requests bypass the cache.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cache_all</p>
         */
        @NameInMap("BypassCache")
        public String bypassCache;

        /**
         * <p>Specifies whether to enable cache deception armor. This feature protects against web cache deception attacks by caching only content that passes validation. Valid values:</p>
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
         * <p>The cache reserve eligibility. Controls whether requests bypass the cache reserve node during back-to-origin. Valid values:</p>
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
         * <p>Checks whether a cookie exists when generating cache keys. If the cookie exists, the cookie name (case-insensitive) is added to the cache key. Multiple cookie names are supported and separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookiename</p>
         */
        @NameInMap("CheckPresenceCookie")
        public String checkPresenceCookie;

        /**
         * <p>Checks whether a header exists when generating cache keys. If the header exists, the header name (case-insensitive) is added to the cache key. Multiple header names are supported and separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
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
         * <p>The edge cache mode. Valid values:</p>
         * <ul>
         * <li>follow_origin: follows the origin server cache policy (if present). Otherwise, uses the default cache policy.</li>
         * <li>no_cache: no caching.</li>
         * <li>override_origin: overrides the origin server cache policy.</li>
         * <li>follow_origin_bypass: follows the origin server cache policy (if present). Otherwise, does not cache.</li>
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
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        /**
         * <p>The cookie names and their values to include when generating cache keys. Multiple values are supported and separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookie_exapmle</p>
         */
        @NameInMap("IncludeCookie")
        public String includeCookie;

        /**
         * <p>The header names and their values to include when generating cache keys. Multiple values are supported and separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IncludeHeader")
        public String includeHeader;

        /**
         * <p>The cache key processing mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("PostBodyCacheKey")
        public String postBodyCacheKey;

        /**
         * <p>The body size limit, in KB. Supports body sizes from 1 to 8 KB. If left empty, the default value of 8 KB is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostBodySizeLimit")
        public String postBodySizeLimit;

        /**
         * <p>The POST cache switch.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PostCache")
        public String postCache;

        /**
         * <p>The query strings to retain or remove. Multiple values are supported and separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>The query string processing mode when generating cache keys. Valid values:</p>
         * <ul>
         * <li>ignore_all: ignores all query strings.</li>
         * <li>exclude_query_string: removes specified query strings.</li>
         * <li>reserve_all: retains all query strings. This is the default value.</li>
         * <li>include_query_string: retains specified query strings.</li>
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
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>Specifies whether to serve stale cache. When enabled, the edge node can respond to user requests with cached expired content when the origin server is unavailable. Valid values:</p>
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

        public static ListSiteFunctionsResponseBodyConfigsCacheRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCacheRules self = new ListSiteFunctionsResponseBodyConfigsCacheRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setAdditionalCacheablePorts(String additionalCacheablePorts) {
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setBrowserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setBrowserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setBypassCache(String bypassCache) {
            this.bypassCache = bypassCache;
            return this;
        }
        public String getBypassCache() {
            return this.bypassCache;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setCacheDeceptionArmor(String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setCacheReserveEligibility(String cacheReserveEligibility) {
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setCheckPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setCheckPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setEdgeCacheMode(String edgeCacheMode) {
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setEdgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setIncludeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setIncludeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setPostBodyCacheKey(String postBodyCacheKey) {
            this.postBodyCacheKey = postBodyCacheKey;
            return this;
        }
        public String getPostBodyCacheKey() {
            return this.postBodyCacheKey;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setPostBodySizeLimit(String postBodySizeLimit) {
            this.postBodySizeLimit = postBodySizeLimit;
            return this;
        }
        public String getPostBodySizeLimit() {
            return this.postBodySizeLimit;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setPostCache(String postCache) {
            this.postCache = postCache;
            return this;
        }
        public String getPostCache() {
            return this.postCache;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setQueryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
            return this;
        }
        public String getQueryStringMode() {
            return this.queryStringMode;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setServeStale(String serveStale) {
            this.serveStale = serveStale;
            return this;
        }
        public String getServeStale() {
            return this.serveStale;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setSortQueryStringForCache(String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setUserDeviceType(String userDeviceType) {
            this.userDeviceType = userDeviceType;
            return this;
        }
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setUserGeo(String userGeo) {
            this.userGeo = userGeo;
            return this;
        }
        public String getUserGeo() {
            return this.userGeo;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheRules setUserLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }
        public String getUserLanguage() {
            return this.userLanguage;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsCacheTags extends TeaModel {
        /**
         * <p>Specifies whether to ignore case. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CaseInsensitive")
        public String caseInsensitive;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The custom CacheTag name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static ListSiteFunctionsResponseBodyConfigsCacheTags build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCacheTags self = new ListSiteFunctionsResponseBodyConfigsCacheTags();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCacheTags setCaseInsensitive(String caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public String getCaseInsensitive() {
            return this.caseInsensitive;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheTags setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheTags setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsCacheTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsCnameFlattening extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>245523334529026</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The flattening mode. Valid values:</p>
         * <ul>
         * <li>flatten_all: flattens all records.</li>
         * <li>flatten_at_root: flattens only the root domain. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flatten_all</p>
         */
        @NameInMap("FlattenMode")
        public String flattenMode;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsCnameFlattening build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCnameFlattening self = new ListSiteFunctionsResponseBodyConfigsCnameFlattening();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCnameFlattening setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCnameFlattening setFlattenMode(String flattenMode) {
            this.flattenMode = flattenMode;
            return this;
        }
        public String getFlattenMode() {
            return this.flattenMode;
        }

        public ListSiteFunctionsResponseBodyConfigsCnameFlattening setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsCompressionRules extends TeaModel {
        /**
         * <p>Specifies whether to enable Brotli compression. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Brotli")
        public String brotli;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable Gzip compression. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
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
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>Specifies whether to enable Zstd compression. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Zstd")
        public String zstd;

        public static ListSiteFunctionsResponseBodyConfigsCompressionRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCompressionRules self = new ListSiteFunctionsResponseBodyConfigsCompressionRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setBrotli(String brotli) {
            this.brotli = brotli;
            return this;
        }
        public String getBrotli() {
            return this.brotli;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsCompressionRules setZstd(String zstd) {
            this.zstd = zstd;
            return this;
        }
        public String getZstd() {
            return this.zstd;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>245523334529026</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable Chinese mainland network access optimization. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization self = new ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsCustomResponseCode extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>457325144242176</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The response page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ReturnCode")
        public String returnCode;

        /**
         * <p>The rule content. Uses conditional expressions to match user requests. This parameter is not required when adding a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: set the value to true.</li>
         * <li>Match specified requests: set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. This parameter is not required when adding a global configuration. Valid values:</p>
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
         * <p>The rule name. This parameter is not required when adding a global configuration.</p>
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
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsCustomResponseCode build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsCustomResponseCode self = new ListSiteFunctionsResponseBodyConfigsCustomResponseCode();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsCustomResponseCode setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsDevelopmentMode extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The feature switch. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsDevelopmentMode build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsDevelopmentMode self = new ListSiteFunctionsResponseBodyConfigsDevelopmentMode();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsDevelopmentMode setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsDevelopmentMode setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsDevelopmentMode setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect extends TeaModel {
        /**
         * <p>The response status code used by the edge node when responding with the redirect address to the client. Valid values:</p>
         * <ul>
         * <li>400</li>
         * <li>403</li>
         * <li>404</li>
         * <li>405</li>
         * <li>414</li>
         * <li>416</li>
         * <li>500</li>
         * <li>501</li>
         * <li>502</li>
         * <li>503</li>
         * <li>504</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The target URL after redirection.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/test">http://example.com/test</a></p>
         */
        @NameInMap("TargetURL")
        public String targetURL;

        public static ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect self = new ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect setTargetURL(String targetURL) {
            this.targetURL = targetURL;
            return this;
        }
        public String getTargetURL() {
            return this.targetURL;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473117342636032</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The error page redirect configuration.</p>
         */
        @NameInMap("ErrorPagesRedirect")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect> errorPagesRedirect;

        /**
         * <p>The rule content. Uses conditional expressions to match user requests. This parameter is not required when adding a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: set the value to true.</li>
         * <li>Match specified requests: set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. This parameter is not required when adding a global configuration. Valid values:</p>
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
         * <p>The rule name. This parameter is not required when adding a global configuration.</p>
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
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects self = new ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects setErrorPagesRedirect(java.util.List<ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect> errorPagesRedirect) {
            this.errorPagesRedirect = errorPagesRedirect;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsErrorPagesRedirectsErrorPagesRedirect> getErrorPagesRedirect() {
            return this.errorPagesRedirect;
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        /**
         * <p>The request header name.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: adds a header.</li>
         * <li>del: deletes a header.</li>
         * <li>modify: modifies a header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The request header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification self = new ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>430893999331328</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The request header modifications. Supports add, delete, and modify operations.</p>
         */
        @NameInMap("RequestHeaderModification")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>http.host eq &quot;videoo.example.com&quot;</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules self = new ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules setRequestHeaderModification(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
        /**
         * <p>The response header name.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: adds a header.</li>
         * <li>del: deletes a header.</li>
         * <li>modify: modifies a header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The response header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification self = new ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>430893999331328</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The response header modifications. Supports add, delete, and modify operations.</p>
         */
        @NameInMap("ResponseHeaderModification")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules self = new ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules setResponseHeaderModification(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        /**
         * <p>The request header name.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: adds a header.</li>
         * <li>del: deletes a header.</li>
         * <li>modify: modifies a header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The request header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification self = new ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The request header modifications. Supports add, delete, and modify operations.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
         */
        @NameInMap("RequestHeaderModification")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules self = new ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules setRequestHeaderModification(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
        /**
         * <p>The response header name.</p>
         * 
         * <strong>example:</strong>
         * <p>headername</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>add: adds a header.</li>
         * <li>del: deletes a header.</li>
         * <li>modify: modifies a header.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The response header value.</p>
         * 
         * <strong>example:</strong>
         * <p>headervalue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification self = new ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The response header modifications. Supports add, delete, and modify operations.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
         */
        @NameInMap("ResponseHeaderModification")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules self = new ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules setResponseHeaderModification(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration extends TeaModel {
        /**
         * <p>The Alt-Svc feature switch. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvc")
        public String altSvc;

        /**
         * <p>Specifies whether the Alt-Svc header includes the clear parameter. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcClear")
        public String altSvcClear;

        /**
         * <p>The Alt-Svc validity period, in seconds. Default value: 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("AltSvcMa")
        public String altSvcMa;

        /**
         * <p>Specifies whether the Alt-Svc header includes the persist parameter. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcPersist")
        public String altSvcPersist;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>391240445274112</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable HSTS. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Hsts")
        public String hsts;

        /**
         * <p>Specifies whether to include subdomains in HSTS. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsIncludeSubdomains")
        public String hstsIncludeSubdomains;

        /**
         * <p>The HSTS expiration time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("HstsMaxAge")
        public String hstsMaxAge;

        /**
         * <p>Specifies whether to enable HSTS preload. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsPreload")
        public String hstsPreload;

        /**
         * <p>Specifies whether to enable forced HTTPS. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: enabled.</p>
         * </li>
         * <li><p>off: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsForce")
        public String httpsForce;

        /**
         * <p>The status code used for forced HTTPS redirect. Valid values:</p>
         * <ul>
         * <li>301</li>
         * <li>302</li>
         * <li>307</li>
         * <li>308</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpsForceCode")
        public String httpsForceCode;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration self = new ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setAltSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }
        public String getAltSvc() {
            return this.altSvc;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setAltSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }
        public String getAltSvcClear() {
            return this.altSvcClear;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setAltSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }
        public String getAltSvcMa() {
            return this.altSvcMa;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setAltSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
        }
        public String getAltSvcPersist() {
            return this.altSvcPersist;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setHsts(String hsts) {
            this.hsts = hsts;
            return this;
        }
        public String getHsts() {
            return this.hsts;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }
        public String getHstsIncludeSubdomains() {
            return this.hstsIncludeSubdomains;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setHstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public String getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setHstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public String getHstsPreload() {
            return this.hstsPreload;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setHttpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }
        public String getHttpsForce() {
            return this.httpsForce;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setHttpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
            return this;
        }
        public String getHttpsForceCode() {
            return this.httpsForceCode;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration extends TeaModel {
        /**
         * <p>The custom cipher suites. Specifies the specific encryption algorithms selected when CiphersuiteGroup is set to custom.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256</p>
         */
        @NameInMap("Ciphersuite")
        public String ciphersuite;

        /**
         * <p>The cipher suite group. All cipher suites are enabled by default. Valid values:</p>
         * <ul>
         * <li>all: all cipher suites.</li>
         * <li>strict: strong cipher suites.</li>
         * <li>custom: custom cipher suites.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("CiphersuiteGroup")
        public String ciphersuiteGroup;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>391380266602496</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable HTTP/2. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http2")
        public String http2;

        /**
         * <p>Specifies whether to enable HTTP/3. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http3")
        public String http3;

        /**
         * <p>Specifies whether to enable HTTPS. Enabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: enabled.</p>
         * </li>
         * <li><p>off: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Https")
        public String https;

        /**
         * <p>Specifies whether to enable OCSP stapling. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OcspStapling")
        public String ocspStapling;

        /**
         * <p>The matching rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>Specifies whether to enable TLS 1.0. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls10")
        public String tls10;

        /**
         * <p>Specifies whether to enable TLS 1.1. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls11")
        public String tls11;

        /**
         * <p>Specifies whether to enable TLS 1.2. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls12")
        public String tls12;

        /**
         * <p>Specifies whether to enable TLS 1.3. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Tls13")
        public String tls13;

        public static ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration self = new ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setCiphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setCiphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setHttp3(String http3) {
            this.http3 = http3;
            return this;
        }
        public String getHttp3() {
            return this.http3;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setHttps(String https) {
            this.https = https;
            return this;
        }
        public String getHttps() {
            return this.https;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setOcspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
            return this;
        }
        public String getOcspStapling() {
            return this.ocspStapling;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setTls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }
        public String getTls10() {
            return this.tls10;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setTls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }
        public String getTls11() {
            return this.tls11;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setTls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }
        public String getTls12() {
            return this.tls12;
        }

        public ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration setTls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public String getTls13() {
            return this.tls13;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsImageTransform extends TeaModel {
        /**
         * <p>The adaptive AVIF setting.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AutoAvif")
        public String autoAvif;

        /**
         * <p>The adaptive WebP setting.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AutoWebp")
        public String autoWebp;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable image transformation. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsImageTransform build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsImageTransform self = new ListSiteFunctionsResponseBodyConfigsImageTransform();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setAutoAvif(String autoAvif) {
            this.autoAvif = autoAvif;
            return this;
        }
        public String getAutoAvif() {
            return this.autoAvif;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setAutoWebp(String autoWebp) {
            this.autoWebp = autoWebp;
            return this;
        }
        public String getAutoWebp() {
            return this.autoWebp;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsImageTransform setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsIpv6 extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable IPv6. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsIpv6 build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsIpv6 self = new ListSiteFunctionsResponseBodyConfigsIpv6();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsIpv6 setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsIpv6 setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsIpv6 setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsManagedTransforms extends TeaModel {
        /**
         * <p>Specifies whether to add visitor geolocation headers. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AddClientGeolocationHeaders")
        public String addClientGeolocationHeaders;

        /**
         * <p>Specifies whether to add the &quot;ali-real-client-ip&quot; header that contains the real client IP address. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AddRealClientIpHeader")
        public String addRealClientIpHeader;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsManagedTransforms build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsManagedTransforms self = new ListSiteFunctionsResponseBodyConfigsManagedTransforms();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsManagedTransforms setAddClientGeolocationHeaders(String addClientGeolocationHeaders) {
            this.addClientGeolocationHeaders = addClientGeolocationHeaders;
            return this;
        }
        public String getAddClientGeolocationHeaders() {
            return this.addClientGeolocationHeaders;
        }

        public ListSiteFunctionsResponseBodyConfigsManagedTransforms setAddRealClientIpHeader(String addRealClientIpHeader) {
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }
        public String getAddRealClientIpHeader() {
            return this.addRealClientIpHeader;
        }

        public ListSiteFunctionsResponseBodyConfigsManagedTransforms setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsManagedTransforms setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsNetworkOptimization extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>395901755670528</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to enable gRPC. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Grpc")
        public String grpc;

        /**
         * <p>Specifies whether to enable HTTP/2 back-to-origin. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Http2Origin")
        public String http2Origin;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>Specifies whether to enable smart routing. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SmartRouting")
        public String smartRouting;

        /**
         * <p>The maximum upload file size, in MB. Valid values: 100 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

        /**
         * <p>Specifies whether to enable WebSocket. Enabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Websocket")
        public String websocket;

        public static ListSiteFunctionsResponseBodyConfigsNetworkOptimization build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsNetworkOptimization self = new ListSiteFunctionsResponseBodyConfigsNetworkOptimization();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setGrpc(String grpc) {
            this.grpc = grpc;
            return this;
        }
        public String getGrpc() {
            return this.grpc;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setHttp2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setSmartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }
        public String getSmartRouting() {
            return this.smartRouting;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setUploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        public ListSiteFunctionsResponseBodyConfigsNetworkOptimization setWebsocket(String websocket) {
            this.websocket = websocket;
            return this;
        }
        public String getWebsocket() {
            return this.websocket;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsOriginRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The overridden DNS resolution record for back-to-origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("DnsRecord")
        public String dnsRecord;

        /**
         * <p>The HOST header carried in the back-to-origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <p>The origin server port used when fetching content over HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("OriginHttpPort")
        public String originHttpPort;

        /**
         * <p>The origin server port used when fetching content over HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>4433</p>
         */
        @NameInMap("OriginHttpsPort")
        public String originHttpsPort;

        /**
         * <p>Specifies whether to enable mTLS for back-to-origin. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OriginMtls")
        public String originMtls;

        /**
         * <p>The origin read timeout, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("OriginReadTimeout")
        public String originReadTimeout;

        /**
         * <p>The protocol used for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li>http: uses HTTP for back-to-origin.</li>
         * <li>https: uses HTTPS for back-to-origin.</li>
         * <li>follow: follows the client protocol for back-to-origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("OriginScheme")
        public String originScheme;

        /**
         * <p>The SNI carried in the back-to-origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginSni")
        public String originSni;

        /**
         * <p>Specifies whether to enable origin server certificate verification. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("OriginVerify")
        public String originVerify;

        /**
         * <p>Specifies whether to use range-based origin fetch for file downloads. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * <li>force: forced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Range")
        public String range;

        /**
         * <p>The range chunk size. Valid values:</p>
         * <ul>
         * <li>512KB</li>
         * <li>1MB</li>
         * <li>2MB</li>
         * <li>4MB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>512KB</p>
         */
        @NameInMap("RangeChunkSize")
        public String rangeChunkSize;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsOriginRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsOriginRules self = new ListSiteFunctionsResponseBodyConfigsOriginRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setDnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public String getDnsRecord() {
            return this.dnsRecord;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }
        public String getOriginHttpPort() {
            return this.originHttpPort;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }
        public String getOriginHttpsPort() {
            return this.originHttpsPort;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginMtls(String originMtls) {
            this.originMtls = originMtls;
            return this;
        }
        public String getOriginMtls() {
            return this.originMtls;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginReadTimeout(String originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }
        public String getOriginReadTimeout() {
            return this.originReadTimeout;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }
        public String getOriginScheme() {
            return this.originScheme;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginSni(String originSni) {
            this.originSni = originSni;
            return this;
        }
        public String getOriginSni() {
            return this.originSni;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setOriginVerify(String originVerify) {
            this.originVerify = originVerify;
            return this;
        }
        public String getOriginVerify() {
            return this.originVerify;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setRangeChunkSize(String rangeChunkSize) {
            this.rangeChunkSize = rangeChunkSize;
            return this;
        }
        public String getRangeChunkSize() {
            return this.rangeChunkSize;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsOriginRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsRedirectRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Specifies whether to preserve the query string. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
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
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The response status code used by the edge node when responding with the redirect address to the client. Valid values:</p>
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
         * <p>The target URL after redirection.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The redirect type. Valid values:</p>
         * <ul>
         * <li>static: static mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListSiteFunctionsResponseBodyConfigsRedirectRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsRedirectRules self = new ListSiteFunctionsResponseBodyConfigsRedirectRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setReserveQueryString(String reserveQueryString) {
            this.reserveQueryString = reserveQueryString;
            return this;
        }
        public String getReserveQueryString() {
            return this.reserveQueryString;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public ListSiteFunctionsResponseBodyConfigsRedirectRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsRewriteUrlRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The query string after rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>example=123</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>The query string rewrite type. Valid values:</p>
         * <ul>
         * <li>static: static mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("RewriteQueryStringType")
        public String rewriteQueryStringType;

        /**
         * <p>The path rewrite type. Valid values:</p>
         * <ul>
         * <li>static: static mode.</li>
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
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The target URI after rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>/image.example.com/index.html</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static ListSiteFunctionsResponseBodyConfigsRewriteUrlRules build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsRewriteUrlRules self = new ListSiteFunctionsResponseBodyConfigsRewriteUrlRules();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setRewriteQueryStringType(String rewriteQueryStringType) {
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setRewriteUriType(String rewriteUriType) {
            this.rewriteUriType = rewriteUriType;
            return this;
        }
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsRewriteUrlRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsSeoBypass extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The feature switch. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsSeoBypass build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsSeoBypass self = new ListSiteFunctionsResponseBodyConfigsSeoBypass();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsSeoBypass setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsSeoBypass setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsSeoBypass setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsSiteNameExclusive extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>380858020294656</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The feature switch. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsSiteNameExclusive build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsSiteNameExclusive self = new ListSiteFunctionsResponseBodyConfigsSiteNameExclusive();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsSiteNameExclusive setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsSiteNameExclusive setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListSiteFunctionsResponseBodyConfigsSiteNameExclusive setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsSitePause extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>302426190190592</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Temporarily pauses the proxy acceleration feature for the entire site. When enabled, all DNS records directly return record values to clients. Valid values:</p>
         * <ul>
         * <li>true: site acceleration is paused.</li>
         * <li>false: site acceleration is active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Paused")
        public String paused;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsSitePause build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsSitePause self = new ListSiteFunctionsResponseBodyConfigsSitePause();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsSitePause setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsSitePause setPaused(String paused) {
            this.paused = paused;
            return this;
        }
        public String getPaused() {
            return this.paused;
        }

        public ListSiteFunctionsResponseBodyConfigsSitePause setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsTieredCache extends TeaModel {
        /**
         * <p>The tiered cache architecture mode. Valid values:</p>
         * <ul>
         * <li>edge: edge cache layer.</li>
         * <li>edge_smart: edge cache layer + smart cache layer.</li>
         * <li>edge_regional: edge cache layer + regional cache layer.</li>
         * <li>edge_regional_smart: edge cache layer + regional cache layer + smart cache layer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>edge_smart</p>
         */
        @NameInMap("CacheArchitectureMode")
        public String cacheArchitectureMode;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsTieredCache build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsTieredCache self = new ListSiteFunctionsResponseBodyConfigsTieredCache();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsTieredCache setCacheArchitectureMode(String cacheArchitectureMode) {
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }
        public String getCacheArchitectureMode() {
            return this.cacheArchitectureMode;
        }

        public ListSiteFunctionsResponseBodyConfigsTieredCache setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsTieredCache setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsVideoProcessing extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>455153377667072</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The custom FLV end parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>f_end</p>
         */
        @NameInMap("FlvSeekEnd")
        public String flvSeekEnd;

        /**
         * <p>The custom FLV start parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>f_start</p>
         */
        @NameInMap("FlvSeekStart")
        public String flvSeekStart;

        /**
         * <p>The FLV seeking mode. Valid values:</p>
         * <ul>
         * <li>by_byte: seeks by byte.</li>
         * <li>by_time: seeks by time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>by_time</p>
         */
        @NameInMap("FlvVideoSeekMode")
        public String flvVideoSeekMode;

        /**
         * <p>The custom MP4 end parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>m_end</p>
         */
        @NameInMap("Mp4SeekEnd")
        public String mp4SeekEnd;

        /**
         * <p>The custom MP4 start parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>m_start</p>
         */
        @NameInMap("Mp4SeekStart")
        public String mp4SeekStart;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. Valid values:</p>
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
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The video seeking switch. Valid values:</p>
         * <ul>
         * <li><p>on: enabled.</p>
         * </li>
         * <li><p>off: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("VideoSeekEnable")
        public String videoSeekEnable;

        public static ListSiteFunctionsResponseBodyConfigsVideoProcessing build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsVideoProcessing self = new ListSiteFunctionsResponseBodyConfigsVideoProcessing();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setFlvSeekEnd(String flvSeekEnd) {
            this.flvSeekEnd = flvSeekEnd;
            return this;
        }
        public String getFlvSeekEnd() {
            return this.flvSeekEnd;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setFlvSeekStart(String flvSeekStart) {
            this.flvSeekStart = flvSeekStart;
            return this;
        }
        public String getFlvSeekStart() {
            return this.flvSeekStart;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setFlvVideoSeekMode(String flvVideoSeekMode) {
            this.flvVideoSeekMode = flvVideoSeekMode;
            return this;
        }
        public String getFlvVideoSeekMode() {
            return this.flvVideoSeekMode;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setMp4SeekEnd(String mp4SeekEnd) {
            this.mp4SeekEnd = mp4SeekEnd;
            return this;
        }
        public String getMp4SeekEnd() {
            return this.mp4SeekEnd;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setMp4SeekStart(String mp4SeekStart) {
            this.mp4SeekStart = mp4SeekStart;
            return this;
        }
        public String getMp4SeekStart() {
            return this.mp4SeekStart;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public ListSiteFunctionsResponseBodyConfigsVideoProcessing setVideoSeekEnable(String videoSeekEnable) {
            this.videoSeekEnable = videoSeekEnable;
            return this;
        }
        public String getVideoSeekEnable() {
            return this.videoSeekEnable;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The cache reserve configuration.</p>
         */
        @NameInMap("CacheReserve")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheReserve> cacheReserve;

        /**
         * <p>The cache rules.</p>
         */
        @NameInMap("CacheRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheRules> cacheRules;

        /**
         * <p>The cache tags. When using the purge-by-cache-tag feature, specifies the CacheTag name carried in the origin server response.</p>
         */
        @NameInMap("CacheTags")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheTags> cacheTags;

        /**
         * <p>The CNAME flattening configuration.</p>
         */
        @NameInMap("CnameFlattening")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCnameFlattening> cnameFlattening;

        /**
         * <p>The compression rules.</p>
         */
        @NameInMap("CompressionRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCompressionRules> compressionRules;

        /**
         * <p>The Chinese mainland network optimization configuration.</p>
         */
        @NameInMap("CrossBorderOptimization")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization;

        /**
         * <p>The custom response code rules.</p>
         */
        @NameInMap("CustomResponseCode")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCustomResponseCode> customResponseCode;

        /**
         * <p>The development mode configuration.</p>
         */
        @NameInMap("DevelopmentMode")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsDevelopmentMode> developmentMode;

        /**
         * <p>The error page redirect rules.</p>
         */
        @NameInMap("ErrorPagesRedirects")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects> errorPagesRedirects;

        /**
         * <p>The inbound request header modification rules.</p>
         */
        @NameInMap("HttpIncomingRequestHeaderModificationRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules> httpIncomingRequestHeaderModificationRules;

        /**
         * <p>The inbound response header modification rules.</p>
         */
        @NameInMap("HttpIncomingResponseHeaderModificationRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules> httpIncomingResponseHeaderModificationRules;

        /**
         * <p>The request header modification rules.</p>
         */
        @NameInMap("HttpRequestHeaderModificationRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

        /**
         * <p>The response header modification rules.</p>
         */
        @NameInMap("HttpResponseHeaderModificationRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

        /**
         * <p>The HTTPS application configuration.</p>
         */
        @NameInMap("HttpsApplicationConfiguration")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration;

        /**
         * <p>The HTTPS basic configuration.</p>
         */
        @NameInMap("HttpsBasicConfiguration")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration;

        /**
         * <p>The image transformation configuration.</p>
         */
        @NameInMap("ImageTransform")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsImageTransform> imageTransform;

        /**
         * <p>The IPv6 configuration.</p>
         */
        @NameInMap("Ipv6")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsIpv6> ipv6;

        /**
         * <p>The managed transforms.</p>
         */
        @NameInMap("ManagedTransforms")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsManagedTransforms> managedTransforms;

        /**
         * <p>The network optimization configuration.</p>
         */
        @NameInMap("NetworkOptimization")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsNetworkOptimization> networkOptimization;

        /**
         * <p>The back-to-origin rules.</p>
         */
        @NameInMap("OriginRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsOriginRules> originRules;

        /**
         * <p>The redirect rules.</p>
         */
        @NameInMap("RedirectRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsRedirectRules> redirectRules;

        /**
         * <p>The URL rewrite rules.</p>
         */
        @NameInMap("RewriteUrlRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsRewriteUrlRules> rewriteUrlRules;

        /**
         * <p>The search engine crawler bypass configuration.</p>
         */
        @NameInMap("SeoBypass")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSeoBypass> seoBypass;

        /**
         * <p>The site name exclusive configuration. When enabled, other accounts cannot create sites or subsites with the same name as the current site.</p>
         */
        @NameInMap("SiteNameExclusive")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSiteNameExclusive> siteNameExclusive;

        /**
         * <p>The site acceleration pause configuration. Temporarily pauses the proxy acceleration feature for the entire site. When enabled, all DNS records directly return record values to clients.</p>
         */
        @NameInMap("SitePause")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSitePause> sitePause;

        /**
         * <p>The tiered cache configuration.</p>
         */
        @NameInMap("TieredCache")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsTieredCache> tieredCache;

        /**
         * <p>The video processing configuration.</p>
         */
        @NameInMap("VideoProcessing")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsVideoProcessing> videoProcessing;

        public static ListSiteFunctionsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigs self = new ListSiteFunctionsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListSiteFunctionsResponseBodyConfigs setCacheReserve(java.util.List<ListSiteFunctionsResponseBodyConfigsCacheReserve> cacheReserve) {
            this.cacheReserve = cacheReserve;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheReserve> getCacheReserve() {
            return this.cacheReserve;
        }

        public ListSiteFunctionsResponseBodyConfigs setCacheRules(java.util.List<ListSiteFunctionsResponseBodyConfigsCacheRules> cacheRules) {
            this.cacheRules = cacheRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheRules> getCacheRules() {
            return this.cacheRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setCacheTags(java.util.List<ListSiteFunctionsResponseBodyConfigsCacheTags> cacheTags) {
            this.cacheTags = cacheTags;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheTags> getCacheTags() {
            return this.cacheTags;
        }

        public ListSiteFunctionsResponseBodyConfigs setCnameFlattening(java.util.List<ListSiteFunctionsResponseBodyConfigsCnameFlattening> cnameFlattening) {
            this.cnameFlattening = cnameFlattening;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCnameFlattening> getCnameFlattening() {
            return this.cnameFlattening;
        }

        public ListSiteFunctionsResponseBodyConfigs setCompressionRules(java.util.List<ListSiteFunctionsResponseBodyConfigsCompressionRules> compressionRules) {
            this.compressionRules = compressionRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCompressionRules> getCompressionRules() {
            return this.compressionRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setCrossBorderOptimization(java.util.List<ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization) {
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization> getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        public ListSiteFunctionsResponseBodyConfigs setCustomResponseCode(java.util.List<ListSiteFunctionsResponseBodyConfigsCustomResponseCode> customResponseCode) {
            this.customResponseCode = customResponseCode;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCustomResponseCode> getCustomResponseCode() {
            return this.customResponseCode;
        }

        public ListSiteFunctionsResponseBodyConfigs setDevelopmentMode(java.util.List<ListSiteFunctionsResponseBodyConfigsDevelopmentMode> developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsDevelopmentMode> getDevelopmentMode() {
            return this.developmentMode;
        }

        public ListSiteFunctionsResponseBodyConfigs setErrorPagesRedirects(java.util.List<ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects> errorPagesRedirects) {
            this.errorPagesRedirects = errorPagesRedirects;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsErrorPagesRedirects> getErrorPagesRedirects() {
            return this.errorPagesRedirects;
        }

        public ListSiteFunctionsResponseBodyConfigs setHttpIncomingRequestHeaderModificationRules(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules> httpIncomingRequestHeaderModificationRules) {
            this.httpIncomingRequestHeaderModificationRules = httpIncomingRequestHeaderModificationRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingRequestHeaderModificationRules> getHttpIncomingRequestHeaderModificationRules() {
            return this.httpIncomingRequestHeaderModificationRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setHttpIncomingResponseHeaderModificationRules(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules> httpIncomingResponseHeaderModificationRules) {
            this.httpIncomingResponseHeaderModificationRules = httpIncomingResponseHeaderModificationRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpIncomingResponseHeaderModificationRules> getHttpIncomingResponseHeaderModificationRules() {
            return this.httpIncomingResponseHeaderModificationRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setHttpRequestHeaderModificationRules(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
            this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
            return this.httpRequestHeaderModificationRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setHttpResponseHeaderModificationRules(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
            this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
            return this.httpResponseHeaderModificationRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setHttpsApplicationConfiguration(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration) {
            this.httpsApplicationConfiguration = httpsApplicationConfiguration;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
            return this.httpsApplicationConfiguration;
        }

        public ListSiteFunctionsResponseBodyConfigs setHttpsBasicConfiguration(java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration) {
            this.httpsBasicConfiguration = httpsBasicConfiguration;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration> getHttpsBasicConfiguration() {
            return this.httpsBasicConfiguration;
        }

        public ListSiteFunctionsResponseBodyConfigs setImageTransform(java.util.List<ListSiteFunctionsResponseBodyConfigsImageTransform> imageTransform) {
            this.imageTransform = imageTransform;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsImageTransform> getImageTransform() {
            return this.imageTransform;
        }

        public ListSiteFunctionsResponseBodyConfigs setIpv6(java.util.List<ListSiteFunctionsResponseBodyConfigsIpv6> ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsIpv6> getIpv6() {
            return this.ipv6;
        }

        public ListSiteFunctionsResponseBodyConfigs setManagedTransforms(java.util.List<ListSiteFunctionsResponseBodyConfigsManagedTransforms> managedTransforms) {
            this.managedTransforms = managedTransforms;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsManagedTransforms> getManagedTransforms() {
            return this.managedTransforms;
        }

        public ListSiteFunctionsResponseBodyConfigs setNetworkOptimization(java.util.List<ListSiteFunctionsResponseBodyConfigsNetworkOptimization> networkOptimization) {
            this.networkOptimization = networkOptimization;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsNetworkOptimization> getNetworkOptimization() {
            return this.networkOptimization;
        }

        public ListSiteFunctionsResponseBodyConfigs setOriginRules(java.util.List<ListSiteFunctionsResponseBodyConfigsOriginRules> originRules) {
            this.originRules = originRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsOriginRules> getOriginRules() {
            return this.originRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setRedirectRules(java.util.List<ListSiteFunctionsResponseBodyConfigsRedirectRules> redirectRules) {
            this.redirectRules = redirectRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsRedirectRules> getRedirectRules() {
            return this.redirectRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setRewriteUrlRules(java.util.List<ListSiteFunctionsResponseBodyConfigsRewriteUrlRules> rewriteUrlRules) {
            this.rewriteUrlRules = rewriteUrlRules;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsRewriteUrlRules> getRewriteUrlRules() {
            return this.rewriteUrlRules;
        }

        public ListSiteFunctionsResponseBodyConfigs setSeoBypass(java.util.List<ListSiteFunctionsResponseBodyConfigsSeoBypass> seoBypass) {
            this.seoBypass = seoBypass;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSeoBypass> getSeoBypass() {
            return this.seoBypass;
        }

        public ListSiteFunctionsResponseBodyConfigs setSiteNameExclusive(java.util.List<ListSiteFunctionsResponseBodyConfigsSiteNameExclusive> siteNameExclusive) {
            this.siteNameExclusive = siteNameExclusive;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSiteNameExclusive> getSiteNameExclusive() {
            return this.siteNameExclusive;
        }

        public ListSiteFunctionsResponseBodyConfigs setSitePause(java.util.List<ListSiteFunctionsResponseBodyConfigsSitePause> sitePause) {
            this.sitePause = sitePause;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSitePause> getSitePause() {
            return this.sitePause;
        }

        public ListSiteFunctionsResponseBodyConfigs setTieredCache(java.util.List<ListSiteFunctionsResponseBodyConfigsTieredCache> tieredCache) {
            this.tieredCache = tieredCache;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsTieredCache> getTieredCache() {
            return this.tieredCache;
        }

        public ListSiteFunctionsResponseBodyConfigs setVideoProcessing(java.util.List<ListSiteFunctionsResponseBodyConfigsVideoProcessing> videoProcessing) {
            this.videoProcessing = videoProcessing;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsVideoProcessing> getVideoProcessing() {
            return this.videoProcessing;
        }

    }

}
