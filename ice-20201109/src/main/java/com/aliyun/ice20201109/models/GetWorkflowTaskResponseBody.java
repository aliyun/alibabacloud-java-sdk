// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetWorkflowTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>0C-7870-15FE-B96F-8880BB</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the workflow task.</p>
     */
    @NameInMap("WorkflowTask")
    public GetWorkflowTaskResponseBodyWorkflowTask workflowTask;

    public static GetWorkflowTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowTaskResponseBody self = new GetWorkflowTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowTaskResponseBody setWorkflowTask(GetWorkflowTaskResponseBodyWorkflowTask workflowTask) {
        this.workflowTask = workflowTask;
        return this;
    }
    public GetWorkflowTaskResponseBodyWorkflowTask getWorkflowTask() {
        return this.workflowTask;
    }

    public static class GetWorkflowTaskResponseBodyWorkflowTaskWorkflow extends TeaModel {
        /**
         * <p>The time when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-27T10:02:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the workflow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-29T02:06:19Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The workflow name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workflow state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active</li>
         * <li>Inactive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The workflow type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Customize: custom workflow.</li>
         * <li>System: system workflow.</li>
         * <li>Common: user-created workflow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>63dca94c609de02ac0d1</strong></strong></strong></p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static GetWorkflowTaskResponseBodyWorkflowTaskWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowTaskResponseBodyWorkflowTaskWorkflow self = new GetWorkflowTaskResponseBodyWorkflowTaskWorkflow();
            return TeaModel.build(map, self);
        }

        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetWorkflowTaskResponseBodyWorkflowTask extends TeaModel {
        /**
         * <p>The results for all nodes of the workflow task.</p>
         */
        @NameInMap("ActivityResults")
        public String activityResults;

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-04T02:05:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the task was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-04T02:06:19Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The task state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Init: The task is being initialized.</li>
         * <li>Failed: The task failed.</li>
         * <li>Canceled: The task is canceled.</li>
         * <li>Processing: The task is in progress.</li>
         * <li>Succeed: The task is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the workflow task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>4215e042b3966ca5441e</strong></strong></strong></p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The input of the workflow task.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Type&quot;: &quot;Media&quot;,
         *       &quot;Media&quot;: &quot;<strong><strong><strong>30706071edbfe290b488</strong></strong></strong>&quot;
         * }</p>
         */
        @NameInMap("TaskInput")
        public String taskInput;

        /**
         * <p>The user-defined field that was specified when the workflow task was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The workflow Information.</p>
         */
        @NameInMap("Workflow")
        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow workflow;

        public static GetWorkflowTaskResponseBodyWorkflowTask build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowTaskResponseBodyWorkflowTask self = new GetWorkflowTaskResponseBodyWorkflowTask();
            return TeaModel.build(map, self);
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setActivityResults(String activityResults) {
            this.activityResults = activityResults;
            return this;
        }
        public String getActivityResults() {
            return this.activityResults;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setTaskInput(String taskInput) {
            this.taskInput = taskInput;
            return this;
        }
        public String getTaskInput() {
            return this.taskInput;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetWorkflowTaskResponseBodyWorkflowTask setWorkflow(GetWorkflowTaskResponseBodyWorkflowTaskWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public GetWorkflowTaskResponseBodyWorkflowTaskWorkflow getWorkflow() {
            return this.workflow;
        }

    }

}
