// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the workflow instance.</p>
     */
    @NameInMap("WorkflowInstance")
    public GetWorkflowInstanceResponseBodyWorkflowInstance workflowInstance;

    public static GetWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponseBody self = new GetWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowInstanceResponseBody setWorkflowInstance(GetWorkflowInstanceResponseBodyWorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
        return this;
    }
    public GetWorkflowInstanceResponseBodyWorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

    public static class GetWorkflowInstanceResponseBodyWorkflowInstanceTags extends TeaModel {
        /**
         * <p>The key of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetWorkflowInstanceResponseBodyWorkflowInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyWorkflowInstanceTags self = new GetWorkflowInstanceResponseBodyWorkflowInstanceTags();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstanceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetWorkflowInstanceResponseBodyWorkflowInstance extends TeaModel {
        /**
         * <p>The data timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod</li>
         * <li>Dev</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the instance finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The ID of the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkInstance1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The account ID of the workflow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The time when the instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The status of the workflow instance. Valid values:</p>
         * <ul>
         * <li>NotRun: The instance is not run.</li>
         * <li>Running: The instance is running.</li>
         * <li>WaitTime: The instance is waiting for the scheduling time to arrive.</li>
         * <li>CheckingCondition: Branch conditions are being checked for the instance.</li>
         * <li>WaitResource: The instance is waiting for resources.</li>
         * <li>Failure: The instance fails to be run.</li>
         * <li>Success: The instance is successfully run.</li>
         * <li>Checking: Data quality is being checked for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetWorkflowInstanceResponseBodyWorkflowInstanceTags> tags;

        /**
         * <p>The type of the workflow instance. Valid values:</p>
         * <ul>
         * <li>Normal: Scheduled execution</li>
         * <li>Manual: Manually triggered node</li>
         * <li>SmokeTest: Testing</li>
         * <li>SupplementData: Data backfill</li>
         * <li>ManualWorkflow: Manually triggered workflow</li>
         * <li>TriggerWorkflow: Triggered Workflow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UnifiedWorkflowInstanceId")
        public Long unifiedWorkflowInstanceId;

        /**
         * <p>The ID of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The workflow parameters.</p>
         */
        @NameInMap("WorkflowParameters")
        public String workflowParameters;

        /**
         * <p>The task instance ID corresponding to the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowTaskInstanceId")
        public Long workflowTaskInstanceId;

        public static GetWorkflowInstanceResponseBodyWorkflowInstance build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyWorkflowInstance self = new GetWorkflowInstanceResponseBodyWorkflowInstance();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setTags(java.util.List<GetWorkflowInstanceResponseBodyWorkflowInstanceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetWorkflowInstanceResponseBodyWorkflowInstanceTags> getTags() {
            return this.tags;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setUnifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
            this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
            return this;
        }
        public Long getUnifiedWorkflowInstanceId() {
            return this.unifiedWorkflowInstanceId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setWorkflowParameters(String workflowParameters) {
            this.workflowParameters = workflowParameters;
            return this;
        }
        public String getWorkflowParameters() {
            return this.workflowParameters;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setWorkflowTaskInstanceId(Long workflowTaskInstanceId) {
            this.workflowTaskInstanceId = workflowTaskInstanceId;
            return this;
        }
        public Long getWorkflowTaskInstanceId() {
            return this.workflowTaskInstanceId;
        }

    }

}
