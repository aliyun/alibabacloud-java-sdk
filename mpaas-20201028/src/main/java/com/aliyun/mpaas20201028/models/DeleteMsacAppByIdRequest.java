// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacAppByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacDeleteAppJsonStr")
    public String mpaasMappcenterMsacDeleteAppJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMsacAppByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacAppByIdRequest self = new DeleteMsacAppByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsacAppByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMsacAppByIdRequest setMpaasMappcenterMsacDeleteAppJsonStr(String mpaasMappcenterMsacDeleteAppJsonStr) {
        this.mpaasMappcenterMsacDeleteAppJsonStr = mpaasMappcenterMsacDeleteAppJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacDeleteAppJsonStr() {
        return this.mpaasMappcenterMsacDeleteAppJsonStr;
    }

    public DeleteMsacAppByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMsacAppByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
