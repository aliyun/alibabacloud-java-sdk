// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class DeleteResourceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("timeout")
    public Integer timeout;

    public static DeleteResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceResponseBody self = new DeleteResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteResourceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DeleteResourceResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
