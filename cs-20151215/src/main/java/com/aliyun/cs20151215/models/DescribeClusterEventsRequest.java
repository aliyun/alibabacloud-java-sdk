// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterEventsRequest extends TeaModel {
    // 分页页数。
    @NameInMap("page_number")
    public Long pageNumber;

    // 每页大小。
    @NameInMap("page_size")
    public Long pageSize;

    // 查询的任务ID。
    @NameInMap("task_id")
    public Long taskId;

    public static DescribeClusterEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterEventsRequest self = new DescribeClusterEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterEventsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
