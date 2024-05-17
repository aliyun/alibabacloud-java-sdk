// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpCrowdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpCrowdDeleteJsonStr")
    public String mpaasMappcenterMcdpCrowdDeleteJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcdpCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpCrowdRequest self = new DeleteMcdpCrowdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpCrowdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcdpCrowdRequest setMpaasMappcenterMcdpCrowdDeleteJsonStr(String mpaasMappcenterMcdpCrowdDeleteJsonStr) {
        this.mpaasMappcenterMcdpCrowdDeleteJsonStr = mpaasMappcenterMcdpCrowdDeleteJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpCrowdDeleteJsonStr() {
        return this.mpaasMappcenterMcdpCrowdDeleteJsonStr;
    }

    public DeleteMcdpCrowdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcdpCrowdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
