// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CheckUserAuthToMsceneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <strong>example:</strong>
     * <p>9999202604200001</p>
     */
    @NameInMap("MiniProgramId")
    public String miniProgramId;

    /**
     * <strong>example:</strong>
     * <p>QSz8YsUpMRiCAv0yKLi0OVGd0lQSg9CQkYI148GNIWE=</p>
     */
    @NameInMap("OpenUid")
    public String openUid;

    /**
     * <strong>example:</strong>
     * <p>mPaaS_Goosefish</p>
     */
    @NameInMap("PlatformId")
    public String platformId;

    /**
     * <strong>example:</strong>
     * <p>ZXCXMAHQ-zh_CN</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
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
