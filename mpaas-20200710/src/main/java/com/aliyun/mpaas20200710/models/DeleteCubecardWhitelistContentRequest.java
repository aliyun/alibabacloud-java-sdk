// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class DeleteCubecardWhitelistContentRequest extends TeaModel {
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

    public static DeleteCubecardWhitelistContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCubecardWhitelistContentRequest self = new DeleteCubecardWhitelistContentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCubecardWhitelistContentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCubecardWhitelistContentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteCubecardWhitelistContentRequest setWhitelistId(String whitelistId) {
        this.whitelistId = whitelistId;
        return this;
    }
    public String getWhitelistId() {
        return this.whitelistId;
    }

    public DeleteCubecardWhitelistContentRequest setWhitelistValue(String whitelistValue) {
        this.whitelistValue = whitelistValue;
        return this;
    }
    public String getWhitelistValue() {
        return this.whitelistValue;
    }

    public DeleteCubecardWhitelistContentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
