// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckTaskResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitSmoothExpandPreCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckTaskResponseBody self = new SubmitSmoothExpandPreCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SubmitSmoothExpandPreCheckTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public SubmitSmoothExpandPreCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmoothExpandPreCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
