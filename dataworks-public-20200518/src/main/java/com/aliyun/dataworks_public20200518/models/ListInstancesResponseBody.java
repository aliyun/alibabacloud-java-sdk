// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ProjectNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The project does not exist.</p>
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
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The time when the instance started running.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the instance started waiting for resources.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the instance started waiting for scheduling.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The data timestamp of the scheduled node. This is typically the day before the node runs.</p>
         * <p>The value is a 13-digit number, such as <code>1590336000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590336000000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The business process ID.</p>
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
         * <p>odps_source</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The time when the instance was created.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user who triggered the instance to run. For example, if user Test triggered a data backfill instance, the CreateUser is Test.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The scheduled runtime of the node.</p>
         * <p>The value is a 13-digit number, such as <code>1590422400000</code>.</p>
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
         * <p>33845</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The type of the workflow. Valid values:</p>
         * <ul>
         * <li>DAILY(0): daily scheduling workflow.</li>
         * <li>MANUAL(1): manual task workflow.</li>
         * <li>SMOKE_TEST(2): smoke testing workflow.</li>
         * <li>SUPPLY_DATA(3): data backfill workflow.</li>
         * <li>MANUAL_FLOW(4): manually triggered dataflow PAI workflow (such as running a workflow in the IDE).</li>
         * <li>BUSINESS_PROCESS_DAG(5): manual business process workflow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The DQC partitioning rule string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;ztjy_dim&quot;,&quot;tableName&quot;:&quot;dim_user_agent_manage_area_a&quot;,&quot;partition&quot;:&quot;ds\u003d$[yyyy-mm-dd-1]&quot;}]</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The DQC type. Valid values:</p>
         * <ul>
         * <li>0: associated with DQC.</li>
         * <li>1: not associated with DQC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p><strong>[Deprecated]</strong> The error message of the instance run. You can call <a href="https://help.aliyun.com/document_detail/173983.html">GetInstanceLog</a> to obtain the error information of the executed task.</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the scheduled node finished running.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
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
         * <p>1234</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The time when the scheduled node was last modified.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
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
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>kzh</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The parameter information.</p>
         * 
         * <strong>example:</strong>
         * <p>bizdate=$bizdate tbods=$tbods</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8.</p>
         * <p>A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the associated business process.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The interval at which the node is rescheduled after a failure. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>Indicates whether the instance task can be rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>NOT_RUN(1): The node is not run.</li>
         * <li>WAIT_TIME(2): The node is waiting for the scheduled time to arrive.</li>
         * <li>WAIT_RESOURCE(3): The node has been sent to the execution engine and is waiting for resources to be scheduled.</li>
         * <li>RUNNING(4): The node is running.</li>
         * <li>CHECKING(7): The node has finished running and has been sent to Data Quality for data verification.</li>
         * <li>CHECKING_CONDITION(8): The node has finished running and is undergoing branch condition verification.</li>
         * <li>WAIT_TRIGGER(9): The node is waiting to be triggered. A trigger-based node enters this state after the waiting time elapses.</li>
         * <li>FAILURE(5): The node failed to run.</li>
         * <li>SUCCESS(6): The node ran successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_RUN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of remaining reruns for the instance. The value can be empty or an integer greater than or equal to 0.</p>
         * <ul>
         * <li>Empty: The node corresponding to this instance does not have automatic rerun configured.</li>
         * <li>0: The instance cannot be rerun.</li>
         * <li>An integer greater than 0 (n): The instance can be rerun n times. For example, if the value is 1, the remaining rerun count is 1. If the value is 2, the remaining rerun count is 2, and so on. The initial value is the automatic rerun count defined for the corresponding node plus 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskRerunTime")
        public Integer taskRerunTime;

        /**
         * <p>The scheduling type of the task instance. Valid values:</p>
         * <ul>
         * <li>NORMAL(0): The node is a normal scheduled node that is triggered by daily scheduling.</li>
         * <li>MANUAL(1): The node is a manual node that is not triggered by daily scheduling.</li>
         * <li>PAUSE(2): The node is a frozen node that is triggered by daily scheduling but is set to failed when scheduling starts.</li>
         * <li>SKIP(3): The node is a dry-run node that is triggered by daily scheduling but is set to successful when scheduling starts.</li>
         * <li>SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. It exists only in temporary workflows and is set to successful when scheduling starts.</li>
         * <li>SKIP_CYCLE(5): The node is a weekly or monthly node whose scheduling cycle has not arrived. It is triggered by daily scheduling but is set to successful when scheduling starts.</li>
         * <li>CONDITION_UNCHOOSE(6): The upstream instance contains a branch (IF) node, but this downstream node is not selected by the branch node and is set to a dry-run node.</li>
         * <li>REALTIME_DEPRECATED(7): The node is an expired periodic instance generated in real time. This type of node is set to successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL(0)</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static ListInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataInstances self = new ListInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataInstances setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListInstancesResponseBodyDataInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public ListInstancesResponseBodyDataInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public ListInstancesResponseBodyDataInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public ListInstancesResponseBodyDataInstances setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListInstancesResponseBodyDataInstances setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListInstancesResponseBodyDataInstances setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListInstancesResponseBodyDataInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyDataInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListInstancesResponseBodyDataInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public ListInstancesResponseBodyDataInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListInstancesResponseBodyDataInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public ListInstancesResponseBodyDataInstances setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListInstancesResponseBodyDataInstances setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListInstancesResponseBodyDataInstances setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListInstancesResponseBodyDataInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListInstancesResponseBodyDataInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListInstancesResponseBodyDataInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListInstancesResponseBodyDataInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListInstancesResponseBodyDataInstances setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListInstancesResponseBodyDataInstances setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListInstancesResponseBodyDataInstances setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListInstancesResponseBodyDataInstances setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListInstancesResponseBodyDataInstances setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListInstancesResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyDataInstances setTaskRerunTime(Integer taskRerunTime) {
            this.taskRerunTime = taskRerunTime;
            return this;
        }
        public Integer getTaskRerunTime() {
            return this.taskRerunTime;
        }

        public ListInstancesResponseBodyDataInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setInstances(java.util.List<ListInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public ListInstancesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
