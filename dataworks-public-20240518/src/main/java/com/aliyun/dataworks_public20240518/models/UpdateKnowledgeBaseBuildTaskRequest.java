// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseBuildTaskRequest extends TeaModel {
    /**
     * <p>The content language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("ContentLocale")
    public String contentLocale;

    /**
     * <p>The new description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales metrics and policy documents</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input configuration that completely replaces the original input.</p>
     */
    @NameInMap("Input")
    public UpdateKnowledgeBaseBuildTaskRequestInput input;

    /**
     * <p>The associated knowledge base.</p>
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
     * <p>AUTO</p>
     */
    @NameInMap("LlmModel")
    public String llmModel;

    /**
     * <p>The new task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales Project Knowledge Building</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The workspace used for future runs.</p>
     * 
     * <strong>example:</strong>
     * <p>67890</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Updates the runtime resources based on the submitted fields. If ResourceGroupId or Cu is not provided, the original value is retained.</p>
     */
    @NameInMap("RuntimeResource")
    public UpdateKnowledgeBaseBuildTaskRequestRuntimeResource runtimeResource;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The trigger configuration that completely replaces the original trigger.</p>
     */
    @NameInMap("Trigger")
    public UpdateKnowledgeBaseBuildTaskRequestTrigger trigger;

    public static UpdateKnowledgeBaseBuildTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseBuildTaskRequest self = new UpdateKnowledgeBaseBuildTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseBuildTaskRequest setContentLocale(String contentLocale) {
        this.contentLocale = contentLocale;
        return this;
    }
    public String getContentLocale() {
        return this.contentLocale;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setInput(UpdateKnowledgeBaseBuildTaskRequestInput input) {
        this.input = input;
        return this;
    }
    public UpdateKnowledgeBaseBuildTaskRequestInput getInput() {
        return this.input;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setLlmModel(String llmModel) {
        this.llmModel = llmModel;
        return this;
    }
    public String getLlmModel() {
        return this.llmModel;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setRuntimeResource(UpdateKnowledgeBaseBuildTaskRequestRuntimeResource runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public UpdateKnowledgeBaseBuildTaskRequestRuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateKnowledgeBaseBuildTaskRequest setTrigger(UpdateKnowledgeBaseBuildTaskRequestTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public UpdateKnowledgeBaseBuildTaskRequestTrigger getTrigger() {
        return this.trigger;
    }

    public static class UpdateKnowledgeBaseBuildTaskRequestInputEntities extends TeaModel {
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

        public static UpdateKnowledgeBaseBuildTaskRequestInputEntities build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskRequestInputEntities self = new UpdateKnowledgeBaseBuildTaskRequestInputEntities();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskRequestInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateKnowledgeBaseBuildTaskRequestInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskRequestInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The list cannot be empty and must contain unique values.</p>
         */
        @NameInMap("Entities")
        public java.util.List<UpdateKnowledgeBaseBuildTaskRequestInputEntities> entities;

        /**
         * <p>Required when building from document objects in this knowledge base. The list cannot be empty and must contain unique values. Each item is a KnowledgeObjectId with Type=DOCUMENT in this knowledge base. Do not mix this with SourceIds for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The list cannot be empty and must contain unique values.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of registered sources in this knowledge base. The list must contain unique values. Whether this parameter is required and the allowed source types depend on the task input scenario. See the following table.</p>
         */
        @NameInMap("SourceIds")
        public java.util.List<String> sourceIds;

        /**
         * <p>The YAML upload session ID in this knowledge base used for SEMANTIC_MODEL import tasks. This ID is bound when the task is created and cannot be mixed with other input scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-yaml-001</p>
         */
        @NameInMap("YamlUploadId")
        public String yamlUploadId;

        public static UpdateKnowledgeBaseBuildTaskRequestInput build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskRequestInput self = new UpdateKnowledgeBaseBuildTaskRequestInput();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskRequestInput setEntities(java.util.List<UpdateKnowledgeBaseBuildTaskRequestInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<UpdateKnowledgeBaseBuildTaskRequestInputEntities> getEntities() {
            return this.entities;
        }

        public UpdateKnowledgeBaseBuildTaskRequestInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public UpdateKnowledgeBaseBuildTaskRequestInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public UpdateKnowledgeBaseBuildTaskRequestInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public UpdateKnowledgeBaseBuildTaskRequestInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskRequestRuntimeResource extends TeaModel {
        /**
         * <p>The compute specifications of the Builder. Valid values: 4 to 16. If this parameter is omitted during creation, the valid value is 4. The read operation returns the valid value.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The DataWorks resource group ID used by the actual Builder node. The server validates that it is available in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static UpdateKnowledgeBaseBuildTaskRequestRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskRequestRuntimeResource self = new UpdateKnowledgeBaseBuildTaskRequestRuntimeResource();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskRequestRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public UpdateKnowledgeBaseBuildTaskRequestRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskRequestTrigger extends TeaModel {
        /**
         * <p>The DataWorks scheduling cron expression. This parameter is provided only when Mode is set to PERIODIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>Specifies whether periodic automatic triggering is enabled. This parameter is provided only when Mode is set to PERIODIC. This parameter does not indicate the instance status.</p>
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

        public static UpdateKnowledgeBaseBuildTaskRequestTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskRequestTrigger self = new UpdateKnowledgeBaseBuildTaskRequestTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskRequestTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateKnowledgeBaseBuildTaskRequestTrigger setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateKnowledgeBaseBuildTaskRequestTrigger setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}
