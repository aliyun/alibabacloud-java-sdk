// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class PauseC2paBucketSignTaskResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A03DCE-4091-1A91-9810-692C3D783877</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The pause processing status. PAUSING is returned if submitted files exist. Otherwise, PAUSED is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PAUSING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The bucket batch signing task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>047b8305-9572-4eed-b7fb-8588b989b6e5</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static PauseC2paBucketSignTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseC2paBucketSignTaskResponseBody self = new PauseC2paBucketSignTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseC2paBucketSignTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PauseC2paBucketSignTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PauseC2paBucketSignTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PauseC2paBucketSignTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PauseC2paBucketSignTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PauseC2paBucketSignTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PauseC2paBucketSignTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
