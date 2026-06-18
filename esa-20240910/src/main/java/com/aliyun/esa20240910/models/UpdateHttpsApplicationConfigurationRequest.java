// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpsApplicationConfigurationRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the <code>Alt-Svc</code> header. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the Alt-Svc header.</p>
     * </li>
     * <li><p><code>off</code>: Disables the Alt-Svc header.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AltSvc")
    public String altSvc;

    /**
     * <p>Specifies whether to include the <code>clear</code> directive in the <code>Alt-Svc</code> header. The directive is not included by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Includes the directive.</p>
     * </li>
     * <li><p><code>off</code>: Does not include the directive.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AltSvcClear")
    public String altSvcClear;

    /**
     * <p>The max-age for the Alt-Svc header, in seconds. The default is 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("AltSvcMa")
    public String altSvcMa;

    /**
     * <p>Specifies whether to include the <code>persist</code> directive in the <code>Alt-Svc</code> header. The directive is not included by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Includes the directive.</p>
     * </li>
     * <li><p><code>off</code>: Does not include the directive.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Specifies whether to enable HTTP Strict Transport Security (HSTS). This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables HSTS.</p>
     * </li>
     * <li><p><code>off</code>: Disables HSTS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Hsts")
    public String hsts;

    /**
     * <p>Specifies whether to include subdomains in the HSTS policy. Subdomains are not included by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Includes subdomains.</p>
     * </li>
     * <li><p><code>off</code>: Does not include subdomains.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HstsIncludeSubdomains")
    public String hstsIncludeSubdomains;

    /**
     * <p>The HSTS max-age in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("HstsMaxAge")
    public String hstsMaxAge;

    /**
     * <p>Specifies whether to enable HSTS Preload. HSTS Preload is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables Preload.</p>
     * </li>
     * <li><p><code>off</code>: Disables Preload.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HstsPreload")
    public String hstsPreload;

    /**
     * <p>Specifies whether to enable Force HTTPS. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables Force HTTPS.</p>
     * </li>
     * <li><p><code>off</code>: Disables Force HTTPS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HttpsForce")
    public String httpsForce;

    /**
     * <p>The redirect status code for Force HTTPS. Valid values:</p>
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
     * <p>Specifies whether to deny TLS handshake requests that do not include an SNI. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Denies requests without an SNI.</p>
     * </li>
     * <li><p><code>off</code>: Allows requests without an SNI.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HttpsNoSniDeny")
    public String httpsNoSniDeny;

    /**
     * <p>Specifies whether to enable Server Name Indication (SNI) verification. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables SNI verification.</p>
     * </li>
     * <li><p><code>off</code>: Disables SNI verification.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HttpsSniVerify")
    public String httpsSniVerify;

    /**
     * <p>The SNI allowlist. Separate multiple hostnames with spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>abc edf</p>
     */
    @NameInMap("HttpsSniWhitelist")
    public String httpsSniWhitelist;

    /**
     * <p>The conditional expression that the rule uses to match requests. This parameter is not required for a global configuration.</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, provide a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code></p>
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
     * <li><p><code>on</code>: Enables the rule.</p>
     * </li>
     * <li><p><code>off</code>: Disables the rule.</p>
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
     * <p>The execution order of the rule. A lower value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. To obtain this ID, call the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateHttpsApplicationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpsApplicationConfigurationRequest self = new UpdateHttpsApplicationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpsApplicationConfigurationRequest setAltSvc(String altSvc) {
        this.altSvc = altSvc;
        return this;
    }
    public String getAltSvc() {
        return this.altSvc;
    }

    public UpdateHttpsApplicationConfigurationRequest setAltSvcClear(String altSvcClear) {
        this.altSvcClear = altSvcClear;
        return this;
    }
    public String getAltSvcClear() {
        return this.altSvcClear;
    }

    public UpdateHttpsApplicationConfigurationRequest setAltSvcMa(String altSvcMa) {
        this.altSvcMa = altSvcMa;
        return this;
    }
    public String getAltSvcMa() {
        return this.altSvcMa;
    }

    public UpdateHttpsApplicationConfigurationRequest setAltSvcPersist(String altSvcPersist) {
        this.altSvcPersist = altSvcPersist;
        return this;
    }
    public String getAltSvcPersist() {
        return this.altSvcPersist;
    }

    public UpdateHttpsApplicationConfigurationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpsApplicationConfigurationRequest setHsts(String hsts) {
        this.hsts = hsts;
        return this;
    }
    public String getHsts() {
        return this.hsts;
    }

    public UpdateHttpsApplicationConfigurationRequest setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
        this.hstsIncludeSubdomains = hstsIncludeSubdomains;
        return this;
    }
    public String getHstsIncludeSubdomains() {
        return this.hstsIncludeSubdomains;
    }

    public UpdateHttpsApplicationConfigurationRequest setHstsMaxAge(String hstsMaxAge) {
        this.hstsMaxAge = hstsMaxAge;
        return this;
    }
    public String getHstsMaxAge() {
        return this.hstsMaxAge;
    }

    public UpdateHttpsApplicationConfigurationRequest setHstsPreload(String hstsPreload) {
        this.hstsPreload = hstsPreload;
        return this;
    }
    public String getHstsPreload() {
        return this.hstsPreload;
    }

    public UpdateHttpsApplicationConfigurationRequest setHttpsForce(String httpsForce) {
        this.httpsForce = httpsForce;
        return this;
    }
    public String getHttpsForce() {
        return this.httpsForce;
    }

    public UpdateHttpsApplicationConfigurationRequest setHttpsForceCode(String httpsForceCode) {
        this.httpsForceCode = httpsForceCode;
        return this;
    }
    public String getHttpsForceCode() {
        return this.httpsForceCode;
    }

    public UpdateHttpsApplicationConfigurationRequest setHttpsNoSniDeny(String httpsNoSniDeny) {
        this.httpsNoSniDeny = httpsNoSniDeny;
        return this;
    }
    public String getHttpsNoSniDeny() {
        return this.httpsNoSniDeny;
    }

    public UpdateHttpsApplicationConfigurationRequest setHttpsSniVerify(String httpsSniVerify) {
        this.httpsSniVerify = httpsSniVerify;
        return this;
    }
    public String getHttpsSniVerify() {
        return this.httpsSniVerify;
    }

    public UpdateHttpsApplicationConfigurationRequest setHttpsSniWhitelist(String httpsSniWhitelist) {
        this.httpsSniWhitelist = httpsSniWhitelist;
        return this;
    }
    public String getHttpsSniWhitelist() {
        return this.httpsSniWhitelist;
    }

    public UpdateHttpsApplicationConfigurationRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpsApplicationConfigurationRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpsApplicationConfigurationRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpsApplicationConfigurationRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpsApplicationConfigurationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
