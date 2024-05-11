// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetCount")
    public Long datasetCount;

    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    @NameInMap("Description")
    public String description;

    @NameInMap("EngineConcurrency")
    public Long engineConcurrency;

    @NameInMap("FileCount")
    public Long fileCount;

    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProjectQueriesPerSecond")
    public Long projectQueriesPerSecond;

    @NameInMap("ServiceRole")
    public String serviceRole;

    @NameInMap("Tags")
    public java.util.List<ProjectTags> tags;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Project setDatasetCount(Long datasetCount) {
        this.datasetCount = datasetCount;
        return this;
    }
    public Long getDatasetCount() {
        return this.datasetCount;
    }

    public Project setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public Project setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public Project setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public Project setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public Project setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Project setEngineConcurrency(Long engineConcurrency) {
        this.engineConcurrency = engineConcurrency;
        return this;
    }
    public Long getEngineConcurrency() {
        return this.engineConcurrency;
    }

    public Project setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public Project setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Project setProjectQueriesPerSecond(Long projectQueriesPerSecond) {
        this.projectQueriesPerSecond = projectQueriesPerSecond;
        return this;
    }
    public Long getProjectQueriesPerSecond() {
        return this.projectQueriesPerSecond;
    }

    public Project setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public Project setTags(java.util.List<ProjectTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ProjectTags> getTags() {
        return this.tags;
    }

    public Project setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Project setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public Project setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class ProjectTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ProjectTags build(java.util.Map<String, ?> map) throws Exception {
            ProjectTags self = new ProjectTags();
            return TeaModel.build(map, self);
        }

        public ProjectTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ProjectTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
