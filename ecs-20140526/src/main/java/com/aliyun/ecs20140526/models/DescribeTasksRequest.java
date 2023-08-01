// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTasksRequest extends TeaModel {
    /**
     * <p>The end point of the time period for which to query created tasks. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Page start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the task. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of resource N that is associated with the task. Valid values of N: 1 to 100.</p>
     * <br>
     * <p>*   If TaskAction is set to ImportImage or ExportImage, set the resource ID to an image ID.</p>
     * <p>*   If TaskAction is set to RedeployInstance, set the resource ID to an Elastic Compute Service (ECS) instance ID.</p>
     * <p>*   If TaskAction is set to ModifyDiskSpec, set the resource ID to a disk ID.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start point of the time period for which to query created tasks. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the operation that generates the task. Valid values:</p>
     * <br>
     * <p>*   ImportImage</p>
     * <p>*   ExportImage</p>
     * <p>*   RedeployInstance</p>
     * <p>*   ModifyDiskSpec</p>
     */
    @NameInMap("TaskAction")
    public String taskAction;

    /**
     * <p>The ID of the task. You can specify up to 100 task IDs at a time. Separate the task IDs with commas (,).</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    /**
     * <p>The state of the task. Valid values:</p>
     * <br>
     * <p>*   Finished</p>
     * <p>*   Processing</p>
     * <p>*   Failed</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     * <br>
     * <p>>  The system only retrieves tasks in the Finished, Processing, and Failed states and ignores other values.</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static DescribeTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksRequest self = new DescribeTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTasksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTasksRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeTasksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeTasksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTasksRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public DescribeTasksRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

    public DescribeTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
