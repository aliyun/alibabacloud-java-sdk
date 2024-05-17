// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMcubeWhitelistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("KeyIds")
    public String keyIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("OssUrl")
    public String ossUrl;

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

    public static UpdateMcubeWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeWhitelistRequest self = new UpdateMcubeWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcubeWhitelistRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMcubeWhitelistRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMcubeWhitelistRequest setKeyIds(String keyIds) {
        this.keyIds = keyIds;
        return this;
    }
    public String getKeyIds() {
        return this.keyIds;
    }

    public UpdateMcubeWhitelistRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public UpdateMcubeWhitelistRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public UpdateMcubeWhitelistRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateMcubeWhitelistRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
