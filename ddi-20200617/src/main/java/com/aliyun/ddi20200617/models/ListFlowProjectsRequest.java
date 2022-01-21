// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowProjectsRequest extends TeaModel {
    // 项目名称，用于过滤项目
    @NameInMap("Name")
    public String name;

    // 页码，用于分页
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 产品类型。固定值DATABIRCKS_DATAINSIGHT
    @NameInMap("ProductType")
    public String productType;

    // 项目ID。您可以调用ListFlowProjects查看项目的ID
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID
    @NameInMap("RegionId")
    public String regionId;

    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListFlowProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectsRequest self = new ListFlowProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFlowProjectsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowProjectsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListFlowProjectsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowProjectsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowProjectsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
