// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpEventRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpEventCreateJsonStr")
    public String mpaasMappcenterMcdpEventCreateJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcdpEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpEventRequest self = new CreateMcdpEventRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcdpEventRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcdpEventRequest setMpaasMappcenterMcdpEventCreateJsonStr(String mpaasMappcenterMcdpEventCreateJsonStr) {
        this.mpaasMappcenterMcdpEventCreateJsonStr = mpaasMappcenterMcdpEventCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpEventCreateJsonStr() {
        return this.mpaasMappcenterMcdpEventCreateJsonStr;
    }

    public CreateMcdpEventRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcdpEventRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
