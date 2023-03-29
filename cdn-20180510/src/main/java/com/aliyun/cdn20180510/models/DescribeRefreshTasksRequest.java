// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one accelerated domain name in each call. By default, this operation queries the status of tasks for all accelerated domain names.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The path of the object. The path is used as a condition for exact matching.</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **file**: refreshes one or more files.</p>
     * <p>*   **directory**: refreshes files in the specified directories.</p>
     * <p>*   **regex**: refreshes content based on a regular expression.</p>
     * <p>*   **preload**: prefetches one or more files.</p>
     * <br>
     * <p>> If you set the **DomainName** or **Status** parameter, you must also set the **ObjectType** parameter.</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid values: **1** to **100000**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **20**. Maximum value: **100**. Valid values: **1** to **100**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the task. Valid values:</p>
     * <br>
     * <p>*   **Complete**: The task has completed.</p>
     * <p>*   **Refreshing**: The task is in progress.</p>
     * <p>*   **Failed**: The task failed.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task that you want to query.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeRefreshTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshTasksRequest self = new DescribeRefreshTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshTasksRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRefreshTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRefreshTasksRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public DescribeRefreshTasksRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DescribeRefreshTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRefreshTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRefreshTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRefreshTasksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRefreshTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeRefreshTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRefreshTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRefreshTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
