// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesRequest extends TeaModel {
    /**
     * <p>The access type. Valid values:</p>
     * <ul>
     * <li><p><strong>NS</strong>: NS access.</p>
     * </li>
     * <li><p><strong>CNAME</strong>: CNAME access.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The acceleration region. Valid values:</p>
     * <ul>
     * <li><p><strong>domestic</strong>: Chinese mainland only.</p>
     * </li>
     * <li><p><strong>global</strong>: Global.</p>
     * </li>
     * <li><p><strong>overseas</strong>: Global (excluding the Chinese mainland).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>Specifies whether to return only sites that use the Enterprise Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyEnterprise")
    public Boolean onlyEnterprise;

    /**
     * <p>The field to sort the results by. By default, results are sorted by creation time (gmtCreate). Supported values:</p>
     * <ul>
     * <li><p><code>gmtCreate</code>: site creation time</p>
     * </li>
     * <li><p><code>visitTime</code>: site access time</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>visitTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The subscription plan type. Valid values:</p>
     * <ul>
     * <li><p><strong>basicplan</strong>: Basic Edition.</p>
     * </li>
     * <li><p><strong>standardplan</strong>: Standard Edition.</p>
     * </li>
     * <li><p><strong>advancedplan</strong>: Advanced Edition.</p>
     * </li>
     * <li><p><strong>enterpriseplan</strong>: Enterprise Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basicplan</p>
     */
    @NameInMap("PlanSubscribeType")
    public String planSubscribeType;

    /**
     * <p>The resource group ID, used to filter query results.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzd3styujvyei</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The site name, used to filter query results.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The match mode for the <code>SiteName</code> parameter. The default value is <code>exact</code>. Valid values:</p>
     * <ul>
     * <li><p><strong>prefix</strong>: prefix match.</p>
     * </li>
     * <li><p><strong>suffix</strong>: suffix match.</p>
     * </li>
     * <li><p><strong>exact</strong>: exact match.</p>
     * </li>
     * <li><p><strong>fuzzy</strong>: fuzzy match.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("SiteSearchType")
    public String siteSearchType;

    /**
     * <p>The site status, used to filter query results.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of tags to use for filtering sites.</p>
     */
    @NameInMap("TagFilter")
    public java.util.List<ListSitesRequestTagFilter> tagFilter;

    public static ListSitesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSitesRequest self = new ListSitesRequest();
        return TeaModel.build(map, self);
    }

    public ListSitesRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ListSitesRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public ListSitesRequest setOnlyEnterprise(Boolean onlyEnterprise) {
        this.onlyEnterprise = onlyEnterprise;
        return this;
    }
    public Boolean getOnlyEnterprise() {
        return this.onlyEnterprise;
    }

    public ListSitesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSitesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSitesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSitesRequest setPlanSubscribeType(String planSubscribeType) {
        this.planSubscribeType = planSubscribeType;
        return this;
    }
    public String getPlanSubscribeType() {
        return this.planSubscribeType;
    }

    public ListSitesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSitesRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ListSitesRequest setSiteSearchType(String siteSearchType) {
        this.siteSearchType = siteSearchType;
        return this;
    }
    public String getSiteSearchType() {
        return this.siteSearchType;
    }

    public ListSitesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSitesRequest setTagFilter(java.util.List<ListSitesRequestTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public java.util.List<ListSitesRequestTagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static class ListSitesRequestTagFilter extends TeaModel {
        /**
         * <p>The tag key, used to filter query results.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value, used to filter query results.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSitesRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            ListSitesRequestTagFilter self = new ListSitesRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public ListSitesRequestTagFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSitesRequestTagFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
