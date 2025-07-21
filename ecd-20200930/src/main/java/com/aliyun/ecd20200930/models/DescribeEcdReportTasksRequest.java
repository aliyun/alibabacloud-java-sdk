// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeEcdReportTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>20。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <strong>example:</strong>
     * <p>DESKTOP</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
     * <strong>example:</strong>
     * <p>ret-sfkdsjfi*****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
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
