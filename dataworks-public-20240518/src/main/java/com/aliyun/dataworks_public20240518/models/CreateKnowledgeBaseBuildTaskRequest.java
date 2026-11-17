// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskRequest extends TeaModel {
    /**
     * <p>The idempotency token for the creation request.</p>
     * 
     * <strong>example:</strong>
     * <p>task-create-001</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the content.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ContentLocale")
    public String contentLocale;

    /**
     * <p>The description of the task. The description can be up to 1,024 characters in length. If this parameter is omitted, no description is set.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies the input scope by selecting projects, entities, sources, or files based on the type.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public CreateKnowledgeBaseBuildTaskRequestInput input;

    /**
     * <p>The ID of the knowledge base to which the task belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The specific model ID or AUTO.</p>
     * 
     * <strong>example:</strong>
     * <p>model-001</p>
     */
    @NameInMap("LlmModel")
    public String llmModel;

    /**
     * <p>The name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Project space knowledge building</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the workspace where the task runs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67890</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group and Builder compute units (CUs).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeResource")
    public CreateKnowledgeBaseBuildTaskRequestRuntimeResource runtimeResource;

    /**
     * <p>The manual or periodic trigger configuration.</p>
     */
    @NameInMap("Trigger")
    public CreateKnowledgeBaseBuildTaskRequestTrigger trigger;

    /**
     * <p>The available build types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_SPACE_BUILD</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateKnowledgeBaseBuildTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskRequest self = new CreateKnowledgeBaseBuildTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateKnowledgeBaseBuildTaskRequest setContentLocale(String contentLocale) {
        this.contentLocale = contentLocale;
        return this;
    }
    public String getContentLocale() {
        return this.contentLocale;
    }

    public CreateKnowledgeBaseBuildTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseBuildTaskRequest setInput(CreateKnowledgeBaseBuildTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskRequestInput getInput() {
        return this.input;
    }

    public CreateKnowledgeBaseBuildTaskRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public CreateKnowledgeBaseBuildTaskRequest setLlmModel(String llmModel) {
        this.llmModel = llmModel;
        return this;
    }
    public String getLlmModel() {
        return this.llmModel;
    }

    public CreateKnowledgeBaseBuildTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseBuildTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateKnowledgeBaseBuildTaskRequest setRuntimeResource(CreateKnowledgeBaseBuildTaskRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public CreateKnowledgeBaseBuildTaskRequest setTrigger(CreateKnowledgeBaseBuildTaskRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskRequestTrigger getTrigger() {
        return this.trigger;
    }

    public CreateKnowledgeBaseBuildTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateKnowledgeBaseBuildTaskRequestInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client must pass this value as is and must not concatenate database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this value based on the Data Map identity. The presence of an enum value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static CreateKnowledgeBaseBuildTaskRequestInputEntities build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskRequestInputEntities self = new CreateKnowledgeBaseBuildTaskRequestInputEntities();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskRequestInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateKnowledgeBaseBuildTaskRequestInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskRequestInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The list cannot be empty and must contain unique values.</p>
         */
        @NameInMap("Entities")
        public java.util.List<CreateKnowledgeBaseBuildTaskRequestInputEntities> entities;

        /**
         * <p>Required when building from document objects in the current knowledge base. The list cannot be empty and must contain unique values. Each item is the KnowledgeObjectId of a DOCUMENT type object in the current knowledge base. This parameter cannot be mixed with SourceIds for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The IDs of the DataWorks workspaces selected for workspace-scoped builds. The list cannot be empty and must contain unique values.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of the registered sources in the current knowledge base. The list must contain unique values. Whether this parameter is required and the allowed source types depend on the task input scenario. For more information, see the following table.</p>
         */
        @NameInMap("SourceIds")
        public java.util.List<String> sourceIds;

        /**
         * <p>The YAML upload session ID in the current knowledge base used for SEMANTIC_MODEL import tasks. This ID is bound when the task is created and cannot be mixed with other input scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-yaml-001</p>
         */
        @NameInMap("YamlUploadId")
        public String yamlUploadId;

        public static CreateKnowledgeBaseBuildTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskRequestInput self = new CreateKnowledgeBaseBuildTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskRequestInput setEntities(java.util.List<CreateKnowledgeBaseBuildTaskRequestInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseBuildTaskRequestInputEntities> getEntities() {
            return this.entities;
        }

        public CreateKnowledgeBaseBuildTaskRequestInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public CreateKnowledgeBaseBuildTaskRequestInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public CreateKnowledgeBaseBuildTaskRequestInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public CreateKnowledgeBaseBuildTaskRequestInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskRequestRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute specifications. Valid values: 4 to 16. If this parameter is omitted during creation, the default value is 4. The actual valid value is returned in read operations.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The ID of the DataWorks resource group used by the actual Builder nodes. The server validates that the resource group is available in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static CreateKnowledgeBaseBuildTaskRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskRequestRuntimeResource self = new CreateKnowledgeBaseBuildTaskRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskRequestRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateKnowledgeBaseBuildTaskRequestRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskRequestTrigger extends TeaModel {
        /**
         * <p>The DataWorks scheduling cron expression. This parameter is provided only when the mode is set to PERIODIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>Specifies whether to enable or disable automatic periodic triggering. This parameter is provided only when the mode is set to PERIODIC and does not indicate the instance status.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The trigger mode. Valid values: MANUAL and PERIODIC. Manual tasks do not create instances automatically.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static CreateKnowledgeBaseBuildTaskRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskRequestTrigger self = new CreateKnowledgeBaseBuildTaskRequestTrigger();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskRequestTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateKnowledgeBaseBuildTaskRequestTrigger setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateKnowledgeBaseBuildTaskRequestTrigger setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}
