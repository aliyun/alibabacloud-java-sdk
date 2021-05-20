// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<ListManualDagInstancesResponseInstances> instances;

    public static ListManualDagInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManualDagInstancesResponse self = new ListManualDagInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListManualDagInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListManualDagInstancesResponse setInstances(java.util.List<ListManualDagInstancesResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListManualDagInstancesResponseInstances> getInstances() {
        return this.instances;
    }

    public static class ListManualDagInstancesResponseInstances extends TeaModel {
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

        @NameInMap("BizDate")
        @Validation(required = true)
        public Long bizDate;

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

        @NameInMap("TaskType")
        @Validation(required = true)
        public String taskType;

        public static ListManualDagInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            ListManualDagInstancesResponseInstances self = new ListManualDagInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public ListManualDagInstancesResponseInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListManualDagInstancesResponseInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListManualDagInstancesResponseInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListManualDagInstancesResponseInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public ListManualDagInstancesResponseInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListManualDagInstancesResponseInstances setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListManualDagInstancesResponseInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public ListManualDagInstancesResponseInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListManualDagInstancesResponseInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListManualDagInstancesResponseInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListManualDagInstancesResponseInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public ListManualDagInstancesResponseInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public ListManualDagInstancesResponseInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public ListManualDagInstancesResponseInstances setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListManualDagInstancesResponseInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListManualDagInstancesResponseInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
