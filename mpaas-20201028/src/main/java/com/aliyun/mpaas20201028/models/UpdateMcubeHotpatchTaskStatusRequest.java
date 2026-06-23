// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMcubeHotpatchTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskStatus")
    public Long taskStatus;

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

    public static UpdateMcubeHotpatchTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeHotpatchTaskStatusRequest self = new UpdateMcubeHotpatchTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcubeHotpatchTaskStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMcubeHotpatchTaskStatusRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateMcubeHotpatchTaskStatusRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public UpdateMcubeHotpatchTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateMcubeHotpatchTaskStatusRequest setTaskStatus(Long taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Long getTaskStatus() {
        return this.taskStatus;
    }

    public UpdateMcubeHotpatchTaskStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateMcubeHotpatchTaskStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
