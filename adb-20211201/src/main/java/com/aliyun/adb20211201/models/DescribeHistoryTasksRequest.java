// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksRequest extends TeaModel {
    /**
     * <p>Minimum task execution time. Used to filter tasks with execution time greater than this value, in seconds. Default 0, meaning no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>Start time of task start time, indicating querying tasks whose start time is after this time. Expressed according to ISO8601 standard, and must use UTC +0 time, format: yyyy-MM-ddTHH:mm:ssZ. Earliest supports 30 days ago, automatically converts to 30 days ago if more than 30 days from current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The cluster ID. Separate multiple cluster IDs with commas (,). Maximum 30 cluster IDs. If not filled, defaults to querying historical tasks of all clusters in that region.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. The value is fixed to Instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid range: positive integers. Default value: 1</p>
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
     * <p>The region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li><strong>Scheduled</strong></li>
     * <li><strong>Running</strong></li>
     * <li><strong>Succeed</strong></li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * <li><strong>Cancelling</strong></li>
     * <li><strong>Canceled</strong></li>
     * <li><strong>Waiting</strong></li>
     * </ul>
     * <p>If querying multiple statuses, separate them with English commas. Default is empty, meaning select all.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The job IDs. Separate multiple task IDs with commas (,). Maximum 30 task IDs. If not filled, defaults to querying historical tasks of all clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hloy3faf****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Task type, used to query specific type task situations. If multiple, separate with English commas (,), maximum 30 supported. Default is empty, meaning no restriction.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest_dispatch_cases</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>Maximum task execution time. Used to filter tasks with execution time not less than this value, in seconds. Default 0, meaning no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>End time of task start time, indicating querying tasks whose start time is before this time. Expressed according to ISO8601 standard, and must use UTC +0 time, format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-02T11:31:03Z</p>
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

    public DescribeHistoryTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
