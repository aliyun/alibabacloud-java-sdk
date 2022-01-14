// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeWhitelistRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcubeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeWhitelistRequest self = new DeleteMcubeWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeWhitelistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcubeWhitelistRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteMcubeWhitelistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcubeWhitelistRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
