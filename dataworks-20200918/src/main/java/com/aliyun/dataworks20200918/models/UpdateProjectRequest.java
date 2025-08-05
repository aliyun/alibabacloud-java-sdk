// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("CallerApp")
    public String callerApp;

    @NameInMap("DisableDevelopment")
    public Boolean disableDevelopment;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("EnableChangeNodeOwner")
    public Boolean enableChangeNodeOwner;

    @NameInMap("IsAllowDownload")
    public Boolean isAllowDownload;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ProjectDesc")
    public String projectDesc;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProjectOwnerBaseId")
    public String projectOwnerBaseId;

    @NameInMap("Status")
    public String status;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setCallerApp(String callerApp) {
        this.callerApp = callerApp;
        return this;
    }
    public String getCallerApp() {
        return this.callerApp;
    }

    public UpdateProjectRequest setDisableDevelopment(Boolean disableDevelopment) {
        this.disableDevelopment = disableDevelopment;
        return this;
    }
    public Boolean getDisableDevelopment() {
        return this.disableDevelopment;
    }

    public UpdateProjectRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateProjectRequest setEnableChangeNodeOwner(Boolean enableChangeNodeOwner) {
        this.enableChangeNodeOwner = enableChangeNodeOwner;
        return this;
    }
    public Boolean getEnableChangeNodeOwner() {
        return this.enableChangeNodeOwner;
    }

    public UpdateProjectRequest setIsAllowDownload(Boolean isAllowDownload) {
        this.isAllowDownload = isAllowDownload;
        return this;
    }
    public Boolean getIsAllowDownload() {
        return this.isAllowDownload;
    }

    public UpdateProjectRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateProjectRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public UpdateProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateProjectRequest setProjectOwnerBaseId(String projectOwnerBaseId) {
        this.projectOwnerBaseId = projectOwnerBaseId;
        return this;
    }
    public String getProjectOwnerBaseId() {
        return this.projectOwnerBaseId;
    }

    public UpdateProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
