// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAIWorkflowTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the workflow task.</p>
     */
    @NameInMap("WorkflowTask")
    public GetAIWorkflowTaskResponseBodyWorkflowTask workflowTask;

    public static GetAIWorkflowTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIWorkflowTaskResponseBody self = new GetAIWorkflowTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIWorkflowTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIWorkflowTaskResponseBody setWorkflowTask(GetAIWorkflowTaskResponseBodyWorkflowTask workflowTask) {
        this.workflowTask = workflowTask;
        return this;
    }
    public GetAIWorkflowTaskResponseBodyWorkflowTask getWorkflowTask() {
        return this.workflowTask;
    }

    public static class GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow extends TeaModel {
        /**
         * <p>The time when the template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-20T01:35:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The workflow\&quot;s topological structure.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;nodes&quot;:[...],
         * &quot;edges&quot;:[...]
         * }</p>
         */
        @NameInMap("Graph")
        public String graph;

        /**
         * <p>The time when the template was last modified. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-20T01:35:04Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The name of the workflow template.</p>
         * 
         * <strong>example:</strong>
         * <p>RealtimeTranslation</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Workflow template status. Valid values:</p>
         * <ul>
         * <li>Draft</li>
         * <li>Published</li>
         * <li>Editing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Draft</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scenario type of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Live</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>ec0a-e3b9-40b1-abf2-6549d00e</strong></strong></p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the workflow template.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>3f44-f1f6-477e-9364-c5e6c49e</strong></strong></p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow self = new GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow();
            return TeaModel.build(map, self);
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setGraph(String graph) {
            this.graph = graph;
            return this;
        }
        public String getGraph() {
            return this.graph;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class GetAIWorkflowTaskResponseBodyWorkflowTask extends TeaModel {
        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-28T02:17:26Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the task was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-19T02:28:22Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input parameters of the workflow task.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;source_language_id\&quot;:\&quot;en\&quot;,\&quot;live_id\&quot;:123,\&quot;live_url\&quot;:{\&quot;url\&quot;:\&quot;rtmp://test.com.cn/video/638d9088fe4f15ce\&quot;}}</p>
         */
        @NameInMap("Inputs")
        public String inputs;

        /**
         * <p>The results of the workflow nodes. The structure of this JSON varies based on the workflow\&quot;s configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{...}</p>
         */
        @NameInMap("NodeResults")
        public String nodeResults;

        /**
         * <p>The node output.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;result&quot;:&quot;test&quot;
         * }</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The task state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>running</li>
         * <li>stopped</li>
         * <li>failed</li>
         * <li>partial-succeeded</li>
         * <li>succeeded</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the workflow task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong><strong>-67fd-43aa-9cc1-3e7f</strong></strong></strong></strong></p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The version of the workflow template that was executed.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>ec0a-e3b9-40b1-abf2-6549d00e</strong></strong></p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The workflow template information.</p>
         */
        @NameInMap("Workflow")
        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow workflow;

        public static GetAIWorkflowTaskResponseBodyWorkflowTask build(java.util.Map<String, ?> map) throws Exception {
            GetAIWorkflowTaskResponseBodyWorkflowTask self = new GetAIWorkflowTaskResponseBodyWorkflowTask();
            return TeaModel.build(map, self);
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setNodeResults(String nodeResults) {
            this.nodeResults = nodeResults;
            return this;
        }
        public String getNodeResults() {
            return this.nodeResults;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAIWorkflowTaskResponseBodyWorkflowTask setWorkflow(GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public GetAIWorkflowTaskResponseBodyWorkflowTaskWorkflow getWorkflow() {
            return this.workflow;
        }

    }

}
