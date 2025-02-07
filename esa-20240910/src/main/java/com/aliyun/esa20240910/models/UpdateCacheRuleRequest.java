// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8880</p>
     */
    @NameInMap("AdditionalCacheablePorts")
    public String additionalCacheablePorts;

    /**
     * <strong>example:</strong>
     * <p>no_cache</p>
     */
    @NameInMap("BrowserCacheMode")
    public String browserCacheMode;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("BrowserCacheTtl")
    public String browserCacheTtl;

    /**
     * <strong>example:</strong>
     * <p>cache_all</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>follow_origin</p>
     */
    @NameInMap("EdgeCacheMode")
    public String edgeCacheMode;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeCacheTtl")
    public String edgeCacheTtl;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EdgeStatusCodeCacheTtl")
    public String edgeStatusCodeCacheTtl;

    /**
     * <strong>example:</strong>
     * <p>cookiename</p>
     */
    @NameInMap("IncludeCookie")
    public String includeCookie;

    /**
     * <strong>example:</strong>
     * <p>headername</p>
     */
    @NameInMap("IncludeHeader")
    public String includeHeader;

    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("QueryString")
    public String queryString;

    /**
     * <strong>example:</strong>
     * <p>ignore_all</p>
     */
    @NameInMap("QueryStringMode")
    public String queryStringMode;

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
     * <p>on</p>
     */
    @NameInMap("ServeStale")
    public String serveStale;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
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
