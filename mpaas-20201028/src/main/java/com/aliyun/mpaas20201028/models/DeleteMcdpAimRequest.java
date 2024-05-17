// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpAimRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpAimDeleteJsonStr")
    public String mpaasMappcenterMcdpAimDeleteJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcdpAimRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpAimRequest self = new DeleteMcdpAimRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpAimRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcdpAimRequest setMpaasMappcenterMcdpAimDeleteJsonStr(String mpaasMappcenterMcdpAimDeleteJsonStr) {
        this.mpaasMappcenterMcdpAimDeleteJsonStr = mpaasMappcenterMcdpAimDeleteJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpAimDeleteJsonStr() {
        return this.mpaasMappcenterMcdpAimDeleteJsonStr;
    }

    public DeleteMcdpAimRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcdpAimRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
