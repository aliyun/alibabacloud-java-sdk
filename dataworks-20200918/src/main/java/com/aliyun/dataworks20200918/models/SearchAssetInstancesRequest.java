// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchAssetInstancesRequest extends TeaModel {
    @NameInMap("CategoryUuidList")
    public java.util.List<String> categoryUuidList;

    @NameInMap("CategoryUuidWithChild")
    public String categoryUuidWithChild;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("ObjectDefineGroupUuidList")
    public java.util.List<String> objectDefineGroupUuidList;

    @NameInMap("OrderByList")
    public java.util.List<String> orderByList;

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

    public static SearchAssetInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetInstancesRequest self = new SearchAssetInstancesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAssetInstancesRequest setCategoryUuidList(java.util.List<String> categoryUuidList) {
        this.categoryUuidList = categoryUuidList;
        return this;
    }
    public java.util.List<String> getCategoryUuidList() {
        return this.categoryUuidList;
    }

    public SearchAssetInstancesRequest setCategoryUuidWithChild(String categoryUuidWithChild) {
        this.categoryUuidWithChild = categoryUuidWithChild;
        return this;
    }
    public String getCategoryUuidWithChild() {
        return this.categoryUuidWithChild;
    }

    public SearchAssetInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchAssetInstancesRequest setObjectDefineGroupUuidList(java.util.List<String> objectDefineGroupUuidList) {
        this.objectDefineGroupUuidList = objectDefineGroupUuidList;
        return this;
    }
    public java.util.List<String> getObjectDefineGroupUuidList() {
        return this.objectDefineGroupUuidList;
    }

    public SearchAssetInstancesRequest setOrderByList(java.util.List<String> orderByList) {
        this.orderByList = orderByList;
        return this;
    }
    public java.util.List<String> getOrderByList() {
        return this.orderByList;
    }

    public SearchAssetInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchAssetInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAssetInstancesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SearchAssetInstancesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
