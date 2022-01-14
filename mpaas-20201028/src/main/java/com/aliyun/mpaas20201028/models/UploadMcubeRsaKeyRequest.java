// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadMcubeRsaKeyRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadMcubeRsaKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeRsaKeyRequest self = new UploadMcubeRsaKeyRequest();
        return TeaModel.build(map, self);
    }

    public UploadMcubeRsaKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadMcubeRsaKeyRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadMcubeRsaKeyRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public UploadMcubeRsaKeyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UploadMcubeRsaKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
