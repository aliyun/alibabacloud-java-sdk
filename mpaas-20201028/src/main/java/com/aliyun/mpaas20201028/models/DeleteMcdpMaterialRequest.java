// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpMaterialRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpMaterialDeleteJsonStr")
    public String mpaasMappcenterMcdpMaterialDeleteJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcdpMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpMaterialRequest self = new DeleteMcdpMaterialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpMaterialRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcdpMaterialRequest setMpaasMappcenterMcdpMaterialDeleteJsonStr(String mpaasMappcenterMcdpMaterialDeleteJsonStr) {
        this.mpaasMappcenterMcdpMaterialDeleteJsonStr = mpaasMappcenterMcdpMaterialDeleteJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpMaterialDeleteJsonStr() {
        return this.mpaasMappcenterMcdpMaterialDeleteJsonStr;
    }

    public DeleteMcdpMaterialRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcdpMaterialRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
