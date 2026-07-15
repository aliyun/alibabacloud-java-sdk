// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksRequest extends TeaModel {
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
     * <p>2023-03-15T03:41:26Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The instance ID. Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs. This parameter is empty by default, which indicates that tasks of all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-8vb38f0e7933xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type of the instance. Set the value to Instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of the page to return. The value must be a positive integer. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 10 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the pending event. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>rg-aek2inrfrnw3xby</p>
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
     * <li><p>Scheduled: The task is waiting to be executed.</p>
     * </li>
     * <li><p>Running: The task is running.</p>
     * </li>
     * <li><p>Succeed: The task is successful.</p>
     * </li>
     * <li><p>Failed: The task failed.</p>
     * </li>
     * <li><p>Cancelling: The task is being terminated.</p>
     * </li>
     * <li><p>Canceled: The task has been terminated.</p>
     * </li>
     * <li><p>Waiting: The task is waiting for scheduled time.</p>
     * </li>
     * </ul>
     * <p>Separate multiple states with commas (,). This parameter is empty by default, which indicates that tasks in all states are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeed,Running,Waiting</p>
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
     * <li><p>CreateIns: Create an instance.</p>
     * </li>
     * <li><p>DeleteIns: Delete an instance.</p>
     * </li>
     * <li><p>ChangeVariable: Modify parameter settings for an instance.</p>
     * </li>
     * <li><p>ModifyInsConfig: Change the configurations of an instance.</p>
     * </li>
     * <li><p>RestartIns: Restart an instance.</p>
     * </li>
     * <li><p>HaSwitch: Perform a primary/secondary switchover on an instance.</p>
     * </li>
     * <li><p>CloneIns: Clone an instance.</p>
     * </li>
     * <li><p>KernelVersionUpgrade: Update the minor version of an instance.</p>
     * </li>
     * <li><p>ProxyVersionUpgrade: Upgrade the agent version of an instance.</p>
     * </li>
     * <li><p>ModifyAccount: Change the account of an instance.</p>
     * </li>
     * <li><p>ModifyInsSpec: Change the specifications of an instance or perform a data migration on the instance.</p>
     * </li>
     * <li><p>CreateReadIns: Create a read-only instance.</p>
     * </li>
     * <li><p>StartIns: Start an instance.</p>
     * </li>
     * <li><p>StopIns: Stop an instance.</p>
     * </li>
     * <li><p>ModifyNetwork: Modify the network type for an instance.</p>
     * </li>
     * <li><p>LockIns: Lock an instance.</p>
     * </li>
     * <li><p>UnlockIns: Unlock an instance.</p>
     * </li>
     * <li><p>DiskOnlineExpansion: Scale out the disks of an instance online.</p>
     * </li>
     * <li><p>StorageOnlineExpansion: Expend the storage capacity of an instance online.</p>
     * </li>
     * <li><p>AddInsNode: Add a node to an instance.</p>
     * </li>
     * <li><p>DeleteInsNode: Delete a node from an instance.</p>
     * </li>
     * <li><p>ManualBackupIns: Manually back up an instance.</p>
     * </li>
     * <li><p>ModifyInsStorageType: Modify the storage type for an instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DeleteInsNode</p>
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
     * <p>2023-03-16T07:21:31Z</p>
     */
    @NameInMap("ToStartTime")
    public String toStartTime;

    public static DescribeHistoryTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksRequest self = new DescribeHistoryTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksRequest setFromExecTime(Integer fromExecTime) {
        this.fromExecTime = fromExecTime;
        return this;
    }
    public Integer getFromExecTime() {
        return this.fromExecTime;
    }

    public DescribeHistoryTasksRequest setFromStartTime(String fromStartTime) {
        this.fromStartTime = fromStartTime;
        return this;
    }
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    public DescribeHistoryTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryTasksRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeHistoryTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHistoryTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHistoryTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHistoryTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHistoryTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHistoryTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeHistoryTasksRequest setToExecTime(Integer toExecTime) {
        this.toExecTime = toExecTime;
        return this;
    }
    public Integer getToExecTime() {
        return this.toExecTime;
    }

    public DescribeHistoryTasksRequest setToStartTime(String toStartTime) {
        this.toStartTime = toStartTime;
        return this;
    }
    public String getToStartTime() {
        return this.toStartTime;
    }

}
