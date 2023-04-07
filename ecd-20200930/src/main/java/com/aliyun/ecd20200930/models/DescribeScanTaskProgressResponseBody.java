// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponseBody extends TeaModel {
    /**
     * <p>The time when the task was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the task. Valid values:</p>
     * <br>
     * <p>*   init: The task is being initialized.</p>
     * <p>*   Processing: The task is in progress.</p>
     * <p>*   Success: The task is completed.</p>
     * <p>*   Failed: The task failed.</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    public static DescribeScanTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponseBody self = new DescribeScanTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
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

}
