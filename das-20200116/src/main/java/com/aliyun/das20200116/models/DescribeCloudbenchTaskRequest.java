// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskRequest extends TeaModel {
    /**
     * <p>The ID of the stress testing task. You can call the [DescribeCloudBenchTasks](~~230670~~) operation to query the ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeCloudbenchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskRequest self = new DescribeCloudbenchTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
