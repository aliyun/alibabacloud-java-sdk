// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GreyConfigInfo")
    public String greyConfigInfo;

    @NameInMap("GreyEndtimeData")
    public String greyEndtimeData;

    @NameInMap("GreyNum")
    public Long greyNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Memo")
    public String memo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageId")
    public Long packageId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishMode")
    public Long publishMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishType")
    public Long publishType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WhitelistIds")
    public String whitelistIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeMiniTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniTaskRequest self = new CreateMcubeMiniTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeMiniTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeMiniTaskRequest setGreyConfigInfo(String greyConfigInfo) {
        this.greyConfigInfo = greyConfigInfo;
        return this;
    }
    public String getGreyConfigInfo() {
        return this.greyConfigInfo;
    }

    public CreateMcubeMiniTaskRequest setGreyEndtimeData(String greyEndtimeData) {
        this.greyEndtimeData = greyEndtimeData;
        return this;
    }
    public String getGreyEndtimeData() {
        return this.greyEndtimeData;
    }

    public CreateMcubeMiniTaskRequest setGreyNum(Long greyNum) {
        this.greyNum = greyNum;
        return this;
    }
    public Long getGreyNum() {
        return this.greyNum;
    }

    public CreateMcubeMiniTaskRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateMcubeMiniTaskRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public CreateMcubeMiniTaskRequest setPublishMode(Long publishMode) {
        this.publishMode = publishMode;
        return this;
    }
    public Long getPublishMode() {
        return this.publishMode;
    }

    public CreateMcubeMiniTaskRequest setPublishType(Long publishType) {
        this.publishType = publishType;
        return this;
    }
    public Long getPublishType() {
        return this.publishType;
    }

    public CreateMcubeMiniTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeMiniTaskRequest setWhitelistIds(String whitelistIds) {
        this.whitelistIds = whitelistIds;
        return this;
    }
    public String getWhitelistIds() {
        return this.whitelistIds;
    }

    public CreateMcubeMiniTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
