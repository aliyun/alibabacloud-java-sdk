// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetFileTokenForUploadToMsaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

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

    public static GetFileTokenForUploadToMsaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileTokenForUploadToMsaRequest self = new GetFileTokenForUploadToMsaRequest();
        return TeaModel.build(map, self);
    }

    public GetFileTokenForUploadToMsaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetFileTokenForUploadToMsaRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public GetFileTokenForUploadToMsaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetFileTokenForUploadToMsaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
