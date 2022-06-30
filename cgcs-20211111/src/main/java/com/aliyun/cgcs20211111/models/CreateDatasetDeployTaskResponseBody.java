// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateDatasetDeployTaskResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 应用版本
    @NameInMap("TaskId")
    public String taskId;

    public static CreateDatasetDeployTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetDeployTaskResponseBody self = new CreateDatasetDeployTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetDeployTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasetDeployTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
