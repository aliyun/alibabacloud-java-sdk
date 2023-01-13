// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTasksInTaskFlowResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The tasks in the task flow.</p>
     */
    @NameInMap("Tasks")
    public ListTasksInTaskFlowResponseBodyTasks tasks;

    public static ListTasksInTaskFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksInTaskFlowResponseBody self = new ListTasksInTaskFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksInTaskFlowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTasksInTaskFlowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTasksInTaskFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksInTaskFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTasksInTaskFlowResponseBody setTasks(ListTasksInTaskFlowResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public ListTasksInTaskFlowResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public static class ListTasksInTaskFlowResponseBodyTasksTask extends TeaModel {
        /**
         * <p>The position of the node on the Directed Acyclic Graph (DAG).</p>
         */
        @NameInMap("GraphParam")
        public String graphParam;

        /**
         * <p>The advanced configuration for the node.</p>
         */
        @NameInMap("NodeConfig")
        public String nodeConfig;

        /**
         * <p>The configuration for the node.</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The output variables for the task.</p>
         */
        @NameInMap("NodeOutput")
        public String nodeOutput;

        /**
         * <p>The type of the node. For more information about the valid values for this parameter, see [NodeType parameter](~~424705~~).</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The time variables configured for the node.</p>
         */
        @NameInMap("TimeVariables")
        public String timeVariables;

        public static ListTasksInTaskFlowResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            ListTasksInTaskFlowResponseBodyTasksTask self = new ListTasksInTaskFlowResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setGraphParam(String graphParam) {
            this.graphParam = graphParam;
            return this;
        }
        public String getGraphParam() {
            return this.graphParam;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setNodeConfig(String nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public String getNodeConfig() {
            return this.nodeConfig;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setNodeOutput(String nodeOutput) {
            this.nodeOutput = nodeOutput;
            return this;
        }
        public String getNodeOutput() {
            return this.nodeOutput;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListTasksInTaskFlowResponseBodyTasksTask setTimeVariables(String timeVariables) {
            this.timeVariables = timeVariables;
            return this;
        }
        public String getTimeVariables() {
            return this.timeVariables;
        }

    }

    public static class ListTasksInTaskFlowResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<ListTasksInTaskFlowResponseBodyTasksTask> task;

        public static ListTasksInTaskFlowResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksInTaskFlowResponseBodyTasks self = new ListTasksInTaskFlowResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksInTaskFlowResponseBodyTasks setTask(java.util.List<ListTasksInTaskFlowResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<ListTasksInTaskFlowResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
