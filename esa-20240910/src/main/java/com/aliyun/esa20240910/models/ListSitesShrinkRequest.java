// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesShrinkRequest extends TeaModel {
    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("Coverage")
    public String coverage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyEnterprise")
    public Boolean onlyEnterprise;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanSubscribeType")
    public String planSubscribeType;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzd3styujvyei</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("SiteSearchType")
    public String siteSearchType;

    /**
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("Status")
    public String status;

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
