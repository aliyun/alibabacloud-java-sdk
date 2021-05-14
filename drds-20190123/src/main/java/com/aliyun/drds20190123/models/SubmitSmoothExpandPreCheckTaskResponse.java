// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static SubmitSmoothExpandPreCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckTaskResponse self = new SubmitSmoothExpandPreCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmoothExpandPreCheckTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitSmoothExpandPreCheckTaskResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SubmitSmoothExpandPreCheckTaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
