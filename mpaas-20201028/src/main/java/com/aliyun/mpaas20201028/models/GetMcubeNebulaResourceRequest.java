// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMcubeNebulaResourceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Id")
    public String id;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMcubeNebulaResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeNebulaResourceRequest self = new GetMcubeNebulaResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetMcubeNebulaResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMcubeNebulaResourceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetMcubeNebulaResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMcubeNebulaResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
