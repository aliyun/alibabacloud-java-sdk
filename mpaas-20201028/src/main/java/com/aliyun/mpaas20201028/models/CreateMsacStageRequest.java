// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacCreateStageJsonStr")
    public String mpaasMappcenterMsacCreateStageJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsacStageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacStageRequest self = new CreateMsacStageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsacStageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsacStageRequest setMpaasMappcenterMsacCreateStageJsonStr(String mpaasMappcenterMsacCreateStageJsonStr) {
        this.mpaasMappcenterMsacCreateStageJsonStr = mpaasMappcenterMsacCreateStageJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacCreateStageJsonStr() {
        return this.mpaasMappcenterMsacCreateStageJsonStr;
    }

    public CreateMsacStageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsacStageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
