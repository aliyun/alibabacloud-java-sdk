// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CheckUserAuthToMsceneRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthToken")
    public String authToken;

    @NameInMap("MiniProgramId")
    public String miniProgramId;

    @NameInMap("OpenUid")
    public String openUid;

    @NameInMap("PlatformId")
    public String platformId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CheckUserAuthToMsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserAuthToMsceneRequest self = new CheckUserAuthToMsceneRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserAuthToMsceneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CheckUserAuthToMsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckUserAuthToMsceneRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public CheckUserAuthToMsceneRequest setOpenUid(String openUid) {
        this.openUid = openUid;
        return this;
    }
    public String getOpenUid() {
        return this.openUid;
    }

    public CheckUserAuthToMsceneRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public CheckUserAuthToMsceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CheckUserAuthToMsceneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
