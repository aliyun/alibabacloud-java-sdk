// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginRuleRequest extends TeaModel {
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
     * <p>Overrides the DNS record for the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("DnsRecord")
    public String dnsRecord;

    /**
     * <p>Indicates whether to follow 302 redirects for origin requests. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Follows 302 redirects.</p>
     * </li>
     * <li><p><code>off</code>: Does not follow 302 redirects.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302Enable")
    public String follow302Enable;

    /**
     * <p>The maximum number of 302 redirects to follow. The value must be an integer from 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Follow302MaxTries")
    public String follow302MaxTries;

    /**
     * <p>Indicates whether to retain the original request parameters when following a 302 redirect. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Retains the parameters.</p>
     * </li>
     * <li><p><code>off</code>: Does not retain the parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302RetainArgs")
    public String follow302RetainArgs;

    /**
     * <p>Indicates whether to retain the original request headers when following a 302 redirect. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Retains the headers.</p>
     * </li>
     * <li><p><code>off</code>: Does not retain the headers.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302RetainHeader")
    public String follow302RetainHeader;

    /**
     * <p>The <code>Host</code> header for the redirected origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Follow302TargetHost")
    public String follow302TargetHost;

    /**
     * <p>The <code>Host</code> header for the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>The origin server port for HTTP requests.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("OriginHttpPort")
    public String originHttpPort;

    /**
     * <p>The origin server port for HTTPS requests.</p>
     * 
     * <strong>example:</strong>
     * <p>4433</p>
     */
    @NameInMap("OriginHttpsPort")
    public String originHttpsPort;

    /**
     * <p>Indicates whether to enable mutual TLS (mTLS) for origin requests. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables mTLS.</p>
     * </li>
     * <li><p><code>off</code>: Disables mTLS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginMtls")
    public String originMtls;

    /**
     * <p>The read timeout period for the origin server, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OriginReadTimeout")
    public String originReadTimeout;

    /**
     * <p>The protocol for origin requests. Valid values:</p>
     * <ul>
     * <li><p><code>http</code>: The origin request uses HTTP.</p>
     * </li>
     * <li><p><code>https</code>: The origin request uses HTTPS.</p>
     * </li>
     * <li><p><code>follow</code>: The origin request uses the same protocol as the client request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("OriginScheme")
    public String originScheme;

    /**
     * <p>The Server Name Indication (SNI) for the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginSni")
    public String originSni;

    /**
     * <p>Indicates whether to enable origin certificate verification. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables verification.</p>
     * </li>
     * <li><p><code>off</code>: Disables verification.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginVerify")
    public String originVerify;

    /**
     * <p>Indicates whether to use range requests when fetching files from the origin server. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables range requests.</p>
     * </li>
     * <li><p><code>off</code>: Disables range requests.</p>
     * </li>
     * <li><p><code>force</code>: Enforces range requests.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Range")
    public String range;

    /**
     * <p>The size of each chunk for range requests. Valid values:</p>
     * <ul>
     * <li><p>512KB</p>
     * </li>
     * <li><p>1MB</p>
     * </li>
     * <li><p>2MB</p>
     * </li>
     * <li><p>4MB</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1MB</p>
     */
    @NameInMap("RangeChunkSize")
    public String rangeChunkSize;

    /**
     * <p>The rule content, which is a conditional expression that matches user requests. This parameter is not required when you add a global configuration.</p>
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
     * <p>Indicates whether the rule is enabled. This parameter is not required when you add a global configuration. Valid values:</p>
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
     * <p>The rule name. This parameter is not required when you add a global configuration.</p>
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
     * <p>The site ID. You can get this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5407498413****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateOriginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginRuleRequest self = new UpdateOriginRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOriginRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateOriginRuleRequest setDnsRecord(String dnsRecord) {
        this.dnsRecord = dnsRecord;
        return this;
    }
    public String getDnsRecord() {
        return this.dnsRecord;
    }

    public UpdateOriginRuleRequest setFollow302Enable(String follow302Enable) {
        this.follow302Enable = follow302Enable;
        return this;
    }
    public String getFollow302Enable() {
        return this.follow302Enable;
    }

    public UpdateOriginRuleRequest setFollow302MaxTries(String follow302MaxTries) {
        this.follow302MaxTries = follow302MaxTries;
        return this;
    }
    public String getFollow302MaxTries() {
        return this.follow302MaxTries;
    }

    public UpdateOriginRuleRequest setFollow302RetainArgs(String follow302RetainArgs) {
        this.follow302RetainArgs = follow302RetainArgs;
        return this;
    }
    public String getFollow302RetainArgs() {
        return this.follow302RetainArgs;
    }

    public UpdateOriginRuleRequest setFollow302RetainHeader(String follow302RetainHeader) {
        this.follow302RetainHeader = follow302RetainHeader;
        return this;
    }
    public String getFollow302RetainHeader() {
        return this.follow302RetainHeader;
    }

    public UpdateOriginRuleRequest setFollow302TargetHost(String follow302TargetHost) {
        this.follow302TargetHost = follow302TargetHost;
        return this;
    }
    public String getFollow302TargetHost() {
        return this.follow302TargetHost;
    }

    public UpdateOriginRuleRequest setOriginHost(String originHost) {
        this.originHost = originHost;
        return this;
    }
    public String getOriginHost() {
        return this.originHost;
    }

    public UpdateOriginRuleRequest setOriginHttpPort(String originHttpPort) {
        this.originHttpPort = originHttpPort;
        return this;
    }
    public String getOriginHttpPort() {
        return this.originHttpPort;
    }

    public UpdateOriginRuleRequest setOriginHttpsPort(String originHttpsPort) {
        this.originHttpsPort = originHttpsPort;
        return this;
    }
    public String getOriginHttpsPort() {
        return this.originHttpsPort;
    }

    public UpdateOriginRuleRequest setOriginMtls(String originMtls) {
        this.originMtls = originMtls;
        return this;
    }
    public String getOriginMtls() {
        return this.originMtls;
    }

    public UpdateOriginRuleRequest setOriginReadTimeout(String originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
        return this;
    }
    public String getOriginReadTimeout() {
        return this.originReadTimeout;
    }

    public UpdateOriginRuleRequest setOriginScheme(String originScheme) {
        this.originScheme = originScheme;
        return this;
    }
    public String getOriginScheme() {
        return this.originScheme;
    }

    public UpdateOriginRuleRequest setOriginSni(String originSni) {
        this.originSni = originSni;
        return this;
    }
    public String getOriginSni() {
        return this.originSni;
    }

    public UpdateOriginRuleRequest setOriginVerify(String originVerify) {
        this.originVerify = originVerify;
        return this;
    }
    public String getOriginVerify() {
        return this.originVerify;
    }

    public UpdateOriginRuleRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public UpdateOriginRuleRequest setRangeChunkSize(String rangeChunkSize) {
        this.rangeChunkSize = rangeChunkSize;
        return this;
    }
    public String getRangeChunkSize() {
        return this.rangeChunkSize;
    }

    public UpdateOriginRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateOriginRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateOriginRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateOriginRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateOriginRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
