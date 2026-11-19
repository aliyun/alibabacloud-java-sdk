// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SyncMiniGameOnlineStatusByAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MiniProgramCode")
    public String miniProgramCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OnlineStatus")
    public Integer onlineStatus;

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

    public static SyncMiniGameOnlineStatusByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMiniGameOnlineStatusByAppRequest self = new SyncMiniGameOnlineStatusByAppRequest();
        return TeaModel.build(map, self);
    }

    public SyncMiniGameOnlineStatusByAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SyncMiniGameOnlineStatusByAppRequest setMiniProgramCode(String miniProgramCode) {
        this.miniProgramCode = miniProgramCode;
        return this;
    }
    public String getMiniProgramCode() {
        return this.miniProgramCode;
    }

    public SyncMiniGameOnlineStatusByAppRequest setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }
    public Integer getOnlineStatus() {
        return this.onlineStatus;
    }

    public SyncMiniGameOnlineStatusByAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncMiniGameOnlineStatusByAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
