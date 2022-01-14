// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMPCDByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ScanTaskId")
    public Long scanTaskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMPCDByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPCDByIdRequest self = new DeleteMPCDByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMPCDByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMPCDByIdRequest setScanTaskId(Long scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public Long getScanTaskId() {
        return this.scanTaskId;
    }

    public DeleteMPCDByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMPCDByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
