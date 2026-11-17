// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetryKnowledgeBaseBuildTaskInstanceResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when a request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned upon a successful request.</p>
     */
    @NameInMap("Data")
    public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData data;

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

    public static RetryKnowledgeBaseBuildTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryKnowledgeBaseBuildTaskInstanceResponseBody self = new RetryKnowledgeBaseBuildTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponseBody setData(RetryKnowledgeBaseBuildTaskInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData getData() {
        return this.data;
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryKnowledgeBaseBuildTaskInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute capacity. Valid values: 4 to 16. If this parameter is omitted during creation, the default value is 4. The read operation returns the effective value.</p>
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

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot extends TeaModel {
        /**
         * <p>The content language used for the current execution.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ContentLocale")
        public String contentLocale;

        /**
         * <p>The specific model ID actually used and frozen for the current execution. The value AUTO is not returned. This field can be empty for tasks that do not call models, such as pure synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The DataWorks workspace ID used for the current execution. This ID is frozen from the task definition when the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group and Builder CUs actually used for the current execution.</p>
         */
        @NameInMap("RuntimeResource")
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource;

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot setRuntimeResource(RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshotRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError extends TeaModel {
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

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels extends TeaModel {
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

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as-is without concatenating database, schema, or table identifiers.</p>
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

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as-is without concatenating database, schema, or table identifiers.</p>
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

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("Entities")
        public java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities;

        /**
         * <p>Required, non-empty, and deduplicated when building from document objects in the knowledge base. Each item is a KnowledgeObjectId with Type=DOCUMENT in the knowledge base. Do not mix this field with SourceIds for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The values are non-empty and deduplicated.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of the registered sources in the knowledge base. The values are deduplicated. Whether this field is required and the allowed source types are determined by the task input scenario. Refer to the following table for details.</p>
         */
        @NameInMap("SourceIds")
        public java.util.List<String> sourceIds;

        /**
         * <p>The YAML upload session ID in the knowledge base used for SEMANTIC_MODEL import tasks. This ID is bound when the task is created and cannot be mixed with other input scopes.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-yaml-001</p>
         */
        @NameInMap("YamlUploadId")
        public String yamlUploadId;

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setEntities(java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInputEntities> getEntities() {
            return this.entities;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot extends TeaModel {
        /**
         * <p>The number of external document sources selected for the current execution. This field is not returned when it is not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocumentSourceCount")
        public Long documentSourceCount;

        /**
         * <p>The actual Data Map entities resolved from the project, database, or schema scope for the current execution. This field is not returned when it is not applicable.</p>
         */
        @NameInMap("ResolvedEntities")
        public java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities;

        /**
         * <p>The total number of resolved entities. An accurate count is returned even when the array is not returned due to its size.</p>
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
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput;

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setDocumentSourceCount(Long documentSourceCount) {
            this.documentSourceCount = documentSourceCount;
            return this;
        }
        public Long getDocumentSourceCount() {
            return this.documentSourceCount;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntities(java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> resolvedEntities) {
            this.resolvedEntities = resolvedEntities;
            return this;
        }
        public java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotResolvedEntities> getResolvedEntities() {
            return this.resolvedEntities;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setResolvedEntityCount(Long resolvedEntityCount) {
            this.resolvedEntityCount = resolvedEntityCount;
            return this;
        }
        public Long getResolvedEntityCount() {
            return this.resolvedEntityCount;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot setSelectedInput(RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput selectedInput) {
            this.selectedInput = selectedInput;
            return this;
        }
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshotSelectedInput getSelectedInput() {
            return this.selectedInput;
        }

    }

    public static class RetryKnowledgeBaseBuildTaskInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The snapshot of the model, content language, and runtime resources for the current execution. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("ConfigSnapshot")
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot;

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
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError error;

        /**
         * <p>The time when the execution finished. This field is optional.</p>
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
        public java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels;

        /**
         * <p>The non-sensitive input snapshot after selection and parsing for the current execution. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("InputSnapshot")
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot;

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
         * <p>The overall status of the current execution.</p>
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
         * <p>The ID of the current execution.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("TaskInstanceId")
        public String taskInstanceId;

        /**
         * <p>The trigger type of the current execution, which can be manual, periodic, or a supported event.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static RetryKnowledgeBaseBuildTaskInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryKnowledgeBaseBuildTaskInstanceResponseBodyData self = new RetryKnowledgeBaseBuildTaskInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setConfigSnapshot(RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setError(RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataError getError() {
            return this.error;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setGeneratedModels(java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> generatedModels) {
            this.generatedModels = generatedModels;
            return this;
        }
        public java.util.List<RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataGeneratedModels> getGeneratedModels() {
            return this.generatedModels;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setInputSnapshot(RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot inputSnapshot) {
            this.inputSnapshot = inputSnapshot;
            return this;
        }
        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyDataInputSnapshot getInputSnapshot() {
            return this.inputSnapshot;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public RetryKnowledgeBaseBuildTaskInstanceResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
