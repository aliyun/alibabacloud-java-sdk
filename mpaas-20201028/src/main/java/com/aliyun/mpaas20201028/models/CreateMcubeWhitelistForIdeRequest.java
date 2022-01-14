// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistForIdeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WhitelistValue")
    public String whitelistValue;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeWhitelistForIdeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistForIdeRequest self = new CreateMcubeWhitelistForIdeRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeWhitelistForIdeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeWhitelistForIdeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeWhitelistForIdeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateMcubeWhitelistForIdeRequest setWhitelistValue(String whitelistValue) {
        this.whitelistValue = whitelistValue;
        return this;
    }
    public String getWhitelistValue() {
        return this.whitelistValue;
    }

    public CreateMcubeWhitelistForIdeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
