// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCompressionRulesResponseBody extends TeaModel {
    /**
     * <p>The list of compression rule configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListCompressionRulesResponseBodyConfigs> configs;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListCompressionRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompressionRulesResponseBody self = new ListCompressionRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompressionRulesResponseBody setConfigs(java.util.List<ListCompressionRulesResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListCompressionRulesResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListCompressionRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCompressionRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCompressionRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCompressionRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCompressionRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListCompressionRulesResponseBodyConfigs extends TeaModel {
        /**
         * <p>Brotli compression. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Brotli")
        public String brotli;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Gzip compression. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Gzip")
        public String gzip;

        /**
         * <p>The rule content, which uses a conditional expression to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true.</li>
         * <li>Match specified requests: Set the value to a custom expression, for example, (http.host eq \&quot;video.example.com\&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name. You do not need to set this parameter when adding a global configuration.</p>
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
         * <p>The version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>Zstd compression. Valid values:</p>
         * <ul>
         * <li>on: enabled.</li>
         * <li>off: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Zstd")
        public String zstd;

        public static ListCompressionRulesResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCompressionRulesResponseBodyConfigs self = new ListCompressionRulesResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListCompressionRulesResponseBodyConfigs setBrotli(String brotli) {
            this.brotli = brotli;
            return this;
        }
        public String getBrotli() {
            return this.brotli;
        }

        public ListCompressionRulesResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListCompressionRulesResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListCompressionRulesResponseBodyConfigs setGzip(String gzip) {
            this.gzip = gzip;
            return this;
        }
        public String getGzip() {
            return this.gzip;
        }

        public ListCompressionRulesResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListCompressionRulesResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListCompressionRulesResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListCompressionRulesResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListCompressionRulesResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public ListCompressionRulesResponseBodyConfigs setZstd(String zstd) {
            this.zstd = zstd;
            return this;
        }
        public String getZstd() {
            return this.zstd;
        }

    }

}
