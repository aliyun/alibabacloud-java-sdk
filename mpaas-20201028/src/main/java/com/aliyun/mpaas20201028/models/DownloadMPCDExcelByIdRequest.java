// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DownloadMPCDExcelByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScanTaskId")
    public Long scanTaskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DownloadMPCDExcelByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadMPCDExcelByIdRequest self = new DownloadMPCDExcelByIdRequest();
        return TeaModel.build(map, self);
    }

    public DownloadMPCDExcelByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DownloadMPCDExcelByIdRequest setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

    public DownloadMPCDExcelByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DownloadMPCDExcelByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
