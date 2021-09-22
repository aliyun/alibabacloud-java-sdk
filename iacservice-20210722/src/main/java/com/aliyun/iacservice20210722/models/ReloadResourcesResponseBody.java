// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ReloadResourcesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskId")
    public String taskId;

    public static ReloadResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReloadResourcesResponseBody self = new ReloadResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ReloadResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReloadResourcesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
