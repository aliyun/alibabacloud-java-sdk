// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksResponseBody extends TeaModel {
    /**
     * <p>The task objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C4A2494-XXXX-XXXX-93CF-548DB3375193</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks that meet these conditions without taking pagination into account.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHistoryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksResponseBody self = new DescribeHistoryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksResponseBody setItems(java.util.List<DescribeHistoryTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHistoryTasksResponseBodyItems extends TeaModel {
        /**
         * <p>A set of allowed actions that can be taken on the task. The system matches the current step name and status of the task to the available actions specified by ActionInfo. If no matching action is found, the current status of the task does not support any action. Example:</p>
         * <pre><code>   &quot;steps&quot;: [
         *     {
         *       &quot;step_name&quot;: &quot;exec_task&quot;, // The name of the step, which matches the value of CurrentStepName.
         *       &quot;action_info&quot;: {    // The actions supported for this step.
         *         &quot;Waiting&quot;: [      // The status, which matches the value of Status.
         *           &quot;modifySwitchTime&quot; // The action. Multiple actions are supported.
         *         ]
         *       }
         *     },
         *     {
         *       &quot;step_name&quot;: &quot;init_task&quot;, // The name of the step.
         *       &quot;action_info&quot;: {    // The actions supported for this step.
         *         &quot;Running&quot;: [      // The status.
         *           &quot;cancel&quot;,       // The action.
         *           &quot;pause&quot;
         *         ]
         *       }
         *     }
         *   ]
         * }
         * </code></pre>
         * <p>The system may support the following actions:</p>
         * <ul>
         * <li>retry: makes another attempt.</li>
         * <li>cancel: makes a cancellation.</li>
         * <li>modifySwitchTime: changes the switching or restoration time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><code>{\\&quot;steps\\&quot;:[{\\&quot;action_info\\&quot;:{\\&quot;Waiting\\&quot;:[\\&quot;modifySwitchTime\\&quot;]},\\&quot;step_name\\&quot;:\\&quot;exec_task\\&quot;}]}</code></p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The request source. Valid values: System and User.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("CallerSource")
        public String callerSource;

        /**
         * <p>The ID of the user who made the request. If CallerSource is set to User, CallerUid indicates the unique ID (UID) of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("CallerUid")
        public String callerUid;

        /**
         * <p>The name of the current step. If this parameter is left empty, the task is not started.</p>
         * 
         * <strong>example:</strong>
         * <p>exec_task</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The database type. The value is fixed to mongodb.</p>
         * 
         * <strong>example:</strong>
         * <p>mongodb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The end time of the performed O\&amp;M task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-16T02:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>dds-t4n18194768fxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dds</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type of the instance. The value is fixed to Instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The product. The value is fixed to dds.</p>
         * 
         * <strong>example:</strong>
         * <p>dds</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The current progress of the task. The valid values range from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The reason why the current task was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The estimated remaining execution time. Unit: seconds. The value 0 indicates that the task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The start time of the performed O\&amp;M task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-11T02:33Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Scheduled: The task is waiting to be executed.</li>
         * <li>Running: The task is running.</li>
         * <li>Succeed: The task is successful.</li>
         * <li>Failed: The task failed.</li>
         * <li>Cancelling: The task is being terminated.</li>
         * <li>Canceled: The task has been terminated.</li>
         * <li>Waiting: The task is waiting for scheduled time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The details of the task. The task details vary based on the value of the taskType parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;callerUid\&quot;:\&quot;test\&quot;}</p>
         */
        @NameInMap("TaskDetail")
        public String taskDetail;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0mq1yyhm3ffl2bxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type.</p>
         * <ul>
         * <li>CreateIns: Create an instance.</li>
         * <li>DeleteIns: Delete an instance.</li>
         * <li>ChangeVariable: Modify parameter settings for an instance.</li>
         * <li>ModifyInsConfig: Change the configurations of an instance.</li>
         * <li>RestartIns: Restart an instance.</li>
         * <li>HaSwitch: Perform a primary/secondary switchover on an instance.</li>
         * <li>CloneIns: Clone an instance.</li>
         * <li>KernelVersionUpgrade: Update the minor version of an instance.</li>
         * <li>ProxyVersionUpgrade: Upgrade the agent version of an instance.</li>
         * <li>ModifyAccount: Change the account of an instance.</li>
         * <li>ModifyInsSpec: Change the specifications of an instance or perform a data migration on the instance.</li>
         * <li>CreateReadIns: Create a read-only instance.</li>
         * <li>StartIns: Start an instance.</li>
         * <li>StopIns: Stop an instance.</li>
         * <li>ModifyNetwork: Modify the network type for an instance.</li>
         * <li>LockIns: Lock an instance.</li>
         * <li>UnlockIns: Unlock an instance.</li>
         * <li>DiskOnlineExpansion: Scale out the disks of an instance online.</li>
         * <li>StorageOnlineExpansion: Expend the storage capacity of an instance online.</li>
         * <li>AddInsNode: Add a node to an instance.</li>
         * <li>DeleteInsNode: Delete a node from an instance.</li>
         * <li>ManualBackupIns: Manually back up an instance.</li>
         * <li>ModifyInsStorageType: Modify the storage type for an instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateIns</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The ID of the user to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeHistoryTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksResponseBodyItems self = new DescribeHistoryTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksResponseBodyItems setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public DescribeHistoryTasksResponseBodyItems setCallerSource(String callerSource) {
            this.callerSource = callerSource;
            return this;
        }
        public String getCallerSource() {
            return this.callerSource;
        }

        public DescribeHistoryTasksResponseBodyItems setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

        public DescribeHistoryTasksResponseBodyItems setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeHistoryTasksResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeHistoryTasksResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeHistoryTasksResponseBodyItems setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeHistoryTasksResponseBodyItems setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeHistoryTasksResponseBodyItems setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public DescribeHistoryTasksResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHistoryTasksResponseBodyItems setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeHistoryTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeHistoryTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeHistoryTasksResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
