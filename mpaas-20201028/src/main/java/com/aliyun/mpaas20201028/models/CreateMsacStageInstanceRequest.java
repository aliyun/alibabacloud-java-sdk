// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageInstanceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacCreateStageInstanceJsonStr")
    public String mpaasMappcenterMsacCreateStageInstanceJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsacStageInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacStageInstanceRequest self = new CreateMsacStageInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsacStageInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsacStageInstanceRequest setMpaasMappcenterMsacCreateStageInstanceJsonStr(String mpaasMappcenterMsacCreateStageInstanceJsonStr) {
        this.mpaasMappcenterMsacCreateStageInstanceJsonStr = mpaasMappcenterMsacCreateStageInstanceJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacCreateStageInstanceJsonStr() {
        return this.mpaasMappcenterMsacCreateStageInstanceJsonStr;
    }

    public CreateMsacStageInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsacStageInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
