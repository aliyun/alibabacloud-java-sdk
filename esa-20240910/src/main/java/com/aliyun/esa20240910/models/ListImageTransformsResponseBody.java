// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListImageTransformsResponseBody extends TeaModel {
    /**
     * <p>A list of configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListImageTransformsResponseBodyConfigs> configs;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page, ranging from <strong>1 to 500</strong>. The default is <strong>500</strong>.</p>
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
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
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
     * <p>2</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListImageTransformsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageTransformsResponseBody self = new ListImageTransformsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageTransformsResponseBody setConfigs(java.util.List<ListImageTransformsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListImageTransformsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListImageTransformsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImageTransformsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImageTransformsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageTransformsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListImageTransformsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListImageTransformsResponseBodyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AutoAvif")
        public String autoAvif;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AutoWebp")
        public String autoWebp;

        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>395386449776640</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The type of the configuration. Valid values:</p>
         * <ul>
         * <li><p><code>global</code>: A global configuration.</p>
         * </li>
         * <li><p><code>rule</code>: A rule-based configuration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>Indicates whether the configuration is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The conditional expression that defines the rule used to match user requests. This parameter is not applicable to global configurations.</p>
         * <ul>
         * <li><p>A value of <code>true</code> matches all incoming requests.</p>
         * </li>
         * <li><p>A custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>, matches specific requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Indicates whether the rule is enabled. This parameter is not applicable to global configurations. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The name of the rule. This parameter is not applicable to global configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution order of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The version of the site configuration. For a site with version management enabled, this parameter specifies the site version to which the configuration applies. The default is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        public static ListImageTransformsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListImageTransformsResponseBodyConfigs self = new ListImageTransformsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListImageTransformsResponseBodyConfigs setAutoAvif(String autoAvif) {
            this.autoAvif = autoAvif;
            return this;
        }
        public String getAutoAvif() {
            return this.autoAvif;
        }

        public ListImageTransformsResponseBodyConfigs setAutoWebp(String autoWebp) {
            this.autoWebp = autoWebp;
            return this;
        }
        public String getAutoWebp() {
            return this.autoWebp;
        }

        public ListImageTransformsResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListImageTransformsResponseBodyConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public ListImageTransformsResponseBodyConfigs setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListImageTransformsResponseBodyConfigs setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListImageTransformsResponseBodyConfigs setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListImageTransformsResponseBodyConfigs setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListImageTransformsResponseBodyConfigs setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListImageTransformsResponseBodyConfigs setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

    }

}
