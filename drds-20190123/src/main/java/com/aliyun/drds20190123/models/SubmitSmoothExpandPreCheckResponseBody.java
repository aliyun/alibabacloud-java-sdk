// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSmoothExpandPreCheckResponseBody extends TeaModel {
    /**
     * <p>The result of the precheck task.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FE104D26-AC19-49B5-AC67-947F69******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the precheck task.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

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

    public SubmitSmoothExpandPreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitSmoothExpandPreCheckResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
