// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstancesResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListInstancesResponseData data;

    public static ListInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponse self = new ListInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstancesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstancesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponse setData(ListInstancesResponseData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseData getData() {
        return this.data;
    }

    public static class ListInstancesResponseDataInstances extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("DagId")
        @Validation(required = true)
        public Long dagId;

        @NameInMap("DagType")
        @Validation(required = true)
        public String dagType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("CycTime")
        @Validation(required = true)
        public Long cycTime;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("BeginWaitTimeTime")
        @Validation(required = true)
        public Long beginWaitTimeTime;

        @NameInMap("BeginWaitResTime")
        @Validation(required = true)
        public Long beginWaitResTime;

        @NameInMap("BeginRunningTime")
        @Validation(required = true)
        public Long beginRunningTime;

        @NameInMap("ParamValues")
        @Validation(required = true)
        public String paramValues;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("Repeatability")
        @Validation(required = true)
        public Boolean repeatability;

        @NameInMap("RepeatInterval")
        @Validation(required = true)
        public Long repeatInterval;

        @NameInMap("Connection")
        @Validation(required = true)
        public String connection;

        @NameInMap("DqcType")
        @Validation(required = true)
        public Integer dqcType;

        @NameInMap("DqcDescription")
        @Validation(required = true)
        public String dqcDescription;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("RelatedFlowId")
        @Validation(required = true)
        public Long relatedFlowId;

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        @NameInMap("TaskRerunTime")
        @Validation(required = true)
        public Integer taskRerunTime;

        public static ListInstancesResponseDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseDataInstances self = new ListInstancesResponseDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseDataInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListInstancesResponseDataInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseDataInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListInstancesResponseDataInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public ListInstancesResponseDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseDataInstances setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListInstancesResponseDataInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public ListInstancesResponseDataInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseDataInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListInstancesResponseDataInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListInstancesResponseDataInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public ListInstancesResponseDataInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public ListInstancesResponseDataInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public ListInstancesResponseDataInstances setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListInstancesResponseDataInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListInstancesResponseDataInstances setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListInstancesResponseDataInstances setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListInstancesResponseDataInstances setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListInstancesResponseDataInstances setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListInstancesResponseDataInstances setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListInstancesResponseDataInstances setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListInstancesResponseDataInstances setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListInstancesResponseDataInstances setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListInstancesResponseDataInstances setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListInstancesResponseDataInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListInstancesResponseDataInstances setTaskRerunTime(Integer taskRerunTime) {
            this.taskRerunTime = taskRerunTime;
            return this;
        }
        public Integer getTaskRerunTime() {
            return this.taskRerunTime;
        }

    }

    public static class ListInstancesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Instances")
        @Validation(required = true)
        public java.util.List<ListInstancesResponseDataInstances> instances;

        public static ListInstancesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseData self = new ListInstancesResponseData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListInstancesResponseData setInstances(java.util.List<ListInstancesResponseDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstancesResponseDataInstances> getInstances() {
            return this.instances;
        }

    }

}
