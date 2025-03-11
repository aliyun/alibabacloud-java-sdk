// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandPreCheckTaskResponseBody extends TeaModel {
    /**
     * <p>The result of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>scucess</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FE104D26-AC19-49B5-AC67-947F69*****</p>
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
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static SubmitHotExpandPreCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandPreCheckTaskResponseBody self = new SubmitHotExpandPreCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandPreCheckTaskResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SubmitHotExpandPreCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitHotExpandPreCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitHotExpandPreCheckTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
