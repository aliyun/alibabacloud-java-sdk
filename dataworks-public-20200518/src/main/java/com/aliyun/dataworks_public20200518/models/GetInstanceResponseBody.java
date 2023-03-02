// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The details about the instance.</p>
     */
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned because the instance fails to be scheduled.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The time when the instance started to run.</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the instance started to wait for resources.</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the instance started to wait to be run.</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The data timestamp. In most cases, the value is one day before the date when the instance is run.</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The connection string.</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The time when the instance was generated.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The owner of the instance.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The scheduled time of the instance.</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The type of the workflow. Valid values:</p>
         * <br>
         * <p>*   DAILY: The workflow is used to run auto triggered nodes.</p>
         * <p>*   MANUAL: The workflow is used to run manually triggered nodes.</p>
         * <p>*   SMOKE_TEST: The workflow is used to perform smoke testing.</p>
         * <p>*   SUPPLY_DATA: The workflow is used to backfill data.</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the instance.</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:</p>
         * <br>
         * <p>*   0: The instance is associated with a monitoring rule in Data Quality.</p>
         * <p>*   1: The instance is not associated with a monitoring rule in Data Quality.</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The time when the running of the instance was complete.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The time when the instance was last modified.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the node that generates the instance.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node that generates the instance.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The values of the parameters related to the node.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8. A great value indicates a high priority. Default value: 1.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workflow to which the node that generates the instance belongs.</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The interval at which the node that generates the instance is rerun after the node fails to run. Unit: milliseconds.</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Indicates whether the node that generates the instance can be rerun.</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The status of the node that generates the instance. Valid values:</p>
         * <br>
         * <p>*   NOT_RUN: The node is not run.</p>
         * <p>*   WAIT_TIME: The node is waiting for its scheduled time to arrive.</p>
         * <p>*   WAIT_RESOURCE: The node is waiting for resources.</p>
         * <p>*   RUNNING: The node is running.</p>
         * <p>*   CHECKING: Data quality is being checked for the node.</p>
         * <p>*   CHECKING_CONDITION: Branch conditions are being checked for the node.</p>
         * <p>*   FAILURE: The node fails to run.</p>
         * <p>*   SUCCESS: The node is successfully run.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of times the node that generates the instance can be rerun. This parameter can be left empty, or the value of this parameter can be an integer that is greater than or equal to 0.</p>
         * <br>
         * <p>*   If this parameter is left empty, the number of rerun times is not specified for the node.</p>
         * <p>*   If the value of this parameter is 0, the node cannot be rerun.</p>
         * <p>*   If the value of this parameter is n (an integer that is greater than 0), the node can be rerun n times. For example, if the value of this parameter is 1, the node can be rerun once. If the value of this parameter is 2, the node can be rerun two times, and so on.</p>
         */
        @NameInMap("TaskRerunTime")
        public Integer taskRerunTime;

        /**
         * <p>The scheduling type of the node that generates the instance. Valid values:</p>
         * <br>
         * <p>*   NORMAL(0): The node is an auto triggered node. It is run on a regular basis.</p>
         * <p>*   MANUAL(1): The node is a manually triggered node. It is not run on a regular basis.</p>
         * <p>*   PAUSE(2): The node is a frozen node. The scheduling system still runs the node on a regular basis but sets it to FAILURE when the scheduling system starts to run the node.</p>
         * <p>*   SKIP(3): The node is a dry-run node. The scheduling system still runs the node on a regular basis but sets it to SUCCESS when the scheduling system starts to run the node.</p>
         * <p>*   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the node to SUCCESS when the scheduling system starts to run the node.</p>
         * <p>*   SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for its scheduled time. The scheduling system still runs the node on a regular basis but sets it to SUCCESS when the scheduling system starts to run the node.</p>
         * <p>*   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</p>
         * <p>*   REALTIME_DEPRECATED(7): The node has instances generated in real time but deprecated. The scheduling system directly sets the node to SUCCESS.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetInstanceResponseBodyData setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public GetInstanceResponseBodyData setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public GetInstanceResponseBodyData setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public GetInstanceResponseBodyData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetInstanceResponseBodyData setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetInstanceResponseBodyData setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public GetInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetInstanceResponseBodyData setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public GetInstanceResponseBodyData setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetInstanceResponseBodyData setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public GetInstanceResponseBodyData setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public GetInstanceResponseBodyData setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public GetInstanceResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetInstanceResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetInstanceResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetInstanceResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetInstanceResponseBodyData setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetInstanceResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetInstanceResponseBodyData setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public GetInstanceResponseBodyData setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public GetInstanceResponseBodyData setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyData setTaskRerunTime(Integer taskRerunTime) {
            this.taskRerunTime = taskRerunTime;
            return this;
        }
        public Integer getTaskRerunTime() {
            return this.taskRerunTime;
        }

        public GetInstanceResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
