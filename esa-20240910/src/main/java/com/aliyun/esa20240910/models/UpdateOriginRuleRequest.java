// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginRuleRequest extends TeaModel {
    /**
     * <p>Configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Rewrite the DNS resolution record of the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("DnsRecord")
    public String dnsRecord;

    /**
     * <p>The HOST carried in the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>Port of the origin server when using HTTP protocol for origin pull.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("OriginHttpPort")
    public String originHttpPort;

    /**
     * <p>Port of the origin server when using HTTPS protocol for origin pull.</p>
     * 
     * <strong>example:</strong>
     * <p>4433</p>
     */
    @NameInMap("OriginHttpsPort")
    public String originHttpsPort;

    /**
     * <p>mTLS switch. Valid values:</p>
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
     * <p>Protocol used for the origin request. Valid values:</p>
     * <ul>
     * <li>http: Use HTTP protocol for origin pull.</li>
     * <li>https: Use HTTPS protocol for origin pull.</li>
     * <li>follow: Follow the client\&quot;s protocol for origin pull.</li>
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
     * <p>Origin certificate verification switch. Valid values:</p>
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
     * <p>Use range chunking for origin pull file download. Valid values:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * <li>force: Force.</li>
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
     * <p>Rule content, used to match user requests with conditional expressions. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
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
     * <p>Rule switch. This parameter is not required when adding a global configuration. Valid values:</p>
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
