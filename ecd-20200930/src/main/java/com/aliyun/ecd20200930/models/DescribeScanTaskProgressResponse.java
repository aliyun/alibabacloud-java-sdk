// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("TaskStatus")
    @Validation(required = true)
    public String taskStatus;

    public static DescribeScanTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponse self = new DescribeScanTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanTaskProgressResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeScanTaskProgressResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
