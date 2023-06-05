// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryResponseBody extends TeaModel {
    /**
     * <p>The status of the node that generates the instance. Valid values:</p>
     * <br>
     * <p>*   NOT_RUN: The node is not run.</p>
     * <p>*   WAIT_TIME: The node is waiting for the scheduling time to arrive.</p>
     * <p>*   WAIT_RESOURCE: The node is waiting for resources.</p>
     * <p>*   RUNNING: The node is running.</p>
     * <p>*   CHECKING: Data quality is being checked for the node.</p>
     * <p>*   CHECKING_CONDITION: Branch conditions are being checked for the node.</p>
     * <p>*   FAILURE: The node fails to be run.</p>
     * <p>*   SUCCESS: The node is successfully run.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstanceHistoryResponseBodyInstances> instances;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The instance list.</p>
     */
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
        /**
         * <p>The time when the running of the node was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The data timestamp of the instance. In most cases, the value is one day before the time when the instance was run.</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The ID of the node that generates the instance.</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The ID of the workflow.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the instance started to be run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL(0): The node is an auto triggered node. The scheduling system regularly runs the node.</p>
         * <p>*   MANUAL(1): The node is a manually triggered node. The scheduling system does not regularly run the node.</p>
         * <p>*   PAUSE(2): The node is a frozen node. The scheduling system regularly runs the node but sets the status of the node to failed when the scheduling system starts to run the node.</p>
         * <p>*   SKIP(3): The node is a dry-run node. The scheduling system regularly runs the node but sets the status of the node to succeeded when the scheduling system starts to run the node.</p>
         * <p>*   SKIP_UNCHOOSE(4): The node is an unselected node in a temporary workflow. This type of node exists only in temporary workflows. The scheduling system sets the status of the node to succeeded when the scheduling system starts to run the node.</p>
         * <p>*   SKIP_CYCLE(5): The node is a node that is scheduled by week or month and is waiting for the scheduling time to arrive. The scheduling system regularly runs the node but sets the status of the node to succeeded when the scheduling system starts to run the node.</p>
         * <p>*   CONDITION_UNCHOOSE(6): The node is not selected by its ancestor branch node and is run as a dry-run node.</p>
         * <p>*   REALTIME_DEPRECATED(7): The node has instances that are generated in real time but deprecated. The scheduling system sets the status of the node to succeeded.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The time when the node was last modified.</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p>The time when the instance was generated.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The error message that is returned for the instance. This parameter is deprecated. You can call the GetInstanceLog operation to query the error information related to the node.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("InstanceHistoryId")
        public Long instanceHistoryId;

        /**
         * <p>The time when the instance started to wait for resources.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The historical record number of the instance.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The time when the instance started to wait to be scheduled.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The time when the node started to be run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the instance is associated with a monitoring rule in Data Quality (DQC). Valid values:</p>
         * <br>
         * <p>*   0: The instance is associated with a monitoring rule in Data Quality.</p>
         * <p>*   1: The instance is not associated with a monitoring rule in Data Quality.</p>
         */
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
