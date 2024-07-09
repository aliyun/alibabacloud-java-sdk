// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshTasksRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one accelerated domain name in each call. By default, this operation queries the status of tasks for all accelerated domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-12-22T08:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The path of the object. The path is used as a condition for exact matching.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/1.txt">http://example.com/1.txt</a></p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong>: refreshes one or more files.</li>
     * <li><strong>directory</strong>: refreshes files in specific directories.</li>
     * <li><strong>regex</strong>: refreshes content based on a regular expression.</li>
     * <li><strong>preload</strong>: prefetches one or more files.</li>
     * </ul>
     * <blockquote>
     * <p>If you set the <strong>DomainName</strong> or <strong>Status</strong> parameter, you must also set the <strong>ObjectType</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Maximum value: <strong>100</strong>. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyuji4b6r4**</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-21T08:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><strong>Complete</strong>: The task is complete.</li>
     * <li><strong>Refreshing</strong>: The task is in progress.</li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1234321</p>
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
