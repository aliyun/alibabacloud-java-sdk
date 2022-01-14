// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsWhitelistContentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WhitelistId")
    public String whitelistId;

    @NameInMap("WhitelistValue")
    public String whitelistValue;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMdsWhitelistContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsWhitelistContentRequest self = new DeleteMdsWhitelistContentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMdsWhitelistContentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMdsWhitelistContentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMdsWhitelistContentRequest setWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
        return this;
    }
    public String getWhitelistId() {
        return this.whitelistId;
    }

    public DeleteMdsWhitelistContentRequest setWhitelistValue(String whitelistValue) {
        this.whitelistValue = whitelistValue;
        return this;
    }
    public String getWhitelistValue() {
        return this.whitelistValue;
    }

    public DeleteMdsWhitelistContentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
