// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsRequest extends TeaModel {
    /**
     * <p>The page number. Specifies the current page number for paging queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Specifies the number of records per page for paging queries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The WAF rule execution phase. Valid values:</p>
     * <ul>
     * <li>http_whitelist: whitelist rules</li>
     * <li>http_custom: custom rules</li>
     * <li>http_managed: managed rules</li>
     * <li>http_anti_scan: scan protection rules</li>
     * <li>http_ratelimit: frequency control rules</li>
     * <li>ip_access_rule: IP access rules</li>
     * <li>http_bot: advanced mode bots</li>
     * <li>http_security_level_rule: security rules</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The query parameters, passed in JSON format, including various filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesetsRequestQueryArgs queryArgs;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
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
         * <p>The fuzzy match string for the ruleset ID, ruleset name, rule ID, or rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("AnyLike")
        public String anyLike;

        /**
         * <p>Specifies whether to sort the results in descending order.</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>The fuzzy match string for the ruleset name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>The column by which to sort the results.</p>
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
