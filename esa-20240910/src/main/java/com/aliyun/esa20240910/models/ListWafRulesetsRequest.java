// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsRequest extends TeaModel {
    /**
     * <p>Page number, specifying the current page number for paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, specifying the number of records per page for paginated queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>WAF operation phase, specifying the rule set phase to query.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Query parameters, passed in JSON format, containing various filtering conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesetsRequestQueryArgs queryArgs;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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
         * <p>Fuzzy search for rule set ID, rule set name, rule ID, and rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("AnyLike")
        public String anyLike;

        /**
         * <p>Whether to sort in descending order.</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>Fuzzy search for rule set name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>Specify the column to sort by.</p>
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
