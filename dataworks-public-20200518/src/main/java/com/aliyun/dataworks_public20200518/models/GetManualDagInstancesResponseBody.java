// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<GetManualDagInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    public static GetManualDagInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManualDagInstancesResponseBody self = new GetManualDagInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManualDagInstancesResponseBody setInstances(java.util.List<GetManualDagInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetManualDagInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public GetManualDagInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetManualDagInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CycTime")
        public Long cycTime;

        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("DagType")
        public String dagType;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        public static GetManualDagInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetManualDagInstancesResponseBodyInstances self = new GetManualDagInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetManualDagInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetManualDagInstancesResponseBodyInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public GetManualDagInstancesResponseBodyInstances setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public GetManualDagInstancesResponseBodyInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public GetManualDagInstancesResponseBodyInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetManualDagInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetManualDagInstancesResponseBodyInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetManualDagInstancesResponseBodyInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetManualDagInstancesResponseBodyInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public GetManualDagInstancesResponseBodyInstances setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetManualDagInstancesResponseBodyInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetManualDagInstancesResponseBodyInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public GetManualDagInstancesResponseBodyInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetManualDagInstancesResponseBodyInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public GetManualDagInstancesResponseBodyInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetManualDagInstancesResponseBodyInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

    }

}
