// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpGroupCreateJsonStr")
    public String mpaasMappcenterMcdpGroupCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcdpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpGroupRequest self = new CreateMcdpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcdpGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcdpGroupRequest setMpaasMappcenterMcdpGroupCreateJsonStr(String mpaasMappcenterMcdpGroupCreateJsonStr) {
        this.mpaasMappcenterMcdpGroupCreateJsonStr = mpaasMappcenterMcdpGroupCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpGroupCreateJsonStr() {
        return this.mpaasMappcenterMcdpGroupCreateJsonStr;
    }

    public CreateMcdpGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcdpGroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
