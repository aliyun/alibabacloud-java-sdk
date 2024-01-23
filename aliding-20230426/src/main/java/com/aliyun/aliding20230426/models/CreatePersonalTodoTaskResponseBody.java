// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreatePersonalTodoTaskResponseBody extends TeaModel {
    @NameInMap("createdTime")
    public Long createdTime;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static CreatePersonalTodoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTodoTaskResponseBody self = new CreatePersonalTodoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTodoTaskResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public CreatePersonalTodoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalTodoTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreatePersonalTodoTaskResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CreatePersonalTodoTaskResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
