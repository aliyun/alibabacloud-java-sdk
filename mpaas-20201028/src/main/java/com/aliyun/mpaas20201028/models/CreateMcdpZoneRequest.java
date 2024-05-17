// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpZoneRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpZoneCreateJsonStr")
    public String mpaasMappcenterMcdpZoneCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcdpZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpZoneRequest self = new CreateMcdpZoneRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcdpZoneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcdpZoneRequest setMpaasMappcenterMcdpZoneCreateJsonStr(String mpaasMappcenterMcdpZoneCreateJsonStr) {
        this.mpaasMappcenterMcdpZoneCreateJsonStr = mpaasMappcenterMcdpZoneCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpZoneCreateJsonStr() {
        return this.mpaasMappcenterMcdpZoneCreateJsonStr;
    }

    public CreateMcdpZoneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcdpZoneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
