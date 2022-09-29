// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class UpdateResourceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("timeout")
    public Integer timeout;

    public static UpdateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceResponseBody self = new UpdateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResourceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateResourceResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
