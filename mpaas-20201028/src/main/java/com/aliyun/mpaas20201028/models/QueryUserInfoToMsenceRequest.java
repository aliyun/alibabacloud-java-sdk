// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryUserInfoToMsenceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthToken")
    public String authToken;

    @NameInMap("MiniProgramId")
    public String miniProgramId;

    @NameInMap("PlatformId")
    public String platformId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryUserInfoToMsenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoToMsenceRequest self = new QueryUserInfoToMsenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoToMsenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryUserInfoToMsenceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserInfoToMsenceRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public QueryUserInfoToMsenceRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public QueryUserInfoToMsenceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryUserInfoToMsenceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
