// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    // 媒体集最多绑定数
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    // 媒体集最多实体数
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    // 媒体集最多文件数
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    // 媒体集最多关系数
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    // 媒体集最大文件总大小
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    // 项目描述
    @NameInMap("Description")
    public String description;

    // 项目并发数
    @NameInMap("EngineConcurrency")
    public Long engineConcurrency;

    // 项目最多媒体集数
    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 项目QPS
    @NameInMap("ProjectQueriesPerSecond")
    public Long projectQueriesPerSecond;

    // 服务角色
    @NameInMap("ServiceRole")
    public String serviceRole;

    // 模板Id
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public UpdateProjectRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public UpdateProjectRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public UpdateProjectRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public UpdateProjectRequest setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectRequest setEngineConcurrency(Long engineConcurrency) {
        this.engineConcurrency = engineConcurrency;
        return this;
    }
    public Long getEngineConcurrency() {
        return this.engineConcurrency;
    }

    public UpdateProjectRequest setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public UpdateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateProjectRequest setProjectQueriesPerSecond(Long projectQueriesPerSecond) {
        this.projectQueriesPerSecond = projectQueriesPerSecond;
        return this;
    }
    public Long getProjectQueriesPerSecond() {
        return this.projectQueriesPerSecond;
    }

    public UpdateProjectRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public UpdateProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
