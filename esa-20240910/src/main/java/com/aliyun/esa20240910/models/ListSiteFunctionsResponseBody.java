// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteFunctionsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public ListSiteFunctionsResponseBodyConfigs configs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

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
        @NameInMap("AdditionalCacheablePorts")
        public String additionalCacheablePorts;

        @NameInMap("BrowserCacheMode")
        public String browserCacheMode;

        @NameInMap("BrowserCacheTtl")
        public String browserCacheTtl;

        @NameInMap("BypassCache")
        public String bypassCache;

        @NameInMap("CacheDeceptionArmor")
        public String cacheDeceptionArmor;

        @NameInMap("CacheReserveEligibility")
        public String cacheReserveEligibility;

        @NameInMap("CheckPresenceCookie")
        public String checkPresenceCookie;

        @NameInMap("CheckPresenceHeader")
        public String checkPresenceHeader;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("EdgeCacheMode")
        public String edgeCacheMode;

        @NameInMap("EdgeCacheTtl")
        public String edgeCacheTtl;

        @NameInMap("EdgeStatusCodeCacheTtl")
        public String edgeStatusCodeCacheTtl;

        @NameInMap("IncludeCookie")
        public String includeCookie;

        @NameInMap("IncludeHeader")
        public String includeHeader;

        @NameInMap("QueryString")
        public String queryString;

        @NameInMap("QueryStringMode")
        public String queryStringMode;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("ServeStale")
        public String serveStale;

        @NameInMap("SortQueryStringForCache")
        public String sortQueryStringForCache;

        @NameInMap("UserDeviceType")
        public String userDeviceType;

        @NameInMap("UserGeo")
        public String userGeo;

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
        @NameInMap("CaseInsensitive")
        public String caseInsensitive;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Sequence")
        public String sequence;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("FlattenMode")
        public String flattenMode;

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
        @NameInMap("Brotli")
        public String brotli;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Gzip")
        public String gzip;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

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

    }

    public static class ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

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

    public static class ListSiteFunctionsResponseBodyConfigsDevelopmentMode extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

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

    public static class ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("RequestHeaderModification")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRulesRequestHeaderModification> requestHeaderModification;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ResponseHeaderModification")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRulesResponseHeaderModification> responseHeaderModification;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

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
        @NameInMap("AltSvc")
        public String altSvc;

        @NameInMap("AltSvcClear")
        public String altSvcClear;

        @NameInMap("AltSvcMa")
        public String altSvcMa;

        @NameInMap("AltSvcPersist")
        public String altSvcPersist;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Hsts")
        public String hsts;

        @NameInMap("HstsIncludeSubdomains")
        public String hstsIncludeSubdomains;

        @NameInMap("HstsMaxAge")
        public String hstsMaxAge;

        @NameInMap("HstsPreload")
        public String hstsPreload;

        @NameInMap("HttpsForce")
        public String httpsForce;

        @NameInMap("HttpsForceCode")
        public String httpsForceCode;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

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
        @NameInMap("Ciphersuite")
        public String ciphersuite;

        @NameInMap("CiphersuiteGroup")
        public String ciphersuiteGroup;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Http2")
        public String http2;

        @NameInMap("Http3")
        public String http3;

        @NameInMap("Https")
        public String https;

        @NameInMap("OcspStapling")
        public String ocspStapling;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("Tls10")
        public String tls10;

        @NameInMap("Tls11")
        public String tls11;

        @NameInMap("Tls12")
        public String tls12;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("Sequence")
        public String sequence;

        public static ListSiteFunctionsResponseBodyConfigsImageTransform build(java.util.Map<String, ?> map) throws Exception {
            ListSiteFunctionsResponseBodyConfigsImageTransform self = new ListSiteFunctionsResponseBodyConfigsImageTransform();
            return TeaModel.build(map, self);
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

        public ListSiteFunctionsResponseBodyConfigsImageTransform setSequence(String sequence) {
            this.sequence = sequence;
            return this;
        }
        public String getSequence() {
            return this.sequence;
        }

    }

    public static class ListSiteFunctionsResponseBodyConfigsIpv6 extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

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
        @NameInMap("AddClientGeolocationHeaders")
        public String addClientGeolocationHeaders;

        @NameInMap("AddRealClientIpHeader")
        public String addRealClientIpHeader;

        @NameInMap("ConfigId")
        public Long configId;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Grpc")
        public String grpc;

        @NameInMap("Http2Origin")
        public String http2Origin;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("SmartRouting")
        public String smartRouting;

        @NameInMap("UploadMaxFilesize")
        public String uploadMaxFilesize;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("DnsRecord")
        public String dnsRecord;

        @NameInMap("OriginHost")
        public String originHost;

        @NameInMap("OriginHttpPort")
        public String originHttpPort;

        @NameInMap("OriginHttpsPort")
        public String originHttpsPort;

        @NameInMap("OriginScheme")
        public String originScheme;

        @NameInMap("OriginSni")
        public String originSni;

        @NameInMap("Range")
        public String range;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

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

        public ListSiteFunctionsResponseBodyConfigsOriginRules setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ReserveQueryString")
        public String reserveQueryString;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("TargetUrl")
        public String targetUrl;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("QueryString")
        public String queryString;

        @NameInMap("RewriteQueryStringType")
        public String rewriteQueryStringType;

        @NameInMap("RewriteUriType")
        public String rewriteUriType;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public String sequence;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Enable")
        public String enable;

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
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("Paused")
        public String paused;

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
        @NameInMap("CacheArchitectureMode")
        public String cacheArchitectureMode;

        @NameInMap("ConfigId")
        public Long configId;

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

    public static class ListSiteFunctionsResponseBodyConfigs extends TeaModel {
        @NameInMap("CacheReserve")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheReserve> cacheReserve;

        @NameInMap("CacheRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheRules> cacheRules;

        @NameInMap("CacheTags")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCacheTags> cacheTags;

        @NameInMap("CnameFlattening")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCnameFlattening> cnameFlattening;

        @NameInMap("CompressionRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCompressionRules> compressionRules;

        @NameInMap("CrossBorderOptimization")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsCrossBorderOptimization> crossBorderOptimization;

        @NameInMap("DevelopmentMode")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsDevelopmentMode> developmentMode;

        @NameInMap("HttpRequestHeaderModificationRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpRequestHeaderModificationRules> httpRequestHeaderModificationRules;

        @NameInMap("HttpResponseHeaderModificationRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpResponseHeaderModificationRules> httpResponseHeaderModificationRules;

        @NameInMap("HttpsApplicationConfiguration")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsApplicationConfiguration> httpsApplicationConfiguration;

        @NameInMap("HttpsBasicConfiguration")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsHttpsBasicConfiguration> httpsBasicConfiguration;

        @NameInMap("ImageTransform")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsImageTransform> imageTransform;

        @NameInMap("Ipv6")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsIpv6> ipv6;

        @NameInMap("ManagedTransforms")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsManagedTransforms> managedTransforms;

        @NameInMap("NetworkOptimization")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsNetworkOptimization> networkOptimization;

        @NameInMap("OriginRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsOriginRules> originRules;

        @NameInMap("RedirectRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsRedirectRules> redirectRules;

        @NameInMap("RewriteUrlRules")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsRewriteUrlRules> rewriteUrlRules;

        @NameInMap("SeoBypass")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSeoBypass> seoBypass;

        @NameInMap("SiteNameExclusive")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSiteNameExclusive> siteNameExclusive;

        @NameInMap("SitePause")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsSitePause> sitePause;

        @NameInMap("TieredCache")
        public java.util.List<ListSiteFunctionsResponseBodyConfigsTieredCache> tieredCache;

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

        public ListSiteFunctionsResponseBodyConfigs setDevelopmentMode(java.util.List<ListSiteFunctionsResponseBodyConfigsDevelopmentMode> developmentMode) {
            this.developmentMode = developmentMode;
            return this;
        }
        public java.util.List<ListSiteFunctionsResponseBodyConfigsDevelopmentMode> getDevelopmentMode() {
            return this.developmentMode;
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

    }

}
