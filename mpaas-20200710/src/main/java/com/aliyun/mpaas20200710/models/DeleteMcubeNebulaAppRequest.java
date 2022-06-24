// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class DeleteMcubeNebulaAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("H5Id")
    public String h5Id;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcubeNebulaAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeNebulaAppRequest self = new DeleteMcubeNebulaAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeNebulaAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcubeNebulaAppRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public DeleteMcubeNebulaAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcubeNebulaAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
