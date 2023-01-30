// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterEventsRequest extends TeaModel {
    @NameInMap("page_number")
    public Long pageNumber;

    @NameInMap("page_size")
    public Long pageSize;

    @NameInMap("task_id")
    public String taskId;

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

    public DescribeClusterEventsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
