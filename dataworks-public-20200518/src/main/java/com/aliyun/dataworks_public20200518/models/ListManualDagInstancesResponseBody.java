// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<ListManualDagInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    public static ListManualDagInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListManualDagInstancesResponseBody self = new ListManualDagInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListManualDagInstancesResponseBody setInstances(java.util.List<ListManualDagInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListManualDagInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListManualDagInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListManualDagInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("CycTime")
        public Long cycTime;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("DagType")
        public String dagType;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskType")
        public String taskType;

        public static ListManualDagInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListManualDagInstancesResponseBodyInstances self = new ListManualDagInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListManualDagInstancesResponseBodyInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public ListManualDagInstancesResponseBodyInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public ListManualDagInstancesResponseBodyInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public ListManualDagInstancesResponseBodyInstances setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListManualDagInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListManualDagInstancesResponseBodyInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListManualDagInstancesResponseBodyInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public ListManualDagInstancesResponseBodyInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListManualDagInstancesResponseBodyInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public ListManualDagInstancesResponseBodyInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListManualDagInstancesResponseBodyInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListManualDagInstancesResponseBodyInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListManualDagInstancesResponseBodyInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListManualDagInstancesResponseBodyInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListManualDagInstancesResponseBodyInstances setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListManualDagInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListManualDagInstancesResponseBodyInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
