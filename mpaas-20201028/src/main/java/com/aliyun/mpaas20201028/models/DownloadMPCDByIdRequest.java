// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DownloadMPCDByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScanTaskId")
    public Long scanTaskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DownloadMPCDByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadMPCDByIdRequest self = new DownloadMPCDByIdRequest();
        return TeaModel.build(map, self);
    }

    public DownloadMPCDByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DownloadMPCDByIdRequest setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

    public DownloadMPCDByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DownloadMPCDByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
