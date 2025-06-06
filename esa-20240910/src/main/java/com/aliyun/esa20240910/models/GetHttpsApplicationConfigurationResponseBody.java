// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpsApplicationConfigurationResponseBody extends TeaModel {
    /**
     * <p>Alt-Svc feature switch. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AltSvc")
    public String altSvc;

    /**
     * <p>Whether the Alt-Svc header includes the clear parameter. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AltSvcClear")
    public String altSvcClear;

    /**
     * <p>Alt-Svc validity period in seconds. The default is 86400 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("AltSvcMa")
    public String altSvcMa;

    /**
     * <p>Whether the Alt-Svc header includes the persist parameter. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
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
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Configuration type, which can be used to query global or rule configurations. Possible values:</p>
     * <ul>
     * <li>global: Query global configuration.</li>
     * <li>rule: Query rule configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>Whether to enable HSTS. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Hsts")
    public String hsts;

    /**
     * <p>Whether to include subdomains in HSTS, default is off. Value range:</p>
     * <ul>
     * <li>on: enabled. </li>
     * <li>off: disabled.</li>
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
     * <p>Whether to enable HSTS preload, default is off. Value range:</p>
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
     * <p>Whether to enable forced HTTPS. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("HttpsForce")
    public String httpsForce;

    /**
     * <p>Status code for forced HTTPS redirection. Possible values:</p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3790430-3A06-535F-A424-0998BD9A6C9F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true.</li>
     * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
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
     * <p>Rule execution order. The smaller the value, the higher the priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version of the site for which the configuration takes effect. The default is version 0.</p>
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
