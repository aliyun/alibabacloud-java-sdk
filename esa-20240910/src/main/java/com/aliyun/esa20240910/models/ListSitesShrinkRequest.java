// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesShrinkRequest extends TeaModel {
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
