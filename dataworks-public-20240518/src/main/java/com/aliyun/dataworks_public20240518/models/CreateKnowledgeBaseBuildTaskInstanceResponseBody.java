// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseBuildTaskInstanceResponseBody extends TeaModel {
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
    public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData data;

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

    public static CreateKnowledgeBaseBuildTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseBuildTaskInstanceResponseBody self = new CreateKnowledgeBaseBuildTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponseBody setData(CreateKnowledgeBaseBuildTaskInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeBaseBuildTaskInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute specifications. Valid values: 4 to 16. If this parameter is omitted during creation, the effective value is 4. The read operation returns the effective value.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The DataWorks resource group ID used by the actual Builder nodes. The server validates that this resource group is available in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot extends TeaModel {
        /**
         * <p>The content language used for this execution.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ContentLocale")
        public String contentLocale;

        /**
         * <p>The specific model ID actually used and frozen for this execution. AUTO is not returned. This parameter can be empty for tasks that do not call models, such as pure synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The DataWorks workspace ID used for this execution. This ID is frozen from the task definition when the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group and Builder CUs actually used for this execution.</p>
         */
        @NameInMap("RuntimeResource")
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setRuntimeResource(CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError extends TeaModel {
        /**
         * <p>The business error code, which is used to determine the error type when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The secure error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        @NameInMap("Message")
        public String message;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels extends TeaModel {
        /**
         * <p>The model ID generated by the semantic layer. You can use this ID as a KnowledgeObjectId to read the corresponding semantic model.</p>
         * 
         * <strong>example:</strong>
         * <p>01MODELULID</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The current version of the SEMANTIC_MODEL being read. Pass this value when updating content. The version can be edited in place.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as is and does not concatenate database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this parameter based on the Data Map identity. The presence of an enum value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as is and does not concatenate database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this parameter based on the Data Map identity. The presence of an enum value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("Entities")
        public java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities;

        /**
         * <p>The knowledge object IDs required when building from document objects in this knowledge base. The values must be non-empty and deduplicated. Each item is a KnowledgeObjectId with Type=DOCUMENT in this knowledge base. Do not mix these IDs with SourceIds for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of registered sources in this knowledge base. The values are deduplicated. Whether this parameter is required and the allowed source types depend on the task input scenario. Refer to the following table.</p>
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

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setEntities(java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> getEntities() {
            return this.entities;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot extends TeaModel {
        /**
         * <p>The number of external document sources selected for this execution. This parameter is not returned when it is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocumentSourceCount")
        public Long documentSourceCount;

        /**
         * <p>The actual Data Map entities resolved from the project, database, or schema scope for this execution. This parameter is not returned when it is not applicable.</p>
         */
        @NameInMap("ResolvedEntities")
        public java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities;

        /**
         * <p>The total number of resolved entities. An accurate count is returned even if the array is not returned due to its size.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("ResolvedEntityCount")
        public Long resolvedEntityCount;

        /**
         * <p>The snapshot of the selection conditions in the task definition when the instance is created. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("SelectedInput")
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setDocumentSourceCount(Long documentSourceCount) {
            this.documentSourceCount = documentSourceCount;
            return this;
        }
        public Long getDocumentSourceCount() {
            return this.documentSourceCount;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntities(java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities) {
            this.resolvedEntities = resolvedEntities;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> getResolvedEntities() {
            return this.resolvedEntities;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntityCount(Long resolvedEntityCount) {
            this.resolvedEntityCount = resolvedEntityCount;
            return this;
        }
        public Long getResolvedEntityCount() {
            return this.resolvedEntityCount;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setSelectedInput(CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput) {
            this.selectedInput = selectedInput;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput getSelectedInput() {
            return this.selectedInput;
        }

    }

    public static class CreateKnowledgeBaseBuildTaskInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The snapshot of the model, content language, and runtime resources for this execution. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("ConfigSnapshot")
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The current business stage. This parameter is returned when reliable records are available. For common build stages and semantic model import stages, refer to the domain model. This parameter does not replace the overall status.</p>
         * 
         * <strong>example:</strong>
         * <p>INITIALIZE</p>
         */
        @NameInMap("CurrentStage")
        public String currentStage;

        /**
         * <p>The error code and secure error message returned when the request fails.</p>
         */
        @NameInMap("Error")
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError error;

        /**
         * <p>The time when the execution finished. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200060000</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The confirmed ModelId and VersionNo for model imports only. For their structure, see GetKnowledgeBaseBuildTaskInstance.</p>
         */
        @NameInMap("GeneratedModels")
        public java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels;

        /**
         * <p>The non-sensitive input snapshot after selection and parsing for this execution. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("InputSnapshot")
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot;

        /**
         * <p>The knowledge base ID, which is used for scope validation and queries.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The time when the execution started. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200001000</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The overall status of this execution.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The source task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The ID of this execution.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("TaskInstanceId")
        public String taskInstanceId;

        /**
         * <p>The trigger type of this execution, such as manual, periodic, or supported events.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static CreateKnowledgeBaseBuildTaskInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseBuildTaskInstanceResponseBodyData self = new CreateKnowledgeBaseBuildTaskInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setConfigSnapshot(CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setError(CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataError getError() {
            return this.error;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setGeneratedModels(java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels) {
            this.generatedModels = generatedModels;
            return this;
        }
        public java.util.List<CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> getGeneratedModels() {
            return this.generatedModels;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setInputSnapshot(CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot) {
            this.inputSnapshot = inputSnapshot;
            return this;
        }
        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot getInputSnapshot() {
            return this.inputSnapshot;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public CreateKnowledgeBaseBuildTaskInstanceResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
