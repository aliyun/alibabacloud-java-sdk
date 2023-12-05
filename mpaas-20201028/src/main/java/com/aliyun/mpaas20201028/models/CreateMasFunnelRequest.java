// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMasFunnelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMcdpMasFunnelCreateJsonStr")
    public String mpaasMappcenterMcdpMasFunnelCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMasFunnelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMasFunnelRequest self = new CreateMasFunnelRequest();
        return TeaModel.build(map, self);
    }

    public CreateMasFunnelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMasFunnelRequest setMpaasMappcenterMcdpMasFunnelCreateJsonStr(String mpaasMappcenterMcdpMasFunnelCreateJsonStr) {
        this.mpaasMappcenterMcdpMasFunnelCreateJsonStr = mpaasMappcenterMcdpMasFunnelCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpMasFunnelCreateJsonStr() {
        return this.mpaasMappcenterMcdpMasFunnelCreateJsonStr;
    }

    public CreateMasFunnelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMasFunnelRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
