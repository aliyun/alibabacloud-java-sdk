// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the instance fails to be scheduled.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The time when the instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the instance started to wait for resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the instance started to wait to be scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The data timestamp of the instance. In most cases, the value is one day before the time when the instance was run.</p>
         * 
         * <strong>example:</strong>
         * <p>1590336000000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The time when the instance was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The scheduling time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1590422400000</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>338450167</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The type of the workflow. Valid values:</p>
         * <ul>
         * <li>DAILY: The workflow is used to run auto triggered nodes.</li>
         * <li>MANUAL: The workflow is used to run manually triggered nodes.</li>
         * <li>SMOKE_TEST: The workflow is used to perform smoke testing.</li>
         * <li>SUPPLY_DATA: The workflow is used to backfill data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;ztjy_dim&quot;,&quot;tableName&quot;:&quot;dim_user_agent_manage_area_a&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyy-mm-dd-1]&quot;}]</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>Indicates whether the instance is associated with a monitoring rule in Data Quality. Valid values:</p>
         * <ul>
         * <li>0: The instance is associated with a monitoring rule in Data Quality.</li>
         * <li>1: The instance is not associated with a monitoring rule in Data Quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The time when the running of the instance was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11713307578</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33115</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>kzh</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The parameters related to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>bizdate=$bizdate tbods=$tbods tbdw=$tbdw tbpmic=$tbpmic tbpidx=$tbpidx tbptcif=$tbptcif</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("PeriodNumber")
        public Integer periodNumber;

        /**
         * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8. A greater value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workflow to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The interval at which the node is rerun after the node fails to run. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Indicates whether the node that generates the instance can be rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The status of the node that generates the instance. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: The node is not run.</li>
         * <li>WAIT_TIME: The node is waiting for its scheduling time to arrive.</li>
         * <li>WAIT_RESOURCE: The node is waiting for resources.</li>
         * <li>RUNNING: The node is running.</li>
         * <li>CHECKING: Data quality is being checked for the node.</li>
         * <li>CHECKING_CONDITION: Branch conditions are being checked for the node.</li>
         * <li>FAILURE: The node fails to run.</li>
         * <li>SUCCESS: The node is successfully run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_RUN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of times the node can be rerun. The value of this parameter can be empty or an integer that is greater than or equal to 0.</p>
         * <ul>
         * <li>If the value of this parameter is empty, the number of times that the node can be rerun is not specified.</li>
         * <li>If the value of this parameter is 0, the node cannot be rerun.</li>
         * <li>If the value of this parameter is a positive integer such as n, the node can still be rerun n times. For example, if the value of this parameter is 1, the node can still be rerun once. If the value of this parameter is 2, the node can still be rerun twice.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskRerunTime")
        public Integer taskRerunTime;

        /**
         * <p>The scheduling type of the node that generates the instance. Valid values:</p>
         * <ul>
         * <li>NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.</li>
         * <li>MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.</li>
         * <li>PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</li>
         * <li>SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>SKIP_CYCLE(5): The node is a node that is scheduled by the week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</li>
         * <li>REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL(0)</p>
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

        public GetInstanceResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceResponseBodyData setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetInstanceResponseBodyData setPeriodNumber(Integer periodNumber) {
            this.periodNumber = periodNumber;
            return this;
        }
        public Integer getPeriodNumber() {
            return this.periodNumber;
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
