// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeVhostRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Vhost")
    public String vhost;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeVhostRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeVhostRequest self = new CreateMcubeVhostRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeVhostRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeVhostRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeVhostRequest setVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }
    public String getVhost() {
        return this.vhost;
    }

    public CreateMcubeVhostRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
