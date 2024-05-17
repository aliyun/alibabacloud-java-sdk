// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpMaterialRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpMaterialCreateJsonStr")
    public String mpaasMappcenterMcdpMaterialCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcdpMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpMaterialRequest self = new CreateMcdpMaterialRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcdpMaterialRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcdpMaterialRequest setMpaasMappcenterMcdpMaterialCreateJsonStr(String mpaasMappcenterMcdpMaterialCreateJsonStr) {
        this.mpaasMappcenterMcdpMaterialCreateJsonStr = mpaasMappcenterMcdpMaterialCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpMaterialCreateJsonStr() {
        return this.mpaasMappcenterMcdpMaterialCreateJsonStr;
    }

    public CreateMcdpMaterialRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcdpMaterialRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
