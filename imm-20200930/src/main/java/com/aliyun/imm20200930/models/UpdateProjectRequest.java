// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 服务角色
    @NameInMap("ServiceRole")
    public String serviceRole;

    // 项目描述
    @NameInMap("Description")
    public String description;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("ProjectQPS")
    public Long projectQPS;

    @NameInMap("ProjectTPS")
    public Long projectTPS;

    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    @NameInMap("DatasetMaxOSSBindCount")
    public Long datasetMaxOSSBindCount;

    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    @NameInMap("ResetItems")
    public java.util.List<String> resetItems;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateProjectRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateProjectRequest setProjectQPS(Long projectQPS) {
        this.projectQPS = projectQPS;
        return this;
    }
    public Long getProjectQPS() {
        return this.projectQPS;
    }

    public UpdateProjectRequest setProjectTPS(Long projectTPS) {
        this.projectTPS = projectTPS;
        return this;
    }
    public Long getProjectTPS() {
        return this.projectTPS;
    }

    public UpdateProjectRequest setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public UpdateProjectRequest setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
        this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
        return this;
    }
    public Long getDatasetMaxOSSBindCount() {
        return this.datasetMaxOSSBindCount;
    }

    public UpdateProjectRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public UpdateProjectRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public UpdateProjectRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public UpdateProjectRequest setResetItems(java.util.List<String> resetItems) {
        this.resetItems = resetItems;
        return this;
    }
    public java.util.List<String> getResetItems() {
        return this.resetItems;
    }

}
