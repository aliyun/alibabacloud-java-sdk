// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpsApplicationConfigurationRequest extends TeaModel {
    /**
     * <p>Alt-Svc feature switch, default is disabled. Possible values:</p>
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
     * <p>Whether the Alt-Svc header includes the clear parameter, default is disabled. Possible values:</p>
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
     * <p>Alt-Svc validity period in seconds, default is 86400 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("AltSvcMa")
    public String altSvcMa;

    /**
     * <p>Whether the Alt-Svc header includes the persist parameter, default is disabled. Possible values:</p>
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
     * <p>Whether to enable HSTS, default is disabled. Possible values:</p>
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
     * <p>Whether to include subdomains in HSTS, default is disabled. Possible values:</p>
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
     * <p>Whether to enable HSTS preload, default is disabled. Possible values:</p>
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
     * <p>Whether to enable forced HTTPS, default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HttpsForce")
    public String httpsForce;

    /**
     * <p>Forced HTTPS redirect status code. Possible values:</p>
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

    @NameInMap("HttpsNoSniDeny")
    public String httpsNoSniDeny;

    @NameInMap("HttpsSniVerify")
    public String httpsSniVerify;

    @NameInMap("HttpsSniWhitelist")
    public String httpsSniWhitelist;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
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

    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, this parameter can specify the version to which the configuration applies, defaulting to version 0.</p>
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
