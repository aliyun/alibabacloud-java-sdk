// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTasksInTaskFlowResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8B36B063-6B7D-5595-9FCF-3844B7B7ACD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>{\&quot;x\&quot;:435,\&quot;y\&quot;:192,\&quot;layoutType\&quot;:\&quot;Horizontal\&quot;}</p>
         */
        @NameInMap("GraphParam")
        public String graphParam;

        /**
         * <p>The advanced configuration for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;rerun&quot;:{    &quot;rerunEnable&quot;:true,      &quot;rerunCount&quot;:1,   &quot;rerunInterval&quot;:10 //  }}</p>
         */
        @NameInMap("NodeConfig")
        public String nodeConfig;

        /**
         * <p>The configuration for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;dbId&quot;:123***,  &quot;sql&quot;:&quot;&quot;,    &quot;dbType&quot;:&quot;polardb&quot; }</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>92***</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Cross-Database Spark SQL-1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The output variables for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{  &quot;outputs&quot;:[{ { &quot;row&quot;:0, &quot;column&quot;:-1,                  &quot;combiner&quot;:&quot;,&quot; }            &quot;extractMethod&quot;:&quot;{\&quot;row\&quot;:0,\&quot;column\&quot;:-1,\&quot;combiner\&quot;:\&quot;,\&quot;}&quot;,         &quot;variableName&quot;:&quot;var&quot;,    &quot;description&quot;:&quot;For demo&quot;} ] }</p>
         */
        @NameInMap("NodeOutput")
        public String nodeOutput;

        /**
         * <p>The type of the node. For more information about the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/424705.html">NodeType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SPARK_SQL</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The time variables configured for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;variables\&quot;:[{\&quot;name\&quot;:\&quot;test1\&quot;,\&quot;pattern\&quot;:\&quot;yyyy-MM-dd</p>
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
