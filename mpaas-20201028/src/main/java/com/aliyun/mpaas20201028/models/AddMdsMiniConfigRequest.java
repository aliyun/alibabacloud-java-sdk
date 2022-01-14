// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class AddMdsMiniConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMiniConfigAddJsonStr")
    public String mpaasMappcenterMiniConfigAddJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddMdsMiniConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMdsMiniConfigRequest self = new AddMdsMiniConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddMdsMiniConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddMdsMiniConfigRequest setMpaasMappcenterMiniConfigAddJsonStr(String mpaasMappcenterMiniConfigAddJsonStr) {
        this.mpaasMappcenterMiniConfigAddJsonStr = mpaasMappcenterMiniConfigAddJsonStr;
        return this;
    }
    public String getMpaasMappcenterMiniConfigAddJsonStr() {
        return this.mpaasMappcenterMiniConfigAddJsonStr;
    }

    public AddMdsMiniConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddMdsMiniConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
