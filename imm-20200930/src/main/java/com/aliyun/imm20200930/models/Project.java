// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    /**
     * <p>The timestamp when the project was created. The timestamp is in the RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The current number of datasets in the project.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DatasetCount")
    public Long datasetCount;

    /**
     * <p>The maximum number of bindings that a dataset can have. Valid values: 1 to 10. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    /**
     * <p>The maximum number of metadata entities in a dataset. Default value: 10000000000.</p>
     * <blockquote>
     * <p> This parameter is reserved and does not actually apply a limit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    /**
     * <p>The maximum number of files in a dataset. Valid values: 1 to 100000000. Default value: 100000000.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    /**
     * <p>The maximum number of metadata relationships in a dataset. Default value: 100000000000.</p>
     * <blockquote>
     * <p> This parameter is reserved and does not actually apply a limit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    /**
     * <p>The maximum total file size for a dataset. If the total file size exceeds this limit, indexes can no longer be added. Default value: 90000000000000000. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>90000000000000000</p>
     */
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    /**
     * <p>The project description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of tasks that the project can process per second. This corresponds to the maximum number of operators that can run in parallel in the project. Default value: 100.</p>
     * <ul>
     * <li>If the number of synchronous tasks that run in parallel exceeds this limit, the task execution time will be extended until a timeout occurs.</li>
     * <li>If the number of asynchronous tasks that run in parallel exceeds this limit, the tasks will be queued. This causes delayed task completion. If a task remains in the queue for longer than the specified time limit (usually dozens of seconds), the task will fail.</li>
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
     * <p>The maximum number of datasets that a project can contain. Valid values: 1 to 1000000000. Default value: 1000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000</p>
     */
    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The maximum number of requests that can be processed by the project per second. This corresponds to the maximum number of API operations that can be called in the project per second. Default value: 100.</p>
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
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ProjectTags> tags;

    /**
     * <p>The ID of the workflow template.</p>
     * 
     * <strong>example:</strong>
     * <p>DefaultId</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The current total size of files in the project. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    /**
     * <p>The timestamp when the project was last modified. The timestamp is in the RFC3339Nano format.</p>
     * <blockquote>
     * <p> If a project is not modified after it is created, the timestamp when the project was created is the same as the timestamp when the project was last modified.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
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
