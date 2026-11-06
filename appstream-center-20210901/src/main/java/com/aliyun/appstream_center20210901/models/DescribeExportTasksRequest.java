// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeExportTasksRequest extends TeaModel {
    /**
     * <p>The page number for paging. Pages start from 1. If this parameter is not specified or is set to a value less than 1, the first page is returned. The query results are sorted in descending order of task creation time, with the most recently created tasks listed first. When polling a single task by TaskId, explicitly set this parameter to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tasks to return per page. Default value: 200. If this parameter is not specified, the default value is used. If a value less than 1 is specified, 10 is used. When polling a single task by TaskId, set this parameter to 1 to avoid returning redundant tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters tasks by export task ID. The value is the TaskId returned by CreateExportTask, which is a 32-character UUID string without hyphens. This parameter requires exact match and does not support fuzzy queries. If this parameter is not specified, all tasks that meet other conditions under the current account are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8119078c29e948dba2e0a9917995332a</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Filters tasks by export task type. The value is case-sensitive and must be one of the following valid values:</p>
     * <ul>
     * <li>WUYING_SERVER_LIST: Wuying host list.</li>
     * <li>USER_USAGE_REPORT: User usage report.</li>
     * <li>BROWSER_BOOKMARK_LIST: Cloud browser bookmark list.</li>
     * <li>BROWSER_RESTRICTED_URL_LIST: Cloud browser URL whitelist.</li>
     * </ul>
     * <p>If this parameter is not specified, tasks are not filtered by type, and all tasks that meet other conditions under the current account are returned. If an unrecognized value is specified, the server does not return a parameter error but cancels type filtering. Therefore, you must specify one of the preceding exact enum values. When querying a single task by TaskId, omit this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>WUYING_SERVER_LIST</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeExportTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportTasksRequest self = new DescribeExportTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExportTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExportTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExportTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeExportTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
