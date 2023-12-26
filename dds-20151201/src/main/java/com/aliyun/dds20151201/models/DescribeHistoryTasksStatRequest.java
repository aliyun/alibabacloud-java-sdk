// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatRequest extends TeaModel {
    /**
     * <p>The minimum execution duration of the task. This parameter is used to filter tasks whose execution duration is longer than the minimum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The start time of the O\&M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID. Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs. This parameter is empty by default, which indicates that the tasks of all instances are queried.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the pending event. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <br>
     * <p>Separate multiple states with commas (,). This parameter is empty by default, which indicates that tasks in all states are queried.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID. Separate multiple task IDs with commas (,). You can specify up to 30 task IDs. This parameter is empty by default, which indicates that all tasks are queried.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. This parameter is left empty by default, which indicates that all types of tasks are queried. Valid values:</p>
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
     * <p>The maximum execution duration of the task. This parameter is used to filter tasks whose execution duration is shorter than or equal to the maximum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>The end time of the O\&M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.</p>
     */
    @NameInMap("ToStartTime")
    public String toStartTime;

    public static DescribeHistoryTasksStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatRequest self = new DescribeHistoryTasksStatRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatRequest setFromExecTime(Integer fromExecTime) {
        this.fromExecTime = fromExecTime;
        return this;
    }
    public Integer getFromExecTime() {
        return this.fromExecTime;
    }

    public DescribeHistoryTasksStatRequest setFromStartTime(String fromStartTime) {
        this.fromStartTime = fromStartTime;
        return this;
    }
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    public DescribeHistoryTasksStatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryTasksStatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryTasksStatRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryTasksStatRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHistoryTasksStatRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHistoryTasksStatRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHistoryTasksStatRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeHistoryTasksStatRequest setToExecTime(Integer toExecTime) {
        this.toExecTime = toExecTime;
        return this;
    }
    public Integer getToExecTime() {
        return this.toExecTime;
    }

    public DescribeHistoryTasksStatRequest setToStartTime(String toStartTime) {
        this.toStartTime = toStartTime;
        return this;
    }
    public String getToStartTime() {
        return this.toStartTime;
    }

}
