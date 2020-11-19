// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckResponse extends TeaModel {
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

    public static SubmitSmoothExpandPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckResponse self = new SubmitSmoothExpandPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmoothExpandPreCheckResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitSmoothExpandPreCheckResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SubmitSmoothExpandPreCheckResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
