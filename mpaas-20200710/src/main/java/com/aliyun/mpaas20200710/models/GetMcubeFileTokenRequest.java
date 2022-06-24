// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class GetMcubeFileTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMcubeFileTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeFileTokenRequest self = new GetMcubeFileTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetMcubeFileTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMcubeFileTokenRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public GetMcubeFileTokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMcubeFileTokenRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
