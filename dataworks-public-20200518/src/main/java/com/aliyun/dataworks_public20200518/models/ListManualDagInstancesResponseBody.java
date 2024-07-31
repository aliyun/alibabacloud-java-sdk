// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListManualDagInstancesResponseBody extends TeaModel {
    /**
     * <p>The instances in the manually triggered workflow.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListManualDagInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>SDFSDFSDF-SDFSDF-SDFDSF-SDFSDF</p>
     */
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
         * <p>The name of the account that is used to run the instance. For example, if you use an account named Test to run the instance, the value of this parameter is Test.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
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
         * <p>The ID of the DAG for the instance in the manually triggered workflow.</p>
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
         * <p>The instance ID.</p>
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
         * <p>xxx=yyy</p>
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
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <ul>
         * <li>NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.</li>
         * <li>MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.</li>
         * <li>PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</li>
         * <li>SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to successful when the scheduling system starts to run the node.</li>
         * <li>CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</li>
         * <li>REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
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
