// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SetMsacAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("mpaasMappcenterMsacSetAppJsonStr")
    public String mpaasMappcenterMsacSetAppJsonStr;

    public static SetMsacAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMsacAppRequest self = new SetMsacAppRequest();
        return TeaModel.build(map, self);
    }

    public SetMsacAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetMsacAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SetMsacAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SetMsacAppRequest setMpaasMappcenterMsacSetAppJsonStr(String mpaasMappcenterMsacSetAppJsonStr) {
        this.mpaasMappcenterMsacSetAppJsonStr = mpaasMappcenterMsacSetAppJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacSetAppJsonStr() {
        return this.mpaasMappcenterMsacSetAppJsonStr;
    }

}
