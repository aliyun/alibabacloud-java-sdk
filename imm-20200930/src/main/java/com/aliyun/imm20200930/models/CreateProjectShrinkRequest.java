// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateProjectShrinkRequest extends TeaModel {
    @NameInMap("DatasetConfig")
    public String datasetConfigShrink;

    /**
     * <p>The maximum number of bindings for each dataset. Valid values: 1 to 10. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    /**
     * <p>The maximum number of metadata entities in each dataset. Default value: 10000000000.</p>
     * <blockquote>
     * <p>This parameter is reserved for future use and is not enforced.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000000000</p>
     */
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    /**
     * <p>The maximum number of files in each dataset. Valid values: 1 to 100000000. Default value: 10000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>100000000</p>
     */
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    /**
     * <p>The maximum number of metadata relationships in each dataset. Default value: 100000000000.</p>
     * <blockquote>
     * <p>This parameter is reserved for future use and is not enforced.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    /**
     * <p>The maximum total file size in each dataset. After the limit is exceeded, no more indexes can be added. Unit: bytes. Default value: 90000000000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>90000000000000000</p>
     */
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    /**
     * <p>The project description. The description can be 1 to 256 characters in length. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The maximum number of datasets in the project. Valid values: 1 to 1000000000. Default value: 1000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000</p>
     */
    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    /**
     * <p>The project name. The naming rules are as follows:</p>
     * <ul>
     * <li><p>The name must be 1 to 128 characters in length.</p>
     * </li>
     * <li><p>The name can contain letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start with a letter or an underscore (_).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The service role that grants IMM permissions to access other Alibaba Cloud resources such as Object Storage Service (OSS). Default value: <code>AliyunIMMDefaultRole</code>.</p>
     * <p>To customize a service role, create a regular service role in the Resource Access Management (RAM) console and grant permissions to the role. For more information, see <a href="https://help.aliyun.com/document_detail/477258.html">Grant permissions to a role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunIMMDefaultRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <p>The workflow template ID. Default value: empty. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Official:ImageManagement</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectShrinkRequest self = new CreateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectShrinkRequest setDatasetConfigShrink(String datasetConfigShrink) {
        this.datasetConfigShrink = datasetConfigShrink;
        return this;
    }
    public String getDatasetConfigShrink() {
        return this.datasetConfigShrink;
    }

    public CreateProjectShrinkRequest setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public CreateProjectShrinkRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public CreateProjectShrinkRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public CreateProjectShrinkRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public CreateProjectShrinkRequest setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public CreateProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectShrinkRequest setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public CreateProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectShrinkRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateProjectShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public CreateProjectShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
