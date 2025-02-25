// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateHttpsBasicConfigurationRequest extends TeaModel {
    /**
     * <p>Custom cipher suite, indicating the specific encryption algorithm selected when CiphersuiteGroup is set to custom.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256</p>
     */
    @NameInMap("Ciphersuite")
    public String ciphersuite;

    /**
     * <p>Cipher suite group. Default is all cipher suites. Possible values:</p>
     * <ul>
     * <li>all: All cipher suites.</li>
     * <li>strict: Strong cipher suites.</li>
     * <li>custom: Custom cipher suites.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("CiphersuiteGroup")
    public String ciphersuiteGroup;

    /**
     * <p>Whether to enable HTTP2. Default is enabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Http2")
    public String http2;

    /**
     * <p>Whether to enable HTTP3. Default is enabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Http3")
    public String http3;

    /**
     * <p>Whether to enable HTTPS. Default is enabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Https")
    public String https;

    /**
     * <p>Whether to enable OCSP. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OcspStapling")
    public String ocspStapling;

    /**
     * <p>Rule content.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. Possible values:</p>
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
     * <p>Rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Whether to enable TLS1.0. Default is disabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Tls10")
    public String tls10;

    /**
     * <p>Whether to enable TLS1.1. Default is enabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Tls11")
    public String tls11;

    /**
     * <p>Whether to enable TLS1.2. Default is enabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Tls12")
    public String tls12;

    /**
     * <p>Whether to enable TLS1.3. Default is enabled. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Tls13")
    public String tls13;

    public static CreateHttpsBasicConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpsBasicConfigurationRequest self = new CreateHttpsBasicConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateHttpsBasicConfigurationRequest setCiphersuite(String ciphersuite) {
        this.ciphersuite = ciphersuite;
        return this;
    }
    public String getCiphersuite() {
        return this.ciphersuite;
    }

    public CreateHttpsBasicConfigurationRequest setCiphersuiteGroup(String ciphersuiteGroup) {
        this.ciphersuiteGroup = ciphersuiteGroup;
        return this;
    }
    public String getCiphersuiteGroup() {
        return this.ciphersuiteGroup;
    }

    public CreateHttpsBasicConfigurationRequest setHttp2(String http2) {
        this.http2 = http2;
        return this;
    }
    public String getHttp2() {
        return this.http2;
    }

    public CreateHttpsBasicConfigurationRequest setHttp3(String http3) {
        this.http3 = http3;
        return this;
    }
    public String getHttp3() {
        return this.http3;
    }

    public CreateHttpsBasicConfigurationRequest setHttps(String https) {
        this.https = https;
        return this;
    }
    public String getHttps() {
        return this.https;
    }

    public CreateHttpsBasicConfigurationRequest setOcspStapling(String ocspStapling) {
        this.ocspStapling = ocspStapling;
        return this;
    }
    public String getOcspStapling() {
        return this.ocspStapling;
    }

    public CreateHttpsBasicConfigurationRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateHttpsBasicConfigurationRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateHttpsBasicConfigurationRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateHttpsBasicConfigurationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateHttpsBasicConfigurationRequest setTls10(String tls10) {
        this.tls10 = tls10;
        return this;
    }
    public String getTls10() {
        return this.tls10;
    }

    public CreateHttpsBasicConfigurationRequest setTls11(String tls11) {
        this.tls11 = tls11;
        return this;
    }
    public String getTls11() {
        return this.tls11;
    }

    public CreateHttpsBasicConfigurationRequest setTls12(String tls12) {
        this.tls12 = tls12;
        return this;
    }
    public String getTls12() {
        return this.tls12;
    }

    public CreateHttpsBasicConfigurationRequest setTls13(String tls13) {
        this.tls13 = tls13;
        return this;
    }
    public String getTls13() {
        return this.tls13;
    }

}
