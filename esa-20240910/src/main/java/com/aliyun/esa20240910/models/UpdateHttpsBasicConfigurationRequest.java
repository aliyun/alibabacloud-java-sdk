// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateHttpsBasicConfigurationRequest extends TeaModel {
    /**
     * <p>The custom cipher suite to use when <code>CiphersuiteGroup</code> is set to <code>custom</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256</p>
     */
    @NameInMap("Ciphersuite")
    public String ciphersuite;

    /**
     * <p>The cipher suite group. Default value: <code>all</code>. Valid values:</p>
     * <ul>
     * <li><p><code>all</code>: All cipher suites.</p>
     * </li>
     * <li><p><code>strict</code>: strong cipher suites.</p>
     * </li>
     * <li><p><code>custom</code>: custom cipher suites.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("CiphersuiteGroup")
    public String ciphersuiteGroup;

    /**
     * <p>The configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Indicates whether HTTP/2 is enabled. Default value: <code>on</code>. Valid values:</p>
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
    @NameInMap("Http2")
    public String http2;

    /**
     * <p>Indicates whether HTTP/3 is enabled. Default value: <code>on</code>. Valid values:</p>
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
    @NameInMap("Http3")
    public String http3;

    /**
     * <p>Indicates whether HTTPS is enabled. Default value: <code>on</code>. Valid values:</p>
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
    @NameInMap("Https")
    public String https;

    /**
     * <p>Indicates whether OCSP stapling is enabled. Default value: <code>off</code>. Valid values:</p>
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
    @NameInMap("OcspStapling")
    public String ocspStapling;

    /**
     * <p>The conditional expression used to match incoming requests. This parameter is not required when you add a global configuration. Use cases:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression, for example, <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Indicates whether the rule is enabled. This parameter is not required when you add a global configuration. Valid values:</p>
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
     * <p>The rule name. This parameter is not required when you add a global configuration.</p>
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
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231231221****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Indicates whether TLS 1.0 is enabled. Default value: <code>off</code>. Valid values:</p>
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
    @NameInMap("Tls10")
    public String tls10;

    /**
     * <p>Indicates whether TLS 1.1 is enabled. Default value: <code>off</code>. Valid values:</p>
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
    @NameInMap("Tls11")
    public String tls11;

    /**
     * <p>Indicates whether TLS 1.2 is enabled. Default value: <code>off</code>. Valid values:</p>
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
    @NameInMap("Tls12")
    public String tls12;

    /**
     * <p>Indicates whether TLS 1.3 is enabled. Default value: <code>off</code>. Valid values:</p>
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
    @NameInMap("Tls13")
    public String tls13;

    public static UpdateHttpsBasicConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpsBasicConfigurationRequest self = new UpdateHttpsBasicConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpsBasicConfigurationRequest setCiphersuite(String ciphersuite) {
        this.ciphersuite = ciphersuite;
        return this;
    }
    public String getCiphersuite() {
        return this.ciphersuite;
    }

    public UpdateHttpsBasicConfigurationRequest setCiphersuiteGroup(String ciphersuiteGroup) {
        this.ciphersuiteGroup = ciphersuiteGroup;
        return this;
    }
    public String getCiphersuiteGroup() {
        return this.ciphersuiteGroup;
    }

    public UpdateHttpsBasicConfigurationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateHttpsBasicConfigurationRequest setHttp2(String http2) {
        this.http2 = http2;
        return this;
    }
    public String getHttp2() {
        return this.http2;
    }

    public UpdateHttpsBasicConfigurationRequest setHttp3(String http3) {
        this.http3 = http3;
        return this;
    }
    public String getHttp3() {
        return this.http3;
    }

    public UpdateHttpsBasicConfigurationRequest setHttps(String https) {
        this.https = https;
        return this;
    }
    public String getHttps() {
        return this.https;
    }

    public UpdateHttpsBasicConfigurationRequest setOcspStapling(String ocspStapling) {
        this.ocspStapling = ocspStapling;
        return this;
    }
    public String getOcspStapling() {
        return this.ocspStapling;
    }

    public UpdateHttpsBasicConfigurationRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateHttpsBasicConfigurationRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateHttpsBasicConfigurationRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateHttpsBasicConfigurationRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateHttpsBasicConfigurationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateHttpsBasicConfigurationRequest setTls10(String tls10) {
        this.tls10 = tls10;
        return this;
    }
    public String getTls10() {
        return this.tls10;
    }

    public UpdateHttpsBasicConfigurationRequest setTls11(String tls11) {
        this.tls11 = tls11;
        return this;
    }
    public String getTls11() {
        return this.tls11;
    }

    public UpdateHttpsBasicConfigurationRequest setTls12(String tls12) {
        this.tls12 = tls12;
        return this;
    }
    public String getTls12() {
        return this.tls12;
    }

    public UpdateHttpsBasicConfigurationRequest setTls13(String tls13) {
        this.tls13 = tls13;
        return this;
    }
    public String getTls13() {
        return this.tls13;
    }

}
