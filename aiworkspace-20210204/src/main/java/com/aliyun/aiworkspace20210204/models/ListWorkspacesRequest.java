// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    // GetWorkspaceFields的Field字段
    @NameInMap("Fields")
    public String fields;

    // 逗号分割的模块列表，目前填入PAI
    @NameInMap("ModuleList")
    public String moduleList;

    // 逗号分隔的选项
    @NameInMap("Option")
    public String option;

    // 排序方向： ASC - 升序 DESC - 降序
    @NameInMap("Order")
    public String order;

    // 分页，从1开始，默认1
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页大小，默认20
    @NameInMap("PageSize")
    public Integer pageSize;

    // 排序字段：CreateTime
    @NameInMap("SortBy")
    public String sortBy;

    // 状态
    @NameInMap("Status")
    public String status;

    // 是否显示详细信息，默认true
    @NameInMap("Verbose")
    public Boolean verbose;

    // 工作空间id列表
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    // 工作空间名字
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListWorkspacesRequest setModuleList(String moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public String getModuleList() {
        return this.moduleList;
    }

    public ListWorkspacesRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public ListWorkspacesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListWorkspacesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkspacesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListWorkspacesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListWorkspacesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListWorkspacesRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public ListWorkspacesRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
