// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GreyConfigInfo")
    public String greyConfigInfo;

    @NameInMap("GreyEndtimeData")
    public String greyEndtimeData;

    @NameInMap("GreyNum")
    public Long greyNum;

    @NameInMap("Memo")
    public String memo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("PublishMode")
    public Long publishMode;

    @NameInMap("PublishType")
    public Long publishType;

    @NameInMap("SyncMode")
    public String syncMode;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WhitelistIds")
    public String whitelistIds;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeHotpatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchTaskRequest self = new CreateMcubeHotpatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeHotpatchTaskRequest setGreyConfigInfo(String greyConfigInfo) {
        this.greyConfigInfo = greyConfigInfo;
        return this;
    }
    public String getGreyConfigInfo() {
        return this.greyConfigInfo;
    }

    public CreateMcubeHotpatchTaskRequest setGreyEndtimeData(String greyEndtimeData) {
        this.greyEndtimeData = greyEndtimeData;
        return this;
    }
    public String getGreyEndtimeData() {
        return this.greyEndtimeData;
    }

    public CreateMcubeHotpatchTaskRequest setGreyNum(Long greyNum) {
        this.greyNum = greyNum;
        return this;
    }
    public Long getGreyNum() {
        return this.greyNum;
    }

    public CreateMcubeHotpatchTaskRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateMcubeHotpatchTaskRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public CreateMcubeHotpatchTaskRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateMcubeHotpatchTaskRequest setPublishMode(Long publishMode) {
        this.publishMode = publishMode;
        return this;
    }
    public Long getPublishMode() {
        return this.publishMode;
    }

    public CreateMcubeHotpatchTaskRequest setPublishType(Long publishType) {
        this.publishType = publishType;
        return this;
    }
    public Long getPublishType() {
        return this.publishType;
    }

    public CreateMcubeHotpatchTaskRequest setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
    }

    public CreateMcubeHotpatchTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeHotpatchTaskRequest setWhitelistIds(String whitelistIds) {
        this.whitelistIds = whitelistIds;
        return this;
    }
    public String getWhitelistIds() {
        return this.whitelistIds;
    }

    public CreateMcubeHotpatchTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
