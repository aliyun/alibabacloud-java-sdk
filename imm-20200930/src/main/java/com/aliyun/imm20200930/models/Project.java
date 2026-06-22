// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    /**
     * <p>The timestamp when the project was created, in RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetConfig")
    public DatasetConfig datasetConfig;

    /**
     * <p>The current number of datasets in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DatasetCount")
    public Long datasetCount;

    /**
     * <p>The maximum number of bindings per dataset. Valid values: 1 to 10. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    /**
     * <p>The maximum number of metadata entities per dataset. Default value: 10000000000.</p>
     * <blockquote>
     * <p>This field is reserved for future use and is not enforced.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    /**
     * <p>The maximum number of files per dataset. Valid values: 1 to 100000000. Default value: 100000000.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    /**
     * <p>The maximum number of metadata relationships per dataset. Default value: 100000000000.</p>
     * <blockquote>
     * <p>This field is reserved for future use and is not enforced.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    /**
     * <p>The maximum total file size per dataset, in bytes. After this limit is exceeded, no more indexes can be added. Default value: 90000000000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>90000000000000000</p>
     */
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    /**
     * <p>The project description.</p>
     * 
     * <strong>example:</strong>
     * <p>test project</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of tasks that the project can process per second. This specifies the maximum number of operators that can run in parallel at the same time across the project. Default value: 100.</p>
     * <ul>
     * <li><p>Synchronous tasks: if the number of concurrent tasks exceeds this limit, task execution time increases until a timeout occurs.</p>
     * </li>
     * <li><p>Asynchronous tasks: if the number of concurrent tasks exceeds this limit, tasks are queued for a period of time, which delays task completion. If the queuing time also exceeds the limit (typically tens of minutes), the task returns a failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EngineConcurrency")
    public Long engineConcurrency;

    /**
     * <p>The current number of files in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileCount")
    public Long fileCount;

    /**
     * <p>The maximum number of datasets in the project. Valid values: 1 to 1000000000. Default value: 1000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000</p>
     */
    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The maximum number of requests that the project can process per second. This specifies the maximum number of API calls allowed per second for all APIs in the project. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectQueriesPerSecond")
    public Long projectQueriesPerSecond;

    /**
     * <p>The service role.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunIMMDefaultRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ProjectTags> tags;

    /**
     * <p>The workflow template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Official:ImageManagement</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The current total file size in the project, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    /**
     * <p>The timestamp when the project was last modified, in RFC3339Nano format.</p>
     * <blockquote>
     * <p>If the project has not been updated since creation, this timestamp is the same as the creation timestamp.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
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

    public Project setDatasetConfig(DatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
        return this;
    }
    public DatasetConfig getDatasetConfig() {
        return this.datasetConfig;
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
        /**
         * <p>标签键。</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>标签值。</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
