// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeWhitelistsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WhitelistName")
    public String whitelistName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMcubeWhitelistsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeWhitelistsRequest self = new ListMcubeWhitelistsRequest();
        return TeaModel.build(map, self);
    }

    public ListMcubeWhitelistsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMcubeWhitelistsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMcubeWhitelistsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMcubeWhitelistsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMcubeWhitelistsRequest setWhitelistName(String whitelistName) {
        this.whitelistName = whitelistName;
        return this;
    }
    public String getWhitelistName() {
        return this.whitelistName;
    }

    public ListMcubeWhitelistsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
