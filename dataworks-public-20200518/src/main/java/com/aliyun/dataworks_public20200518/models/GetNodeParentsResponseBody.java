// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeParentsResponseBody extends TeaModel {
    /**
     * <p>The list of node information returned.</p>
     */
    @NameInMap("Data")
    public GetNodeParentsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1060010000000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>err</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>asfsdfas-adfasdf-asfas-dfasdf-asdf</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNodeParentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeParentsResponseBody self = new GetNodeParentsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeParentsResponseBody setData(GetNodeParentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeParentsResponseBodyData getData() {
        return this.data;
    }

    public GetNodeParentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeParentsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeParentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeParentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeParentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeParentsResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1244564565</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The CRON expression. This expression is used for timed scheduling to execute the node task.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 * * * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1244564565</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_Node</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The DataWorks UID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123124561341251321</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The priority. Valid values: 1 to 8. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ProgramType")
        public String programType;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12315412412</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Indicates whether the node can be rerun upon failure. Valid values:</p>
         * <ul>
         * <li>true: The node can be rerun.</li>
         * <li>false: The node cannot be rerun.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: normal scheduling node.</li>
         * <li>MANUAL: manual node that is not triggered by daily scheduling.</li>
         * <li>PAUSE: paused node that is triggered by daily scheduling but is set to failed when scheduling starts.</li>
         * <li>SKIP: dry-run node that is triggered by daily scheduling but is set to successful when scheduling starts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The scheduling dependency type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: same-cycle dependency.</li>
         * <li><strong>3</strong>: cross-cycle dependency.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StepType")
        public String stepType;

        public static GetNodeParentsResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetNodeParentsResponseBodyDataNodes self = new GetNodeParentsResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetNodeParentsResponseBodyDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeParentsResponseBodyDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeParentsResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeParentsResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeParentsResponseBodyDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeParentsResponseBodyDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeParentsResponseBodyDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeParentsResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeParentsResponseBodyDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public GetNodeParentsResponseBodyDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetNodeParentsResponseBodyDataNodes setStepType(String stepType) {
            this.stepType = stepType;
            return this;
        }
        public String getStepType() {
            return this.stepType;
        }

    }

    public static class GetNodeParentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetNodeParentsResponseBodyDataNodes> nodes;

        public static GetNodeParentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeParentsResponseBodyData self = new GetNodeParentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeParentsResponseBodyData setNodes(java.util.List<GetNodeParentsResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetNodeParentsResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
