// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesRequestQueryArgs queryArgs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IdNameLike")
        public String idNameLike;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <strong>example:</strong>
         * <p>position</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("RulesetId")
        public Long rulesetId;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListWafRulesRequestQueryArgs build(java.util.Map<String, ?> map) throws Exception {
            ListWafRulesRequestQueryArgs self = new ListWafRulesRequestQueryArgs();
            return TeaModel.build(map, self);
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

        public ListWafRulesRequestQueryArgs setRulesetId(Long rulesetId) {
            this.rulesetId = rulesetId;
            return this;
        }
        public Long getRulesetId() {
            return this.rulesetId;
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
