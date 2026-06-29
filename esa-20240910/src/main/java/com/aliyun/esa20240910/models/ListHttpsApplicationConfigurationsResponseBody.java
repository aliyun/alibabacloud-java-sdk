// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpsApplicationConfigurationsResponseBody extends TeaModel {
    /**
     * <p>Response body configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListHttpsApplicationConfigurationsResponseBodyConfigs> configs;

    /**
     * <p>Current page number, same as the PageNumber request parameter.</p>
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
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
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

    public static ListHttpsApplicationConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpsApplicationConfigurationsResponseBody self = new ListHttpsApplicationConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpsApplicationConfigurationsResponseBody setConfigs(java.util.List<ListHttpsApplicationConfigurationsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListHttpsApplicationConfigurationsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListHttpsApplicationConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpsApplicationConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpsApplicationConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHttpsApplicationConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListHttpsApplicationConfigurationsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListHttpsApplicationConfigurationsResponseBodyConfigs extends TeaModel {
        /**
         * <p>Alt-Svc feature switch. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvc")
        public String altSvc;

        /**
         * <p>Whether the Alt-Svc header includes the clear parameter. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcClear")
        public String altSvcClear;

        /**
         * <p>Alt-Svc validity period in seconds. Default value: 86400 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("AltSvcMa")
        public String altSvcMa;

        /**
         * <p>Whether the Alt-Svc header includes the persist parameter. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcPersist")
        public String altSvcPersist;

        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>Configuration type. You can use this parameter to query global configurations or rule configurations. Valid values:</p>
         * <ul>
         * <li>global: Query global configurations.</li>
         * <li>rule: Query rule configurations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Whether to enable HSTS. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Hsts")
        public String hsts;

        /**
         * <p>Whether to include subdomains in HSTS. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsIncludeSubdomains")
        public String hstsIncludeSubdomains;

        /**
         * <p>HSTS expiration time in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("HstsMaxAge")
        public String hstsMaxAge;

        /**
         * <p>Whether to enable HSTS preload. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsPreload")
        public String hstsPreload;

        /**
         * <p>Whether to enable forced HTTPS. Disabled by default. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled.</p>
         * </li>
         * <li><p>off: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsForce")
        public String httpsForce;

        /**
         * <p>Forced HTTPS redirect status code. Valid values:</p>
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
         * <p>Whether to enable denial of TLS handshake requests without SNI. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsNoSniDeny")
        public String httpsNoSniDeny;

        /**
         * <p>Whether to enable SNI verification. Disabled by default. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsSniVerify")
        public String httpsSniVerify;

        /**
         * <p>Specifies the list of allowed SNI whitelist entries, separated by spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>abc edf</p>
         */
        @NameInMap("HttpsSniWhitelist")
        public String httpsSniWhitelist;

        /**
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true.</li>
         * <li>Match specified requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Valid values:</p>
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
         * <p>Rule name. This parameter does not need to be set when adding a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Rule execution order. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        public static ListHttpsApplicationConfigurationsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListHttpsApplicationConfigurationsResponseBodyConfigs self = new ListHttpsApplicationConfigurationsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setAltSvc(String altSvc) {
            this.altSvc = altSvc;
            return this;
        }
        public String getAltSvc() {
            return this.altSvc;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setAltSvcClear(String altSvcClear) {
            this.altSvcClear = altSvcClear;
            return this;
        }
        public String getAltSvcClear() {
            return this.altSvcClear;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setAltSvcMa(String altSvcMa) {
            this.altSvcMa = altSvcMa;
            return this;
        }
        public String getAltSvcMa() {
            return this.altSvcMa;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setAltSvcPersist(String altSvcPersist) {
            this.altSvcPersist = altSvcPersist;
            return this;
        }
        public String getAltSvcPersist() {
            return this.altSvcPersist;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHsts(String hsts) {
            this.hsts = hsts;
            return this;
        }
        public String getHsts() {
            return this.hsts;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
            this.hstsIncludeSubdomains = hstsIncludeSubdomains;
            return this;
        }
        public String getHstsIncludeSubdomains() {
            return this.hstsIncludeSubdomains;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHstsMaxAge(String hstsMaxAge) {
            this.hstsMaxAge = hstsMaxAge;
            return this;
        }
        public String getHstsMaxAge() {
            return this.hstsMaxAge;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHstsPreload(String hstsPreload) {
            this.hstsPreload = hstsPreload;
            return this;
        }
        public String getHstsPreload() {
            return this.hstsPreload;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHttpsForce(String httpsForce) {
            this.httpsForce = httpsForce;
            return this;
        }
        public String getHttpsForce() {
            return this.httpsForce;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHttpsForceCode(String httpsForceCode) {
            this.httpsForceCode = httpsForceCode;
            return this;
        }
        public String getHttpsForceCode() {
            return this.httpsForceCode;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHttpsNoSniDeny(String httpsNoSniDeny) {
            this.httpsNoSniDeny = httpsNoSniDeny;
            return this;
        }
        public String getHttpsNoSniDeny() {
            return this.httpsNoSniDeny;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHttpsSniVerify(String httpsSniVerify) {
            this.httpsSniVerify = httpsSniVerify;
            return this;
        }
        public String getHttpsSniVerify() {
            return this.httpsSniVerify;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setHttpsSniWhitelist(String httpsSniWhitelist) {
            this.httpsSniWhitelist = httpsSniWhitelist;
            return this;
        }
        public String getHttpsSniWhitelist() {
            return this.httpsSniWhitelist;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListHttpsApplicationConfigurationsResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

    }

}
