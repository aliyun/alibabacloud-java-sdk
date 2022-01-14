// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacStageByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacDeleteStageJsonStr")
    public String mpaasMappcenterMsacDeleteStageJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMsacStageByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacStageByIdRequest self = new DeleteMsacStageByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsacStageByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMsacStageByIdRequest setMpaasMappcenterMsacDeleteStageJsonStr(String mpaasMappcenterMsacDeleteStageJsonStr) {
        this.mpaasMappcenterMsacDeleteStageJsonStr = mpaasMappcenterMsacDeleteStageJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacDeleteStageJsonStr() {
        return this.mpaasMappcenterMsacDeleteStageJsonStr;
    }

    public DeleteMsacStageByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMsacStageByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
