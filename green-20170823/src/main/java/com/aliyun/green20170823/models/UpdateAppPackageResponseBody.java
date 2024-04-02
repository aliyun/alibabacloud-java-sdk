// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAppPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static UpdateAppPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPackageResponseBody self = new UpdateAppPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppPackageResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
