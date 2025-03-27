// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginRulesResponseBody extends TeaModel {
    /**
     * <p>Response body configuration.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListOriginRulesResponseBodyConfigs> configs;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
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
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>395386449776640</p>
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
         * <p>global</p>
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

        /**
         * <p>HOST carried in the origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginHost")
        public String originHost;

        /**
         * <p>The port of the origin server to access when using the HTTP protocol for origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("OriginHttpPort")
        public String originHttpPort;

        /**
         * <p>The port of the origin server to access when using the HTTPS protocol for origin requests.</p>
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
         * <p>SNI carried in the back-to-origin request.</p>
         * 
         * <strong>example:</strong>
         * <p>origin.example.com</p>
         */
        @NameInMap("OriginSni")
        public String originSni;

        /**
         * <p>Origin certificate verification switch. Value range:</p>
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
         * <p>Use range slicing to download files from the origin. Value range:</p>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
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
         * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
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

        /**
         * <p>Rule execution order. The smaller the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, this parameter can specify the version of the site for which the configuration is effective, defaulting to version 0.</p>
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
