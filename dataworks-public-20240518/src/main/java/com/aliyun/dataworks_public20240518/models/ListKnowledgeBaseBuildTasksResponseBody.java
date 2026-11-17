// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseBuildTasksResponseBody extends TeaModel {
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
    public ListKnowledgeBaseBuildTasksResponseBodyData data;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The error message returned when the request fails.</p>
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

    public static ListKnowledgeBaseBuildTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseBuildTasksResponseBody self = new ListKnowledgeBaseBuildTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseBuildTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBaseBuildTasksResponseBody setData(ListKnowledgeBaseBuildTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBaseBuildTasksResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeBaseBuildTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBaseBuildTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBaseBuildTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseBuildTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities extends TeaModel {
        /**
         * <p>The metadata entity ID returned by Data Map. The client passes this ID as is and does not concatenate database, schema, or table identifiers.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:::project_name:schema_name:table_name</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity level, such as DATABASE, SCHEMA, or TABLE. The server verifies this against Data Map identities. The presence of an enum value does not guarantee that all engines support it.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities self = new ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput extends TeaModel {
        /**
         * <p>The Data Map entities such as databases, schemas, and tables selected for data asset-scoped builds. The values must be non-empty and deduplicated.</p>
         */
        @NameInMap("Entities")
        public java.util.List<ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities> entities;

        /**
         * <p>The IDs of the knowledge objects. This field is required, non-empty, and deduplicated when building from document objects in the knowledge base. Each item is a KnowledgeObjectId with Type=DOCUMENT in the knowledge base. Do not mix this field with SourceIds for external connector synchronization scopes.</p>
         */
        @NameInMap("KnowledgeObjectIds")
        public java.util.List<String> knowledgeObjectIds;

        /**
         * <p>The IDs of the DataWorks workspaces selected for workspace-scoped builds. The values must be non-empty and deduplicated.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The IDs of the registered sources in the knowledge base. The values are deduplicated. Whether this field is required and the allowed source types depend on the task input scenario. For more information, see the following table.</p>
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

        public static ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput self = new ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput setEntities(java.util.List<ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<ListKnowledgeBaseBuildTasksResponseBodyDataTasksInputEntities> getEntities() {
            return this.entities;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput setKnowledgeObjectIds(java.util.List<String> knowledgeObjectIds) {
            this.knowledgeObjectIds = knowledgeObjectIds;
            return this;
        }
        public java.util.List<String> getKnowledgeObjectIds() {
            return this.knowledgeObjectIds;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput setSourceIds(java.util.List<String> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }
        public java.util.List<String> getSourceIds() {
            return this.sourceIds;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput setYamlUploadId(String yamlUploadId) {
            this.yamlUploadId = yamlUploadId;
            return this;
        }
        public String getYamlUploadId() {
            return this.yamlUploadId;
        }

    }

    public static class ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource extends TeaModel {
        /**
         * <p>The Builder compute specifications. Valid values: 4 to 16. If this parameter is omitted during creation, the default value 4 is used. The actual value is returned when reading.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The ID of the DataWorks resource group used by the actual Builder nodes. The server verifies that the resource group is available in the workspace corresponding to the top-level ProjectId of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-001</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource self = new ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger extends TeaModel {
        /**
         * <p>The DataWorks scheduling cron expression. This field is provided only when the trigger mode is PERIODIC.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>Specifies whether periodic automatic triggering is enabled. This field is provided only when the trigger mode is PERIODIC and does not indicate the instance status.</p>
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

        public static ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger self = new ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class ListKnowledgeBaseBuildTasksResponseBodyDataTasks extends TeaModel {
        /**
         * <p>The content language of the task. This field is optional and is explicitly selected when the task is created.</p>
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
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the task. This field is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and policy documents</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The typed input scope selected for the task. System-managed upload build tasks do not have fixed inputs, and this field is omitted when reading.</p>
         */
        @NameInMap("Input")
        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput input;

        /**
         * <p>The knowledge base to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The model configured for tasks that require a model. You can specify a model ID or set this parameter to AUTO. If this parameter is omitted during creation, the default value AUTO is used. Do not configure this parameter for tasks that do not call a model.</p>
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
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Project workspace knowledge build</p>
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
        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource runtimeResource;

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
        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger trigger;

        /**
         * <p>The task type. Valid values: PROJECT_SPACE_BUILD, SEMANTIC_GRAPH, DOCUMENT_GRAPH, DOCUMENT_SYNC, DOCUMENT_SYNC_AND_GRAPH, and SEMANTIC_MODEL. The SEMANTIC_MODEL value is used only for YAML import.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_SPACE_BUILD</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListKnowledgeBaseBuildTasksResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTasksResponseBodyDataTasks self = new ListKnowledgeBaseBuildTasksResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setContentLocale(String contentLocale) {
            this.contentLocale = contentLocale;
            return this;
        }
        public String getContentLocale() {
            return this.contentLocale;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setInput(ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput input) {
            this.input = input;
            return this;
        }
        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksInput getInput() {
            return this.input;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setLlmModel(String llmModel) {
            this.llmModel = llmModel;
            return this;
        }
        public String getLlmModel() {
            return this.llmModel;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setRuntimeResource(ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setTrigger(ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListKnowledgeBaseBuildTasksResponseBodyDataTasksTrigger getTrigger() {
            return this.trigger;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyDataTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListKnowledgeBaseBuildTasksResponseBodyData extends TeaModel {
        /**
         * <p>The cursor for the next page. If there is no next page, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The knowledge objects that you have permission to read on the current page.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<ListKnowledgeBaseBuildTasksResponseBodyDataTasks> tasks;

        public static ListKnowledgeBaseBuildTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseBuildTasksResponseBodyData self = new ListKnowledgeBaseBuildTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseBuildTasksResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListKnowledgeBaseBuildTasksResponseBodyData setTasks(java.util.List<ListKnowledgeBaseBuildTasksResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListKnowledgeBaseBuildTasksResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
