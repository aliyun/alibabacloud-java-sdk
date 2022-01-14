// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacCreateAppJsonStr")
    public String mpaasMappcenterMsacCreateAppJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsacAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacAppRequest self = new CreateMsacAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsacAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsacAppRequest setMpaasMappcenterMsacCreateAppJsonStr(String mpaasMappcenterMsacCreateAppJsonStr) {
        this.mpaasMappcenterMsacCreateAppJsonStr = mpaasMappcenterMsacCreateAppJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacCreateAppJsonStr() {
        return this.mpaasMappcenterMsacCreateAppJsonStr;
    }

    public CreateMsacAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsacAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
