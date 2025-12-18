// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginRuleResponseBody extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The configuration type to query. Valid values:</p>
     * <ul>
     * <li>global: global configurations.</li>
     * <li>rule: rule configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rule</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The hostname that overrides the resolved hostname of an incoming request.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.com</p>
     */
    @NameInMap("DnsRecord")
    public String dnsRecord;

    /**
     * <p>302 follow switch. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302Enable")
    public String follow302Enable;

    /**
     * <p>The maximum number of 302 follow times. Valid values: 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Follow302MaxTries")
    public String follow302MaxTries;

    /**
     * <p>Retains the original request parameters switch. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302RetainArgs")
    public String follow302RetainArgs;

    /**
     * <p>Retain the original request header switch. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Follow302RetainHeader")
    public String follow302RetainHeader;

    /**
     * <p>Target Host</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Follow302TargetHost")
    public String follow302TargetHost;

    /**
     * <p>The Host header in origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginHost")
    public String originHost;

    /**
     * <p>The origin port that is accessed when the HTTP protocol is used to back to the origin.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("OriginHttpPort")
    public String originHttpPort;

    /**
     * <p>The origin port that is accessed when the HTTPS protocol is used to back to the origin.</p>
     * 
     * <strong>example:</strong>
     * <p>4433</p>
     */
    @NameInMap("OriginHttpsPort")
    public String originHttpsPort;

    /**
     * <p>The MTLS switch. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginMtls")
    public String originMtls;

    /**
     * <p>The read timeout period (in seconds) on the origin.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OriginReadTimeout")
    public String originReadTimeout;

    /**
     * <p>The protocol used for origin requests. Valid values:</p>
     * <ul>
     * <li>http: HTTP.</li>
     * <li>https: HTTPS.</li>
     * <li>follow: follows the protocol used by the client.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("OriginScheme")
    public String originScheme;

    /**
     * <p>The SNI in origin requests.</p>
     * 
     * <strong>example:</strong>
     * <p>origin.example.com</p>
     */
    @NameInMap("OriginSni")
    public String originSni;

    /**
     * <p>The origin certificate verification switch. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginVerify")
    public String originVerify;

    /**
     * <p>Use range requests to download an object from the source. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * <li>force: enables range origin fetch by force.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Range")
    public String range;

    /**
     * <p>The size of the range part. Valid values:</p>
     * <ul>
     * <li>512KB</li>
     * <li>1MB</li>
     * <li>2MB</li>
     * <li>4MB</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1MB</p>
     */
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
     * <p>The content of the rule. A conditional expression is used to match a user request. You do not need to set this parameter when you add global configuration. Use cases:</p>
     * <ul>
     * <li>true: Match all incoming requests.</li>
     * <li>Set the value to a custom expression, for example, (http.host eq &quot;video.example.com&quot;): Match the specified request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. Valid values: You do not need to set this parameter when you add global configuration. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. You do not need to set this parameter when you add global configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>rule_example</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule execution order. The smaller the value, the higher the priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The version number of the configurations. You can use this parameter to specify a version of your website to apply the feature settings. By default, version 0 is used.</p>
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
