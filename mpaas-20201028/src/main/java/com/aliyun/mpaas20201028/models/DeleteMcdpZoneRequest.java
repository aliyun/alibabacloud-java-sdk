// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpZoneRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpZoneDeleteJsonStr")
    public String mpaasMappcenterMcdpZoneDeleteJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcdpZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpZoneRequest self = new DeleteMcdpZoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpZoneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcdpZoneRequest setMpaasMappcenterMcdpZoneDeleteJsonStr(String mpaasMappcenterMcdpZoneDeleteJsonStr) {
        this.mpaasMappcenterMcdpZoneDeleteJsonStr = mpaasMappcenterMcdpZoneDeleteJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpZoneDeleteJsonStr() {
        return this.mpaasMappcenterMcdpZoneDeleteJsonStr;
    }

    public DeleteMcdpZoneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcdpZoneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
