// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskResponseBody extends TeaModel {
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
    public CreateKnowledgeBaseBuildTaskResponseBodyData data;

    /**
     * <p>The secure error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
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

    public static CreateKnowledgeBaseBuildTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskResponseBody self = new CreateKnowledgeBaseBuildTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBaseBuildTaskResponseBody setData(CreateKnowledgeBaseBuildTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateKnowledgeBaseBuildTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBaseBuildTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeBaseBuildTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities extends TeaModel {
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

        public static CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities self = new CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskResponseBodyDataInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The list cannot be empty and must contain unique values.</p>
         */
        @NameInMap("Entities")
        public java.util.List<CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities> entities;

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

        public static CreateKnowledgeBaseBuildTaskResponseBodyDataInput build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskResponseBodyDataInput self = new CreateKnowledgeBaseBuildTaskResponseBodyDataInput();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput setEntities(java.util.List<CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseBuildTaskResponseBodyDataInputEntities> getEntities() {
            return this.entities;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource extends TeaModel {
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

        public static CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource self = new CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger extends TeaModel {
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

        public static CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger self = new CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskResponseBodyData extends TeaModel {
        /**
         * <p>The language of the content for this task. This parameter is optional and is explicitly selected when the task is created.</p>
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
         * <p>The description of the task. This parameter is optional.</p>
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
        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput input;

        /**
         * <p>The ID of the knowledge base to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The specific model ID or AUTO for tasks that require a model. If this parameter is omitted during creation, it is equivalent to AUTO. This parameter is not configured for tasks that do not call a model.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
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
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Project space knowledge building</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the DataWorks workspace where the task runs. This is different from the build asset scope specified by Input.ProjectIds.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group and Builder compute specifications for running the task.</p>
         */
        @NameInMap("RuntimeResource")
        public CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource runtimeResource;

        /**
         * <p>The stable ID of the task.</p>
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
        public CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger trigger;

        /**
         * <p>The task type. Valid values: PROJECT_SPACE_BUILD, SEMANTIC_GRAPH, DOCUMENT_GRAPH, DOCUMENT_SYNC, DOCUMENT_SYNC_AND_GRAPH, and SEMANTIC_MODEL. SEMANTIC_MODEL is used only for YAML imports.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_SPACE_BUILD</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateKnowledgeBaseBuildTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskResponseBodyData self = new CreateKnowledgeBaseBuildTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setInput(CreateKnowledgeBaseBuildTaskResponseBodyDataInput input) {
            this.input = input;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskResponseBodyDataInput getInput() {
            return this.input;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setRuntimeResource(CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskResponseBodyDataRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setTrigger(CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskResponseBodyDataTrigger getTrigger() {
            return this.trigger;
        }

        public CreateKnowledgeBaseBuildTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
