// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
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
     * <p>The WAF rule category of rulesets to query.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The query arguments in the JSON format, which contain filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesetsRequestQueryArgs queryArgs;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version of the website.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    public static ListWafRulesetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafRulesetsRequest self = new ListWafRulesetsRequest();
        return TeaModel.build(map, self);
    }

    public ListWafRulesetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWafRulesetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWafRulesetsRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListWafRulesetsRequest setQueryArgs(ListWafRulesetsRequestQueryArgs queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public ListWafRulesetsRequestQueryArgs getQueryArgs() {
        return this.queryArgs;
    }

    public ListWafRulesetsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListWafRulesetsRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static class ListWafRulesetsRequestQueryArgs extends TeaModel {
        /**
         * <p>The ruleset ID, ruleset name, rule ID, or rule name for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("AnyLike")
        public String anyLike;

        /**
         * <p>Specifies whether to sort the returned data in descending order.</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>The ruleset name for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>The column by which you want to sort the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        public static ListWafRulesetsRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListWafRulesetsRequestQueryArgs self = new ListWafRulesetsRequestQueryArgs();
            return TeaModel.build(map, self);
        }

        public ListWafRulesetsRequestQueryArgs setAnyLike(String anyLike) {
            this.anyLike = anyLike;
            return this;
        }
        public String getAnyLike() {
            return this.anyLike;
        }

        public ListWafRulesetsRequestQueryArgs setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public ListWafRulesetsRequestQueryArgs setNameLike(String nameLike) {
            this.nameLike = nameLike;
            return this;
        }
        public String getNameLike() {
            return this.nameLike;
        }

        public ListWafRulesetsRequestQueryArgs setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

    }

}
