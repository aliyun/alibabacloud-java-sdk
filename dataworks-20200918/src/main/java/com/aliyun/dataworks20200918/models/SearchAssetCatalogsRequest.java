// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchAssetCatalogsRequest extends TeaModel {
    @NameInMap("CategoryUuidList")
    public java.util.List<String> categoryUuidList;

    @NameInMap("CategoryUuidWithChild")
    public String categoryUuidWithChild;

    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static SearchAssetCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetCatalogsRequest self = new SearchAssetCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public SearchAssetCatalogsRequest setCategoryUuidList(java.util.List<String> categoryUuidList) {
        this.categoryUuidList = categoryUuidList;
        return this;
    }
    public java.util.List<String> getCategoryUuidList() {
        return this.categoryUuidList;
    }

    public SearchAssetCatalogsRequest setCategoryUuidWithChild(String categoryUuidWithChild) {
        this.categoryUuidWithChild = categoryUuidWithChild;
        return this;
    }
    public String getCategoryUuidWithChild() {
        return this.categoryUuidWithChild;
    }

    public SearchAssetCatalogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchAssetCatalogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchAssetCatalogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAssetCatalogsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SearchAssetCatalogsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
