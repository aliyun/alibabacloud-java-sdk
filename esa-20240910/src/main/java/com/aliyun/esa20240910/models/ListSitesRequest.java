// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSitesRequest extends TeaModel {
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
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
