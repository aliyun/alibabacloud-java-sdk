// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
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
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
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
     * <p>The task node.</p>
     */
    @NameInMap("Task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The ID of the task flow to which the node belongs.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

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
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The output variables for the node. This parameter is available only for some types of nodes.</p>
         */
        @NameInMap("NodeOutput")
        public String nodeOutput;

        /**
         * <p>The type of the node. For more information about the valid values for this parameter, see [NodeType parameter](https://help.aliyun.com/document_detail/424705.html).</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The time variables configured for the node.</p>
         */
        @NameInMap("TimeVariables")
        public String timeVariables;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetTaskResponseBodyTask setGraphParam(String graphParam) {
            this.graphParam = graphParam;
            return this;
        }
        public String getGraphParam() {
            return this.graphParam;
        }

        public GetTaskResponseBodyTask setNodeConfig(String nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }
        public String getNodeConfig() {
            return this.nodeConfig;
        }

        public GetTaskResponseBodyTask setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public GetTaskResponseBodyTask setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTaskResponseBodyTask setNodeOutput(String nodeOutput) {
            this.nodeOutput = nodeOutput;
            return this;
        }
        public String getNodeOutput() {
            return this.nodeOutput;
        }

        public GetTaskResponseBodyTask setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetTaskResponseBodyTask setTimeVariables(String timeVariables) {
            this.timeVariables = timeVariables;
            return this;
        }
        public String getTimeVariables() {
            return this.timeVariables;
        }

    }

}
