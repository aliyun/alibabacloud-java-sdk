// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDingtalkPersonalTodoTaskResponseBody extends TeaModel {
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

    public static CreateDingtalkPersonalTodoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDingtalkPersonalTodoTaskResponseBody self = new CreateDingtalkPersonalTodoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDingtalkPersonalTodoTaskResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public CreateDingtalkPersonalTodoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDingtalkPersonalTodoTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateDingtalkPersonalTodoTaskResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CreateDingtalkPersonalTodoTaskResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
