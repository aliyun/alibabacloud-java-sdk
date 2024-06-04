// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeChildrenResponseBody extends TeaModel {
    /**
     * <p>The information of the descendant nodes.</p>
     */
    @NameInMap("Data")
    public GetNodeChildrenResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNodeChildrenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeChildrenResponseBody self = new GetNodeChildrenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeChildrenResponseBody setData(GetNodeChildrenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeChildrenResponseBodyData getData() {
        return this.data;
    }

    public GetNodeChildrenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeChildrenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeChildrenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeChildrenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeChildrenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeChildrenResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The cron expression. Cron expressions are used to run auto triggered nodes.</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The priority of the node. Valid values: 1 to 8. A large value indicates a high priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the node.</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Indicates whether the node can be rerun if the node fails to run. Valid values:</p>
         * <br>
         * <p>*   true: indicates that the node can be rerun.</p>
         * <p>*   false: indicates that the node cannot be rerun.</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL: indicates that the node is an auto triggered node.</p>
         * <p>*   MANUAL: indicates that node is a manually triggered node.</p>
         * <p>*   PAUSE: indicates that the node is a paused node. Paused nodes are started as scheduled but the system sets the status of the nodes to failed when it starts to run them.</p>
         * <p>*   SKIP: indicates that the node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("StepType")
        public String stepType;

        public static GetNodeChildrenResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetNodeChildrenResponseBodyDataNodes self = new GetNodeChildrenResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetNodeChildrenResponseBodyDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeChildrenResponseBodyDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeChildrenResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeChildrenResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeChildrenResponseBodyDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeChildrenResponseBodyDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeChildrenResponseBodyDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeChildrenResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeChildrenResponseBodyDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public GetNodeChildrenResponseBodyDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetNodeChildrenResponseBodyDataNodes setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class GetNodeChildrenResponseBodyData extends TeaModel {
        /**
         * <p>The descendant nodes returned.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetNodeChildrenResponseBodyDataNodes> nodes;

        public static GetNodeChildrenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeChildrenResponseBodyData self = new GetNodeChildrenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeChildrenResponseBodyData setNodes(java.util.List<GetNodeChildrenResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetNodeChildrenResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
