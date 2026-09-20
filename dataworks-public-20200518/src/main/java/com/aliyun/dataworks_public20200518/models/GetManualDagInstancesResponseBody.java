// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of internal instances of the manual workflow.</p>
     */
    @NameInMap("Instances")
    public java.util.List<GetManualDagInstancesResponseBodyInstances> instances;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
     */
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
        /**
         * <p>The time when the instance node started to run.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the instance node started to wait for resources.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the instance node started to wait for scheduling.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The business date. This is typically the day before the node runs.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The time when the instance node was created.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The scheduled time of the instance node.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The DAG ID of the manual workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>350850491</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The type of the manual workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The time when the instance node finished running.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The internal instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11726873619</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The most recent modification time of the instance node.</p>
         * <p>The value is a 13-digit number, for example, <code>1605178414676</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The internal node ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>37851</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The parameter information of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The status of the instance node. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: The instance is not run.</li>
         * <li>WAIT_TIME: The instance is waiting for the scheduled dueTime or cycleTime.</li>
         * <li>WAIT_RESOURCE: The instance is waiting for resources.</li>
         * <li>RUNNING: The instance is running.</li>
         * <li>CHECKING: The instance is submitted to Data Quality for data verification.</li>
         * <li>CHECKING_CONDITION: The instance is performing branch condition verification.</li>
         * <li>FAILURE: The instance failed to run.</li>
         * <li>SUCCESS: The instance is run successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WAIT_TIME</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scheduling type of the instance node. Valid values:</p>
         * <ul>
         * <li>NORMAL(0): a normal scheduling node. The node is scheduled on a daily basis.</li>
         * <li>MANUAL(1): a manual node. The node is not scheduled on a daily basis.</li>
         * <li>PAUSE(2): a paused node. The node is scheduled on a daily basis, but is set to failed when scheduling starts.</li>
         * <li>SKIP(3): a dry-run node. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
         * <li>SKIP_UNCHOOSE(4): a node that is not selected in a temporary workflow. This type of node exists only in temporary workflows and is set to successful when scheduling starts.</li>
         * <li>SKIP_CYCLE(5): a weekly or monthly node that has not reached its run cycle. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
         * <li>CONDITION_UNCHOOSE(6): a downstream node that is not selected by an upstream branch (IF) node. The node is directly set to dry-run.</li>
         * <li>REALTIME_DEPRECATED(7): an expired periodic instance generated in real time. This type of node is directly set to successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL(0)</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static GetManualDagInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetManualDagInstancesResponseBodyInstances self = new GetManualDagInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetManualDagInstancesResponseBodyInstances setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public GetManualDagInstancesResponseBodyInstances setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public GetManualDagInstancesResponseBodyInstances setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public GetManualDagInstancesResponseBodyInstances setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public GetManualDagInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetManualDagInstancesResponseBodyInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetManualDagInstancesResponseBodyInstances setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public GetManualDagInstancesResponseBodyInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetManualDagInstancesResponseBodyInstances setDagType(String dagType) {
            this.dagType = dagType;
            return this;
        }
        public String getDagType() {
            return this.dagType;
        }

        public GetManualDagInstancesResponseBodyInstances setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetManualDagInstancesResponseBodyInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetManualDagInstancesResponseBodyInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetManualDagInstancesResponseBodyInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetManualDagInstancesResponseBodyInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetManualDagInstancesResponseBodyInstances setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetManualDagInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetManualDagInstancesResponseBodyInstances setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
