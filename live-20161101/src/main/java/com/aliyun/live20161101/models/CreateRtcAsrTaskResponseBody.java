// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcAsrTaskResponseBody extends TeaModel {
    /**
     * <p>The result of the request. If success is returned, the request is successful. If an error message is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7FF5417D-06E9-5A2C-9A70-581F6149E6C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned HTTP status code. HTTP status code 2000 indicates that the request is successful. If another HTTP status code is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RetCode")
    public Long retCode;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-a6ac15e0-9118-4b4c-9e64-306163a0****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateRtcAsrTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRtcAsrTaskResponseBody self = new CreateRtcAsrTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRtcAsrTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRtcAsrTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRtcAsrTaskResponseBody setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

    public CreateRtcAsrTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
