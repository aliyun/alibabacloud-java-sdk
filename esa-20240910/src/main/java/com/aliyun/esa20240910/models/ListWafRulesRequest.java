// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesRequest extends TeaModel {
    /**
     * <p>Query page number, used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Query page size, used for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>WAF rule type. Values:</p>
     * <ul>
     * <li>http_anti_scan: Scan protection</li>
     * <li>http_bot: Bots</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Query filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesRequestQueryArgs queryArgs;

    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Site version.</p>
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
         * <p>Fuzzy search for values in IP access control.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("ConfigValueLike")
        public String configValueLike;

        /**
         * <p>Whether to reverse the sorting result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>Exact query for WAF rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Fuzzy query for WAF rule ID or name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        /**
         * <p>Fuzzy query for WAF rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>Sort the returned list by the specified column.</p>
         * 
         * <strong>example:</strong>
         * <p>position</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <p>Exact query for WAF rule status.</p>
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
