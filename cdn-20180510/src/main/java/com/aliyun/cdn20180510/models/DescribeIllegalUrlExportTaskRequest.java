// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeIllegalUrlExportTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeIllegalUrlExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIllegalUrlExportTaskRequest self = new DescribeIllegalUrlExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIllegalUrlExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeIllegalUrlExportTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
