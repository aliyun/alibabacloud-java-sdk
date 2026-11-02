// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ImportGatewayApisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("ImportMode")
    public String importMode;

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

    public static ImportGatewayApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportGatewayApisRequest self = new ImportGatewayApisRequest();
        return TeaModel.build(map, self);
    }

    public ImportGatewayApisRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportGatewayApisRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ImportGatewayApisRequest setImportMode(String importMode) {
        this.importMode = importMode;
        return this;
    }
    public String getImportMode() {
        return this.importMode;
    }

    public ImportGatewayApisRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ImportGatewayApisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
