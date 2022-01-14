// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacStageInstanceByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacDeleteStageInstanceJsonStr")
    public String mpaasMappcenterMsacDeleteStageInstanceJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMsacStageInstanceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacStageInstanceByIdRequest self = new DeleteMsacStageInstanceByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsacStageInstanceByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMsacStageInstanceByIdRequest setMpaasMappcenterMsacDeleteStageInstanceJsonStr(String mpaasMappcenterMsacDeleteStageInstanceJsonStr) {
        this.mpaasMappcenterMsacDeleteStageInstanceJsonStr = mpaasMappcenterMsacDeleteStageInstanceJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacDeleteStageInstanceJsonStr() {
        return this.mpaasMappcenterMsacDeleteStageInstanceJsonStr;
    }

    public DeleteMsacStageInstanceByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMsacStageInstanceByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
