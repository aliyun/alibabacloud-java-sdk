// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ListTemplatePageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTemplatePageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatePageRequest self = new ListTemplatePageRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatePageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListTemplatePageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTemplatePageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatePageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListTemplatePageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
