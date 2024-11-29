// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteFunctionResponseBody extends TeaModel {
    /**
     * <p>The returned configurations.</p>
     */
    @NameInMap("Configs")
    public CreateSiteFunctionResponseBodyConfigs configs;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSiteFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteFunctionResponseBody self = new CreateSiteFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteFunctionResponseBody setConfigs(CreateSiteFunctionResponseBodyConfigs configs) {
        this.configs = configs;
        return this;
    }
    public CreateSiteFunctionResponseBodyConfigs getConfigs() {
        return this.configs;
    }

    public CreateSiteFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSiteFunctionResponseBodyConfigsCacheReserve extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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

        public static CreateSiteFunctionResponseBodyConfigsCacheReserve build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCacheReserve self = new CreateSiteFunctionResponseBodyConfigsCacheReserve();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCacheReserve setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheReserve setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheReserve setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCacheRules extends TeaModel {
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
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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
         * <p>The cookie names and values included in the cache key. Multiple combinations are separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>cookie_exapmle</p>
         */
        @NameInMap("IncludeCookie")
        public String includeCookie;

        /**
         * <p>The header names and values included in the cache key. Multiple combinations are separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IncludeHeader")
        public String includeHeader;

        /**
         * <p>The parameters to be retained or ignored in the query string. Multiple values are separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("QueryString")
        public String queryString;

        /**
         * <p>The method to process the query string when cache keys are generated. Valid values:</p>
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
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ServeStale")
        public String serveStale;

        /**
         * <p>Indicates whether query string sorting is enabled. Valid values:</p>
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

        public static CreateSiteFunctionResponseBodyConfigsCacheRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCacheRules self = new CreateSiteFunctionResponseBodyConfigsCacheRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setAdditionalCacheablePorts(String additionalCacheablePorts) {
            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public String getAdditionalCacheablePorts() {
            return this.additionalCacheablePorts;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setBrowserCacheMode(String browserCacheMode) {
            this.browserCacheMode = browserCacheMode;
            return this;
        }
        public String getBrowserCacheMode() {
            return this.browserCacheMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setBrowserCacheTtl(String browserCacheTtl) {
            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        public String getBrowserCacheTtl() {
            return this.browserCacheTtl;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setBypassCache(String bypassCache) {
            this.bypassCache = bypassCache;
            return this;
        }
        public String getBypassCache() {
            return this.bypassCache;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCacheDeceptionArmor(String cacheDeceptionArmor) {
            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        public String getCacheDeceptionArmor() {
            return this.cacheDeceptionArmor;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCacheReserveEligibility(String cacheReserveEligibility) {
            this.cacheReserveEligibility = cacheReserveEligibility;
            return this;
        }
        public String getCacheReserveEligibility() {
            return this.cacheReserveEligibility;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCheckPresenceCookie(String checkPresenceCookie) {
            this.checkPresenceCookie = checkPresenceCookie;
            return this;
        }
        public String getCheckPresenceCookie() {
            return this.checkPresenceCookie;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setCheckPresenceHeader(String checkPresenceHeader) {
            this.checkPresenceHeader = checkPresenceHeader;
            return this;
        }
        public String getCheckPresenceHeader() {
            return this.checkPresenceHeader;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setEdgeCacheMode(String edgeCacheMode) {
            this.edgeCacheMode = edgeCacheMode;
            return this;
        }
        public String getEdgeCacheMode() {
            return this.edgeCacheMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setEdgeCacheTtl(String edgeCacheTtl) {
            this.edgeCacheTtl = edgeCacheTtl;
            return this;
        }
        public String getEdgeCacheTtl() {
            return this.edgeCacheTtl;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setEdgeStatusCodeCacheTtl(String edgeStatusCodeCacheTtl) {
            this.edgeStatusCodeCacheTtl = edgeStatusCodeCacheTtl;
            return this;
        }
        public String getEdgeStatusCodeCacheTtl() {
            return this.edgeStatusCodeCacheTtl;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setIncludeCookie(String includeCookie) {
            this.includeCookie = includeCookie;
            return this;
        }
        public String getIncludeCookie() {
            return this.includeCookie;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setIncludeHeader(String includeHeader) {
            this.includeHeader = includeHeader;
            return this;
        }
        public String getIncludeHeader() {
            return this.includeHeader;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setQueryStringMode(String queryStringMode) {
            this.queryStringMode = queryStringMode;
            return this;
        }
        public String getQueryStringMode() {
            return this.queryStringMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setServeStale(String serveStale) {
            this.serveStale = serveStale;
            return this;
        }
        public String getServeStale() {
            return this.serveStale;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setSortQueryStringForCache(String sortQueryStringForCache) {
            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        public String getSortQueryStringForCache() {
            return this.sortQueryStringForCache;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setUserDeviceType(String userDeviceType) {
            this.userDeviceType = userDeviceType;
            return this;
        }
        public String getUserDeviceType() {
            return this.userDeviceType;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setUserGeo(String userGeo) {
            this.userGeo = userGeo;
            return this;
        }
        public String getUserGeo() {
            return this.userGeo;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheRules setUserLanguage(String userLanguage) {
            this.userLanguage = userLanguage;
            return this;
        }
        public String getUserLanguage() {
            return this.userLanguage;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCacheTags extends TeaModel {
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
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The name of the custom cache tag.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static CreateSiteFunctionResponseBodyConfigsCacheTags build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCacheTags self = new CreateSiteFunctionResponseBodyConfigsCacheTags();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setCaseInsensitive(String caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public String getCaseInsensitive() {
            return this.caseInsensitive;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsCacheTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCnameFlattening extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>flatten_all</p>
         */
        @NameInMap("FlattenMode")
        public String flattenMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsCnameFlattening build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCnameFlattening self = new CreateSiteFunctionResponseBodyConfigsCnameFlattening();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCnameFlattening setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCnameFlattening setFlattenMode(String flattenMode) {
            this.flattenMode = flattenMode;
            return this;
        }
        public String getFlattenMode() {
            return this.flattenMode;
        }

        public CreateSiteFunctionResponseBodyConfigsCnameFlattening setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCompressionRules extends TeaModel {
        /**
         * <p>Indicates whether Brotli compression is enabled. Valid values:</p>
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
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether Gzip compression is enabled. Valid values:</p>
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
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsCompressionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCompressionRules self = new CreateSiteFunctionResponseBodyConfigsCompressionRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setBrotli(String brotli) {
            this.brotli = brotli;
            return this;
        }
        public String getBrotli() {
            return this.brotli;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsCompressionRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>395227502417920</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization self = new CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsDevelopmentMode extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether the development mode is enabled. Valid values:</p>
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

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsDevelopmentMode build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsDevelopmentMode self = new CreateSiteFunctionResponseBodyConfigsDevelopmentMode();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsDevelopmentMode setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsDevelopmentMode setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsDevelopmentMode setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
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

        public static CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification self = new CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Modifies a request header. You can add, delete, or modify a request header.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
         */
        @NameInMap("RequestHeaderModification")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules self = new CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRequestHeaderModification(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> getRequestHeaderModification() {
            return this.requestHeaderModification;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification extends TeaModel {
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

        public static CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification self = new CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Modifies a response header. You can add, delete, or modify a request header.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;operation&quot;:&quot;add&quot;,&quot;name&quot;:&quot;header_example_add&quot;,&quot;value&quot;:&quot;value_exapme_add&quot;},{&quot;operation&quot;:&quot;del&quot;,&quot;name&quot;:&quot;header_example_delete&quot;,&quot;value&quot;:&quot;value_exapme_delete&quot;},{&quot;operation&quot;:&quot;modify&quot;,&quot;name&quot;:&quot;header_example_update&quot;,&quot;value&quot;:&quot;value_exapme_example&quot;}]</p>
         */
        @NameInMap("ResponseHeaderModification")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;MatchType&quot;:&quot;http.request.method&quot;,&quot;MatchOperator&quot;:&quot;eq&quot;,&quot;MatchValue&quot;:&quot;GET&quot;,&quot;Negate&quot;:false}]</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules self = new CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setResponseHeaderModification(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification) {
            this.responseHeaderModification = responseHeaderModification;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> getResponseHeaderModification() {
            return this.responseHeaderModification;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration extends TeaModel {
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
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration self = new CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }
        public String getAltSvc() {
            return this.altSvc;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }
        public String getAltSvcClear() {
            return this.altSvcClear;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }
        public String getAltSvcMa() {
            return this.altSvcMa;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setAltSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
        }
        public String getAltSvcPersist() {
            return this.altSvcPersist;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHsts(String hsts) {
            this.hsts = hsts;
            return this;
        }
        public String getHsts() {
            return this.hsts;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }
        public String getHstsIncludeSubdomains() {
            return this.hstsIncludeSubdomains;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public String getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public String getHstsPreload() {
            return this.hstsPreload;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHttpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }
        public String getHttpsForce() {
            return this.httpsForce;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setHttpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
            return this;
        }
        public String getHttpsForceCode() {
            return this.httpsForceCode;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration extends TeaModel {
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
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

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

        public static CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration self = new CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setCiphersuite(String ciphersuite) {
            this.ciphersuite = ciphersuite;
            return this;
        }
        public String getCiphersuite() {
            return this.ciphersuite;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setCiphersuiteGroup(String ciphersuiteGroup) {
            this.ciphersuiteGroup = ciphersuiteGroup;
            return this;
        }
        public String getCiphersuiteGroup() {
            return this.ciphersuiteGroup;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setHttp2(String http2) {
            this.http2 = http2;
            return this;
        }
        public String getHttp2() {
            return this.http2;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setHttp3(String http3) {
            this.http3 = http3;
            return this;
        }
        public String getHttp3() {
            return this.http3;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setHttps(String https) {
            this.https = https;
            return this;
        }
        public String getHttps() {
            return this.https;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setOcspStapling(String ocspStapling) {
            this.ocspStapling = ocspStapling;
            return this;
        }
        public String getOcspStapling() {
            return this.ocspStapling;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls10(String tls10) {
            this.tls10 = tls10;
            return this;
        }
        public String getTls10() {
            return this.tls10;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls11(String tls11) {
            this.tls11 = tls11;
            return this;
        }
        public String getTls11() {
            return this.tls11;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls12(String tls12) {
            this.tls12 = tls12;
            return this;
        }
        public String getTls12() {
            return this.tls12;
        }

        public CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration setTls13(String tls13) {
            this.tls13 = tls13;
            return this;
        }
        public String getTls13() {
            return this.tls13;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsImageTransform extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether the image transformations feature is enabled. Valid values:</p>
         * <p>on</p>
         * <p>off (default)</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsImageTransform build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsImageTransform self = new CreateSiteFunctionResponseBodyConfigsImageTransform();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsImageTransform setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsImageTransform setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsImageTransform setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsIpv6 extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether IPv6 is enabled. Valid values:</p>
         * <p>on (default)</p>
         * <p>off</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsIpv6 build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsIpv6 self = new CreateSiteFunctionResponseBodyConfigsIpv6();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsIpv6 setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsIpv6 setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsIpv6 setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsManagedTransforms extends TeaModel {
        /**
         * <p>Indicates whether the header that indicates the geographical location of a client is included in an origin request. Valid values:</p>
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
         * <p>Indicates whether the &quot;ali-real-client-ip&quot; header that contains the client\&quot;s real IP address is included in an origin request. Valid values:</p>
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

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsManagedTransforms build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsManagedTransforms self = new CreateSiteFunctionResponseBodyConfigsManagedTransforms();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setAddClientGeolocationHeaders(String addClientGeolocationHeaders) {
            this.addClientGeolocationHeaders = addClientGeolocationHeaders;
            return this;
        }
        public String getAddClientGeolocationHeaders() {
            return this.addClientGeolocationHeaders;
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setAddRealClientIpHeader(String addRealClientIpHeader) {
            this.addRealClientIpHeader = addRealClientIpHeader;
            return this;
        }
        public String getAddRealClientIpHeader() {
            return this.addRealClientIpHeader;
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsManagedTransforms setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsNetworkOptimization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>390286182395904</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SmartRouting")
        public String smartRouting;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Websocket")
        public String websocket;

        public static CreateSiteFunctionResponseBodyConfigsNetworkOptimization build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsNetworkOptimization self = new CreateSiteFunctionResponseBodyConfigsNetworkOptimization();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setGrpc(String grpc) {
            this.grpc = grpc;
            return this;
        }
        public String getGrpc() {
            return this.grpc;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setHttp2Origin(String http2Origin) {
            this.http2Origin = http2Origin;
            return this;
        }
        public String getHttp2Origin() {
            return this.http2Origin;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setSmartRouting(String smartRouting) {
            this.smartRouting = smartRouting;
            return this;
        }
        public String getSmartRouting() {
            return this.smartRouting;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setUploadMaxFilesize(String uploadMaxFilesize) {
            this.uploadMaxFilesize = uploadMaxFilesize;
            return this;
        }
        public String getUploadMaxFilesize() {
            return this.uploadMaxFilesize;
        }

        public CreateSiteFunctionResponseBodyConfigsNetworkOptimization setWebsocket(String websocket) {
            this.websocket = websocket;
            return this;
        }
        public String getWebsocket() {
            return this.websocket;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsOriginRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsOriginRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsOriginRules self = new CreateSiteFunctionResponseBodyConfigsOriginRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setDnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public String getDnsRecord() {
            return this.dnsRecord;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }
        public String getOriginHttpPort() {
            return this.originHttpPort;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }
        public String getOriginHttpsPort() {
            return this.originHttpsPort;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }
        public String getOriginScheme() {
            return this.originScheme;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setOriginSni(String originSni) {
            this.originSni = originSni;
            return this;
        }
        public String getOriginSni() {
            return this.originSni;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsOriginRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsRedirectRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether the feature of retaining the query string is enabled. Valid values:</p>
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
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The response code that you want to use to indicate URL redirection. Valid values:</p>
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

        public static CreateSiteFunctionResponseBodyConfigsRedirectRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsRedirectRules self = new CreateSiteFunctionResponseBodyConfigsRedirectRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setReserveQueryString(String reserveQueryString) {
            this.reserveQueryString = reserveQueryString;
            return this;
        }
        public String getReserveQueryString() {
            return this.reserveQueryString;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateSiteFunctionResponseBodyConfigsRedirectRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsRewriteUrlRules extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

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
         * <p>Indicates whether the rule is enabled. Valid values:</p>
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
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        /**
         * <p>The desired URI to which you want to rewrite the path in the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>/image.example.com/index.html</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static CreateSiteFunctionResponseBodyConfigsRewriteUrlRules build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsRewriteUrlRules self = new CreateSiteFunctionResponseBodyConfigsRewriteUrlRules();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setQueryString(String queryString) {
            this.queryString = queryString;
            return this;
        }
        public String getQueryString() {
            return this.queryString;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRewriteQueryStringType(String rewriteQueryStringType) {
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }
        public String getRewriteQueryStringType() {
            return this.rewriteQueryStringType;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRewriteUriType(String rewriteUriType) {
            this.rewriteUriType = rewriteUriType;
            return this;
        }
        public String getRewriteUriType() {
            return this.rewriteUriType;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

        public CreateSiteFunctionResponseBodyConfigsRewriteUrlRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsSeoBypass extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether SEO crawler bypassing is enabled. Valid values:</p>
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

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsSeoBypass build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsSeoBypass self = new CreateSiteFunctionResponseBodyConfigsSeoBypass();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsSeoBypass setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsSeoBypass setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsSeoBypass setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsSiteNameExclusive extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsSiteNameExclusive build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsSiteNameExclusive self = new CreateSiteFunctionResponseBodyConfigsSiteNameExclusive();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsSiteNameExclusive setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsSiteNameExclusive setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateSiteFunctionResponseBodyConfigsSiteNameExclusive setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsSitePause extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>344147756398592</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Indicates whether ESA is paused on the website. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Paused")
        public String paused;

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsSitePause build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsSitePause self = new CreateSiteFunctionResponseBodyConfigsSitePause();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsSitePause setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsSitePause setPaused(String paused) {
            this.paused = paused;
            return this;
        }
        public String getPaused() {
            return this.paused;
        }

        public CreateSiteFunctionResponseBodyConfigsSitePause setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigsTieredCache extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>edge_smart</p>
         */
        @NameInMap("CacheArchitectureMode")
        public String cacheArchitectureMode;

        /**
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public String sequence;

        public static CreateSiteFunctionResponseBodyConfigsTieredCache build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigsTieredCache self = new CreateSiteFunctionResponseBodyConfigsTieredCache();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigsTieredCache setCacheArchitectureMode(String cacheArchitectureMode) {
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }
        public String getCacheArchitectureMode() {
            return this.cacheArchitectureMode;
        }

        public CreateSiteFunctionResponseBodyConfigsTieredCache setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public CreateSiteFunctionResponseBodyConfigsTieredCache setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class CreateSiteFunctionResponseBodyConfigs extends TeaModel {
        @NameInMap("CacheReserve")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheReserve> cacheReserve;

        /**
         * <p>The cache rules.</p>
         */
        @NameInMap("CacheRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheRules> cacheRules;

        /**
         * <p>The cache tags.</p>
         */
        @NameInMap("CacheTags")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheTags> cacheTags;

        @NameInMap("CnameFlattening")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCnameFlattening> cnameFlattening;

        /**
         * <p>The configuration of a compression rule.</p>
         */
        @NameInMap("CompressionRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCompressionRules> compressionRules;

        @NameInMap("CrossBorderOptimization")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization;

        /**
         * <p>The configuration of development mode.</p>
         */
        @NameInMap("DevelopmentMode")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsDevelopmentMode> developmentMode;

        /**
         * <p>The configuration of a request header modification rule.</p>
         */
        @NameInMap("HttpRequestHeaderModificationRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

        /**
         * <p>The configuration of a response header modification rule.</p>
         */
        @NameInMap("HttpResponseHeaderModificationRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

        @NameInMap("HttpsApplicationConfiguration")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration;

        @NameInMap("HttpsBasicConfiguration")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration;

        /**
         * <p>The configuration of image transformations.</p>
         */
        @NameInMap("ImageTransform")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsImageTransform> imageTransform;

        /**
         * <p>The IPv6 configuration.</p>
         */
        @NameInMap("Ipv6")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsIpv6> ipv6;

        /**
         * <p>The configuration of managed transforms.</p>
         */
        @NameInMap("ManagedTransforms")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsManagedTransforms> managedTransforms;

        @NameInMap("NetworkOptimization")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsNetworkOptimization> networkOptimization;

        /**
         * <p>The configuration of an origin rule.</p>
         */
        @NameInMap("OriginRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsOriginRules> originRules;

        /**
         * <p>The configuration of a redirect rule.</p>
         */
        @NameInMap("RedirectRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRedirectRules> redirectRules;

        /**
         * <p>The configuration of a URL rewrite rule.</p>
         */
        @NameInMap("RewriteUrlRules")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRewriteUrlRules> rewriteUrlRules;

        /**
         * <p>The configuration of SEO crawler bypassing.</p>
         */
        @NameInMap("SeoBypass")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSeoBypass> seoBypass;

        @NameInMap("SiteNameExclusive")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSiteNameExclusive> siteNameExclusive;

        /**
         * <p>The configuration of temporarily pausing ESA proxy on the website. If you pause ESA proxy, all requests to the domains in your DNS records go directly to your origin server.</p>
         */
        @NameInMap("SitePause")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSitePause> sitePause;

        @NameInMap("TieredCache")
        public java.util.List<CreateSiteFunctionResponseBodyConfigsTieredCache> tieredCache;

        public static CreateSiteFunctionResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateSiteFunctionResponseBodyConfigs self = new CreateSiteFunctionResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public CreateSiteFunctionResponseBodyConfigs setCacheReserve(java.util.List<CreateSiteFunctionResponseBodyConfigsCacheReserve> cacheReserve) {
            this.cacheReserve = cacheReserve;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheReserve> getCacheReserve() {
            return this.cacheReserve;
        }

        public CreateSiteFunctionResponseBodyConfigs setCacheRules(java.util.List<CreateSiteFunctionResponseBodyConfigsCacheRules> cacheRules) {
            this.cacheRules = cacheRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheRules> getCacheRules() {
            return this.cacheRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setCacheTags(java.util.List<CreateSiteFunctionResponseBodyConfigsCacheTags> cacheTags) {
            this.cacheTags = cacheTags;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCacheTags> getCacheTags() {
            return this.cacheTags;
        }

        public CreateSiteFunctionResponseBodyConfigs setCnameFlattening(java.util.List<CreateSiteFunctionResponseBodyConfigsCnameFlattening> cnameFlattening) {
            this.cnameFlattening = cnameFlattening;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCnameFlattening> getCnameFlattening() {
            return this.cnameFlattening;
        }

        public CreateSiteFunctionResponseBodyConfigs setCompressionRules(java.util.List<CreateSiteFunctionResponseBodyConfigsCompressionRules> compressionRules) {
            this.compressionRules = compressionRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCompressionRules> getCompressionRules() {
            return this.compressionRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setCrossBorderOptimization(java.util.List<CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization) {
            this.crossBorderOptimization = crossBorderOptimization;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsCrossBorderOptimization> getCrossBorderOptimization() {
            return this.crossBorderOptimization;
        }

        public CreateSiteFunctionResponseBodyConfigs setDevelopmentMode(java.util.List<CreateSiteFunctionResponseBodyConfigsDevelopmentMode> developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsDevelopmentMode> getDevelopmentMode() {
            return this.developmentMode;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpRequestHeaderModificationRules(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules) {
            this.httpRequestHeaderModificationRules = httpRequestHeaderModificationRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpRequestHeaderModificationRules> getHttpRequestHeaderModificationRules() {
            return this.httpRequestHeaderModificationRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpResponseHeaderModificationRules(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules) {
            this.httpResponseHeaderModificationRules = httpResponseHeaderModificationRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpResponseHeaderModificationRules> getHttpResponseHeaderModificationRules() {
            return this.httpResponseHeaderModificationRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpsApplicationConfiguration(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration) {
            this.httpsApplicationConfiguration = httpsApplicationConfiguration;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsApplicationConfiguration> getHttpsApplicationConfiguration() {
            return this.httpsApplicationConfiguration;
        }

        public CreateSiteFunctionResponseBodyConfigs setHttpsBasicConfiguration(java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration) {
            this.httpsBasicConfiguration = httpsBasicConfiguration;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsHttpsBasicConfiguration> getHttpsBasicConfiguration() {
            return this.httpsBasicConfiguration;
        }

        public CreateSiteFunctionResponseBodyConfigs setImageTransform(java.util.List<CreateSiteFunctionResponseBodyConfigsImageTransform> imageTransform) {
            this.imageTransform = imageTransform;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsImageTransform> getImageTransform() {
            return this.imageTransform;
        }

        public CreateSiteFunctionResponseBodyConfigs setIpv6(java.util.List<CreateSiteFunctionResponseBodyConfigsIpv6> ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsIpv6> getIpv6() {
            return this.ipv6;
        }

        public CreateSiteFunctionResponseBodyConfigs setManagedTransforms(java.util.List<CreateSiteFunctionResponseBodyConfigsManagedTransforms> managedTransforms) {
            this.managedTransforms = managedTransforms;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsManagedTransforms> getManagedTransforms() {
            return this.managedTransforms;
        }

        public CreateSiteFunctionResponseBodyConfigs setNetworkOptimization(java.util.List<CreateSiteFunctionResponseBodyConfigsNetworkOptimization> networkOptimization) {
            this.networkOptimization = networkOptimization;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsNetworkOptimization> getNetworkOptimization() {
            return this.networkOptimization;
        }

        public CreateSiteFunctionResponseBodyConfigs setOriginRules(java.util.List<CreateSiteFunctionResponseBodyConfigsOriginRules> originRules) {
            this.originRules = originRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsOriginRules> getOriginRules() {
            return this.originRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setRedirectRules(java.util.List<CreateSiteFunctionResponseBodyConfigsRedirectRules> redirectRules) {
            this.redirectRules = redirectRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRedirectRules> getRedirectRules() {
            return this.redirectRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setRewriteUrlRules(java.util.List<CreateSiteFunctionResponseBodyConfigsRewriteUrlRules> rewriteUrlRules) {
            this.rewriteUrlRules = rewriteUrlRules;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsRewriteUrlRules> getRewriteUrlRules() {
            return this.rewriteUrlRules;
        }

        public CreateSiteFunctionResponseBodyConfigs setSeoBypass(java.util.List<CreateSiteFunctionResponseBodyConfigsSeoBypass> seoBypass) {
            this.seoBypass = seoBypass;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSeoBypass> getSeoBypass() {
            return this.seoBypass;
        }

        public CreateSiteFunctionResponseBodyConfigs setSiteNameExclusive(java.util.List<CreateSiteFunctionResponseBodyConfigsSiteNameExclusive> siteNameExclusive) {
            this.siteNameExclusive = siteNameExclusive;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSiteNameExclusive> getSiteNameExclusive() {
            return this.siteNameExclusive;
        }

        public CreateSiteFunctionResponseBodyConfigs setSitePause(java.util.List<CreateSiteFunctionResponseBodyConfigsSitePause> sitePause) {
            this.sitePause = sitePause;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsSitePause> getSitePause() {
            return this.sitePause;
        }

        public CreateSiteFunctionResponseBodyConfigs setTieredCache(java.util.List<CreateSiteFunctionResponseBodyConfigsTieredCache> tieredCache) {
            this.tieredCache = tieredCache;
            return this;
        }
        public java.util.List<CreateSiteFunctionResponseBodyConfigsTieredCache> getTieredCache() {
            return this.tieredCache;
        }

    }

}
