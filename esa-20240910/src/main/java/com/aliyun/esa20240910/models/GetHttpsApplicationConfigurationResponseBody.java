// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpsApplicationConfigurationResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to enable the Alt-Svc feature, which is disabled by default. Valid values:</p>
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
    @NameInMap("AltSvc")
    public String altSvc;

    /**
     * <p>Specifies whether to include the <code>clear</code> parameter in the Alt-Svc header, which is disabled by default. Valid values:</p>
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
    @NameInMap("AltSvcClear")
    public String altSvcClear;

    /**
     * <p>The Alt-Svc max-age, in seconds. Default: <code>86400</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("AltSvcMa")
    public String altSvcMa;

    /**
     * <p>Specifies whether to include the <code>persist</code> parameter in the Alt-Svc header, which is disabled by default. Valid values:</p>
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
    @NameInMap("AltSvcPersist")
    public String altSvcPersist;

    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type. You can query for a global or rule configuration based on this parameter. Valid values:</p>
     * <ul>
     * <li><p><code>global</code>: a global configuration.</p>
     * </li>
     * <li><p><code>rule</code>: a rule configuration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>Specifies whether to enable HSTS, which is disabled by default. Valid values:</p>
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
    @NameInMap("Hsts")
    public String hsts;

    /**
     * <p>Specifies whether to include subdomains in the HSTS policy, which is disabled by default. Valid values:</p>
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
    @NameInMap("HstsIncludeSubdomains")
    public String hstsIncludeSubdomains;

    /**
     * <p>The value of the <code>max-age</code> directive for HSTS, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("HstsMaxAge")
    public String hstsMaxAge;

    /**
     * <p>Specifies whether to enable HSTS preload, which is disabled by default. Valid values:</p>
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
    @NameInMap("HstsPreload")
    public String hstsPreload;

    /**
     * <p>Specifies whether to enable force HTTPS, which is disabled by default. Valid values:</p>
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
    @NameInMap("HttpsForce")
    public String httpsForce;

    /**
     * <p>The status code for the force HTTPS redirect. Valid values:</p>
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
     * <p>Specifies whether to deny TLS handshakes that lack an SNI, which is disabled by default. Valid values:</p>
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
    @NameInMap("HttpsNoSniDeny")
    public String httpsNoSniDeny;

    /**
     * <p>Specifies whether to enable SNI verification, which is disabled by default. Valid values:</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3790430-3A06-535F-A424-0998BD9A6C9F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The conditional expression used to match user requests. This parameter is not required for a global configuration. There are two scenarios:</p>
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
     * <p>Specifies whether to enable the rule. This parameter is not required for a global configuration. Valid values:</p>
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
     * <p>The rule execution order. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the site configuration. For sites with configuration versioning enabled, this parameter specifies the applicable site version. The default is version <code>0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetHttpsApplicationConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpsApplicationConfigurationResponseBody self = new GetHttpsApplicationConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpsApplicationConfigurationResponseBody setAltSvc(String altSvc) {
        this.altSvc = altSvc;
        return this;
    }
    public String getAltSvc() {
        return this.altSvc;
    }

    public GetHttpsApplicationConfigurationResponseBody setAltSvcClear(String altSvcClear) {
        this.altSvcClear = altSvcClear;
        return this;
    }
    public String getAltSvcClear() {
        return this.altSvcClear;
    }

    public GetHttpsApplicationConfigurationResponseBody setAltSvcMa(String altSvcMa) {
        this.altSvcMa = altSvcMa;
        return this;
    }
    public String getAltSvcMa() {
        return this.altSvcMa;
    }

    public GetHttpsApplicationConfigurationResponseBody setAltSvcPersist(String altSvcPersist) {
        this.altSvcPersist = altSvcPersist;
        return this;
    }
    public String getAltSvcPersist() {
        return this.altSvcPersist;
    }

    public GetHttpsApplicationConfigurationResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpsApplicationConfigurationResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetHttpsApplicationConfigurationResponseBody setHsts(String hsts) {
        this.hsts = hsts;
        return this;
    }
    public String getHsts() {
        return this.hsts;
    }

    public GetHttpsApplicationConfigurationResponseBody setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
        this.hstsIncludeSubdomains = hstsIncludeSubdomains;
        return this;
    }
    public String getHstsIncludeSubdomains() {
        return this.hstsIncludeSubdomains;
    }

    public GetHttpsApplicationConfigurationResponseBody setHstsMaxAge(String hstsMaxAge) {
        this.hstsMaxAge = hstsMaxAge;
        return this;
    }
    public String getHstsMaxAge() {
        return this.hstsMaxAge;
    }

    public GetHttpsApplicationConfigurationResponseBody setHstsPreload(String hstsPreload) {
        this.hstsPreload = hstsPreload;
        return this;
    }
    public String getHstsPreload() {
        return this.hstsPreload;
    }

    public GetHttpsApplicationConfigurationResponseBody setHttpsForce(String httpsForce) {
        this.httpsForce = httpsForce;
        return this;
    }
    public String getHttpsForce() {
        return this.httpsForce;
    }

    public GetHttpsApplicationConfigurationResponseBody setHttpsForceCode(String httpsForceCode) {
        this.httpsForceCode = httpsForceCode;
        return this;
    }
    public String getHttpsForceCode() {
        return this.httpsForceCode;
    }

    public GetHttpsApplicationConfigurationResponseBody setHttpsNoSniDeny(String httpsNoSniDeny) {
        this.httpsNoSniDeny = httpsNoSniDeny;
        return this;
    }
    public String getHttpsNoSniDeny() {
        return this.httpsNoSniDeny;
    }

    public GetHttpsApplicationConfigurationResponseBody setHttpsSniVerify(String httpsSniVerify) {
        this.httpsSniVerify = httpsSniVerify;
        return this;
    }
    public String getHttpsSniVerify() {
        return this.httpsSniVerify;
    }

    public GetHttpsApplicationConfigurationResponseBody setHttpsSniWhitelist(String httpsSniWhitelist) {
        this.httpsSniWhitelist = httpsSniWhitelist;
        return this;
    }
    public String getHttpsSniWhitelist() {
        return this.httpsSniWhitelist;
    }

    public GetHttpsApplicationConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHttpsApplicationConfigurationResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetHttpsApplicationConfigurationResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetHttpsApplicationConfigurationResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetHttpsApplicationConfigurationResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetHttpsApplicationConfigurationResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
