// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMasCrowdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpMasCrowdCreateJsonStr")
    public String mpaasMappcenterMcdpMasCrowdCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMasCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMasCrowdRequest self = new CreateMasCrowdRequest();
        return TeaModel.build(map, self);
    }

    public CreateMasCrowdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMasCrowdRequest setMpaasMappcenterMcdpMasCrowdCreateJsonStr(String mpaasMappcenterMcdpMasCrowdCreateJsonStr) {
        this.mpaasMappcenterMcdpMasCrowdCreateJsonStr = mpaasMappcenterMcdpMasCrowdCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpMasCrowdCreateJsonStr() {
        return this.mpaasMappcenterMcdpMasCrowdCreateJsonStr;
    }

    public CreateMasCrowdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMasCrowdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
