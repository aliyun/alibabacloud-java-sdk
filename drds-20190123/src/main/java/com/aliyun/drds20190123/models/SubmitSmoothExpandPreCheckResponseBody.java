// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckResponseBody extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitSmoothExpandPreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmoothExpandPreCheckResponseBody self = new SubmitSmoothExpandPreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSmoothExpandPreCheckResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SubmitSmoothExpandPreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmoothExpandPreCheckResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public SubmitSmoothExpandPreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
