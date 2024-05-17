// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpEventByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpEventDeleteJsonStr")
    public String mpaasMappcenterMcdpEventDeleteJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcdpEventByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpEventByIdRequest self = new DeleteMcdpEventByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpEventByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcdpEventByIdRequest setMpaasMappcenterMcdpEventDeleteJsonStr(String mpaasMappcenterMcdpEventDeleteJsonStr) {
        this.mpaasMappcenterMcdpEventDeleteJsonStr = mpaasMappcenterMcdpEventDeleteJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpEventDeleteJsonStr() {
        return this.mpaasMappcenterMcdpEventDeleteJsonStr;
    }

    public DeleteMcdpEventByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcdpEventByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
