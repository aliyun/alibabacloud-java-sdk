// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatRequest extends TeaModel {
    /**
     * <p>The minimum execution duration of the task. This parameter is used to filter tasks whose execution duration is longer than the minimum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The start time of the O\&amp;M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-16T02:46:21Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID. Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs. This parameter is empty by default, which indicates that the tasks of all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-8vb38f0e7933xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the pending event. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <p>Separate multiple states with commas (,). This parameter is empty by default, which indicates that tasks in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID. Separate multiple task IDs with commas (,). You can specify up to 30 task IDs. This parameter is empty by default, which indicates that all tasks are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>t-0mq1yyhm3ffl2bxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. This parameter is left empty by default, which indicates that all types of tasks are queried. Valid values:</p>
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
     * <p>DeleteIns</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The maximum execution duration of the task. This parameter is used to filter tasks whose execution duration is shorter than or equal to the maximum execution duration. Unit: seconds. The default value is 0, which indicates that no limit is imposed for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>The end time of the O\&amp;M task to perform. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. You can query data within the last 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-16T02:15:52Z</p>
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

    public DescribeHistoryTasksStatRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
