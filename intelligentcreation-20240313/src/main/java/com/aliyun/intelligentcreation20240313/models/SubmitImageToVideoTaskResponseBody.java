// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitImageToVideoTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>job added successfully</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>53AED51A-74CE-57CE-B1BF-2703F314EEC8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>868125994191405056</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static SubmitImageToVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageToVideoTaskResponseBody self = new SubmitImageToVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageToVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImageToVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitImageToVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitImageToVideoTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
