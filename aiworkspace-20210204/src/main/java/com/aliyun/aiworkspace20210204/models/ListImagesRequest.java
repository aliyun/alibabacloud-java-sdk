// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    // 过滤值 以逗号分隔
    @NameInMap("Labels")
    public String labels;

    // 镜像名称，支持模糊搜索
    @NameInMap("Name")
    public String name;

    // 创建者
    @NameInMap("OperatorCreate")
    public String operatorCreate;

    // 排序方向： ASC - 升序 DESC - 降序
    @NameInMap("Order")
    public String order;

    // 分页，从1开始，默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 页大小，默认20
    @NameInMap("PageSize")
    public Integer pageSize;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    // 是否显示非必要信息：Labels
    @NameInMap("Verbose")
    public Boolean verbose;

    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListImagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListImagesRequest setOperatorCreate(String operatorCreate) {
        this.operatorCreate = operatorCreate;
        return this;
    }
    public String getOperatorCreate() {
        return this.operatorCreate;
    }

    public ListImagesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListImagesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListImagesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
