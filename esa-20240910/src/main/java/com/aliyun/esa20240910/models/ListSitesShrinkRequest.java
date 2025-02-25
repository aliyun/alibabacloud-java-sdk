// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesShrinkRequest extends TeaModel {
    /**
     * <p>Access type. Values:</p>
     * <ul>
     * <li><strong>NS</strong>: Access through NS hosting.</li>
     * <li><strong>CNAME</strong>: Access through CNAME.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>Acceleration region. Values:</p>
     * <ul>
     * <li><strong>domestic</strong>: China mainland only.</li>
     * <li><strong>global</strong>: Global.</li>
     * <li><strong>overseas</strong>: Global (excluding China mainland).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>Enterprise edition only. When set to <strong>true</strong>, it indicates that only enterprise edition sites are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyEnterprise")
    public Boolean onlyEnterprise;

    /**
     * <p>Sorting field, default sorted by creation time, supports:</p>
     * <ul>
     * <li>gmtCreate: Site creation time</li>
     * <li>visitTime: Site access time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>visitTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>Page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size. Default value: <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Plan subscription type. Values:</p>
     * <ul>
     * <li><strong>basicplan</strong>: Basic plan.</li>
     * <li><strong>standardplan</strong>: Standard plan.</li>
     * <li><strong>advancedplan</strong>: Advanced plan.</li>
     * <li><strong>enterpriseplan</strong>: Enterprise plan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basicplan</p>
     */
    @NameInMap("PlanSubscribeType")
    public String planSubscribeType;

    /**
     * <p>Resource group ID. Used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzd3styujvyei</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Site name. Used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>Search match pattern for the site name. The default is exact match, with values:</p>
     * <ul>
     * <li><strong>prefix</strong>: Prefix match.</li>
     * <li><strong>suffix</strong>: Suffix match.</li>
     * <li><strong>exact</strong>: Exact match.</li>
     * <li><strong>fuzzy</strong>: Fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("SiteSearchType")
    public String siteSearchType;

    /**
     * <p>Site status. Used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Tag filtering rules.</p>
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
