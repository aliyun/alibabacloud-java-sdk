// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradeTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GreyConfigInfo")
    public String greyConfigInfo;

    @NameInMap("GreyEndtimeData")
    public String greyEndtimeData;

    @NameInMap("GreyNum")
    public Integer greyNum;

    @NameInMap("HistoryForce")
    public Integer historyForce;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("PackageInfoId")
    public Long packageInfoId;

    @NameInMap("PublishMode")
    public Integer publishMode;

    @NameInMap("PublishType")
    public Integer publishType;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UpgradeContent")
    public String upgradeContent;

    @NameInMap("UpgradeType")
    public Integer upgradeType;

    @NameInMap("WhitelistIds")
    public String whitelistIds;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeUpgradeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradeTaskRequest self = new CreateMcubeUpgradeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradeTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeUpgradeTaskRequest setGreyConfigInfo(String greyConfigInfo) {
        this.greyConfigInfo = greyConfigInfo;
        return this;
    }
    public String getGreyConfigInfo() {
        return this.greyConfigInfo;
    }

    public CreateMcubeUpgradeTaskRequest setGreyEndtimeData(String greyEndtimeData) {
        this.greyEndtimeData = greyEndtimeData;
        return this;
    }
    public String getGreyEndtimeData() {
        return this.greyEndtimeData;
    }

    public CreateMcubeUpgradeTaskRequest setGreyNum(Integer greyNum) {
        this.greyNum = greyNum;
        return this;
    }
    public Integer getGreyNum() {
        return this.greyNum;
    }

    public CreateMcubeUpgradeTaskRequest setHistoryForce(Integer historyForce) {
        this.historyForce = historyForce;
        return this;
    }
    public Integer getHistoryForce() {
        return this.historyForce;
    }

    public CreateMcubeUpgradeTaskRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateMcubeUpgradeTaskRequest setPackageInfoId(Long packageInfoId) {
        this.packageInfoId = packageInfoId;
        return this;
    }
    public Long getPackageInfoId() {
        return this.packageInfoId;
    }

    public CreateMcubeUpgradeTaskRequest setPublishMode(Integer publishMode) {
        this.publishMode = publishMode;
        return this;
    }
    public Integer getPublishMode() {
        return this.publishMode;
    }

    public CreateMcubeUpgradeTaskRequest setPublishType(Integer publishType) {
        this.publishType = publishType;
        return this;
    }
    public Integer getPublishType() {
        return this.publishType;
    }

    public CreateMcubeUpgradeTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeUpgradeTaskRequest setUpgradeContent(String upgradeContent) {
        this.upgradeContent = upgradeContent;
        return this;
    }
    public String getUpgradeContent() {
        return this.upgradeContent;
    }

    public CreateMcubeUpgradeTaskRequest setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public Integer getUpgradeType() {
        return this.upgradeType;
    }

    public CreateMcubeUpgradeTaskRequest setWhitelistIds(String whitelistIds) {
        this.whitelistIds = whitelistIds;
        return this;
    }
    public String getWhitelistIds() {
        return this.whitelistIds;
    }

    public CreateMcubeUpgradeTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
