// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The WAF rule execution phase. Valid values are:</p>
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
     * <li><p><code>http_bot</code>: Advanced bots</p>
     * </li>
     * <li><p><code>http_security_level_rule</code>: security rule</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Query filters.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesRequestQueryArgs queryArgs;

    /**
     * <p>The ID of the WAF ruleset. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>The site ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site configuration version. For sites with configuration version management enabled, this parameter specifies the version to use. Defaults to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesRequest self = new ListWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWafRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafRulesRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListWafRulesRequest setQueryArgs(ListWafRulesRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListWafRulesRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public ListWafRulesRequest setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public ListWafRulesRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListWafRulesRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class ListWafRulesRequestQueryArgs extends TeaModel {
        /**
         * <p>Performs a partial-match search for a value in an IP access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("ConfigValueLike")
        public String configValueLike;

        /**
         * <p>Specifies whether to sort the results in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>Filters results by the exact WAF rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Performs a partial-match search on the WAF rule ID or name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        /**
         * <p>Performs a partial-match search on the WAF rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>Sorts the results by the specified field.</p>
         * 
         * <strong>example:</strong>
         * <p>position</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <p>Filters results by the exact WAF rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListWafRulesRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListWafRulesRequestQueryArgs self = new ListWafRulesRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListWafRulesRequestQueryArgs setConfigValueLike(String configValueLike) {
            this.configValueLike = configValueLike;
            return this;
        }
        public String getConfigValueLike() {
            return this.configValueLike;
        }

        public ListWafRulesRequestQueryArgs setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListWafRulesRequestQueryArgs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWafRulesRequestQueryArgs setIdNameLike(String idNameLike) {
            this.idNameLike = idNameLike;
            return this;
        }
        public String getIdNameLike() {
            return this.idNameLike;
        }

        public ListWafRulesRequestQueryArgs setNameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }
        public String getNameLike() {
            return this.nameLike;
        }

        public ListWafRulesRequestQueryArgs setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

        public ListWafRulesRequestQueryArgs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
