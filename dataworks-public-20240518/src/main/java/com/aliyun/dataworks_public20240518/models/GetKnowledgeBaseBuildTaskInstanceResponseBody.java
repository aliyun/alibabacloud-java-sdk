// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseBuildTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when a request fails.</p>
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
    public GetKnowledgeBaseBuildTaskInstanceResponseBodyData data;

    /**
     * <p>The secure error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
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

    public static GetKnowledgeBaseBuildTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseBuildTaskInstanceResponseBody self = new GetKnowledgeBaseBuildTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseBuildTaskInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeBaseBuildTaskInstanceResponseBody setData(GetKnowledgeBaseBuildTaskInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKnowledgeBaseBuildTaskInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetKnowledgeBaseBuildTaskInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeBaseBuildTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseBuildTaskInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute specifications. Valid values: 4 to 16. If this field is omitted during creation, the valid value is 4. The read operation returns the valid value.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The DataWorks resource group ID used by the actual Builder nodes. The server verifies that this resource group is available in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot extends TeaModel {
        /**
         * <p>The content language used for the current run.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ContentLocale")
        public String contentLocale;

        /**
         * <p>The specific model ID actually used and frozen for the current run. The value AUTO is not returned. This field can be empty for tasks that do not call models, such as pure synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The DataWorks workspace ID used for the current run. This ID is frozen from the task definition when the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group and Builder compute units (CUs) actually used for the current run.</p>
         */
        @NameInMap("RuntimeResource")
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setRuntimeResource(GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError extends TeaModel {
        /**
         * <p>The business error code. You can use this code to determine the error type when a request fails.</p>
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

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels extends TeaModel {
        /**
         * <p>The stable model ID in the semantic layer, which can be used as a KnowledgeObjectId.</p>
         * 
         * <strong>example:</strong>
         * <p>01MODELULID</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The materialization version for the current run. The same version can be edited later and does not represent an immutable file snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as is and does not concatenate database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this field based on the Data Map identity. The presence of an enumeration value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as is and does not concatenate database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this field based on the Data Map identity. The presence of an enumeration value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("Entities")
        public java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities;

        /**
         * <p>The knowledge object IDs required when building from document objects in the current knowledge base. The values must be non-empty and deduplicated. Each item is a KnowledgeObjectId with Type=DOCUMENT in the current knowledge base. Do not mix these IDs with the SourceIds used for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of the registered sources in the current knowledge base. The values are deduplicated. Whether this field is required and the allowed source types depend on the task input scenario. Refer to the following table.</p>
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

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setEntities(java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> getEntities() {
            return this.entities;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot extends TeaModel {
        /**
         * <p>The number of external document sources selected for the current run. This field is not returned when it is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocumentSourceCount")
        public Long documentSourceCount;

        /**
         * <p>The relative file paths within the knowledge base processed for the current page upload build. These paths are from the frozen upload list of the instance. OSS addresses or verification information is not returned, and the current task or file list is not re-read.</p>
         */
        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        /**
         * <p>The actual Data Map entities resolved from the project, database, or schema scope for the current run. This field is not returned when it is not applicable.</p>
         */
        @NameInMap("ResolvedEntities")
        public java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities;

        /**
         * <p>The total number of resolved entities. An accurate count is returned even if the array is not returned due to its size.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("ResolvedEntityCount")
        public Long resolvedEntityCount;

        /**
         * <p>The snapshot of the selection conditions in the task definition when the instance is created. This snapshot does not change when the task is updated. This field is omitted for page upload builds that do not have fixed object selections.</p>
         */
        @NameInMap("SelectedInput")
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setDocumentSourceCount(Long documentSourceCount) {
            this.documentSourceCount = documentSourceCount;
            return this;
        }
        public Long getDocumentSourceCount() {
            return this.documentSourceCount;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setFilePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            return this;
        }
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntities(java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities) {
            this.resolvedEntities = resolvedEntities;
            return this;
        }
        public java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> getResolvedEntities() {
            return this.resolvedEntities;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntityCount(Long resolvedEntityCount) {
            this.resolvedEntityCount = resolvedEntityCount;
            return this;
        }
        public Long getResolvedEntityCount() {
            return this.resolvedEntityCount;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setSelectedInput(GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput) {
            this.selectedInput = selectedInput;
            return this;
        }
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput getSelectedInput() {
            return this.selectedInput;
        }

    }

    public static class GetKnowledgeBaseBuildTaskInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The snapshot of the model, content language, and runtime resources for the current run. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("ConfigSnapshot")
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The current business stage. This field is returned when reliable records are available. For common build stages and semantic model import stages, refer to the domain model. This field does not replace the overall status.</p>
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
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError error;

        /**
         * <p>The time when the execution finished. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200060000</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The confirmed materialization results of the semantic model import instance. For the structures of ModelId and VersionNo, refer to the YAML import results section.</p>
         */
        @NameInMap("GeneratedModels")
        public java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels;

        /**
         * <p>The non-sensitive input snapshot after selection and parsing for the current run. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("InputSnapshot")
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot;

        /**
         * <p>The ID of the associated knowledge base, which facilitates scope validation and queries.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The time when the execution started. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200001000</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The overall status. Valid values: PENDING, RUNNING, SUCCEEDED, FAILED, and STOPPED. The STOPPED status includes instances that are manually stopped or terminated because they are replaced by subsequent builds. The system no longer waits for these instances to succeed.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the source task.</p>
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
         * <p>The trigger type of the current run, such as manual, periodic, or a supported event.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static GetKnowledgeBaseBuildTaskInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseBuildTaskInstanceResponseBodyData self = new GetKnowledgeBaseBuildTaskInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setConfigSnapshot(GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setError(GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataError getError() {
            return this.error;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setGeneratedModels(java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels) {
            this.generatedModels = generatedModels;
            return this;
        }
        public java.util.List<GetKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> getGeneratedModels() {
            return this.generatedModels;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setInputSnapshot(GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot) {
            this.inputSnapshot = inputSnapshot;
            return this;
        }
        public GetKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot getInputSnapshot() {
            return this.inputSnapshot;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public GetKnowledgeBaseBuildTaskInstanceResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
