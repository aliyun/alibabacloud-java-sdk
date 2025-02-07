// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesShrinkRequest extends TeaModel {
    /**
     * <p>The DNS setup. Valid values:</p>
     * <ul>
     * <li><strong>NS</strong></li>
     * <li><strong>CNAME</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NS</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The service location. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong>: the Chinese Mainland</li>
     * <li><strong>global</strong>: global (including the Chinese Mainland)</li>
     * <li><strong>overseas</strong>: outside the Chinese Mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>Specifies whether to query only websites on Enterprise plans. Valid values: <strong>true and false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyEnterprise")
    public Boolean onlyEnterprise;

    /**
     * <p>null</p>
     * <ul>
     * <li>null</li>
     * <li>null</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>visitTime</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The plan type. Valid values:</p>
     * <ul>
     * <li><strong>basicplan</strong>: Entrance</li>
     * <li><strong>standardplan</strong>: Pro</li>
     * <li><strong>advancedplan</strong>: Premium</li>
     * <li><strong>enterpriseplan</strong>: Enterprise</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basicplan</p>
     */
    @NameInMap("PlanSubscribeType")
    public String planSubscribeType;

    /**
     * <p>The ID of the resource group. This parameter specifies a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzd3styujvyei</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The website name. This parameter specifies a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The match mode to search for the website name. Default value: exact. Valid values:</p>
     * <ul>
     * <li><strong>prefix</strong>: match by prefix.</li>
     * <li><strong>suffix</strong>: match by suffix.</li>
     * <li><strong>null</strong></li>
     * <li><strong>fuzzy</strong>: fuzzy match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("SiteSearchType")
    public String siteSearchType;

    /**
     * <p>The website status. This parameter specifies a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag filtering rule.</p>
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
