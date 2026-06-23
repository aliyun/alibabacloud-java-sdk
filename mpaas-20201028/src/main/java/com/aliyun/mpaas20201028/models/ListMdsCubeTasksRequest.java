// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeTasksRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TemplateResourceId")
    public Long templateResourceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMdsCubeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeTasksRequest self = new ListMdsCubeTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeTasksRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMdsCubeTasksRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMdsCubeTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMdsCubeTasksRequest setTemplateResourceId(Long templateResourceId) {
        this.templateResourceId = templateResourceId;
        return this;
    }
    public Long getTemplateResourceId() {
        return this.templateResourceId;
    }

    public ListMdsCubeTasksRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMdsCubeTasksRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
