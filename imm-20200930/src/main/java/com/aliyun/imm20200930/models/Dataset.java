// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    /**
     * <p>Number of OSS buckets currently attached to the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BindCount")
    public Long bindCount;

    /**
     * <p>Timestamp of dataset creation in RFC3339Nano format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Dataset configuration.</p>
     */
    @NameInMap("DatasetConfig")
    public DatasetConfig datasetConfig;

    /**
     * <p>Maximum number of bindings per dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    /**
     * <p>Maximum number of metadata entities in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    /**
     * <p>Maximum number of files in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    /**
     * <p>Maximum number of metadata relations in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    /**
     * <p>Maximum total file size in the dataset, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>90000000000000000</p>
     */
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    /**
     * <p>Dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset001</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>Dataset description.</p>
     * 
     * <strong>example:</strong>
     * <p>测试数据集</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Current number of files in the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileCount")
    public Long fileCount;

    /**
     * <p>Project name.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Workflow template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Official:ImageManagement</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Total file size in the dataset, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    /**
     * <p>Timestamp of the last dataset update in RFC3339Nano format.</p>
     * <blockquote>
     * <p>If the dataset has never been updated since creation, the update timestamp equals the creation timestamp.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>Custom parameters.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("WorkflowParameters")
    public java.util.List<WorkflowParameter> workflowParameters;

    public static Dataset build(java.util.Map<String, ?> map) throws Exception {
        Dataset self = new Dataset();
        return TeaModel.build(map, self);
    }

    public Dataset setBindCount(Long bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Long getBindCount() {
        return this.bindCount;
    }

    public Dataset setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Dataset setDatasetConfig(DatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
        return this;
    }
    public DatasetConfig getDatasetConfig() {
        return this.datasetConfig;
    }

    public Dataset setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public Dataset setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public Dataset setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public Dataset setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public Dataset setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public Dataset setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Dataset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Dataset setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public Dataset setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Dataset setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Dataset setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public Dataset setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public Dataset setWorkflowParameters(java.util.List<WorkflowParameter> workflowParameters) {
        this.workflowParameters = workflowParameters;
        return this;
    }
    public java.util.List<WorkflowParameter> getWorkflowParameters() {
        return this.workflowParameters;
    }

}
