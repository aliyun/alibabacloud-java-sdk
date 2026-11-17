// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopKnowledgeBaseBuildTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The business error code, used to determine the error type when the request fails.</p>
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
    public StopKnowledgeBaseBuildTaskInstanceResponseBodyData data;

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

    public static StopKnowledgeBaseBuildTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopKnowledgeBaseBuildTaskInstanceResponseBody self = new StopKnowledgeBaseBuildTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopKnowledgeBaseBuildTaskInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopKnowledgeBaseBuildTaskInstanceResponseBody setData(StopKnowledgeBaseBuildTaskInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopKnowledgeBaseBuildTaskInstanceResponseBodyData getData() {
        return this.data;
    }

    public StopKnowledgeBaseBuildTaskInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopKnowledgeBaseBuildTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopKnowledgeBaseBuildTaskInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute specifications. Valid values: 4 to 16. If omitted during creation, the effective value is 4. The effective value is returned when queried.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The DataWorks resource group ID used by the actual Builder nodes. The server validates that it is available in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot extends TeaModel {
        /**
         * <p>The content language used for the current run.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ContentLocale")
        public String contentLocale;

        /**
         * <p>The specific model ID actually used and frozen for the current run. AUTO is not returned. This value can be empty for tasks that do not call models, such as pure synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The DataWorks workspace ID used for the current run. This value is frozen from the task definition when the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group and Builder CUs actually used for the current run.</p>
         */
        @NameInMap("RuntimeResource")
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setRuntimeResource(StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError extends TeaModel {
        /**
         * <p>The business error code, used to determine the error type when the request fails.</p>
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

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels extends TeaModel {
        /**
         * <p>The model ID generated by the semantic layer, which can be used as a KnowledgeObjectId to read the corresponding semantic model.</p>
         * 
         * <strong>example:</strong>
         * <p>01MODELULID</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The currently read version of the SEMANTIC_MODEL. Pass this value when updating content. The version can be edited in place.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this value as-is without concatenating database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this value based on the Data Map identity. The presence of an enumeration value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this value as-is without concatenating database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this value based on the Data Map identity. The presence of an enumeration value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("Entities")
        public java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities;

        /**
         * <p>Required, non-empty, and deduplicated when building from document objects in the current knowledge base. Each item is a KnowledgeObjectId with Type=DOCUMENT in the current knowledge base. This cannot be mixed with SourceIds for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of the registered sources in the current knowledge base. The values are deduplicated. Whether this parameter is required and the allowed source types depend on the task input scenario. For more information, see the following table.</p>
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

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setEntities(java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> getEntities() {
            return this.entities;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot extends TeaModel {
        /**
         * <p>The number of external document sources selected for the current run. Not returned when not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocumentSourceCount")
        public Long documentSourceCount;

        /**
         * <p>The actual Data Map entities resolved from the project, database, or schema scope for the current run. Not returned when not applicable.</p>
         */
        @NameInMap("ResolvedEntities")
        public java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities;

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
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setDocumentSourceCount(Long documentSourceCount) {
            this.documentSourceCount = documentSourceCount;
            return this;
        }
        public Long getDocumentSourceCount() {
            return this.documentSourceCount;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntities(java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities) {
            this.resolvedEntities = resolvedEntities;
            return this;
        }
        public java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> getResolvedEntities() {
            return this.resolvedEntities;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntityCount(Long resolvedEntityCount) {
            this.resolvedEntityCount = resolvedEntityCount;
            return this;
        }
        public Long getResolvedEntityCount() {
            return this.resolvedEntityCount;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setSelectedInput(StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput) {
            this.selectedInput = selectedInput;
            return this;
        }
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput getSelectedInput() {
            return this.selectedInput;
        }

    }

    public static class StopKnowledgeBaseBuildTaskInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The snapshot of the model, content language, and runtime resources for the current run. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("ConfigSnapshot")
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The current business stage. Returned when reliable records are available. For common build stages and semantic model import stages, refer to the domain model. This does not replace the overall status.</p>
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
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError error;

        /**
         * <p>The time when execution ended. This field is optional.</p>
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
        public java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels;

        /**
         * <p>The non-sensitive input snapshot after selection and resolution for the current run. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("InputSnapshot")
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot;

        /**
         * <p>The ID of the associated knowledge base, used for scope validation and queries.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The time when execution started. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200001000</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The overall status of the current execution.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
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
         * <p>The execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("TaskInstanceId")
        public String taskInstanceId;

        /**
         * <p>The trigger type of the current run, which can be manual, periodic, or a supported event.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static StopKnowledgeBaseBuildTaskInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopKnowledgeBaseBuildTaskInstanceResponseBodyData self = new StopKnowledgeBaseBuildTaskInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setConfigSnapshot(StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setError(StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataError getError() {
            return this.error;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setGeneratedModels(java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels) {
            this.generatedModels = generatedModels;
            return this;
        }
        public java.util.List<StopKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> getGeneratedModels() {
            return this.generatedModels;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setInputSnapshot(StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot) {
            this.inputSnapshot = inputSnapshot;
            return this;
        }
        public StopKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot getInputSnapshot() {
            return this.inputSnapshot;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public StopKnowledgeBaseBuildTaskInstanceResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
