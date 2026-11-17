// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseBuildTaskInstancesResponseBody extends TeaModel {
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
    public ListKnowledgeBaseBuildTaskInstancesResponseBodyData data;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

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

    public static ListKnowledgeBaseBuildTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseBuildTaskInstancesResponseBody self = new ListKnowledgeBaseBuildTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseBuildTaskInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponseBody setData(ListKnowledgeBaseBuildTaskInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBaseBuildTaskInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseBuildTaskInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute specifications. Valid values: 4 to 16. If omitted during creation, the default value is 4. The read operation returns the effective value.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The DataWorks resource group ID used by the actual Builder nodes. The server verifies its availability in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot extends TeaModel {
        /**
         * <p>The content language used for the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("ContentLocale")
        public String contentLocale;

        /**
         * <p>The specific model ID actually used and frozen for the execution. AUTO is not returned. This field can be empty for tasks that do not call models, such as pure synchronization tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>model-001</p>
         */
        @NameInMap("LlmModel")
        public String llmModel;

        /**
         * <p>The DataWorks workspace ID used for the execution, frozen from the task definition when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>67890</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource group and Builder CUs actually used for the execution.</p>
         */
        @NameInMap("RuntimeResource")
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource runtimeResource;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot setRuntimeResource(ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshotRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError extends TeaModel {
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

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels extends TeaModel {
        /**
         * <p>The model ID generated by the semantic layer. You can use it as a KnowledgeObjectId to read the corresponding semantic model.</p>
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

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client must pass this ID as is without concatenating database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this based on Data Map identities. The presence of an enum value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client must pass this ID as is without concatenating database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server validates this based on Data Map identities. The presence of an enum value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput extends TeaModel {
        /**
         * <p>The Data Map entities, such as databases, schemas, and tables, selected for data asset-scoped builds. The list is non-empty and deduplicated.</p>
         */
        @NameInMap("Entities")
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities> entities;

        /**
         * <p>Required, non-empty, and deduplicated when building from document objects in the knowledge base. Each item is a KnowledgeObjectId with Type=DOCUMENT in the knowledge base. This field cannot be mixed with SourceIds used for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The DataWorks workspace IDs selected for workspace-scoped builds. The list is non-empty and deduplicated.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of the registered sources in the knowledge base. The list is deduplicated. Whether this field is required and the allowed source types depend on the task input scenario. Refer to the following table.</p>
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

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput setEntities(java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInputEntities> getEntities() {
            return this.entities;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot extends TeaModel {
        /**
         * <p>The number of external document sources selected for the execution. This field is not returned when not applicable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DocumentSourceCount")
        public Long documentSourceCount;

        /**
         * <p>The relative file paths in the knowledge base processed for page upload builds in the execution. These paths are from the frozen upload list of the instance. OSS addresses or verification information are not returned, and the current task or file list is not re-read.</p>
         */
        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        /**
         * <p>The actual Data Map entities resolved from the project, database, or schema scope for the execution. This field is not returned when not applicable.</p>
         */
        @NameInMap("ResolvedEntities")
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities> resolvedEntities;

        /**
         * <p>The total number of resolved entities. An accurate count is returned even if the array is omitted due to its size.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("ResolvedEntityCount")
        public Long resolvedEntityCount;

        /**
         * <p>The snapshot of the selection conditions in the task definition when the instance was created. This snapshot does not change when the task is updated. This field is omitted if no fixed object is selected for page upload builds.</p>
         */
        @NameInMap("SelectedInput")
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput selectedInput;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot setDocumentSourceCount(Long documentSourceCount) {
            this.documentSourceCount = documentSourceCount;
            return this;
        }
        public Long getDocumentSourceCount() {
            return this.documentSourceCount;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot setFilePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            return this;
        }
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot setResolvedEntities(java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities> resolvedEntities) {
            this.resolvedEntities = resolvedEntities;
            return this;
        }
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotResolvedEntities> getResolvedEntities() {
            return this.resolvedEntities;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot setResolvedEntityCount(Long resolvedEntityCount) {
            this.resolvedEntityCount = resolvedEntityCount;
            return this;
        }
        public Long getResolvedEntityCount() {
            return this.resolvedEntityCount;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot setSelectedInput(ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput selectedInput) {
            this.selectedInput = selectedInput;
            return this;
        }
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshotSelectedInput getSelectedInput() {
            return this.selectedInput;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The snapshot of the model, content language, and runtime resources for the execution. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("ConfigSnapshot")
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot configSnapshot;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The current business stage, returned when reliable records are available. For standard build stages and semantic model import stages, refer to the domain model. This field does not replace the overall status.</p>
         * 
         * <strong>example:</strong>
         * <p>INITIALIZE</p>
         */
        @NameInMap("CurrentStage")
        public String currentStage;

        /**
         * <p>The error code and secure error message returned when the execution fails.</p>
         */
        @NameInMap("Error")
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError error;

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
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels> generatedModels;

        /**
         * <p>The non-sensitive input snapshot after selection and parsing for the execution. This snapshot does not change when the task is updated.</p>
         */
        @NameInMap("InputSnapshot")
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot inputSnapshot;

        /**
         * <p>The ID of the knowledge base to which the instance belongs. Use it for scope validation and queries.</p>
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
         * <p>The overall status of the execution.</p>
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
         * <p>The task instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        @NameInMap("TaskInstanceId")
        public String taskInstanceId;

        /**
         * <p>The trigger type of the execution, which can be manual, periodic, or a supported event.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setConfigSnapshot(ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesConfigSnapshot getConfigSnapshot() {
            return this.configSnapshot;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setError(ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError error) {
            this.error = error;
            return this;
        }
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesError getError() {
            return this.error;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setGeneratedModels(java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels> generatedModels) {
            this.generatedModels = generatedModels;
            return this;
        }
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesGeneratedModels> getGeneratedModels() {
            return this.generatedModels;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setInputSnapshot(ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot inputSnapshot) {
            this.inputSnapshot = inputSnapshot;
            return this;
        }
        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstancesInputSnapshot getInputSnapshot() {
            return this.inputSnapshot;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setTaskInstanceId(String taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public String getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

    public static class ListKnowledgeBaseBuildTaskInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The knowledge objects that you have permissions to read on the current page.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The pagination token for the next page. This field is null if there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListKnowledgeBaseBuildTaskInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTaskInstancesResponseBodyData self = new ListKnowledgeBaseBuildTaskInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyData setInstances(java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListKnowledgeBaseBuildTaskInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public ListKnowledgeBaseBuildTaskInstancesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
