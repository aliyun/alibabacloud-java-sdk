// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the ID of the node.</p>
     */
    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The error message that is returned for the instance.</p>
     * <br>
     * <p>This parameter is deprecated. You can call the [GetInstanceLog](~~173983~~) operation to query the error information related to the node.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The name of the node.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
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
         * <p>The type of the workflow. Valid values:</p>
         * <br>
         * <p>*   DAILY: The workflow is used to run auto triggered nodes.</p>
         * <p>*   MANUAL: The workflow is used to run manually triggered nodes.</p>
         * <p>*   SMOKE_TEST: The workflow is used to perform smoke testing.</p>
         * <p>*   SUPPLY_DATA: The workflow is used to backfill data.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The time when the instance started to run.</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the node stopped running.</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
         * <br>
         * <p>You cannot specify the sorting method for the instances to be returned by this operation. By default, the instances are sorted in descending order of the time when the instances were created.</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The ID of the workflow to which the node belongs.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The number of times the node can be rerun. The value of this parameter can be empty or an integer that is greater than or equal to 0.</p>
         * <br>
         * <p>*   If the value of this parameter is empty, the number of times that the node can be rerun is not specified.</p>
         * <p>*   If the value of this parameter is 0, the node cannot be rerun.</p>
         * <p>*   If the value of this parameter is a positive integer such as n, the node can be rerun n times. For example, if the value of this parameter is 1, the node can be rerun once. If the value of this parameter is 2, the node can be rerun twice.</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The interval at which the node is rerun after the node fails to run. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the ID of the node.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The time when the instance started to wait for resources.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The data timestamp of the instance. In most cases, the value is one day before the time when the instance was run.</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The operation that you want to perform.</p>
         */
        @NameInMap("DqcDescription")
        public String dqcDescription;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   NOT_RUN: The node is not run.</p>
         * <p>*   WAIT_TIME: The node is waiting for the scheduling time to arrive.</p>
         * <p>*   WAIT_RESOURCE: The node is waiting for resources.</p>
         * <p>*   RUNNING: The node is running.</p>
         * <p>*   CHECKING: Data quality is being checked for the node.</p>
         * <p>*   CHECKING_CONDITION: Branch conditions are being checked for the node.</p>
         * <p>*   FAILURE: The node fails to run.</p>
         * <p>*   SUCCESS: The node is successfully run.</p>
         */
        @NameInMap("DqcType")
        public Integer dqcType;

        /**
         * <p>The name of the account that is used to run the instance. For example, if an account named Test was used to run the instance to backfill data, the value of this parameter is Test.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the Alibaba Cloud account used by the workspace administrator. You can log on to the Alibaba Cloud Management Console and view the ID on the Security Settings page of the Account Center console.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The number of the page to return. Minimum value:1. Maximum value: 100.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the workflow. You can call the [ListBusiness](~~173945~~) operation to query the name of the workflow.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The table and partition filter expression in Data Quality that are associated with the node.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The total number of instances.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the node. You can call the [ListNodes](~~173979~~) operation to query the type of the node.</p>
         */
        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.</p>
         * <br>
         * <p>*   MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.</p>
         * <br>
         * <p>*   PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</p>
         * <br>
         * <p>*   SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to succeeded when the scheduling system starts to run the node.</p>
         * <br>
         * <p>*   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to succeeded when the scheduling system starts to run the node.</p>
         * <br>
         * <p>*   SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to succeeded when the scheduling system starts to run the node.</p>
         * <br>
         * <p>*   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</p>
         * <br>
         * <p>    REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to succeeded.</p>
         */
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   NOT_RUN: The node is not run.</p>
         * <p>*   WAIT_TIME: The node is waiting for the scheduling time to arrive.</p>
         * <p>*   WAIT_RESOURCE: The node is waiting for resources.</p>
         * <p>*   RUNNING: The node is running.</p>
         * <p>*   CHECKING: Data quality is being checked for the node.</p>
         * <p>*   CHECKING_CONDITION: Branch conditions are being checked for the node.</p>
         * <p>*   FAILURE: The node fails to run.</p>
         * <p>*   SUCCESS: The node is successfully run.</p>
         */
        @NameInMap("Repeatability")
        public Boolean repeatability;

        /**
         * <p>The data timestamp of the instances that you want to query. Specify the timestamp in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the workspace. You can call the [ListProjects](~~178393~~) operation to query the ID of the workspace.</p>
         */
        @NameInMap("TaskRerunTime")
        public Integer taskRerunTime;

        /**
         * <p>The information about the instances.</p>
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
         * <p>The name of the node. You can call the [ListNodes](~~173979~~) operation to query the name of the node.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The time when the node was scheduled to run.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8.</p>
         * <br>
         * <p>A greater value indicates a higher priority. Default value: 1.</p>
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
