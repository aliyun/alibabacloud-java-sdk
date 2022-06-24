// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ChangeMcubeNebulaTaskStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("PackageId")
    public String packageId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ChangeMcubeNebulaTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeNebulaTaskStatusRequest self = new ChangeMcubeNebulaTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeNebulaTaskStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ChangeMcubeNebulaTaskStatusRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ChangeMcubeNebulaTaskStatusRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public ChangeMcubeNebulaTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ChangeMcubeNebulaTaskStatusRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public ChangeMcubeNebulaTaskStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChangeMcubeNebulaTaskStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
