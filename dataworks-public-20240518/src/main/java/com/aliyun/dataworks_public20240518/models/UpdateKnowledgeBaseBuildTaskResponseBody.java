// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseBuildTaskResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public UpdateKnowledgeBaseBuildTaskResponseBodyData data;

    /**
     * <p>The secure error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateKnowledgeBaseBuildTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseBuildTaskResponseBody self = new UpdateKnowledgeBaseBuildTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseBuildTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateKnowledgeBaseBuildTaskResponseBody setData(UpdateKnowledgeBaseBuildTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateKnowledgeBaseBuildTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateKnowledgeBaseBuildTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateKnowledgeBaseBuildTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKnowledgeBaseBuildTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities extends TeaModel {
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

        public static UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities self = new UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskResponseBodyDataInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The list cannot be empty and must contain unique values.</p>
         */
        @NameInMap("Entities")
        public java.util.List<UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities> entities;

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

        public static UpdateKnowledgeBaseBuildTaskResponseBodyDataInput build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskResponseBodyDataInput self = new UpdateKnowledgeBaseBuildTaskResponseBodyDataInput();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput setEntities(java.util.List<UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<UpdateKnowledgeBaseBuildTaskResponseBodyDataInputEntities> getEntities() {
            return this.entities;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource extends TeaModel {
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

        public static UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource self = new UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger extends TeaModel {
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

        public static UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger self = new UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateKnowledgeBaseBuildTaskResponseBodyData extends TeaModel {
        /**
         * <p>The content language of this task. This parameter is optional and is explicitly selected when the task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ContentLocale")
        public String contentLocale;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The task description. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input scope specified based on the task type.</p>
         */
        @NameInMap("Input")
        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput input;

        /**
         * <p>The associated knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The specific model ID or AUTO configured for tasks that require a model. If this parameter is omitted during creation, it is equivalent to AUTO. This parameter is not configured for tasks that do not call a model.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The time when the definition was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200300000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales Project Knowledge Building</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID where the task runs. This is different from the build asset scope specified by Input.ProjectIds.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The task runtime resource group and Builder compute specifications.</p>
         */
        @NameInMap("RuntimeResource")
        public UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource runtimeResource;

        /**
         * <p>The stable task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The manual or periodic trigger configuration.</p>
         */
        @NameInMap("Trigger")
        public UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger trigger;

        /**
         * <p>The task type. Valid values: PROJECT_SPACE_BUILD, SEMANTIC_GRAPH, DOCUMENT_GRAPH, DOCUMENT_SYNC, DOCUMENT_SYNC_AND_GRAPH, and SEMANTIC_MODEL. SEMANTIC_MODEL is used only for YAML import.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_SPACE_BUILD</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateKnowledgeBaseBuildTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateKnowledgeBaseBuildTaskResponseBodyData self = new UpdateKnowledgeBaseBuildTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setInput(UpdateKnowledgeBaseBuildTaskResponseBodyDataInput input) {
            this.input = input;
            return this;
        }
        public UpdateKnowledgeBaseBuildTaskResponseBodyDataInput getInput() {
            return this.input;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setRuntimeResource(UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public UpdateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setTrigger(UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public UpdateKnowledgeBaseBuildTaskResponseBodyDataTrigger getTrigger() {
            return this.trigger;
        }

        public UpdateKnowledgeBaseBuildTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
