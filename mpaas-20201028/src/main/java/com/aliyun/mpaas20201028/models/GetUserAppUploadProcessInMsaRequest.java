// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetUserAppUploadProcessInMsaRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetUserAppUploadProcessInMsaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserAppUploadProcessInMsaRequest self = new GetUserAppUploadProcessInMsaRequest();
        return TeaModel.build(map, self);
    }

    public GetUserAppUploadProcessInMsaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetUserAppUploadProcessInMsaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetUserAppUploadProcessInMsaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetUserAppUploadProcessInMsaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
