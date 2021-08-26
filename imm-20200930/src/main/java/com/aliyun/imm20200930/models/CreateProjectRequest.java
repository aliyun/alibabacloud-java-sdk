// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 项目描述
    @NameInMap("Description")
    public String description;

    // 服务角色
    @NameInMap("ServiceRole")
    public String serviceRole;

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

    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateProjectRequest setProjectQPS(Long projectQPS) {
        this.projectQPS = projectQPS;
        return this;
    }
    public Long getProjectQPS() {
        return this.projectQPS;
    }

    public CreateProjectRequest setProjectTPS(Long projectTPS) {
        this.projectTPS = projectTPS;
        return this;
    }
    public Long getProjectTPS() {
        return this.projectTPS;
    }

    public CreateProjectRequest setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public CreateProjectRequest setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
        this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
        return this;
    }
    public Long getDatasetMaxOSSBindCount() {
        return this.datasetMaxOSSBindCount;
    }

    public CreateProjectRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public CreateProjectRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public CreateProjectRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public CreateProjectRequest setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

}
