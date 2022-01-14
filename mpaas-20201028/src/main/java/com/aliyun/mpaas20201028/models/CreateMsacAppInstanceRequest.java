// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacAppInstanceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacCreateAppInstanceJsonStr")
    public String mpaasMappcenterMsacCreateAppInstanceJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsacAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacAppInstanceRequest self = new CreateMsacAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsacAppInstanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsacAppInstanceRequest setMpaasMappcenterMsacCreateAppInstanceJsonStr(String mpaasMappcenterMsacCreateAppInstanceJsonStr) {
        this.mpaasMappcenterMsacCreateAppInstanceJsonStr = mpaasMappcenterMsacCreateAppInstanceJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacCreateAppInstanceJsonStr() {
        return this.mpaasMappcenterMsacCreateAppInstanceJsonStr;
    }

    public CreateMsacAppInstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsacAppInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
