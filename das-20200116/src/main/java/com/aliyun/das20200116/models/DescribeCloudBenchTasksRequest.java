// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskType")
    public String taskType;

    public static DescribeCloudBenchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudBenchTasksRequest self = new DescribeCloudBenchTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudBenchTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCloudBenchTasksRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeCloudBenchTasksRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudBenchTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCloudBenchTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCloudBenchTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
