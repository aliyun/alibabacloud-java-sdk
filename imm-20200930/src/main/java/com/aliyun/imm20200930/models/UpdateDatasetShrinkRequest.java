// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateDatasetShrinkRequest extends TeaModel {
    /**
     * <p>The dataset configuration.</p>
     */
    @NameInMap("DatasetConfig")
    public String datasetConfigShrink;

    /**
     * <p>The maximum number of bindings for the dataset. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    /**
     * <p>The maximum number of metadata entities, such as data files, file relationships, and cluster groups, in the dataset. The maximum value is 2^63 - 1.</p>
     * <blockquote>
     * <p>This parameter is reserved and not enforced in practice.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    /**
     * <p>The maximum number of files in the dataset. Valid values: 1 to 100000000.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    /**
     * <p>The maximum number of metadata relationships in the dataset. The maximum value is 2^63 - 1.</p>
     * <blockquote>
     * <p>This parameter is reserved and not enforced in practice.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    /**
     * <p>The maximum total size of all files in the dataset, in bytes. If this limit is exceeded, you can no longer add new index entries. The maximum value is 2^63 - 1.</p>
     * 
     * <strong>example:</strong>
     * <p>90000000000000000</p>
     */
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    /**
     * <p>The dataset name. For information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The dataset description.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The workflow template ID. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Official:ImageManagement</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is invalid.</p>
     */
    @NameInMap("WorkflowParameters")
    public String workflowParametersShrink;

    public static UpdateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetShrinkRequest self = new UpdateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetShrinkRequest setDatasetConfigShrink(String datasetConfigShrink) {
        this.datasetConfigShrink = datasetConfigShrink;
        return this;
    }
    public String getDatasetConfigShrink() {
        return this.datasetConfigShrink;
    }

    public UpdateDatasetShrinkRequest setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public UpdateDatasetShrinkRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public UpdateDatasetShrinkRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public UpdateDatasetShrinkRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public UpdateDatasetShrinkRequest setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public UpdateDatasetShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateDatasetShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatasetShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateDatasetShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateDatasetShrinkRequest setWorkflowParametersShrink(String workflowParametersShrink) {
        this.workflowParametersShrink = workflowParametersShrink;
        return this;
    }
    public String getWorkflowParametersShrink() {
        return this.workflowParametersShrink;
    }

}
