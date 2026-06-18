// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsResponseBody extends TeaModel {
    /**
     * <p>The number of WAF rulesets used by the instance in this WAF phase.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceUsage")
    public Long instanceUsage;

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
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of rulesets.</p>
     */
    @NameInMap("Rulesets")
    public java.util.List<ListWafRulesetsResponseBodyRulesets> rulesets;

    /**
     * <p>The number of WAF rulesets used by the site in this WAF phase.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SiteUsage")
    public Long siteUsage;

    /**
     * <p>The total number of entries returned after filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWafRulesetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesetsResponseBody self = new ListWafRulesetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWafRulesetsResponseBody setInstanceUsage(Long instanceUsage) {
        this.instanceUsage = instanceUsage;
        return this;
    }
    public Long getInstanceUsage() {
        return this.instanceUsage;
    }

    public ListWafRulesetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafRulesetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafRulesetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWafRulesetsResponseBody setRulesets(java.util.List<ListWafRulesetsResponseBodyRulesets> rulesets) {
        this.rulesets = rulesets;
        return this;
    }
    public java.util.List<ListWafRulesetsResponseBodyRulesets> getRulesets() {
        return this.rulesets;
    }

    public ListWafRulesetsResponseBody setSiteUsage(Long siteUsage) {
        this.siteUsage = siteUsage;
        return this;
    }
    public Long getSiteUsage() {
        return this.siteUsage;
    }

    public ListWafRulesetsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWafRulesetsResponseBodyRulesets extends TeaModel {
        /**
         * <p>A list of match fields.</p>
         */
        @NameInMap("Fields")
        public java.util.List<String> fields;

        /**
         * <p>The ID of the WAF ruleset. This value is returned by the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ruleset name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution phase of the ruleset. Valid values are:</p>
         * <ul>
         * <li><p><code>http_whitelist</code>: whitelist rule</p>
         * </li>
         * <li><p><code>http_custom</code>: custom rule</p>
         * </li>
         * <li><p><code>http_managed</code>: managed rule</p>
         * </li>
         * <li><p><code>http_anti_scan</code>: scan protection rule</p>
         * </li>
         * <li><p><code>http_ratelimit</code>: rate limiting rule</p>
         * </li>
         * <li><p><code>ip_access_rule</code>: IP access rule</p>
         * </li>
         * <li><p><code>http_bot</code>: advanced bot protection</p>
         * </li>
         * <li><p><code>http_security_level_rule</code>: security rule</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The ruleset status.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The protection target for the \&quot;http_bot\&quot; phase.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>A list of rule types.</p>
         */
        @NameInMap("Types")
        public java.util.List<String> types;

        /**
         * <p>The time the ruleset was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListWafRulesetsResponseBodyRulesets build(java.util.Map<String, ?> map) throws Exception {
            ListWafRulesetsResponseBodyRulesets self = new ListWafRulesetsResponseBodyRulesets();
            return TeaModel.build(map, self);
        }

        public ListWafRulesetsResponseBodyRulesets setFields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<String> getFields() {
            return this.fields;
        }

        public ListWafRulesetsResponseBodyRulesets setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafRulesetsResponseBodyRulesets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWafRulesetsResponseBodyRulesets setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListWafRulesetsResponseBodyRulesets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWafRulesetsResponseBodyRulesets setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListWafRulesetsResponseBodyRulesets setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }
        public java.util.List<String> getTypes() {
            return this.types;
        }

        public ListWafRulesetsResponseBodyRulesets setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
