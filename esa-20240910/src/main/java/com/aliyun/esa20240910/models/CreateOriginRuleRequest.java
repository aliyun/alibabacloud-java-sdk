// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginRuleRequest extends TeaModel {
    /**
     * <p>Overrides the DNS Record for Origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("DnsRecord")
    public String dnsRecord;

    /**
     * <p>Specifies whether to follow 302 redirects from the Origin. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables following redirects.</p>
     * </li>
     * <li><p><code>off</code>: Disables following redirects.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302Enable")
    public String follow302Enable;

    /**
     * <p>The maximum number of 302 redirects to follow. Valid range: 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Follow302MaxTries")
    public String follow302MaxTries;

    /**
     * <p>Specifies whether to retain the original request parameters when following a 302 redirect. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Retains the request parameters.</p>
     * </li>
     * <li><p><code>off</code>: Does not retain the request parameters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302RetainArgs")
    public String follow302RetainArgs;

    /**
     * <p>Specifies whether to retain the original request header when following a 302 redirect. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Retains the request header.</p>
     * </li>
     * <li><p><code>off</code>: Does not retain the request header.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302RetainHeader")
    public String follow302RetainHeader;

    /**
     * <p>The Origin <code>Host</code> header to use after a 302 redirect.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Follow302TargetHost")
    public String follow302TargetHost;

    /**
     * <p>The <code>Host</code> header to use in Origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>The Origin Port to use for HTTP Origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("OriginHttpPort")
    public String originHttpPort;

    /**
     * <p>The Origin Port to use for HTTPS Origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>4433</p>
     */
    @NameInMap("OriginHttpsPort")
    public String originHttpsPort;

    /**
     * <p>Specifies whether to enable mutual Transport Layer Security (mTLS) for Origin connections. Valid values:</p>
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
     * <p>The Origin read timeout in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OriginReadTimeout")
    public String originReadTimeout;

    /**
     * <p>The protocol for Origin requests. Valid values:</p>
     * <ul>
     * <li><p><code>http</code>: Uses the HTTP protocol.</p>
     * </li>
     * <li><p><code>https</code>: Uses the HTTPS protocol.</p>
     * </li>
     * <li><p><code>follow</code>: Uses the same protocol as the client request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("OriginScheme")
    public String originScheme;

    /**
     * <p>The Server Name Indication (SNI) to use in Origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginSni")
    public String originSni;

    /**
     * <p>Specifies whether to enable Origin Certificate Verification. Valid values:</p>
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
     * <p>Specifies whether to use range requests to download files from the Origin. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables range requests.</p>
     * </li>
     * <li><p><code>off</code>: Disables range requests.</p>
     * </li>
     * <li><p><code>force</code>: Forces range requests.</p>
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
     * <li><p><code>512KB</code></p>
     * </li>
     * <li><p><code>1MB</code></p>
     * </li>
     * <li><p><code>2MB</code></p>
     * </li>
     * <li><p><code>4MB</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1MB</p>
     */
    @NameInMap("RangeChunkSize")
    public String rangeChunkSize;

    /**
     * <p>The content of the rule, a Conditional Expression that matches user requests. Not required when creating a Global Configuration. There are two scenarios:</p>
     * <ul>
     * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
     * </li>
     * <li><p>To match specific requests, set the value to a custom expression. Example: <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. Not required when creating a Global Configuration. Valid values:</p>
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
     * <p>The rule name. Not required when creating a Global Configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The priority of the rule. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The ID of the site. You can obtain this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>For sites with version management enabled, this specifies the version to which the configuration applies. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static CreateOriginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginRuleRequest self = new CreateOriginRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOriginRuleRequest setDnsRecord(String dnsRecord) {
        this.dnsRecord = dnsRecord;
        return this;
    }
    public String getDnsRecord() {
        return this.dnsRecord;
    }

    public CreateOriginRuleRequest setFollow302Enable(String follow302Enable) {
        this.follow302Enable = follow302Enable;
        return this;
    }
    public String getFollow302Enable() {
        return this.follow302Enable;
    }

    public CreateOriginRuleRequest setFollow302MaxTries(String follow302MaxTries) {
        this.follow302MaxTries = follow302MaxTries;
        return this;
    }
    public String getFollow302MaxTries() {
        return this.follow302MaxTries;
    }

    public CreateOriginRuleRequest setFollow302RetainArgs(String follow302RetainArgs) {
        this.follow302RetainArgs = follow302RetainArgs;
        return this;
    }
    public String getFollow302RetainArgs() {
        return this.follow302RetainArgs;
    }

    public CreateOriginRuleRequest setFollow302RetainHeader(String follow302RetainHeader) {
        this.follow302RetainHeader = follow302RetainHeader;
        return this;
    }
    public String getFollow302RetainHeader() {
        return this.follow302RetainHeader;
    }

    public CreateOriginRuleRequest setFollow302TargetHost(String follow302TargetHost) {
        this.follow302TargetHost = follow302TargetHost;
        return this;
    }
    public String getFollow302TargetHost() {
        return this.follow302TargetHost;
    }

    public CreateOriginRuleRequest setOriginHost(String originHost) {
        this.originHost = originHost;
        return this;
    }
    public String getOriginHost() {
        return this.originHost;
    }

    public CreateOriginRuleRequest setOriginHttpPort(String originHttpPort) {
        this.originHttpPort = originHttpPort;
        return this;
    }
    public String getOriginHttpPort() {
        return this.originHttpPort;
    }

    public CreateOriginRuleRequest setOriginHttpsPort(String originHttpsPort) {
        this.originHttpsPort = originHttpsPort;
        return this;
    }
    public String getOriginHttpsPort() {
        return this.originHttpsPort;
    }

    public CreateOriginRuleRequest setOriginMtls(String originMtls) {
        this.originMtls = originMtls;
        return this;
    }
    public String getOriginMtls() {
        return this.originMtls;
    }

    public CreateOriginRuleRequest setOriginReadTimeout(String originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
        return this;
    }
    public String getOriginReadTimeout() {
        return this.originReadTimeout;
    }

    public CreateOriginRuleRequest setOriginScheme(String originScheme) {
        this.originScheme = originScheme;
        return this;
    }
    public String getOriginScheme() {
        return this.originScheme;
    }

    public CreateOriginRuleRequest setOriginSni(String originSni) {
        this.originSni = originSni;
        return this;
    }
    public String getOriginSni() {
        return this.originSni;
    }

    public CreateOriginRuleRequest setOriginVerify(String originVerify) {
        this.originVerify = originVerify;
        return this;
    }
    public String getOriginVerify() {
        return this.originVerify;
    }

    public CreateOriginRuleRequest setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public CreateOriginRuleRequest setRangeChunkSize(String rangeChunkSize) {
        this.rangeChunkSize = rangeChunkSize;
        return this;
    }
    public String getRangeChunkSize() {
        return this.rangeChunkSize;
    }

    public CreateOriginRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateOriginRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public CreateOriginRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateOriginRuleRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public CreateOriginRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateOriginRuleRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
