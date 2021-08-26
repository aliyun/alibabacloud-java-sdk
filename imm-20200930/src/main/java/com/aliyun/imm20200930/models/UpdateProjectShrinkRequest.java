// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateProjectShrinkRequest extends TeaModel {
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
    public String resetItemsShrink;

    public static UpdateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectShrinkRequest self = new UpdateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateProjectShrinkRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public UpdateProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateProjectShrinkRequest setProjectQPS(Long projectQPS) {
        this.projectQPS = projectQPS;
        return this;
    }
    public Long getProjectQPS() {
        return this.projectQPS;
    }

    public UpdateProjectShrinkRequest setProjectTPS(Long projectTPS) {
        this.projectTPS = projectTPS;
        return this;
    }
    public Long getProjectTPS() {
        return this.projectTPS;
    }

    public UpdateProjectShrinkRequest setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public UpdateProjectShrinkRequest setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
        this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
        return this;
    }
    public Long getDatasetMaxOSSBindCount() {
        return this.datasetMaxOSSBindCount;
    }

    public UpdateProjectShrinkRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public UpdateProjectShrinkRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public UpdateProjectShrinkRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public UpdateProjectShrinkRequest setResetItemsShrink(String resetItemsShrink) {
        this.resetItemsShrink = resetItemsShrink;
        return this;
    }
    public String getResetItemsShrink() {
        return this.resetItemsShrink;
    }

}
