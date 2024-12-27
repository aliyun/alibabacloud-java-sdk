// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
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
     * <p> This is a precautionary setting that does not impose practical limitations.</p>
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
     * <p> This is a precautionary setting that does not impose practical limitations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100000000000</p>
     */
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    /**
     * <p>The maximum size of files in each dataset. If the maximum size is exceeded, no indexes can be added. Unit: bytes. Default value: 90000000000000000.</p>
     * 
     * <strong>example:</strong>
     * <p>90000000000000000</p>
     */
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    /**
     * <p>The description of the project. The description must be 1 to 256 characters in length. You can leave this parameter empty.</p>
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
     * <p>The name of the project. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 1 to 128 characters in length</li>
     * <li>and can contain only letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start with a letter or an underscores (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the Resource Access Management (RAM) role. You must attach the RAM role to IMM to allow IMM to access other cloud resources, such as Object Storage Service (OSS). Default value: <code>AliyunIMMDefaultRole</code>.</p>
     * <p>You can also create a custom role in the RAM console and grant the required permissions to the role based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/477257.html">Grant permissions to a RAM user</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunIMMDefaultRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateProjectRequestTag> tag;

    /**
     * <p>The ID of the workflow template. You can leave this parameter empty. For more information, see <a href="https://help.aliyun.com/document_detail/466304.html">Workflow templates and operators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Official:AllFunction</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public CreateProjectRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public CreateProjectRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
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

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateProjectRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateProjectRequest setTag(java.util.List<CreateProjectRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateProjectRequestTag> getTag() {
        return this.tag;
    }

    public CreateProjectRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class CreateProjectRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateProjectRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTag self = new CreateProjectRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateProjectRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
