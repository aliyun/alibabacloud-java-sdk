// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribePreloadDetailByIdRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DescribePreloadDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePreloadDetailByIdRequest self = new DescribePreloadDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribePreloadDetailByIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
