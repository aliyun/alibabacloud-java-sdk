// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CopyMcdpGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpGroupCopyJsonStr")
    public String mpaasMappcenterMcdpGroupCopyJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CopyMcdpGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyMcdpGroupRequest self = new CopyMcdpGroupRequest();
        return TeaModel.build(map, self);
    }

    public CopyMcdpGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CopyMcdpGroupRequest setMpaasMappcenterMcdpGroupCopyJsonStr(String mpaasMappcenterMcdpGroupCopyJsonStr) {
        this.mpaasMappcenterMcdpGroupCopyJsonStr = mpaasMappcenterMcdpGroupCopyJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpGroupCopyJsonStr() {
        return this.mpaasMappcenterMcdpGroupCopyJsonStr;
    }

    public CopyMcdpGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CopyMcdpGroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
