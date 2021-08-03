// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("CreateTime")
    public String createTime;

    public static DescribeScanTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponseBody self = new DescribeScanTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScanTaskProgressResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeScanTaskProgressResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
