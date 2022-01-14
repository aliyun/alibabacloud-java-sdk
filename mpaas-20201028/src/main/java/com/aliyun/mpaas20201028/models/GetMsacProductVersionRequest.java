// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMsacProductVersionRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMsacProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMsacProductVersionRequest self = new GetMsacProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetMsacProductVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMsacProductVersionRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetMsacProductVersionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMsacProductVersionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
