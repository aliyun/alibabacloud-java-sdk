// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListInstanceHistoryResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryResponseBody self = new ListInstanceHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryResponseBody setInstances(java.util.List<ListInstanceHistoryResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstanceHistoryResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstanceHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceHistoryResponseBodyInstances extends TeaModel {
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CycTime")
        public Long cycTime;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("DagType")
        public String dagType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("InstanceHistoryId")
        public Long instanceHistoryId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskType")
        public String taskType;

        public static ListInstanceHistoryResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceHistoryResponseBodyInstances self = new ListInstanceHistoryResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceHistoryResponseBodyInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public ListInstanceHistoryResponseBodyInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public ListInstanceHistoryResponseBodyInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public ListInstanceHistoryResponseBodyInstances setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListInstanceHistoryResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstanceHistoryResponseBodyInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public ListInstanceHistoryResponseBodyInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListInstanceHistoryResponseBodyInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public ListInstanceHistoryResponseBodyInstances setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListInstanceHistoryResponseBodyInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListInstanceHistoryResponseBodyInstances setInstanceHistoryId(Long instanceHistoryId) {
            this.instanceHistoryId = instanceHistoryId;
            return this;
        }
        public Long getInstanceHistoryId() {
            return this.instanceHistoryId;
        }

        public ListInstanceHistoryResponseBodyInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceHistoryResponseBodyInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListInstanceHistoryResponseBodyInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListInstanceHistoryResponseBodyInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListInstanceHistoryResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceHistoryResponseBodyInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
