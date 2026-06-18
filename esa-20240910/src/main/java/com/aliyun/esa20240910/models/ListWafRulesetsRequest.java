// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafRulesetsRequest extends TeaModel {
    /**
     * <p>The page number for pagination.</p>
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
     * <p>The execution phase for WAF rules.</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: rate-limiting rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: bot rule</p>
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
     * <p>A JSON object containing query parameters for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("QueryArgs")
    public ListWafRulesetsRequestQueryArgs queryArgs;

    /**
     * <p>The ID of the site. Get this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site\&quot;s configuration version. For sites with configuration version management enabled, use this parameter to specify the version. The default is 0.</p>
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
         * <p>A keyword for a fuzzy search on the ID or name of a ruleset or rule.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("AnyLike")
        public String anyLike;

        /**
         * <p>Specifies whether to sort in descending order.</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>A keyword for a fuzzy search on ruleset names.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("NameLike")
        public String nameLike;

        /**
         * <p>Specifies the field for sorting the results.</p>
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
