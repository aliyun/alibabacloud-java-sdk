// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeEcdReportTasksRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries returned per page. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>INIT: initializing</li>
     * <li>FAILED</li>
     * <li>RUNNING</li>
     * <li>EXPIRED</li>
     * <li>FINISHED</li>
     * </ul>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The sub-type of the report export task.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>DESKTOP: cloud computer</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESKTOP</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <p>The ID of the report export task.</p>
     * 
     * <strong>example:</strong>
     * <p>ret-sfkdsjfi*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the report.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>RESOURCE_REPORT</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RESOURCE_REPORT</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeEcdReportTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcdReportTasksRequest self = new DescribeEcdReportTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEcdReportTasksRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeEcdReportTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEcdReportTasksRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeEcdReportTasksRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public DescribeEcdReportTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeEcdReportTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
