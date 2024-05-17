// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsMiniprogramTaskRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GreyConfigInfo")
    public String greyConfigInfo;

    @NameInMap("GreyEndtimeData")
    public String greyEndtimeData;

    @NameInMap("GreyNum")
    public String greyNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Memo")
    public String memo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("PublishMode")
    public String publishMode;

    /**
     * <p>This parameter is required.</p>
     */
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

    public static CreateMdsMiniprogramTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsMiniprogramTaskRequest self = new CreateMdsMiniprogramTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMdsMiniprogramTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMdsMiniprogramTaskRequest setGreyConfigInfo(String greyConfigInfo) {
        this.greyConfigInfo = greyConfigInfo;
        return this;
    }
    public String getGreyConfigInfo() {
        return this.greyConfigInfo;
    }

    public CreateMdsMiniprogramTaskRequest setGreyEndtimeData(String greyEndtimeData) {
        this.greyEndtimeData = greyEndtimeData;
        return this;
    }
    public String getGreyEndtimeData() {
        return this.greyEndtimeData;
    }

    public CreateMdsMiniprogramTaskRequest setGreyNum(String greyNum) {
        this.greyNum = greyNum;
        return this;
    }
    public String getGreyNum() {
        return this.greyNum;
    }

    public CreateMdsMiniprogramTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateMdsMiniprogramTaskRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateMdsMiniprogramTaskRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public CreateMdsMiniprogramTaskRequest setPublishMode(String publishMode) {
        this.publishMode = publishMode;
        return this;
    }
    public String getPublishMode() {
        return this.publishMode;
    }

    public CreateMdsMiniprogramTaskRequest setPublishType(Long publishType) {
        this.publishType = publishType;
        return this;
    }
    public Long getPublishType() {
        return this.publishType;
    }

    public CreateMdsMiniprogramTaskRequest setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
    }

    public CreateMdsMiniprogramTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMdsMiniprogramTaskRequest setWhitelistIds(String whitelistIds) {
        this.whitelistIds = whitelistIds;
        return this;
    }
    public String getWhitelistIds() {
        return this.whitelistIds;
    }

    public CreateMdsMiniprogramTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
