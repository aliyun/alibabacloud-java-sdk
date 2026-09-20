// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryResponseBody extends TeaModel {
    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstanceHistoryResponseBodyInstances> instances;

    /**
     * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The time when the instance started running, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The time when the instance started waiting for resources.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The time when the instance started waiting for scheduling.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The business date on which the scheduled node was run. This value is typically one day before the run time of the node.</p>
         * <p>The value is a 13-digit number, such as <code>1590336000000</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590336000000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The time when the instance was created.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The scheduled run time of the node, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1590422400000</p>
         */
        @NameInMap("CycTime")
        public Long cycTime;

        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>33845</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The Data Quality Check (DQC) type. Valid values:</p>
         * <ul>
         * <li>0: associated with DQC.</li>
         * <li>1: not associated with DQC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DagType")
        public String dagType;

        /**
         * <p><strong>[Deprecated]</strong> The error message returned when the instance failed to run. This field is deprecated. You can call the GetInstanceLog operation to obtain the error information of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the scheduled node finished running, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The history archive ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceHistoryId")
        public Long instanceHistoryId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The time when the scheduled node was last modified.</p>
         * <p>The value is a 13-digit number, such as <code>1590416703313</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590416703313</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>33115</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>kzh</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: The node is not run.</li>
         * <li>WAIT_TIME: The node is waiting for the scheduled time (DueTime or CycTime) to arrive.</li>
         * <li>WAIT_RESOURCE: The node is waiting for resources.</li>
         * <li>RUNNING: The node is running.</li>
         * <li>CHECKING: The node is sent to Data Quality for data verification.</li>
         * <li>CHECKING_CONDITION: The node is undergoing branch condition verification.</li>
         * <li>FAILURE: The node failed to run.</li>
         * <li>SUCCESS: The node ran successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_RUN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The scheduling type of the node instance. Valid values:</p>
         * <ul>
         * <li>NORMAL(0): A normal scheduling node. The node is scheduled on a daily basis.</li>
         * <li>MANUAL(1): A manual node. The node is not scheduled on a daily basis.</li>
         * <li>PAUSE(2): A frozen node. The node is scheduled on a daily basis, but is set to failed when scheduling starts.</li>
         * <li>SKIP(3): A dry-run node. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
         * <li>SKIP_UNCHOOSE(4): A node that is not selected in a temporary workflow. This type of node exists only in temporary workflows and is set to successful when scheduling starts.</li>
         * <li>SKIP_CYCLE(5): A weekly or monthly node that has not reached its run cycle. The node is scheduled on a daily basis, but is set to successful when scheduling starts.</li>
         * <li>CONDITION_UNCHOOSE(6): A downstream node that is not selected by an upstream branch (IF) node. The node is directly set to dry-run.</li>
         * <li>REALTIME_DEPRECATED(7): An expired periodic instance generated in real time. This type of node is directly set to successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL(0)</p>
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
