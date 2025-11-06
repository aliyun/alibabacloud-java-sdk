// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMdsCubeTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("GreyConfigInfo")
    public String greyConfigInfo;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("GreyEndtimeData")
    public String greyEndtimeData;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GreyNum")
    public Integer greyNum;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PublishMode")
    public Integer publishMode;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PublishType")
    public Integer publishType;

    /**
     * <strong>example:</strong>
     * <p>task_test</p>
     */
    @NameInMap("TaskDesc")
    public String taskDesc;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateResourceId")
    public Long templateResourceId;

    /**
     * <strong>example:</strong>
     * <p>ZXCXMAHQ-zh_CN</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>test1,test2</p>
     */
    @NameInMap("WhitelistIds")
    public String whitelistIds;

    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMdsCubeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMdsCubeTaskRequest self = new CreateMdsCubeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMdsCubeTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMdsCubeTaskRequest setGreyConfigInfo(String greyConfigInfo) {
        this.greyConfigInfo = greyConfigInfo;
        return this;
    }
    public String getGreyConfigInfo() {
        return this.greyConfigInfo;
    }

    public CreateMdsCubeTaskRequest setGreyEndtimeData(String greyEndtimeData) {
        this.greyEndtimeData = greyEndtimeData;
        return this;
    }
    public String getGreyEndtimeData() {
        return this.greyEndtimeData;
    }

    public CreateMdsCubeTaskRequest setGreyNum(Integer greyNum) {
        this.greyNum = greyNum;
        return this;
    }
    public Integer getGreyNum() {
        return this.greyNum;
    }

    public CreateMdsCubeTaskRequest setPublishMode(Integer publishMode) {
        this.publishMode = publishMode;
        return this;
    }
    public Integer getPublishMode() {
        return this.publishMode;
    }

    public CreateMdsCubeTaskRequest setPublishType(Integer publishType) {
        this.publishType = publishType;
        return this;
    }
    public Integer getPublishType() {
        return this.publishType;
    }

    public CreateMdsCubeTaskRequest setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }
    public String getTaskDesc() {
        return this.taskDesc;
    }

    public CreateMdsCubeTaskRequest setTemplateResourceId(Long templateResourceId) {
        this.templateResourceId = templateResourceId;
        return this;
    }
    public Long getTemplateResourceId() {
        return this.templateResourceId;
    }

    public CreateMdsCubeTaskRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMdsCubeTaskRequest setWhitelistIds(String whitelistIds) {
        this.whitelistIds = whitelistIds;
        return this;
    }
    public String getWhitelistIds() {
        return this.whitelistIds;
    }

    public CreateMdsCubeTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
