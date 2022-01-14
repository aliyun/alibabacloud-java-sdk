// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMcubeMiniTaskStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskStatus")
    public Long taskStatus;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ChangeMcubeMiniTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeMiniTaskStatusRequest self = new ChangeMcubeMiniTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeMiniTaskStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ChangeMcubeMiniTaskStatusRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ChangeMcubeMiniTaskStatusRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public ChangeMcubeMiniTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ChangeMcubeMiniTaskStatusRequest setTaskStatus(Long taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Long getTaskStatus() {
        return this.taskStatus;
    }

    public ChangeMcubeMiniTaskStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChangeMcubeMiniTaskStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
