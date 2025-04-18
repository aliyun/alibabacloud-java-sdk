// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginRuleResponseBody extends TeaModel {
    /**
     * <p>Configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Configuration type, which can be used to query global or rule configurations. Value range:</p>
     * <ul>
     * <li>global: Query global configuration.</li>
     * <li>rule: Query rule configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("ConfigType")
    public String configType;

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
     * <p>HOST carried in the origin request.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>Port of the origin server accessed when using the HTTP protocol for origin.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("OriginHttpPort")
    public String originHttpPort;

    /**
     * <p>Port of the origin server accessed when using the HTTPS protocol for origin.</p>
     * 
     * <strong>example:</strong>
     * <p>4433</p>
     */
    @NameInMap("OriginHttpsPort")
    public String originHttpsPort;

    /**
     * <p>mTLS switch. Value range:</p>
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
     * <p>Protocol used for the origin request. Value range:</p>
     * <ul>
     * <li>http: Use HTTP protocol for origin.</li>
     * <li>https: Use HTTPS protocol for origin.</li>
     * <li>follow: Follow the client\&quot;s protocol for origin.</li>
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
     * <p>Origin certificate verification switch. Value range: </p>
     * <ul>
     * <li>on: Enable. </li>
     * <li>off: Disable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginVerify")
    public String originVerify;

    /**
     * <p>Use the range chunk method for origin file download. Value range:</p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding a global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq \&quot;video.example.com\&quot;)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter does not need to be set when adding a global configuration. Value range:</p>
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
     * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the effective version of the site configuration, defaulting to version 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static GetOriginRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOriginRuleResponseBody self = new GetOriginRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOriginRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetOriginRuleResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetOriginRuleResponseBody setDnsRecord(String dnsRecord) {
        this.dnsRecord = dnsRecord;
        return this;
    }
    public String getDnsRecord() {
        return this.dnsRecord;
    }

    public GetOriginRuleResponseBody setFollow302Enable(String follow302Enable) {
        this.follow302Enable = follow302Enable;
        return this;
    }
    public String getFollow302Enable() {
        return this.follow302Enable;
    }

    public GetOriginRuleResponseBody setFollow302MaxTries(String follow302MaxTries) {
        this.follow302MaxTries = follow302MaxTries;
        return this;
    }
    public String getFollow302MaxTries() {
        return this.follow302MaxTries;
    }

    public GetOriginRuleResponseBody setFollow302RetainArgs(String follow302RetainArgs) {
        this.follow302RetainArgs = follow302RetainArgs;
        return this;
    }
    public String getFollow302RetainArgs() {
        return this.follow302RetainArgs;
    }

    public GetOriginRuleResponseBody setFollow302RetainHeader(String follow302RetainHeader) {
        this.follow302RetainHeader = follow302RetainHeader;
        return this;
    }
    public String getFollow302RetainHeader() {
        return this.follow302RetainHeader;
    }

    public GetOriginRuleResponseBody setFollow302TargetHost(String follow302TargetHost) {
        this.follow302TargetHost = follow302TargetHost;
        return this;
    }
    public String getFollow302TargetHost() {
        return this.follow302TargetHost;
    }

    public GetOriginRuleResponseBody setOriginHost(String originHost) {
        this.originHost = originHost;
        return this;
    }
    public String getOriginHost() {
        return this.originHost;
    }

    public GetOriginRuleResponseBody setOriginHttpPort(String originHttpPort) {
        this.originHttpPort = originHttpPort;
        return this;
    }
    public String getOriginHttpPort() {
        return this.originHttpPort;
    }

    public GetOriginRuleResponseBody setOriginHttpsPort(String originHttpsPort) {
        this.originHttpsPort = originHttpsPort;
        return this;
    }
    public String getOriginHttpsPort() {
        return this.originHttpsPort;
    }

    public GetOriginRuleResponseBody setOriginMtls(String originMtls) {
        this.originMtls = originMtls;
        return this;
    }
    public String getOriginMtls() {
        return this.originMtls;
    }

    public GetOriginRuleResponseBody setOriginReadTimeout(String originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
        return this;
    }
    public String getOriginReadTimeout() {
        return this.originReadTimeout;
    }

    public GetOriginRuleResponseBody setOriginScheme(String originScheme) {
        this.originScheme = originScheme;
        return this;
    }
    public String getOriginScheme() {
        return this.originScheme;
    }

    public GetOriginRuleResponseBody setOriginSni(String originSni) {
        this.originSni = originSni;
        return this;
    }
    public String getOriginSni() {
        return this.originSni;
    }

    public GetOriginRuleResponseBody setOriginVerify(String originVerify) {
        this.originVerify = originVerify;
        return this;
    }
    public String getOriginVerify() {
        return this.originVerify;
    }

    public GetOriginRuleResponseBody setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

    public GetOriginRuleResponseBody setRangeChunkSize(String rangeChunkSize) {
        this.rangeChunkSize = rangeChunkSize;
        return this;
    }
    public String getRangeChunkSize() {
        return this.rangeChunkSize;
    }

    public GetOriginRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOriginRuleResponseBody setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public GetOriginRuleResponseBody setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public GetOriginRuleResponseBody setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetOriginRuleResponseBody setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public GetOriginRuleResponseBody setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

}
