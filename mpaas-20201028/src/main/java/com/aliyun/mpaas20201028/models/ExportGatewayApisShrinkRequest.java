// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ExportGatewayApisShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiIds")
    public String apiIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ExportGatewayApisShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportGatewayApisShrinkRequest self = new ExportGatewayApisShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportGatewayApisShrinkRequest setApiIdsShrink(String apiIdsShrink) {
        this.apiIdsShrink = apiIdsShrink;
        return this;
    }
    public String getApiIdsShrink() {
        return this.apiIdsShrink;
    }

    public ExportGatewayApisShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExportGatewayApisShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExportGatewayApisShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
