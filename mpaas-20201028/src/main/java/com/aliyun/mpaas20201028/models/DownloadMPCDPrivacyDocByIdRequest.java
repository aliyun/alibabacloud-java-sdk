// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DownloadMPCDPrivacyDocByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScanTaskId")
    public Long scanTaskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DownloadMPCDPrivacyDocByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadMPCDPrivacyDocByIdRequest self = new DownloadMPCDPrivacyDocByIdRequest();
        return TeaModel.build(map, self);
    }

    public DownloadMPCDPrivacyDocByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DownloadMPCDPrivacyDocByIdRequest setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

    public DownloadMPCDPrivacyDocByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DownloadMPCDPrivacyDocByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
