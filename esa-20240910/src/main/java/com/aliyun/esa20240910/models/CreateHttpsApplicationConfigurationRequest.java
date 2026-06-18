// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpsApplicationConfigurationRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the Alt-Svc header. Disabled by default. Valid values:</p>
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
     * <p>Specifies whether to include the <code>clear</code> parameter in the Alt-Svc header. Disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The parameter is included.</p>
     * </li>
     * <li><p><code>off</code>: The parameter is not included.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AltSvcClear")
    public String altSvcClear;

    /**
     * <p>The Max Age for the Alt-Svc header, in seconds. The default is 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("AltSvcMa")
    public String altSvcMa;

    /**
     * <p>Specifies whether to include the <code>persist</code> parameter in the Alt-Svc header. Disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The parameter is included.</p>
     * </li>
     * <li><p><code>off</code>: The parameter is not included.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AltSvcPersist")
    public String altSvcPersist;

    /**
     * <p>Specifies whether to enable HTTP Strict Transport Security (HSTS). Disabled by default. Valid values:</p>
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
     * <p>Specifies whether to include the <code>includeSubDomains</code> directive in the HSTS header. Disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The directive is included.</p>
     * </li>
     * <li><p><code>off</code>: The directive is not included.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HstsIncludeSubdomains")
    public String hstsIncludeSubdomains;

    /**
     * <p>The value of the <code>max-age</code> directive for the HSTS header, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("HstsMaxAge")
    public String hstsMaxAge;

    /**
     * <p>Specifies whether to enable HSTS Preload by including the <code>preload</code> directive in the HSTS header. Disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: The directive is included.</p>
     * </li>
     * <li><p><code>off</code>: The directive is not included.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HstsPreload")
    public String hstsPreload;

    /**
     * <p>Specifies whether to enable Force HTTPS. Disabled by default. Valid values:</p>
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
     * <p>The Redirection Status Code to use when Force HTTPS is enabled. Valid values:</p>
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
     * <p>Specifies whether to reject TLS Handshake Requests that do not include an SNI. Disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Rejects requests without an SNI.</p>
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
     * <p>Specifies whether to enable Server Name Indication (SNI) verification. Disabled by default. Valid values:</p>
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
     * <p>Specifies the allowlist of SNI values. Separate multiple values with a space.</p>
     * 
     * <strong>example:</strong>
     * <p>abc edf</p>
     */
    @NameInMap("HttpsSniWhitelist")
    public String httpsSniWhitelist;

    /**
     * <p>The content of the Rule, which is a Conditional Expression that matches user Requests. This parameter is optional when adding a Global Configuration. Supported use cases include:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, use a custom expression. For example: <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. This parameter is optional when adding a Global Configuration. Valid values:</p>
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
     * <p>The name of the Rule. This parameter is optional when adding a Global Configuration.</p>
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
     * <p>The ID of the Site. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The Site\&quot;s configuration Version. For Sites with version management enabled, this parameter specifies the Version to which the configuration applies. The default is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateHttpsApplicationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpsApplicationConfigurationRequest self = new CreateHttpsApplicationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpsApplicationConfigurationRequest setAltSvc(String altSvc) {
        this.altSvc = altSvc;
        return this;
    }
    public String getAltSvc() {
        return this.altSvc;
    }

    public CreateHttpsApplicationConfigurationRequest setAltSvcClear(String altSvcClear) {
        this.altSvcClear = altSvcClear;
        return this;
    }
    public String getAltSvcClear() {
        return this.altSvcClear;
    }

    public CreateHttpsApplicationConfigurationRequest setAltSvcMa(String altSvcMa) {
        this.altSvcMa = altSvcMa;
        return this;
    }
    public String getAltSvcMa() {
        return this.altSvcMa;
    }

    public CreateHttpsApplicationConfigurationRequest setAltSvcPersist(String altSvcPersist) {
        this.altSvcPersist = altSvcPersist;
        return this;
    }
    public String getAltSvcPersist() {
        return this.altSvcPersist;
    }

    public CreateHttpsApplicationConfigurationRequest setHsts(String hsts) {
        this.hsts = hsts;
        return this;
    }
    public String getHsts() {
        return this.hsts;
    }

    public CreateHttpsApplicationConfigurationRequest setHstsIncludeSubdomains(String hstsIncludeSubdomains) {
        this.hstsIncludeSubdomains = hstsIncludeSubdomains;
        return this;
    }
    public String getHstsIncludeSubdomains() {
        return this.hstsIncludeSubdomains;
    }

    public CreateHttpsApplicationConfigurationRequest setHstsMaxAge(String hstsMaxAge) {
        this.hstsMaxAge = hstsMaxAge;
        return this;
    }
    public String getHstsMaxAge() {
        return this.hstsMaxAge;
    }

    public CreateHttpsApplicationConfigurationRequest setHstsPreload(String hstsPreload) {
        this.hstsPreload = hstsPreload;
        return this;
    }
    public String getHstsPreload() {
        return this.hstsPreload;
    }

    public CreateHttpsApplicationConfigurationRequest setHttpsForce(String httpsForce) {
        this.httpsForce = httpsForce;
        return this;
    }
    public String getHttpsForce() {
        return this.httpsForce;
    }

    public CreateHttpsApplicationConfigurationRequest setHttpsForceCode(String httpsForceCode) {
        this.httpsForceCode = httpsForceCode;
        return this;
    }
    public String getHttpsForceCode() {
        return this.httpsForceCode;
    }

    public CreateHttpsApplicationConfigurationRequest setHttpsNoSniDeny(String httpsNoSniDeny) {
        this.httpsNoSniDeny = httpsNoSniDeny;
        return this;
    }
    public String getHttpsNoSniDeny() {
        return this.httpsNoSniDeny;
    }

    public CreateHttpsApplicationConfigurationRequest setHttpsSniVerify(String httpsSniVerify) {
        this.httpsSniVerify = httpsSniVerify;
        return this;
    }
    public String getHttpsSniVerify() {
        return this.httpsSniVerify;
    }

    public CreateHttpsApplicationConfigurationRequest setHttpsSniWhitelist(String httpsSniWhitelist) {
        this.httpsSniWhitelist = httpsSniWhitelist;
        return this;
    }
    public String getHttpsSniWhitelist() {
        return this.httpsSniWhitelist;
    }

    public CreateHttpsApplicationConfigurationRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpsApplicationConfigurationRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpsApplicationConfigurationRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpsApplicationConfigurationRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateHttpsApplicationConfigurationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpsApplicationConfigurationRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
