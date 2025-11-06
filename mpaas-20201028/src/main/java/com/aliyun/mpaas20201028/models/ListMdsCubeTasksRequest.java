// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateResourceId")
    public Long templateResourceId;

    /**
     * <strong>example:</strong>
     * <p>ZXCXMAHQ-zh_CN</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
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
