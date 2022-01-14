// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeWhitelistRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WhiteListName")
    public String whiteListName;

    @NameInMap("WhitelistType")
    public String whitelistType;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeWhitelistRequest self = new CreateMcubeWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeWhitelistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeWhitelistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeWhitelistRequest setWhiteListName(String whiteListName) {
        this.whiteListName = whiteListName;
        return this;
    }
    public String getWhiteListName() {
        return this.whiteListName;
    }

    public CreateMcubeWhitelistRequest setWhitelistType(String whitelistType) {
        this.whitelistType = whitelistType;
        return this;
    }
    public String getWhitelistType() {
        return this.whitelistType;
    }

    public CreateMcubeWhitelistRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
