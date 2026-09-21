// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListAsyncTasksRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tasks to display per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource ID to which the task belongs, such as a site ID. You can obtain the site ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>4080****3752512</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>site</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The current status of the task. Valid values:</p>
     * <ul>
     * <li>in_progress: in progress.</li>
     * <li>success: completed.</li>
     * <li>fail: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The task type. For example, the task type for applying for a free certificate is free_cert.</p>
     * 
     * <strong>example:</strong>
     * <p>free_cert</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListAsyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksRequest self = new ListAsyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAsyncTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAsyncTasksRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public ListAsyncTasksRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListAsyncTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public ListAsyncTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
