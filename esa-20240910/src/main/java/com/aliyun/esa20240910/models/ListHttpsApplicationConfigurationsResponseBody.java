// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListHttpsApplicationConfigurationsResponseBody extends TeaModel {
    /**
     * <p>A list of HTTPS application configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListHttpsApplicationConfigurationsResponseBodyConfigs> configs;

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
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         * <p>Whether to enable the Alt-Svc feature. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The Alt-Svc feature is enabled.</p>
         * </li>
         * <li><p><code>off</code>: The Alt-Svc feature is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvc")
        public String altSvc;

        /**
         * <p>Whether the Alt-Svc header includes the <code>clear</code> parameter. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The <code>clear</code> parameter is included.</p>
         * </li>
         * <li><p><code>off</code>: The <code>clear</code> parameter is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AltSvcClear")
        public String altSvcClear;

        /**
         * <p>The Alt-Svc max-age in seconds. Default: <code>86400</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("AltSvcMa")
        public String altSvcMa;

        /**
         * <p>Whether the Alt-Svc header includes the <code>persist</code> parameter. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The <code>persist</code> parameter is included.</p>
         * </li>
         * <li><p><code>off</code>: The <code>persist</code> parameter is not included.</p>
         * </li>
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
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The type of the configuration. Valid values:</p>
         * <ul>
         * <li><p><code>global</code>: A global configuration.</p>
         * </li>
         * <li><p><code>rule</code>: A rule-based configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Whether to enable HSTS. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: HSTS is enabled.</p>
         * </li>
         * <li><p><code>off</code>: HSTS is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Hsts")
        public String hsts;

        /**
         * <p>Whether the HSTS header includes the <code>includeSubDomains</code> directive. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The <code>includeSubDomains</code> directive is included.</p>
         * </li>
         * <li><p><code>off</code>: The <code>includeSubDomains</code> directive is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsIncludeSubdomains")
        public String hstsIncludeSubdomains;

        /**
         * <p>The HSTS <code>max-age</code>, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("HstsMaxAge")
        public String hstsMaxAge;

        /**
         * <p>Whether the HSTS header includes the <code>preload</code> directive. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The <code>preload</code> directive is included.</p>
         * </li>
         * <li><p><code>off</code>: The <code>preload</code> directive is not included.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HstsPreload")
        public String hstsPreload;

        /**
         * <p>Whether to enable HTTPS redirection. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: HTTPS redirection is enabled.</p>
         * </li>
         * <li><p><code>off</code>: HTTPS redirection is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsForce")
        public String httpsForce;

        /**
         * <p>The status code for HTTPS redirection. Valid values:</p>
         * <ul>
         * <li><p><code>301</code></p>
         * </li>
         * <li><p><code>302</code></p>
         * </li>
         * <li><p><code>307</code></p>
         * </li>
         * <li><p><code>308</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpsForceCode")
        public String httpsForceCode;

        /**
         * <p>Whether to reject TLS handshake requests that lack an SNI. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Requests that lack an SNI are rejected.</p>
         * </li>
         * <li><p><code>off</code>: Requests that lack an SNI are not rejected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsNoSniDeny")
        public String httpsNoSniDeny;

        /**
         * <p>Whether to enable SNI verification. Default: <code>off</code>. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: SNI verification is enabled.</p>
         * </li>
         * <li><p><code>off</code>: SNI verification is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("HttpsSniVerify")
        public String httpsSniVerify;

        /**
         * <p>The SNI allowlist. Separate multiple values with a space.</p>
         * 
         * <strong>example:</strong>
         * <p>abc edf</p>
         */
        @NameInMap("HttpsSniWhitelist")
        public String httpsSniWhitelist;

        /**
         * <p>The content of the rule, a conditional expression that matches user requests. This parameter is not required for a global configuration. The following use cases are supported:</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
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
         * <p>Whether the rule is enabled. This parameter is not required for a global configuration. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The rule is enabled.</p>
         * </li>
         * <li><p><code>off</code>: The rule is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The name of the rule. This parameter is not required for a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution priority of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The site configuration version. For sites with version management, this specifies the version to which the configuration applies. Default: <code>0</code>.</p>
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
