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
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks that meet these conditions without taking pagination into account.</p>
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
         * <br>
         * <p>       "steps": [</p>
         * <p>        {</p>
         * <p>          "step_name": "exec_task", // The name of the step, which matches the value of CurrentStepName.</p>
         * <p>          "action_info": {    // The actions supported for this step.</p>
         * <p>            "Waiting": [      // The status, which matches the value of Status.</p>
         * <p>              "modifySwitchTime" // The action. Multiple actions are supported.</p>
         * <p>            ]</p>
         * <p>          }</p>
         * <p>        },</p>
         * <p>        {</p>
         * <p>          "step_name": "init_task", // The name of the step.</p>
         * <p>          "action_info": {    // The actions supported for this step.</p>
         * <p>            "Running": [      // The status.</p>
         * <p>              "cancel",       // The action.</p>
         * <p>              "pause"</p>
         * <p>            ]</p>
         * <p>          }</p>
         * <p>        }</p>
         * <p>      ]</p>
         * <p>    }</p>
         * <br>
         * <p>The system may support the following actions:</p>
         * <br>
         * <p>*   retry: makes another attempt.</p>
         * <p>*   cancel: makes a cancellation.</p>
         * <p>*   modifySwitchTime: changes the switching or restoration time.</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The request source. Valid values: System and User.</p>
         */
        @NameInMap("CallerSource")
        public String callerSource;

        /**
         * <p>The ID of the user who made the request. If CallerSource is set to User, CallerUid indicates the unique ID (UID) of the user.</p>
         */
        @NameInMap("CallerUid")
        public String callerUid;

        /**
         * <p>The name of the current step. If this parameter is left empty, the task is not started.</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The database type. The value is fixed to mongodb.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The end time of the performed O\&M task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The instance ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type of the instance. The value is fixed to Instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The product. The value is fixed to dds.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The current progress of the task. The valid values range from 0 to 100.</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The reason why the current task was initiated.</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The estimated remaining execution time. Unit: seconds. The value 0 indicates that the task is completed.</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The start time of the performed O\&M task. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <br>
         * <p>*   Scheduled: The task is waiting to be executed.</p>
         * <p>*   Running: The task is running.</p>
         * <p>*   Succeed: The task is successful.</p>
         * <p>*   Failed: The task failed.</p>
         * <p>*   Cancelling: The task is being terminated.</p>
         * <p>*   Canceled: The task has been terminated.</p>
         * <p>*   Waiting: The task is waiting for scheduled time.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The details of the task. The task details vary based on the value of the taskType parameter.</p>
         */
        @NameInMap("TaskDetail")
        public String taskDetail;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type.</p>
         * <br>
         * <p>*   CreateIns: Create an instance.</p>
         * <p>*   DeleteIns: Delete an instance.</p>
         * <p>*   ChangeVariable: Modify parameter settings for an instance.</p>
         * <p>*   ModifyInsConfig: Change the configurations of an instance.</p>
         * <p>*   RestartIns: Restart an instance.</p>
         * <p>*   HaSwitch: Perform a primary/secondary switchover on an instance.</p>
         * <p>*   CloneIns: Clone an instance.</p>
         * <p>*   KernelVersionUpgrade: Update the minor version of an instance.</p>
         * <p>*   ProxyVersionUpgrade: Upgrade the agent version of an instance.</p>
         * <p>*   ModifyAccount: Change the account of an instance.</p>
         * <p>*   ModifyInsSpec: Change the specifications of an instance or perform a data migration on the instance.</p>
         * <p>*   CreateReadIns: Create a read-only instance.</p>
         * <p>*   StartIns: Start an instance.</p>
         * <p>*   StopIns: Stop an instance.</p>
         * <p>*   ModifyNetwork: Modify the network type for an instance.</p>
         * <p>*   LockIns: Lock an instance.</p>
         * <p>*   UnlockIns: Unlock an instance.</p>
         * <p>*   DiskOnlineExpansion: Scale out the disks of an instance online.</p>
         * <p>*   StorageOnlineExpansion: Expend the storage capacity of an instance online.</p>
         * <p>*   AddInsNode: Add a node to an instance.</p>
         * <p>*   DeleteInsNode: Delete a node from an instance.</p>
         * <p>*   ManualBackupIns: Manually back up an instance.</p>
         * <p>*   ModifyInsStorageType: Modify the storage type for an instance.</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The ID of the user to which the resource belongs.</p>
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

        public DescribeHistoryTasksResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
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
