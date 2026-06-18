// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginRulesResponseBody extends TeaModel {
    /**
     * <p>A list of configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListOriginRulesResponseBodyConfigs> configs;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListOriginRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOriginRulesResponseBody self = new ListOriginRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOriginRulesResponseBody setConfigs(java.util.List<ListOriginRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListOriginRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListOriginRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOriginRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOriginRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOriginRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOriginRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListOriginRulesResponseBodyConfigs extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configuration type. You can use this parameter to query for global or rule-specific configurations. Valid values:</p>
         * <ul>
         * <li><p><code>global</code>: The global configuration.</p>
         * </li>
         * <li><p><code>rule</code>: A rule-specific configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Overrides the DNS record for the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.com</p>
         */
        @NameInMap("DnsRecord")
        public String dnsRecord;

        /**
         * <p>Specifies whether to follow 302 redirects from the origin. Valid values:</p>
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
         * <p>Specifies whether to retain the original request parameters when following a redirect. Valid values:</p>
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
        @NameInMap("Follow302RetainArgs")
        public String follow302RetainArgs;

        /**
         * <p>Specifies whether to retain the original request header when following a redirect. Valid values:</p>
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
        @NameInMap("Follow302RetainHeader")
        public String follow302RetainHeader;

        /**
         * <p>The host to use for the origin request after following a 302 redirect.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Follow302TargetHost")
        public String follow302TargetHost;

        /**
         * <p>The <code>Host</code> header carried in the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <p>The origin server port used for origin requests over HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("OriginHttpPort")
        public String originHttpPort;

        /**
         * <p>The origin server port used for origin requests over HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>4433</p>
         */
        @NameInMap("OriginHttpsPort")
        public String originHttpsPort;

        /**
         * <p>Specifies whether mTLS is enabled. Valid values:</p>
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
        @NameInMap("OriginMtls")
        public String originMtls;

        /**
         * <p>The read timeout, in seconds, for the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OriginReadTimeout")
        public String originReadTimeout;

        /**
         * <p>The protocol used for origin requests. Valid values:</p>
         * <ul>
         * <li><p><code>http</code>: Use the HTTP protocol for origin requests.</p>
         * </li>
         * <li><p><code>https</code>: Use the HTTPS protocol for origin requests.</p>
         * </li>
         * <li><p><code>follow</code>: Use the same protocol as the client request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("OriginScheme")
        public String originScheme;

        /**
         * <p>The SNI carried in the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginSni")
        public String originSni;

        /**
         * <p>Specifies whether to verify the origin server certificate. Valid values:</p>
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
        @NameInMap("OriginVerify")
        public String originVerify;

        /**
         * <p>Specifies whether to use range-based requests to retrieve files from the origin. Valid values:</p>
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
         * <p>The size of each chunk for range requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1MB</p>
         */
        @NameInMap("RangeChunkSize")
        public String rangeChunkSize;

        /**
         * <p>The rule content, which uses a conditional expression to match user requests. This parameter is not required for global configurations. It supports two use cases:</p>
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
         * <p>Specifies whether the rule is enabled. This parameter is not required for global configurations. Valid values:</p>
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
         * <p>The rule name. This parameter is not required for global configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order. Lower values indicate higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The site configuration version. If versioning is enabled for the site, this parameter specifies which version to use. The default is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        public static ListOriginRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListOriginRulesResponseBodyConfigs self = new ListOriginRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListOriginRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListOriginRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListOriginRulesResponseBodyConfigs setDnsRecord(String dnsRecord) {
            this.dnsRecord = dnsRecord;
            return this;
        }
        public String getDnsRecord() {
            return this.dnsRecord;
        }

        public ListOriginRulesResponseBodyConfigs setFollow302Enable(String follow302Enable) {
            this.follow302Enable = follow302Enable;
            return this;
        }
        public String getFollow302Enable() {
            return this.follow302Enable;
        }

        public ListOriginRulesResponseBodyConfigs setFollow302MaxTries(String follow302MaxTries) {
            this.follow302MaxTries = follow302MaxTries;
            return this;
        }
        public String getFollow302MaxTries() {
            return this.follow302MaxTries;
        }

        public ListOriginRulesResponseBodyConfigs setFollow302RetainArgs(String follow302RetainArgs) {
            this.follow302RetainArgs = follow302RetainArgs;
            return this;
        }
        public String getFollow302RetainArgs() {
            return this.follow302RetainArgs;
        }

        public ListOriginRulesResponseBodyConfigs setFollow302RetainHeader(String follow302RetainHeader) {
            this.follow302RetainHeader = follow302RetainHeader;
            return this;
        }
        public String getFollow302RetainHeader() {
            return this.follow302RetainHeader;
        }

        public ListOriginRulesResponseBodyConfigs setFollow302TargetHost(String follow302TargetHost) {
            this.follow302TargetHost = follow302TargetHost;
            return this;
        }
        public String getFollow302TargetHost() {
            return this.follow302TargetHost;
        }

        public ListOriginRulesResponseBodyConfigs setOriginHost(String originHost) {
            this.originHost = originHost;
            return this;
        }
        public String getOriginHost() {
            return this.originHost;
        }

        public ListOriginRulesResponseBodyConfigs setOriginHttpPort(String originHttpPort) {
            this.originHttpPort = originHttpPort;
            return this;
        }
        public String getOriginHttpPort() {
            return this.originHttpPort;
        }

        public ListOriginRulesResponseBodyConfigs setOriginHttpsPort(String originHttpsPort) {
            this.originHttpsPort = originHttpsPort;
            return this;
        }
        public String getOriginHttpsPort() {
            return this.originHttpsPort;
        }

        public ListOriginRulesResponseBodyConfigs setOriginMtls(String originMtls) {
            this.originMtls = originMtls;
            return this;
        }
        public String getOriginMtls() {
            return this.originMtls;
        }

        public ListOriginRulesResponseBodyConfigs setOriginReadTimeout(String originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }
        public String getOriginReadTimeout() {
            return this.originReadTimeout;
        }

        public ListOriginRulesResponseBodyConfigs setOriginScheme(String originScheme) {
            this.originScheme = originScheme;
            return this;
        }
        public String getOriginScheme() {
            return this.originScheme;
        }

        public ListOriginRulesResponseBodyConfigs setOriginSni(String originSni) {
            this.originSni = originSni;
            return this;
        }
        public String getOriginSni() {
            return this.originSni;
        }

        public ListOriginRulesResponseBodyConfigs setOriginVerify(String originVerify) {
            this.originVerify = originVerify;
            return this;
        }
        public String getOriginVerify() {
            return this.originVerify;
        }

        public ListOriginRulesResponseBodyConfigs setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public ListOriginRulesResponseBodyConfigs setRangeChunkSize(String rangeChunkSize) {
            this.rangeChunkSize = rangeChunkSize;
            return this;
        }
        public String getRangeChunkSize() {
            return this.rangeChunkSize;
        }

        public ListOriginRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListOriginRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListOriginRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListOriginRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListOriginRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

    }

}
