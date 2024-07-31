// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetManualDagInstancesResponseBody extends TeaModel {
    /**
     * <p>The instances in the manually triggered workflow.</p>
     */
    @NameInMap("Instances")
    public java.util.List<GetManualDagInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
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
         * <p>The time when the instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the instance started to wait for resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the instance started to wait to be scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The data timestamp of the instance. In most cases, the value is one day before the time when the instance was run.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The time when the instance was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user who performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The time when the instance was scheduled to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The ID of the DAG for the manually triggered workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>350850491</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The type of the manually triggered workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The time when the instance finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the instance in the manually triggered workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>11726873619</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1605178414676</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the node in the manually triggered workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>37851</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The parameters related to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: The instance is not run.</li>
         * <li>WAIT_TIME: The instance is waiting for its scheduling time to arrive.</li>
         * <li>WAIT_RESOURCE: The instance is waiting for resources.</li>
         * <li>RUNNING: The instance is running.</li>
         * <li>CHECKING: Data quality is being checked for the instance.</li>
         * <li>CHECKING_CONDITION: Branch conditions are being checked for the instance.</li>
         * <li>FAILURE: The instance fails to be run.</li>
         * <li>SUCCESS: The instance is successfully run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WAIT_TIME</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scheduling type of the node that generates the instance. Valid values:</p>
         * <ul>
         * <li>NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.</li>
         * <li>MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.</li>
         * <li>PAUSE(2): The node is a paused node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</li>
         * <li>SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</li>
         * <li>REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to successful.</li>
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
