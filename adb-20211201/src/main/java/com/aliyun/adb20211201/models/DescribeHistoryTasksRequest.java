// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksRequest extends TeaModel {
    /**
     * <p>The minimum execution duration of the task. This parameter is used to filter tasks whose execution duration is greater than this value. Unit: seconds. Default value: 0, which indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromExecTime")
    public Integer fromExecTime;

    /**
     * <p>The start time of the time range to query task start times. Tasks that start after this time are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The earliest supported time is 30 days ago. If the specified time is more than 30 days before the current time, it is automatically changed to 30 days ago.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T11:31:03Z</p>
     */
    @NameInMap("FromStartTime")
    public String fromStartTime;

    /**
     * <p>The cluster ID. You can specify multiple cluster IDs separated by commas (,). You can specify up to 30 cluster IDs. If this parameter is left empty, historical tasks of all clusters in the region are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. Set the value to Instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number of the query result. Valid values: positive integers. Default value: 1.</p>
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
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p><strong>Scheduled</strong>: Pending execution.</p>
     * </li>
     * <li><p><strong>Running</strong>: Running.</p>
     * </li>
     * <li><p><strong>Succeed</strong>: Succeeded.</p>
     * </li>
     * <li><p><strong>Failed</strong>: Failed.</p>
     * </li>
     * <li><p><strong>Cancelling</strong>: Being canceled.</p>
     * </li>
     * <li><p><strong>Canceled</strong>: Canceled.</p>
     * </li>
     * <li><p><strong>Waiting</strong>: Waiting for the scheduled time.</p>
     * </li>
     * </ul>
     * <p>You can specify multiple values separated by commas (,). If this parameter is left empty, all statuses are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID. You can specify multiple task IDs separated by commas (,). You can specify up to 30 task IDs. If this parameter is left empty, historical tasks of all clusters are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>t-83br18hloy3faf****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task type. This parameter is used to query tasks of a specific type. You can specify multiple task types separated by commas (,). You can specify up to 30 task types. If this parameter is left empty, no limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest_dispatch_cases</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The maximum execution duration of the task. This parameter is used to filter tasks whose execution duration does not exceed this value. Unit: seconds. Default value: 0, which indicates no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ToExecTime")
    public Integer toExecTime;

    /**
     * <p>The end time of the time range to query task start times. Tasks that start before this time are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
