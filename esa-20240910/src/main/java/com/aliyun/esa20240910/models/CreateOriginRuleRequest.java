// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginRuleRequest extends TeaModel {
    /**
     * <p>Rewrite the DNS resolution record for the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("DnsRecord")
    public String dnsRecord;

    @NameInMap("Follow302Enable")
    public String follow302Enable;

    @NameInMap("Follow302MaxTries")
    public String follow302MaxTries;

    @NameInMap("Follow302RetainArgs")
    public String follow302RetainArgs;

    @NameInMap("Follow302RetainHeader")
    public String follow302RetainHeader;

    @NameInMap("Follow302TargetHost")
    public String follow302TargetHost;

    /**
     * <p>The HOST carried in the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>Port of the origin server when using the HTTP protocol for origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("OriginHttpPort")
    public String originHttpPort;

    /**
     * <p>Port of the origin server when using the HTTPS protocol for origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>4433</p>
     */
    @NameInMap("OriginHttpsPort")
    public String originHttpsPort;

    /**
     * <p>mTLS switch. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginMtls")
    public String originMtls;

    @NameInMap("OriginReadTimeout")
    public String originReadTimeout;

    /**
     * <p>Protocol used for the origin request. Possible values:</p>
     * <ul>
     * <li>http: Use HTTP protocol for origin requests.</li>
     * <li>https: Use HTTPS protocol for origin requests.</li>
     * <li>follow: Follow the client\&quot;s protocol for origin requests.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("OriginScheme")
    public String originScheme;

    /**
     * <p>SNI carried in the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginSni")
    public String originSni;

    /**
     * <p>Origin certificate verification switch. Possible values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginVerify")
    public String originVerify;

    /**
     * <p>Use range chunking for origin downloads. Possible values:</p>
     * <ul>
     * <li>on: Enable</li>
     * <li>off: Disable</li>
     * <li>force: Force</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Range")
    public String range;

    @NameInMap("RangeChunkSize")
    public String rangeChunkSize;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding global configurations. There are two usage scenarios:</p>
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
     * <p>Rule switch. This parameter is not required when adding global configurations. Possible values:</p>
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
     * <p>Rule name. This parameter is not required when adding global configurations.</p>
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
     * <p>340035003106221</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version of the site where the configuration takes effect. The default is version 0.</p>
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
