// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskRequest self = new DescribeTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
