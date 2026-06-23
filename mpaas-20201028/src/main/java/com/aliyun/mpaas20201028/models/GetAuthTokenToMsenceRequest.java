// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetAuthTokenToMsenceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("MiniProgramId")
    public String miniProgramId;

    @NameInMap("PlatformId")
    public String platformId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAuthTokenToMsenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenToMsenceRequest self = new GetAuthTokenToMsenceRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenToMsenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAuthTokenToMsenceRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetAuthTokenToMsenceRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public GetAuthTokenToMsenceRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public GetAuthTokenToMsenceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetAuthTokenToMsenceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
