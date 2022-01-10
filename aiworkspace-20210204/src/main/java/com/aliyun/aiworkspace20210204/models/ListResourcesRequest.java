// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    // 选项，目前支持 ListResourceByWorkspace    列举某个工作空间的资源 GetResource                       获取所有工作空间下的资源 GetResourceGroup               获取所有工作空间下的资源组 ListResourceSummaryByWorkspaces  列举一组工作空间的资源汇总
    @NameInMap("Option")
    public String option;

    // 分页，从1开始，默认1
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页大小，默认20
    @NameInMap("PageSize")
    public Integer pageSize;

    // 逗号分隔的产品类型，可选值 MaxCompute，DLC
    @NameInMap("ProductTypes")
    public String productTypes;

    // 资源的group名字
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    // 资源的名字
    @NameInMap("ResourceName")
    public String resourceName;

    // 工作空间 id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 工作空间id列表，以逗号分隔
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public ListResourcesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesRequest setProductTypes(String productTypes) {
        this.productTypes = productTypes;
        return this;
    }
    public String getProductTypes() {
        return this.productTypes;
    }

    public ListResourcesRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListResourcesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListResourcesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
