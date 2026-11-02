// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ExportGatewayApisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiIds")
    public java.util.List<Long> apiIds;

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

    public static ExportGatewayApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportGatewayApisRequest self = new ExportGatewayApisRequest();
        return TeaModel.build(map, self);
    }

    public ExportGatewayApisRequest setApiIds(java.util.List<Long> apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public java.util.List<Long> getApiIds() {
        return this.apiIds;
    }

    public ExportGatewayApisRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ExportGatewayApisRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExportGatewayApisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
