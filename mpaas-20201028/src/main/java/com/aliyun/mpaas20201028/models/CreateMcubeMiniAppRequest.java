// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("H5Id")
    public String h5Id;

    @NameInMap("H5Name")
    public String h5Name;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeMiniAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniAppRequest self = new CreateMcubeMiniAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeMiniAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeMiniAppRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public CreateMcubeMiniAppRequest setH5Name(String h5Name) {
        this.h5Name = h5Name;
        return this;
    }
    public String getH5Name() {
        return this.h5Name;
    }

    public CreateMcubeMiniAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeMiniAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
