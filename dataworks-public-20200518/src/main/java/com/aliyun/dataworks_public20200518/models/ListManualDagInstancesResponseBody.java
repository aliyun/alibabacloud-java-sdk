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
     * <p>The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.</p>
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
         * <p>The time when the node started to run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the node started to wait for resources. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the node started to wait to be scheduled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The data timestamp of the instance. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. In most cases, the value indicates one day before the time when the node was run.</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The time when the node was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The name of the account used to run the instance. For example, if an account named Test was used to run the instance to backfill data, the value of this parameter is Test.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The time when the node was scheduled to run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The ID of the DAG for the manually triggered workflow.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The identifier of the manually triggered workflow.</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The time when the node stopped running. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the instance in the manually triggered workflow.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The time when the node was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the node in the manually triggered workflow.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The parameters related to the instance.</p>
         */
        @NameInMap("ParamValues")
        public String paramValues;

        /**
         * <p>The status of the node. Valid values:</p>
         * <br>
         * <p>*   NOT_RUN: The node is not run.</p>
         * <p>*   WAIT_TIME: The node is waiting for its scheduled time to arrive.</p>
         * <p>*   WAIT_RESOURCE: The node is waiting for resources.</p>
         * <p>*   RUNNING: The node is running.</p>
         * <p>*   CHECKING: Data quality is being checked for the node.</p>
         * <p>*   CHECKING_CONDITION: Branch conditions are being checked for the node.</p>
         * <p>*   FAILURE: The node fails to run.</p>
         * <p>*   SUCCESS: The node is run as expected.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL(0): The node is an auto triggered node. It is run on a regular basis.</p>
         * <p>*   MANUAL(1): The node is a manually triggered node. It is not run on a regular basis.</p>
         * <p>*   PAUSE(2): The node is a frozen node. The scheduling system still runs the node on a regular basis but sets it to Failed when the scheduling system starts to run the node.</p>
         * <p>*   SKIP(3): The node is a dry-run node. The scheduling system still runs the node on a regular basis but sets it to Succeeded when the scheduling system starts to run the node.</p>
         * <p>*   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the node to Succeeded when the scheduling system starts to run the node.</p>
         * <p>*   SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for its scheduled time. The scheduling system still runs the node on a regular basis but sets it to Succeeded when the scheduling system starts to run the node.</p>
         * <p>*   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</p>
         * <p>*   REALTIME_DEPRECATED(7): The node has instances generated in real time but deprecated. The scheduling system directly sets the node to Succeeded.</p>
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
