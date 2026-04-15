// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryUserInfoToMsenceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>NPHTGKNR</p>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <strong>example:</strong>
     * <p>123321</p>
     */
    @NameInMap("MiniProgramId")
    public String miniProgramId;

    /**
     * <strong>example:</strong>
     * <p>mPaaS_Goosefish</p>
     */
    @NameInMap("PlatformId")
    public String platformId;

    /**
     * <strong>example:</strong>
     * <p>JGBGDUWU</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>preProd</p>
     */
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
