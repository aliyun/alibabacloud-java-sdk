// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class DeleteMcubeUpgradeResourceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcubeUpgradeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeUpgradeResourceRequest self = new DeleteMcubeUpgradeResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeUpgradeResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcubeUpgradeResourceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteMcubeUpgradeResourceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DeleteMcubeUpgradeResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcubeUpgradeResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
