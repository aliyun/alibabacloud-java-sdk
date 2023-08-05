// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeStaticFileRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeStaticFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStaticFileRequest self = new DescribeStaticFileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStaticFileRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
