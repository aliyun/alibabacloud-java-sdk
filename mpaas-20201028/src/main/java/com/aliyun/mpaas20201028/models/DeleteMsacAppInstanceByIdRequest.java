// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacAppInstanceByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacDeleteAppInstanceJsonStr")
    public String mpaasMappcenterMsacDeleteAppInstanceJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMsacAppInstanceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacAppInstanceByIdRequest self = new DeleteMsacAppInstanceByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsacAppInstanceByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMsacAppInstanceByIdRequest setMpaasMappcenterMsacDeleteAppInstanceJsonStr(String mpaasMappcenterMsacDeleteAppInstanceJsonStr) {
        this.mpaasMappcenterMsacDeleteAppInstanceJsonStr = mpaasMappcenterMsacDeleteAppInstanceJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacDeleteAppInstanceJsonStr() {
        return this.mpaasMappcenterMsacDeleteAppInstanceJsonStr;
    }

    public DeleteMsacAppInstanceByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMsacAppInstanceByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
