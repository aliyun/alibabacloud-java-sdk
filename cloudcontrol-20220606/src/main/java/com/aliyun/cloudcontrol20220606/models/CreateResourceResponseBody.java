// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("timeout")
    public Integer timeout;

    public static CreateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponseBody self = new CreateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateResourceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateResourceResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
