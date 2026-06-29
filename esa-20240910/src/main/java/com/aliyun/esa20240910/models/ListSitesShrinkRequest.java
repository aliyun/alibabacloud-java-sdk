// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesShrinkRequest extends TeaModel {
    /**
     * <p>The access type. Valid values:</p>
     * <ul>
     * <li><p><strong>NS</strong>: NS-based access.</p>
     * </li>
     * <li><p><strong>CNAME</strong>: CNAME-based access.</p>
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
     * <li><strong>domestic</strong>: the Chinese mainland only.</li>
     * <li><strong>global</strong>: global.</li>
     * <li><strong>overseas</strong>: global (excluding the Chinese mainland).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>Specifies whether to query only Enterprise Edition sites. Set this parameter to <strong>true</strong> to query only Enterprise Edition sites.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyEnterprise")
    public Boolean onlyEnterprise;

    /**
     * <p>The sort field. By default, results are sorted by creation time. Valid values:</p>
     * <ul>
     * <li>gmtCreate: site creation time.</li>
     * <li>visitTime: site access time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>visitTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number for paging. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The plan subscription type. Valid values:</p>
     * <ul>
     * <li><strong>basicplan</strong>: Basic Edition.</li>
     * <li><strong>standardplan</strong>: Standard Edition.</li>
     * <li><strong>advancedplan</strong>: Premium Edition.</li>
     * <li><strong>enterpriseplan</strong>: Enterprise Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basicplan</p>
     */
    @NameInMap("PlanSubscribeType")
    public String planSubscribeType;

    /**
     * <p>The resource group ID. Used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzd3styujvyei</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The site name. Used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The search matching mode for the site name. Default is exact match. Valid values:</p>
     * <ul>
     * <li><strong>prefix</strong>: prefix match.</li>
     * <li><strong>suffix</strong>: suffix match.</li>
     * <li><strong>exact</strong>: exact match.</li>
     * <li><strong>fuzzy</strong>: fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("SiteSearchType")
    public String siteSearchType;

    /**
     * <p>The site status. Used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag filter rules.</p>
     */
    @NameInMap("TagFilter")
    public String tagFilterShrink;

    public static ListSitesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSitesShrinkRequest self = new ListSitesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSitesShrinkRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ListSitesShrinkRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public ListSitesShrinkRequest setOnlyEnterprise(Boolean onlyEnterprise) {
        this.onlyEnterprise = onlyEnterprise;
        return this;
    }
    public Boolean getOnlyEnterprise() {
        return this.onlyEnterprise;
    }

    public ListSitesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListSitesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSitesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSitesShrinkRequest setPlanSubscribeType(String planSubscribeType) {
        this.planSubscribeType = planSubscribeType;
        return this;
    }
    public String getPlanSubscribeType() {
        return this.planSubscribeType;
    }

    public ListSitesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSitesShrinkRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ListSitesShrinkRequest setSiteSearchType(String siteSearchType) {
        this.siteSearchType = siteSearchType;
        return this;
    }
    public String getSiteSearchType() {
        return this.siteSearchType;
    }

    public ListSitesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSitesShrinkRequest setTagFilterShrink(String tagFilterShrink) {
        this.tagFilterShrink = tagFilterShrink;
        return this;
    }
    public String getTagFilterShrink() {
        return this.tagFilterShrink;
    }

}
